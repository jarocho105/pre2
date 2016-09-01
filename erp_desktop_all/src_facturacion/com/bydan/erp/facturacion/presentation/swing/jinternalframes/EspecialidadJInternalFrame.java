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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

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
import com.bydan.erp.facturacion.util.EspecialidadConstantesFunciones;

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
public class EspecialidadJInternalFrame extends EspecialidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEspecialidad;
	
	protected JMenuBar jmenuBarEspecialidad;
	
	protected JMenu jmenuEspecialidad;
	protected JMenu jmenuDatosEspecialidad;
	protected JMenu jmenuArchivoEspecialidad;
	protected JMenu jmenuAccionesEspecialidad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEspecialidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEspecialidad;	
	protected GridBagConstraints gridBagConstraintsEspecialidad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EspecialidadDetalleFormJInternalFrame jInternalFrameDetalleFormEspecialidad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEspecialidad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEspecialidad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public EspecialidadSessionBean especialidadSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Especialidad> especialidads;		
	public List<Especialidad> especialidadsEliminados;	
	public List<Especialidad> especialidadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEspecialidad;		
	protected JButton jButtonAbrirOrderByEspecialidad;
	
	
	//protected JPanel jPanelOrderByEspecialidad;
	//public JScrollPane jScrollPanelOrderByEspecialidad;	
	//protected JButton jButtonCerrarOrderByEspecialidad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EspecialidadLogic especialidadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEspecialidad;
	public JScrollPane jScrollPanelDatosEdicionEspecialidad;
	public JScrollPane jScrollPanelDatosGeneralEspecialidad;
    
	
	
	//public JScrollPane jScrollPanelDatosEspecialidadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEspecialidad;
	//public JScrollPane jScrollPanelImportacionEspecialidad;
	
	
	
	protected JPanel jPanelAccionesEspecialidad;
	
    protected JPanel jPanelPaginacionEspecialidad;
    protected JPanel jPanelParametrosReportesEspecialidad;
	protected JPanel jPanelParametrosReportesAccionesEspecialidad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Especialidad;
	protected JPanel jPanelParametrosAuxiliar2Especialidad;
	protected JPanel jPanelParametrosAuxiliar3Especialidad;
	protected JPanel jPanelParametrosAuxiliar4Especialidad;
	//protected JPanel jPanelParametrosAuxiliar5Especialidad;
	
	
	
	//protected JPanel jPanelReporteDinamicoEspecialidad;
	//protected JPanel jPanelImportacionEspecialidad;
	
	
	public JTable jTableDatosEspecialidad;
	
	
	
	//public JTable jTableDatosEspecialidadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEspecialidad;
	protected JButton jButtonDuplicarEspecialidad;
	protected JButton jButtonCopiarEspecialidad;
	protected JButton jButtonVerFormEspecialidad;
	protected JButton jButtonNuevoRelacionesEspecialidad;
	protected JButton jButtonModificarEspecialidad;
	
    protected JButton jButtonGuardarCambiosTablaEspecialidad;
	protected JButton jButtonCerrarEspecialidad;
	
	
	protected JButton jButtonRecargarInformacionEspecialidad;
	protected JButton jButtonProcesarInformacionEspecialidad;
	
	
	protected JButton jButtonAnterioresEspecialidad;
	protected JButton jButtonSiguientesEspecialidad;
	protected JButton jButtonNuevoGuardarCambiosEspecialidad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEspecialidad;
	//protected JButton jButtonCerrarReporteDinamicoEspecialidad;
	//protected JButton jButtonGenerarExcelReporteDinamicoEspecialidad;	
	
	
	
	//protected JButton jButtonAbrirImportacionEspecialidad;
	//protected JButton jButtonGenerarImportacionEspecialidad;
	//protected JButton jButtonCerrarImportacionEspecialidad;
	//protected JFileChooser jFileChooserImportacionEspecialidad;
	//protected File fileImportacionEspecialidad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEspecialidad;
	protected JButton jButtonDuplicarToolBarEspecialidad;
	protected JButton jButtonNuevoRelacionesToolBarEspecialidad;
	
	
	public JButton jButtonGuardarCambiosToolBarEspecialidad;
	protected JButton jButtonCopiarToolBarEspecialidad;
	protected JButton jButtonVerFormToolBarEspecialidad;
	public JButton jButtonGuardarCambiosTablaToolBarEspecialidad;
	protected JButton jButtonMostrarOcultarTablaToolBarEspecialidad;
	protected JButton jButtonCerrarToolBarEspecialidad;
	
	protected JButton jButtonRecargarInformacionToolBarEspecialidad;
	protected JButton jButtonProcesarInformacionToolBarEspecialidad;
	protected JButton jButtonAnterioresToolBarEspecialidad;
	protected JButton jButtonSiguientesToolBarEspecialidad;
	protected JButton jButtonNuevoGuardarCambiosToolBarEspecialidad;
	protected JButton jButtonAbrirOrderByToolBarEspecialidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEspecialidad;
	protected JMenuItem jMenuItemDuplicarEspecialidad;
	protected JMenuItem jMenuItemNuevoRelacionesEspecialidad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEspecialidad;
	protected JMenuItem jMenuItemCopiarEspecialidad;
	protected JMenuItem jMenuItemVerFormEspecialidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaEspecialidad;
	protected JMenuItem jMenuItemCerrarEspecialidad;
	protected JMenuItem jMenuItemDetalleCerrarEspecialidad;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEspecialidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarEspecialidad;
	
	protected JMenuItem jMenuItemRecargarInformacionEspecialidad;
	protected JMenuItem jMenuItemProcesarInformacionEspecialidad;
	protected JMenuItem jMenuItemAnterioresEspecialidad;
	protected JMenuItem jMenuItemSiguientesEspecialidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEspecialidad;
	protected JMenuItem jMenuItemAbrirOrderByEspecialidad;
	protected JMenuItem jMenuItemMostrarOcultarEspecialidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEspecialidad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEspecialidad;
	protected JCheckBox jCheckBoxSeleccionadosEspecialidad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEspecialidad;
	protected JCheckBox jCheckBoxConGraficoReporteEspecialidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEspecialidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEspecialidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEspecialidad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEspecialidad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEspecialidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEspecialidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEspecialidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEspecialidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEspecialidad;
	protected JTextField jTextFieldValorCampoGeneralEspecialidad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEspecialidad;
	//public JList<Reporte> jListColumnasSelectReporteEspecialidad;
	//public JScrollPane jScrollColumnasSelectReporteEspecialidad;
	
	//public JLabel jLabelRelacionesSelectReporteEspecialidad;
	//public JList<Reporte> jListRelacionesSelectReporteEspecialidad;
	//public JScrollPane jScrollRelacionesSelectReporteEspecialidad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEspecialidad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEspecialidad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEspecialidad;
	//public JLabel jLabelTiposArchivoReporteDinamicoEspecialidad;
	
		
	//public JLabel jLabelArchivoImportacionEspecialidad;	
	//public JLabel jLabelPathArchivoImportacionEspecialidad;
	//protected JTextField jTextFieldPathArchivoImportacionEspecialidad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEspecialidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEspecialidad;
	
	//public JLabel jLabelColumnaCategoriaValorEspecialidad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEspecialidad;
	
	//public JLabel jLabelColumnasValoresGraficoEspecialidad;
	//public JList<Reporte> jListColumnasValoresGraficoEspecialidad;
	//public JScrollPane jScrollColumnasValoresGraficoEspecialidad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEspecialidad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEspecialidad;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEspecialidad;
	public JPanel jPanelBusquedaPorCodigoEspecialidad;
	public JButton jButtonBusquedaPorCodigoEspecialidad;
	public JPanel jPanelBusquedaPorNombreEspecialidad;
	public JButton jButtonBusquedaPorNombreEspecialidad;
	
	public JPanel jPanelcodigoBusquedaPorCodigoEspecialidad;
	public JLabel jLabelcodigoBusquedaPorCodigoEspecialidad;
	public JTextField jTextFieldcodigoBusquedaPorCodigoEspecialidad;
	public JButton jButtoncodigoBusquedaPorCodigoEspecialidadBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreEspecialidad;
	public JLabel jLabelnombreBusquedaPorNombreEspecialidad;
	public JTextArea jTextAreanombreBusquedaPorNombreEspecialidad;
	public JButton jButtonnombreBusquedaPorNombreEspecialidadBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EspecialidadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Especialidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EspecialidadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Especialidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EspecialidadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Especialidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EspecialidadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Especialidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEspecialidad)	{
		this.jButtonRecargarInformacionEspecialidad = jButtonRecargarInformacionEspecialidad;
	}
	
	public JButton getjButtonProcesarInformacionEspecialidad() {
		return this.jButtonProcesarInformacionEspecialidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEspecialidad)	{
		this.jButtonProcesarInformacionEspecialidad = jButtonProcesarInformacionEspecialidad;
	}
	
	
	public JButton getjButtonRecargarInformacionEspecialidad() {
		return this.jButtonRecargarInformacionEspecialidad;
	}
	
	
	public List<Especialidad> getespecialidads() {
		return this.especialidads;
	}

	public void setespecialidads(List<Especialidad> especialidads) {
		this.especialidads = especialidads;
	}
	
	public List<Especialidad> getespecialidadsAux() {
		return this.especialidadsAux;
	}

	public void setespecialidadsAux(List<Especialidad> especialidadsAux) {
		this.especialidadsAux = especialidadsAux;
	}
	
	public List<Especialidad> getespecialidadsEliminados() {
		return this.especialidadsEliminados;
	}

	public void setEspecialidadsEliminados(List<Especialidad> especialidadsEliminados) {
		this.especialidadsEliminados = especialidadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEspecialidad() {
		return jComboBoxTiposSeleccionarEspecialidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEspecialidad(
			JComboBox jComboBoxTiposSeleccionarEspecialidad) {
		this.jComboBoxTiposSeleccionarEspecialidad = jComboBoxTiposSeleccionarEspecialidad;
	}
	
	public void setBorderResaltarTiposSeleccionarEspecialidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEspecialidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEspecialidad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEspecialidad() {
		return jTextFieldValorCampoGeneralEspecialidad;
	}

	public void setjTextFieldValorCampoGeneralEspecialidad(
			JTextField jTextFieldValorCampoGeneralEspecialidad) {
		this.jTextFieldValorCampoGeneralEspecialidad = jTextFieldValorCampoGeneralEspecialidad;
	}

	public void setBorderResaltarValorCampoGeneralEspecialidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEspecialidad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEspecialidad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEspecialidad() {
		return this.jCheckBoxSeleccionarTodosEspecialidad;
	}

	public void setjCheckBoxSeleccionarTodosEspecialidad(
			JCheckBox jCheckBoxSeleccionarTodosEspecialidad) {
		this.jCheckBoxSeleccionarTodosEspecialidad = jCheckBoxSeleccionarTodosEspecialidad;
	}

	public void setBorderResaltarSeleccionarTodosEspecialidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEspecialidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEspecialidad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEspecialidad() {
		return this.jCheckBoxSeleccionadosEspecialidad;
	}

	public void setjCheckBoxSeleccionadosEspecialidad(
			JCheckBox jCheckBoxSeleccionadosEspecialidad) {
		this.jCheckBoxSeleccionadosEspecialidad = jCheckBoxSeleccionadosEspecialidad;
	}
	
	public void setBorderResaltarSeleccionadosEspecialidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEspecialidad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEspecialidad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEspecialidad() {
		return this.jComboBoxTiposArchivosReportesEspecialidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEspecialidad(
			JComboBox jComboBoxTiposArchivosReportesEspecialidad) {
		this.jComboBoxTiposArchivosReportesEspecialidad = jComboBoxTiposArchivosReportesEspecialidad;
	}

	public void setBorderResaltarTiposArchivosReportesEspecialidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEspecialidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEspecialidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEspecialidad() {
		return this.jComboBoxTiposReportesEspecialidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEspecialidad(
			JComboBox jComboBoxTiposReportesEspecialidad) {
		this.jComboBoxTiposReportesEspecialidad = jComboBoxTiposReportesEspecialidad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEspecialidad() {
	//	return jComboBoxTiposReportesDinamicoEspecialidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEspecialidad(
	//		JComboBox jComboBoxTiposReportesDinamicoEspecialidad) {
	//	this.jComboBoxTiposReportesDinamicoEspecialidad = jComboBoxTiposReportesDinamicoEspecialidad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEspecialidad() {
	//	return jComboBoxTiposArchivosReportesDinamicoEspecialidad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEspecialidad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEspecialidad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEspecialidad = jComboBoxTiposArchivosReportesDinamicoEspecialidad;
	//}
	
	public void setBorderResaltarTiposReportesEspecialidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEspecialidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEspecialidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEspecialidad() {
		return this.jComboBoxTiposGraficosReportesEspecialidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEspecialidad(
			JComboBox jComboBoxTiposGraficosReportesEspecialidad) {
		this.jComboBoxTiposGraficosReportesEspecialidad = jComboBoxTiposGraficosReportesEspecialidad;
	}
	
	public void setBorderResaltarTiposGraficosReportesEspecialidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEspecialidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEspecialidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEspecialidad() {
		return this.jComboBoxTiposPaginacionEspecialidad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEspecialidad(
			JComboBox jComboBoxTiposPaginacionEspecialidad) {
		this.jComboBoxTiposPaginacionEspecialidad = jComboBoxTiposPaginacionEspecialidad;
	}
	
	public void setBorderResaltarTiposPaginacionEspecialidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEspecialidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEspecialidad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEspecialidad() {
		return this.jComboBoxTiposRelacionesEspecialidad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEspecialidad() {
		return this.jComboBoxTiposAccionesEspecialidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEspecialidad(
			JComboBox jComboBoxTiposRelacionesEspecialidad) {
		this.jComboBoxTiposRelacionesEspecialidad = jComboBoxTiposRelacionesEspecialidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEspecialidad(
			JComboBox jComboBoxTiposAccionesEspecialidad) {
		this.jComboBoxTiposAccionesEspecialidad = jComboBoxTiposAccionesEspecialidad;
	}
	
	public void setBorderResaltarTiposRelacionesEspecialidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEspecialidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEspecialidad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEspecialidad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEspecialidad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEspecialidad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEspecialidad() {
	//	return jCheckBoxConGraficoDinamicoEspecialidad;
	//}

	//public void setjCheckBoxConGraficoDinamicoEspecialidad(
	//		JCheckBox jCheckBoxConGraficoDinamicoEspecialidad) {
	//	this.jCheckBoxConGraficoDinamicoEspecialidad = jCheckBoxConGraficoDinamicoEspecialidad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEspecialidad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEspecialidad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEspecialidad .setBorder(borderResaltar);		
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
		this.especialidadSessionBean=new EspecialidadSessionBean();
		
		this.especialidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.especialidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.especialidadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EspecialidadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EspecialidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EspecialidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EspecialidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EspecialidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Especialidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
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
		
		EspecialidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Especialidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEspecialidad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEspecialidad,this.jTtoolBarEspecialidad,
							"nuevo","nuevo","Nuevo"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEspecialidad,this.jTtoolBarEspecialidad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEspecialidad,this.jTtoolBarEspecialidad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEspecialidad,this.jTtoolBarEspecialidad,
							"duplicar","duplicar","Duplicar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEspecialidad,this.jTtoolBarEspecialidad,
							"copiar","copiar","Copiar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEspecialidad,this.jTtoolBarEspecialidad,
							"ver_form","ver_form","Ver"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEspecialidad,this.jTtoolBarEspecialidad,
							"recargar","recargar","Recargar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEspecialidad,this.jTtoolBarEspecialidad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEspecialidad,this.jTtoolBarEspecialidad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEspecialidad,this.jTtoolBarEspecialidad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEspecialidad,this.jTtoolBarEspecialidad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEspecialidad,this.jTtoolBarEspecialidad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEspecialidad,this.jTtoolBarEspecialidad,
							"cerrar","cerrar","Salir"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEspecialidad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEspecialidad;
			
				this.jButtonProcesarInformacionToolBarEspecialidad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEspecialidad;
				
		//protected JButton jButtonModificarToolBarEspecialidad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEspecialidad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEspecialidad=new JMenuMe("General");
		this.jmenuArchivoEspecialidad=new JMenuMe("Archivo");
		this.jmenuAccionesEspecialidad=new JMenuMe("Acciones");
		this.jmenuDatosEspecialidad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEspecialidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEspecialidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEspecialidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEspecialidad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEspecialidad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEspecialidad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEspecialidad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEspecialidad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEspecialidad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEspecialidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEspecialidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEspecialidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEspecialidad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEspecialidad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEspecialidad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEspecialidad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEspecialidad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEspecialidad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEspecialidad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEspecialidad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEspecialidad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEspecialidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEspecialidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEspecialidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEspecialidad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEspecialidad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEspecialidad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEspecialidad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEspecialidad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEspecialidad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEspecialidad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEspecialidad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEspecialidad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEspecialidad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEspecialidad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEspecialidad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEspecialidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEspecialidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEspecialidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEspecialidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEspecialidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEspecialidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEspecialidad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEspecialidad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEspecialidad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEspecialidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEspecialidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEspecialidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEspecialidad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEspecialidad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEspecialidad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEspecialidad.add(this.jMenuItemCerrarEspecialidad);
			
			this.jmenuAccionesEspecialidad.add(this.jMenuItemNuevoEspecialidad);
			this.jmenuAccionesEspecialidad.add(this.jMenuItemNuevoGuardarCambiosEspecialidad);
			this.jmenuAccionesEspecialidad.add(this.jMenuItemNuevoRelacionesEspecialidad);
			this.jmenuAccionesEspecialidad.add(this.jMenuItemGuardarCambiosTablaEspecialidad);		
			this.jmenuAccionesEspecialidad.add(this.jMenuItemDuplicarEspecialidad);		
			this.jmenuAccionesEspecialidad.add(this.jMenuItemCopiarEspecialidad);		
			this.jmenuAccionesEspecialidad.add(this.jMenuItemVerFormEspecialidad);		
			
			this.jmenuDatosEspecialidad.add(this.jMenuItemRecargarInformacionEspecialidad);				
			this.jmenuDatosEspecialidad.add(this.jMenuItemAnterioresEspecialidad);				
			this.jmenuDatosEspecialidad.add(this.jMenuItemSiguientesEspecialidad);				
			this.jmenuDatosEspecialidad.add(this.jMenuItemAbrirOrderByEspecialidad);				
			this.jmenuDatosEspecialidad.add(this.jMenuItemMostrarOcultarEspecialidad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEspecialidad.add(this.jMenuItemGuardarCambiosEspecialidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEspecialidad.add(this.jmenuArchivoEspecialidad);		
			this.jmenuBarEspecialidad.add(this.jmenuAccionesEspecialidad);		
			this.jmenuBarEspecialidad.add(this.jmenuDatosEspecialidad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEspecialidad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEspecialidad() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoEspecialidad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoEspecialidad.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoEspecialidad= new JButtonMe();
		this.jButtonBusquedaPorCodigoEspecialidad.setText("Buscar");
		this.jButtonBusquedaPorCodigoEspecialidad.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoEspecialidad,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoEspecialidad = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoEspecialidad.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoEspecialidad.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoEspecialidad,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoEspecialidad= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoEspecialidad,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreEspecialidad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreEspecialidad.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreEspecialidad= new JButtonMe();
		this.jButtonBusquedaPorNombreEspecialidad.setText("Buscar");
		this.jButtonBusquedaPorNombreEspecialidad.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreEspecialidad,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreEspecialidad = new JLabelMe();
		jLabelnombreBusquedaPorNombreEspecialidad.setText("Nombre :");
		jLabelnombreBusquedaPorNombreEspecialidad.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreEspecialidad,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreEspecialidad= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreEspecialidad,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEspecialidad=new JTabbedPane();


		this.jTabbedPaneBusquedasEspecialidad.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEspecialidad.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEspecialidad.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEspecialidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEspecialidad,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEspecialidad = new EspecialidadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Especialidad DATOS");
			this.jInternalFrameDetalleFormEspecialidad = new EspecialidadDetalleFormJInternalFrame(jDesktopPane,this.especialidadSessionBean.getConGuardarRelaciones(),this.especialidadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEspecialidad = null;//new EspecialidadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEspecialidad= new GridBagLayout();
		
		
		this.jTableDatosEspecialidad = new JTableMe();      
		
		String sToolTipEspecialidad="";
		sToolTipEspecialidad=EspecialidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEspecialidad+="(Facturacion.Especialidad)";
		}
		
		if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipEspecialidad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEspecialidad.setToolTipText(sToolTipEspecialidad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEspecialidad);
		this.jTableDatosEspecialidad.setAutoCreateRowSorter(true);
		this.jTableDatosEspecialidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEspecialidad.setRowSelectionAllowed(true);
		this.jTableDatosEspecialidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEspecialidad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEspecialidad = new JButtonMe();
		this.jButtonDuplicarEspecialidad = new JButtonMe();
		this.jButtonCopiarEspecialidad = new JButtonMe();
		this.jButtonVerFormEspecialidad = new JButtonMe();
		this.jButtonNuevoRelacionesEspecialidad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEspecialidad = new JButtonMe();
		this.jButtonCerrarEspecialidad = new JButtonMe();
		
		this.jScrollPanelDatosEspecialidad = new JScrollPane();   
        this.jScrollPanelDatosGeneralEspecialidad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEspecialidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Especialidad";
		
		if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Especialidads" + this.sPath));
		} else {
			this.jScrollPanelDatosEspecialidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEspecialidad.setToolTipText("Acciones");
        this.jPanelAccionesEspecialidad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEspecialidad=new ReporteDinamicoJInternalFrame(EspecialidadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEspecialidad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEspecialidad=new ImportacionJInternalFrame(EspecialidadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEspecialidad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEspecialidad = new JButtonMe();
		
		this.jButtonAbrirOrderByEspecialidad.setText("Orden");
		this.jButtonAbrirOrderByEspecialidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEspecialidad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEspecialidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEspecialidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEspecialidad,false,this);
			
			//this.cargarOrderByEspecialidad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEspecialidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEspecialidad,true,this);
			
			//this.cargarOrderByEspecialidad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEspecialidad.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosEspecialidad.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosEspecialidad.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosEspecialidad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEspecialidad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEspecialidad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEspecialidad.setText("Nuevo");
		this.jButtonDuplicarEspecialidad.setText("Duplicar");
		this.jButtonCopiarEspecialidad.setText("Copiar");
		this.jButtonVerFormEspecialidad.setText("Ver");
		this.jButtonNuevoRelacionesEspecialidad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEspecialidad.setText("Guardar");
		this.jButtonCerrarEspecialidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEspecialidad,"nuevo_button","Nuevo",this.especialidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEspecialidad,"duplicar_button","Duplicar",this.especialidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEspecialidad,"copiar_button","Copiar",this.especialidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEspecialidad,"ver_form","Ver",this.especialidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEspecialidad,"nuevorelaciones_button","Nuevo Rel",this.especialidadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEspecialidad,"guardarcambiostabla_button","Guardar",this.especialidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEspecialidad,"cerrar_button","Salir",this.especialidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEspecialidad.setToolTipText("Nuevo"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEspecialidad.setToolTipText("Duplicar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEspecialidad.setToolTipText("Copiar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEspecialidad.setToolTipText("Ver"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEspecialidad.setToolTipText("Nuevo Rel"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEspecialidad.setToolTipText("Guardar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEspecialidad.setToolTipText("Salir"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEspecialidad";
		inputMap = this.jButtonNuevoEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEspecialidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEspecialidad"));
		
		//DUPLICAR
		sMapKey = "DuplicarEspecialidad";
		inputMap = this.jButtonDuplicarEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEspecialidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEspecialidad"));
		
		//COPIAR
		sMapKey = "CopiarEspecialidad";
		inputMap = this.jButtonCopiarEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEspecialidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEspecialidad"));
		
		//VEr FORM
		sMapKey = "VerFormEspecialidad";
		inputMap = this.jButtonVerFormEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEspecialidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEspecialidad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEspecialidad";
		inputMap = this.jButtonNuevoRelacionesEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEspecialidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEspecialidad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEspecialidad";
		inputMap = this.jButtonModificarEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEspecialidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEspecialidad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEspecialidad";
		inputMap = this.jButtonCerrarEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEspecialidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEspecialidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEspecialidad";
		inputMap = this.jButtonGuardarCambiosTablaEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEspecialidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEspecialidad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEspecialidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEspecialidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEspecialidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Especialidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Especialidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Especialidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Especialidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Especialidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEspecialidad.setName("jPanelParametrosReportesEspecialidad"); 
		
		this.jPanelParametrosReportesAccionesEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEspecialidad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEspecialidad.setName("jPanelParametrosReportesAccionesEspecialidad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEspecialidad = new JButtonMe();
		this.jButtonRecargarInformacionEspecialidad.setText("Recargar");
		this.jButtonRecargarInformacionEspecialidad.setToolTipText("Recargar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEspecialidad,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEspecialidad = new JButtonMe();
		this.jButtonProcesarInformacionEspecialidad.setText("Procesar");
		this.jButtonProcesarInformacionEspecialidad.setToolTipText("Procesar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEspecialidad.setVisible(false);
			
		this.jButtonProcesarInformacionEspecialidad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEspecialidad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEspecialidad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEspecialidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEspecialidad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEspecialidad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEspecialidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEspecialidad.setText("TIPO");       
		this.jComboBoxTiposReportesEspecialidad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEspecialidad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEspecialidad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEspecialidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEspecialidad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEspecialidad.setText("Paginacion");
		this.jComboBoxTiposPaginacionEspecialidad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEspecialidad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEspecialidad.setText("Accion");
		this.jComboBoxTiposRelacionesEspecialidad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEspecialidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEspecialidad.setText("Accion");
		this.jComboBoxTiposAccionesEspecialidad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEspecialidad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEspecialidad.setText("Accion");
		this.jComboBoxTiposSeleccionarEspecialidad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEspecialidad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEspecialidad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEspecialidad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEspecialidad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEspecialidad = new JLabelMe();
		
		this.jLabelAccionesEspecialidad.setText("Acciones");		
		this.jLabelAccionesEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEspecialidad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEspecialidad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEspecialidad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEspecialidad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEspecialidad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEspecialidad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEspecialidad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEspecialidad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEspecialidad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEspecialidad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEspecialidad.setText("Graf.");
		this.jCheckBoxConGraficoReporteEspecialidad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEspecialidad = new JButtonMe();
		//this.jButtonAnterioresEspecialidad.setText("<<");
        this.jButtonAnterioresEspecialidad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEspecialidad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEspecialidad = new JButtonMe();
		//this.jButtonSiguientesEspecialidad.setText(">>");
        this.jButtonSiguientesEspecialidad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEspecialidad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEspecialidad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEspecialidad.setText("Nue");
        this.jButtonNuevoGuardarCambiosEspecialidad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEspecialidad,"nuevoguardarcambios_button","Nue",this.especialidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEspecialidad";
		inputMap = this.jButtonNuevoGuardarCambiosEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEspecialidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEspecialidad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEspecialidad";
		inputMap = this.jButtonRecargarInformacionEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEspecialidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEspecialidad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEspecialidad";
		inputMap = this.jButtonSiguientesEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEspecialidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEspecialidad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEspecialidad";
		inputMap = this.jButtonAnterioresEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEspecialidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEspecialidad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEspecialidad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEspecialidad.setMinimumSize(new Dimension(this.getWidth(),EspecialidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EspecialidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEspecialidad.setMaximumSize(new Dimension(this.getWidth(),EspecialidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EspecialidadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEspecialidad.setPreferredSize(new Dimension(this.getWidth(),EspecialidadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EspecialidadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEspecialidad = new GridBagLayout();

			this.jPanelPaginacionEspecialidad.setLayout(gridaBagLayoutPaginacionEspecialidad);						
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.gridy = 0;
			this.gridBagConstraintsEspecialidad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEspecialidad.add(this.jButtonAnterioresEspecialidad, this.gridBagConstraintsEspecialidad);
					
						
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEspecialidad.gridy = 0;
			
			this.jPanelPaginacionEspecialidad.add(this.jButtonNuevoGuardarCambiosEspecialidad, this.gridBagConstraintsEspecialidad);
						
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEspecialidad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEspecialidad.gridy = 0;
			this.jPanelPaginacionEspecialidad.add(this.jButtonSiguientesEspecialidad, this.gridBagConstraintsEspecialidad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.gridy = 1;
			this.gridBagConstraintsEspecialidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEspecialidad.add(this.jButtonNuevoEspecialidad, this.gridBagConstraintsEspecialidad);
						
			
			
			if(!this.especialidadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEspecialidad = new GridBagConstraints();
				this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEspecialidad.gridy = 1;
				this.gridBagConstraintsEspecialidad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEspecialidad.add(this.jButtonGuardarCambiosTablaEspecialidad, this.gridBagConstraintsEspecialidad);
			}
			
			
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.gridy = 1;
			this.gridBagConstraintsEspecialidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEspecialidad.add(this.jButtonDuplicarEspecialidad, this.gridBagConstraintsEspecialidad);
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.gridy = 1;
			this.gridBagConstraintsEspecialidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEspecialidad.add(this.jButtonCopiarEspecialidad, this.gridBagConstraintsEspecialidad);
		
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.gridy = 1;
			this.gridBagConstraintsEspecialidad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEspecialidad.add(this.jButtonVerFormEspecialidad, this.gridBagConstraintsEspecialidad);
		
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.gridy = 1;
			this.gridBagConstraintsEspecialidad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEspecialidad.add(this.jButtonCerrarEspecialidad, this.gridBagConstraintsEspecialidad);
		
		
		
		this.jButtonRecargarInformacionEspecialidad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEspecialidad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEspecialidad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEspecialidad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEspecialidad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEspecialidad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEspecialidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEspecialidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEspecialidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEspecialidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEspecialidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEspecialidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEspecialidad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEspecialidad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEspecialidad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEspecialidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEspecialidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEspecialidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEspecialidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEspecialidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEspecialidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEspecialidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEspecialidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEspecialidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEspecialidad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEspecialidad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEspecialidad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEspecialidad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEspecialidad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEspecialidad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEspecialidad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEspecialidad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEspecialidad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEspecialidad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEspecialidad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEspecialidad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEspecialidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEspecialidad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Especialidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Especialidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Especialidad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Especialidad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEspecialidad.setLayout(gridaBagParametrosReportesEspecialidad);
			this.jPanelParametrosReportesAccionesEspecialidad.setLayout(gridaBagParametrosReportesAccionesEspecialidad);
			
			
			this.jPanelParametrosAuxiliar1Especialidad.setLayout(gridaBagParametrosAuxiliar1Especialidad);
			this.jPanelParametrosAuxiliar2Especialidad.setLayout(gridaBagParametrosAuxiliar2Especialidad);
			this.jPanelParametrosAuxiliar3Especialidad.setLayout(gridaBagParametrosAuxiliar3Especialidad);
			this.jPanelParametrosAuxiliar4Especialidad.setLayout(gridaBagParametrosAuxiliar4Especialidad);
			//this.jPanelParametrosAuxiliar5Especialidad.setLayout(gridaBagParametrosAuxiliar2Especialidad);			
			
			
			
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEspecialidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEspecialidad.add(this.jButtonRecargarInformacionEspecialidad, this.gridBagConstraintsEspecialidad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEspecialidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEspecialidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Especialidad.add(this.jComboBoxTiposPaginacionEspecialidad, this.gridBagConstraintsEspecialidad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEspecialidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEspecialidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Especialidad.add(this.jCheckBoxConAltoMaximoTablaEspecialidad, this.gridBagConstraintsEspecialidad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEspecialidad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEspecialidad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Especialidad.add(this.jComboBoxTiposArchivosReportesEspecialidad, this.gridBagConstraintsEspecialidad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEspecialidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEspecialidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEspecialidad.add(this.jPanelParametrosAuxiliar1Especialidad, this.gridBagConstraintsEspecialidad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEspecialidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Especialidad.add(this.jComboBoxTiposReportesEspecialidad, this.gridBagConstraintsEspecialidad);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEspecialidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEspecialidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEspecialidad.add(this.jPanelParametrosAuxiliar4Especialidad, this.gridBagConstraintsEspecialidad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEspecialidad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEspecialidad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEspecialidad.add(this.jComboBoxTiposReportesEspecialidad, this.gridBagConstraintsEspecialidad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEspecialidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEspecialidad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEspecialidad.add(this.jCheckBoxGenerarReporteEspecialidad, this.gridBagConstraintsEspecialidad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEspecialidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEspecialidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEspecialidad.add(this.jPanelParametrosAuxiliar2Especialidad, this.gridBagConstraintsEspecialidad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEspecialidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEspecialidad.add(this.jLabelAccionesEspecialidad, this.gridBagConstraintsEspecialidad);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEspecialidad = new GridBagConstraints();
				this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEspecialidad.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEspecialidad.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEspecialidad.add(this.jButtonAbrirOrderByEspecialidad, this.gridBagConstraintsEspecialidad);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEspecialidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEspecialidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEspecialidad.add(this.jComboBoxTiposSeleccionarEspecialidad, this.gridBagConstraintsEspecialidad);			
			
			
			/*
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEspecialidad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEspecialidad.add(this.jCheckBoxSeleccionarTodosEspecialidad, this.gridBagConstraintsEspecialidad);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEspecialidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Especialidad.add(this.jCheckBoxSeleccionarTodosEspecialidad, this.gridBagConstraintsEspecialidad);															
				
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEspecialidad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Especialidad.add(this.jCheckBoxSeleccionadosEspecialidad, this.gridBagConstraintsEspecialidad);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEspecialidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEspecialidad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEspecialidad.add(this.jPanelParametrosAuxiliar3Especialidad, this.gridBagConstraintsEspecialidad);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEspecialidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEspecialidad.add(this.jComboBoxTiposAccionesEspecialidad, this.gridBagConstraintsEspecialidad);
	
				
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEspecialidad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEspecialidad.add(this.jTextFieldValorCampoGeneralEspecialidad, this.gridBagConstraintsEspecialidad);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEspecialidad = new GridBagLayout();

			this.jScrollPanelDatosEspecialidad.setLayout(gridaBagLayoutDatosEspecialidad);
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.gridy = 0;
			this.gridBagConstraintsEspecialidad.gridx = 0;
			
			this.jScrollPanelDatosEspecialidad.add(this.jTableDatosEspecialidad, this.gridBagConstraintsEspecialidad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEspecialidad.setViewportView(this.jTableDatosEspecialidad);
		this.jTableDatosEspecialidad.setFillsViewportHeight(true);
		this.jTableDatosEspecialidad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEspecialidad= new GridBagLayout();
		this.jPanelAccionesEspecialidad.setLayout(gridaBagLayoutAccionesEspecialidad);
		
		
		/*	
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEspecialidad.gridy = 0;
		this.gridBagConstraintsEspecialidad.gridx = 0;
			
		this.jPanelAccionesEspecialidad.add(this.jButtonNuevoEspecialidad, this.gridBagConstraintsEspecialidad);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoEspecialidad= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoEspecialidad.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoEspecialidad.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoEspecialidad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoEspecialidad.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoEspecialidad.setLayout(gridaBagLayoutBusquedaPorCodigoEspecialidad);

		gridBagConstraintsEspecialidad = new GridBagConstraints();
		gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEspecialidad.gridy = 0;
		gridBagConstraintsEspecialidad.gridx = 0;
		jPanelBusquedaPorCodigoEspecialidad.add(jLabelcodigoBusquedaPorCodigoEspecialidad, gridBagConstraintsEspecialidad);

		gridBagConstraintsEspecialidad = new GridBagConstraints();
		gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEspecialidad.gridy = 0;
		gridBagConstraintsEspecialidad.gridx = 1;
		jPanelBusquedaPorCodigoEspecialidad.add(jTextFieldcodigoBusquedaPorCodigoEspecialidad, gridBagConstraintsEspecialidad);

		gridBagConstraintsEspecialidad = new GridBagConstraints();
		gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEspecialidad.gridy = 1;
		gridBagConstraintsEspecialidad.gridx =1;
		jPanelBusquedaPorCodigoEspecialidad.add(jButtonBusquedaPorCodigoEspecialidad, gridBagConstraintsEspecialidad);

		jTabbedPaneBusquedasEspecialidad.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoEspecialidad);
		jTabbedPaneBusquedasEspecialidad.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreEspecialidad= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreEspecialidad.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreEspecialidad.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreEspecialidad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreEspecialidad.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreEspecialidad.setLayout(gridaBagLayoutBusquedaPorNombreEspecialidad);

		gridBagConstraintsEspecialidad = new GridBagConstraints();
		gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEspecialidad.gridy = 0;
		gridBagConstraintsEspecialidad.gridx = 0;
		jPanelBusquedaPorNombreEspecialidad.add(jLabelnombreBusquedaPorNombreEspecialidad, gridBagConstraintsEspecialidad);

		gridBagConstraintsEspecialidad = new GridBagConstraints();
		gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEspecialidad.gridy = 0;
		gridBagConstraintsEspecialidad.gridx = 1;
		jPanelBusquedaPorNombreEspecialidad.add(jTextAreanombreBusquedaPorNombreEspecialidad, gridBagConstraintsEspecialidad);

		gridBagConstraintsEspecialidad = new GridBagConstraints();
		gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEspecialidad.gridy = 1;
		gridBagConstraintsEspecialidad.gridx =1;
		jPanelBusquedaPorNombreEspecialidad.add(jButtonBusquedaPorNombreEspecialidad, gridBagConstraintsEspecialidad);

		jTabbedPaneBusquedasEspecialidad.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreEspecialidad);
		jTabbedPaneBusquedasEspecialidad.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEspecialidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEspecialidad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.especialidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();						
			this.gridBagConstraintsEspecialidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEspecialidad.gridx = 0;		
			//this.gridBagConstraintsEspecialidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEspecialidad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEspecialidad, this.gridBagConstraintsEspecialidad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEspecialidad.gridx = 0;		
		//this.gridBagConstraintsEspecialidad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEspecialidad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEspecialidad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEspecialidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEspecialidad.gridx = 0;		
			this.gridBagConstraintsEspecialidad.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEspecialidad.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEspecialidad, this.gridBagConstraintsEspecialidad);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEspecialidad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEspecialidad, this.gridBagConstraintsEspecialidad);								
		
		
		/*
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEspecialidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEspecialidad, this.gridBagConstraintsEspecialidad);
		*/		
		
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEspecialidad.gridx =0;
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEspecialidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEspecialidad, this.gridBagConstraintsEspecialidad);
				
		
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEspecialidad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEspecialidad, this.gridBagConstraintsEspecialidad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EspecialidadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEspecialidad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEspecialidad = new GridBagLayout();
			this.jPanelBusquedasParametrosEspecialidad.setLayout(gridaBagLayoutBusquedasParametrosEspecialidad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEspecialidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEspecialidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEspecialidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEspecialidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEspecialidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEspecialidad, this.gridBagConstraintsEspecialidad);
			
			
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEspecialidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEspecialidad, this.gridBagConstraintsEspecialidad);
		
			
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEspecialidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEspecialidad, this.gridBagConstraintsEspecialidad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEspecialidad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEspecialidad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEspecialidad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEspecialidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEspecialidad.setName("jPanelReporteDinamicoEspecialidad"); 
		
		this.jPanelReporteDinamicoEspecialidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEspecialidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEspecialidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEspecialidad.setLayout(gridaBagLayoutReporteDinamicoEspecialidad);
		
		
		this.jInternalFrameReporteDinamicoEspecialidad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEspecialidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEspecialidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEspecialidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEspecialidad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEspecialidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEspecialidad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEspecialidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEspecialidad.setResizable(true);
	    this.jInternalFrameReporteDinamicoEspecialidad.setClosable(true);
	    this.jInternalFrameReporteDinamicoEspecialidad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEspecialidad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEspecialidad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEspecialidad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Especialidads"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEspecialidad = new JLabelMe();

		this.jLabelColumnasSelectReporteEspecialidad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEspecialidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEspecialidad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEspecialidad.add(this.jLabelColumnasSelectReporteEspecialidad, this.gridBagConstraintsEspecialidad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEspecialidad = new JList<Reporte>();
		this.jListColumnasSelectReporteEspecialidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEspecialidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEspecialidad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEspecialidad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEspecialidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEspecialidad=new JScrollPane(this.jListColumnasSelectReporteEspecialidad);
			
			this.jScrollColumnasSelectReporteEspecialidad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEspecialidad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEspecialidad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEspecialidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEspecialidad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEspecialidad.add(this.jListColumnasSelectReporteEspecialidad, this.gridBagConstraintsEspecialidad);
		this.jPanelReporteDinamicoEspecialidad.add(this.jScrollColumnasSelectReporteEspecialidad, this.gridBagConstraintsEspecialidad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEspecialidad = new JLabelMe();

		this.jLabelRelacionesSelectReporteEspecialidad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEspecialidad = new JList<Reporte>();
		this.jListRelacionesSelectReporteEspecialidad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEspecialidad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEspecialidad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEspecialidad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEspecialidad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEspecialidad=new JScrollPane(this.jListRelacionesSelectReporteEspecialidad);
			
			this.jScrollRelacionesSelectReporteEspecialidad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEspecialidad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEspecialidad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEspecialidad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEspecialidad = new JComboBoxMe();
		this.jListColumnasValoresGraficoEspecialidad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEspecialidad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEspecialidad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEspecialidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEspecialidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEspecialidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEspecialidad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEspecialidad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEspecialidad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEspecialidad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEspecialidad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEspecialidad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEspecialidad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEspecialidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEspecialidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEspecialidad.add(this.jLabelGenerarExcelReporteDinamicoEspecialidad, this.gridBagConstraintsEspecialidad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEspecialidad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEspecialidad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEspecialidad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEspecialidad.setToolTipText("Generar EXCEL"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		//this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEspecialidad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEspecialidad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEspecialidad.add(this.jButtonGenerarExcelReporteDinamicoEspecialidad, this.gridBagConstraintsEspecialidad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEspecialidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEspecialidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEspecialidad.add(this.jComboBoxTiposReportesDinamicoEspecialidad, this.gridBagConstraintsEspecialidad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEspecialidad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEspecialidad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEspecialidad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEspecialidad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEspecialidad.add(this.jLabelTiposArchivoReporteDinamicoEspecialidad, this.gridBagConstraintsEspecialidad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEspecialidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEspecialidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEspecialidad.add(this.jComboBoxTiposArchivosReportesDinamicoEspecialidad, this.gridBagConstraintsEspecialidad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEspecialidad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEspecialidad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEspecialidad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEspecialidad.setToolTipText("Generar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEspecialidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEspecialidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEspecialidad.add(this.jButtonGenerarReporteDinamicoEspecialidad, this.gridBagConstraintsEspecialidad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEspecialidad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEspecialidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEspecialidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEspecialidad.setToolTipText("Cancelar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEspecialidad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEspecialidad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEspecialidad.add(this.jButtonCerrarReporteDinamicoEspecialidad, this.gridBagConstraintsEspecialidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEspecialidad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEspecialidad= new JScrollPane(jPanelReporteDinamicoEspecialidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEspecialidad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEspecialidad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEspecialidad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Especialidads"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEspecialidad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEspecialidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEspecialidad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEspecialidad);
		this.jInternalFrameReporteDinamicoEspecialidad.getContentPane().add(this.jScrollPanelReporteDinamicoEspecialidad, this.gridBagConstraintsEspecialidad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEspecialidad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEspecialidad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEspecialidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEspecialidad.setName("jPanelImportacionEspecialidad"); 
		
		this.jPanelImportacionEspecialidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEspecialidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEspecialidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEspecialidad.setLayout(gridaBagLayoutImportacionEspecialidad);
		
		
		this.jInternalFrameImportacionEspecialidad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEspecialidad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEspecialidad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEspecialidad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEspecialidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEspecialidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEspecialidad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEspecialidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEspecialidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEspecialidad.setResizable(true);
	    this.jInternalFrameImportacionEspecialidad.setClosable(true);
	    this.jInternalFrameImportacionEspecialidad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEspecialidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEspecialidad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEspecialidad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEspecialidad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEspecialidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEspecialidad.setResizable(true);
	    this.jInternalFrameImportacionEspecialidad.setClosable(true);
	    this.jInternalFrameImportacionEspecialidad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEspecialidad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEspecialidad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEspecialidad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Especialidads"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEspecialidad = new JLabelMe();

		this.jLabelArchivoImportacionEspecialidad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEspecialidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsEspecialidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEspecialidad.add(this.jLabelArchivoImportacionEspecialidad, this.gridBagConstraintsEspecialidad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEspecialidad = new JFileChooser();		
		this.jFileChooserImportacionEspecialidad.setToolTipText("ESCOGER ARCHIVO"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEspecialidad = new JButtonMe();
		this.jButtonAbrirImportacionEspecialidad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEspecialidad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEspecialidad.setToolTipText("Generar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEspecialidad.gridy = iPosYImportacion;
		this.gridBagConstraintsEspecialidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEspecialidad.add(this.jButtonAbrirImportacionEspecialidad, this.gridBagConstraintsEspecialidad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEspecialidad = new JLabelMe();

		this.jLabelPathArchivoImportacionEspecialidad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEspecialidad.gridy = iPosYImportacion;		
		this.gridBagConstraintsEspecialidad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEspecialidad.add(this.jLabelPathArchivoImportacionEspecialidad, this.gridBagConstraintsEspecialidad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEspecialidad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEspecialidad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEspecialidad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEspecialidad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEspecialidad.gridy = iPosYImportacion;
		this.gridBagConstraintsEspecialidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEspecialidad.add(this.jTextFieldPathArchivoImportacionEspecialidad, this.gridBagConstraintsEspecialidad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEspecialidad = new JButtonMe();
		this.jButtonGenerarImportacionEspecialidad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEspecialidad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEspecialidad.setToolTipText("Generar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEspecialidad.gridy = iPosYImportacion;
		this.gridBagConstraintsEspecialidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEspecialidad.add(this.jButtonGenerarImportacionEspecialidad, this.gridBagConstraintsEspecialidad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEspecialidad = new JButtonMe();
		this.jButtonCerrarImportacionEspecialidad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEspecialidad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEspecialidad.setToolTipText("Cancelar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEspecialidad.gridy = iPosYImportacion;
		this.gridBagConstraintsEspecialidad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEspecialidad.add(this.jButtonCerrarImportacionEspecialidad, this.gridBagConstraintsEspecialidad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEspecialidad = new GridBagLayout();
		
		this.jScrollPanelImportacionEspecialidad= new JScrollPane(jPanelImportacionEspecialidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy =iPosYImportacion;
		this.gridBagConstraintsEspecialidad.gridx =iPosXImportacion;
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEspecialidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEspecialidad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEspecialidad);
		this.jInternalFrameImportacionEspecialidad.getContentPane().add(this.jScrollPanelImportacionEspecialidad, this.gridBagConstraintsEspecialidad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEspecialidad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEspecialidad = new JButtonMe();
			this.jButtonAbrirOrderByEspecialidad.setText("Orden");
			this.jButtonAbrirOrderByEspecialidad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEspecialidad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEspecialidad";
			inputMap = this.jButtonAbrirOrderByEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEspecialidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEspecialidad"));
		
		
			GridBagLayout gridaBagLayoutOrderByEspecialidad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEspecialidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEspecialidad.setName("jPanelOrderByEspecialidad"); 
			
			this.jPanelOrderByEspecialidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEspecialidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEspecialidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEspecialidad.setLayout(gridaBagLayoutOrderByEspecialidad);
			
			
			this.jTableDatosEspecialidadOrderBy = new JTableMe();        
			this.jTableDatosEspecialidadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEspecialidadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEspecialidadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEspecialidadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEspecialidadOrderBy.setViewportView(this.jTableDatosEspecialidadOrderBy);
			this.jTableDatosEspecialidadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEspecialidadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEspecialidad= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEspecialidad= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEspecialidad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEspecialidad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEspecialidad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEspecialidad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEspecialidad.setTitle("Orden");
			this.jInternalFrameOrderByEspecialidad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEspecialidad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEspecialidad.setResizable(true);
			this.jInternalFrameOrderByEspecialidad.setClosable(true);
			this.jInternalFrameOrderByEspecialidad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEspecialidad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEspecialidad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEspecialidad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Especialidads"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEspecialidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEspecialidad.ipady =150;
				
			this.jPanelOrderByEspecialidad.add(jScrollPanelDatosEspecialidadOrderBy, this.gridBagConstraintsEspecialidad);//this.jTableDatosEspecialidadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEspecialidad = new JButtonMe();
			this.jButtonCerrarOrderByEspecialidad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEspecialidad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEspecialidad.setToolTipText("Cancelar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEspecialidad.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEspecialidad.add(this.jButtonCerrarOrderByEspecialidad, this.gridBagConstraintsEspecialidad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEspecialidad = new GridBagLayout();
			
			this.jScrollPanelOrderByEspecialidad= new JScrollPane(jPanelOrderByEspecialidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.gridy =iPosYOrderBy;
			this.gridBagConstraintsEspecialidad.gridx =iPosXOrderBy;
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEspecialidad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEspecialidad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEspecialidad);
			
			this.jInternalFrameOrderByEspecialidad.getContentPane().add(this.jScrollPanelOrderByEspecialidad, this.gridBagConstraintsEspecialidad);			
		
		} else {
			this.jButtonAbrirOrderByEspecialidad = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.especialidadSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEspecialidad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEspecialidad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEspecialidad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEspecialidad.getRowHeight();//EspecialidadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EspecialidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEspecialidad.isSelected()) {
					iHeightTable=EspecialidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EspecialidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EspecialidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EspecialidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEspecialidad.isSelected()) {
					iHeightTable=EspecialidadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EspecialidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EspecialidadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEspecialidad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEspecialidad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEspecialidad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEspecialidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEspecialidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEspecialidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEspecialidad!=null && this.jInternalFrameOrderByEspecialidad.getjTableDatosOrderBy()!=null) {
			//if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEspecialidad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEspecialidad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEspecialidad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEspecialidad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEspecialidad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEspecialidad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEspecialidad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEspecialidad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEspecialidad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEspecialidad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=especialidadLogic.getEspecialidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=especialidads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Especialidad> TraerEspecialidadBeans(List<Especialidad> especialidads,ArrayList<Classe> classes)throws Exception {
		try {
			for(Especialidad especialidad:especialidads) {
					
				if(!(EspecialidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EspecialidadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					especialidad.setsDetalleGeneralEntityReporte(EspecialidadConstantesFunciones.getEspecialidadDescripcion(especialidad));
										
						
					
						
					
				} else  {
							
					//especialidad.setsDetalleGeneralEntityReporte(especialidad.getsDetalleGeneralEntityReporte());
										
				}
				
				//especialidadbeans.add(especialidadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return especialidads;
    }
	//PARA REPORTES FIN
}
