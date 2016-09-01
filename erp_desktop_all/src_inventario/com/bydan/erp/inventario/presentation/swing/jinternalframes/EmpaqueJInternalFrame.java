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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

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
import com.bydan.erp.inventario.util.EmpaqueConstantesFunciones;

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
public class EmpaqueJInternalFrame extends EmpaqueBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEmpaque;
	
	protected JMenuBar jmenuBarEmpaque;
	
	protected JMenu jmenuEmpaque;
	protected JMenu jmenuDatosEmpaque;
	protected JMenu jmenuArchivoEmpaque;
	protected JMenu jmenuAccionesEmpaque;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEmpaque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpaque;	
	protected GridBagConstraints gridBagConstraintsEmpaque;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EmpaqueDetalleFormJInternalFrame jInternalFrameDetalleFormEmpaque;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEmpaque;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEmpaque;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public EmpaqueSessionBean empaqueSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Empaque> empaques;		
	public List<Empaque> empaquesEliminados;	
	public List<Empaque> empaquesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEmpaque;		
	protected JButton jButtonAbrirOrderByEmpaque;
	
	
	//protected JPanel jPanelOrderByEmpaque;
	//public JScrollPane jScrollPanelOrderByEmpaque;	
	//protected JButton jButtonCerrarOrderByEmpaque;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EmpaqueLogic empaqueLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEmpaque;
	public JScrollPane jScrollPanelDatosEdicionEmpaque;
	public JScrollPane jScrollPanelDatosGeneralEmpaque;
    
	
	
	//public JScrollPane jScrollPanelDatosEmpaqueOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEmpaque;
	//public JScrollPane jScrollPanelImportacionEmpaque;
	
	
	
	protected JPanel jPanelAccionesEmpaque;
	
    protected JPanel jPanelPaginacionEmpaque;
    protected JPanel jPanelParametrosReportesEmpaque;
	protected JPanel jPanelParametrosReportesAccionesEmpaque;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Empaque;
	protected JPanel jPanelParametrosAuxiliar2Empaque;
	protected JPanel jPanelParametrosAuxiliar3Empaque;
	protected JPanel jPanelParametrosAuxiliar4Empaque;
	//protected JPanel jPanelParametrosAuxiliar5Empaque;
	
	
	
	//protected JPanel jPanelReporteDinamicoEmpaque;
	//protected JPanel jPanelImportacionEmpaque;
	
	
	public JTable jTableDatosEmpaque;
	
	
	
	//public JTable jTableDatosEmpaqueOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEmpaque;
	protected JButton jButtonDuplicarEmpaque;
	protected JButton jButtonCopiarEmpaque;
	protected JButton jButtonVerFormEmpaque;
	protected JButton jButtonNuevoRelacionesEmpaque;
	protected JButton jButtonModificarEmpaque;
	
    protected JButton jButtonGuardarCambiosTablaEmpaque;
	protected JButton jButtonCerrarEmpaque;
	
	
	protected JButton jButtonRecargarInformacionEmpaque;
	protected JButton jButtonProcesarInformacionEmpaque;
	
	
	protected JButton jButtonAnterioresEmpaque;
	protected JButton jButtonSiguientesEmpaque;
	protected JButton jButtonNuevoGuardarCambiosEmpaque;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEmpaque;
	//protected JButton jButtonCerrarReporteDinamicoEmpaque;
	//protected JButton jButtonGenerarExcelReporteDinamicoEmpaque;	
	
	
	
	//protected JButton jButtonAbrirImportacionEmpaque;
	//protected JButton jButtonGenerarImportacionEmpaque;
	//protected JButton jButtonCerrarImportacionEmpaque;
	//protected JFileChooser jFileChooserImportacionEmpaque;
	//protected File fileImportacionEmpaque;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpaque;
	protected JButton jButtonDuplicarToolBarEmpaque;
	protected JButton jButtonNuevoRelacionesToolBarEmpaque;
	
	
	public JButton jButtonGuardarCambiosToolBarEmpaque;
	protected JButton jButtonCopiarToolBarEmpaque;
	protected JButton jButtonVerFormToolBarEmpaque;
	public JButton jButtonGuardarCambiosTablaToolBarEmpaque;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpaque;
	protected JButton jButtonCerrarToolBarEmpaque;
	
	protected JButton jButtonRecargarInformacionToolBarEmpaque;
	protected JButton jButtonProcesarInformacionToolBarEmpaque;
	protected JButton jButtonAnterioresToolBarEmpaque;
	protected JButton jButtonSiguientesToolBarEmpaque;
	protected JButton jButtonNuevoGuardarCambiosToolBarEmpaque;
	protected JButton jButtonAbrirOrderByToolBarEmpaque;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpaque;
	protected JMenuItem jMenuItemDuplicarEmpaque;
	protected JMenuItem jMenuItemNuevoRelacionesEmpaque;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEmpaque;
	protected JMenuItem jMenuItemCopiarEmpaque;
	protected JMenuItem jMenuItemVerFormEmpaque;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpaque;
	protected JMenuItem jMenuItemCerrarEmpaque;
	protected JMenuItem jMenuItemDetalleCerrarEmpaque;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEmpaque;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpaque;
	
	protected JMenuItem jMenuItemRecargarInformacionEmpaque;
	protected JMenuItem jMenuItemProcesarInformacionEmpaque;
	protected JMenuItem jMenuItemAnterioresEmpaque;
	protected JMenuItem jMenuItemSiguientesEmpaque;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpaque;
	protected JMenuItem jMenuItemAbrirOrderByEmpaque;
	protected JMenuItem jMenuItemMostrarOcultarEmpaque;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpaque;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEmpaque;
	protected JCheckBox jCheckBoxSeleccionadosEmpaque;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEmpaque;
	protected JCheckBox jCheckBoxConGraficoReporteEmpaque;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEmpaque;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEmpaque;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEmpaque;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEmpaque;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEmpaque;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEmpaque;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpaque;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpaque;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEmpaque;
	protected JTextField jTextFieldValorCampoGeneralEmpaque;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEmpaque;
	//public JList<Reporte> jListColumnasSelectReporteEmpaque;
	//public JScrollPane jScrollColumnasSelectReporteEmpaque;
	
	//public JLabel jLabelRelacionesSelectReporteEmpaque;
	//public JList<Reporte> jListRelacionesSelectReporteEmpaque;
	//public JScrollPane jScrollRelacionesSelectReporteEmpaque;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEmpaque;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEmpaque;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEmpaque;
	//public JLabel jLabelTiposArchivoReporteDinamicoEmpaque;
	
		
	//public JLabel jLabelArchivoImportacionEmpaque;	
	//public JLabel jLabelPathArchivoImportacionEmpaque;
	//protected JTextField jTextFieldPathArchivoImportacionEmpaque;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEmpaque;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEmpaque;
	
	//public JLabel jLabelColumnaCategoriaValorEmpaque;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEmpaque;
	
	//public JLabel jLabelColumnasValoresGraficoEmpaque;
	//public JList<Reporte> jListColumnasValoresGraficoEmpaque;
	//public JScrollPane jScrollColumnasValoresGraficoEmpaque;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEmpaque;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEmpaque;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEmpaque;
	
	
	
	
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
	//public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EmpaqueJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Empaque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpaqueJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Empaque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpaqueJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Empaque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpaqueJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Empaque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEmpaque)	{
		this.jButtonRecargarInformacionEmpaque = jButtonRecargarInformacionEmpaque;
	}
	
	public JButton getjButtonProcesarInformacionEmpaque() {
		return this.jButtonProcesarInformacionEmpaque;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpaque)	{
		this.jButtonProcesarInformacionEmpaque = jButtonProcesarInformacionEmpaque;
	}
	
	
	public JButton getjButtonRecargarInformacionEmpaque() {
		return this.jButtonRecargarInformacionEmpaque;
	}
	
	
	public List<Empaque> getempaques() {
		return this.empaques;
	}

	public void setempaques(List<Empaque> empaques) {
		this.empaques = empaques;
	}
	
	public List<Empaque> getempaquesAux() {
		return this.empaquesAux;
	}

	public void setempaquesAux(List<Empaque> empaquesAux) {
		this.empaquesAux = empaquesAux;
	}
	
	public List<Empaque> getempaquesEliminados() {
		return this.empaquesEliminados;
	}

	public void setEmpaquesEliminados(List<Empaque> empaquesEliminados) {
		this.empaquesEliminados = empaquesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEmpaque() {
		return jComboBoxTiposSeleccionarEmpaque;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEmpaque(
			JComboBox jComboBoxTiposSeleccionarEmpaque) {
		this.jComboBoxTiposSeleccionarEmpaque = jComboBoxTiposSeleccionarEmpaque;
	}
	
	public void setBorderResaltarTiposSeleccionarEmpaque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEmpaque.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEmpaque .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEmpaque() {
		return jTextFieldValorCampoGeneralEmpaque;
	}

	public void setjTextFieldValorCampoGeneralEmpaque(
			JTextField jTextFieldValorCampoGeneralEmpaque) {
		this.jTextFieldValorCampoGeneralEmpaque = jTextFieldValorCampoGeneralEmpaque;
	}

	public void setBorderResaltarValorCampoGeneralEmpaque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpaque.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEmpaque .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEmpaque() {
		return this.jCheckBoxSeleccionarTodosEmpaque;
	}

	public void setjCheckBoxSeleccionarTodosEmpaque(
			JCheckBox jCheckBoxSeleccionarTodosEmpaque) {
		this.jCheckBoxSeleccionarTodosEmpaque = jCheckBoxSeleccionarTodosEmpaque;
	}

	public void setBorderResaltarSeleccionarTodosEmpaque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpaque.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEmpaque .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEmpaque() {
		return this.jCheckBoxSeleccionadosEmpaque;
	}

	public void setjCheckBoxSeleccionadosEmpaque(
			JCheckBox jCheckBoxSeleccionadosEmpaque) {
		this.jCheckBoxSeleccionadosEmpaque = jCheckBoxSeleccionadosEmpaque;
	}
	
	public void setBorderResaltarSeleccionadosEmpaque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpaque.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEmpaque .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEmpaque() {
		return this.jComboBoxTiposArchivosReportesEmpaque;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEmpaque(
			JComboBox jComboBoxTiposArchivosReportesEmpaque) {
		this.jComboBoxTiposArchivosReportesEmpaque = jComboBoxTiposArchivosReportesEmpaque;
	}

	public void setBorderResaltarTiposArchivosReportesEmpaque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpaque.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEmpaque .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEmpaque() {
		return this.jComboBoxTiposReportesEmpaque;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEmpaque(
			JComboBox jComboBoxTiposReportesEmpaque) {
		this.jComboBoxTiposReportesEmpaque = jComboBoxTiposReportesEmpaque;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEmpaque() {
	//	return jComboBoxTiposReportesDinamicoEmpaque;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEmpaque(
	//		JComboBox jComboBoxTiposReportesDinamicoEmpaque) {
	//	this.jComboBoxTiposReportesDinamicoEmpaque = jComboBoxTiposReportesDinamicoEmpaque;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEmpaque() {
	//	return jComboBoxTiposArchivosReportesDinamicoEmpaque;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEmpaque(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEmpaque) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEmpaque = jComboBoxTiposArchivosReportesDinamicoEmpaque;
	//}
	
	public void setBorderResaltarTiposReportesEmpaque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpaque.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEmpaque .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEmpaque() {
		return this.jComboBoxTiposGraficosReportesEmpaque;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEmpaque(
			JComboBox jComboBoxTiposGraficosReportesEmpaque) {
		this.jComboBoxTiposGraficosReportesEmpaque = jComboBoxTiposGraficosReportesEmpaque;
	}
	
	public void setBorderResaltarTiposGraficosReportesEmpaque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpaque.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEmpaque .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEmpaque() {
		return this.jComboBoxTiposPaginacionEmpaque;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEmpaque(
			JComboBox jComboBoxTiposPaginacionEmpaque) {
		this.jComboBoxTiposPaginacionEmpaque = jComboBoxTiposPaginacionEmpaque;
	}
	
	public void setBorderResaltarTiposPaginacionEmpaque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpaque.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEmpaque .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEmpaque() {
		return this.jComboBoxTiposRelacionesEmpaque;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpaque() {
		return this.jComboBoxTiposAccionesEmpaque;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpaque(
			JComboBox jComboBoxTiposRelacionesEmpaque) {
		this.jComboBoxTiposRelacionesEmpaque = jComboBoxTiposRelacionesEmpaque;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpaque(
			JComboBox jComboBoxTiposAccionesEmpaque) {
		this.jComboBoxTiposAccionesEmpaque = jComboBoxTiposAccionesEmpaque;
	}
	
	public void setBorderResaltarTiposRelacionesEmpaque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpaque.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEmpaque .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEmpaque() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEmpaque.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEmpaque .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEmpaque() {
	//	return jCheckBoxConGraficoDinamicoEmpaque;
	//}

	//public void setjCheckBoxConGraficoDinamicoEmpaque(
	//		JCheckBox jCheckBoxConGraficoDinamicoEmpaque) {
	//	this.jCheckBoxConGraficoDinamicoEmpaque = jCheckBoxConGraficoDinamicoEmpaque;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEmpaque() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEmpaque.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEmpaque .setBorder(borderResaltar);		
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
		this.empaqueSessionBean=new EmpaqueSessionBean();
		
		this.empaqueSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empaqueSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empaqueSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EmpaqueJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EmpaqueJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpaqueJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpaqueJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpaqueJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empaque MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
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
		
		EmpaqueJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Empaque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEmpaque= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEmpaque,this.jTtoolBarEmpaque,
							"nuevo","nuevo","Nuevo"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEmpaque,this.jTtoolBarEmpaque,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEmpaque,this.jTtoolBarEmpaque,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEmpaque,this.jTtoolBarEmpaque,
							"duplicar","duplicar","Duplicar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEmpaque,this.jTtoolBarEmpaque,
							"copiar","copiar","Copiar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEmpaque,this.jTtoolBarEmpaque,
							"ver_form","ver_form","Ver"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpaque,this.jTtoolBarEmpaque,
							"recargar","recargar","Recargar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpaque,this.jTtoolBarEmpaque,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEmpaque,this.jTtoolBarEmpaque,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEmpaque,this.jTtoolBarEmpaque,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEmpaque,this.jTtoolBarEmpaque,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEmpaque,this.jTtoolBarEmpaque,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEmpaque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEmpaque,this.jTtoolBarEmpaque,
							"cerrar","cerrar","Salir"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEmpaque=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEmpaque;
			
				this.jButtonProcesarInformacionToolBarEmpaque=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEmpaque;
				
		//protected JButton jButtonModificarToolBarEmpaque;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEmpaque=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEmpaque=new JMenuMe("General");
		this.jmenuArchivoEmpaque=new JMenuMe("Archivo");
		this.jmenuAccionesEmpaque=new JMenuMe("Acciones");
		this.jmenuDatosEmpaque=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpaque= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpaque.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpaque,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEmpaque= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEmpaque.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEmpaque,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEmpaque= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEmpaque.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEmpaque,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEmpaque= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpaque.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpaque,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEmpaque= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEmpaque.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEmpaque,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEmpaque= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEmpaque.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEmpaque,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEmpaque= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEmpaque.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEmpaque,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpaque= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpaque.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpaque,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEmpaque= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEmpaque.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEmpaque,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEmpaque= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEmpaque.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEmpaque,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEmpaque= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEmpaque.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEmpaque,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEmpaque= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEmpaque.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEmpaque,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEmpaque= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEmpaque.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEmpaque,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpaque= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpaque.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpaque,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEmpaque= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEmpaque.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEmpaque,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpaque= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpaque.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpaque,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEmpaque= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEmpaque.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEmpaque,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEmpaque.add(this.jMenuItemCerrarEmpaque);
			
			this.jmenuAccionesEmpaque.add(this.jMenuItemNuevoEmpaque);
			this.jmenuAccionesEmpaque.add(this.jMenuItemNuevoGuardarCambiosEmpaque);
			this.jmenuAccionesEmpaque.add(this.jMenuItemNuevoRelacionesEmpaque);
			this.jmenuAccionesEmpaque.add(this.jMenuItemGuardarCambiosTablaEmpaque);		
			this.jmenuAccionesEmpaque.add(this.jMenuItemDuplicarEmpaque);		
			this.jmenuAccionesEmpaque.add(this.jMenuItemCopiarEmpaque);		
			this.jmenuAccionesEmpaque.add(this.jMenuItemVerFormEmpaque);		
			
			this.jmenuDatosEmpaque.add(this.jMenuItemRecargarInformacionEmpaque);				
			this.jmenuDatosEmpaque.add(this.jMenuItemAnterioresEmpaque);				
			this.jmenuDatosEmpaque.add(this.jMenuItemSiguientesEmpaque);				
			this.jmenuDatosEmpaque.add(this.jMenuItemAbrirOrderByEmpaque);				
			this.jmenuDatosEmpaque.add(this.jMenuItemMostrarOcultarEmpaque);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEmpaque.add(this.jMenuItemGuardarCambiosEmpaque);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEmpaque.add(this.jmenuArchivoEmpaque);		
			this.jmenuBarEmpaque.add(this.jmenuAccionesEmpaque);		
			this.jmenuBarEmpaque.add(this.jmenuDatosEmpaque);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEmpaque);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEmpaque() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasEmpaque=new JTabbedPane();


		this.jTabbedPaneBusquedasEmpaque.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpaque.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEmpaque.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEmpaque.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEmpaque,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEmpaque = new EmpaqueDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Empaque DATOS");
			this.jInternalFrameDetalleFormEmpaque = new EmpaqueDetalleFormJInternalFrame(jDesktopPane,this.empaqueSessionBean.getConGuardarRelaciones(),this.empaqueSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEmpaque = null;//new EmpaqueDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpaque= new GridBagLayout();
		
		
		this.jTableDatosEmpaque = new JTableMe();      
		
		String sToolTipEmpaque="";
		sToolTipEmpaque=EmpaqueConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpaque+="(Inventario.Empaque)";
		}
		
		if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpaque+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEmpaque.setToolTipText(sToolTipEmpaque);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEmpaque);
		this.jTableDatosEmpaque.setAutoCreateRowSorter(true);
		this.jTableDatosEmpaque.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEmpaque.setRowSelectionAllowed(true);
		this.jTableDatosEmpaque.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEmpaque,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEmpaque = new JButtonMe();
		this.jButtonDuplicarEmpaque = new JButtonMe();
		this.jButtonCopiarEmpaque = new JButtonMe();
		this.jButtonVerFormEmpaque = new JButtonMe();
		this.jButtonNuevoRelacionesEmpaque = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEmpaque = new JButtonMe();
		this.jButtonCerrarEmpaque = new JButtonMe();
		
		this.jScrollPanelDatosEmpaque = new JScrollPane();   
        this.jScrollPanelDatosGeneralEmpaque = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEmpaque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Empaque";
		
		if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empaques" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpaque.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpaque.setToolTipText("Acciones");
        this.jPanelAccionesEmpaque.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEmpaque=new ReporteDinamicoJInternalFrame(EmpaqueConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEmpaque();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEmpaque=new ImportacionJInternalFrame(EmpaqueConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEmpaque();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEmpaque = new JButtonMe();
		
		this.jButtonAbrirOrderByEmpaque.setText("Orden");
		this.jButtonAbrirOrderByEmpaque.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpaque,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEmpaque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpaque=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpaque,false,this);
			
			//this.cargarOrderByEmpaque(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEmpaque=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpaque,true,this);
			
			//this.cargarOrderByEmpaque(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEmpaque.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosEmpaque.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosEmpaque.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosEmpaque.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpaque.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEmpaque.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEmpaque.setText("Nuevo");
		this.jButtonDuplicarEmpaque.setText("Duplicar");
		this.jButtonCopiarEmpaque.setText("Copiar");
		this.jButtonVerFormEmpaque.setText("Ver");
		this.jButtonNuevoRelacionesEmpaque.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEmpaque.setText("Guardar");
		this.jButtonCerrarEmpaque.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpaque,"nuevo_button","Nuevo",this.empaqueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEmpaque,"duplicar_button","Duplicar",this.empaqueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEmpaque,"copiar_button","Copiar",this.empaqueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEmpaque,"ver_form","Ver",this.empaqueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEmpaque,"nuevorelaciones_button","Nuevo Rel",this.empaqueSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpaque,"guardarcambiostabla_button","Guardar",this.empaqueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpaque,"cerrar_button","Salir",this.empaqueSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEmpaque.setToolTipText("Nuevo"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEmpaque.setToolTipText("Duplicar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEmpaque.setToolTipText("Copiar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEmpaque.setToolTipText("Ver"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEmpaque.setToolTipText("Nuevo Rel"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEmpaque.setToolTipText("Guardar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpaque.setToolTipText("Salir"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpaque";
		inputMap = this.jButtonNuevoEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpaque.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpaque"));
		
		//DUPLICAR
		sMapKey = "DuplicarEmpaque";
		inputMap = this.jButtonDuplicarEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEmpaque.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEmpaque"));
		
		//COPIAR
		sMapKey = "CopiarEmpaque";
		inputMap = this.jButtonCopiarEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEmpaque.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEmpaque"));
		
		//VEr FORM
		sMapKey = "VerFormEmpaque";
		inputMap = this.jButtonVerFormEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEmpaque.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEmpaque"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEmpaque";
		inputMap = this.jButtonNuevoRelacionesEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEmpaque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEmpaque"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEmpaque";
		inputMap = this.jButtonModificarEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEmpaque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEmpaque"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEmpaque";
		inputMap = this.jButtonCerrarEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpaque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpaque"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpaque";
		inputMap = this.jButtonGuardarCambiosTablaEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpaque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpaque"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEmpaque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEmpaque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEmpaque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Empaque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Empaque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Empaque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Empaque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Empaque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEmpaque.setName("jPanelParametrosReportesEmpaque"); 
		
		this.jPanelParametrosReportesAccionesEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEmpaque.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEmpaque.setName("jPanelParametrosReportesAccionesEmpaque"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEmpaque, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEmpaque = new JButtonMe();
		this.jButtonRecargarInformacionEmpaque.setText("Recargar");
		this.jButtonRecargarInformacionEmpaque.setToolTipText("Recargar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEmpaque,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEmpaque = new JButtonMe();
		this.jButtonProcesarInformacionEmpaque.setText("Procesar");
		this.jButtonProcesarInformacionEmpaque.setToolTipText("Procesar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEmpaque.setVisible(false);
			
		this.jButtonProcesarInformacionEmpaque.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpaque.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEmpaque.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEmpaque = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpaque.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEmpaque.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEmpaque = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpaque.setText("TIPO");       
		this.jComboBoxTiposReportesEmpaque.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEmpaque = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEmpaque.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEmpaque.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEmpaque = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEmpaque.setText("Paginacion");
		this.jComboBoxTiposPaginacionEmpaque.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEmpaque = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEmpaque.setText("Accion");
		this.jComboBoxTiposRelacionesEmpaque.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEmpaque = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpaque.setText("Accion");
		this.jComboBoxTiposAccionesEmpaque.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEmpaque = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEmpaque.setText("Accion");
		this.jComboBoxTiposSeleccionarEmpaque.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEmpaque=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEmpaque.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpaque.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEmpaque.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEmpaque = new JLabelMe();
		
		this.jLabelAccionesEmpaque.setText("Acciones");		
		this.jLabelAccionesEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEmpaque = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEmpaque.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEmpaque.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEmpaque = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEmpaque.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEmpaque.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEmpaque = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEmpaque.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEmpaque.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEmpaque = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEmpaque.setText("Graf.");
		this.jCheckBoxConGraficoReporteEmpaque.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEmpaque = new JButtonMe();
		//this.jButtonAnterioresEmpaque.setText("<<");
        this.jButtonAnterioresEmpaque.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEmpaque,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEmpaque = new JButtonMe();
		//this.jButtonSiguientesEmpaque.setText(">>");
        this.jButtonSiguientesEmpaque.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEmpaque,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEmpaque = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEmpaque.setText("Nue");
        this.jButtonNuevoGuardarCambiosEmpaque.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEmpaque,"nuevoguardarcambios_button","Nue",this.empaqueSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEmpaque";
		inputMap = this.jButtonNuevoGuardarCambiosEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEmpaque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEmpaque"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEmpaque";
		inputMap = this.jButtonRecargarInformacionEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEmpaque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEmpaque"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEmpaque";
		inputMap = this.jButtonSiguientesEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEmpaque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEmpaque"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEmpaque";
		inputMap = this.jButtonAnterioresEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEmpaque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEmpaque"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEmpaque();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEmpaque.setMinimumSize(new Dimension(this.getWidth(),EmpaqueBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpaqueBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpaque.setMaximumSize(new Dimension(this.getWidth(),EmpaqueBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpaqueBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEmpaque.setPreferredSize(new Dimension(this.getWidth(),EmpaqueBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EmpaqueBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEmpaque = new GridBagLayout();

			this.jPanelPaginacionEmpaque.setLayout(gridaBagLayoutPaginacionEmpaque);						
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy = 0;
			this.gridBagConstraintsEmpaque.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEmpaque.add(this.jButtonAnterioresEmpaque, this.gridBagConstraintsEmpaque);
					
						
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpaque.gridy = 0;
			
			this.jPanelPaginacionEmpaque.add(this.jButtonNuevoGuardarCambiosEmpaque, this.gridBagConstraintsEmpaque);
						
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEmpaque.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEmpaque.gridy = 0;
			this.jPanelPaginacionEmpaque.add(this.jButtonSiguientesEmpaque, this.gridBagConstraintsEmpaque);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy = 1;
			this.gridBagConstraintsEmpaque.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpaque.add(this.jButtonNuevoEmpaque, this.gridBagConstraintsEmpaque);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEmpaque = new GridBagConstraints();
				this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpaque.gridy = 1;
				this.gridBagConstraintsEmpaque.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEmpaque.add(this.jButtonNuevoRelacionesEmpaque, this.gridBagConstraintsEmpaque);
			}
			
			
			if(!this.empaqueSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEmpaque = new GridBagConstraints();
				this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEmpaque.gridy = 1;
				this.gridBagConstraintsEmpaque.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEmpaque.add(this.jButtonGuardarCambiosTablaEmpaque, this.gridBagConstraintsEmpaque);
			}
			
			
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy = 1;
			this.gridBagConstraintsEmpaque.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpaque.add(this.jButtonDuplicarEmpaque, this.gridBagConstraintsEmpaque);
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy = 1;
			this.gridBagConstraintsEmpaque.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpaque.add(this.jButtonCopiarEmpaque, this.gridBagConstraintsEmpaque);
		
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy = 1;
			this.gridBagConstraintsEmpaque.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEmpaque.add(this.jButtonVerFormEmpaque, this.gridBagConstraintsEmpaque);
		
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy = 1;
			this.gridBagConstraintsEmpaque.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEmpaque.add(this.jButtonCerrarEmpaque, this.gridBagConstraintsEmpaque);
		
		
		
		this.jButtonRecargarInformacionEmpaque.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpaque.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEmpaque.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEmpaque.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpaque.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEmpaque.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEmpaque.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpaque.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEmpaque.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEmpaque.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpaque.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEmpaque.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEmpaque.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpaque.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEmpaque.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEmpaque.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpaque.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEmpaque.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEmpaque.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpaque.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpaque.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEmpaque.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpaque.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEmpaque.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEmpaque.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpaque.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEmpaque.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEmpaque.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpaque.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEmpaque.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEmpaque.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpaque.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEmpaque.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEmpaque.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpaque.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEmpaque.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEmpaque = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEmpaque = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Empaque = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Empaque = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Empaque = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Empaque = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEmpaque.setLayout(gridaBagParametrosReportesEmpaque);
			this.jPanelParametrosReportesAccionesEmpaque.setLayout(gridaBagParametrosReportesAccionesEmpaque);
			
			
			this.jPanelParametrosAuxiliar1Empaque.setLayout(gridaBagParametrosAuxiliar1Empaque);
			this.jPanelParametrosAuxiliar2Empaque.setLayout(gridaBagParametrosAuxiliar2Empaque);
			this.jPanelParametrosAuxiliar3Empaque.setLayout(gridaBagParametrosAuxiliar3Empaque);
			this.jPanelParametrosAuxiliar4Empaque.setLayout(gridaBagParametrosAuxiliar4Empaque);
			//this.jPanelParametrosAuxiliar5Empaque.setLayout(gridaBagParametrosAuxiliar2Empaque);			
			
			
			
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpaque.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpaque.add(this.jButtonRecargarInformacionEmpaque, this.gridBagConstraintsEmpaque);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpaque.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Empaque.add(this.jComboBoxTiposPaginacionEmpaque, this.gridBagConstraintsEmpaque);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpaque.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Empaque.add(this.jCheckBoxConAltoMaximoTablaEmpaque, this.gridBagConstraintsEmpaque);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpaque.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Empaque.add(this.jComboBoxTiposArchivosReportesEmpaque, this.gridBagConstraintsEmpaque);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpaque.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpaque.add(this.jPanelParametrosAuxiliar1Empaque, this.gridBagConstraintsEmpaque);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpaque.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Empaque.add(this.jComboBoxTiposReportesEmpaque, this.gridBagConstraintsEmpaque);																		
			
			
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpaque.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4Empaque.add(this.jComboBoxTiposGraficosReportesEmpaque, this.gridBagConstraintsEmpaque);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpaque.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpaque.add(this.jPanelParametrosAuxiliar4Empaque, this.gridBagConstraintsEmpaque);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEmpaque.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpaque.add(this.jComboBoxTiposReportesEmpaque, this.gridBagConstraintsEmpaque);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpaque.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpaque.add(this.jCheckBoxGenerarReporteEmpaque, this.gridBagConstraintsEmpaque);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpaque.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpaque.add(this.jPanelParametrosAuxiliar2Empaque, this.gridBagConstraintsEmpaque);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpaque.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpaque.add(this.jLabelAccionesEmpaque, this.gridBagConstraintsEmpaque);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEmpaque = new GridBagConstraints();
				this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEmpaque.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEmpaque.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEmpaque.add(this.jButtonAbrirOrderByEmpaque, this.gridBagConstraintsEmpaque);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpaque.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpaque.add(this.jComboBoxTiposSeleccionarEmpaque, this.gridBagConstraintsEmpaque);			
			
			
			/*
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpaque.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpaque.add(this.jCheckBoxSeleccionarTodosEmpaque, this.gridBagConstraintsEmpaque);
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEmpaque.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEmpaque.add(this.jCheckBoxConGraficoReporteEmpaque, this.gridBagConstraintsEmpaque);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpaque.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Empaque.add(this.jCheckBoxSeleccionarTodosEmpaque, this.gridBagConstraintsEmpaque);															
				
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpaque.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Empaque.add(this.jCheckBoxSeleccionadosEmpaque, this.gridBagConstraintsEmpaque);															
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEmpaque.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Empaque.add(this.jCheckBoxConGraficoReporteEmpaque, this.gridBagConstraintsEmpaque);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpaque.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEmpaque.add(this.jPanelParametrosAuxiliar3Empaque, this.gridBagConstraintsEmpaque);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpaque.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpaque.add(this.jComboBoxTiposRelacionesEmpaque, this.gridBagConstraintsEmpaque);
				
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpaque.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpaque.add(this.jComboBoxTiposAccionesEmpaque, this.gridBagConstraintsEmpaque);
	
				
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEmpaque.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEmpaque.add(this.jTextFieldValorCampoGeneralEmpaque, this.gridBagConstraintsEmpaque);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEmpaque = new GridBagLayout();

			this.jScrollPanelDatosEmpaque.setLayout(gridaBagLayoutDatosEmpaque);
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy = 0;
			this.gridBagConstraintsEmpaque.gridx = 0;
			
			this.jScrollPanelDatosEmpaque.add(this.jTableDatosEmpaque, this.gridBagConstraintsEmpaque);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEmpaque.setViewportView(this.jTableDatosEmpaque);
		this.jTableDatosEmpaque.setFillsViewportHeight(true);
		this.jTableDatosEmpaque.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEmpaque= new GridBagLayout();
		this.jPanelAccionesEmpaque.setLayout(gridaBagLayoutAccionesEmpaque);
		
		
		/*	
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpaque.gridy = 0;
		this.gridBagConstraintsEmpaque.gridx = 0;
			
		this.jPanelAccionesEmpaque.add(this.jButtonNuevoEmpaque, this.gridBagConstraintsEmpaque);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpaque = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpaque);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empaqueSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpaque = new GridBagConstraints();						
			this.gridBagConstraintsEmpaque.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpaque.gridx = 0;		
			//this.gridBagConstraintsEmpaque.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpaque.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEmpaque, this.gridBagConstraintsEmpaque);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEmpaque.gridx = 0;		
		//this.gridBagConstraintsEmpaque.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpaque.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEmpaque.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEmpaque);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpaque.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEmpaque, this.gridBagConstraintsEmpaque);								
		
		
		/*
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpaque.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEmpaque, this.gridBagConstraintsEmpaque);
		*/		
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpaque.gridx =0;
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpaque.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpaque, this.gridBagConstraintsEmpaque);
				
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpaque.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEmpaque, this.gridBagConstraintsEmpaque);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EmpaqueJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEmpaque= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpaque = new GridBagLayout();
			this.jPanelBusquedasParametrosEmpaque.setLayout(gridaBagLayoutBusquedasParametrosEmpaque);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEmpaque=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpaque.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpaque.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpaque.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpaque.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpaque, this.gridBagConstraintsEmpaque);
			
			
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpaque.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpaque, this.gridBagConstraintsEmpaque);
		
			
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpaque.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpaque, this.gridBagConstraintsEmpaque);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEmpaque;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEmpaque() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEmpaque = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEmpaque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEmpaque.setName("jPanelReporteDinamicoEmpaque"); 
		
		this.jPanelReporteDinamicoEmpaque.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpaque.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEmpaque.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEmpaque.setLayout(gridaBagLayoutReporteDinamicoEmpaque);
		
		
		this.jInternalFrameReporteDinamicoEmpaque= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEmpaque = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpaque= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEmpaque.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEmpaque.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEmpaque.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEmpaque.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEmpaque.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEmpaque.setResizable(true);
	    this.jInternalFrameReporteDinamicoEmpaque.setClosable(true);
	    this.jInternalFrameReporteDinamicoEmpaque.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEmpaque.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpaque.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEmpaque.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empaques"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEmpaque = new JLabelMe();

		this.jLabelColumnasSelectReporteEmpaque.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpaque.add(this.jLabelColumnasSelectReporteEmpaque, this.gridBagConstraintsEmpaque);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEmpaque = new JList<Reporte>();
		this.jListColumnasSelectReporteEmpaque.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEmpaque.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEmpaque.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpaque.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEmpaque.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEmpaque=new JScrollPane(this.jListColumnasSelectReporteEmpaque);
			
			this.jScrollColumnasSelectReporteEmpaque.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpaque.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEmpaque.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpaque.add(this.jListColumnasSelectReporteEmpaque, this.gridBagConstraintsEmpaque);
		this.jPanelReporteDinamicoEmpaque.add(this.jScrollColumnasSelectReporteEmpaque, this.gridBagConstraintsEmpaque);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEmpaque = new JLabelMe();

		this.jLabelRelacionesSelectReporteEmpaque.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpaque.add(this.jLabelRelacionesSelectReporteEmpaque, this.gridBagConstraintsEmpaque);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEmpaque = new JList<Reporte>();
		this.jListRelacionesSelectReporteEmpaque.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEmpaque.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEmpaque.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpaque.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEmpaque.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEmpaque=new JScrollPane(this.jListRelacionesSelectReporteEmpaque);
			
			this.jScrollRelacionesSelectReporteEmpaque.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpaque.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEmpaque.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEmpaque.add(this.jListRelacionesSelectReporteEmpaque, this.gridBagConstraintsEmpaque);
		this.jPanelReporteDinamicoEmpaque.add(this.jScrollRelacionesSelectReporteEmpaque, this.gridBagConstraintsEmpaque);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEmpaque = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEmpaque = new JComboBoxMe();
		this.jListColumnasValoresGraficoEmpaque = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEmpaque = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEmpaque.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEmpaque.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpaque.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEmpaque.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEmpaque = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEmpaque.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEmpaque.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpaque.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEmpaque.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoEmpaque = new JLabelMe();

		this.jLabelConGraficoDinamicoEmpaque.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpaque.add(this.jLabelConGraficoDinamicoEmpaque, this.gridBagConstraintsEmpaque);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoEmpaque = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoEmpaque.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoEmpaque.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoEmpaque.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEmpaque.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoEmpaque.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpaque.add(this.jCheckBoxConGraficoDinamicoEmpaque, this.gridBagConstraintsEmpaque);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoEmpaque = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoEmpaque.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEmpaque.add(this.jLabelColumnaCategoriaGraficoEmpaque, this.gridBagConstraintsEmpaque);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoEmpaque = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEmpaque.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoEmpaque.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoEmpaque.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEmpaque.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoEmpaque.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoEmpaque.add(this.jComboBoxColumnaCategoriaGraficoEmpaque, this.gridBagConstraintsEmpaque);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorEmpaque = new JLabelMe();

		this.jLabelColumnaCategoriaValorEmpaque.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpaque.add(this.jLabelColumnaCategoriaValorEmpaque, this.gridBagConstraintsEmpaque);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorEmpaque = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorEmpaque.setText("Accion");
        this.jComboBoxColumnaCategoriaValorEmpaque.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorEmpaque.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEmpaque.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorEmpaque.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoEmpaque.add(this.jComboBoxColumnaCategoriaValorEmpaque, this.gridBagConstraintsEmpaque);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoEmpaque = new JLabelMe();

		this.jLabelColumnasValoresGraficoEmpaque.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpaque.add(this.jLabelColumnasValoresGraficoEmpaque, this.gridBagConstraintsEmpaque);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoEmpaque = new JList<Reporte>();
		this.jListColumnasValoresGraficoEmpaque.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoEmpaque.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoEmpaque.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEmpaque.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoEmpaque.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoEmpaque=new JScrollPane(this.jListColumnasValoresGraficoEmpaque);
			
			this.jScrollColumnasValoresGraficoEmpaque.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEmpaque.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoEmpaque.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoEmpaque.add(this.jListColumnasSelectReporteEmpaque, this.gridBagConstraintsEmpaque);
		this.jPanelReporteDinamicoEmpaque.add(this.jScrollColumnasValoresGraficoEmpaque, this.gridBagConstraintsEmpaque);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoEmpaque = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoEmpaque.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpaque.add(this.jLabelTiposGraficosReportesDinamicoEmpaque, this.gridBagConstraintsEmpaque);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoEmpaque = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoEmpaque.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoEmpaque.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoEmpaque.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEmpaque.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoEmpaque.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpaque.add(this.jComboBoxTiposGraficosReportesDinamicoEmpaque, this.gridBagConstraintsEmpaque);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEmpaque = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEmpaque.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpaque.add(this.jLabelGenerarExcelReporteDinamicoEmpaque, this.gridBagConstraintsEmpaque);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEmpaque = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEmpaque.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEmpaque,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEmpaque.setToolTipText("Generar EXCEL"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEmpaque = new GridBagConstraints();
		//this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEmpaque.add(this.jButtonGenerarExcelReporteDinamicoEmpaque, this.gridBagConstraintsEmpaque);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpaque.add(this.jComboBoxTiposReportesDinamicoEmpaque, this.gridBagConstraintsEmpaque);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEmpaque = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEmpaque.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEmpaque.add(this.jLabelTiposArchivoReporteDinamicoEmpaque, this.gridBagConstraintsEmpaque);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpaque.add(this.jComboBoxTiposArchivosReportesDinamicoEmpaque, this.gridBagConstraintsEmpaque);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEmpaque = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEmpaque.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEmpaque,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEmpaque.setToolTipText("Generar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpaque.add(this.jButtonGenerarReporteDinamicoEmpaque, this.gridBagConstraintsEmpaque);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEmpaque = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEmpaque.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEmpaque,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEmpaque.setToolTipText("Cancelar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEmpaque.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEmpaque.add(this.jButtonCerrarReporteDinamicoEmpaque, this.gridBagConstraintsEmpaque);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEmpaque = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEmpaque= new JScrollPane(jPanelReporteDinamicoEmpaque,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEmpaque.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpaque.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEmpaque.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empaques"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEmpaque.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEmpaque.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEmpaque.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEmpaque);
		this.jInternalFrameReporteDinamicoEmpaque.getContentPane().add(this.jScrollPanelReporteDinamicoEmpaque, this.gridBagConstraintsEmpaque);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEmpaque() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEmpaque = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEmpaque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEmpaque.setName("jPanelImportacionEmpaque"); 
		
		this.jPanelImportacionEmpaque.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpaque.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEmpaque.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEmpaque.setLayout(gridaBagLayoutImportacionEmpaque);
		
		
		this.jInternalFrameImportacionEmpaque= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEmpaque= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEmpaque = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEmpaque= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEmpaque.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpaque.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpaque.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEmpaque.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpaque.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpaque.setResizable(true);
	    this.jInternalFrameImportacionEmpaque.setClosable(true);
	    this.jInternalFrameImportacionEmpaque.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEmpaque.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEmpaque.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEmpaque.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEmpaque.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEmpaque.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEmpaque.setResizable(true);
	    this.jInternalFrameImportacionEmpaque.setClosable(true);
	    this.jInternalFrameImportacionEmpaque.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEmpaque.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpaque.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEmpaque.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empaques"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEmpaque = new JLabelMe();

		this.jLabelArchivoImportacionEmpaque.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpaque.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpaque.add(this.jLabelArchivoImportacionEmpaque, this.gridBagConstraintsEmpaque);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEmpaque = new JFileChooser();		
		this.jFileChooserImportacionEmpaque.setToolTipText("ESCOGER ARCHIVO"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEmpaque = new JButtonMe();
		this.jButtonAbrirImportacionEmpaque.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEmpaque,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEmpaque.setToolTipText("Generar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpaque.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpaque.add(this.jButtonAbrirImportacionEmpaque, this.gridBagConstraintsEmpaque);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEmpaque = new JLabelMe();

		this.jLabelPathArchivoImportacionEmpaque.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEmpaque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpaque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEmpaque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYImportacion;		
		this.gridBagConstraintsEmpaque.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEmpaque.add(this.jLabelPathArchivoImportacionEmpaque, this.gridBagConstraintsEmpaque);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEmpaque=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEmpaque.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpaque.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEmpaque.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpaque.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpaque.add(this.jTextFieldPathArchivoImportacionEmpaque, this.gridBagConstraintsEmpaque);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEmpaque = new JButtonMe();
		this.jButtonGenerarImportacionEmpaque.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEmpaque,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEmpaque.setToolTipText("Generar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpaque.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpaque.add(this.jButtonGenerarImportacionEmpaque, this.gridBagConstraintsEmpaque);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEmpaque = new JButtonMe();
		this.jButtonCerrarImportacionEmpaque.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEmpaque,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEmpaque.setToolTipText("Cancelar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpaque.gridy = iPosYImportacion;
		this.gridBagConstraintsEmpaque.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEmpaque.add(this.jButtonCerrarImportacionEmpaque, this.gridBagConstraintsEmpaque);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEmpaque = new GridBagLayout();
		
		this.jScrollPanelImportacionEmpaque= new JScrollPane(jPanelImportacionEmpaque,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEmpaque = new GridBagConstraints();
		this.gridBagConstraintsEmpaque.gridy =iPosYImportacion;
		this.gridBagConstraintsEmpaque.gridx =iPosXImportacion;
		this.gridBagConstraintsEmpaque.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEmpaque.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEmpaque.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEmpaque);
		this.jInternalFrameImportacionEmpaque.getContentPane().add(this.jScrollPanelImportacionEmpaque, this.gridBagConstraintsEmpaque);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEmpaque(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEmpaque = new JButtonMe();
			this.jButtonAbrirOrderByEmpaque.setText("Orden");
			this.jButtonAbrirOrderByEmpaque.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEmpaque,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEmpaque";
			inputMap = this.jButtonAbrirOrderByEmpaque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEmpaque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEmpaque"));
		
		
			GridBagLayout gridaBagLayoutOrderByEmpaque = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEmpaque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEmpaque.setName("jPanelOrderByEmpaque"); 
			
			this.jPanelOrderByEmpaque.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpaque.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEmpaque.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEmpaque.setLayout(gridaBagLayoutOrderByEmpaque);
			
			
			this.jTableDatosEmpaqueOrderBy = new JTableMe();        
			this.jTableDatosEmpaqueOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEmpaqueOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEmpaqueOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEmpaqueOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEmpaqueOrderBy.setViewportView(this.jTableDatosEmpaqueOrderBy);
			this.jTableDatosEmpaqueOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEmpaqueOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEmpaque= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEmpaque= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEmpaque = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEmpaque= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEmpaque.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEmpaque.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEmpaque.setTitle("Orden");
			this.jInternalFrameOrderByEmpaque.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEmpaque.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEmpaque.setResizable(true);
			this.jInternalFrameOrderByEmpaque.setClosable(true);
			this.jInternalFrameOrderByEmpaque.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEmpaque.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpaque.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEmpaque.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEmpaque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empaques"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEmpaque.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEmpaque.ipady =150;
				
			this.jPanelOrderByEmpaque.add(jScrollPanelDatosEmpaqueOrderBy, this.gridBagConstraintsEmpaque);//this.jTableDatosEmpaqueTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEmpaque = new JButtonMe();
			this.jButtonCerrarOrderByEmpaque.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEmpaque,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEmpaque.setToolTipText("Cancelar"+" "+EmpaqueConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEmpaque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpaque.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEmpaque.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEmpaque.add(this.jButtonCerrarOrderByEmpaque, this.gridBagConstraintsEmpaque);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEmpaque = new GridBagLayout();
			
			this.jScrollPanelOrderByEmpaque= new JScrollPane(jPanelOrderByEmpaque,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEmpaque = new GridBagConstraints();
			this.gridBagConstraintsEmpaque.gridy =iPosYOrderBy;
			this.gridBagConstraintsEmpaque.gridx =iPosXOrderBy;
			this.gridBagConstraintsEmpaque.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEmpaque.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEmpaque.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEmpaque);
			
			this.jInternalFrameOrderByEmpaque.getContentPane().add(this.jScrollPanelOrderByEmpaque, this.gridBagConstraintsEmpaque);			
		
		} else {
			this.jButtonAbrirOrderByEmpaque = new JButtonMe();
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
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.empaqueSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEmpaque.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEmpaque.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEmpaque.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEmpaque.getRowHeight();//EmpaqueConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EmpaqueConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpaque.isSelected()) {
					iHeightTable=EmpaqueConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpaqueConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpaqueConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EmpaqueConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEmpaque.isSelected()) {
					iHeightTable=EmpaqueConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EmpaqueConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EmpaqueConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEmpaque.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpaque.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEmpaque.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEmpaque.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpaque.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEmpaque.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEmpaque!=null && this.jInternalFrameOrderByEmpaque.getjTableDatosOrderBy()!=null) {
			//if(!this.empaqueSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEmpaque.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEmpaque.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEmpaque.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEmpaque.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEmpaque.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEmpaque.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEmpaque.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEmpaque.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpaque.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEmpaque.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=empaqueLogic.getEmpaques().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empaques.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Empaque> TraerEmpaqueBeans(List<Empaque> empaques,ArrayList<Classe> classes)throws Exception {
		try {
			for(Empaque empaque:empaques) {
					
				if(!(EmpaqueConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EmpaqueConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					empaque.setsDetalleGeneralEntityReporte(EmpaqueConstantesFunciones.getEmpaqueDescripcion(empaque));
										
						
					
					

					if(empaque.getDetaNotaCreditoSolis()!=null && Funciones.existeClass(classes,DetaNotaCreditoSoli.class)) {
						try{empaque.setdetanotacreditosolisDescripcionReporte(new JRBeanCollectionDataSource(DetaNotaCreditoSoliJInternalFrame.TraerDetaNotaCreditoSoliBeans(empaque.getDetaNotaCreditoSolis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(empaque.getDetalleProformas()!=null && Funciones.existeClass(classes,DetalleProforma.class)) {
						try{empaque.setdetalleproformasDescripcionReporte(new JRBeanCollectionDataSource(DetalleProformaJInternalFrame.TraerDetalleProformaBeans(empaque.getDetalleProformas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//empaque.setsDetalleGeneralEntityReporte(empaque.getsDetalleGeneralEntityReporte());
										
				}
				
				//empaquebeans.add(empaquebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return empaques;
    }
	//PARA REPORTES FIN
}
