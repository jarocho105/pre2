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



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;

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
public class SistemaJInternalFrame extends SistemaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarSistema;
	
	protected JMenuBar jmenuBarSistema;
	
	protected JMenu jmenuSistema;
	protected JMenu jmenuDatosSistema;
	protected JMenu jmenuArchivoSistema;
	protected JMenu jmenuAccionesSistema;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosSistema = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSistema;	
	protected GridBagConstraints gridBagConstraintsSistema;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public SistemaDetalleFormJInternalFrame jInternalFrameDetalleFormSistema;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoSistema;	
	protected ImportacionJInternalFrame jInternalFrameImportacionSistema;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public SistemaSessionBean sistemaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<Sistema> sistemas;		
	public List<Sistema> sistemasEliminados;	
	public List<Sistema> sistemasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderBySistema;		
	protected JButton jButtonAbrirOrderBySistema;
	
	
	//protected JPanel jPanelOrderBySistema;
	//public JScrollPane jScrollPanelOrderBySistema;	
	//protected JButton jButtonCerrarOrderBySistema;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public SistemaLogic sistemaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosSistema;
	public JScrollPane jScrollPanelDatosEdicionSistema;
	public JScrollPane jScrollPanelDatosGeneralSistema;
    
	
	
	//public JScrollPane jScrollPanelDatosSistemaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoSistema;
	//public JScrollPane jScrollPanelImportacionSistema;
	
	
	
	protected JPanel jPanelAccionesSistema;
	
    protected JPanel jPanelPaginacionSistema;
    protected JPanel jPanelParametrosReportesSistema;
	protected JPanel jPanelParametrosReportesAccionesSistema;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Sistema;
	protected JPanel jPanelParametrosAuxiliar2Sistema;
	protected JPanel jPanelParametrosAuxiliar3Sistema;
	protected JPanel jPanelParametrosAuxiliar4Sistema;
	//protected JPanel jPanelParametrosAuxiliar5Sistema;
	
	
	
	//protected JPanel jPanelReporteDinamicoSistema;
	//protected JPanel jPanelImportacionSistema;
	
	
	public JTable jTableDatosSistema;
	
	
	
	//public JTable jTableDatosSistemaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoSistema;
	protected JButton jButtonDuplicarSistema;
	protected JButton jButtonCopiarSistema;
	protected JButton jButtonVerFormSistema;
	protected JButton jButtonNuevoRelacionesSistema;
	protected JButton jButtonModificarSistema;
	
    protected JButton jButtonGuardarCambiosTablaSistema;
	protected JButton jButtonCerrarSistema;
	
	
	protected JButton jButtonRecargarInformacionSistema;
	protected JButton jButtonProcesarInformacionSistema;
	
	
	protected JButton jButtonAnterioresSistema;
	protected JButton jButtonSiguientesSistema;
	protected JButton jButtonNuevoGuardarCambiosSistema;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoSistema;
	//protected JButton jButtonCerrarReporteDinamicoSistema;
	//protected JButton jButtonGenerarExcelReporteDinamicoSistema;	
	
	
	
	//protected JButton jButtonAbrirImportacionSistema;
	//protected JButton jButtonGenerarImportacionSistema;
	//protected JButton jButtonCerrarImportacionSistema;
	//protected JFileChooser jFileChooserImportacionSistema;
	//protected File fileImportacionSistema;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSistema;
	protected JButton jButtonDuplicarToolBarSistema;
	protected JButton jButtonNuevoRelacionesToolBarSistema;
	
	
	public JButton jButtonGuardarCambiosToolBarSistema;
	protected JButton jButtonCopiarToolBarSistema;
	protected JButton jButtonVerFormToolBarSistema;
	public JButton jButtonGuardarCambiosTablaToolBarSistema;
	protected JButton jButtonMostrarOcultarTablaToolBarSistema;
	protected JButton jButtonCerrarToolBarSistema;
	
	protected JButton jButtonRecargarInformacionToolBarSistema;
	protected JButton jButtonProcesarInformacionToolBarSistema;
	protected JButton jButtonAnterioresToolBarSistema;
	protected JButton jButtonSiguientesToolBarSistema;
	protected JButton jButtonNuevoGuardarCambiosToolBarSistema;
	protected JButton jButtonAbrirOrderByToolBarSistema;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSistema;
	protected JMenuItem jMenuItemDuplicarSistema;
	protected JMenuItem jMenuItemNuevoRelacionesSistema;
	
	
	protected JMenuItem jMenuItemGuardarCambiosSistema;
	protected JMenuItem jMenuItemCopiarSistema;
	protected JMenuItem jMenuItemVerFormSistema;
	protected JMenuItem jMenuItemGuardarCambiosTablaSistema;
	protected JMenuItem jMenuItemCerrarSistema;
	protected JMenuItem jMenuItemDetalleCerrarSistema;
	protected JMenuItem jMenuItemDetalleAbrirOrderBySistema;
	protected JMenuItem jMenuItemDetalleMostarOcultarSistema;
	
	protected JMenuItem jMenuItemRecargarInformacionSistema;
	protected JMenuItem jMenuItemProcesarInformacionSistema;
	protected JMenuItem jMenuItemAnterioresSistema;
	protected JMenuItem jMenuItemSiguientesSistema;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSistema;
	protected JMenuItem jMenuItemAbrirOrderBySistema;
	protected JMenuItem jMenuItemMostrarOcultarSistema;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSistema;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosSistema;
	protected JCheckBox jCheckBoxSeleccionadosSistema;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaSistema;
	protected JCheckBox jCheckBoxConGraficoReporteSistema;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesSistema;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesSistema;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoSistema;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoSistema;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesSistema;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionSistema;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSistema;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSistema;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarSistema;
	protected JTextField jTextFieldValorCampoGeneralSistema;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteSistema;
	//public JList<Reporte> jListColumnasSelectReporteSistema;
	//public JScrollPane jScrollColumnasSelectReporteSistema;
	
	//public JLabel jLabelRelacionesSelectReporteSistema;
	//public JList<Reporte> jListRelacionesSelectReporteSistema;
	//public JScrollPane jScrollRelacionesSelectReporteSistema;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoSistema;
	//protected JCheckBox jCheckBoxConGraficoDinamicoSistema;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoSistema;
	//public JLabel jLabelTiposArchivoReporteDinamicoSistema;
	
		
	//public JLabel jLabelArchivoImportacionSistema;	
	//public JLabel jLabelPathArchivoImportacionSistema;
	//protected JTextField jTextFieldPathArchivoImportacionSistema;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoSistema;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoSistema;
	
	//public JLabel jLabelColumnaCategoriaValorSistema;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorSistema;
	
	//public JLabel jLabelColumnasValoresGraficoSistema;
	//public JList<Reporte> jListColumnasValoresGraficoSistema;
	//public JScrollPane jScrollColumnasValoresGraficoSistema;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoSistema;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoSistema;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasSistema;
	public JPanel jPanelBusquedaPorCodigoSistema;
	public JButton jButtonBusquedaPorCodigoSistema;
	public JPanel jPanelBusquedaPorNombrePrincipalSistema;
	public JButton jButtonBusquedaPorNombrePrincipalSistema;
	
	public JPanel jPanelcodigoBusquedaPorCodigoSistema;
	public JLabel jLabelcodigoBusquedaPorCodigoSistema;
	public JTextField jTextFieldcodigoBusquedaPorCodigoSistema;
	public JButton jButtoncodigoBusquedaPorCodigoSistemaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombre_principalBusquedaPorNombrePrincipalSistema;
	public JLabel jLabelnombre_principalBusquedaPorNombrePrincipalSistema;
	public JTextArea jTextAreanombre_principalBusquedaPorNombrePrincipalSistema;
	public JButton jButtonnombre_principalBusquedaPorNombrePrincipalSistemaBusqueda= new JButtonMe();

	
	
	
	
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
	public SistemaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Sistema No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SistemaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sistema No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SistemaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sistema No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SistemaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Sistema No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionSistema)	{
		this.jButtonRecargarInformacionSistema = jButtonRecargarInformacionSistema;
	}
	
	public JButton getjButtonProcesarInformacionSistema() {
		return this.jButtonProcesarInformacionSistema;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSistema)	{
		this.jButtonProcesarInformacionSistema = jButtonProcesarInformacionSistema;
	}
	
	
	public JButton getjButtonRecargarInformacionSistema() {
		return this.jButtonRecargarInformacionSistema;
	}
	
	
	public List<Sistema> getsistemas() {
		return this.sistemas;
	}

	public void setsistemas(List<Sistema> sistemas) {
		this.sistemas = sistemas;
	}
	
	public List<Sistema> getsistemasAux() {
		return this.sistemasAux;
	}

	public void setsistemasAux(List<Sistema> sistemasAux) {
		this.sistemasAux = sistemasAux;
	}
	
	public List<Sistema> getsistemasEliminados() {
		return this.sistemasEliminados;
	}

	public void setSistemasEliminados(List<Sistema> sistemasEliminados) {
		this.sistemasEliminados = sistemasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarSistema() {
		return jComboBoxTiposSeleccionarSistema;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarSistema(
			JComboBox jComboBoxTiposSeleccionarSistema) {
		this.jComboBoxTiposSeleccionarSistema = jComboBoxTiposSeleccionarSistema;
	}
	
	public void setBorderResaltarTiposSeleccionarSistema() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarSistema.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarSistema .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralSistema() {
		return jTextFieldValorCampoGeneralSistema;
	}

	public void setjTextFieldValorCampoGeneralSistema(
			JTextField jTextFieldValorCampoGeneralSistema) {
		this.jTextFieldValorCampoGeneralSistema = jTextFieldValorCampoGeneralSistema;
	}

	public void setBorderResaltarValorCampoGeneralSistema() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSistema.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralSistema .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosSistema() {
		return this.jCheckBoxSeleccionarTodosSistema;
	}

	public void setjCheckBoxSeleccionarTodosSistema(
			JCheckBox jCheckBoxSeleccionarTodosSistema) {
		this.jCheckBoxSeleccionarTodosSistema = jCheckBoxSeleccionarTodosSistema;
	}

	public void setBorderResaltarSeleccionarTodosSistema() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSistema.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosSistema .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosSistema() {
		return this.jCheckBoxSeleccionadosSistema;
	}

	public void setjCheckBoxSeleccionadosSistema(
			JCheckBox jCheckBoxSeleccionadosSistema) {
		this.jCheckBoxSeleccionadosSistema = jCheckBoxSeleccionadosSistema;
	}
	
	public void setBorderResaltarSeleccionadosSistema() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSistema.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosSistema .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesSistema() {
		return this.jComboBoxTiposArchivosReportesSistema;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesSistema(
			JComboBox jComboBoxTiposArchivosReportesSistema) {
		this.jComboBoxTiposArchivosReportesSistema = jComboBoxTiposArchivosReportesSistema;
	}

	public void setBorderResaltarTiposArchivosReportesSistema() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSistema.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesSistema .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesSistema() {
		return this.jComboBoxTiposReportesSistema;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesSistema(
			JComboBox jComboBoxTiposReportesSistema) {
		this.jComboBoxTiposReportesSistema = jComboBoxTiposReportesSistema;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoSistema() {
	//	return jComboBoxTiposReportesDinamicoSistema;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoSistema(
	//		JComboBox jComboBoxTiposReportesDinamicoSistema) {
	//	this.jComboBoxTiposReportesDinamicoSistema = jComboBoxTiposReportesDinamicoSistema;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoSistema() {
	//	return jComboBoxTiposArchivosReportesDinamicoSistema;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoSistema(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoSistema) {
	//	this.jComboBoxTiposArchivosReportesDinamicoSistema = jComboBoxTiposArchivosReportesDinamicoSistema;
	//}
	
	public void setBorderResaltarTiposReportesSistema() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSistema.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesSistema .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesSistema() {
		return this.jComboBoxTiposGraficosReportesSistema;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesSistema(
			JComboBox jComboBoxTiposGraficosReportesSistema) {
		this.jComboBoxTiposGraficosReportesSistema = jComboBoxTiposGraficosReportesSistema;
	}
	
	public void setBorderResaltarTiposGraficosReportesSistema() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSistema.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesSistema .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionSistema() {
		return this.jComboBoxTiposPaginacionSistema;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionSistema(
			JComboBox jComboBoxTiposPaginacionSistema) {
		this.jComboBoxTiposPaginacionSistema = jComboBoxTiposPaginacionSistema;
	}
	
	public void setBorderResaltarTiposPaginacionSistema() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSistema.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionSistema .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesSistema() {
		return this.jComboBoxTiposRelacionesSistema;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSistema() {
		return this.jComboBoxTiposAccionesSistema;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSistema(
			JComboBox jComboBoxTiposRelacionesSistema) {
		this.jComboBoxTiposRelacionesSistema = jComboBoxTiposRelacionesSistema;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSistema(
			JComboBox jComboBoxTiposAccionesSistema) {
		this.jComboBoxTiposAccionesSistema = jComboBoxTiposAccionesSistema;
	}
	
	public void setBorderResaltarTiposRelacionesSistema() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSistema.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesSistema .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesSistema() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarSistema.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesSistema .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoSistema() {
	//	return jCheckBoxConGraficoDinamicoSistema;
	//}

	//public void setjCheckBoxConGraficoDinamicoSistema(
	//		JCheckBox jCheckBoxConGraficoDinamicoSistema) {
	//	this.jCheckBoxConGraficoDinamicoSistema = jCheckBoxConGraficoDinamicoSistema;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoSistema() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarSistema.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoSistema .setBorder(borderResaltar);		
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
		this.sistemaSessionBean=new SistemaSessionBean();
		
		this.sistemaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sistemaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.sistemaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=SistemaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=SistemaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SistemaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SistemaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SistemaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sistema MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
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
		
		SistemaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Sistema No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarSistema= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarSistema,this.jTtoolBarSistema,
							"nuevo","nuevo","Nuevo"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarSistema,this.jTtoolBarSistema,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarSistema,this.jTtoolBarSistema,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarSistema,this.jTtoolBarSistema,
							"duplicar","duplicar","Duplicar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarSistema,this.jTtoolBarSistema,
							"copiar","copiar","Copiar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarSistema,this.jTtoolBarSistema,
							"ver_form","ver_form","Ver"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSistema,this.jTtoolBarSistema,
							"recargar","recargar","Recargar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSistema,this.jTtoolBarSistema,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarSistema,this.jTtoolBarSistema,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarSistema,this.jTtoolBarSistema,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarSistema,this.jTtoolBarSistema,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarSistema,this.jTtoolBarSistema,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarSistema=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarSistema,this.jTtoolBarSistema,
							"cerrar","cerrar","Salir"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarSistema=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarSistema;
			
				this.jButtonProcesarInformacionToolBarSistema=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarSistema;
				
		//protected JButton jButtonModificarToolBarSistema;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarSistema=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuSistema=new JMenuMe("General");
		this.jmenuArchivoSistema=new JMenuMe("Archivo");
		this.jmenuAccionesSistema=new JMenuMe("Acciones");
		this.jmenuDatosSistema=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSistema= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSistema.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSistema,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarSistema= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarSistema.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarSistema,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesSistema= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesSistema.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesSistema,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosSistema= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSistema.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSistema,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarSistema= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarSistema.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarSistema,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormSistema= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormSistema.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormSistema,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaSistema= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaSistema.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaSistema,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSistema= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSistema.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSistema,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionSistema= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionSistema.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionSistema,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionSistema= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionSistema.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionSistema,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresSistema= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresSistema.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresSistema,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesSistema= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesSistema.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesSistema,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderBySistema= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderBySistema.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderBySistema,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderBySistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSistema= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSistema.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSistema,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderBySistema= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderBySistema.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderBySistema,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderBySistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSistema= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSistema.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSistema,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosSistema= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosSistema.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosSistema,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoSistema.add(this.jMenuItemCerrarSistema);
			
			this.jmenuAccionesSistema.add(this.jMenuItemNuevoSistema);
			this.jmenuAccionesSistema.add(this.jMenuItemNuevoGuardarCambiosSistema);
			this.jmenuAccionesSistema.add(this.jMenuItemNuevoRelacionesSistema);
			this.jmenuAccionesSistema.add(this.jMenuItemGuardarCambiosTablaSistema);		
			this.jmenuAccionesSistema.add(this.jMenuItemDuplicarSistema);		
			this.jmenuAccionesSistema.add(this.jMenuItemCopiarSistema);		
			this.jmenuAccionesSistema.add(this.jMenuItemVerFormSistema);		
			
			this.jmenuDatosSistema.add(this.jMenuItemRecargarInformacionSistema);				
			this.jmenuDatosSistema.add(this.jMenuItemAnterioresSistema);				
			this.jmenuDatosSistema.add(this.jMenuItemSiguientesSistema);				
			this.jmenuDatosSistema.add(this.jMenuItemAbrirOrderBySistema);				
			this.jmenuDatosSistema.add(this.jMenuItemMostrarOcultarSistema);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesSistema.add(this.jMenuItemGuardarCambiosSistema);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoSistema, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesSistema, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosSistema, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarSistema.add(this.jmenuArchivoSistema);		
			this.jmenuBarSistema.add(this.jmenuAccionesSistema);		
			this.jmenuBarSistema.add(this.jmenuDatosSistema);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarSistema);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasSistema() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoSistema=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoSistema.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoSistema= new JButtonMe();
		this.jButtonBusquedaPorCodigoSistema.setText("Buscar");
		this.jButtonBusquedaPorCodigoSistema.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoSistema,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoSistema, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoSistema = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoSistema.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoSistema.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoSistema,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoSistema= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoSistema,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombrePrincipalSistema=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombrePrincipalSistema.setToolTipText("Buscar Por Nombre Principal ");
		this.jButtonBusquedaPorNombrePrincipalSistema= new JButtonMe();
		this.jButtonBusquedaPorNombrePrincipalSistema.setText("Buscar");
		this.jButtonBusquedaPorNombrePrincipalSistema.setToolTipText("Buscar Por Nombre Principal ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombrePrincipalSistema,"buscar_button","Buscar Por Nombre Principal ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombrePrincipalSistema, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombre_principalBusquedaPorNombrePrincipalSistema = new JLabelMe();
		jLabelnombre_principalBusquedaPorNombrePrincipalSistema.setText("Nombre Principal :");
		jLabelnombre_principalBusquedaPorNombrePrincipalSistema.setToolTipText("Nombre Principal");
		jLabelnombre_principalBusquedaPorNombrePrincipalSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_principalBusquedaPorNombrePrincipalSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelnombre_principalBusquedaPorNombrePrincipalSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelnombre_principalBusquedaPorNombrePrincipalSistema,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombre_principalBusquedaPorNombrePrincipalSistema= new JTextAreaMe();
		jTextAreanombre_principalBusquedaPorNombrePrincipalSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_principalBusquedaPorNombrePrincipalSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_principalBusquedaPorNombrePrincipalSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombre_principalBusquedaPorNombrePrincipalSistema,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasSistema=new JTabbedPane();


		this.jTabbedPaneBusquedasSistema.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSistema.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasSistema.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasSistema.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasSistema,STIPO_TAMANIO_GENERAL,false,true,this);

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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		
		if(this.conCargarFormDetalle) { //true) {
			//this.jInternalFrameDetalleSistema = new SistemaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Sistema DATOS");
			this.jInternalFrameDetalleFormSistema = new SistemaDetalleFormJInternalFrame(jDesktopPane,this.sistemaSessionBean.getConGuardarRelaciones(),this.sistemaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormSistema = null;//new SistemaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSistema= new GridBagLayout();
		
		
		this.jTableDatosSistema = new JTableMe();      
		
		String sToolTipSistema="";
		sToolTipSistema=SistemaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSistema+="(Seguridad.Sistema)";
		}
		
		if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
			sToolTipSistema+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosSistema.setToolTipText(sToolTipSistema);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosSistema);
		this.jTableDatosSistema.setAutoCreateRowSorter(true);
		this.jTableDatosSistema.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosSistema.setRowSelectionAllowed(true);
		this.jTableDatosSistema.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosSistema,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoSistema = new JButtonMe();
		this.jButtonDuplicarSistema = new JButtonMe();
		this.jButtonCopiarSistema = new JButtonMe();
		this.jButtonVerFormSistema = new JButtonMe();
		this.jButtonNuevoRelacionesSistema = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaSistema = new JButtonMe();
		this.jButtonCerrarSistema = new JButtonMe();
		
		this.jScrollPanelDatosSistema = new JScrollPane();   
        this.jScrollPanelDatosGeneralSistema = new JScrollPane();
		
				
		
		
		this.jPanelAccionesSistema = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Sistema";
		
		if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sistemas" + this.sPath));
		} else {
			this.jScrollPanelDatosSistema.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSistema.setToolTipText("Acciones");
        this.jPanelAccionesSistema.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSistema, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSistema, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoSistema=new ReporteDinamicoJInternalFrame(SistemaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoSistema();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionSistema=new ImportacionJInternalFrame(SistemaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionSistema();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderBySistema = new JButtonMe();
		
		this.jButtonAbrirOrderBySistema.setText("Orden");
		this.jButtonAbrirOrderBySistema.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySistema,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySistema, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderBySistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderBySistema.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySistema=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySistema,false,this);
			
			//this.cargarOrderBySistema(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderBySistema=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySistema,true,this);
			
			//this.cargarOrderBySistema(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosSistema.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosSistema.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosSistema.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosSistema.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosSistema.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosSistema.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoSistema.setText("Nuevo");
		this.jButtonDuplicarSistema.setText("Duplicar");
		this.jButtonCopiarSistema.setText("Copiar");
		this.jButtonVerFormSistema.setText("Ver");
		this.jButtonNuevoRelacionesSistema.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaSistema.setText("Guardar");
		this.jButtonCerrarSistema.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSistema,"nuevo_button","Nuevo",this.sistemaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarSistema,"duplicar_button","Duplicar",this.sistemaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarSistema,"copiar_button","Copiar",this.sistemaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormSistema,"ver_form","Ver",this.sistemaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesSistema,"nuevorelaciones_button","Nuevo Rel",this.sistemaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSistema,"guardarcambiostabla_button","Guardar",this.sistemaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSistema,"cerrar_button","Salir",this.sistemaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesSistema, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoSistema.setToolTipText("Nuevo"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarSistema.setToolTipText("Duplicar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarSistema.setToolTipText("Copiar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormSistema.setToolTipText("Ver"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesSistema.setToolTipText("Nuevo Rel"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaSistema.setToolTipText("Guardar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSistema.setToolTipText("Salir"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSistema";
		inputMap = this.jButtonNuevoSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSistema.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSistema"));
		
		//DUPLICAR
		sMapKey = "DuplicarSistema";
		inputMap = this.jButtonDuplicarSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarSistema.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarSistema"));
		
		//COPIAR
		sMapKey = "CopiarSistema";
		inputMap = this.jButtonCopiarSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarSistema.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarSistema"));
		
		//VEr FORM
		sMapKey = "VerFormSistema";
		inputMap = this.jButtonVerFormSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormSistema.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormSistema"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesSistema";
		inputMap = this.jButtonNuevoRelacionesSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesSistema.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesSistema"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarSistema";
		inputMap = this.jButtonModificarSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarSistema.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarSistema"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarSistema";
		inputMap = this.jButtonCerrarSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSistema.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSistema"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSistema";
		inputMap = this.jButtonGuardarCambiosTablaSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSistema.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSistema"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesSistema = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesSistema = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionSistema = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Sistema= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Sistema= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Sistema= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Sistema= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Sistema= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesSistema.setName("jPanelParametrosReportesSistema"); 
		
		this.jPanelParametrosReportesAccionesSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesSistema.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesSistema.setName("jPanelParametrosReportesAccionesSistema"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesSistema, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesSistema, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionSistema = new JButtonMe();
		this.jButtonRecargarInformacionSistema.setText("Recargar");
		this.jButtonRecargarInformacionSistema.setToolTipText("Recargar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionSistema,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionSistema = new JButtonMe();
		this.jButtonProcesarInformacionSistema.setText("Procesar");
		this.jButtonProcesarInformacionSistema.setToolTipText("Procesar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionSistema.setVisible(false);
			
		this.jButtonProcesarInformacionSistema.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSistema.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionSistema.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesSistema = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSistema.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesSistema.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesSistema = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSistema.setText("TIPO");       
		this.jComboBoxTiposReportesSistema.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesSistema = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesSistema.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesSistema.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionSistema = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionSistema.setText("Paginacion");
		this.jComboBoxTiposPaginacionSistema.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesSistema = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesSistema.setText("Accion");
		this.jComboBoxTiposRelacionesSistema.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesSistema = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSistema.setText("Accion");
		this.jComboBoxTiposAccionesSistema.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarSistema = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarSistema.setText("Accion");
		this.jComboBoxTiposSeleccionarSistema.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralSistema=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralSistema.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSistema.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralSistema.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesSistema = new JLabelMe();
		
		this.jLabelAccionesSistema.setText("Acciones");		
		this.jLabelAccionesSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosSistema = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosSistema.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosSistema.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosSistema = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosSistema.setText("Seleccionados");
		this.jCheckBoxSeleccionadosSistema.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaSistema = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaSistema.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaSistema.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteSistema = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteSistema.setText("Graf.");
		this.jCheckBoxConGraficoReporteSistema.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresSistema = new JButtonMe();
		//this.jButtonAnterioresSistema.setText("<<");
        this.jButtonAnterioresSistema.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresSistema,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesSistema = new JButtonMe();
		//this.jButtonSiguientesSistema.setText(">>");
        this.jButtonSiguientesSistema.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesSistema,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosSistema = new JButtonMe();
		this.jButtonNuevoGuardarCambiosSistema.setText("Nue");
        this.jButtonNuevoGuardarCambiosSistema.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosSistema,"nuevoguardarcambios_button","Nue",this.sistemaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosSistema, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosSistema";
		inputMap = this.jButtonNuevoGuardarCambiosSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosSistema.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosSistema"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionSistema";
		inputMap = this.jButtonRecargarInformacionSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionSistema.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionSistema"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesSistema";
		inputMap = this.jButtonSiguientesSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesSistema.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesSistema"));
		
		//ANTERIORES		
		sMapKey = "AnterioresSistema";
		inputMap = this.jButtonAnterioresSistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresSistema.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresSistema"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasSistema();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesSistema.setMinimumSize(new Dimension(this.getWidth(),SistemaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SistemaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSistema.setMaximumSize(new Dimension(this.getWidth(),SistemaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SistemaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesSistema.setPreferredSize(new Dimension(this.getWidth(),SistemaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(SistemaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionSistema = new GridBagLayout();

			this.jPanelPaginacionSistema.setLayout(gridaBagLayoutPaginacionSistema);						
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSistema.gridy = 0;
			this.gridBagConstraintsSistema.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionSistema.add(this.jButtonAnterioresSistema, this.gridBagConstraintsSistema);
					
						
			this.gridBagConstraintsSistema = new GridBagConstraints();//
			this.gridBagConstraintsSistema.gridx = iPosXAccionPaginacion++;//
			this.gridBagConstraintsSistema.gridy = 0;//
			
			this.jPanelPaginacionSistema.add(this.jButtonNuevoGuardarCambiosSistema, this.gridBagConstraintsSistema);//
						
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsSistema.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsSistema.gridy = 0;
			this.jPanelPaginacionSistema.add(this.jButtonSiguientesSistema, this.gridBagConstraintsSistema);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsSistema = new GridBagConstraints();//
			this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsSistema.gridy = 1;//
			this.gridBagConstraintsSistema.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionSistema.add(this.jButtonNuevoSistema, this.gridBagConstraintsSistema);//
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsSistema = new GridBagConstraints();
				this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsSistema.gridy = 1;
				this.gridBagConstraintsSistema.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionSistema.add(this.jButtonNuevoRelacionesSistema, this.gridBagConstraintsSistema);
			}
			
			
			if(!this.sistemaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsSistema = new GridBagConstraints();//
				this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;//
				this.gridBagConstraintsSistema.gridy = 1;//
				this.gridBagConstraintsSistema.gridx = iPosXAccionPaginacion++;//
						
				this.jPanelPaginacionSistema.add(this.jButtonGuardarCambiosTablaSistema, this.gridBagConstraintsSistema);//
			}
			
			
			
			this.gridBagConstraintsSistema = new GridBagConstraints();//
			this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsSistema.gridy = 1;//
			this.gridBagConstraintsSistema.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionSistema.add(this.jButtonDuplicarSistema, this.gridBagConstraintsSistema);//
			
			this.gridBagConstraintsSistema = new GridBagConstraints();//
			this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsSistema.gridy = 1;//
			this.gridBagConstraintsSistema.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionSistema.add(this.jButtonCopiarSistema, this.gridBagConstraintsSistema);//
		
			this.gridBagConstraintsSistema = new GridBagConstraints();//
			this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;//
			this.gridBagConstraintsSistema.gridy = 1;//
			this.gridBagConstraintsSistema.gridx = iPosXAccionPaginacion++;//
					
			this.jPanelPaginacionSistema.add(this.jButtonVerFormSistema, this.gridBagConstraintsSistema);//
		
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSistema.gridy = 1;
			this.gridBagConstraintsSistema.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionSistema.add(this.jButtonCerrarSistema, this.gridBagConstraintsSistema);
		
		
		
		this.jButtonRecargarInformacionSistema.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSistema.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionSistema.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionSistema, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesSistema.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSistema.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesSistema.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesSistema, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesSistema.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSistema.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesSistema.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesSistema, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesSistema.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSistema.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesSistema.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesSistema, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionSistema.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSistema.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionSistema.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionSistema, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesSistema.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSistema.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesSistema.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesSistema, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesSistema.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSistema.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSistema.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSistema, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarSistema.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSistema.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarSistema.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarSistema, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaSistema.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSistema.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaSistema.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaSistema, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteSistema.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSistema.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteSistema.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteSistema, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosSistema.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSistema.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosSistema.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosSistema, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosSistema.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSistema.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosSistema.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosSistema, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesSistema = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesSistema = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Sistema = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Sistema = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Sistema = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Sistema = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesSistema.setLayout(gridaBagParametrosReportesSistema);
			this.jPanelParametrosReportesAccionesSistema.setLayout(gridaBagParametrosReportesAccionesSistema);
			
			
			this.jPanelParametrosAuxiliar1Sistema.setLayout(gridaBagParametrosAuxiliar1Sistema);
			this.jPanelParametrosAuxiliar2Sistema.setLayout(gridaBagParametrosAuxiliar2Sistema);
			this.jPanelParametrosAuxiliar3Sistema.setLayout(gridaBagParametrosAuxiliar3Sistema);
			this.jPanelParametrosAuxiliar4Sistema.setLayout(gridaBagParametrosAuxiliar4Sistema);
			//this.jPanelParametrosAuxiliar5Sistema.setLayout(gridaBagParametrosAuxiliar2Sistema);			
			
			
			
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSistema.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSistema.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSistema.add(this.jButtonRecargarInformacionSistema, this.gridBagConstraintsSistema);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSistema.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSistema.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Sistema.add(this.jComboBoxTiposPaginacionSistema, this.gridBagConstraintsSistema);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSistema.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSistema.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Sistema.add(this.jCheckBoxConAltoMaximoTablaSistema, this.gridBagConstraintsSistema);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSistema.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsSistema.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Sistema.add(this.jComboBoxTiposArchivosReportesSistema, this.gridBagConstraintsSistema);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSistema.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSistema.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSistema.add(this.jPanelParametrosAuxiliar1Sistema, this.gridBagConstraintsSistema);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSistema.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSistema.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Sistema.add(this.jComboBoxTiposReportesSistema, this.gridBagConstraintsSistema);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSistema.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSistema.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSistema.add(this.jPanelParametrosAuxiliar4Sistema, this.gridBagConstraintsSistema);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSistema.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsSistema.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSistema.add(this.jComboBoxTiposReportesSistema, this.gridBagConstraintsSistema);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSistema.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSistema.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSistema.add(this.jCheckBoxGenerarReporteSistema, this.gridBagConstraintsSistema);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSistema.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSistema.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSistema.add(this.jPanelParametrosAuxiliar2Sistema, this.gridBagConstraintsSistema);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSistema.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSistema.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSistema.add(this.jLabelAccionesSistema, this.gridBagConstraintsSistema);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsSistema = new GridBagConstraints();
				this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsSistema.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsSistema.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesSistema.add(this.jButtonAbrirOrderBySistema, this.gridBagConstraintsSistema);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsSistema.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSistema.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSistema.add(this.jComboBoxTiposSeleccionarSistema, this.gridBagConstraintsSistema);			
			
			
			/*
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSistema.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsSistema.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesSistema.add(this.jCheckBoxSeleccionarTodosSistema, this.gridBagConstraintsSistema);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSistema.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSistema.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Sistema.add(this.jCheckBoxSeleccionarTodosSistema, this.gridBagConstraintsSistema);															
				
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSistema.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsSistema.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Sistema.add(this.jCheckBoxSeleccionadosSistema, this.gridBagConstraintsSistema);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsSistema.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSistema.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesSistema.add(this.jPanelParametrosAuxiliar3Sistema, this.gridBagConstraintsSistema);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSistema.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSistema.add(this.jComboBoxTiposRelacionesSistema, this.gridBagConstraintsSistema);
				
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSistema.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSistema.add(this.jComboBoxTiposAccionesSistema, this.gridBagConstraintsSistema);
	
				
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsSistema.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesSistema.add(this.jTextFieldValorCampoGeneralSistema, this.gridBagConstraintsSistema);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosSistema = new GridBagLayout();

			this.jScrollPanelDatosSistema.setLayout(gridaBagLayoutDatosSistema);
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSistema.gridy = 0;
			this.gridBagConstraintsSistema.gridx = 0;
			
			this.jScrollPanelDatosSistema.add(this.jTableDatosSistema, this.gridBagConstraintsSistema);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosSistema.setViewportView(this.jTableDatosSistema);
		this.jTableDatosSistema.setFillsViewportHeight(true);
		this.jTableDatosSistema.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesSistema= new GridBagLayout();
		this.jPanelAccionesSistema.setLayout(gridaBagLayoutAccionesSistema);
		
		
		/*	
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSistema.gridy = 0;
		this.gridBagConstraintsSistema.gridx = 0;
			
		this.jPanelAccionesSistema.add(this.jButtonNuevoSistema, this.gridBagConstraintsSistema);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoSistema= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoSistema.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoSistema.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoSistema.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoSistema.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoSistema.setLayout(gridaBagLayoutBusquedaPorCodigoSistema);

		gridBagConstraintsSistema = new GridBagConstraints();
		gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSistema.gridy = 0;
		gridBagConstraintsSistema.gridx = 0;
		jPanelBusquedaPorCodigoSistema.add(jLabelcodigoBusquedaPorCodigoSistema, gridBagConstraintsSistema);

		gridBagConstraintsSistema = new GridBagConstraints();
		gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSistema.gridy = 0;
		gridBagConstraintsSistema.gridx = 1;
		jPanelBusquedaPorCodigoSistema.add(jTextFieldcodigoBusquedaPorCodigoSistema, gridBagConstraintsSistema);

		gridBagConstraintsSistema = new GridBagConstraints();
		gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSistema.gridy = 1;
		gridBagConstraintsSistema.gridx =1;
		jPanelBusquedaPorCodigoSistema.add(jButtonBusquedaPorCodigoSistema, gridBagConstraintsSistema);

		jTabbedPaneBusquedasSistema.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoSistema);
		jTabbedPaneBusquedasSistema.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombrePrincipalSistema= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombrePrincipalSistema.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePrincipalSistema.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombrePrincipalSistema.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombrePrincipalSistema.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombrePrincipalSistema.setLayout(gridaBagLayoutBusquedaPorNombrePrincipalSistema);

		gridBagConstraintsSistema = new GridBagConstraints();
		gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSistema.gridy = 0;
		gridBagConstraintsSistema.gridx = 0;
		jPanelBusquedaPorNombrePrincipalSistema.add(jLabelnombre_principalBusquedaPorNombrePrincipalSistema, gridBagConstraintsSistema);

		gridBagConstraintsSistema = new GridBagConstraints();
		gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSistema.gridy = 0;
		gridBagConstraintsSistema.gridx = 1;
		jPanelBusquedaPorNombrePrincipalSistema.add(jTextAreanombre_principalBusquedaPorNombrePrincipalSistema, gridBagConstraintsSistema);

		gridBagConstraintsSistema = new GridBagConstraints();
		gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
		gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsSistema.gridy = 1;
		gridBagConstraintsSistema.gridx =1;
		jPanelBusquedaPorNombrePrincipalSistema.add(jButtonBusquedaPorNombrePrincipalSistema, gridBagConstraintsSistema);

		jTabbedPaneBusquedasSistema.addTab("2.-Por Nombre Principal ", jPanelBusquedaPorNombrePrincipalSistema);
		jTabbedPaneBusquedasSistema.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSistema = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSistema);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.sistemaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSistema = new GridBagConstraints();						
			this.gridBagConstraintsSistema.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSistema.gridx = 0;		
			//this.gridBagConstraintsSistema.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSistema.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarSistema, this.gridBagConstraintsSistema);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy = iGridyPrincipal++;
		this.gridBagConstraintsSistema.gridx = 0;		
		//this.gridBagConstraintsSistema.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSistema.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsSistema.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsSistema);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsSistema.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSistema.gridx = 0;		
			this.gridBagConstraintsSistema.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsSistema.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasSistema, this.gridBagConstraintsSistema);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSistema.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesSistema, this.gridBagConstraintsSistema);								
		
		
		/*
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSistema.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesSistema, this.gridBagConstraintsSistema);
		*/		
		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSistema.gridx =0;
		this.gridBagConstraintsSistema.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSistema.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSistema, this.gridBagConstraintsSistema);
				
		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSistema.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionSistema, this.gridBagConstraintsSistema);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(SistemaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosSistema= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSistema = new GridBagLayout();
			this.jPanelBusquedasParametrosSistema.setLayout(gridaBagLayoutBusquedasParametrosSistema);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralSistema=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSistema.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSistema.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSistema.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsSistema.anchor = GridBagConstraints.WEST;
			
			
			
			
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
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSistema.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSistema, this.gridBagConstraintsSistema);
			
			
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSistema.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSistema, this.gridBagConstraintsSistema);
		
			
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSistema.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSistema, this.gridBagConstraintsSistema);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralSistema;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoSistema() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoSistema = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoSistema = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoSistema.setName("jPanelReporteDinamicoSistema"); 
		
		this.jPanelReporteDinamicoSistema.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSistema.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoSistema.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoSistema.setLayout(gridaBagLayoutReporteDinamicoSistema);
		
		
		this.jInternalFrameReporteDinamicoSistema= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoSistema = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSistema= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoSistema.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoSistema.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoSistema.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoSistema.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoSistema.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoSistema.setResizable(true);
	    this.jInternalFrameReporteDinamicoSistema.setClosable(true);
	    this.jInternalFrameReporteDinamicoSistema.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoSistema.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSistema.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoSistema.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sistemas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteSistema = new JLabelMe();

		this.jLabelColumnasSelectReporteSistema.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSistema.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSistema.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSistema.add(this.jLabelColumnasSelectReporteSistema, this.gridBagConstraintsSistema);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteSistema = new JList<Reporte>();
		this.jListColumnasSelectReporteSistema.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteSistema.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteSistema.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSistema.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteSistema.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteSistema=new JScrollPane(this.jListColumnasSelectReporteSistema);
			
			this.jScrollColumnasSelectReporteSistema.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSistema.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteSistema.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSistema.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSistema.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSistema.add(this.jListColumnasSelectReporteSistema, this.gridBagConstraintsSistema);
		this.jPanelReporteDinamicoSistema.add(this.jScrollColumnasSelectReporteSistema, this.gridBagConstraintsSistema);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteSistema = new JLabelMe();

		this.jLabelRelacionesSelectReporteSistema.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSistema.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSistema.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoSistema.add(this.jLabelRelacionesSelectReporteSistema, this.gridBagConstraintsSistema);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteSistema = new JList<Reporte>();
		this.jListRelacionesSelectReporteSistema.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteSistema.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteSistema.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSistema.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteSistema.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteSistema=new JScrollPane(this.jListRelacionesSelectReporteSistema);
			
			this.jScrollRelacionesSelectReporteSistema.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSistema.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteSistema.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSistema.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSistema.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoSistema.add(this.jListRelacionesSelectReporteSistema, this.gridBagConstraintsSistema);
		this.jPanelReporteDinamicoSistema.add(this.jScrollRelacionesSelectReporteSistema, this.gridBagConstraintsSistema);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoSistema = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoSistema = new JComboBoxMe();
		this.jListColumnasValoresGraficoSistema = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoSistema = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoSistema.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoSistema.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSistema.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoSistema.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoSistema, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoSistema = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoSistema.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoSistema.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSistema.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoSistema.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoSistema, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoSistema = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoSistema.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSistema.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSistema.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSistema.add(this.jLabelGenerarExcelReporteDinamicoSistema, this.gridBagConstraintsSistema);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoSistema = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoSistema.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoSistema,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoSistema.setToolTipText("Generar EXCEL"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsSistema = new GridBagConstraints();
		//this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsSistema.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsSistema.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoSistema.add(this.jButtonGenerarExcelReporteDinamicoSistema, this.gridBagConstraintsSistema);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSistema.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSistema.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSistema.add(this.jComboBoxTiposReportesDinamicoSistema, this.gridBagConstraintsSistema);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoSistema = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoSistema.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSistema.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsSistema.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoSistema.add(this.jLabelTiposArchivoReporteDinamicoSistema, this.gridBagConstraintsSistema);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSistema.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSistema.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSistema.add(this.jComboBoxTiposArchivosReportesDinamicoSistema, this.gridBagConstraintsSistema);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoSistema = new JButtonMe();
		this.jButtonGenerarReporteDinamicoSistema.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoSistema,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoSistema.setToolTipText("Generar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSistema.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSistema.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSistema.add(this.jButtonGenerarReporteDinamicoSistema, this.gridBagConstraintsSistema);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoSistema = new JButtonMe();
		this.jButtonCerrarReporteDinamicoSistema.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoSistema,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoSistema.setToolTipText("Cancelar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSistema.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsSistema.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoSistema.add(this.jButtonCerrarReporteDinamicoSistema, this.gridBagConstraintsSistema);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalSistema = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoSistema= new JScrollPane(jPanelReporteDinamicoSistema,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoSistema.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSistema.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoSistema.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sistemas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsSistema.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsSistema.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoSistema.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoSistema.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalSistema);
		this.jInternalFrameReporteDinamicoSistema.getContentPane().add(this.jScrollPanelReporteDinamicoSistema, this.gridBagConstraintsSistema);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionSistema() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionSistema = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionSistema = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionSistema.setName("jPanelImportacionSistema"); 
		
		this.jPanelImportacionSistema.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSistema.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionSistema.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionSistema.setLayout(gridaBagLayoutImportacionSistema);
		
		
		this.jInternalFrameImportacionSistema= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionSistema= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionSistema = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteSistema= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionSistema.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSistema.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSistema.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionSistema.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSistema.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSistema.setResizable(true);
	    this.jInternalFrameImportacionSistema.setClosable(true);
	    this.jInternalFrameImportacionSistema.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionSistema.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionSistema.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionSistema.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionSistema.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionSistema.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionSistema.setResizable(true);
	    this.jInternalFrameImportacionSistema.setClosable(true);
	    this.jInternalFrameImportacionSistema.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionSistema.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSistema.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionSistema.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionSistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sistemas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionSistema = new JLabelMe();

		this.jLabelArchivoImportacionSistema.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSistema.gridy = iPosYImportacion;		
		this.gridBagConstraintsSistema.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSistema.add(this.jLabelArchivoImportacionSistema, this.gridBagConstraintsSistema);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionSistema = new JFileChooser();		
		this.jFileChooserImportacionSistema.setToolTipText("ESCOGER ARCHIVO"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionSistema = new JButtonMe();
		this.jButtonAbrirImportacionSistema.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionSistema,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionSistema.setToolTipText("Generar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSistema.gridy = iPosYImportacion;
		this.gridBagConstraintsSistema.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSistema.add(this.jButtonAbrirImportacionSistema, this.gridBagConstraintsSistema);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionSistema = new JLabelMe();

		this.jLabelPathArchivoImportacionSistema.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionSistema.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSistema.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionSistema.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSistema.gridy = iPosYImportacion;		
		this.gridBagConstraintsSistema.gridx = iPosXImportacion++;
			
		this.jPanelImportacionSistema.add(this.jLabelPathArchivoImportacionSistema, this.gridBagConstraintsSistema);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionSistema=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionSistema.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSistema.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionSistema.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSistema.gridy = iPosYImportacion;
		this.gridBagConstraintsSistema.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSistema.add(this.jTextFieldPathArchivoImportacionSistema, this.gridBagConstraintsSistema);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionSistema = new JButtonMe();
		this.jButtonGenerarImportacionSistema.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionSistema,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionSistema.setToolTipText("Generar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSistema.gridy = iPosYImportacion;
		this.gridBagConstraintsSistema.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSistema.add(this.jButtonGenerarImportacionSistema, this.gridBagConstraintsSistema);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionSistema = new JButtonMe();
		this.jButtonCerrarImportacionSistema.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionSistema,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionSistema.setToolTipText("Cancelar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSistema.gridy = iPosYImportacion;
		this.gridBagConstraintsSistema.gridx = iPosXImportacion++;
							
		this.jPanelImportacionSistema.add(this.jButtonCerrarImportacionSistema, this.gridBagConstraintsSistema);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalSistema = new GridBagLayout();
		
		this.jScrollPanelImportacionSistema= new JScrollPane(jPanelImportacionSistema,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsSistema = new GridBagConstraints();
		this.gridBagConstraintsSistema.gridy =iPosYImportacion;
		this.gridBagConstraintsSistema.gridx =iPosXImportacion;
		this.gridBagConstraintsSistema.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionSistema.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionSistema.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalSistema);
		this.jInternalFrameImportacionSistema.getContentPane().add(this.jScrollPanelImportacionSistema, this.gridBagConstraintsSistema);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderBySistema(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderBySistema = new JButtonMe();
			this.jButtonAbrirOrderBySistema.setText("Orden");
			this.jButtonAbrirOrderBySistema.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderBySistema,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderBySistema, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderBySistema";
			inputMap = this.jButtonAbrirOrderBySistema.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderBySistema.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
		
		
			GridBagLayout gridaBagLayoutOrderBySistema = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderBySistema = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderBySistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderBySistema.setName("jPanelOrderBySistema"); 
			
			this.jPanelOrderBySistema.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySistema.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderBySistema.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderBySistema, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderBySistema.setLayout(gridaBagLayoutOrderBySistema);
			
			
			this.jTableDatosSistemaOrderBy = new JTableMe();        
			this.jTableDatosSistemaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosSistemaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosSistemaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosSistemaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosSistemaOrderBy.setViewportView(this.jTableDatosSistemaOrderBy);
			this.jTableDatosSistemaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosSistemaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderBySistema= new OrderByJInternalFrame();
			this.jInternalFrameOrderBySistema= new OrderByJInternalFrame();
			this.jScrollPanelOrderBySistema = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteSistema= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderBySistema.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderBySistema.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderBySistema.setTitle("Orden");
			this.jInternalFrameOrderBySistema.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderBySistema.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderBySistema.setResizable(true);
			this.jInternalFrameOrderBySistema.setClosable(true);
			this.jInternalFrameOrderBySistema.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderBySistema, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderBySistema.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySistema.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderBySistema.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderBySistema, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderBySistema.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sistemas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.gridy =iPosYOrderBy++;
			this.gridBagConstraintsSistema.gridx =iPosXOrderBy;
			this.gridBagConstraintsSistema.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsSistema.ipady =150;
				
			this.jPanelOrderBySistema.add(jScrollPanelDatosSistemaOrderBy, this.gridBagConstraintsSistema);//this.jTableDatosSistemaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderBySistema = new JButtonMe();
			this.jButtonCerrarOrderBySistema.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderBySistema,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderBySistema.setToolTipText("Cancelar"+" "+SistemaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderBySistema, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSistema.gridy = iPosYOrderBy++;
			this.gridBagConstraintsSistema.gridx = iPosXOrderBy;
									
			this.jPanelOrderBySistema.add(this.jButtonCerrarOrderBySistema, this.gridBagConstraintsSistema);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalSistema = new GridBagLayout();
			
			this.jScrollPanelOrderBySistema= new JScrollPane(jPanelOrderBySistema,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsSistema = new GridBagConstraints();
			this.gridBagConstraintsSistema.gridy =iPosYOrderBy;
			this.gridBagConstraintsSistema.gridx =iPosXOrderBy;
			this.gridBagConstraintsSistema.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderBySistema.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderBySistema.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalSistema);
			
			this.jInternalFrameOrderBySistema.getContentPane().add(this.jScrollPanelOrderBySistema, this.gridBagConstraintsSistema);			
		
		} else {
			this.jButtonAbrirOrderBySistema = new JButtonMe();
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
		int iWidthTableCalculado=0;//1530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=400;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.sistemaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosSistema.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosSistema.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosSistema.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosSistema.getRowHeight();//SistemaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > SistemaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSistema.isSelected()) {
					iHeightTable=SistemaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SistemaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SistemaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > SistemaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaSistema.isSelected()) {
					iHeightTable=SistemaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < SistemaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=SistemaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosSistema.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSistema.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosSistema.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosSistema.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSistema.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosSistema.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderBySistema!=null && this.jInternalFrameOrderBySistema.getjTableDatosOrderBy()!=null) {
			//if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderBySistema.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderBySistema.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderBySistema.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderBySistema.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderBySistema.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderBySistema.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderBySistema.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosSistema.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSistema.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosSistema.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=sistemaLogic.getSistemas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sistemas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	/*
	PARA MANEJAR EL TAB RELACIONES CON TABLA DE DATOS SE DEBE MODIFICAR Y VERIFICAR LOS VALORES CONTANTES:	
		final public static Integer ISWING_TAMANIOMAXIMO_TABLADATOSREL=240;//230;350;		
		final public static Integer ISWING_TAMANIOMINIMO_TABLADATOSREL=240;//230;260
		
		final public static Integer ISWING_ALTO_TABPANE=375;//375;400;260;
	CASO CONTRARIO, ESTOS VALORES SERIAN PARA CADA CASO (NO CONSTANTES)
	
	NOTA:
	* LA ALINEACION HORIZONTAL,FALTA
	*/
	
	//PARA REPORTES
	public static List<Sistema> TraerSistemaBeans(List<Sistema> sistemas,ArrayList<Classe> classes)throws Exception {
		try {
			for(Sistema sistema:sistemas) {
					
				if(!(SistemaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || SistemaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					sistema.setsDetalleGeneralEntityReporte(SistemaConstantesFunciones.getSistemaDescripcion(sistema));
										
					sistema.setestado_descripcion(SistemaConstantesFunciones.getestadoDescripcion(sistema));	
					
					

					if(sistema.getPerfils()!=null && Funciones.existeClass(classes,Perfil.class)) {
						try{sistema.setperfilsDescripcionReporte(new JRBeanCollectionDataSource(PerfilJInternalFrame.TraerPerfilBeans(sistema.getPerfils(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(sistema.getOpcions()!=null && Funciones.existeClass(classes,Opcion.class)) {
						try{sistema.setopcionsDescripcionReporte(new JRBeanCollectionDataSource(OpcionJInternalFrame.TraerOpcionBeans(sistema.getOpcions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(sistema.getPaquetes()!=null && Funciones.existeClass(classes,Paquete.class)) {
						try{sistema.setpaquetesDescripcionReporte(new JRBeanCollectionDataSource(PaqueteJInternalFrame.TraerPaqueteBeans(sistema.getPaquetes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(sistema.getModulos()!=null && Funciones.existeClass(classes,Modulo.class)) {
						try{sistema.setmodulosDescripcionReporte(new JRBeanCollectionDataSource(ModuloJInternalFrame.TraerModuloBeans(sistema.getModulos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//sistema.setsDetalleGeneralEntityReporte(sistema.getsDetalleGeneralEntityReporte());
										
				}
				
				//sistemabeans.add(sistemabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return sistemas;
    }
	//PARA REPORTES FIN
}
