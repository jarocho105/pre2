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


import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.seguridad.util.ColorGeneralConstantesFunciones;

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
public class ColorGeneralJInternalFrame extends ColorGeneralBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarColorGeneral;
	
	protected JMenuBar jmenuBarColorGeneral;
	
	protected JMenu jmenuColorGeneral;
	protected JMenu jmenuDatosColorGeneral;
	protected JMenu jmenuArchivoColorGeneral;
	protected JMenu jmenuAccionesColorGeneral;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosColorGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutColorGeneral;	
	protected GridBagConstraints gridBagConstraintsColorGeneral;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ColorGeneralDetalleFormJInternalFrame jInternalFrameDetalleFormColorGeneral;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoColorGeneral;	
	protected ImportacionJInternalFrame jInternalFrameImportacionColorGeneral;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ColorGeneralSessionBean colorgeneralSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<ColorGeneral> colorgenerals;		
	public List<ColorGeneral> colorgeneralsEliminados;	
	public List<ColorGeneral> colorgeneralsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByColorGeneral;		
	protected JButton jButtonAbrirOrderByColorGeneral;
	
	
	//protected JPanel jPanelOrderByColorGeneral;
	//public JScrollPane jScrollPanelOrderByColorGeneral;	
	//protected JButton jButtonCerrarOrderByColorGeneral;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ColorGeneralLogic colorgeneralLogic;
	
	
	
	public JScrollPane jScrollPanelDatosColorGeneral;
	public JScrollPane jScrollPanelDatosEdicionColorGeneral;
	public JScrollPane jScrollPanelDatosGeneralColorGeneral;
    
	
	
	//public JScrollPane jScrollPanelDatosColorGeneralOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoColorGeneral;
	//public JScrollPane jScrollPanelImportacionColorGeneral;
	
	
	
	protected JPanel jPanelAccionesColorGeneral;
	
    protected JPanel jPanelPaginacionColorGeneral;
    protected JPanel jPanelParametrosReportesColorGeneral;
	protected JPanel jPanelParametrosReportesAccionesColorGeneral;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ColorGeneral;
	protected JPanel jPanelParametrosAuxiliar2ColorGeneral;
	protected JPanel jPanelParametrosAuxiliar3ColorGeneral;
	protected JPanel jPanelParametrosAuxiliar4ColorGeneral;
	//protected JPanel jPanelParametrosAuxiliar5ColorGeneral;
	
	
	
	//protected JPanel jPanelReporteDinamicoColorGeneral;
	//protected JPanel jPanelImportacionColorGeneral;
	
	
	public JTable jTableDatosColorGeneral;
	
	
	
	//public JTable jTableDatosColorGeneralOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoColorGeneral;
	protected JButton jButtonDuplicarColorGeneral;
	protected JButton jButtonCopiarColorGeneral;
	protected JButton jButtonVerFormColorGeneral;
	protected JButton jButtonNuevoRelacionesColorGeneral;
	protected JButton jButtonModificarColorGeneral;
	
    protected JButton jButtonGuardarCambiosTablaColorGeneral;
	protected JButton jButtonCerrarColorGeneral;
	
	
	protected JButton jButtonRecargarInformacionColorGeneral;
	protected JButton jButtonProcesarInformacionColorGeneral;
	
	
	protected JButton jButtonAnterioresColorGeneral;
	protected JButton jButtonSiguientesColorGeneral;
	protected JButton jButtonNuevoGuardarCambiosColorGeneral;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoColorGeneral;
	//protected JButton jButtonCerrarReporteDinamicoColorGeneral;
	//protected JButton jButtonGenerarExcelReporteDinamicoColorGeneral;	
	
	
	
	//protected JButton jButtonAbrirImportacionColorGeneral;
	//protected JButton jButtonGenerarImportacionColorGeneral;
	//protected JButton jButtonCerrarImportacionColorGeneral;
	//protected JFileChooser jFileChooserImportacionColorGeneral;
	//protected File fileImportacionColorGeneral;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarColorGeneral;
	protected JButton jButtonDuplicarToolBarColorGeneral;
	protected JButton jButtonNuevoRelacionesToolBarColorGeneral;
	
	
	public JButton jButtonGuardarCambiosToolBarColorGeneral;
	protected JButton jButtonCopiarToolBarColorGeneral;
	protected JButton jButtonVerFormToolBarColorGeneral;
	public JButton jButtonGuardarCambiosTablaToolBarColorGeneral;
	protected JButton jButtonMostrarOcultarTablaToolBarColorGeneral;
	protected JButton jButtonCerrarToolBarColorGeneral;
	
	protected JButton jButtonRecargarInformacionToolBarColorGeneral;
	protected JButton jButtonProcesarInformacionToolBarColorGeneral;
	protected JButton jButtonAnterioresToolBarColorGeneral;
	protected JButton jButtonSiguientesToolBarColorGeneral;
	protected JButton jButtonNuevoGuardarCambiosToolBarColorGeneral;
	protected JButton jButtonAbrirOrderByToolBarColorGeneral;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoColorGeneral;
	protected JMenuItem jMenuItemDuplicarColorGeneral;
	protected JMenuItem jMenuItemNuevoRelacionesColorGeneral;
	
	
	protected JMenuItem jMenuItemGuardarCambiosColorGeneral;
	protected JMenuItem jMenuItemCopiarColorGeneral;
	protected JMenuItem jMenuItemVerFormColorGeneral;
	protected JMenuItem jMenuItemGuardarCambiosTablaColorGeneral;
	protected JMenuItem jMenuItemCerrarColorGeneral;
	protected JMenuItem jMenuItemDetalleCerrarColorGeneral;
	protected JMenuItem jMenuItemDetalleAbrirOrderByColorGeneral;
	protected JMenuItem jMenuItemDetalleMostarOcultarColorGeneral;
	
	protected JMenuItem jMenuItemRecargarInformacionColorGeneral;
	protected JMenuItem jMenuItemProcesarInformacionColorGeneral;
	protected JMenuItem jMenuItemAnterioresColorGeneral;
	protected JMenuItem jMenuItemSiguientesColorGeneral;
	protected JMenuItem jMenuItemNuevoGuardarCambiosColorGeneral;
	protected JMenuItem jMenuItemAbrirOrderByColorGeneral;
	protected JMenuItem jMenuItemMostrarOcultarColorGeneral;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesColorGeneral;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosColorGeneral;
	protected JCheckBox jCheckBoxSeleccionadosColorGeneral;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaColorGeneral;
	protected JCheckBox jCheckBoxConGraficoReporteColorGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesColorGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesColorGeneral;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoColorGeneral;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoColorGeneral;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesColorGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionColorGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesColorGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesColorGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarColorGeneral;
	protected JTextField jTextFieldValorCampoGeneralColorGeneral;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteColorGeneral;
	//public JList<Reporte> jListColumnasSelectReporteColorGeneral;
	//public JScrollPane jScrollColumnasSelectReporteColorGeneral;
	
	//public JLabel jLabelRelacionesSelectReporteColorGeneral;
	//public JList<Reporte> jListRelacionesSelectReporteColorGeneral;
	//public JScrollPane jScrollRelacionesSelectReporteColorGeneral;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoColorGeneral;
	//protected JCheckBox jCheckBoxConGraficoDinamicoColorGeneral;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoColorGeneral;
	//public JLabel jLabelTiposArchivoReporteDinamicoColorGeneral;
	
		
	//public JLabel jLabelArchivoImportacionColorGeneral;	
	//public JLabel jLabelPathArchivoImportacionColorGeneral;
	//protected JTextField jTextFieldPathArchivoImportacionColorGeneral;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoColorGeneral;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoColorGeneral;
	
	//public JLabel jLabelColumnaCategoriaValorColorGeneral;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorColorGeneral;
	
	//public JLabel jLabelColumnasValoresGraficoColorGeneral;
	//public JList<Reporte> jListColumnasValoresGraficoColorGeneral;
	//public JScrollPane jScrollColumnasValoresGraficoColorGeneral;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoColorGeneral;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoColorGeneral;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasColorGeneral;
	public JPanel jPanelBusquedaPorNombreColorGeneral;
	public JButton jButtonBusquedaPorNombreColorGeneral;
	
	public JPanel jPanelnombreBusquedaPorNombreColorGeneral;
	public JLabel jLabelnombreBusquedaPorNombreColorGeneral;
	public JTextField jTextFieldnombreBusquedaPorNombreColorGeneral;
	public JButton jButtonnombreBusquedaPorNombreColorGeneralBusqueda= new JButtonMe();

	
	
	
	
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
	public ColorGeneralJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ColorGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ColorGeneralJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ColorGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ColorGeneralJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ColorGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ColorGeneralJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ColorGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionColorGeneral)	{
		this.jButtonRecargarInformacionColorGeneral = jButtonRecargarInformacionColorGeneral;
	}
	
	public JButton getjButtonProcesarInformacionColorGeneral() {
		return this.jButtonProcesarInformacionColorGeneral;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionColorGeneral)	{
		this.jButtonProcesarInformacionColorGeneral = jButtonProcesarInformacionColorGeneral;
	}
	
	
	public JButton getjButtonRecargarInformacionColorGeneral() {
		return this.jButtonRecargarInformacionColorGeneral;
	}
	
	
	public List<ColorGeneral> getcolorgenerals() {
		return this.colorgenerals;
	}

	public void setcolorgenerals(List<ColorGeneral> colorgenerals) {
		this.colorgenerals = colorgenerals;
	}
	
	public List<ColorGeneral> getcolorgeneralsAux() {
		return this.colorgeneralsAux;
	}

	public void setcolorgeneralsAux(List<ColorGeneral> colorgeneralsAux) {
		this.colorgeneralsAux = colorgeneralsAux;
	}
	
	public List<ColorGeneral> getcolorgeneralsEliminados() {
		return this.colorgeneralsEliminados;
	}

	public void setColorGeneralsEliminados(List<ColorGeneral> colorgeneralsEliminados) {
		this.colorgeneralsEliminados = colorgeneralsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarColorGeneral() {
		return jComboBoxTiposSeleccionarColorGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarColorGeneral(
			JComboBox jComboBoxTiposSeleccionarColorGeneral) {
		this.jComboBoxTiposSeleccionarColorGeneral = jComboBoxTiposSeleccionarColorGeneral;
	}
	
	public void setBorderResaltarTiposSeleccionarColorGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarColorGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarColorGeneral .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralColorGeneral() {
		return jTextFieldValorCampoGeneralColorGeneral;
	}

	public void setjTextFieldValorCampoGeneralColorGeneral(
			JTextField jTextFieldValorCampoGeneralColorGeneral) {
		this.jTextFieldValorCampoGeneralColorGeneral = jTextFieldValorCampoGeneralColorGeneral;
	}

	public void setBorderResaltarValorCampoGeneralColorGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorGeneral.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralColorGeneral .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosColorGeneral() {
		return this.jCheckBoxSeleccionarTodosColorGeneral;
	}

	public void setjCheckBoxSeleccionarTodosColorGeneral(
			JCheckBox jCheckBoxSeleccionarTodosColorGeneral) {
		this.jCheckBoxSeleccionarTodosColorGeneral = jCheckBoxSeleccionarTodosColorGeneral;
	}

	public void setBorderResaltarSeleccionarTodosColorGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorGeneral.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosColorGeneral .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosColorGeneral() {
		return this.jCheckBoxSeleccionadosColorGeneral;
	}

	public void setjCheckBoxSeleccionadosColorGeneral(
			JCheckBox jCheckBoxSeleccionadosColorGeneral) {
		this.jCheckBoxSeleccionadosColorGeneral = jCheckBoxSeleccionadosColorGeneral;
	}
	
	public void setBorderResaltarSeleccionadosColorGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorGeneral.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosColorGeneral .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesColorGeneral() {
		return this.jComboBoxTiposArchivosReportesColorGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesColorGeneral(
			JComboBox jComboBoxTiposArchivosReportesColorGeneral) {
		this.jComboBoxTiposArchivosReportesColorGeneral = jComboBoxTiposArchivosReportesColorGeneral;
	}

	public void setBorderResaltarTiposArchivosReportesColorGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesColorGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesColorGeneral() {
		return this.jComboBoxTiposReportesColorGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesColorGeneral(
			JComboBox jComboBoxTiposReportesColorGeneral) {
		this.jComboBoxTiposReportesColorGeneral = jComboBoxTiposReportesColorGeneral;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoColorGeneral() {
	//	return jComboBoxTiposReportesDinamicoColorGeneral;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoColorGeneral(
	//		JComboBox jComboBoxTiposReportesDinamicoColorGeneral) {
	//	this.jComboBoxTiposReportesDinamicoColorGeneral = jComboBoxTiposReportesDinamicoColorGeneral;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoColorGeneral() {
	//	return jComboBoxTiposArchivosReportesDinamicoColorGeneral;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoColorGeneral(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoColorGeneral) {
	//	this.jComboBoxTiposArchivosReportesDinamicoColorGeneral = jComboBoxTiposArchivosReportesDinamicoColorGeneral;
	//}
	
	public void setBorderResaltarTiposReportesColorGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesColorGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesColorGeneral() {
		return this.jComboBoxTiposGraficosReportesColorGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesColorGeneral(
			JComboBox jComboBoxTiposGraficosReportesColorGeneral) {
		this.jComboBoxTiposGraficosReportesColorGeneral = jComboBoxTiposGraficosReportesColorGeneral;
	}
	
	public void setBorderResaltarTiposGraficosReportesColorGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesColorGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionColorGeneral() {
		return this.jComboBoxTiposPaginacionColorGeneral;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionColorGeneral(
			JComboBox jComboBoxTiposPaginacionColorGeneral) {
		this.jComboBoxTiposPaginacionColorGeneral = jComboBoxTiposPaginacionColorGeneral;
	}
	
	public void setBorderResaltarTiposPaginacionColorGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionColorGeneral .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesColorGeneral() {
		return this.jComboBoxTiposRelacionesColorGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesColorGeneral() {
		return this.jComboBoxTiposAccionesColorGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesColorGeneral(
			JComboBox jComboBoxTiposRelacionesColorGeneral) {
		this.jComboBoxTiposRelacionesColorGeneral = jComboBoxTiposRelacionesColorGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesColorGeneral(
			JComboBox jComboBoxTiposAccionesColorGeneral) {
		this.jComboBoxTiposAccionesColorGeneral = jComboBoxTiposAccionesColorGeneral;
	}
	
	public void setBorderResaltarTiposRelacionesColorGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesColorGeneral .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesColorGeneral() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarColorGeneral.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesColorGeneral .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoColorGeneral() {
	//	return jCheckBoxConGraficoDinamicoColorGeneral;
	//}

	//public void setjCheckBoxConGraficoDinamicoColorGeneral(
	//		JCheckBox jCheckBoxConGraficoDinamicoColorGeneral) {
	//	this.jCheckBoxConGraficoDinamicoColorGeneral = jCheckBoxConGraficoDinamicoColorGeneral;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoColorGeneral() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarColorGeneral.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoColorGeneral .setBorder(borderResaltar);		
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
		this.colorgeneralSessionBean=new ColorGeneralSessionBean();
		
		this.colorgeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.colorgeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.colorgeneralSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ColorGeneralJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ColorGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ColorGeneralJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ColorGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ColorGeneralJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Color MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
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
		
		ColorGeneralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ColorGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarColorGeneral= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarColorGeneral,this.jTtoolBarColorGeneral,
							"nuevo","nuevo","Nuevo"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarColorGeneral,this.jTtoolBarColorGeneral,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarColorGeneral,this.jTtoolBarColorGeneral,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarColorGeneral,this.jTtoolBarColorGeneral,
							"duplicar","duplicar","Duplicar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarColorGeneral,this.jTtoolBarColorGeneral,
							"copiar","copiar","Copiar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarColorGeneral,this.jTtoolBarColorGeneral,
							"ver_form","ver_form","Ver"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarColorGeneral,this.jTtoolBarColorGeneral,
							"recargar","recargar","Recargar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarColorGeneral,this.jTtoolBarColorGeneral,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarColorGeneral,this.jTtoolBarColorGeneral,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarColorGeneral,this.jTtoolBarColorGeneral,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarColorGeneral,this.jTtoolBarColorGeneral,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarColorGeneral,this.jTtoolBarColorGeneral,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarColorGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarColorGeneral,this.jTtoolBarColorGeneral,
							"cerrar","cerrar","Salir"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarColorGeneral=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarColorGeneral;
			
				this.jButtonProcesarInformacionToolBarColorGeneral=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarColorGeneral;
				
		//protected JButton jButtonModificarToolBarColorGeneral;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarColorGeneral=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuColorGeneral=new JMenuMe("General");
		this.jmenuArchivoColorGeneral=new JMenuMe("Archivo");
		this.jmenuAccionesColorGeneral=new JMenuMe("Acciones");
		this.jmenuDatosColorGeneral=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoColorGeneral= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoColorGeneral.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoColorGeneral,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarColorGeneral= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarColorGeneral.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarColorGeneral,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesColorGeneral= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesColorGeneral.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesColorGeneral,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosColorGeneral= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosColorGeneral.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosColorGeneral,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarColorGeneral= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarColorGeneral.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarColorGeneral,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormColorGeneral= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormColorGeneral.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormColorGeneral,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaColorGeneral= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaColorGeneral.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaColorGeneral,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarColorGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarColorGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarColorGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionColorGeneral= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionColorGeneral.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionColorGeneral,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionColorGeneral= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionColorGeneral.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionColorGeneral,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresColorGeneral= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresColorGeneral.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresColorGeneral,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesColorGeneral= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesColorGeneral.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesColorGeneral,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByColorGeneral= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByColorGeneral.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByColorGeneral,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarColorGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarColorGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarColorGeneral,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByColorGeneral= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByColorGeneral.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByColorGeneral,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarColorGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarColorGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarColorGeneral,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosColorGeneral= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosColorGeneral.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosColorGeneral,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoColorGeneral.add(this.jMenuItemCerrarColorGeneral);
			
			this.jmenuAccionesColorGeneral.add(this.jMenuItemNuevoColorGeneral);
			this.jmenuAccionesColorGeneral.add(this.jMenuItemNuevoGuardarCambiosColorGeneral);
			this.jmenuAccionesColorGeneral.add(this.jMenuItemNuevoRelacionesColorGeneral);
			this.jmenuAccionesColorGeneral.add(this.jMenuItemGuardarCambiosTablaColorGeneral);		
			this.jmenuAccionesColorGeneral.add(this.jMenuItemDuplicarColorGeneral);		
			this.jmenuAccionesColorGeneral.add(this.jMenuItemCopiarColorGeneral);		
			this.jmenuAccionesColorGeneral.add(this.jMenuItemVerFormColorGeneral);		
			
			this.jmenuDatosColorGeneral.add(this.jMenuItemRecargarInformacionColorGeneral);				
			this.jmenuDatosColorGeneral.add(this.jMenuItemAnterioresColorGeneral);				
			this.jmenuDatosColorGeneral.add(this.jMenuItemSiguientesColorGeneral);				
			this.jmenuDatosColorGeneral.add(this.jMenuItemAbrirOrderByColorGeneral);				
			this.jmenuDatosColorGeneral.add(this.jMenuItemMostrarOcultarColorGeneral);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesColorGeneral.add(this.jMenuItemGuardarCambiosColorGeneral);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarColorGeneral.add(this.jmenuArchivoColorGeneral);		
			this.jmenuBarColorGeneral.add(this.jmenuAccionesColorGeneral);		
			this.jmenuBarColorGeneral.add(this.jmenuDatosColorGeneral);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarColorGeneral);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasColorGeneral() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreColorGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreColorGeneral.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreColorGeneral= new JButtonMe();
		this.jButtonBusquedaPorNombreColorGeneral.setText("Buscar");
		this.jButtonBusquedaPorNombreColorGeneral.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreColorGeneral,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreColorGeneral = new JLabelMe();
		jLabelnombreBusquedaPorNombreColorGeneral.setText("Nombre :");
		jLabelnombreBusquedaPorNombreColorGeneral.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreColorGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreColorGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreColorGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreColorGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombreColorGeneral= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombreColorGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreColorGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreColorGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombreColorGeneral,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasColorGeneral=new JTabbedPane();


		this.jTabbedPaneBusquedasColorGeneral.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasColorGeneral.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasColorGeneral.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasColorGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasColorGeneral,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleColorGeneral = new ColorGeneralDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Color DATOS");
			this.jInternalFrameDetalleFormColorGeneral = new ColorGeneralDetalleFormJInternalFrame(jDesktopPane,this.colorgeneralSessionBean.getConGuardarRelaciones(),this.colorgeneralSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormColorGeneral = null;//new ColorGeneralDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutColorGeneral= new GridBagLayout();
		
		
		this.jTableDatosColorGeneral = new JTableMe();      
		
		String sToolTipColorGeneral="";
		sToolTipColorGeneral=ColorGeneralConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipColorGeneral+="(Seguridad.ColorGeneral)";
		}
		
		if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
			sToolTipColorGeneral+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosColorGeneral.setToolTipText(sToolTipColorGeneral);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosColorGeneral);
		this.jTableDatosColorGeneral.setAutoCreateRowSorter(true);
		this.jTableDatosColorGeneral.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosColorGeneral.setRowSelectionAllowed(true);
		this.jTableDatosColorGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosColorGeneral,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoColorGeneral = new JButtonMe();
		this.jButtonDuplicarColorGeneral = new JButtonMe();
		this.jButtonCopiarColorGeneral = new JButtonMe();
		this.jButtonVerFormColorGeneral = new JButtonMe();
		this.jButtonNuevoRelacionesColorGeneral = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaColorGeneral = new JButtonMe();
		this.jButtonCerrarColorGeneral = new JButtonMe();
		
		this.jScrollPanelDatosColorGeneral = new JScrollPane();   
        this.jScrollPanelDatosGeneralColorGeneral = new JScrollPane();
		
				
		
		
		this.jPanelAccionesColorGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Color";
		
		if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Colores" + this.sPath));
		} else {
			this.jScrollPanelDatosColorGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesColorGeneral.setToolTipText("Acciones");
        this.jPanelAccionesColorGeneral.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoColorGeneral=new ReporteDinamicoJInternalFrame(ColorGeneralConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoColorGeneral();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionColorGeneral=new ImportacionJInternalFrame(ColorGeneralConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionColorGeneral();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByColorGeneral = new JButtonMe();
		
		this.jButtonAbrirOrderByColorGeneral.setText("Orden");
		this.jButtonAbrirOrderByColorGeneral.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByColorGeneral,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByColorGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByColorGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByColorGeneral,false,this);
			
			//this.cargarOrderByColorGeneral(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByColorGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByColorGeneral,true,this);
			
			//this.cargarOrderByColorGeneral(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosColorGeneral.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosColorGeneral.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosColorGeneral.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosColorGeneral.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosColorGeneral.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosColorGeneral.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoColorGeneral.setText("Nuevo");
		this.jButtonDuplicarColorGeneral.setText("Duplicar");
		this.jButtonCopiarColorGeneral.setText("Copiar");
		this.jButtonVerFormColorGeneral.setText("Ver");
		this.jButtonNuevoRelacionesColorGeneral.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaColorGeneral.setText("Guardar");
		this.jButtonCerrarColorGeneral.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoColorGeneral,"nuevo_button","Nuevo",this.colorgeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarColorGeneral,"duplicar_button","Duplicar",this.colorgeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarColorGeneral,"copiar_button","Copiar",this.colorgeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormColorGeneral,"ver_form","Ver",this.colorgeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesColorGeneral,"nuevorelaciones_button","Nuevo Rel",this.colorgeneralSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaColorGeneral,"guardarcambiostabla_button","Guardar",this.colorgeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarColorGeneral,"cerrar_button","Salir",this.colorgeneralSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoColorGeneral.setToolTipText("Nuevo"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarColorGeneral.setToolTipText("Duplicar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarColorGeneral.setToolTipText("Copiar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormColorGeneral.setToolTipText("Ver"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesColorGeneral.setToolTipText("Nuevo Rel"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaColorGeneral.setToolTipText("Guardar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarColorGeneral.setToolTipText("Salir"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoColorGeneral";
		inputMap = this.jButtonNuevoColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoColorGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoColorGeneral"));
		
		//DUPLICAR
		sMapKey = "DuplicarColorGeneral";
		inputMap = this.jButtonDuplicarColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarColorGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarColorGeneral"));
		
		//COPIAR
		sMapKey = "CopiarColorGeneral";
		inputMap = this.jButtonCopiarColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarColorGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarColorGeneral"));
		
		//VEr FORM
		sMapKey = "VerFormColorGeneral";
		inputMap = this.jButtonVerFormColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormColorGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormColorGeneral"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesColorGeneral";
		inputMap = this.jButtonNuevoRelacionesColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesColorGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesColorGeneral"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarColorGeneral";
		inputMap = this.jButtonModificarColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarColorGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarColorGeneral"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarColorGeneral";
		inputMap = this.jButtonCerrarColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarColorGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarColorGeneral"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaColorGeneral";
		inputMap = this.jButtonGuardarCambiosTablaColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaColorGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaColorGeneral"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesColorGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesColorGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionColorGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ColorGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ColorGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ColorGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ColorGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ColorGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesColorGeneral.setName("jPanelParametrosReportesColorGeneral"); 
		
		this.jPanelParametrosReportesAccionesColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesColorGeneral.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesColorGeneral.setName("jPanelParametrosReportesAccionesColorGeneral"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesColorGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionColorGeneral = new JButtonMe();
		this.jButtonRecargarInformacionColorGeneral.setText("Recargar");
		this.jButtonRecargarInformacionColorGeneral.setToolTipText("Recargar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionColorGeneral,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionColorGeneral = new JButtonMe();
		this.jButtonProcesarInformacionColorGeneral.setText("Procesar");
		this.jButtonProcesarInformacionColorGeneral.setToolTipText("Procesar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionColorGeneral.setVisible(false);
			
		this.jButtonProcesarInformacionColorGeneral.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionColorGeneral.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionColorGeneral.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesColorGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesColorGeneral.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesColorGeneral.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesColorGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesColorGeneral.setText("TIPO");       
		this.jComboBoxTiposReportesColorGeneral.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesColorGeneral = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesColorGeneral.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesColorGeneral.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionColorGeneral = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionColorGeneral.setText("Paginacion");
		this.jComboBoxTiposPaginacionColorGeneral.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesColorGeneral = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesColorGeneral.setText("Accion");
		this.jComboBoxTiposRelacionesColorGeneral.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesColorGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesColorGeneral.setText("Accion");
		this.jComboBoxTiposAccionesColorGeneral.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarColorGeneral = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarColorGeneral.setText("Accion");
		this.jComboBoxTiposSeleccionarColorGeneral.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralColorGeneral=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralColorGeneral.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralColorGeneral.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralColorGeneral.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesColorGeneral = new JLabelMe();
		
		this.jLabelAccionesColorGeneral.setText("Acciones");		
		this.jLabelAccionesColorGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesColorGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesColorGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosColorGeneral = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosColorGeneral.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosColorGeneral.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosColorGeneral = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosColorGeneral.setText("Seleccionados");
		this.jCheckBoxSeleccionadosColorGeneral.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaColorGeneral = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaColorGeneral.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaColorGeneral.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteColorGeneral = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteColorGeneral.setText("Graf.");
		this.jCheckBoxConGraficoReporteColorGeneral.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresColorGeneral = new JButtonMe();
		//this.jButtonAnterioresColorGeneral.setText("<<");
        this.jButtonAnterioresColorGeneral.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresColorGeneral,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesColorGeneral = new JButtonMe();
		//this.jButtonSiguientesColorGeneral.setText(">>");
        this.jButtonSiguientesColorGeneral.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesColorGeneral,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosColorGeneral = new JButtonMe();
		this.jButtonNuevoGuardarCambiosColorGeneral.setText("Nue");
        this.jButtonNuevoGuardarCambiosColorGeneral.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosColorGeneral,"nuevoguardarcambios_button","Nue",this.colorgeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosColorGeneral";
		inputMap = this.jButtonNuevoGuardarCambiosColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosColorGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosColorGeneral"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionColorGeneral";
		inputMap = this.jButtonRecargarInformacionColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionColorGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionColorGeneral"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesColorGeneral";
		inputMap = this.jButtonSiguientesColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesColorGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesColorGeneral"));
		
		//ANTERIORES		
		sMapKey = "AnterioresColorGeneral";
		inputMap = this.jButtonAnterioresColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresColorGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresColorGeneral"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasColorGeneral();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesColorGeneral.setMinimumSize(new Dimension(this.getWidth(),ColorGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ColorGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesColorGeneral.setMaximumSize(new Dimension(this.getWidth(),ColorGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ColorGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesColorGeneral.setPreferredSize(new Dimension(this.getWidth(),ColorGeneralBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ColorGeneralBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionColorGeneral = new GridBagLayout();

			this.jPanelPaginacionColorGeneral.setLayout(gridaBagLayoutPaginacionColorGeneral);						
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.gridy = 0;
			this.gridBagConstraintsColorGeneral.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionColorGeneral.add(this.jButtonAnterioresColorGeneral, this.gridBagConstraintsColorGeneral);
					
						
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsColorGeneral.gridy = 0;
			
			this.jPanelPaginacionColorGeneral.add(this.jButtonNuevoGuardarCambiosColorGeneral, this.gridBagConstraintsColorGeneral);
						
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsColorGeneral.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsColorGeneral.gridy = 0;
			this.jPanelPaginacionColorGeneral.add(this.jButtonSiguientesColorGeneral, this.gridBagConstraintsColorGeneral);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.gridy = 1;
			this.gridBagConstraintsColorGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionColorGeneral.add(this.jButtonNuevoColorGeneral, this.gridBagConstraintsColorGeneral);
						
			
			
			if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsColorGeneral = new GridBagConstraints();
				this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsColorGeneral.gridy = 1;
				this.gridBagConstraintsColorGeneral.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionColorGeneral.add(this.jButtonGuardarCambiosTablaColorGeneral, this.gridBagConstraintsColorGeneral);
			}
			
			
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.gridy = 1;
			this.gridBagConstraintsColorGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionColorGeneral.add(this.jButtonDuplicarColorGeneral, this.gridBagConstraintsColorGeneral);
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.gridy = 1;
			this.gridBagConstraintsColorGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionColorGeneral.add(this.jButtonCopiarColorGeneral, this.gridBagConstraintsColorGeneral);
		
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.gridy = 1;
			this.gridBagConstraintsColorGeneral.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionColorGeneral.add(this.jButtonVerFormColorGeneral, this.gridBagConstraintsColorGeneral);
		
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.gridy = 1;
			this.gridBagConstraintsColorGeneral.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionColorGeneral.add(this.jButtonCerrarColorGeneral, this.gridBagConstraintsColorGeneral);
		
		
		
		this.jButtonRecargarInformacionColorGeneral.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionColorGeneral.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionColorGeneral.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesColorGeneral.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesColorGeneral.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesColorGeneral.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesColorGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesColorGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesColorGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesColorGeneral.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesColorGeneral.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesColorGeneral.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionColorGeneral.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionColorGeneral.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionColorGeneral.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesColorGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesColorGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesColorGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesColorGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesColorGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesColorGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarColorGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarColorGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarColorGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaColorGeneral.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaColorGeneral.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaColorGeneral.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteColorGeneral.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteColorGeneral.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteColorGeneral.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosColorGeneral.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosColorGeneral.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosColorGeneral.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosColorGeneral.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosColorGeneral.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosColorGeneral.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesColorGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesColorGeneral = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ColorGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ColorGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ColorGeneral = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ColorGeneral = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesColorGeneral.setLayout(gridaBagParametrosReportesColorGeneral);
			this.jPanelParametrosReportesAccionesColorGeneral.setLayout(gridaBagParametrosReportesAccionesColorGeneral);
			
			
			this.jPanelParametrosAuxiliar1ColorGeneral.setLayout(gridaBagParametrosAuxiliar1ColorGeneral);
			this.jPanelParametrosAuxiliar2ColorGeneral.setLayout(gridaBagParametrosAuxiliar2ColorGeneral);
			this.jPanelParametrosAuxiliar3ColorGeneral.setLayout(gridaBagParametrosAuxiliar3ColorGeneral);
			this.jPanelParametrosAuxiliar4ColorGeneral.setLayout(gridaBagParametrosAuxiliar4ColorGeneral);
			//this.jPanelParametrosAuxiliar5ColorGeneral.setLayout(gridaBagParametrosAuxiliar2ColorGeneral);			
			
			
			
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsColorGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesColorGeneral.add(this.jButtonRecargarInformacionColorGeneral, this.gridBagConstraintsColorGeneral);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsColorGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ColorGeneral.add(this.jComboBoxTiposPaginacionColorGeneral, this.gridBagConstraintsColorGeneral);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsColorGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ColorGeneral.add(this.jCheckBoxConAltoMaximoTablaColorGeneral, this.gridBagConstraintsColorGeneral);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorGeneral.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsColorGeneral.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ColorGeneral.add(this.jComboBoxTiposArchivosReportesColorGeneral, this.gridBagConstraintsColorGeneral);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesColorGeneral.add(this.jPanelParametrosAuxiliar1ColorGeneral, this.gridBagConstraintsColorGeneral);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsColorGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ColorGeneral.add(this.jComboBoxTiposReportesColorGeneral, this.gridBagConstraintsColorGeneral);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesColorGeneral.add(this.jPanelParametrosAuxiliar4ColorGeneral, this.gridBagConstraintsColorGeneral);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorGeneral.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsColorGeneral.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesColorGeneral.add(this.jComboBoxTiposReportesColorGeneral, this.gridBagConstraintsColorGeneral);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorGeneral.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesColorGeneral.add(this.jCheckBoxGenerarReporteColorGeneral, this.gridBagConstraintsColorGeneral);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesColorGeneral.add(this.jPanelParametrosAuxiliar2ColorGeneral, this.gridBagConstraintsColorGeneral);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsColorGeneral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesColorGeneral.add(this.jLabelAccionesColorGeneral, this.gridBagConstraintsColorGeneral);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsColorGeneral = new GridBagConstraints();
				this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsColorGeneral.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsColorGeneral.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesColorGeneral.add(this.jButtonAbrirOrderByColorGeneral, this.gridBagConstraintsColorGeneral);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsColorGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesColorGeneral.add(this.jComboBoxTiposSeleccionarColorGeneral, this.gridBagConstraintsColorGeneral);			
			
			
			/*
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsColorGeneral.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesColorGeneral.add(this.jCheckBoxSeleccionarTodosColorGeneral, this.gridBagConstraintsColorGeneral);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsColorGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ColorGeneral.add(this.jCheckBoxSeleccionarTodosColorGeneral, this.gridBagConstraintsColorGeneral);															
				
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsColorGeneral.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ColorGeneral.add(this.jCheckBoxSeleccionadosColorGeneral, this.gridBagConstraintsColorGeneral);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsColorGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorGeneral.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesColorGeneral.add(this.jPanelParametrosAuxiliar3ColorGeneral, this.gridBagConstraintsColorGeneral);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesColorGeneral.add(this.jComboBoxTiposRelacionesColorGeneral, this.gridBagConstraintsColorGeneral);
				
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsColorGeneral.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesColorGeneral.add(this.jComboBoxTiposAccionesColorGeneral, this.gridBagConstraintsColorGeneral);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosColorGeneral = new GridBagLayout();

			this.jScrollPanelDatosColorGeneral.setLayout(gridaBagLayoutDatosColorGeneral);
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.gridy = 0;
			this.gridBagConstraintsColorGeneral.gridx = 0;
			
			this.jScrollPanelDatosColorGeneral.add(this.jTableDatosColorGeneral, this.gridBagConstraintsColorGeneral);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosColorGeneral.setViewportView(this.jTableDatosColorGeneral);
		this.jTableDatosColorGeneral.setFillsViewportHeight(true);
		this.jTableDatosColorGeneral.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesColorGeneral= new GridBagLayout();
		this.jPanelAccionesColorGeneral.setLayout(gridaBagLayoutAccionesColorGeneral);
		
		
		/*	
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorGeneral.gridy = 0;
		this.gridBagConstraintsColorGeneral.gridx = 0;
			
		this.jPanelAccionesColorGeneral.add(this.jButtonNuevoColorGeneral, this.gridBagConstraintsColorGeneral);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreColorGeneral= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreColorGeneral.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreColorGeneral.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreColorGeneral.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreColorGeneral.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreColorGeneral.setLayout(gridaBagLayoutBusquedaPorNombreColorGeneral);

		gridBagConstraintsColorGeneral = new GridBagConstraints();
		gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsColorGeneral.gridy = 0;
		gridBagConstraintsColorGeneral.gridx = 0;
		jPanelBusquedaPorNombreColorGeneral.add(jLabelnombreBusquedaPorNombreColorGeneral, gridBagConstraintsColorGeneral);

		gridBagConstraintsColorGeneral = new GridBagConstraints();
		gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsColorGeneral.gridy = 0;
		gridBagConstraintsColorGeneral.gridx = 1;
		jPanelBusquedaPorNombreColorGeneral.add(jTextFieldnombreBusquedaPorNombreColorGeneral, gridBagConstraintsColorGeneral);

		gridBagConstraintsColorGeneral = new GridBagConstraints();
		gridBagConstraintsColorGeneral.anchor = GridBagConstraints.WEST;
		gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsColorGeneral.gridy = 1;
		gridBagConstraintsColorGeneral.gridx =1;
		jPanelBusquedaPorNombreColorGeneral.add(jButtonBusquedaPorNombreColorGeneral, gridBagConstraintsColorGeneral);

		jTabbedPaneBusquedasColorGeneral.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreColorGeneral);
		jTabbedPaneBusquedasColorGeneral.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutColorGeneral = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutColorGeneral);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.colorgeneralSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();						
			this.gridBagConstraintsColorGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsColorGeneral.gridx = 0;		
			//this.gridBagConstraintsColorGeneral.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsColorGeneral.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarColorGeneral, this.gridBagConstraintsColorGeneral);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy = iGridyPrincipal++;
		this.gridBagConstraintsColorGeneral.gridx = 0;		
		//this.gridBagConstraintsColorGeneral.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsColorGeneral.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsColorGeneral);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsColorGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsColorGeneral.gridx = 0;		
			this.gridBagConstraintsColorGeneral.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsColorGeneral.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasColorGeneral, this.gridBagConstraintsColorGeneral);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsColorGeneral.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesColorGeneral, this.gridBagConstraintsColorGeneral);								
		
		
		/*
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsColorGeneral.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesColorGeneral, this.gridBagConstraintsColorGeneral);
		*/		
		
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy =iGridyPrincipal++;
		this.gridBagConstraintsColorGeneral.gridx =0;
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsColorGeneral.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosColorGeneral, this.gridBagConstraintsColorGeneral);
				
		
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsColorGeneral.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionColorGeneral, this.gridBagConstraintsColorGeneral);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ColorGeneralJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosColorGeneral= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosColorGeneral = new GridBagLayout();
			this.jPanelBusquedasParametrosColorGeneral.setLayout(gridaBagLayoutBusquedasParametrosColorGeneral);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralColorGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralColorGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralColorGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralColorGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsColorGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposColorGeneral, this.gridBagConstraintsColorGeneral);
			
			
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsColorGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosColorGeneral, this.gridBagConstraintsColorGeneral);
		
			
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsColorGeneral.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesColorGeneral, this.gridBagConstraintsColorGeneral);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralColorGeneral;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoColorGeneral() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoColorGeneral = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoColorGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoColorGeneral.setName("jPanelReporteDinamicoColorGeneral"); 
		
		this.jPanelReporteDinamicoColorGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoColorGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoColorGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoColorGeneral.setLayout(gridaBagLayoutReporteDinamicoColorGeneral);
		
		
		this.jInternalFrameReporteDinamicoColorGeneral= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoColorGeneral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteColorGeneral= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoColorGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoColorGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoColorGeneral.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoColorGeneral.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoColorGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoColorGeneral.setResizable(true);
	    this.jInternalFrameReporteDinamicoColorGeneral.setClosable(true);
	    this.jInternalFrameReporteDinamicoColorGeneral.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoColorGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoColorGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoColorGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Colores"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteColorGeneral = new JLabelMe();

		this.jLabelColumnasSelectReporteColorGeneral.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteColorGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteColorGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteColorGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsColorGeneral.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoColorGeneral.add(this.jLabelColumnasSelectReporteColorGeneral, this.gridBagConstraintsColorGeneral);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteColorGeneral = new JList<Reporte>();
		this.jListColumnasSelectReporteColorGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteColorGeneral.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteColorGeneral.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteColorGeneral.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteColorGeneral.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteColorGeneral=new JScrollPane(this.jListColumnasSelectReporteColorGeneral);
			
			this.jScrollColumnasSelectReporteColorGeneral.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteColorGeneral.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteColorGeneral.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsColorGeneral.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoColorGeneral.add(this.jListColumnasSelectReporteColorGeneral, this.gridBagConstraintsColorGeneral);
		this.jPanelReporteDinamicoColorGeneral.add(this.jScrollColumnasSelectReporteColorGeneral, this.gridBagConstraintsColorGeneral);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteColorGeneral = new JLabelMe();

		this.jLabelRelacionesSelectReporteColorGeneral.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteColorGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteColorGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteColorGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteColorGeneral = new JList<Reporte>();
		this.jListRelacionesSelectReporteColorGeneral.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteColorGeneral.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteColorGeneral.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteColorGeneral.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteColorGeneral.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteColorGeneral=new JScrollPane(this.jListRelacionesSelectReporteColorGeneral);
			
			this.jScrollRelacionesSelectReporteColorGeneral.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteColorGeneral.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteColorGeneral.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoColorGeneral = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoColorGeneral = new JComboBoxMe();
		this.jListColumnasValoresGraficoColorGeneral = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoColorGeneral = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoColorGeneral.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoColorGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoColorGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoColorGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoColorGeneral = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoColorGeneral.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoColorGeneral.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoColorGeneral.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoColorGeneral.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoColorGeneral = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoColorGeneral.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoColorGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoColorGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoColorGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsColorGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoColorGeneral.add(this.jLabelGenerarExcelReporteDinamicoColorGeneral, this.gridBagConstraintsColorGeneral);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoColorGeneral = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoColorGeneral.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoColorGeneral,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoColorGeneral.setToolTipText("Generar EXCEL"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		//this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsColorGeneral.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsColorGeneral.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoColorGeneral.add(this.jButtonGenerarExcelReporteDinamicoColorGeneral, this.gridBagConstraintsColorGeneral);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsColorGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoColorGeneral.add(this.jComboBoxTiposReportesDinamicoColorGeneral, this.gridBagConstraintsColorGeneral);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoColorGeneral = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoColorGeneral.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoColorGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoColorGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoColorGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorGeneral.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsColorGeneral.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoColorGeneral.add(this.jLabelTiposArchivoReporteDinamicoColorGeneral, this.gridBagConstraintsColorGeneral);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsColorGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoColorGeneral.add(this.jComboBoxTiposArchivosReportesDinamicoColorGeneral, this.gridBagConstraintsColorGeneral);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoColorGeneral = new JButtonMe();
		this.jButtonGenerarReporteDinamicoColorGeneral.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoColorGeneral,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoColorGeneral.setToolTipText("Generar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsColorGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoColorGeneral.add(this.jButtonGenerarReporteDinamicoColorGeneral, this.gridBagConstraintsColorGeneral);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoColorGeneral = new JButtonMe();
		this.jButtonCerrarReporteDinamicoColorGeneral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoColorGeneral,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoColorGeneral.setToolTipText("Cancelar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorGeneral.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsColorGeneral.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoColorGeneral.add(this.jButtonCerrarReporteDinamicoColorGeneral, this.gridBagConstraintsColorGeneral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalColorGeneral = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoColorGeneral= new JScrollPane(jPanelReporteDinamicoColorGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoColorGeneral.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoColorGeneral.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoColorGeneral.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Colores"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsColorGeneral.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoColorGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoColorGeneral.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalColorGeneral);
		this.jInternalFrameReporteDinamicoColorGeneral.getContentPane().add(this.jScrollPanelReporteDinamicoColorGeneral, this.gridBagConstraintsColorGeneral);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionColorGeneral() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionColorGeneral = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionColorGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionColorGeneral.setName("jPanelImportacionColorGeneral"); 
		
		this.jPanelImportacionColorGeneral.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionColorGeneral.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionColorGeneral.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionColorGeneral.setLayout(gridaBagLayoutImportacionColorGeneral);
		
		
		this.jInternalFrameImportacionColorGeneral= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionColorGeneral= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionColorGeneral = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteColorGeneral= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionColorGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionColorGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionColorGeneral.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionColorGeneral.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionColorGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionColorGeneral.setResizable(true);
	    this.jInternalFrameImportacionColorGeneral.setClosable(true);
	    this.jInternalFrameImportacionColorGeneral.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionColorGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionColorGeneral.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionColorGeneral.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionColorGeneral.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionColorGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionColorGeneral.setResizable(true);
	    this.jInternalFrameImportacionColorGeneral.setClosable(true);
	    this.jInternalFrameImportacionColorGeneral.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionColorGeneral.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionColorGeneral.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionColorGeneral.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Colores"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionColorGeneral = new JLabelMe();

		this.jLabelArchivoImportacionColorGeneral.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionColorGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionColorGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionColorGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorGeneral.gridy = iPosYImportacion;		
		this.gridBagConstraintsColorGeneral.gridx = iPosXImportacion++;
			
		this.jPanelImportacionColorGeneral.add(this.jLabelArchivoImportacionColorGeneral, this.gridBagConstraintsColorGeneral);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionColorGeneral = new JFileChooser();		
		this.jFileChooserImportacionColorGeneral.setToolTipText("ESCOGER ARCHIVO"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionColorGeneral = new JButtonMe();
		this.jButtonAbrirImportacionColorGeneral.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionColorGeneral,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionColorGeneral.setToolTipText("Generar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsColorGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionColorGeneral.add(this.jButtonAbrirImportacionColorGeneral, this.gridBagConstraintsColorGeneral);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionColorGeneral = new JLabelMe();

		this.jLabelPathArchivoImportacionColorGeneral.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionColorGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionColorGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionColorGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsColorGeneral.gridy = iPosYImportacion;		
		this.gridBagConstraintsColorGeneral.gridx = iPosXImportacion++;
			
		this.jPanelImportacionColorGeneral.add(this.jLabelPathArchivoImportacionColorGeneral, this.gridBagConstraintsColorGeneral);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionColorGeneral=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionColorGeneral.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionColorGeneral.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionColorGeneral.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsColorGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionColorGeneral.add(this.jTextFieldPathArchivoImportacionColorGeneral, this.gridBagConstraintsColorGeneral);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionColorGeneral = new JButtonMe();
		this.jButtonGenerarImportacionColorGeneral.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionColorGeneral,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionColorGeneral.setToolTipText("Generar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsColorGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionColorGeneral.add(this.jButtonGenerarImportacionColorGeneral, this.gridBagConstraintsColorGeneral);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionColorGeneral = new JButtonMe();
		this.jButtonCerrarImportacionColorGeneral.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionColorGeneral,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionColorGeneral.setToolTipText("Cancelar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsColorGeneral.gridy = iPosYImportacion;
		this.gridBagConstraintsColorGeneral.gridx = iPosXImportacion++;
							
		this.jPanelImportacionColorGeneral.add(this.jButtonCerrarImportacionColorGeneral, this.gridBagConstraintsColorGeneral);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalColorGeneral = new GridBagLayout();
		
		this.jScrollPanelImportacionColorGeneral= new JScrollPane(jPanelImportacionColorGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsColorGeneral = new GridBagConstraints();
		this.gridBagConstraintsColorGeneral.gridy =iPosYImportacion;
		this.gridBagConstraintsColorGeneral.gridx =iPosXImportacion;
		this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionColorGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionColorGeneral.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalColorGeneral);
		this.jInternalFrameImportacionColorGeneral.getContentPane().add(this.jScrollPanelImportacionColorGeneral, this.gridBagConstraintsColorGeneral);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByColorGeneral(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByColorGeneral = new JButtonMe();
			this.jButtonAbrirOrderByColorGeneral.setText("Orden");
			this.jButtonAbrirOrderByColorGeneral.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByColorGeneral,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByColorGeneral";
			inputMap = this.jButtonAbrirOrderByColorGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByColorGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByColorGeneral"));
		
		
			GridBagLayout gridaBagLayoutOrderByColorGeneral = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByColorGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByColorGeneral.setName("jPanelOrderByColorGeneral"); 
			
			this.jPanelOrderByColorGeneral.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByColorGeneral.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByColorGeneral.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByColorGeneral.setLayout(gridaBagLayoutOrderByColorGeneral);
			
			
			this.jTableDatosColorGeneralOrderBy = new JTableMe();        
			this.jTableDatosColorGeneralOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosColorGeneralOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosColorGeneralOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosColorGeneralOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosColorGeneralOrderBy.setViewportView(this.jTableDatosColorGeneralOrderBy);
			this.jTableDatosColorGeneralOrderBy.setFillsViewportHeight(true);
			this.jTableDatosColorGeneralOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByColorGeneral= new OrderByJInternalFrame();
			this.jInternalFrameOrderByColorGeneral= new OrderByJInternalFrame();
			this.jScrollPanelOrderByColorGeneral = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteColorGeneral= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByColorGeneral.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByColorGeneral.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByColorGeneral.setTitle("Orden");
			this.jInternalFrameOrderByColorGeneral.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByColorGeneral.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByColorGeneral.setResizable(true);
			this.jInternalFrameOrderByColorGeneral.setClosable(true);
			this.jInternalFrameOrderByColorGeneral.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByColorGeneral.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByColorGeneral.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByColorGeneral.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByColorGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Colores"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.gridy =iPosYOrderBy++;
			this.gridBagConstraintsColorGeneral.gridx =iPosXOrderBy;
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsColorGeneral.ipady =150;
				
			this.jPanelOrderByColorGeneral.add(jScrollPanelDatosColorGeneralOrderBy, this.gridBagConstraintsColorGeneral);//this.jTableDatosColorGeneralTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByColorGeneral = new JButtonMe();
			this.jButtonCerrarOrderByColorGeneral.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByColorGeneral,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByColorGeneral.setToolTipText("Cancelar"+" "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByColorGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsColorGeneral.gridy = iPosYOrderBy++;
			this.gridBagConstraintsColorGeneral.gridx = iPosXOrderBy;
									
			this.jPanelOrderByColorGeneral.add(this.jButtonCerrarOrderByColorGeneral, this.gridBagConstraintsColorGeneral);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalColorGeneral = new GridBagLayout();
			
			this.jScrollPanelOrderByColorGeneral= new JScrollPane(jPanelOrderByColorGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsColorGeneral = new GridBagConstraints();
			this.gridBagConstraintsColorGeneral.gridy =iPosYOrderBy;
			this.gridBagConstraintsColorGeneral.gridx =iPosXOrderBy;
			this.gridBagConstraintsColorGeneral.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByColorGeneral.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByColorGeneral.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalColorGeneral);
			
			this.jInternalFrameOrderByColorGeneral.getContentPane().add(this.jScrollPanelOrderByColorGeneral, this.gridBagConstraintsColorGeneral);			
		
		} else {
			this.jButtonAbrirOrderByColorGeneral = new JButtonMe();
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
		int iWidthTableCalculado=0;//530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.colorgeneralSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosColorGeneral.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosColorGeneral.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosColorGeneral.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosColorGeneral.getRowHeight();//ColorGeneralConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ColorGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaColorGeneral.isSelected()) {
					iHeightTable=ColorGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ColorGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ColorGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ColorGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaColorGeneral.isSelected()) {
					iHeightTable=ColorGeneralConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ColorGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ColorGeneralConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosColorGeneral.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosColorGeneral.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosColorGeneral.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosColorGeneral.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosColorGeneral.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosColorGeneral.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByColorGeneral!=null && this.jInternalFrameOrderByColorGeneral.getjTableDatosOrderBy()!=null) {
			//if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByColorGeneral.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByColorGeneral.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByColorGeneral.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByColorGeneral.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByColorGeneral.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByColorGeneral.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByColorGeneral.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosColorGeneral.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosColorGeneral.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosColorGeneral.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=colorgeneralLogic.getColorGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=colorgenerals.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ColorGeneral> TraerColorGeneralBeans(List<ColorGeneral> colorgenerals,ArrayList<Classe> classes)throws Exception {
		try {
			for(ColorGeneral colorgeneral:colorgenerals) {
					
				if(!(ColorGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ColorGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					colorgeneral.setsDetalleGeneralEntityReporte(ColorGeneralConstantesFunciones.getColorGeneralDescripcion(colorgeneral));
										
						
					
						
					
				} else  {
							
					//colorgeneral.setsDetalleGeneralEntityReporte(colorgeneral.getsDetalleGeneralEntityReporte());
										
				}
				
				//colorgeneralbeans.add(colorgeneralbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return colorgenerals;
    }
	//PARA REPORTES FIN
}
