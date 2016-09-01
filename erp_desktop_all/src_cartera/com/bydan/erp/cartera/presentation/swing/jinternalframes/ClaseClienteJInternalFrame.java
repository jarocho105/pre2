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

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.cartera.util.ClaseClienteConstantesFunciones;

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
public class ClaseClienteJInternalFrame extends ClaseClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarClaseCliente;
	
	protected JMenuBar jmenuBarClaseCliente;
	
	protected JMenu jmenuClaseCliente;
	protected JMenu jmenuDatosClaseCliente;
	protected JMenu jmenuArchivoClaseCliente;
	protected JMenu jmenuAccionesClaseCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosClaseCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutClaseCliente;	
	protected GridBagConstraints gridBagConstraintsClaseCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ClaseClienteDetalleFormJInternalFrame jInternalFrameDetalleFormClaseCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoClaseCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionClaseCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ClaseClienteSessionBean claseclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ClaseCliente> claseclientes;		
	public List<ClaseCliente> claseclientesEliminados;	
	public List<ClaseCliente> claseclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByClaseCliente;		
	protected JButton jButtonAbrirOrderByClaseCliente;
	
	
	//protected JPanel jPanelOrderByClaseCliente;
	//public JScrollPane jScrollPanelOrderByClaseCliente;	
	//protected JButton jButtonCerrarOrderByClaseCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ClaseClienteLogic claseclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosClaseCliente;
	public JScrollPane jScrollPanelDatosEdicionClaseCliente;
	public JScrollPane jScrollPanelDatosGeneralClaseCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosClaseClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoClaseCliente;
	//public JScrollPane jScrollPanelImportacionClaseCliente;
	
	
	
	protected JPanel jPanelAccionesClaseCliente;
	
    protected JPanel jPanelPaginacionClaseCliente;
    protected JPanel jPanelParametrosReportesClaseCliente;
	protected JPanel jPanelParametrosReportesAccionesClaseCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ClaseCliente;
	protected JPanel jPanelParametrosAuxiliar2ClaseCliente;
	protected JPanel jPanelParametrosAuxiliar3ClaseCliente;
	protected JPanel jPanelParametrosAuxiliar4ClaseCliente;
	//protected JPanel jPanelParametrosAuxiliar5ClaseCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoClaseCliente;
	//protected JPanel jPanelImportacionClaseCliente;
	
	
	public JTable jTableDatosClaseCliente;
	
	
	
	//public JTable jTableDatosClaseClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoClaseCliente;
	protected JButton jButtonDuplicarClaseCliente;
	protected JButton jButtonCopiarClaseCliente;
	protected JButton jButtonVerFormClaseCliente;
	protected JButton jButtonNuevoRelacionesClaseCliente;
	protected JButton jButtonModificarClaseCliente;
	
    protected JButton jButtonGuardarCambiosTablaClaseCliente;
	protected JButton jButtonCerrarClaseCliente;
	
	
	protected JButton jButtonRecargarInformacionClaseCliente;
	protected JButton jButtonProcesarInformacionClaseCliente;
	
	
	protected JButton jButtonAnterioresClaseCliente;
	protected JButton jButtonSiguientesClaseCliente;
	protected JButton jButtonNuevoGuardarCambiosClaseCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoClaseCliente;
	//protected JButton jButtonCerrarReporteDinamicoClaseCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoClaseCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionClaseCliente;
	//protected JButton jButtonGenerarImportacionClaseCliente;
	//protected JButton jButtonCerrarImportacionClaseCliente;
	//protected JFileChooser jFileChooserImportacionClaseCliente;
	//protected File fileImportacionClaseCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarClaseCliente;
	protected JButton jButtonDuplicarToolBarClaseCliente;
	protected JButton jButtonNuevoRelacionesToolBarClaseCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarClaseCliente;
	protected JButton jButtonCopiarToolBarClaseCliente;
	protected JButton jButtonVerFormToolBarClaseCliente;
	public JButton jButtonGuardarCambiosTablaToolBarClaseCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarClaseCliente;
	protected JButton jButtonCerrarToolBarClaseCliente;
	
	protected JButton jButtonRecargarInformacionToolBarClaseCliente;
	protected JButton jButtonProcesarInformacionToolBarClaseCliente;
	protected JButton jButtonAnterioresToolBarClaseCliente;
	protected JButton jButtonSiguientesToolBarClaseCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarClaseCliente;
	protected JButton jButtonAbrirOrderByToolBarClaseCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoClaseCliente;
	protected JMenuItem jMenuItemDuplicarClaseCliente;
	protected JMenuItem jMenuItemNuevoRelacionesClaseCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosClaseCliente;
	protected JMenuItem jMenuItemCopiarClaseCliente;
	protected JMenuItem jMenuItemVerFormClaseCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaClaseCliente;
	protected JMenuItem jMenuItemCerrarClaseCliente;
	protected JMenuItem jMenuItemDetalleCerrarClaseCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByClaseCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarClaseCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionClaseCliente;
	protected JMenuItem jMenuItemProcesarInformacionClaseCliente;
	protected JMenuItem jMenuItemAnterioresClaseCliente;
	protected JMenuItem jMenuItemSiguientesClaseCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosClaseCliente;
	protected JMenuItem jMenuItemAbrirOrderByClaseCliente;
	protected JMenuItem jMenuItemMostrarOcultarClaseCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesClaseCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosClaseCliente;
	protected JCheckBox jCheckBoxSeleccionadosClaseCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaClaseCliente;
	protected JCheckBox jCheckBoxConGraficoReporteClaseCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesClaseCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesClaseCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoClaseCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoClaseCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesClaseCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionClaseCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesClaseCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesClaseCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarClaseCliente;
	protected JTextField jTextFieldValorCampoGeneralClaseCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteClaseCliente;
	//public JList<Reporte> jListColumnasSelectReporteClaseCliente;
	//public JScrollPane jScrollColumnasSelectReporteClaseCliente;
	
	//public JLabel jLabelRelacionesSelectReporteClaseCliente;
	//public JList<Reporte> jListRelacionesSelectReporteClaseCliente;
	//public JScrollPane jScrollRelacionesSelectReporteClaseCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoClaseCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoClaseCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoClaseCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoClaseCliente;
	
		
	//public JLabel jLabelArchivoImportacionClaseCliente;	
	//public JLabel jLabelPathArchivoImportacionClaseCliente;
	//protected JTextField jTextFieldPathArchivoImportacionClaseCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoClaseCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoClaseCliente;
	
	//public JLabel jLabelColumnaCategoriaValorClaseCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorClaseCliente;
	
	//public JLabel jLabelColumnasValoresGraficoClaseCliente;
	//public JList<Reporte> jListColumnasValoresGraficoClaseCliente;
	//public JScrollPane jScrollColumnasValoresGraficoClaseCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoClaseCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoClaseCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasClaseCliente;
	public JPanel jPanelBusquedaPorCodigoClaseCliente;
	public JButton jButtonBusquedaPorCodigoClaseCliente;
	public JPanel jPanelBusquedaPorNombreClaseCliente;
	public JButton jButtonBusquedaPorNombreClaseCliente;
	
	public JPanel jPanelcodigoBusquedaPorCodigoClaseCliente;
	public JLabel jLabelcodigoBusquedaPorCodigoClaseCliente;
	public JTextField jTextFieldcodigoBusquedaPorCodigoClaseCliente;
	public JButton jButtoncodigoBusquedaPorCodigoClaseClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreClaseCliente;
	public JLabel jLabelnombreBusquedaPorNombreClaseCliente;
	public JTextArea jTextAreanombreBusquedaPorNombreClaseCliente;
	public JButton jButtonnombreBusquedaPorNombreClaseClienteBusqueda= new JButtonMe();

	
	
	
	
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
	public ClaseClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ClaseCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClaseClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClaseCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClaseClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClaseCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClaseClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ClaseCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionClaseCliente)	{
		this.jButtonRecargarInformacionClaseCliente = jButtonRecargarInformacionClaseCliente;
	}
	
	public JButton getjButtonProcesarInformacionClaseCliente() {
		return this.jButtonProcesarInformacionClaseCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionClaseCliente)	{
		this.jButtonProcesarInformacionClaseCliente = jButtonProcesarInformacionClaseCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionClaseCliente() {
		return this.jButtonRecargarInformacionClaseCliente;
	}
	
	
	public List<ClaseCliente> getclaseclientes() {
		return this.claseclientes;
	}

	public void setclaseclientes(List<ClaseCliente> claseclientes) {
		this.claseclientes = claseclientes;
	}
	
	public List<ClaseCliente> getclaseclientesAux() {
		return this.claseclientesAux;
	}

	public void setclaseclientesAux(List<ClaseCliente> claseclientesAux) {
		this.claseclientesAux = claseclientesAux;
	}
	
	public List<ClaseCliente> getclaseclientesEliminados() {
		return this.claseclientesEliminados;
	}

	public void setClaseClientesEliminados(List<ClaseCliente> claseclientesEliminados) {
		this.claseclientesEliminados = claseclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarClaseCliente() {
		return jComboBoxTiposSeleccionarClaseCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarClaseCliente(
			JComboBox jComboBoxTiposSeleccionarClaseCliente) {
		this.jComboBoxTiposSeleccionarClaseCliente = jComboBoxTiposSeleccionarClaseCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarClaseCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarClaseCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarClaseCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralClaseCliente() {
		return jTextFieldValorCampoGeneralClaseCliente;
	}

	public void setjTextFieldValorCampoGeneralClaseCliente(
			JTextField jTextFieldValorCampoGeneralClaseCliente) {
		this.jTextFieldValorCampoGeneralClaseCliente = jTextFieldValorCampoGeneralClaseCliente;
	}

	public void setBorderResaltarValorCampoGeneralClaseCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralClaseCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosClaseCliente() {
		return this.jCheckBoxSeleccionarTodosClaseCliente;
	}

	public void setjCheckBoxSeleccionarTodosClaseCliente(
			JCheckBox jCheckBoxSeleccionarTodosClaseCliente) {
		this.jCheckBoxSeleccionarTodosClaseCliente = jCheckBoxSeleccionarTodosClaseCliente;
	}

	public void setBorderResaltarSeleccionarTodosClaseCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosClaseCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosClaseCliente() {
		return this.jCheckBoxSeleccionadosClaseCliente;
	}

	public void setjCheckBoxSeleccionadosClaseCliente(
			JCheckBox jCheckBoxSeleccionadosClaseCliente) {
		this.jCheckBoxSeleccionadosClaseCliente = jCheckBoxSeleccionadosClaseCliente;
	}
	
	public void setBorderResaltarSeleccionadosClaseCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosClaseCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesClaseCliente() {
		return this.jComboBoxTiposArchivosReportesClaseCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesClaseCliente(
			JComboBox jComboBoxTiposArchivosReportesClaseCliente) {
		this.jComboBoxTiposArchivosReportesClaseCliente = jComboBoxTiposArchivosReportesClaseCliente;
	}

	public void setBorderResaltarTiposArchivosReportesClaseCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesClaseCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesClaseCliente() {
		return this.jComboBoxTiposReportesClaseCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesClaseCliente(
			JComboBox jComboBoxTiposReportesClaseCliente) {
		this.jComboBoxTiposReportesClaseCliente = jComboBoxTiposReportesClaseCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoClaseCliente() {
	//	return jComboBoxTiposReportesDinamicoClaseCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoClaseCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoClaseCliente) {
	//	this.jComboBoxTiposReportesDinamicoClaseCliente = jComboBoxTiposReportesDinamicoClaseCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoClaseCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoClaseCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoClaseCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoClaseCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoClaseCliente = jComboBoxTiposArchivosReportesDinamicoClaseCliente;
	//}
	
	public void setBorderResaltarTiposReportesClaseCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesClaseCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesClaseCliente() {
		return this.jComboBoxTiposGraficosReportesClaseCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesClaseCliente(
			JComboBox jComboBoxTiposGraficosReportesClaseCliente) {
		this.jComboBoxTiposGraficosReportesClaseCliente = jComboBoxTiposGraficosReportesClaseCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesClaseCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesClaseCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionClaseCliente() {
		return this.jComboBoxTiposPaginacionClaseCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionClaseCliente(
			JComboBox jComboBoxTiposPaginacionClaseCliente) {
		this.jComboBoxTiposPaginacionClaseCliente = jComboBoxTiposPaginacionClaseCliente;
	}
	
	public void setBorderResaltarTiposPaginacionClaseCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionClaseCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesClaseCliente() {
		return this.jComboBoxTiposRelacionesClaseCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesClaseCliente() {
		return this.jComboBoxTiposAccionesClaseCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesClaseCliente(
			JComboBox jComboBoxTiposRelacionesClaseCliente) {
		this.jComboBoxTiposRelacionesClaseCliente = jComboBoxTiposRelacionesClaseCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesClaseCliente(
			JComboBox jComboBoxTiposAccionesClaseCliente) {
		this.jComboBoxTiposAccionesClaseCliente = jComboBoxTiposAccionesClaseCliente;
	}
	
	public void setBorderResaltarTiposRelacionesClaseCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesClaseCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesClaseCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClaseCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesClaseCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoClaseCliente() {
	//	return jCheckBoxConGraficoDinamicoClaseCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoClaseCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoClaseCliente) {
	//	this.jCheckBoxConGraficoDinamicoClaseCliente = jCheckBoxConGraficoDinamicoClaseCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoClaseCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarClaseCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoClaseCliente .setBorder(borderResaltar);		
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
		this.claseclienteSessionBean=new ClaseClienteSessionBean();
		
		this.claseclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.claseclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.claseclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ClaseClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ClaseClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ClaseClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ClaseClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ClaseClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Clase Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		ClaseClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ClaseCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarClaseCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarClaseCliente,this.jTtoolBarClaseCliente,
							"nuevo","nuevo","Nuevo"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarClaseCliente,this.jTtoolBarClaseCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarClaseCliente,this.jTtoolBarClaseCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarClaseCliente,this.jTtoolBarClaseCliente,
							"duplicar","duplicar","Duplicar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarClaseCliente,this.jTtoolBarClaseCliente,
							"copiar","copiar","Copiar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarClaseCliente,this.jTtoolBarClaseCliente,
							"ver_form","ver_form","Ver"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClaseCliente,this.jTtoolBarClaseCliente,
							"recargar","recargar","Recargar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClaseCliente,this.jTtoolBarClaseCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClaseCliente,this.jTtoolBarClaseCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarClaseCliente,this.jTtoolBarClaseCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarClaseCliente,this.jTtoolBarClaseCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarClaseCliente,this.jTtoolBarClaseCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarClaseCliente,this.jTtoolBarClaseCliente,
							"cerrar","cerrar","Salir"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarClaseCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarClaseCliente;
			
				this.jButtonProcesarInformacionToolBarClaseCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarClaseCliente;
				
		//protected JButton jButtonModificarToolBarClaseCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarClaseCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuClaseCliente=new JMenuMe("General");
		this.jmenuArchivoClaseCliente=new JMenuMe("Archivo");
		this.jmenuAccionesClaseCliente=new JMenuMe("Acciones");
		this.jmenuDatosClaseCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoClaseCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoClaseCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoClaseCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarClaseCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarClaseCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarClaseCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesClaseCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesClaseCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesClaseCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosClaseCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosClaseCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosClaseCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarClaseCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarClaseCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarClaseCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormClaseCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormClaseCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormClaseCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaClaseCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaClaseCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaClaseCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarClaseCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarClaseCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarClaseCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionClaseCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionClaseCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionClaseCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionClaseCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionClaseCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionClaseCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresClaseCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresClaseCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresClaseCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesClaseCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesClaseCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesClaseCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByClaseCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByClaseCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByClaseCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarClaseCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarClaseCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarClaseCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByClaseCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByClaseCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByClaseCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarClaseCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarClaseCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarClaseCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosClaseCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosClaseCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosClaseCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoClaseCliente.add(this.jMenuItemCerrarClaseCliente);
			
			this.jmenuAccionesClaseCliente.add(this.jMenuItemNuevoClaseCliente);
			this.jmenuAccionesClaseCliente.add(this.jMenuItemNuevoGuardarCambiosClaseCliente);
			this.jmenuAccionesClaseCliente.add(this.jMenuItemNuevoRelacionesClaseCliente);
			this.jmenuAccionesClaseCliente.add(this.jMenuItemGuardarCambiosTablaClaseCliente);		
			this.jmenuAccionesClaseCliente.add(this.jMenuItemDuplicarClaseCliente);		
			this.jmenuAccionesClaseCliente.add(this.jMenuItemCopiarClaseCliente);		
			this.jmenuAccionesClaseCliente.add(this.jMenuItemVerFormClaseCliente);		
			
			this.jmenuDatosClaseCliente.add(this.jMenuItemRecargarInformacionClaseCliente);				
			this.jmenuDatosClaseCliente.add(this.jMenuItemAnterioresClaseCliente);				
			this.jmenuDatosClaseCliente.add(this.jMenuItemSiguientesClaseCliente);				
			this.jmenuDatosClaseCliente.add(this.jMenuItemAbrirOrderByClaseCliente);				
			this.jmenuDatosClaseCliente.add(this.jMenuItemMostrarOcultarClaseCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesClaseCliente.add(this.jMenuItemGuardarCambiosClaseCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarClaseCliente.add(this.jmenuArchivoClaseCliente);		
			this.jmenuBarClaseCliente.add(this.jmenuAccionesClaseCliente);		
			this.jmenuBarClaseCliente.add(this.jmenuDatosClaseCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarClaseCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasClaseCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoClaseCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoClaseCliente.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoClaseCliente= new JButtonMe();
		this.jButtonBusquedaPorCodigoClaseCliente.setText("Buscar");
		this.jButtonBusquedaPorCodigoClaseCliente.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoClaseCliente,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoClaseCliente = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoClaseCliente.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoClaseCliente.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoClaseCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoClaseCliente= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoClaseCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreClaseCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreClaseCliente.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreClaseCliente= new JButtonMe();
		this.jButtonBusquedaPorNombreClaseCliente.setText("Buscar");
		this.jButtonBusquedaPorNombreClaseCliente.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreClaseCliente,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreClaseCliente = new JLabelMe();
		jLabelnombreBusquedaPorNombreClaseCliente.setText("Nombre :");
		jLabelnombreBusquedaPorNombreClaseCliente.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreClaseCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreClaseCliente= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreClaseCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasClaseCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasClaseCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasClaseCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasClaseCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasClaseCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasClaseCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleClaseCliente = new ClaseClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Clase Cliente DATOS");
			this.jInternalFrameDetalleFormClaseCliente = new ClaseClienteDetalleFormJInternalFrame(jDesktopPane,this.claseclienteSessionBean.getConGuardarRelaciones(),this.claseclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormClaseCliente = null;//new ClaseClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutClaseCliente= new GridBagLayout();
		
		
		this.jTableDatosClaseCliente = new JTableMe();      
		
		String sToolTipClaseCliente="";
		sToolTipClaseCliente=ClaseClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipClaseCliente+="(Cartera.ClaseCliente)";
		}
		
		if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipClaseCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosClaseCliente.setToolTipText(sToolTipClaseCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosClaseCliente);
		this.jTableDatosClaseCliente.setAutoCreateRowSorter(true);
		this.jTableDatosClaseCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosClaseCliente.setRowSelectionAllowed(true);
		this.jTableDatosClaseCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosClaseCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoClaseCliente = new JButtonMe();
		this.jButtonDuplicarClaseCliente = new JButtonMe();
		this.jButtonCopiarClaseCliente = new JButtonMe();
		this.jButtonVerFormClaseCliente = new JButtonMe();
		this.jButtonNuevoRelacionesClaseCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaClaseCliente = new JButtonMe();
		this.jButtonCerrarClaseCliente = new JButtonMe();
		
		this.jScrollPanelDatosClaseCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralClaseCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesClaseCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Clase Cliente";
		
		if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clase Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosClaseCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesClaseCliente.setToolTipText("Acciones");
        this.jPanelAccionesClaseCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoClaseCliente=new ReporteDinamicoJInternalFrame(ClaseClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoClaseCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionClaseCliente=new ImportacionJInternalFrame(ClaseClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionClaseCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByClaseCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByClaseCliente.setText("Orden");
		this.jButtonAbrirOrderByClaseCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByClaseCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByClaseCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByClaseCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClaseCliente,false,this);
			
			//this.cargarOrderByClaseCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByClaseCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClaseCliente,true,this);
			
			//this.cargarOrderByClaseCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosClaseCliente.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosClaseCliente.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosClaseCliente.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosClaseCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosClaseCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosClaseCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoClaseCliente.setText("Nuevo");
		this.jButtonDuplicarClaseCliente.setText("Duplicar");
		this.jButtonCopiarClaseCliente.setText("Copiar");
		this.jButtonVerFormClaseCliente.setText("Ver");
		this.jButtonNuevoRelacionesClaseCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaClaseCliente.setText("Guardar");
		this.jButtonCerrarClaseCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoClaseCliente,"nuevo_button","Nuevo",this.claseclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarClaseCliente,"duplicar_button","Duplicar",this.claseclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarClaseCliente,"copiar_button","Copiar",this.claseclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormClaseCliente,"ver_form","Ver",this.claseclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesClaseCliente,"nuevorelaciones_button","Nuevo Rel",this.claseclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaClaseCliente,"guardarcambiostabla_button","Guardar",this.claseclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarClaseCliente,"cerrar_button","Salir",this.claseclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoClaseCliente.setToolTipText("Nuevo"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarClaseCliente.setToolTipText("Duplicar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarClaseCliente.setToolTipText("Copiar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormClaseCliente.setToolTipText("Ver"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesClaseCliente.setToolTipText("Nuevo Rel"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaClaseCliente.setToolTipText("Guardar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarClaseCliente.setToolTipText("Salir"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoClaseCliente";
		inputMap = this.jButtonNuevoClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoClaseCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoClaseCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarClaseCliente";
		inputMap = this.jButtonDuplicarClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarClaseCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarClaseCliente"));
		
		//COPIAR
		sMapKey = "CopiarClaseCliente";
		inputMap = this.jButtonCopiarClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarClaseCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarClaseCliente"));
		
		//VEr FORM
		sMapKey = "VerFormClaseCliente";
		inputMap = this.jButtonVerFormClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormClaseCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormClaseCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesClaseCliente";
		inputMap = this.jButtonNuevoRelacionesClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesClaseCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesClaseCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarClaseCliente";
		inputMap = this.jButtonModificarClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarClaseCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarClaseCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarClaseCliente";
		inputMap = this.jButtonCerrarClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarClaseCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarClaseCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaClaseCliente";
		inputMap = this.jButtonGuardarCambiosTablaClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaClaseCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaClaseCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesClaseCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesClaseCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionClaseCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ClaseCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ClaseCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ClaseCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ClaseCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ClaseCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesClaseCliente.setName("jPanelParametrosReportesClaseCliente"); 
		
		this.jPanelParametrosReportesAccionesClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesClaseCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesClaseCliente.setName("jPanelParametrosReportesAccionesClaseCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionClaseCliente = new JButtonMe();
		this.jButtonRecargarInformacionClaseCliente.setText("Recargar");
		this.jButtonRecargarInformacionClaseCliente.setToolTipText("Recargar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionClaseCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionClaseCliente = new JButtonMe();
		this.jButtonProcesarInformacionClaseCliente.setText("Procesar");
		this.jButtonProcesarInformacionClaseCliente.setToolTipText("Procesar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionClaseCliente.setVisible(false);
			
		this.jButtonProcesarInformacionClaseCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionClaseCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionClaseCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesClaseCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClaseCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesClaseCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesClaseCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClaseCliente.setText("TIPO");       
		this.jComboBoxTiposReportesClaseCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesClaseCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClaseCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesClaseCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionClaseCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionClaseCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionClaseCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesClaseCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesClaseCliente.setText("Accion");
		this.jComboBoxTiposRelacionesClaseCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesClaseCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesClaseCliente.setText("Accion");
		this.jComboBoxTiposAccionesClaseCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarClaseCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarClaseCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarClaseCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralClaseCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralClaseCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralClaseCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralClaseCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesClaseCliente = new JLabelMe();
		
		this.jLabelAccionesClaseCliente.setText("Acciones");		
		this.jLabelAccionesClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosClaseCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosClaseCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosClaseCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosClaseCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosClaseCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosClaseCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaClaseCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaClaseCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaClaseCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteClaseCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteClaseCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteClaseCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresClaseCliente = new JButtonMe();
		//this.jButtonAnterioresClaseCliente.setText("<<");
        this.jButtonAnterioresClaseCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresClaseCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesClaseCliente = new JButtonMe();
		//this.jButtonSiguientesClaseCliente.setText(">>");
        this.jButtonSiguientesClaseCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesClaseCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosClaseCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosClaseCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosClaseCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosClaseCliente,"nuevoguardarcambios_button","Nue",this.claseclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosClaseCliente";
		inputMap = this.jButtonNuevoGuardarCambiosClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosClaseCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosClaseCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionClaseCliente";
		inputMap = this.jButtonRecargarInformacionClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionClaseCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionClaseCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesClaseCliente";
		inputMap = this.jButtonSiguientesClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesClaseCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesClaseCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresClaseCliente";
		inputMap = this.jButtonAnterioresClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresClaseCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresClaseCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasClaseCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesClaseCliente.setMinimumSize(new Dimension(this.getWidth(),ClaseClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClaseClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesClaseCliente.setMaximumSize(new Dimension(this.getWidth(),ClaseClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClaseClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesClaseCliente.setPreferredSize(new Dimension(this.getWidth(),ClaseClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClaseClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionClaseCliente = new GridBagLayout();

			this.jPanelPaginacionClaseCliente.setLayout(gridaBagLayoutPaginacionClaseCliente);						
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.gridy = 0;
			this.gridBagConstraintsClaseCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionClaseCliente.add(this.jButtonAnterioresClaseCliente, this.gridBagConstraintsClaseCliente);
					
						
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsClaseCliente.gridy = 0;
			
			this.jPanelPaginacionClaseCliente.add(this.jButtonNuevoGuardarCambiosClaseCliente, this.gridBagConstraintsClaseCliente);
						
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsClaseCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsClaseCliente.gridy = 0;
			this.jPanelPaginacionClaseCliente.add(this.jButtonSiguientesClaseCliente, this.gridBagConstraintsClaseCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.gridy = 1;
			this.gridBagConstraintsClaseCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClaseCliente.add(this.jButtonNuevoClaseCliente, this.gridBagConstraintsClaseCliente);
						
			
			
			if(!this.claseclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsClaseCliente = new GridBagConstraints();
				this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsClaseCliente.gridy = 1;
				this.gridBagConstraintsClaseCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionClaseCliente.add(this.jButtonGuardarCambiosTablaClaseCliente, this.gridBagConstraintsClaseCliente);
			}
			
			
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.gridy = 1;
			this.gridBagConstraintsClaseCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClaseCliente.add(this.jButtonDuplicarClaseCliente, this.gridBagConstraintsClaseCliente);
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.gridy = 1;
			this.gridBagConstraintsClaseCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClaseCliente.add(this.jButtonCopiarClaseCliente, this.gridBagConstraintsClaseCliente);
		
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.gridy = 1;
			this.gridBagConstraintsClaseCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClaseCliente.add(this.jButtonVerFormClaseCliente, this.gridBagConstraintsClaseCliente);
		
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.gridy = 1;
			this.gridBagConstraintsClaseCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionClaseCliente.add(this.jButtonCerrarClaseCliente, this.gridBagConstraintsClaseCliente);
		
		
		
		this.jButtonRecargarInformacionClaseCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionClaseCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionClaseCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesClaseCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesClaseCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesClaseCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesClaseCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesClaseCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesClaseCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesClaseCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesClaseCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesClaseCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionClaseCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionClaseCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionClaseCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesClaseCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesClaseCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesClaseCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesClaseCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClaseCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClaseCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarClaseCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarClaseCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarClaseCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaClaseCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaClaseCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaClaseCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteClaseCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteClaseCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteClaseCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosClaseCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosClaseCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosClaseCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosClaseCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosClaseCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosClaseCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesClaseCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesClaseCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ClaseCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ClaseCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ClaseCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ClaseCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesClaseCliente.setLayout(gridaBagParametrosReportesClaseCliente);
			this.jPanelParametrosReportesAccionesClaseCliente.setLayout(gridaBagParametrosReportesAccionesClaseCliente);
			
			
			this.jPanelParametrosAuxiliar1ClaseCliente.setLayout(gridaBagParametrosAuxiliar1ClaseCliente);
			this.jPanelParametrosAuxiliar2ClaseCliente.setLayout(gridaBagParametrosAuxiliar2ClaseCliente);
			this.jPanelParametrosAuxiliar3ClaseCliente.setLayout(gridaBagParametrosAuxiliar3ClaseCliente);
			this.jPanelParametrosAuxiliar4ClaseCliente.setLayout(gridaBagParametrosAuxiliar4ClaseCliente);
			//this.jPanelParametrosAuxiliar5ClaseCliente.setLayout(gridaBagParametrosAuxiliar2ClaseCliente);			
			
			
			
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClaseCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClaseCliente.add(this.jButtonRecargarInformacionClaseCliente, this.gridBagConstraintsClaseCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClaseCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClaseCliente.add(this.jComboBoxTiposPaginacionClaseCliente, this.gridBagConstraintsClaseCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClaseCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClaseCliente.add(this.jCheckBoxConAltoMaximoTablaClaseCliente, this.gridBagConstraintsClaseCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClaseCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClaseCliente.add(this.jComboBoxTiposArchivosReportesClaseCliente, this.gridBagConstraintsClaseCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClaseCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClaseCliente.add(this.jPanelParametrosAuxiliar1ClaseCliente, this.gridBagConstraintsClaseCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClaseCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ClaseCliente.add(this.jComboBoxTiposReportesClaseCliente, this.gridBagConstraintsClaseCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClaseCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClaseCliente.add(this.jPanelParametrosAuxiliar4ClaseCliente, this.gridBagConstraintsClaseCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsClaseCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClaseCliente.add(this.jComboBoxTiposReportesClaseCliente, this.gridBagConstraintsClaseCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClaseCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClaseCliente.add(this.jCheckBoxGenerarReporteClaseCliente, this.gridBagConstraintsClaseCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClaseCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClaseCliente.add(this.jPanelParametrosAuxiliar2ClaseCliente, this.gridBagConstraintsClaseCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClaseCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClaseCliente.add(this.jLabelAccionesClaseCliente, this.gridBagConstraintsClaseCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsClaseCliente = new GridBagConstraints();
				this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsClaseCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsClaseCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesClaseCliente.add(this.jButtonAbrirOrderByClaseCliente, this.gridBagConstraintsClaseCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsClaseCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClaseCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClaseCliente.add(this.jComboBoxTiposSeleccionarClaseCliente, this.gridBagConstraintsClaseCliente);			
			
			
			/*
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClaseCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClaseCliente.add(this.jCheckBoxSeleccionarTodosClaseCliente, this.gridBagConstraintsClaseCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClaseCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ClaseCliente.add(this.jCheckBoxSeleccionarTodosClaseCliente, this.gridBagConstraintsClaseCliente);															
				
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClaseCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ClaseCliente.add(this.jCheckBoxSeleccionadosClaseCliente, this.gridBagConstraintsClaseCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClaseCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClaseCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClaseCliente.add(this.jPanelParametrosAuxiliar3ClaseCliente, this.gridBagConstraintsClaseCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClaseCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClaseCliente.add(this.jComboBoxTiposAccionesClaseCliente, this.gridBagConstraintsClaseCliente);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosClaseCliente = new GridBagLayout();

			this.jScrollPanelDatosClaseCliente.setLayout(gridaBagLayoutDatosClaseCliente);
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.gridy = 0;
			this.gridBagConstraintsClaseCliente.gridx = 0;
			
			this.jScrollPanelDatosClaseCliente.add(this.jTableDatosClaseCliente, this.gridBagConstraintsClaseCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosClaseCliente.setViewportView(this.jTableDatosClaseCliente);
		this.jTableDatosClaseCliente.setFillsViewportHeight(true);
		this.jTableDatosClaseCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesClaseCliente= new GridBagLayout();
		this.jPanelAccionesClaseCliente.setLayout(gridaBagLayoutAccionesClaseCliente);
		
		
		/*	
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseCliente.gridy = 0;
		this.gridBagConstraintsClaseCliente.gridx = 0;
			
		this.jPanelAccionesClaseCliente.add(this.jButtonNuevoClaseCliente, this.gridBagConstraintsClaseCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoClaseCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoClaseCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoClaseCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoClaseCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoClaseCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoClaseCliente.setLayout(gridaBagLayoutBusquedaPorCodigoClaseCliente);

		gridBagConstraintsClaseCliente = new GridBagConstraints();
		gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClaseCliente.gridy = 0;
		gridBagConstraintsClaseCliente.gridx = 0;
		jPanelBusquedaPorCodigoClaseCliente.add(jLabelcodigoBusquedaPorCodigoClaseCliente, gridBagConstraintsClaseCliente);

		gridBagConstraintsClaseCliente = new GridBagConstraints();
		gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClaseCliente.gridy = 0;
		gridBagConstraintsClaseCliente.gridx = 1;
		jPanelBusquedaPorCodigoClaseCliente.add(jTextFieldcodigoBusquedaPorCodigoClaseCliente, gridBagConstraintsClaseCliente);

		gridBagConstraintsClaseCliente = new GridBagConstraints();
		gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClaseCliente.gridy = 1;
		gridBagConstraintsClaseCliente.gridx =1;
		jPanelBusquedaPorCodigoClaseCliente.add(jButtonBusquedaPorCodigoClaseCliente, gridBagConstraintsClaseCliente);

		jTabbedPaneBusquedasClaseCliente.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoClaseCliente);
		jTabbedPaneBusquedasClaseCliente.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreClaseCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreClaseCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreClaseCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreClaseCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreClaseCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreClaseCliente.setLayout(gridaBagLayoutBusquedaPorNombreClaseCliente);

		gridBagConstraintsClaseCliente = new GridBagConstraints();
		gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClaseCliente.gridy = 0;
		gridBagConstraintsClaseCliente.gridx = 0;
		jPanelBusquedaPorNombreClaseCliente.add(jLabelnombreBusquedaPorNombreClaseCliente, gridBagConstraintsClaseCliente);

		gridBagConstraintsClaseCliente = new GridBagConstraints();
		gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClaseCliente.gridy = 0;
		gridBagConstraintsClaseCliente.gridx = 1;
		jPanelBusquedaPorNombreClaseCliente.add(jTextAreanombreBusquedaPorNombreClaseCliente, gridBagConstraintsClaseCliente);

		gridBagConstraintsClaseCliente = new GridBagConstraints();
		gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClaseCliente.gridy = 1;
		gridBagConstraintsClaseCliente.gridx =1;
		jPanelBusquedaPorNombreClaseCliente.add(jButtonBusquedaPorNombreClaseCliente, gridBagConstraintsClaseCliente);

		jTabbedPaneBusquedasClaseCliente.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreClaseCliente);
		jTabbedPaneBusquedasClaseCliente.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutClaseCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutClaseCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.claseclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();						
			this.gridBagConstraintsClaseCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClaseCliente.gridx = 0;		
			//this.gridBagConstraintsClaseCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsClaseCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarClaseCliente, this.gridBagConstraintsClaseCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsClaseCliente.gridx = 0;		
		//this.gridBagConstraintsClaseCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsClaseCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsClaseCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsClaseCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClaseCliente.gridx = 0;		
			this.gridBagConstraintsClaseCliente.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsClaseCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasClaseCliente, this.gridBagConstraintsClaseCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClaseCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesClaseCliente, this.gridBagConstraintsClaseCliente);								
		
		
		/*
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClaseCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesClaseCliente, this.gridBagConstraintsClaseCliente);
		*/		
		
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsClaseCliente.gridx =0;
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsClaseCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosClaseCliente, this.gridBagConstraintsClaseCliente);
				
		
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClaseCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionClaseCliente, this.gridBagConstraintsClaseCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ClaseClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosClaseCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosClaseCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosClaseCliente.setLayout(gridaBagLayoutBusquedasParametrosClaseCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralClaseCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralClaseCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClaseCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClaseCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClaseCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposClaseCliente, this.gridBagConstraintsClaseCliente);
			
			
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClaseCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosClaseCliente, this.gridBagConstraintsClaseCliente);
		
			
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsClaseCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesClaseCliente, this.gridBagConstraintsClaseCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralClaseCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoClaseCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoClaseCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoClaseCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoClaseCliente.setName("jPanelReporteDinamicoClaseCliente"); 
		
		this.jPanelReporteDinamicoClaseCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoClaseCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoClaseCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoClaseCliente.setLayout(gridaBagLayoutReporteDinamicoClaseCliente);
		
		
		this.jInternalFrameReporteDinamicoClaseCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoClaseCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteClaseCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoClaseCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoClaseCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoClaseCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoClaseCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoClaseCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoClaseCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoClaseCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoClaseCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoClaseCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoClaseCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoClaseCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clase Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteClaseCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteClaseCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClaseCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoClaseCliente.add(this.jLabelColumnasSelectReporteClaseCliente, this.gridBagConstraintsClaseCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteClaseCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteClaseCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteClaseCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteClaseCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteClaseCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteClaseCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteClaseCliente=new JScrollPane(this.jListColumnasSelectReporteClaseCliente);
			
			this.jScrollColumnasSelectReporteClaseCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteClaseCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteClaseCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClaseCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoClaseCliente.add(this.jListColumnasSelectReporteClaseCliente, this.gridBagConstraintsClaseCliente);
		this.jPanelReporteDinamicoClaseCliente.add(this.jScrollColumnasSelectReporteClaseCliente, this.gridBagConstraintsClaseCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteClaseCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteClaseCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteClaseCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteClaseCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteClaseCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteClaseCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteClaseCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteClaseCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteClaseCliente=new JScrollPane(this.jListRelacionesSelectReporteClaseCliente);
			
			this.jScrollRelacionesSelectReporteClaseCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteClaseCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteClaseCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoClaseCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoClaseCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoClaseCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoClaseCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoClaseCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoClaseCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoClaseCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoClaseCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoClaseCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoClaseCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoClaseCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoClaseCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoClaseCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoClaseCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoClaseCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClaseCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClaseCliente.add(this.jLabelGenerarExcelReporteDinamicoClaseCliente, this.gridBagConstraintsClaseCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoClaseCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoClaseCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoClaseCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoClaseCliente.setToolTipText("Generar EXCEL"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		//this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsClaseCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsClaseCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoClaseCliente.add(this.jButtonGenerarExcelReporteDinamicoClaseCliente, this.gridBagConstraintsClaseCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClaseCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClaseCliente.add(this.jComboBoxTiposReportesDinamicoClaseCliente, this.gridBagConstraintsClaseCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoClaseCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoClaseCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClaseCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClaseCliente.add(this.jLabelTiposArchivoReporteDinamicoClaseCliente, this.gridBagConstraintsClaseCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClaseCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClaseCliente.add(this.jComboBoxTiposArchivosReportesDinamicoClaseCliente, this.gridBagConstraintsClaseCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoClaseCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoClaseCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoClaseCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoClaseCliente.setToolTipText("Generar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClaseCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClaseCliente.add(this.jButtonGenerarReporteDinamicoClaseCliente, this.gridBagConstraintsClaseCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoClaseCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoClaseCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoClaseCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoClaseCliente.setToolTipText("Cancelar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClaseCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClaseCliente.add(this.jButtonCerrarReporteDinamicoClaseCliente, this.gridBagConstraintsClaseCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalClaseCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoClaseCliente= new JScrollPane(jPanelReporteDinamicoClaseCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoClaseCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoClaseCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoClaseCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clase Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsClaseCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoClaseCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoClaseCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalClaseCliente);
		this.jInternalFrameReporteDinamicoClaseCliente.getContentPane().add(this.jScrollPanelReporteDinamicoClaseCliente, this.gridBagConstraintsClaseCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionClaseCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionClaseCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionClaseCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionClaseCliente.setName("jPanelImportacionClaseCliente"); 
		
		this.jPanelImportacionClaseCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionClaseCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionClaseCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionClaseCliente.setLayout(gridaBagLayoutImportacionClaseCliente);
		
		
		this.jInternalFrameImportacionClaseCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionClaseCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionClaseCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteClaseCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionClaseCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionClaseCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionClaseCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionClaseCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionClaseCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionClaseCliente.setResizable(true);
	    this.jInternalFrameImportacionClaseCliente.setClosable(true);
	    this.jInternalFrameImportacionClaseCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionClaseCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionClaseCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionClaseCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionClaseCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionClaseCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionClaseCliente.setResizable(true);
	    this.jInternalFrameImportacionClaseCliente.setClosable(true);
	    this.jInternalFrameImportacionClaseCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionClaseCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionClaseCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionClaseCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clase Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionClaseCliente = new JLabelMe();

		this.jLabelArchivoImportacionClaseCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsClaseCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionClaseCliente.add(this.jLabelArchivoImportacionClaseCliente, this.gridBagConstraintsClaseCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionClaseCliente = new JFileChooser();		
		this.jFileChooserImportacionClaseCliente.setToolTipText("ESCOGER ARCHIVO"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionClaseCliente = new JButtonMe();
		this.jButtonAbrirImportacionClaseCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionClaseCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionClaseCliente.setToolTipText("Generar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsClaseCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClaseCliente.add(this.jButtonAbrirImportacionClaseCliente, this.gridBagConstraintsClaseCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionClaseCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionClaseCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsClaseCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionClaseCliente.add(this.jLabelPathArchivoImportacionClaseCliente, this.gridBagConstraintsClaseCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionClaseCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionClaseCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionClaseCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionClaseCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsClaseCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClaseCliente.add(this.jTextFieldPathArchivoImportacionClaseCliente, this.gridBagConstraintsClaseCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionClaseCliente = new JButtonMe();
		this.jButtonGenerarImportacionClaseCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionClaseCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionClaseCliente.setToolTipText("Generar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsClaseCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClaseCliente.add(this.jButtonGenerarImportacionClaseCliente, this.gridBagConstraintsClaseCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionClaseCliente = new JButtonMe();
		this.jButtonCerrarImportacionClaseCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionClaseCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionClaseCliente.setToolTipText("Cancelar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsClaseCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClaseCliente.add(this.jButtonCerrarImportacionClaseCliente, this.gridBagConstraintsClaseCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalClaseCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionClaseCliente= new JScrollPane(jPanelImportacionClaseCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsClaseCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionClaseCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionClaseCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalClaseCliente);
		this.jInternalFrameImportacionClaseCliente.getContentPane().add(this.jScrollPanelImportacionClaseCliente, this.gridBagConstraintsClaseCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByClaseCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByClaseCliente = new JButtonMe();
			this.jButtonAbrirOrderByClaseCliente.setText("Orden");
			this.jButtonAbrirOrderByClaseCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByClaseCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByClaseCliente";
			inputMap = this.jButtonAbrirOrderByClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByClaseCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByClaseCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByClaseCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByClaseCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByClaseCliente.setName("jPanelOrderByClaseCliente"); 
			
			this.jPanelOrderByClaseCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByClaseCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByClaseCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByClaseCliente.setLayout(gridaBagLayoutOrderByClaseCliente);
			
			
			this.jTableDatosClaseClienteOrderBy = new JTableMe();        
			this.jTableDatosClaseClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosClaseClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosClaseClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosClaseClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosClaseClienteOrderBy.setViewportView(this.jTableDatosClaseClienteOrderBy);
			this.jTableDatosClaseClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosClaseClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByClaseCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByClaseCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByClaseCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteClaseCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByClaseCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByClaseCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByClaseCliente.setTitle("Orden");
			this.jInternalFrameOrderByClaseCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByClaseCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByClaseCliente.setResizable(true);
			this.jInternalFrameOrderByClaseCliente.setClosable(true);
			this.jInternalFrameOrderByClaseCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByClaseCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByClaseCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByClaseCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clase Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsClaseCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsClaseCliente.ipady =150;
				
			this.jPanelOrderByClaseCliente.add(jScrollPanelDatosClaseClienteOrderBy, this.gridBagConstraintsClaseCliente);//this.jTableDatosClaseClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByClaseCliente = new JButtonMe();
			this.jButtonCerrarOrderByClaseCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByClaseCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByClaseCliente.setToolTipText("Cancelar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsClaseCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByClaseCliente.add(this.jButtonCerrarOrderByClaseCliente, this.gridBagConstraintsClaseCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalClaseCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByClaseCliente= new JScrollPane(jPanelOrderByClaseCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsClaseCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByClaseCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByClaseCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalClaseCliente);
			
			this.jInternalFrameOrderByClaseCliente.getContentPane().add(this.jScrollPanelOrderByClaseCliente, this.gridBagConstraintsClaseCliente);			
		
		} else {
			this.jButtonAbrirOrderByClaseCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.claseclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosClaseCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosClaseCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosClaseCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosClaseCliente.getRowHeight();//ClaseClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ClaseClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaClaseCliente.isSelected()) {
					iHeightTable=ClaseClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ClaseClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ClaseClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ClaseClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaClaseCliente.isSelected()) {
					iHeightTable=ClaseClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ClaseClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ClaseClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosClaseCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosClaseCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosClaseCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosClaseCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosClaseCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosClaseCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByClaseCliente!=null && this.jInternalFrameOrderByClaseCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByClaseCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByClaseCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByClaseCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByClaseCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByClaseCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByClaseCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByClaseCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosClaseCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosClaseCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosClaseCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=claseclienteLogic.getClaseClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=claseclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ClaseCliente> TraerClaseClienteBeans(List<ClaseCliente> claseclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(ClaseCliente clasecliente:claseclientes) {
					
				if(!(ClaseClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ClaseClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					clasecliente.setsDetalleGeneralEntityReporte(ClaseClienteConstantesFunciones.getClaseClienteDescripcion(clasecliente));
										
						
					
						
					
				} else  {
							
					//clasecliente.setsDetalleGeneralEntityReporte(clasecliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//claseclientebeans.add(claseclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return claseclientes;
    }
	//PARA REPORTES FIN
}
