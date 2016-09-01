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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;

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
import com.bydan.erp.seguridad.util.ZonaConstantesFunciones;

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
public class ZonaJInternalFrame extends ZonaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarZona;
	
	protected JMenuBar jmenuBarZona;
	
	protected JMenu jmenuZona;
	protected JMenu jmenuDatosZona;
	protected JMenu jmenuArchivoZona;
	protected JMenu jmenuAccionesZona;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutZona;	
	protected GridBagConstraints gridBagConstraintsZona;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ZonaDetalleFormJInternalFrame jInternalFrameDetalleFormZona;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoZona;	
	protected ImportacionJInternalFrame jInternalFrameImportacionZona;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public ZonaSessionBean zonaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Zona> zonas;		
	public List<Zona> zonasEliminados;	
	public List<Zona> zonasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByZona;		
	protected JButton jButtonAbrirOrderByZona;
	
	
	//protected JPanel jPanelOrderByZona;
	//public JScrollPane jScrollPanelOrderByZona;	
	//protected JButton jButtonCerrarOrderByZona;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ZonaLogic zonaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosZona;
	public JScrollPane jScrollPanelDatosEdicionZona;
	public JScrollPane jScrollPanelDatosGeneralZona;
    
	
	
	//public JScrollPane jScrollPanelDatosZonaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoZona;
	//public JScrollPane jScrollPanelImportacionZona;
	
	
	
	protected JPanel jPanelAccionesZona;
	
    protected JPanel jPanelPaginacionZona;
    protected JPanel jPanelParametrosReportesZona;
	protected JPanel jPanelParametrosReportesAccionesZona;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Zona;
	protected JPanel jPanelParametrosAuxiliar2Zona;
	protected JPanel jPanelParametrosAuxiliar3Zona;
	protected JPanel jPanelParametrosAuxiliar4Zona;
	//protected JPanel jPanelParametrosAuxiliar5Zona;
	
	
	
	//protected JPanel jPanelReporteDinamicoZona;
	//protected JPanel jPanelImportacionZona;
	
	
	public JTable jTableDatosZona;
	
	
	
	//public JTable jTableDatosZonaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoZona;
	protected JButton jButtonDuplicarZona;
	protected JButton jButtonCopiarZona;
	protected JButton jButtonVerFormZona;
	protected JButton jButtonNuevoRelacionesZona;
	protected JButton jButtonModificarZona;
	
    protected JButton jButtonGuardarCambiosTablaZona;
	protected JButton jButtonCerrarZona;
	
	
	protected JButton jButtonRecargarInformacionZona;
	protected JButton jButtonProcesarInformacionZona;
	
	
	protected JButton jButtonAnterioresZona;
	protected JButton jButtonSiguientesZona;
	protected JButton jButtonNuevoGuardarCambiosZona;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoZona;
	//protected JButton jButtonCerrarReporteDinamicoZona;
	//protected JButton jButtonGenerarExcelReporteDinamicoZona;	
	
	
	
	//protected JButton jButtonAbrirImportacionZona;
	//protected JButton jButtonGenerarImportacionZona;
	//protected JButton jButtonCerrarImportacionZona;
	//protected JFileChooser jFileChooserImportacionZona;
	//protected File fileImportacionZona;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarZona;
	protected JButton jButtonDuplicarToolBarZona;
	protected JButton jButtonNuevoRelacionesToolBarZona;
	
	
	public JButton jButtonGuardarCambiosToolBarZona;
	protected JButton jButtonCopiarToolBarZona;
	protected JButton jButtonVerFormToolBarZona;
	public JButton jButtonGuardarCambiosTablaToolBarZona;
	protected JButton jButtonMostrarOcultarTablaToolBarZona;
	protected JButton jButtonCerrarToolBarZona;
	
	protected JButton jButtonRecargarInformacionToolBarZona;
	protected JButton jButtonProcesarInformacionToolBarZona;
	protected JButton jButtonAnterioresToolBarZona;
	protected JButton jButtonSiguientesToolBarZona;
	protected JButton jButtonNuevoGuardarCambiosToolBarZona;
	protected JButton jButtonAbrirOrderByToolBarZona;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoZona;
	protected JMenuItem jMenuItemDuplicarZona;
	protected JMenuItem jMenuItemNuevoRelacionesZona;
	
	
	protected JMenuItem jMenuItemGuardarCambiosZona;
	protected JMenuItem jMenuItemCopiarZona;
	protected JMenuItem jMenuItemVerFormZona;
	protected JMenuItem jMenuItemGuardarCambiosTablaZona;
	protected JMenuItem jMenuItemCerrarZona;
	protected JMenuItem jMenuItemDetalleCerrarZona;
	protected JMenuItem jMenuItemDetalleAbrirOrderByZona;
	protected JMenuItem jMenuItemDetalleMostarOcultarZona;
	
	protected JMenuItem jMenuItemRecargarInformacionZona;
	protected JMenuItem jMenuItemProcesarInformacionZona;
	protected JMenuItem jMenuItemAnterioresZona;
	protected JMenuItem jMenuItemSiguientesZona;
	protected JMenuItem jMenuItemNuevoGuardarCambiosZona;
	protected JMenuItem jMenuItemAbrirOrderByZona;
	protected JMenuItem jMenuItemMostrarOcultarZona;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesZona;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosZona;
	protected JCheckBox jCheckBoxSeleccionadosZona;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaZona;
	protected JCheckBox jCheckBoxConGraficoReporteZona;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesZona;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesZona;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoZona;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoZona;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesZona;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionZona;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesZona;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesZona;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarZona;
	protected JTextField jTextFieldValorCampoGeneralZona;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteZona;
	//public JList<Reporte> jListColumnasSelectReporteZona;
	//public JScrollPane jScrollColumnasSelectReporteZona;
	
	//public JLabel jLabelRelacionesSelectReporteZona;
	//public JList<Reporte> jListRelacionesSelectReporteZona;
	//public JScrollPane jScrollRelacionesSelectReporteZona;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoZona;
	//protected JCheckBox jCheckBoxConGraficoDinamicoZona;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoZona;
	//public JLabel jLabelTiposArchivoReporteDinamicoZona;
	
		
	//public JLabel jLabelArchivoImportacionZona;	
	//public JLabel jLabelPathArchivoImportacionZona;
	//protected JTextField jTextFieldPathArchivoImportacionZona;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoZona;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoZona;
	
	//public JLabel jLabelColumnaCategoriaValorZona;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorZona;
	
	//public JLabel jLabelColumnasValoresGraficoZona;
	//public JList<Reporte> jListColumnasValoresGraficoZona;
	//public JScrollPane jScrollColumnasValoresGraficoZona;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoZona;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoZona;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasZona;
	public JPanel jPanelBusquedaPorNombreZona;
	public JButton jButtonBusquedaPorNombreZona;
	
	public JPanel jPanelnombreBusquedaPorNombreZona;
	public JLabel jLabelnombreBusquedaPorNombreZona;
	public JTextField jTextFieldnombreBusquedaPorNombreZona;
	public JButton jButtonnombreBusquedaPorNombreZonaBusqueda= new JButtonMe();

	
	
	
	
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
	public ZonaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Zona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ZonaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Zona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ZonaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Zona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ZonaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Zona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionZona)	{
		this.jButtonRecargarInformacionZona = jButtonRecargarInformacionZona;
	}
	
	public JButton getjButtonProcesarInformacionZona() {
		return this.jButtonProcesarInformacionZona;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionZona)	{
		this.jButtonProcesarInformacionZona = jButtonProcesarInformacionZona;
	}
	
	
	public JButton getjButtonRecargarInformacionZona() {
		return this.jButtonRecargarInformacionZona;
	}
	
	
	public List<Zona> getzonas() {
		return this.zonas;
	}

	public void setzonas(List<Zona> zonas) {
		this.zonas = zonas;
	}
	
	public List<Zona> getzonasAux() {
		return this.zonasAux;
	}

	public void setzonasAux(List<Zona> zonasAux) {
		this.zonasAux = zonasAux;
	}
	
	public List<Zona> getzonasEliminados() {
		return this.zonasEliminados;
	}

	public void setZonasEliminados(List<Zona> zonasEliminados) {
		this.zonasEliminados = zonasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarZona() {
		return jComboBoxTiposSeleccionarZona;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarZona(
			JComboBox jComboBoxTiposSeleccionarZona) {
		this.jComboBoxTiposSeleccionarZona = jComboBoxTiposSeleccionarZona;
	}
	
	public void setBorderResaltarTiposSeleccionarZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarZona.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarZona .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralZona() {
		return jTextFieldValorCampoGeneralZona;
	}

	public void setjTextFieldValorCampoGeneralZona(
			JTextField jTextFieldValorCampoGeneralZona) {
		this.jTextFieldValorCampoGeneralZona = jTextFieldValorCampoGeneralZona;
	}

	public void setBorderResaltarValorCampoGeneralZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarZona.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralZona .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosZona() {
		return this.jCheckBoxSeleccionarTodosZona;
	}

	public void setjCheckBoxSeleccionarTodosZona(
			JCheckBox jCheckBoxSeleccionarTodosZona) {
		this.jCheckBoxSeleccionarTodosZona = jCheckBoxSeleccionarTodosZona;
	}

	public void setBorderResaltarSeleccionarTodosZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarZona.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosZona .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosZona() {
		return this.jCheckBoxSeleccionadosZona;
	}

	public void setjCheckBoxSeleccionadosZona(
			JCheckBox jCheckBoxSeleccionadosZona) {
		this.jCheckBoxSeleccionadosZona = jCheckBoxSeleccionadosZona;
	}
	
	public void setBorderResaltarSeleccionadosZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarZona.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosZona .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesZona() {
		return this.jComboBoxTiposArchivosReportesZona;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesZona(
			JComboBox jComboBoxTiposArchivosReportesZona) {
		this.jComboBoxTiposArchivosReportesZona = jComboBoxTiposArchivosReportesZona;
	}

	public void setBorderResaltarTiposArchivosReportesZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarZona.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesZona .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesZona() {
		return this.jComboBoxTiposReportesZona;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesZona(
			JComboBox jComboBoxTiposReportesZona) {
		this.jComboBoxTiposReportesZona = jComboBoxTiposReportesZona;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoZona() {
	//	return jComboBoxTiposReportesDinamicoZona;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoZona(
	//		JComboBox jComboBoxTiposReportesDinamicoZona) {
	//	this.jComboBoxTiposReportesDinamicoZona = jComboBoxTiposReportesDinamicoZona;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoZona() {
	//	return jComboBoxTiposArchivosReportesDinamicoZona;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoZona(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoZona) {
	//	this.jComboBoxTiposArchivosReportesDinamicoZona = jComboBoxTiposArchivosReportesDinamicoZona;
	//}
	
	public void setBorderResaltarTiposReportesZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarZona.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesZona .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesZona() {
		return this.jComboBoxTiposGraficosReportesZona;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesZona(
			JComboBox jComboBoxTiposGraficosReportesZona) {
		this.jComboBoxTiposGraficosReportesZona = jComboBoxTiposGraficosReportesZona;
	}
	
	public void setBorderResaltarTiposGraficosReportesZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarZona.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesZona .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionZona() {
		return this.jComboBoxTiposPaginacionZona;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionZona(
			JComboBox jComboBoxTiposPaginacionZona) {
		this.jComboBoxTiposPaginacionZona = jComboBoxTiposPaginacionZona;
	}
	
	public void setBorderResaltarTiposPaginacionZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarZona.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionZona .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesZona() {
		return this.jComboBoxTiposRelacionesZona;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesZona() {
		return this.jComboBoxTiposAccionesZona;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesZona(
			JComboBox jComboBoxTiposRelacionesZona) {
		this.jComboBoxTiposRelacionesZona = jComboBoxTiposRelacionesZona;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesZona(
			JComboBox jComboBoxTiposAccionesZona) {
		this.jComboBoxTiposAccionesZona = jComboBoxTiposAccionesZona;
	}
	
	public void setBorderResaltarTiposRelacionesZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarZona.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesZona .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesZona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarZona.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesZona .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoZona() {
	//	return jCheckBoxConGraficoDinamicoZona;
	//}

	//public void setjCheckBoxConGraficoDinamicoZona(
	//		JCheckBox jCheckBoxConGraficoDinamicoZona) {
	//	this.jCheckBoxConGraficoDinamicoZona = jCheckBoxConGraficoDinamicoZona;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoZona() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarZona.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoZona .setBorder(borderResaltar);		
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
		this.zonaSessionBean=new ZonaSessionBean();
		
		this.zonaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.zonaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.zonaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ZonaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ZonaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ZonaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ZonaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ZonaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Zona MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
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
		
		ZonaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Zona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarZona= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarZona,this.jTtoolBarZona,
							"nuevo","nuevo","Nuevo"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarZona,this.jTtoolBarZona,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarZona,this.jTtoolBarZona,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarZona,this.jTtoolBarZona,
							"duplicar","duplicar","Duplicar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarZona,this.jTtoolBarZona,
							"copiar","copiar","Copiar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarZona,this.jTtoolBarZona,
							"ver_form","ver_form","Ver"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarZona,this.jTtoolBarZona,
							"recargar","recargar","Recargar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarZona,this.jTtoolBarZona,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarZona,this.jTtoolBarZona,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarZona,this.jTtoolBarZona,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarZona,this.jTtoolBarZona,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarZona,this.jTtoolBarZona,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarZona,this.jTtoolBarZona,
							"cerrar","cerrar","Salir"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarZona=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarZona;
			
				this.jButtonProcesarInformacionToolBarZona=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarZona;
				
		//protected JButton jButtonModificarToolBarZona;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarZona=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuZona=new JMenuMe("General");
		this.jmenuArchivoZona=new JMenuMe("Archivo");
		this.jmenuAccionesZona=new JMenuMe("Acciones");
		this.jmenuDatosZona=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoZona= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoZona.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoZona,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarZona= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarZona.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarZona,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesZona= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesZona.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesZona,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosZona= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosZona.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosZona,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarZona= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarZona.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarZona,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormZona= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormZona.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormZona,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaZona= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaZona.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaZona,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarZona= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarZona.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarZona,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionZona= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionZona.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionZona,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionZona= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionZona.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionZona,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresZona= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresZona.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresZona,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesZona= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesZona.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesZona,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByZona= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByZona.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByZona,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarZona= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarZona.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarZona,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByZona= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByZona.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByZona,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarZona= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarZona.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarZona,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarZona, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosZona= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosZona.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosZona,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoZona.add(this.jMenuItemCerrarZona);
			
			this.jmenuAccionesZona.add(this.jMenuItemNuevoZona);
			this.jmenuAccionesZona.add(this.jMenuItemNuevoGuardarCambiosZona);
			this.jmenuAccionesZona.add(this.jMenuItemNuevoRelacionesZona);
			this.jmenuAccionesZona.add(this.jMenuItemGuardarCambiosTablaZona);		
			this.jmenuAccionesZona.add(this.jMenuItemDuplicarZona);		
			this.jmenuAccionesZona.add(this.jMenuItemCopiarZona);		
			this.jmenuAccionesZona.add(this.jMenuItemVerFormZona);		
			
			this.jmenuDatosZona.add(this.jMenuItemRecargarInformacionZona);				
			this.jmenuDatosZona.add(this.jMenuItemAnterioresZona);				
			this.jmenuDatosZona.add(this.jMenuItemSiguientesZona);				
			this.jmenuDatosZona.add(this.jMenuItemAbrirOrderByZona);				
			this.jmenuDatosZona.add(this.jMenuItemMostrarOcultarZona);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesZona.add(this.jMenuItemGuardarCambiosZona);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoZona, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesZona, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosZona, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarZona.add(this.jmenuArchivoZona);		
			this.jmenuBarZona.add(this.jmenuAccionesZona);		
			this.jmenuBarZona.add(this.jmenuDatosZona);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarZona);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasZona() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreZona=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreZona.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreZona= new JButtonMe();
		this.jButtonBusquedaPorNombreZona.setText("Buscar");
		this.jButtonBusquedaPorNombreZona.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreZona,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreZona, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreZona = new JLabelMe();
		jLabelnombreBusquedaPorNombreZona.setText("Nombre :");
		jLabelnombreBusquedaPorNombreZona.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreZona,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombreZona= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombreZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombreZona,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasZona=new JTabbedPane();


		this.jTabbedPaneBusquedasZona.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasZona.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasZona.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasZona.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasZona,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleZona = new ZonaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Zona DATOS");
			this.jInternalFrameDetalleFormZona = new ZonaDetalleFormJInternalFrame(jDesktopPane,this.zonaSessionBean.getConGuardarRelaciones(),this.zonaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormZona = null;//new ZonaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutZona= new GridBagLayout();
		
		
		this.jTableDatosZona = new JTableMe();      
		
		String sToolTipZona="";
		sToolTipZona=ZonaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipZona+="(Seguridad.Zona)";
		}
		
		if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
			sToolTipZona+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosZona.setToolTipText(sToolTipZona);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosZona);
		this.jTableDatosZona.setAutoCreateRowSorter(true);
		this.jTableDatosZona.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosZona.setRowSelectionAllowed(true);
		this.jTableDatosZona.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosZona,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoZona = new JButtonMe();
		this.jButtonDuplicarZona = new JButtonMe();
		this.jButtonCopiarZona = new JButtonMe();
		this.jButtonVerFormZona = new JButtonMe();
		this.jButtonNuevoRelacionesZona = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaZona = new JButtonMe();
		this.jButtonCerrarZona = new JButtonMe();
		
		this.jScrollPanelDatosZona = new JScrollPane();   
        this.jScrollPanelDatosGeneralZona = new JScrollPane();
		
				
		
		
		this.jPanelAccionesZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Zona";
		
		if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Zonas" + this.sPath));
		} else {
			this.jScrollPanelDatosZona.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesZona.setToolTipText("Acciones");
        this.jPanelAccionesZona.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralZona, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosZona, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoZona=new ReporteDinamicoJInternalFrame(ZonaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoZona();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionZona=new ImportacionJInternalFrame(ZonaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionZona();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByZona = new JButtonMe();
		
		this.jButtonAbrirOrderByZona.setText("Orden");
		this.jButtonAbrirOrderByZona.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByZona,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByZona, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByZona=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByZona,false,this);
			
			//this.cargarOrderByZona(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByZona=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByZona,true,this);
			
			//this.cargarOrderByZona(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosZona.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosZona.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosZona.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosZona.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosZona.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosZona.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoZona.setText("Nuevo");
		this.jButtonDuplicarZona.setText("Duplicar");
		this.jButtonCopiarZona.setText("Copiar");
		this.jButtonVerFormZona.setText("Ver");
		this.jButtonNuevoRelacionesZona.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaZona.setText("Guardar");
		this.jButtonCerrarZona.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoZona,"nuevo_button","Nuevo",this.zonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarZona,"duplicar_button","Duplicar",this.zonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarZona,"copiar_button","Copiar",this.zonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormZona,"ver_form","Ver",this.zonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesZona,"nuevorelaciones_button","Nuevo Rel",this.zonaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaZona,"guardarcambiostabla_button","Guardar",this.zonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarZona,"cerrar_button","Salir",this.zonaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesZona, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoZona.setToolTipText("Nuevo"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarZona.setToolTipText("Duplicar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarZona.setToolTipText("Copiar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormZona.setToolTipText("Ver"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesZona.setToolTipText("Nuevo Rel"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaZona.setToolTipText("Guardar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarZona.setToolTipText("Salir"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoZona";
		inputMap = this.jButtonNuevoZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoZona.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoZona"));
		
		//DUPLICAR
		sMapKey = "DuplicarZona";
		inputMap = this.jButtonDuplicarZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarZona.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarZona"));
		
		//COPIAR
		sMapKey = "CopiarZona";
		inputMap = this.jButtonCopiarZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarZona.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarZona"));
		
		//VEr FORM
		sMapKey = "VerFormZona";
		inputMap = this.jButtonVerFormZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormZona.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormZona"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesZona";
		inputMap = this.jButtonNuevoRelacionesZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesZona"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarZona";
		inputMap = this.jButtonModificarZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarZona"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarZona";
		inputMap = this.jButtonCerrarZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarZona"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaZona";
		inputMap = this.jButtonGuardarCambiosTablaZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaZona"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Zona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Zona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Zona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Zona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Zona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesZona.setName("jPanelParametrosReportesZona"); 
		
		this.jPanelParametrosReportesAccionesZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesZona.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesZona.setName("jPanelParametrosReportesAccionesZona"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesZona, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesZona, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionZona = new JButtonMe();
		this.jButtonRecargarInformacionZona.setText("Recargar");
		this.jButtonRecargarInformacionZona.setToolTipText("Recargar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionZona,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionZona = new JButtonMe();
		this.jButtonProcesarInformacionZona.setText("Procesar");
		this.jButtonProcesarInformacionZona.setToolTipText("Procesar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionZona.setVisible(false);
			
		this.jButtonProcesarInformacionZona.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionZona.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionZona.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesZona = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesZona.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesZona.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesZona = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesZona.setText("TIPO");       
		this.jComboBoxTiposReportesZona.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesZona = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesZona.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesZona.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionZona = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionZona.setText("Paginacion");
		this.jComboBoxTiposPaginacionZona.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesZona = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesZona.setText("Accion");
		this.jComboBoxTiposRelacionesZona.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesZona = new JComboBoxMe();
		//this.jComboBoxTiposAccionesZona.setText("Accion");
		this.jComboBoxTiposAccionesZona.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarZona = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarZona.setText("Accion");
		this.jComboBoxTiposSeleccionarZona.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralZona=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralZona.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralZona.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralZona.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesZona = new JLabelMe();
		
		this.jLabelAccionesZona.setText("Acciones");		
		this.jLabelAccionesZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosZona = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosZona.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosZona.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosZona = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosZona.setText("Seleccionados");
		this.jCheckBoxSeleccionadosZona.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaZona = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaZona.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaZona.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteZona = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteZona.setText("Graf.");
		this.jCheckBoxConGraficoReporteZona.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresZona = new JButtonMe();
		//this.jButtonAnterioresZona.setText("<<");
        this.jButtonAnterioresZona.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresZona,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesZona = new JButtonMe();
		//this.jButtonSiguientesZona.setText(">>");
        this.jButtonSiguientesZona.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesZona,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosZona = new JButtonMe();
		this.jButtonNuevoGuardarCambiosZona.setText("Nue");
        this.jButtonNuevoGuardarCambiosZona.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosZona,"nuevoguardarcambios_button","Nue",this.zonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosZona";
		inputMap = this.jButtonNuevoGuardarCambiosZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosZona"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionZona";
		inputMap = this.jButtonRecargarInformacionZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionZona"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesZona";
		inputMap = this.jButtonSiguientesZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesZona"));
		
		//ANTERIORES		
		sMapKey = "AnterioresZona";
		inputMap = this.jButtonAnterioresZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresZona"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasZona();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesZona.setMinimumSize(new Dimension(this.getWidth(),ZonaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ZonaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesZona.setMaximumSize(new Dimension(this.getWidth(),ZonaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ZonaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesZona.setPreferredSize(new Dimension(this.getWidth(),ZonaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ZonaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionZona = new GridBagLayout();

			this.jPanelPaginacionZona.setLayout(gridaBagLayoutPaginacionZona);						
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.gridy = 0;
			this.gridBagConstraintsZona.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionZona.add(this.jButtonAnterioresZona, this.gridBagConstraintsZona);
					
						
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsZona.gridy = 0;
			
			this.jPanelPaginacionZona.add(this.jButtonNuevoGuardarCambiosZona, this.gridBagConstraintsZona);
						
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsZona.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsZona.gridy = 0;
			this.jPanelPaginacionZona.add(this.jButtonSiguientesZona, this.gridBagConstraintsZona);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.gridy = 1;
			this.gridBagConstraintsZona.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionZona.add(this.jButtonNuevoZona, this.gridBagConstraintsZona);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsZona = new GridBagConstraints();
				this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsZona.gridy = 1;
				this.gridBagConstraintsZona.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionZona.add(this.jButtonNuevoRelacionesZona, this.gridBagConstraintsZona);
			}
			
			
			if(!this.zonaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsZona = new GridBagConstraints();
				this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsZona.gridy = 1;
				this.gridBagConstraintsZona.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionZona.add(this.jButtonGuardarCambiosTablaZona, this.gridBagConstraintsZona);
			}
			
			
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.gridy = 1;
			this.gridBagConstraintsZona.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionZona.add(this.jButtonDuplicarZona, this.gridBagConstraintsZona);
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.gridy = 1;
			this.gridBagConstraintsZona.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionZona.add(this.jButtonCopiarZona, this.gridBagConstraintsZona);
		
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.gridy = 1;
			this.gridBagConstraintsZona.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionZona.add(this.jButtonVerFormZona, this.gridBagConstraintsZona);
		
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.gridy = 1;
			this.gridBagConstraintsZona.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionZona.add(this.jButtonCerrarZona, this.gridBagConstraintsZona);
		
		
		
		this.jButtonRecargarInformacionZona.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionZona.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionZona.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionZona, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesZona.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesZona.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesZona.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesZona.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesZona.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesZona.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesZona.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesZona.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesZona.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionZona.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionZona.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionZona.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesZona.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesZona.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesZona.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesZona.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesZona.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesZona.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarZona.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarZona.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarZona.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaZona.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaZona.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaZona.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteZona.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteZona.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteZona.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteZona, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosZona.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosZona.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosZona.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosZona, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosZona.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosZona.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosZona.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosZona, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesZona = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesZona = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Zona = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Zona = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Zona = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Zona = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesZona.setLayout(gridaBagParametrosReportesZona);
			this.jPanelParametrosReportesAccionesZona.setLayout(gridaBagParametrosReportesAccionesZona);
			
			
			this.jPanelParametrosAuxiliar1Zona.setLayout(gridaBagParametrosAuxiliar1Zona);
			this.jPanelParametrosAuxiliar2Zona.setLayout(gridaBagParametrosAuxiliar2Zona);
			this.jPanelParametrosAuxiliar3Zona.setLayout(gridaBagParametrosAuxiliar3Zona);
			this.jPanelParametrosAuxiliar4Zona.setLayout(gridaBagParametrosAuxiliar4Zona);
			//this.jPanelParametrosAuxiliar5Zona.setLayout(gridaBagParametrosAuxiliar2Zona);			
			
			
			
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsZona.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesZona.add(this.jButtonRecargarInformacionZona, this.gridBagConstraintsZona);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsZona.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsZona.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Zona.add(this.jComboBoxTiposPaginacionZona, this.gridBagConstraintsZona);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsZona.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsZona.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Zona.add(this.jCheckBoxConAltoMaximoTablaZona, this.gridBagConstraintsZona);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsZona.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsZona.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Zona.add(this.jComboBoxTiposArchivosReportesZona, this.gridBagConstraintsZona);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsZona.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesZona.add(this.jPanelParametrosAuxiliar1Zona, this.gridBagConstraintsZona);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsZona.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Zona.add(this.jComboBoxTiposReportesZona, this.gridBagConstraintsZona);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsZona.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesZona.add(this.jPanelParametrosAuxiliar4Zona, this.gridBagConstraintsZona);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsZona.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsZona.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesZona.add(this.jComboBoxTiposReportesZona, this.gridBagConstraintsZona);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsZona.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesZona.add(this.jCheckBoxGenerarReporteZona, this.gridBagConstraintsZona);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsZona.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesZona.add(this.jPanelParametrosAuxiliar2Zona, this.gridBagConstraintsZona);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsZona.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesZona.add(this.jLabelAccionesZona, this.gridBagConstraintsZona);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsZona = new GridBagConstraints();
				this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsZona.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsZona.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesZona.add(this.jButtonAbrirOrderByZona, this.gridBagConstraintsZona);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsZona.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesZona.add(this.jComboBoxTiposSeleccionarZona, this.gridBagConstraintsZona);			
			
			
			/*
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsZona.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesZona.add(this.jCheckBoxSeleccionarTodosZona, this.gridBagConstraintsZona);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsZona.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Zona.add(this.jCheckBoxSeleccionarTodosZona, this.gridBagConstraintsZona);															
				
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsZona.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Zona.add(this.jCheckBoxSeleccionadosZona, this.gridBagConstraintsZona);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsZona.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesZona.add(this.jPanelParametrosAuxiliar3Zona, this.gridBagConstraintsZona);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsZona.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesZona.add(this.jComboBoxTiposRelacionesZona, this.gridBagConstraintsZona);
				
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsZona.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesZona.add(this.jComboBoxTiposAccionesZona, this.gridBagConstraintsZona);
	
				
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsZona.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesZona.add(this.jTextFieldValorCampoGeneralZona, this.gridBagConstraintsZona);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosZona = new GridBagLayout();

			this.jScrollPanelDatosZona.setLayout(gridaBagLayoutDatosZona);
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.gridy = 0;
			this.gridBagConstraintsZona.gridx = 0;
			
			this.jScrollPanelDatosZona.add(this.jTableDatosZona, this.gridBagConstraintsZona);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosZona.setViewportView(this.jTableDatosZona);
		this.jTableDatosZona.setFillsViewportHeight(true);
		this.jTableDatosZona.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesZona= new GridBagLayout();
		this.jPanelAccionesZona.setLayout(gridaBagLayoutAccionesZona);
		
		
		/*	
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsZona.gridy = 0;
		this.gridBagConstraintsZona.gridx = 0;
			
		this.jPanelAccionesZona.add(this.jButtonNuevoZona, this.gridBagConstraintsZona);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreZona= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreZona.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreZona.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreZona.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreZona.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreZona.setLayout(gridaBagLayoutBusquedaPorNombreZona);

		gridBagConstraintsZona = new GridBagConstraints();
		gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
		gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsZona.gridy = 0;
		gridBagConstraintsZona.gridx = 0;
		jPanelBusquedaPorNombreZona.add(jLabelnombreBusquedaPorNombreZona, gridBagConstraintsZona);

		gridBagConstraintsZona = new GridBagConstraints();
		gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
		gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsZona.gridy = 0;
		gridBagConstraintsZona.gridx = 1;
		jPanelBusquedaPorNombreZona.add(jTextFieldnombreBusquedaPorNombreZona, gridBagConstraintsZona);

		gridBagConstraintsZona = new GridBagConstraints();
		gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
		gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsZona.gridy = 1;
		gridBagConstraintsZona.gridx =1;
		jPanelBusquedaPorNombreZona.add(jButtonBusquedaPorNombreZona, gridBagConstraintsZona);

		jTabbedPaneBusquedasZona.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreZona);
		jTabbedPaneBusquedasZona.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutZona = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutZona);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.zonaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsZona = new GridBagConstraints();						
			this.gridBagConstraintsZona.gridy = iGridyPrincipal++;
			this.gridBagConstraintsZona.gridx = 0;		
			//this.gridBagConstraintsZona.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsZona.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarZona, this.gridBagConstraintsZona);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy = iGridyPrincipal++;
		this.gridBagConstraintsZona.gridx = 0;		
		//this.gridBagConstraintsZona.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsZona.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsZona.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsZona);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsZona = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsZona.gridy = iGridyPrincipal++;
			this.gridBagConstraintsZona.gridx = 0;		
			this.gridBagConstraintsZona.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsZona.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasZona, this.gridBagConstraintsZona);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsZona.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesZona, this.gridBagConstraintsZona);								
		
		
		/*
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsZona.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesZona, this.gridBagConstraintsZona);
		*/		
		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy =iGridyPrincipal++;
		this.gridBagConstraintsZona.gridx =0;
		this.gridBagConstraintsZona.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsZona.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosZona, this.gridBagConstraintsZona);
				
		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsZona.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionZona, this.gridBagConstraintsZona);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ZonaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosZona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosZona = new GridBagLayout();
			this.jPanelBusquedasParametrosZona.setLayout(gridaBagLayoutBusquedasParametrosZona);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralZona=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralZona.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralZona.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralZona.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsZona.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposZona, this.gridBagConstraintsZona);
			
			
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsZona.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosZona, this.gridBagConstraintsZona);
		
			
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsZona.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesZona, this.gridBagConstraintsZona);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralZona;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoZona() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoZona = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoZona.setName("jPanelReporteDinamicoZona"); 
		
		this.jPanelReporteDinamicoZona.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoZona.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoZona.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoZona.setLayout(gridaBagLayoutReporteDinamicoZona);
		
		
		this.jInternalFrameReporteDinamicoZona= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoZona = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteZona= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoZona.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoZona.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoZona.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoZona.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoZona.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoZona.setResizable(true);
	    this.jInternalFrameReporteDinamicoZona.setClosable(true);
	    this.jInternalFrameReporteDinamicoZona.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoZona.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoZona.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoZona.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Zonas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteZona = new JLabelMe();

		this.jLabelColumnasSelectReporteZona.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsZona.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsZona.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoZona.add(this.jLabelColumnasSelectReporteZona, this.gridBagConstraintsZona);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteZona = new JList<Reporte>();
		this.jListColumnasSelectReporteZona.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteZona.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteZona.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteZona.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteZona.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteZona=new JScrollPane(this.jListColumnasSelectReporteZona);
			
			this.jScrollColumnasSelectReporteZona.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteZona.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteZona.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteZona.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsZona.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsZona.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoZona.add(this.jListColumnasSelectReporteZona, this.gridBagConstraintsZona);
		this.jPanelReporteDinamicoZona.add(this.jScrollColumnasSelectReporteZona, this.gridBagConstraintsZona);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteZona = new JLabelMe();

		this.jLabelRelacionesSelectReporteZona.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsZona.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsZona.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoZona.add(this.jLabelRelacionesSelectReporteZona, this.gridBagConstraintsZona);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteZona = new JList<Reporte>();
		this.jListRelacionesSelectReporteZona.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteZona.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteZona.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteZona.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteZona.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteZona=new JScrollPane(this.jListRelacionesSelectReporteZona);
			
			this.jScrollRelacionesSelectReporteZona.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteZona.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteZona.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteZona.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsZona.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsZona.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoZona.add(this.jListRelacionesSelectReporteZona, this.gridBagConstraintsZona);
		this.jPanelReporteDinamicoZona.add(this.jScrollRelacionesSelectReporteZona, this.gridBagConstraintsZona);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoZona = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoZona = new JComboBoxMe();
		this.jListColumnasValoresGraficoZona = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoZona = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoZona.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoZona.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoZona.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoZona.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoZona, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoZona = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoZona.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoZona.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoZona.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoZona.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoZona, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoZona = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoZona.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsZona.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsZona.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoZona.add(this.jLabelGenerarExcelReporteDinamicoZona, this.gridBagConstraintsZona);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoZona = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoZona.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoZona,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoZona.setToolTipText("Generar EXCEL"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsZona = new GridBagConstraints();
		//this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsZona.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsZona.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoZona.add(this.jButtonGenerarExcelReporteDinamicoZona, this.gridBagConstraintsZona);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsZona.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsZona.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoZona.add(this.jComboBoxTiposReportesDinamicoZona, this.gridBagConstraintsZona);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoZona = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoZona.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsZona.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsZona.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoZona.add(this.jLabelTiposArchivoReporteDinamicoZona, this.gridBagConstraintsZona);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsZona.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsZona.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoZona.add(this.jComboBoxTiposArchivosReportesDinamicoZona, this.gridBagConstraintsZona);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoZona = new JButtonMe();
		this.jButtonGenerarReporteDinamicoZona.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoZona,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoZona.setToolTipText("Generar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsZona.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsZona.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoZona.add(this.jButtonGenerarReporteDinamicoZona, this.gridBagConstraintsZona);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoZona = new JButtonMe();
		this.jButtonCerrarReporteDinamicoZona.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoZona,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoZona.setToolTipText("Cancelar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsZona.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsZona.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoZona.add(this.jButtonCerrarReporteDinamicoZona, this.gridBagConstraintsZona);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalZona = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoZona= new JScrollPane(jPanelReporteDinamicoZona,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoZona.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoZona.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoZona.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Zonas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsZona.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsZona.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoZona.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoZona.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalZona);
		this.jInternalFrameReporteDinamicoZona.getContentPane().add(this.jScrollPanelReporteDinamicoZona, this.gridBagConstraintsZona);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionZona() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionZona = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionZona.setName("jPanelImportacionZona"); 
		
		this.jPanelImportacionZona.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionZona.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionZona.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionZona.setLayout(gridaBagLayoutImportacionZona);
		
		
		this.jInternalFrameImportacionZona= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionZona= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionZona = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteZona= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionZona.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionZona.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionZona.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionZona.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionZona.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionZona.setResizable(true);
	    this.jInternalFrameImportacionZona.setClosable(true);
	    this.jInternalFrameImportacionZona.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionZona.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionZona.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionZona.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionZona.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionZona.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionZona.setResizable(true);
	    this.jInternalFrameImportacionZona.setClosable(true);
	    this.jInternalFrameImportacionZona.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionZona.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionZona.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionZona.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Zonas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionZona = new JLabelMe();

		this.jLabelArchivoImportacionZona.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsZona.gridy = iPosYImportacion;		
		this.gridBagConstraintsZona.gridx = iPosXImportacion++;
			
		this.jPanelImportacionZona.add(this.jLabelArchivoImportacionZona, this.gridBagConstraintsZona);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionZona = new JFileChooser();		
		this.jFileChooserImportacionZona.setToolTipText("ESCOGER ARCHIVO"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionZona = new JButtonMe();
		this.jButtonAbrirImportacionZona.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionZona,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionZona.setToolTipText("Generar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsZona.gridy = iPosYImportacion;
		this.gridBagConstraintsZona.gridx = iPosXImportacion++;
							
		this.jPanelImportacionZona.add(this.jButtonAbrirImportacionZona, this.gridBagConstraintsZona);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionZona = new JLabelMe();

		this.jLabelPathArchivoImportacionZona.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsZona.gridy = iPosYImportacion;		
		this.gridBagConstraintsZona.gridx = iPosXImportacion++;
			
		this.jPanelImportacionZona.add(this.jLabelPathArchivoImportacionZona, this.gridBagConstraintsZona);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionZona=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionZona.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionZona.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionZona.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsZona.gridy = iPosYImportacion;
		this.gridBagConstraintsZona.gridx = iPosXImportacion++;
							
		this.jPanelImportacionZona.add(this.jTextFieldPathArchivoImportacionZona, this.gridBagConstraintsZona);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionZona = new JButtonMe();
		this.jButtonGenerarImportacionZona.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionZona,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionZona.setToolTipText("Generar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsZona.gridy = iPosYImportacion;
		this.gridBagConstraintsZona.gridx = iPosXImportacion++;
							
		this.jPanelImportacionZona.add(this.jButtonGenerarImportacionZona, this.gridBagConstraintsZona);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionZona = new JButtonMe();
		this.jButtonCerrarImportacionZona.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionZona,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionZona.setToolTipText("Cancelar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsZona.gridy = iPosYImportacion;
		this.gridBagConstraintsZona.gridx = iPosXImportacion++;
							
		this.jPanelImportacionZona.add(this.jButtonCerrarImportacionZona, this.gridBagConstraintsZona);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalZona = new GridBagLayout();
		
		this.jScrollPanelImportacionZona= new JScrollPane(jPanelImportacionZona,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy =iPosYImportacion;
		this.gridBagConstraintsZona.gridx =iPosXImportacion;
		this.gridBagConstraintsZona.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionZona.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionZona.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalZona);
		this.jInternalFrameImportacionZona.getContentPane().add(this.jScrollPanelImportacionZona, this.gridBagConstraintsZona);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByZona(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByZona = new JButtonMe();
			this.jButtonAbrirOrderByZona.setText("Orden");
			this.jButtonAbrirOrderByZona.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByZona,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByZona";
			inputMap = this.jButtonAbrirOrderByZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByZona"));
		
		
			GridBagLayout gridaBagLayoutOrderByZona = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByZona.setName("jPanelOrderByZona"); 
			
			this.jPanelOrderByZona.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByZona.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByZona.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByZona.setLayout(gridaBagLayoutOrderByZona);
			
			
			this.jTableDatosZonaOrderBy = new JTableMe();        
			this.jTableDatosZonaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosZonaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosZonaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosZonaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosZonaOrderBy.setViewportView(this.jTableDatosZonaOrderBy);
			this.jTableDatosZonaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosZonaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByZona= new OrderByJInternalFrame();
			this.jInternalFrameOrderByZona= new OrderByJInternalFrame();
			this.jScrollPanelOrderByZona = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteZona= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByZona.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByZona.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByZona.setTitle("Orden");
			this.jInternalFrameOrderByZona.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByZona.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByZona.setResizable(true);
			this.jInternalFrameOrderByZona.setClosable(true);
			this.jInternalFrameOrderByZona.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByZona.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByZona.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByZona.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Zonas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.gridy =iPosYOrderBy++;
			this.gridBagConstraintsZona.gridx =iPosXOrderBy;
			this.gridBagConstraintsZona.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsZona.ipady =150;
				
			this.jPanelOrderByZona.add(jScrollPanelDatosZonaOrderBy, this.gridBagConstraintsZona);//this.jTableDatosZonaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByZona = new JButtonMe();
			this.jButtonCerrarOrderByZona.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByZona,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByZona.setToolTipText("Cancelar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.gridy = iPosYOrderBy++;
			this.gridBagConstraintsZona.gridx = iPosXOrderBy;
									
			this.jPanelOrderByZona.add(this.jButtonCerrarOrderByZona, this.gridBagConstraintsZona);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalZona = new GridBagLayout();
			
			this.jScrollPanelOrderByZona= new JScrollPane(jPanelOrderByZona,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.gridy =iPosYOrderBy;
			this.gridBagConstraintsZona.gridx =iPosXOrderBy;
			this.gridBagConstraintsZona.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByZona.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByZona.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalZona);
			
			this.jInternalFrameOrderByZona.getContentPane().add(this.jScrollPanelOrderByZona, this.gridBagConstraintsZona);			
		
		} else {
			this.jButtonAbrirOrderByZona = new JButtonMe();
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
		int iWidthTableCalculado=0;//1330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=600;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.zonaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosZona.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosZona.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosZona.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosZona.getRowHeight();//ZonaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.zonaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ZonaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaZona.isSelected()) {
					iHeightTable=ZonaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ZonaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ZonaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ZonaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaZona.isSelected()) {
					iHeightTable=ZonaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ZonaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ZonaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosZona.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosZona.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosZona.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosZona.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosZona.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosZona.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByZona!=null && this.jInternalFrameOrderByZona.getjTableDatosOrderBy()!=null) {
			//if(!this.zonaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByZona.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByZona.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByZona.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByZona.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByZona.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByZona.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByZona.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosZona.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosZona.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosZona.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=zonaLogic.getZonas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=zonas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Zona> TraerZonaBeans(List<Zona> zonas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Zona zona:zonas) {
					
				if(!(ZonaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ZonaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					zona.setsDetalleGeneralEntityReporte(ZonaConstantesFunciones.getZonaDescripcion(zona));
										
						
					
					

					if(zona.getPresupuestoVentasLineass()!=null && Funciones.existeClass(classes,PresupuestoVentasLineas.class)) {
						try{zona.setpresupuestoventaslineassDescripcionReporte(new JRBeanCollectionDataSource(PresupuestoVentasLineasJInternalFrame.TraerPresupuestoVentasLineasBeans(zona.getPresupuestoVentasLineass(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(zona.getVendedors()!=null && Funciones.existeClass(classes,Vendedor.class)) {
						try{zona.setvendedorsDescripcionReporte(new JRBeanCollectionDataSource(VendedorJInternalFrame.TraerVendedorBeans(zona.getVendedors(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(zona.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{zona.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(zona.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(zona.getSubClientes()!=null && Funciones.existeClass(classes,SubCliente.class)) {
						try{zona.setsubclientesDescripcionReporte(new JRBeanCollectionDataSource(SubClienteJInternalFrame.TraerSubClienteBeans(zona.getSubClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(zona.getPresupuestoVentass()!=null && Funciones.existeClass(classes,PresupuestoVentas.class)) {
						try{zona.setpresupuestoventassDescripcionReporte(new JRBeanCollectionDataSource(PresupuestoVentasJInternalFrame.TraerPresupuestoVentasBeans(zona.getPresupuestoVentass(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(zona.getVendedorZonas()!=null && Funciones.existeClass(classes,VendedorZona.class)) {
						try{zona.setvendedorzonasDescripcionReporte(new JRBeanCollectionDataSource(VendedorZonaJInternalFrame.TraerVendedorZonaBeans(zona.getVendedorZonas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//zona.setsDetalleGeneralEntityReporte(zona.getsDetalleGeneralEntityReporte());
										
				}
				
				//zonabeans.add(zonabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return zonas;
    }
	//PARA REPORTES FIN
}
