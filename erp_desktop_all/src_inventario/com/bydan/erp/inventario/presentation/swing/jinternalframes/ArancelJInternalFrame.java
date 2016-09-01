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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;

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
import com.bydan.erp.inventario.util.ArancelConstantesFunciones;

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
public class ArancelJInternalFrame extends ArancelBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarArancel;
	
	protected JMenuBar jmenuBarArancel;
	
	protected JMenu jmenuArancel;
	protected JMenu jmenuDatosArancel;
	protected JMenu jmenuArchivoArancel;
	protected JMenu jmenuAccionesArancel;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosArancel = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutArancel;	
	protected GridBagConstraints gridBagConstraintsArancel;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ArancelDetalleFormJInternalFrame jInternalFrameDetalleFormArancel;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoArancel;	
	protected ImportacionJInternalFrame jInternalFrameImportacionArancel;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ArancelSessionBean arancelSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Arancel> arancels;		
	public List<Arancel> arancelsEliminados;	
	public List<Arancel> arancelsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByArancel;		
	protected JButton jButtonAbrirOrderByArancel;
	
	
	//protected JPanel jPanelOrderByArancel;
	//public JScrollPane jScrollPanelOrderByArancel;	
	//protected JButton jButtonCerrarOrderByArancel;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ArancelLogic arancelLogic;
	
	
	
	public JScrollPane jScrollPanelDatosArancel;
	public JScrollPane jScrollPanelDatosEdicionArancel;
	public JScrollPane jScrollPanelDatosGeneralArancel;
    
	
	
	//public JScrollPane jScrollPanelDatosArancelOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoArancel;
	//public JScrollPane jScrollPanelImportacionArancel;
	
	
	
	protected JPanel jPanelAccionesArancel;
	
    protected JPanel jPanelPaginacionArancel;
    protected JPanel jPanelParametrosReportesArancel;
	protected JPanel jPanelParametrosReportesAccionesArancel;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Arancel;
	protected JPanel jPanelParametrosAuxiliar2Arancel;
	protected JPanel jPanelParametrosAuxiliar3Arancel;
	protected JPanel jPanelParametrosAuxiliar4Arancel;
	//protected JPanel jPanelParametrosAuxiliar5Arancel;
	
	
	
	//protected JPanel jPanelReporteDinamicoArancel;
	//protected JPanel jPanelImportacionArancel;
	
	
	public JTable jTableDatosArancel;
	
	
	
	//public JTable jTableDatosArancelOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoArancel;
	protected JButton jButtonDuplicarArancel;
	protected JButton jButtonCopiarArancel;
	protected JButton jButtonVerFormArancel;
	protected JButton jButtonNuevoRelacionesArancel;
	protected JButton jButtonModificarArancel;
	
    protected JButton jButtonGuardarCambiosTablaArancel;
	protected JButton jButtonCerrarArancel;
	
	
	protected JButton jButtonRecargarInformacionArancel;
	protected JButton jButtonProcesarInformacionArancel;
	
	
	protected JButton jButtonAnterioresArancel;
	protected JButton jButtonSiguientesArancel;
	protected JButton jButtonNuevoGuardarCambiosArancel;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoArancel;
	//protected JButton jButtonCerrarReporteDinamicoArancel;
	//protected JButton jButtonGenerarExcelReporteDinamicoArancel;	
	
	
	
	//protected JButton jButtonAbrirImportacionArancel;
	//protected JButton jButtonGenerarImportacionArancel;
	//protected JButton jButtonCerrarImportacionArancel;
	//protected JFileChooser jFileChooserImportacionArancel;
	//protected File fileImportacionArancel;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarArancel;
	protected JButton jButtonDuplicarToolBarArancel;
	protected JButton jButtonNuevoRelacionesToolBarArancel;
	
	
	public JButton jButtonGuardarCambiosToolBarArancel;
	protected JButton jButtonCopiarToolBarArancel;
	protected JButton jButtonVerFormToolBarArancel;
	public JButton jButtonGuardarCambiosTablaToolBarArancel;
	protected JButton jButtonMostrarOcultarTablaToolBarArancel;
	protected JButton jButtonCerrarToolBarArancel;
	
	protected JButton jButtonRecargarInformacionToolBarArancel;
	protected JButton jButtonProcesarInformacionToolBarArancel;
	protected JButton jButtonAnterioresToolBarArancel;
	protected JButton jButtonSiguientesToolBarArancel;
	protected JButton jButtonNuevoGuardarCambiosToolBarArancel;
	protected JButton jButtonAbrirOrderByToolBarArancel;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoArancel;
	protected JMenuItem jMenuItemDuplicarArancel;
	protected JMenuItem jMenuItemNuevoRelacionesArancel;
	
	
	protected JMenuItem jMenuItemGuardarCambiosArancel;
	protected JMenuItem jMenuItemCopiarArancel;
	protected JMenuItem jMenuItemVerFormArancel;
	protected JMenuItem jMenuItemGuardarCambiosTablaArancel;
	protected JMenuItem jMenuItemCerrarArancel;
	protected JMenuItem jMenuItemDetalleCerrarArancel;
	protected JMenuItem jMenuItemDetalleAbrirOrderByArancel;
	protected JMenuItem jMenuItemDetalleMostarOcultarArancel;
	
	protected JMenuItem jMenuItemRecargarInformacionArancel;
	protected JMenuItem jMenuItemProcesarInformacionArancel;
	protected JMenuItem jMenuItemAnterioresArancel;
	protected JMenuItem jMenuItemSiguientesArancel;
	protected JMenuItem jMenuItemNuevoGuardarCambiosArancel;
	protected JMenuItem jMenuItemAbrirOrderByArancel;
	protected JMenuItem jMenuItemMostrarOcultarArancel;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesArancel;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosArancel;
	protected JCheckBox jCheckBoxSeleccionadosArancel;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaArancel;
	protected JCheckBox jCheckBoxConGraficoReporteArancel;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesArancel;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesArancel;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoArancel;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoArancel;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesArancel;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionArancel;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesArancel;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesArancel;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarArancel;
	protected JTextField jTextFieldValorCampoGeneralArancel;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteArancel;
	//public JList<Reporte> jListColumnasSelectReporteArancel;
	//public JScrollPane jScrollColumnasSelectReporteArancel;
	
	//public JLabel jLabelRelacionesSelectReporteArancel;
	//public JList<Reporte> jListRelacionesSelectReporteArancel;
	//public JScrollPane jScrollRelacionesSelectReporteArancel;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoArancel;
	//protected JCheckBox jCheckBoxConGraficoDinamicoArancel;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoArancel;
	//public JLabel jLabelTiposArchivoReporteDinamicoArancel;
	
		
	//public JLabel jLabelArchivoImportacionArancel;	
	//public JLabel jLabelPathArchivoImportacionArancel;
	//protected JTextField jTextFieldPathArchivoImportacionArancel;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoArancel;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoArancel;
	
	//public JLabel jLabelColumnaCategoriaValorArancel;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorArancel;
	
	//public JLabel jLabelColumnasValoresGraficoArancel;
	//public JList<Reporte> jListColumnasValoresGraficoArancel;
	//public JScrollPane jScrollColumnasValoresGraficoArancel;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoArancel;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoArancel;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasArancel;
	public JPanel jPanelBusquedaPorCodigoArancel;
	public JButton jButtonBusquedaPorCodigoArancel;
	public JPanel jPanelBusquedaPorNombreArancel;
	public JButton jButtonBusquedaPorNombreArancel;
	
	public JPanel jPanelcodigoBusquedaPorCodigoArancel;
	public JLabel jLabelcodigoBusquedaPorCodigoArancel;
	public JTextField jTextFieldcodigoBusquedaPorCodigoArancel;
	public JButton jButtoncodigoBusquedaPorCodigoArancelBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreArancel;
	public JLabel jLabelnombreBusquedaPorNombreArancel;
	public JTextArea jTextAreanombreBusquedaPorNombreArancel;
	public JButton jButtonnombreBusquedaPorNombreArancelBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ArancelJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Arancel No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ArancelJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Arancel No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ArancelJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Arancel No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ArancelJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Arancel No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionArancel)	{
		this.jButtonRecargarInformacionArancel = jButtonRecargarInformacionArancel;
	}
	
	public JButton getjButtonProcesarInformacionArancel() {
		return this.jButtonProcesarInformacionArancel;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionArancel)	{
		this.jButtonProcesarInformacionArancel = jButtonProcesarInformacionArancel;
	}
	
	
	public JButton getjButtonRecargarInformacionArancel() {
		return this.jButtonRecargarInformacionArancel;
	}
	
	
	public List<Arancel> getarancels() {
		return this.arancels;
	}

	public void setarancels(List<Arancel> arancels) {
		this.arancels = arancels;
	}
	
	public List<Arancel> getarancelsAux() {
		return this.arancelsAux;
	}

	public void setarancelsAux(List<Arancel> arancelsAux) {
		this.arancelsAux = arancelsAux;
	}
	
	public List<Arancel> getarancelsEliminados() {
		return this.arancelsEliminados;
	}

	public void setArancelsEliminados(List<Arancel> arancelsEliminados) {
		this.arancelsEliminados = arancelsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarArancel() {
		return jComboBoxTiposSeleccionarArancel;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarArancel(
			JComboBox jComboBoxTiposSeleccionarArancel) {
		this.jComboBoxTiposSeleccionarArancel = jComboBoxTiposSeleccionarArancel;
	}
	
	public void setBorderResaltarTiposSeleccionarArancel() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarArancel.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarArancel .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralArancel() {
		return jTextFieldValorCampoGeneralArancel;
	}

	public void setjTextFieldValorCampoGeneralArancel(
			JTextField jTextFieldValorCampoGeneralArancel) {
		this.jTextFieldValorCampoGeneralArancel = jTextFieldValorCampoGeneralArancel;
	}

	public void setBorderResaltarValorCampoGeneralArancel() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArancel.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralArancel .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosArancel() {
		return this.jCheckBoxSeleccionarTodosArancel;
	}

	public void setjCheckBoxSeleccionarTodosArancel(
			JCheckBox jCheckBoxSeleccionarTodosArancel) {
		this.jCheckBoxSeleccionarTodosArancel = jCheckBoxSeleccionarTodosArancel;
	}

	public void setBorderResaltarSeleccionarTodosArancel() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArancel.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosArancel .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosArancel() {
		return this.jCheckBoxSeleccionadosArancel;
	}

	public void setjCheckBoxSeleccionadosArancel(
			JCheckBox jCheckBoxSeleccionadosArancel) {
		this.jCheckBoxSeleccionadosArancel = jCheckBoxSeleccionadosArancel;
	}
	
	public void setBorderResaltarSeleccionadosArancel() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArancel.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosArancel .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesArancel() {
		return this.jComboBoxTiposArchivosReportesArancel;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesArancel(
			JComboBox jComboBoxTiposArchivosReportesArancel) {
		this.jComboBoxTiposArchivosReportesArancel = jComboBoxTiposArchivosReportesArancel;
	}

	public void setBorderResaltarTiposArchivosReportesArancel() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArancel.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesArancel .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesArancel() {
		return this.jComboBoxTiposReportesArancel;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesArancel(
			JComboBox jComboBoxTiposReportesArancel) {
		this.jComboBoxTiposReportesArancel = jComboBoxTiposReportesArancel;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoArancel() {
	//	return jComboBoxTiposReportesDinamicoArancel;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoArancel(
	//		JComboBox jComboBoxTiposReportesDinamicoArancel) {
	//	this.jComboBoxTiposReportesDinamicoArancel = jComboBoxTiposReportesDinamicoArancel;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoArancel() {
	//	return jComboBoxTiposArchivosReportesDinamicoArancel;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoArancel(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoArancel) {
	//	this.jComboBoxTiposArchivosReportesDinamicoArancel = jComboBoxTiposArchivosReportesDinamicoArancel;
	//}
	
	public void setBorderResaltarTiposReportesArancel() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArancel.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesArancel .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesArancel() {
		return this.jComboBoxTiposGraficosReportesArancel;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesArancel(
			JComboBox jComboBoxTiposGraficosReportesArancel) {
		this.jComboBoxTiposGraficosReportesArancel = jComboBoxTiposGraficosReportesArancel;
	}
	
	public void setBorderResaltarTiposGraficosReportesArancel() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArancel.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesArancel .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionArancel() {
		return this.jComboBoxTiposPaginacionArancel;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionArancel(
			JComboBox jComboBoxTiposPaginacionArancel) {
		this.jComboBoxTiposPaginacionArancel = jComboBoxTiposPaginacionArancel;
	}
	
	public void setBorderResaltarTiposPaginacionArancel() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArancel.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionArancel .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesArancel() {
		return this.jComboBoxTiposRelacionesArancel;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesArancel() {
		return this.jComboBoxTiposAccionesArancel;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesArancel(
			JComboBox jComboBoxTiposRelacionesArancel) {
		this.jComboBoxTiposRelacionesArancel = jComboBoxTiposRelacionesArancel;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesArancel(
			JComboBox jComboBoxTiposAccionesArancel) {
		this.jComboBoxTiposAccionesArancel = jComboBoxTiposAccionesArancel;
	}
	
	public void setBorderResaltarTiposRelacionesArancel() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArancel.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesArancel .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesArancel() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarArancel.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesArancel .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoArancel() {
	//	return jCheckBoxConGraficoDinamicoArancel;
	//}

	//public void setjCheckBoxConGraficoDinamicoArancel(
	//		JCheckBox jCheckBoxConGraficoDinamicoArancel) {
	//	this.jCheckBoxConGraficoDinamicoArancel = jCheckBoxConGraficoDinamicoArancel;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoArancel() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarArancel.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoArancel .setBorder(borderResaltar);		
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
		this.arancelSessionBean=new ArancelSessionBean();
		
		this.arancelSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.arancelSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.arancelSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ArancelJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ArancelJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ArancelJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ArancelJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ArancelJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Arancel MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
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
		
		ArancelJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Arancel No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarArancel= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarArancel,this.jTtoolBarArancel,
							"nuevo","nuevo","Nuevo"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarArancel,this.jTtoolBarArancel,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarArancel,this.jTtoolBarArancel,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarArancel,this.jTtoolBarArancel,
							"duplicar","duplicar","Duplicar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarArancel,this.jTtoolBarArancel,
							"copiar","copiar","Copiar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarArancel,this.jTtoolBarArancel,
							"ver_form","ver_form","Ver"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarArancel,this.jTtoolBarArancel,
							"recargar","recargar","Recargar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarArancel,this.jTtoolBarArancel,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarArancel,this.jTtoolBarArancel,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarArancel,this.jTtoolBarArancel,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarArancel,this.jTtoolBarArancel,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarArancel,this.jTtoolBarArancel,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarArancel,this.jTtoolBarArancel,
							"cerrar","cerrar","Salir"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarArancel=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarArancel;
			
				this.jButtonProcesarInformacionToolBarArancel=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarArancel;
				
		//protected JButton jButtonModificarToolBarArancel;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarArancel=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuArancel=new JMenuMe("General");
		this.jmenuArchivoArancel=new JMenuMe("Archivo");
		this.jmenuAccionesArancel=new JMenuMe("Acciones");
		this.jmenuDatosArancel=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoArancel= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoArancel.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoArancel,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarArancel= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarArancel.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarArancel,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesArancel= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesArancel.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesArancel,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosArancel= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosArancel.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosArancel,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarArancel= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarArancel.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarArancel,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormArancel= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormArancel.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormArancel,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaArancel= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaArancel.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaArancel,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarArancel= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarArancel.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarArancel,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionArancel= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionArancel.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionArancel,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionArancel= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionArancel.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionArancel,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresArancel= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresArancel.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresArancel,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesArancel= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesArancel.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesArancel,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByArancel= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByArancel.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByArancel,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarArancel= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarArancel.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarArancel,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByArancel= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByArancel.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByArancel,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarArancel= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarArancel.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarArancel,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosArancel= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosArancel.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosArancel,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoArancel.add(this.jMenuItemCerrarArancel);
			
			this.jmenuAccionesArancel.add(this.jMenuItemNuevoArancel);
			this.jmenuAccionesArancel.add(this.jMenuItemNuevoGuardarCambiosArancel);
			this.jmenuAccionesArancel.add(this.jMenuItemNuevoRelacionesArancel);
			this.jmenuAccionesArancel.add(this.jMenuItemGuardarCambiosTablaArancel);		
			this.jmenuAccionesArancel.add(this.jMenuItemDuplicarArancel);		
			this.jmenuAccionesArancel.add(this.jMenuItemCopiarArancel);		
			this.jmenuAccionesArancel.add(this.jMenuItemVerFormArancel);		
			
			this.jmenuDatosArancel.add(this.jMenuItemRecargarInformacionArancel);				
			this.jmenuDatosArancel.add(this.jMenuItemAnterioresArancel);				
			this.jmenuDatosArancel.add(this.jMenuItemSiguientesArancel);				
			this.jmenuDatosArancel.add(this.jMenuItemAbrirOrderByArancel);				
			this.jmenuDatosArancel.add(this.jMenuItemMostrarOcultarArancel);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesArancel.add(this.jMenuItemGuardarCambiosArancel);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoArancel, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesArancel, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosArancel, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarArancel.add(this.jmenuArchivoArancel);		
			this.jmenuBarArancel.add(this.jmenuAccionesArancel);		
			this.jmenuBarArancel.add(this.jmenuDatosArancel);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarArancel);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasArancel() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoArancel=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoArancel.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoArancel= new JButtonMe();
		this.jButtonBusquedaPorCodigoArancel.setText("Buscar");
		this.jButtonBusquedaPorCodigoArancel.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoArancel,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoArancel = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoArancel.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoArancel.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoArancel,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoArancel= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoArancel,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreArancel=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreArancel.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreArancel= new JButtonMe();
		this.jButtonBusquedaPorNombreArancel.setText("Buscar");
		this.jButtonBusquedaPorNombreArancel.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreArancel,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreArancel = new JLabelMe();
		jLabelnombreBusquedaPorNombreArancel.setText("Nombre :");
		jLabelnombreBusquedaPorNombreArancel.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreArancel,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreArancel= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreArancel,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasArancel=new JTabbedPane();


		this.jTabbedPaneBusquedasArancel.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasArancel.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasArancel.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasArancel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasArancel,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleArancel = new ArancelDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Arancel DATOS");
			this.jInternalFrameDetalleFormArancel = new ArancelDetalleFormJInternalFrame(jDesktopPane,this.arancelSessionBean.getConGuardarRelaciones(),this.arancelSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormArancel = null;//new ArancelDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutArancel= new GridBagLayout();
		
		
		this.jTableDatosArancel = new JTableMe();      
		
		String sToolTipArancel="";
		sToolTipArancel=ArancelConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipArancel+="(Inventario.Arancel)";
		}
		
		if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
			sToolTipArancel+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosArancel.setToolTipText(sToolTipArancel);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosArancel);
		this.jTableDatosArancel.setAutoCreateRowSorter(true);
		this.jTableDatosArancel.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosArancel.setRowSelectionAllowed(true);
		this.jTableDatosArancel.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosArancel,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoArancel = new JButtonMe();
		this.jButtonDuplicarArancel = new JButtonMe();
		this.jButtonCopiarArancel = new JButtonMe();
		this.jButtonVerFormArancel = new JButtonMe();
		this.jButtonNuevoRelacionesArancel = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaArancel = new JButtonMe();
		this.jButtonCerrarArancel = new JButtonMe();
		
		this.jScrollPanelDatosArancel = new JScrollPane();   
        this.jScrollPanelDatosGeneralArancel = new JScrollPane();
		
				
		
		
		this.jPanelAccionesArancel = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Arancel";
		
		if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Aranceles" + this.sPath));
		} else {
			this.jScrollPanelDatosArancel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesArancel.setToolTipText("Acciones");
        this.jPanelAccionesArancel.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralArancel, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosArancel, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoArancel=new ReporteDinamicoJInternalFrame(ArancelConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoArancel();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionArancel=new ImportacionJInternalFrame(ArancelConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionArancel();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByArancel = new JButtonMe();
		
		this.jButtonAbrirOrderByArancel.setText("Orden");
		this.jButtonAbrirOrderByArancel.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByArancel,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByArancel.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByArancel=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByArancel,false,this);
			
			//this.cargarOrderByArancel(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByArancel=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByArancel,true,this);
			
			//this.cargarOrderByArancel(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosArancel.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosArancel.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosArancel.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosArancel.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosArancel.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosArancel.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoArancel.setText("Nuevo");
		this.jButtonDuplicarArancel.setText("Duplicar");
		this.jButtonCopiarArancel.setText("Copiar");
		this.jButtonVerFormArancel.setText("Ver");
		this.jButtonNuevoRelacionesArancel.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaArancel.setText("Guardar");
		this.jButtonCerrarArancel.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoArancel,"nuevo_button","Nuevo",this.arancelSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarArancel,"duplicar_button","Duplicar",this.arancelSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarArancel,"copiar_button","Copiar",this.arancelSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormArancel,"ver_form","Ver",this.arancelSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesArancel,"nuevorelaciones_button","Nuevo Rel",this.arancelSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaArancel,"guardarcambiostabla_button","Guardar",this.arancelSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarArancel,"cerrar_button","Salir",this.arancelSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesArancel, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoArancel.setToolTipText("Nuevo"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarArancel.setToolTipText("Duplicar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarArancel.setToolTipText("Copiar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormArancel.setToolTipText("Ver"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesArancel.setToolTipText("Nuevo Rel"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaArancel.setToolTipText("Guardar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarArancel.setToolTipText("Salir"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoArancel";
		inputMap = this.jButtonNuevoArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoArancel.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoArancel"));
		
		//DUPLICAR
		sMapKey = "DuplicarArancel";
		inputMap = this.jButtonDuplicarArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarArancel.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarArancel"));
		
		//COPIAR
		sMapKey = "CopiarArancel";
		inputMap = this.jButtonCopiarArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarArancel.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarArancel"));
		
		//VEr FORM
		sMapKey = "VerFormArancel";
		inputMap = this.jButtonVerFormArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormArancel.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormArancel"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesArancel";
		inputMap = this.jButtonNuevoRelacionesArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesArancel.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesArancel"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarArancel";
		inputMap = this.jButtonModificarArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarArancel.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarArancel"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarArancel";
		inputMap = this.jButtonCerrarArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarArancel.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarArancel"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaArancel";
		inputMap = this.jButtonGuardarCambiosTablaArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaArancel.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaArancel"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesArancel = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesArancel = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionArancel = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Arancel= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Arancel= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Arancel= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Arancel= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Arancel= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesArancel.setName("jPanelParametrosReportesArancel"); 
		
		this.jPanelParametrosReportesAccionesArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesArancel.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesArancel.setName("jPanelParametrosReportesAccionesArancel"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesArancel, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesArancel, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionArancel = new JButtonMe();
		this.jButtonRecargarInformacionArancel.setText("Recargar");
		this.jButtonRecargarInformacionArancel.setToolTipText("Recargar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionArancel,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionArancel = new JButtonMe();
		this.jButtonProcesarInformacionArancel.setText("Procesar");
		this.jButtonProcesarInformacionArancel.setToolTipText("Procesar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionArancel.setVisible(false);
			
		this.jButtonProcesarInformacionArancel.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionArancel.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionArancel.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesArancel = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesArancel.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesArancel.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesArancel = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesArancel.setText("TIPO");       
		this.jComboBoxTiposReportesArancel.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesArancel = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesArancel.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesArancel.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionArancel = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionArancel.setText("Paginacion");
		this.jComboBoxTiposPaginacionArancel.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesArancel = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesArancel.setText("Accion");
		this.jComboBoxTiposRelacionesArancel.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesArancel = new JComboBoxMe();
		//this.jComboBoxTiposAccionesArancel.setText("Accion");
		this.jComboBoxTiposAccionesArancel.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarArancel = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarArancel.setText("Accion");
		this.jComboBoxTiposSeleccionarArancel.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralArancel=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralArancel.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralArancel.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralArancel.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesArancel = new JLabelMe();
		
		this.jLabelAccionesArancel.setText("Acciones");		
		this.jLabelAccionesArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosArancel = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosArancel.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosArancel.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosArancel = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosArancel.setText("Seleccionados");
		this.jCheckBoxSeleccionadosArancel.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaArancel = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaArancel.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaArancel.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteArancel = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteArancel.setText("Graf.");
		this.jCheckBoxConGraficoReporteArancel.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresArancel = new JButtonMe();
		//this.jButtonAnterioresArancel.setText("<<");
        this.jButtonAnterioresArancel.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresArancel,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesArancel = new JButtonMe();
		//this.jButtonSiguientesArancel.setText(">>");
        this.jButtonSiguientesArancel.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesArancel,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosArancel = new JButtonMe();
		this.jButtonNuevoGuardarCambiosArancel.setText("Nue");
        this.jButtonNuevoGuardarCambiosArancel.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosArancel,"nuevoguardarcambios_button","Nue",this.arancelSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosArancel";
		inputMap = this.jButtonNuevoGuardarCambiosArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosArancel.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosArancel"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionArancel";
		inputMap = this.jButtonRecargarInformacionArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionArancel.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionArancel"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesArancel";
		inputMap = this.jButtonSiguientesArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesArancel.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesArancel"));
		
		//ANTERIORES		
		sMapKey = "AnterioresArancel";
		inputMap = this.jButtonAnterioresArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresArancel.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresArancel"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasArancel();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesArancel.setMinimumSize(new Dimension(this.getWidth(),ArancelBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ArancelBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesArancel.setMaximumSize(new Dimension(this.getWidth(),ArancelBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ArancelBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesArancel.setPreferredSize(new Dimension(this.getWidth(),ArancelBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ArancelBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionArancel = new GridBagLayout();

			this.jPanelPaginacionArancel.setLayout(gridaBagLayoutPaginacionArancel);						
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy = 0;
			this.gridBagConstraintsArancel.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionArancel.add(this.jButtonAnterioresArancel, this.gridBagConstraintsArancel);
					
						
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsArancel.gridy = 0;
			
			this.jPanelPaginacionArancel.add(this.jButtonNuevoGuardarCambiosArancel, this.gridBagConstraintsArancel);
						
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsArancel.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsArancel.gridy = 0;
			this.jPanelPaginacionArancel.add(this.jButtonSiguientesArancel, this.gridBagConstraintsArancel);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy = 1;
			this.gridBagConstraintsArancel.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionArancel.add(this.jButtonNuevoArancel, this.gridBagConstraintsArancel);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsArancel = new GridBagConstraints();
				this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsArancel.gridy = 1;
				this.gridBagConstraintsArancel.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionArancel.add(this.jButtonNuevoRelacionesArancel, this.gridBagConstraintsArancel);
			}
			
			
			if(!this.arancelSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsArancel = new GridBagConstraints();
				this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsArancel.gridy = 1;
				this.gridBagConstraintsArancel.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionArancel.add(this.jButtonGuardarCambiosTablaArancel, this.gridBagConstraintsArancel);
			}
			
			
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy = 1;
			this.gridBagConstraintsArancel.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionArancel.add(this.jButtonDuplicarArancel, this.gridBagConstraintsArancel);
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy = 1;
			this.gridBagConstraintsArancel.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionArancel.add(this.jButtonCopiarArancel, this.gridBagConstraintsArancel);
		
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy = 1;
			this.gridBagConstraintsArancel.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionArancel.add(this.jButtonVerFormArancel, this.gridBagConstraintsArancel);
		
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy = 1;
			this.gridBagConstraintsArancel.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionArancel.add(this.jButtonCerrarArancel, this.gridBagConstraintsArancel);
		
		
		
		this.jButtonRecargarInformacionArancel.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionArancel.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionArancel.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionArancel, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesArancel.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesArancel.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesArancel.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesArancel.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesArancel.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesArancel.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesArancel.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesArancel.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesArancel.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionArancel.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionArancel.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionArancel.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesArancel.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesArancel.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesArancel.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesArancel.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesArancel.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesArancel.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarArancel.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarArancel.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarArancel.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaArancel.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaArancel.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaArancel.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteArancel.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteArancel.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteArancel.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteArancel, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosArancel.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosArancel.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosArancel.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosArancel.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosArancel.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosArancel.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesArancel = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesArancel = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Arancel = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Arancel = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Arancel = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Arancel = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesArancel.setLayout(gridaBagParametrosReportesArancel);
			this.jPanelParametrosReportesAccionesArancel.setLayout(gridaBagParametrosReportesAccionesArancel);
			
			
			this.jPanelParametrosAuxiliar1Arancel.setLayout(gridaBagParametrosAuxiliar1Arancel);
			this.jPanelParametrosAuxiliar2Arancel.setLayout(gridaBagParametrosAuxiliar2Arancel);
			this.jPanelParametrosAuxiliar3Arancel.setLayout(gridaBagParametrosAuxiliar3Arancel);
			this.jPanelParametrosAuxiliar4Arancel.setLayout(gridaBagParametrosAuxiliar4Arancel);
			//this.jPanelParametrosAuxiliar5Arancel.setLayout(gridaBagParametrosAuxiliar2Arancel);			
			
			
			
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsArancel.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesArancel.add(this.jButtonRecargarInformacionArancel, this.gridBagConstraintsArancel);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArancel.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsArancel.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Arancel.add(this.jComboBoxTiposPaginacionArancel, this.gridBagConstraintsArancel);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArancel.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsArancel.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Arancel.add(this.jCheckBoxConAltoMaximoTablaArancel, this.gridBagConstraintsArancel);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArancel.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsArancel.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Arancel.add(this.jComboBoxTiposArchivosReportesArancel, this.gridBagConstraintsArancel);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArancel.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArancel.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesArancel.add(this.jPanelParametrosAuxiliar1Arancel, this.gridBagConstraintsArancel);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsArancel.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Arancel.add(this.jComboBoxTiposReportesArancel, this.gridBagConstraintsArancel);																		
			
			
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsArancel.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Arancel.add(this.jComboBoxTiposGraficosReportesArancel, this.gridBagConstraintsArancel);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArancel.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArancel.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesArancel.add(this.jPanelParametrosAuxiliar4Arancel, this.gridBagConstraintsArancel);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArancel.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsArancel.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesArancel.add(this.jComboBoxTiposReportesArancel, this.gridBagConstraintsArancel);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArancel.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArancel.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesArancel.add(this.jCheckBoxGenerarReporteArancel, this.gridBagConstraintsArancel);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArancel.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArancel.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesArancel.add(this.jPanelParametrosAuxiliar2Arancel, this.gridBagConstraintsArancel);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsArancel.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesArancel.add(this.jLabelAccionesArancel, this.gridBagConstraintsArancel);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsArancel = new GridBagConstraints();
				this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsArancel.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsArancel.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesArancel.add(this.jButtonAbrirOrderByArancel, this.gridBagConstraintsArancel);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsArancel.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArancel.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesArancel.add(this.jComboBoxTiposSeleccionarArancel, this.gridBagConstraintsArancel);			
			
			
			/*
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsArancel.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesArancel.add(this.jCheckBoxSeleccionarTodosArancel, this.gridBagConstraintsArancel);
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsArancel.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesArancel.add(this.jCheckBoxConGraficoReporteArancel, this.gridBagConstraintsArancel);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsArancel.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Arancel.add(this.jCheckBoxSeleccionarTodosArancel, this.gridBagConstraintsArancel);															
				
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsArancel.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Arancel.add(this.jCheckBoxSeleccionadosArancel, this.gridBagConstraintsArancel);															
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsArancel.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Arancel.add(this.jCheckBoxConGraficoReporteArancel, this.gridBagConstraintsArancel);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsArancel.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArancel.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesArancel.add(this.jPanelParametrosAuxiliar3Arancel, this.gridBagConstraintsArancel);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArancel.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesArancel.add(this.jComboBoxTiposRelacionesArancel, this.gridBagConstraintsArancel);
				
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArancel.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesArancel.add(this.jComboBoxTiposAccionesArancel, this.gridBagConstraintsArancel);
	
				
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsArancel.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesArancel.add(this.jTextFieldValorCampoGeneralArancel, this.gridBagConstraintsArancel);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosArancel = new GridBagLayout();

			this.jScrollPanelDatosArancel.setLayout(gridaBagLayoutDatosArancel);
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy = 0;
			this.gridBagConstraintsArancel.gridx = 0;
			
			this.jScrollPanelDatosArancel.add(this.jTableDatosArancel, this.gridBagConstraintsArancel);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosArancel.setViewportView(this.jTableDatosArancel);
		this.jTableDatosArancel.setFillsViewportHeight(true);
		this.jTableDatosArancel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesArancel= new GridBagLayout();
		this.jPanelAccionesArancel.setLayout(gridaBagLayoutAccionesArancel);
		
		
		/*	
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArancel.gridy = 0;
		this.gridBagConstraintsArancel.gridx = 0;
			
		this.jPanelAccionesArancel.add(this.jButtonNuevoArancel, this.gridBagConstraintsArancel);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoArancel= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoArancel.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoArancel.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoArancel.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoArancel.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoArancel.setLayout(gridaBagLayoutBusquedaPorCodigoArancel);

		gridBagConstraintsArancel = new GridBagConstraints();
		gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
		gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsArancel.gridy = 0;
		gridBagConstraintsArancel.gridx = 0;
		jPanelBusquedaPorCodigoArancel.add(jLabelcodigoBusquedaPorCodigoArancel, gridBagConstraintsArancel);

		gridBagConstraintsArancel = new GridBagConstraints();
		gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
		gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsArancel.gridy = 0;
		gridBagConstraintsArancel.gridx = 1;
		jPanelBusquedaPorCodigoArancel.add(jTextFieldcodigoBusquedaPorCodigoArancel, gridBagConstraintsArancel);

		gridBagConstraintsArancel = new GridBagConstraints();
		gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
		gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsArancel.gridy = 1;
		gridBagConstraintsArancel.gridx =1;
		jPanelBusquedaPorCodigoArancel.add(jButtonBusquedaPorCodigoArancel, gridBagConstraintsArancel);

		jTabbedPaneBusquedasArancel.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoArancel);
		jTabbedPaneBusquedasArancel.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreArancel= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreArancel.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreArancel.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreArancel.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreArancel.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreArancel.setLayout(gridaBagLayoutBusquedaPorNombreArancel);

		gridBagConstraintsArancel = new GridBagConstraints();
		gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
		gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsArancel.gridy = 0;
		gridBagConstraintsArancel.gridx = 0;
		jPanelBusquedaPorNombreArancel.add(jLabelnombreBusquedaPorNombreArancel, gridBagConstraintsArancel);

		gridBagConstraintsArancel = new GridBagConstraints();
		gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
		gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsArancel.gridy = 0;
		gridBagConstraintsArancel.gridx = 1;
		jPanelBusquedaPorNombreArancel.add(jTextAreanombreBusquedaPorNombreArancel, gridBagConstraintsArancel);

		gridBagConstraintsArancel = new GridBagConstraints();
		gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
		gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsArancel.gridy = 1;
		gridBagConstraintsArancel.gridx =1;
		jPanelBusquedaPorNombreArancel.add(jButtonBusquedaPorNombreArancel, gridBagConstraintsArancel);

		jTabbedPaneBusquedasArancel.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreArancel);
		jTabbedPaneBusquedasArancel.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutArancel = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutArancel);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.arancelSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsArancel = new GridBagConstraints();						
			this.gridBagConstraintsArancel.gridy = iGridyPrincipal++;
			this.gridBagConstraintsArancel.gridx = 0;		
			//this.gridBagConstraintsArancel.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsArancel.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarArancel, this.gridBagConstraintsArancel);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy = iGridyPrincipal++;
		this.gridBagConstraintsArancel.gridx = 0;		
		//this.gridBagConstraintsArancel.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArancel.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsArancel.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsArancel);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsArancel.gridy = iGridyPrincipal++;
			this.gridBagConstraintsArancel.gridx = 0;		
			this.gridBagConstraintsArancel.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsArancel.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasArancel, this.gridBagConstraintsArancel);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsArancel.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesArancel, this.gridBagConstraintsArancel);								
		
		
		/*
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsArancel.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesArancel, this.gridBagConstraintsArancel);
		*/		
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy =iGridyPrincipal++;
		this.gridBagConstraintsArancel.gridx =0;
		this.gridBagConstraintsArancel.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsArancel.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosArancel, this.gridBagConstraintsArancel);
				
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsArancel.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionArancel, this.gridBagConstraintsArancel);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ArancelJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosArancel= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosArancel = new GridBagLayout();
			this.jPanelBusquedasParametrosArancel.setLayout(gridaBagLayoutBusquedasParametrosArancel);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralArancel=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralArancel.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralArancel.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralArancel.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsArancel.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposArancel, this.gridBagConstraintsArancel);
			
			
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsArancel.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosArancel, this.gridBagConstraintsArancel);
		
			
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsArancel.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesArancel, this.gridBagConstraintsArancel);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralArancel;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoArancel() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoArancel = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoArancel = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoArancel.setName("jPanelReporteDinamicoArancel"); 
		
		this.jPanelReporteDinamicoArancel.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoArancel.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoArancel.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoArancel.setLayout(gridaBagLayoutReporteDinamicoArancel);
		
		
		this.jInternalFrameReporteDinamicoArancel= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoArancel = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteArancel= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoArancel.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoArancel.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoArancel.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoArancel.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoArancel.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoArancel.setResizable(true);
	    this.jInternalFrameReporteDinamicoArancel.setClosable(true);
	    this.jInternalFrameReporteDinamicoArancel.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoArancel.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoArancel.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoArancel.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Aranceles"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteArancel = new JLabelMe();

		this.jLabelColumnasSelectReporteArancel.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoArancel.add(this.jLabelColumnasSelectReporteArancel, this.gridBagConstraintsArancel);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteArancel = new JList<Reporte>();
		this.jListColumnasSelectReporteArancel.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteArancel.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteArancel.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteArancel.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteArancel.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteArancel=new JScrollPane(this.jListColumnasSelectReporteArancel);
			
			this.jScrollColumnasSelectReporteArancel.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteArancel.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteArancel.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoArancel.add(this.jListColumnasSelectReporteArancel, this.gridBagConstraintsArancel);
		this.jPanelReporteDinamicoArancel.add(this.jScrollColumnasSelectReporteArancel, this.gridBagConstraintsArancel);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteArancel = new JLabelMe();

		this.jLabelRelacionesSelectReporteArancel.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoArancel.add(this.jLabelRelacionesSelectReporteArancel, this.gridBagConstraintsArancel);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteArancel = new JList<Reporte>();
		this.jListRelacionesSelectReporteArancel.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteArancel.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteArancel.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteArancel.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteArancel.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteArancel=new JScrollPane(this.jListRelacionesSelectReporteArancel);
			
			this.jScrollRelacionesSelectReporteArancel.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteArancel.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteArancel.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoArancel.add(this.jListRelacionesSelectReporteArancel, this.gridBagConstraintsArancel);
		this.jPanelReporteDinamicoArancel.add(this.jScrollRelacionesSelectReporteArancel, this.gridBagConstraintsArancel);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoArancel = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoArancel = new JComboBoxMe();
		this.jListColumnasValoresGraficoArancel = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoArancel = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoArancel.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoArancel.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoArancel.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoArancel.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoArancel = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoArancel.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoArancel.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoArancel.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoArancel.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoArancel = new JLabelMe();

		this.jLabelConGraficoDinamicoArancel.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoArancel.add(this.jLabelConGraficoDinamicoArancel, this.gridBagConstraintsArancel);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoArancel = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoArancel.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoArancel.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoArancel.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoArancel.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoArancel.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoArancel.add(this.jCheckBoxConGraficoDinamicoArancel, this.gridBagConstraintsArancel);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoArancel = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoArancel.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoArancel.add(this.jLabelColumnaCategoriaGraficoArancel, this.gridBagConstraintsArancel);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoArancel = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoArancel.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoArancel.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoArancel.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoArancel.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoArancel.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoArancel.add(this.jComboBoxColumnaCategoriaGraficoArancel, this.gridBagConstraintsArancel);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorArancel = new JLabelMe();

		this.jLabelColumnaCategoriaValorArancel.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoArancel.add(this.jLabelColumnaCategoriaValorArancel, this.gridBagConstraintsArancel);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorArancel = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorArancel.setText("Accion");
        this.jComboBoxColumnaCategoriaValorArancel.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorArancel.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorArancel.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorArancel.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoArancel.add(this.jComboBoxColumnaCategoriaValorArancel, this.gridBagConstraintsArancel);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoArancel = new JLabelMe();

		this.jLabelColumnasValoresGraficoArancel.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoArancel.add(this.jLabelColumnasValoresGraficoArancel, this.gridBagConstraintsArancel);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoArancel = new JList<Reporte>();
		this.jListColumnasValoresGraficoArancel.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoArancel.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoArancel.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoArancel.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoArancel.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoArancel=new JScrollPane(this.jListColumnasValoresGraficoArancel);
			
			this.jScrollColumnasValoresGraficoArancel.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoArancel.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoArancel.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoArancel.add(this.jListColumnasSelectReporteArancel, this.gridBagConstraintsArancel);
		this.jPanelReporteDinamicoArancel.add(this.jScrollColumnasValoresGraficoArancel, this.gridBagConstraintsArancel);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoArancel = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoArancel.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoArancel.add(this.jLabelTiposGraficosReportesDinamicoArancel, this.gridBagConstraintsArancel);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoArancel = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoArancel.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoArancel.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoArancel.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoArancel.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoArancel.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoArancel.add(this.jComboBoxTiposGraficosReportesDinamicoArancel, this.gridBagConstraintsArancel);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoArancel = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoArancel.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoArancel.add(this.jLabelGenerarExcelReporteDinamicoArancel, this.gridBagConstraintsArancel);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoArancel = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoArancel.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoArancel,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoArancel.setToolTipText("Generar EXCEL"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsArancel = new GridBagConstraints();
		//this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoArancel.add(this.jButtonGenerarExcelReporteDinamicoArancel, this.gridBagConstraintsArancel);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoArancel.add(this.jComboBoxTiposReportesDinamicoArancel, this.gridBagConstraintsArancel);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoArancel = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoArancel.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoArancel.add(this.jLabelTiposArchivoReporteDinamicoArancel, this.gridBagConstraintsArancel);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoArancel.add(this.jComboBoxTiposArchivosReportesDinamicoArancel, this.gridBagConstraintsArancel);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoArancel = new JButtonMe();
		this.jButtonGenerarReporteDinamicoArancel.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoArancel,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoArancel.setToolTipText("Generar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoArancel.add(this.jButtonGenerarReporteDinamicoArancel, this.gridBagConstraintsArancel);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoArancel = new JButtonMe();
		this.jButtonCerrarReporteDinamicoArancel.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoArancel,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoArancel.setToolTipText("Cancelar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArancel.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsArancel.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoArancel.add(this.jButtonCerrarReporteDinamicoArancel, this.gridBagConstraintsArancel);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalArancel = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoArancel= new JScrollPane(jPanelReporteDinamicoArancel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoArancel.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoArancel.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoArancel.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Aranceles"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsArancel.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsArancel.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoArancel.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoArancel.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalArancel);
		this.jInternalFrameReporteDinamicoArancel.getContentPane().add(this.jScrollPanelReporteDinamicoArancel, this.gridBagConstraintsArancel);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionArancel() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionArancel = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionArancel = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionArancel.setName("jPanelImportacionArancel"); 
		
		this.jPanelImportacionArancel.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionArancel.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionArancel.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionArancel.setLayout(gridaBagLayoutImportacionArancel);
		
		
		this.jInternalFrameImportacionArancel= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionArancel= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionArancel = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteArancel= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionArancel.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionArancel.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionArancel.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionArancel.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionArancel.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionArancel.setResizable(true);
	    this.jInternalFrameImportacionArancel.setClosable(true);
	    this.jInternalFrameImportacionArancel.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionArancel.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionArancel.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionArancel.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionArancel.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionArancel.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionArancel.setResizable(true);
	    this.jInternalFrameImportacionArancel.setClosable(true);
	    this.jInternalFrameImportacionArancel.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionArancel.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionArancel.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionArancel.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Aranceles"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionArancel = new JLabelMe();

		this.jLabelArchivoImportacionArancel.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYImportacion;		
		this.gridBagConstraintsArancel.gridx = iPosXImportacion++;
			
		this.jPanelImportacionArancel.add(this.jLabelArchivoImportacionArancel, this.gridBagConstraintsArancel);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionArancel = new JFileChooser();		
		this.jFileChooserImportacionArancel.setToolTipText("ESCOGER ARCHIVO"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionArancel = new JButtonMe();
		this.jButtonAbrirImportacionArancel.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionArancel,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionArancel.setToolTipText("Generar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArancel.gridy = iPosYImportacion;
		this.gridBagConstraintsArancel.gridx = iPosXImportacion++;
							
		this.jPanelImportacionArancel.add(this.jButtonAbrirImportacionArancel, this.gridBagConstraintsArancel);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionArancel = new JLabelMe();

		this.jLabelPathArchivoImportacionArancel.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = iPosYImportacion;		
		this.gridBagConstraintsArancel.gridx = iPosXImportacion++;
			
		this.jPanelImportacionArancel.add(this.jLabelPathArchivoImportacionArancel, this.gridBagConstraintsArancel);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionArancel=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionArancel.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionArancel.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionArancel.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArancel.gridy = iPosYImportacion;
		this.gridBagConstraintsArancel.gridx = iPosXImportacion++;
							
		this.jPanelImportacionArancel.add(this.jTextFieldPathArchivoImportacionArancel, this.gridBagConstraintsArancel);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionArancel = new JButtonMe();
		this.jButtonGenerarImportacionArancel.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionArancel,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionArancel.setToolTipText("Generar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArancel.gridy = iPosYImportacion;
		this.gridBagConstraintsArancel.gridx = iPosXImportacion++;
							
		this.jPanelImportacionArancel.add(this.jButtonGenerarImportacionArancel, this.gridBagConstraintsArancel);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionArancel = new JButtonMe();
		this.jButtonCerrarImportacionArancel.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionArancel,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionArancel.setToolTipText("Cancelar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArancel.gridy = iPosYImportacion;
		this.gridBagConstraintsArancel.gridx = iPosXImportacion++;
							
		this.jPanelImportacionArancel.add(this.jButtonCerrarImportacionArancel, this.gridBagConstraintsArancel);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalArancel = new GridBagLayout();
		
		this.jScrollPanelImportacionArancel= new JScrollPane(jPanelImportacionArancel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy =iPosYImportacion;
		this.gridBagConstraintsArancel.gridx =iPosXImportacion;
		this.gridBagConstraintsArancel.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionArancel.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionArancel.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalArancel);
		this.jInternalFrameImportacionArancel.getContentPane().add(this.jScrollPanelImportacionArancel, this.gridBagConstraintsArancel);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByArancel(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByArancel = new JButtonMe();
			this.jButtonAbrirOrderByArancel.setText("Orden");
			this.jButtonAbrirOrderByArancel.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByArancel,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByArancel";
			inputMap = this.jButtonAbrirOrderByArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByArancel.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByArancel"));
		
		
			GridBagLayout gridaBagLayoutOrderByArancel = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByArancel = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByArancel.setName("jPanelOrderByArancel"); 
			
			this.jPanelOrderByArancel.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByArancel.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByArancel.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByArancel.setLayout(gridaBagLayoutOrderByArancel);
			
			
			this.jTableDatosArancelOrderBy = new JTableMe();        
			this.jTableDatosArancelOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosArancelOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosArancelOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosArancelOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosArancelOrderBy.setViewportView(this.jTableDatosArancelOrderBy);
			this.jTableDatosArancelOrderBy.setFillsViewportHeight(true);
			this.jTableDatosArancelOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByArancel= new OrderByJInternalFrame();
			this.jInternalFrameOrderByArancel= new OrderByJInternalFrame();
			this.jScrollPanelOrderByArancel = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteArancel= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByArancel.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByArancel.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByArancel.setTitle("Orden");
			this.jInternalFrameOrderByArancel.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByArancel.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByArancel.setResizable(true);
			this.jInternalFrameOrderByArancel.setClosable(true);
			this.jInternalFrameOrderByArancel.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByArancel.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByArancel.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByArancel.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Aranceles"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.gridy =iPosYOrderBy++;
			this.gridBagConstraintsArancel.gridx =iPosXOrderBy;
			this.gridBagConstraintsArancel.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsArancel.ipady =150;
				
			this.jPanelOrderByArancel.add(jScrollPanelDatosArancelOrderBy, this.gridBagConstraintsArancel);//this.jTableDatosArancelTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByArancel = new JButtonMe();
			this.jButtonCerrarOrderByArancel.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByArancel,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByArancel.setToolTipText("Cancelar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.gridy = iPosYOrderBy++;
			this.gridBagConstraintsArancel.gridx = iPosXOrderBy;
									
			this.jPanelOrderByArancel.add(this.jButtonCerrarOrderByArancel, this.gridBagConstraintsArancel);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalArancel = new GridBagLayout();
			
			this.jScrollPanelOrderByArancel= new JScrollPane(jPanelOrderByArancel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.gridy =iPosYOrderBy;
			this.gridBagConstraintsArancel.gridx =iPosXOrderBy;
			this.gridBagConstraintsArancel.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByArancel.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByArancel.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalArancel);
			
			this.jInternalFrameOrderByArancel.getContentPane().add(this.jScrollPanelOrderByArancel, this.gridBagConstraintsArancel);			
		
		} else {
			this.jButtonAbrirOrderByArancel = new JButtonMe();
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
		int iWidthTableCalculado=0;//1430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.arancelSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosArancel.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosArancel.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosArancel.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosArancel.getRowHeight();//ArancelConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.arancelSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ArancelConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaArancel.isSelected()) {
					iHeightTable=ArancelConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ArancelConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ArancelConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ArancelConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaArancel.isSelected()) {
					iHeightTable=ArancelConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ArancelConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ArancelConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosArancel.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosArancel.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosArancel.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosArancel.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosArancel.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosArancel.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByArancel!=null && this.jInternalFrameOrderByArancel.getjTableDatosOrderBy()!=null) {
			//if(!this.arancelSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByArancel.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByArancel.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByArancel.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByArancel.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByArancel.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByArancel.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByArancel.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosArancel.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosArancel.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosArancel.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=arancelLogic.getArancels().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=arancels.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Arancel> TraerArancelBeans(List<Arancel> arancels,ArrayList<Classe> classes)throws Exception {
		try {
			for(Arancel arancel:arancels) {
					
				if(!(ArancelConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ArancelConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					arancel.setsDetalleGeneralEntityReporte(ArancelConstantesFunciones.getArancelDescripcion(arancel));
										
						
					
					

					if(arancel.getProductos()!=null && Funciones.existeClass(classes,Producto.class)) {
						try{arancel.setproductosDescripcionReporte(new JRBeanCollectionDataSource(ProductoJInternalFrame.TraerProductoBeans(arancel.getProductos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(arancel.getDetallePedidoCompraImpors()!=null && Funciones.existeClass(classes,DetallePedidoCompraImpor.class)) {
						try{arancel.setdetallepedidocompraimporsDescripcionReporte(new JRBeanCollectionDataSource(DetallePedidoCompraImporJInternalFrame.TraerDetallePedidoCompraImporBeans(arancel.getDetallePedidoCompraImpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//arancel.setsDetalleGeneralEntityReporte(arancel.getsDetalleGeneralEntityReporte());
										
				}
				
				//arancelbeans.add(arancelbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return arancels;
    }
	//PARA REPORTES FIN
}
