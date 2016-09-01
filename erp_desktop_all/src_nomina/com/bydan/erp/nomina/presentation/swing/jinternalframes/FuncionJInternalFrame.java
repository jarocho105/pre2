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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.FuncionConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class FuncionJInternalFrame extends FuncionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarFuncion;
	
	protected JMenuBar jmenuBarFuncion;
	
	protected JMenu jmenuFuncion;
	protected JMenu jmenuDatosFuncion;
	protected JMenu jmenuArchivoFuncion;
	protected JMenu jmenuAccionesFuncion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosFuncion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFuncion;	
	protected GridBagConstraints gridBagConstraintsFuncion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public FuncionDetalleFormJInternalFrame jInternalFrameDetalleFormFuncion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoFuncion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionFuncion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public FuncionSessionBean funcionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Funcion> funcions;		
	public List<Funcion> funcionsEliminados;	
	public List<Funcion> funcionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByFuncion;		
	protected JButton jButtonAbrirOrderByFuncion;
	
	
	//protected JPanel jPanelOrderByFuncion;
	//public JScrollPane jScrollPanelOrderByFuncion;	
	//protected JButton jButtonCerrarOrderByFuncion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public FuncionLogic funcionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosFuncion;
	public JScrollPane jScrollPanelDatosEdicionFuncion;
	public JScrollPane jScrollPanelDatosGeneralFuncion;
    
	
	
	//public JScrollPane jScrollPanelDatosFuncionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoFuncion;
	//public JScrollPane jScrollPanelImportacionFuncion;
	
	
	
	protected JPanel jPanelAccionesFuncion;
	
    protected JPanel jPanelPaginacionFuncion;
    protected JPanel jPanelParametrosReportesFuncion;
	protected JPanel jPanelParametrosReportesAccionesFuncion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Funcion;
	protected JPanel jPanelParametrosAuxiliar2Funcion;
	protected JPanel jPanelParametrosAuxiliar3Funcion;
	protected JPanel jPanelParametrosAuxiliar4Funcion;
	//protected JPanel jPanelParametrosAuxiliar5Funcion;
	
	
	
	//protected JPanel jPanelReporteDinamicoFuncion;
	//protected JPanel jPanelImportacionFuncion;
	
	
	public JTable jTableDatosFuncion;
	
	
	
	//public JTable jTableDatosFuncionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoFuncion;
	protected JButton jButtonDuplicarFuncion;
	protected JButton jButtonCopiarFuncion;
	protected JButton jButtonVerFormFuncion;
	protected JButton jButtonNuevoRelacionesFuncion;
	protected JButton jButtonModificarFuncion;
	
    protected JButton jButtonGuardarCambiosTablaFuncion;
	protected JButton jButtonCerrarFuncion;
	
	
	protected JButton jButtonRecargarInformacionFuncion;
	protected JButton jButtonProcesarInformacionFuncion;
	
	
	protected JButton jButtonAnterioresFuncion;
	protected JButton jButtonSiguientesFuncion;
	protected JButton jButtonNuevoGuardarCambiosFuncion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoFuncion;
	//protected JButton jButtonCerrarReporteDinamicoFuncion;
	//protected JButton jButtonGenerarExcelReporteDinamicoFuncion;	
	
	
	
	//protected JButton jButtonAbrirImportacionFuncion;
	//protected JButton jButtonGenerarImportacionFuncion;
	//protected JButton jButtonCerrarImportacionFuncion;
	//protected JFileChooser jFileChooserImportacionFuncion;
	//protected File fileImportacionFuncion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFuncion;
	protected JButton jButtonDuplicarToolBarFuncion;
	protected JButton jButtonNuevoRelacionesToolBarFuncion;
	
	
	public JButton jButtonGuardarCambiosToolBarFuncion;
	protected JButton jButtonCopiarToolBarFuncion;
	protected JButton jButtonVerFormToolBarFuncion;
	public JButton jButtonGuardarCambiosTablaToolBarFuncion;
	protected JButton jButtonMostrarOcultarTablaToolBarFuncion;
	protected JButton jButtonCerrarToolBarFuncion;
	
	protected JButton jButtonRecargarInformacionToolBarFuncion;
	protected JButton jButtonProcesarInformacionToolBarFuncion;
	protected JButton jButtonAnterioresToolBarFuncion;
	protected JButton jButtonSiguientesToolBarFuncion;
	protected JButton jButtonNuevoGuardarCambiosToolBarFuncion;
	protected JButton jButtonAbrirOrderByToolBarFuncion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFuncion;
	protected JMenuItem jMenuItemDuplicarFuncion;
	protected JMenuItem jMenuItemNuevoRelacionesFuncion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosFuncion;
	protected JMenuItem jMenuItemCopiarFuncion;
	protected JMenuItem jMenuItemVerFormFuncion;
	protected JMenuItem jMenuItemGuardarCambiosTablaFuncion;
	protected JMenuItem jMenuItemCerrarFuncion;
	protected JMenuItem jMenuItemDetalleCerrarFuncion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByFuncion;
	protected JMenuItem jMenuItemDetalleMostarOcultarFuncion;
	
	protected JMenuItem jMenuItemRecargarInformacionFuncion;
	protected JMenuItem jMenuItemProcesarInformacionFuncion;
	protected JMenuItem jMenuItemAnterioresFuncion;
	protected JMenuItem jMenuItemSiguientesFuncion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFuncion;
	protected JMenuItem jMenuItemAbrirOrderByFuncion;
	protected JMenuItem jMenuItemMostrarOcultarFuncion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFuncion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosFuncion;
	protected JCheckBox jCheckBoxSeleccionadosFuncion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaFuncion;
	protected JCheckBox jCheckBoxConGraficoReporteFuncion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesFuncion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesFuncion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoFuncion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoFuncion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesFuncion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionFuncion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFuncion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFuncion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarFuncion;
	protected JTextField jTextFieldValorCampoGeneralFuncion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteFuncion;
	//public JList<Reporte> jListColumnasSelectReporteFuncion;
	//public JScrollPane jScrollColumnasSelectReporteFuncion;
	
	//public JLabel jLabelRelacionesSelectReporteFuncion;
	//public JList<Reporte> jListRelacionesSelectReporteFuncion;
	//public JScrollPane jScrollRelacionesSelectReporteFuncion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoFuncion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoFuncion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoFuncion;
	//public JLabel jLabelTiposArchivoReporteDinamicoFuncion;
	
		
	//public JLabel jLabelArchivoImportacionFuncion;	
	//public JLabel jLabelPathArchivoImportacionFuncion;
	//protected JTextField jTextFieldPathArchivoImportacionFuncion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoFuncion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoFuncion;
	
	//public JLabel jLabelColumnaCategoriaValorFuncion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorFuncion;
	
	//public JLabel jLabelColumnasValoresGraficoFuncion;
	//public JList<Reporte> jListColumnasValoresGraficoFuncion;
	//public JScrollPane jScrollColumnasValoresGraficoFuncion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoFuncion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoFuncion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasFuncion;
	
	
	
	
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
	public FuncionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Funcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FuncionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Funcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FuncionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Funcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FuncionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Funcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionFuncion)	{
		this.jButtonRecargarInformacionFuncion = jButtonRecargarInformacionFuncion;
	}
	
	public JButton getjButtonProcesarInformacionFuncion() {
		return this.jButtonProcesarInformacionFuncion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFuncion)	{
		this.jButtonProcesarInformacionFuncion = jButtonProcesarInformacionFuncion;
	}
	
	
	public JButton getjButtonRecargarInformacionFuncion() {
		return this.jButtonRecargarInformacionFuncion;
	}
	
	
	public List<Funcion> getfuncions() {
		return this.funcions;
	}

	public void setfuncions(List<Funcion> funcions) {
		this.funcions = funcions;
	}
	
	public List<Funcion> getfuncionsAux() {
		return this.funcionsAux;
	}

	public void setfuncionsAux(List<Funcion> funcionsAux) {
		this.funcionsAux = funcionsAux;
	}
	
	public List<Funcion> getfuncionsEliminados() {
		return this.funcionsEliminados;
	}

	public void setFuncionsEliminados(List<Funcion> funcionsEliminados) {
		this.funcionsEliminados = funcionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarFuncion() {
		return jComboBoxTiposSeleccionarFuncion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarFuncion(
			JComboBox jComboBoxTiposSeleccionarFuncion) {
		this.jComboBoxTiposSeleccionarFuncion = jComboBoxTiposSeleccionarFuncion;
	}
	
	public void setBorderResaltarTiposSeleccionarFuncion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarFuncion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarFuncion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralFuncion() {
		return jTextFieldValorCampoGeneralFuncion;
	}

	public void setjTextFieldValorCampoGeneralFuncion(
			JTextField jTextFieldValorCampoGeneralFuncion) {
		this.jTextFieldValorCampoGeneralFuncion = jTextFieldValorCampoGeneralFuncion;
	}

	public void setBorderResaltarValorCampoGeneralFuncion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralFuncion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosFuncion() {
		return this.jCheckBoxSeleccionarTodosFuncion;
	}

	public void setjCheckBoxSeleccionarTodosFuncion(
			JCheckBox jCheckBoxSeleccionarTodosFuncion) {
		this.jCheckBoxSeleccionarTodosFuncion = jCheckBoxSeleccionarTodosFuncion;
	}

	public void setBorderResaltarSeleccionarTodosFuncion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosFuncion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosFuncion() {
		return this.jCheckBoxSeleccionadosFuncion;
	}

	public void setjCheckBoxSeleccionadosFuncion(
			JCheckBox jCheckBoxSeleccionadosFuncion) {
		this.jCheckBoxSeleccionadosFuncion = jCheckBoxSeleccionadosFuncion;
	}
	
	public void setBorderResaltarSeleccionadosFuncion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosFuncion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesFuncion() {
		return this.jComboBoxTiposArchivosReportesFuncion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesFuncion(
			JComboBox jComboBoxTiposArchivosReportesFuncion) {
		this.jComboBoxTiposArchivosReportesFuncion = jComboBoxTiposArchivosReportesFuncion;
	}

	public void setBorderResaltarTiposArchivosReportesFuncion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesFuncion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesFuncion() {
		return this.jComboBoxTiposReportesFuncion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesFuncion(
			JComboBox jComboBoxTiposReportesFuncion) {
		this.jComboBoxTiposReportesFuncion = jComboBoxTiposReportesFuncion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoFuncion() {
	//	return jComboBoxTiposReportesDinamicoFuncion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoFuncion(
	//		JComboBox jComboBoxTiposReportesDinamicoFuncion) {
	//	this.jComboBoxTiposReportesDinamicoFuncion = jComboBoxTiposReportesDinamicoFuncion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoFuncion() {
	//	return jComboBoxTiposArchivosReportesDinamicoFuncion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoFuncion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoFuncion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoFuncion = jComboBoxTiposArchivosReportesDinamicoFuncion;
	//}
	
	public void setBorderResaltarTiposReportesFuncion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesFuncion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesFuncion() {
		return this.jComboBoxTiposGraficosReportesFuncion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesFuncion(
			JComboBox jComboBoxTiposGraficosReportesFuncion) {
		this.jComboBoxTiposGraficosReportesFuncion = jComboBoxTiposGraficosReportesFuncion;
	}
	
	public void setBorderResaltarTiposGraficosReportesFuncion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesFuncion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionFuncion() {
		return this.jComboBoxTiposPaginacionFuncion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionFuncion(
			JComboBox jComboBoxTiposPaginacionFuncion) {
		this.jComboBoxTiposPaginacionFuncion = jComboBoxTiposPaginacionFuncion;
	}
	
	public void setBorderResaltarTiposPaginacionFuncion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionFuncion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesFuncion() {
		return this.jComboBoxTiposRelacionesFuncion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFuncion() {
		return this.jComboBoxTiposAccionesFuncion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFuncion(
			JComboBox jComboBoxTiposRelacionesFuncion) {
		this.jComboBoxTiposRelacionesFuncion = jComboBoxTiposRelacionesFuncion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFuncion(
			JComboBox jComboBoxTiposAccionesFuncion) {
		this.jComboBoxTiposAccionesFuncion = jComboBoxTiposAccionesFuncion;
	}
	
	public void setBorderResaltarTiposRelacionesFuncion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesFuncion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesFuncion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarFuncion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesFuncion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoFuncion() {
	//	return jCheckBoxConGraficoDinamicoFuncion;
	//}

	//public void setjCheckBoxConGraficoDinamicoFuncion(
	//		JCheckBox jCheckBoxConGraficoDinamicoFuncion) {
	//	this.jCheckBoxConGraficoDinamicoFuncion = jCheckBoxConGraficoDinamicoFuncion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoFuncion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarFuncion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoFuncion .setBorder(borderResaltar);		
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
		this.funcionSessionBean=new FuncionSessionBean();
		
		this.funcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.funcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.funcionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=FuncionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=FuncionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FuncionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FuncionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FuncionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Funcion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
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
		
		FuncionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Funcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarFuncion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarFuncion,this.jTtoolBarFuncion,
							"nuevo","nuevo","Nuevo"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarFuncion,this.jTtoolBarFuncion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarFuncion,this.jTtoolBarFuncion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarFuncion,this.jTtoolBarFuncion,
							"duplicar","duplicar","Duplicar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarFuncion,this.jTtoolBarFuncion,
							"copiar","copiar","Copiar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarFuncion,this.jTtoolBarFuncion,
							"ver_form","ver_form","Ver"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFuncion,this.jTtoolBarFuncion,
							"recargar","recargar","Recargar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFuncion,this.jTtoolBarFuncion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarFuncion,this.jTtoolBarFuncion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarFuncion,this.jTtoolBarFuncion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarFuncion,this.jTtoolBarFuncion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarFuncion,this.jTtoolBarFuncion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarFuncion,this.jTtoolBarFuncion,
							"cerrar","cerrar","Salir"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarFuncion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarFuncion;
			
				this.jButtonProcesarInformacionToolBarFuncion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarFuncion;
				
		//protected JButton jButtonModificarToolBarFuncion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarFuncion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuFuncion=new JMenuMe("General");
		this.jmenuArchivoFuncion=new JMenuMe("Archivo");
		this.jmenuAccionesFuncion=new JMenuMe("Acciones");
		this.jmenuDatosFuncion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFuncion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFuncion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFuncion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarFuncion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarFuncion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarFuncion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesFuncion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesFuncion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesFuncion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosFuncion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFuncion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFuncion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarFuncion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarFuncion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarFuncion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormFuncion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormFuncion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormFuncion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaFuncion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaFuncion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaFuncion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFuncion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFuncion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFuncion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionFuncion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionFuncion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionFuncion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionFuncion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionFuncion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionFuncion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresFuncion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresFuncion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresFuncion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesFuncion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesFuncion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesFuncion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByFuncion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByFuncion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByFuncion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFuncion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFuncion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFuncion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByFuncion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByFuncion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByFuncion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFuncion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFuncion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFuncion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosFuncion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosFuncion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosFuncion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoFuncion.add(this.jMenuItemCerrarFuncion);
			
			this.jmenuAccionesFuncion.add(this.jMenuItemNuevoFuncion);
			this.jmenuAccionesFuncion.add(this.jMenuItemNuevoGuardarCambiosFuncion);
			this.jmenuAccionesFuncion.add(this.jMenuItemNuevoRelacionesFuncion);
			this.jmenuAccionesFuncion.add(this.jMenuItemGuardarCambiosTablaFuncion);		
			this.jmenuAccionesFuncion.add(this.jMenuItemDuplicarFuncion);		
			this.jmenuAccionesFuncion.add(this.jMenuItemCopiarFuncion);		
			this.jmenuAccionesFuncion.add(this.jMenuItemVerFormFuncion);		
			
			this.jmenuDatosFuncion.add(this.jMenuItemRecargarInformacionFuncion);				
			this.jmenuDatosFuncion.add(this.jMenuItemAnterioresFuncion);				
			this.jmenuDatosFuncion.add(this.jMenuItemSiguientesFuncion);				
			this.jmenuDatosFuncion.add(this.jMenuItemAbrirOrderByFuncion);				
			this.jmenuDatosFuncion.add(this.jMenuItemMostrarOcultarFuncion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesFuncion.add(this.jMenuItemGuardarCambiosFuncion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarFuncion.add(this.jmenuArchivoFuncion);		
			this.jmenuBarFuncion.add(this.jmenuAccionesFuncion);		
			this.jmenuBarFuncion.add(this.jmenuDatosFuncion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarFuncion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasFuncion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasFuncion=new JTabbedPane();


		this.jTabbedPaneBusquedasFuncion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFuncion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasFuncion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasFuncion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasFuncion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleFuncion = new FuncionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Funcion DATOS");
			this.jInternalFrameDetalleFormFuncion = new FuncionDetalleFormJInternalFrame(jDesktopPane,this.funcionSessionBean.getConGuardarRelaciones(),this.funcionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormFuncion = null;//new FuncionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFuncion= new GridBagLayout();
		
		
		this.jTableDatosFuncion = new JTableMe();      
		
		String sToolTipFuncion="";
		sToolTipFuncion=FuncionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFuncion+="(Nomina.Funcion)";
		}
		
		if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
			sToolTipFuncion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosFuncion.setToolTipText(sToolTipFuncion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosFuncion);
		this.jTableDatosFuncion.setAutoCreateRowSorter(true);
		this.jTableDatosFuncion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosFuncion.setRowSelectionAllowed(true);
		this.jTableDatosFuncion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosFuncion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoFuncion = new JButtonMe();
		this.jButtonDuplicarFuncion = new JButtonMe();
		this.jButtonCopiarFuncion = new JButtonMe();
		this.jButtonVerFormFuncion = new JButtonMe();
		this.jButtonNuevoRelacionesFuncion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaFuncion = new JButtonMe();
		this.jButtonCerrarFuncion = new JButtonMe();
		
		this.jScrollPanelDatosFuncion = new JScrollPane();   
        this.jScrollPanelDatosGeneralFuncion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesFuncion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Funcion";
		
		if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Funciones" + this.sPath));
		} else {
			this.jScrollPanelDatosFuncion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFuncion.setToolTipText("Acciones");
        this.jPanelAccionesFuncion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFuncion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFuncion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoFuncion=new ReporteDinamicoJInternalFrame(FuncionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoFuncion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionFuncion=new ImportacionJInternalFrame(FuncionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionFuncion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByFuncion = new JButtonMe();
		
		this.jButtonAbrirOrderByFuncion.setText("Orden");
		this.jButtonAbrirOrderByFuncion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFuncion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByFuncion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFuncion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFuncion,false,this);
			
			//this.cargarOrderByFuncion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByFuncion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFuncion,true,this);
			
			//this.cargarOrderByFuncion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosFuncion.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosFuncion.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosFuncion.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosFuncion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosFuncion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosFuncion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoFuncion.setText("Nuevo");
		this.jButtonDuplicarFuncion.setText("Duplicar");
		this.jButtonCopiarFuncion.setText("Copiar");
		this.jButtonVerFormFuncion.setText("Ver");
		this.jButtonNuevoRelacionesFuncion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaFuncion.setText("Guardar");
		this.jButtonCerrarFuncion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFuncion,"nuevo_button","Nuevo",this.funcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarFuncion,"duplicar_button","Duplicar",this.funcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarFuncion,"copiar_button","Copiar",this.funcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormFuncion,"ver_form","Ver",this.funcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesFuncion,"nuevorelaciones_button","Nuevo Rel",this.funcionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFuncion,"guardarcambiostabla_button","Guardar",this.funcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFuncion,"cerrar_button","Salir",this.funcionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesFuncion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoFuncion.setToolTipText("Nuevo"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarFuncion.setToolTipText("Duplicar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarFuncion.setToolTipText("Copiar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormFuncion.setToolTipText("Ver"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesFuncion.setToolTipText("Nuevo Rel"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaFuncion.setToolTipText("Guardar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFuncion.setToolTipText("Salir"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFuncion";
		inputMap = this.jButtonNuevoFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFuncion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFuncion"));
		
		//DUPLICAR
		sMapKey = "DuplicarFuncion";
		inputMap = this.jButtonDuplicarFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarFuncion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarFuncion"));
		
		//COPIAR
		sMapKey = "CopiarFuncion";
		inputMap = this.jButtonCopiarFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarFuncion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarFuncion"));
		
		//VEr FORM
		sMapKey = "VerFormFuncion";
		inputMap = this.jButtonVerFormFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormFuncion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormFuncion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesFuncion";
		inputMap = this.jButtonNuevoRelacionesFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesFuncion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesFuncion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarFuncion";
		inputMap = this.jButtonModificarFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarFuncion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarFuncion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarFuncion";
		inputMap = this.jButtonCerrarFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFuncion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFuncion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFuncion";
		inputMap = this.jButtonGuardarCambiosTablaFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFuncion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFuncion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesFuncion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesFuncion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionFuncion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Funcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Funcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Funcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Funcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Funcion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesFuncion.setName("jPanelParametrosReportesFuncion"); 
		
		this.jPanelParametrosReportesAccionesFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesFuncion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesFuncion.setName("jPanelParametrosReportesAccionesFuncion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesFuncion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesFuncion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionFuncion = new JButtonMe();
		this.jButtonRecargarInformacionFuncion.setText("Recargar");
		this.jButtonRecargarInformacionFuncion.setToolTipText("Recargar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionFuncion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionFuncion = new JButtonMe();
		this.jButtonProcesarInformacionFuncion.setText("Procesar");
		this.jButtonProcesarInformacionFuncion.setToolTipText("Procesar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionFuncion.setVisible(false);
			
		this.jButtonProcesarInformacionFuncion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFuncion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionFuncion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesFuncion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFuncion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesFuncion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesFuncion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFuncion.setText("TIPO");       
		this.jComboBoxTiposReportesFuncion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesFuncion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesFuncion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesFuncion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionFuncion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionFuncion.setText("Paginacion");
		this.jComboBoxTiposPaginacionFuncion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesFuncion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesFuncion.setText("Accion");
		this.jComboBoxTiposRelacionesFuncion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesFuncion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFuncion.setText("Accion");
		this.jComboBoxTiposAccionesFuncion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarFuncion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarFuncion.setText("Accion");
		this.jComboBoxTiposSeleccionarFuncion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralFuncion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralFuncion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFuncion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralFuncion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesFuncion = new JLabelMe();
		
		this.jLabelAccionesFuncion.setText("Acciones");		
		this.jLabelAccionesFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosFuncion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosFuncion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosFuncion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosFuncion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosFuncion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosFuncion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaFuncion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaFuncion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaFuncion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteFuncion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteFuncion.setText("Graf.");
		this.jCheckBoxConGraficoReporteFuncion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresFuncion = new JButtonMe();
		//this.jButtonAnterioresFuncion.setText("<<");
        this.jButtonAnterioresFuncion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresFuncion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesFuncion = new JButtonMe();
		//this.jButtonSiguientesFuncion.setText(">>");
        this.jButtonSiguientesFuncion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesFuncion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosFuncion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosFuncion.setText("Nue");
        this.jButtonNuevoGuardarCambiosFuncion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosFuncion,"nuevoguardarcambios_button","Nue",this.funcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosFuncion";
		inputMap = this.jButtonNuevoGuardarCambiosFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosFuncion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosFuncion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionFuncion";
		inputMap = this.jButtonRecargarInformacionFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionFuncion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionFuncion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesFuncion";
		inputMap = this.jButtonSiguientesFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesFuncion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesFuncion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresFuncion";
		inputMap = this.jButtonAnterioresFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresFuncion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresFuncion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasFuncion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesFuncion.setMinimumSize(new Dimension(this.getWidth(),FuncionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FuncionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFuncion.setMaximumSize(new Dimension(this.getWidth(),FuncionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FuncionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesFuncion.setPreferredSize(new Dimension(this.getWidth(),FuncionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(FuncionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionFuncion = new GridBagLayout();

			this.jPanelPaginacionFuncion.setLayout(gridaBagLayoutPaginacionFuncion);						
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncion.gridy = 0;
			this.gridBagConstraintsFuncion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionFuncion.add(this.jButtonAnterioresFuncion, this.gridBagConstraintsFuncion);
					
						
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFuncion.gridy = 0;
			
			this.jPanelPaginacionFuncion.add(this.jButtonNuevoGuardarCambiosFuncion, this.gridBagConstraintsFuncion);
						
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsFuncion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsFuncion.gridy = 0;
			this.jPanelPaginacionFuncion.add(this.jButtonSiguientesFuncion, this.gridBagConstraintsFuncion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncion.gridy = 1;
			this.gridBagConstraintsFuncion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFuncion.add(this.jButtonNuevoFuncion, this.gridBagConstraintsFuncion);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsFuncion = new GridBagConstraints();
				this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFuncion.gridy = 1;
				this.gridBagConstraintsFuncion.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionFuncion.add(this.jButtonNuevoRelacionesFuncion, this.gridBagConstraintsFuncion);
			}
			
			
			if(!this.funcionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsFuncion = new GridBagConstraints();
				this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsFuncion.gridy = 1;
				this.gridBagConstraintsFuncion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionFuncion.add(this.jButtonGuardarCambiosTablaFuncion, this.gridBagConstraintsFuncion);
			}
			
			
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncion.gridy = 1;
			this.gridBagConstraintsFuncion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFuncion.add(this.jButtonDuplicarFuncion, this.gridBagConstraintsFuncion);
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncion.gridy = 1;
			this.gridBagConstraintsFuncion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFuncion.add(this.jButtonCopiarFuncion, this.gridBagConstraintsFuncion);
		
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncion.gridy = 1;
			this.gridBagConstraintsFuncion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionFuncion.add(this.jButtonVerFormFuncion, this.gridBagConstraintsFuncion);
		
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncion.gridy = 1;
			this.gridBagConstraintsFuncion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionFuncion.add(this.jButtonCerrarFuncion, this.gridBagConstraintsFuncion);
		
		
		
		this.jButtonRecargarInformacionFuncion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFuncion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionFuncion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionFuncion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesFuncion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFuncion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesFuncion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesFuncion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFuncion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesFuncion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesFuncion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFuncion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesFuncion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionFuncion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFuncion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionFuncion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesFuncion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFuncion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesFuncion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesFuncion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFuncion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFuncion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarFuncion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFuncion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarFuncion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaFuncion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFuncion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaFuncion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteFuncion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFuncion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteFuncion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteFuncion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosFuncion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFuncion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosFuncion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosFuncion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFuncion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosFuncion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesFuncion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesFuncion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Funcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Funcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Funcion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Funcion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesFuncion.setLayout(gridaBagParametrosReportesFuncion);
			this.jPanelParametrosReportesAccionesFuncion.setLayout(gridaBagParametrosReportesAccionesFuncion);
			
			
			this.jPanelParametrosAuxiliar1Funcion.setLayout(gridaBagParametrosAuxiliar1Funcion);
			this.jPanelParametrosAuxiliar2Funcion.setLayout(gridaBagParametrosAuxiliar2Funcion);
			this.jPanelParametrosAuxiliar3Funcion.setLayout(gridaBagParametrosAuxiliar3Funcion);
			this.jPanelParametrosAuxiliar4Funcion.setLayout(gridaBagParametrosAuxiliar4Funcion);
			//this.jPanelParametrosAuxiliar5Funcion.setLayout(gridaBagParametrosAuxiliar2Funcion);			
			
			
			
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFuncion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFuncion.add(this.jButtonRecargarInformacionFuncion, this.gridBagConstraintsFuncion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFuncion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Funcion.add(this.jComboBoxTiposPaginacionFuncion, this.gridBagConstraintsFuncion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFuncion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Funcion.add(this.jCheckBoxConAltoMaximoTablaFuncion, this.gridBagConstraintsFuncion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsFuncion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Funcion.add(this.jComboBoxTiposArchivosReportesFuncion, this.gridBagConstraintsFuncion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFuncion.add(this.jPanelParametrosAuxiliar1Funcion, this.gridBagConstraintsFuncion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFuncion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Funcion.add(this.jComboBoxTiposReportesFuncion, this.gridBagConstraintsFuncion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFuncion.add(this.jPanelParametrosAuxiliar4Funcion, this.gridBagConstraintsFuncion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsFuncion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFuncion.add(this.jComboBoxTiposReportesFuncion, this.gridBagConstraintsFuncion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFuncion.add(this.jCheckBoxGenerarReporteFuncion, this.gridBagConstraintsFuncion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFuncion.add(this.jPanelParametrosAuxiliar2Funcion, this.gridBagConstraintsFuncion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFuncion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFuncion.add(this.jLabelAccionesFuncion, this.gridBagConstraintsFuncion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsFuncion = new GridBagConstraints();
				this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsFuncion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsFuncion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesFuncion.add(this.jButtonAbrirOrderByFuncion, this.gridBagConstraintsFuncion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsFuncion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFuncion.add(this.jComboBoxTiposSeleccionarFuncion, this.gridBagConstraintsFuncion);			
			
			
			/*
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsFuncion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesFuncion.add(this.jCheckBoxSeleccionarTodosFuncion, this.gridBagConstraintsFuncion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFuncion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Funcion.add(this.jCheckBoxSeleccionarTodosFuncion, this.gridBagConstraintsFuncion);															
				
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsFuncion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Funcion.add(this.jCheckBoxSeleccionadosFuncion, this.gridBagConstraintsFuncion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsFuncion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesFuncion.add(this.jPanelParametrosAuxiliar3Funcion, this.gridBagConstraintsFuncion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFuncion.add(this.jComboBoxTiposRelacionesFuncion, this.gridBagConstraintsFuncion);
				
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFuncion.add(this.jComboBoxTiposAccionesFuncion, this.gridBagConstraintsFuncion);
	
				
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsFuncion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesFuncion.add(this.jTextFieldValorCampoGeneralFuncion, this.gridBagConstraintsFuncion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosFuncion = new GridBagLayout();

			this.jScrollPanelDatosFuncion.setLayout(gridaBagLayoutDatosFuncion);
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncion.gridy = 0;
			this.gridBagConstraintsFuncion.gridx = 0;
			
			this.jScrollPanelDatosFuncion.add(this.jTableDatosFuncion, this.gridBagConstraintsFuncion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosFuncion.setViewportView(this.jTableDatosFuncion);
		this.jTableDatosFuncion.setFillsViewportHeight(true);
		this.jTableDatosFuncion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesFuncion= new GridBagLayout();
		this.jPanelAccionesFuncion.setLayout(gridaBagLayoutAccionesFuncion);
		
		
		/*	
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncion.gridy = 0;
		this.gridBagConstraintsFuncion.gridx = 0;
			
		this.jPanelAccionesFuncion.add(this.jButtonNuevoFuncion, this.gridBagConstraintsFuncion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFuncion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFuncion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.funcionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFuncion = new GridBagConstraints();						
			this.gridBagConstraintsFuncion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFuncion.gridx = 0;		
			//this.gridBagConstraintsFuncion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFuncion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarFuncion, this.gridBagConstraintsFuncion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsFuncion.gridx = 0;		
		//this.gridBagConstraintsFuncion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsFuncion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsFuncion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFuncion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesFuncion, this.gridBagConstraintsFuncion);								
		
		
		/*
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFuncion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesFuncion, this.gridBagConstraintsFuncion);
		*/		
		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFuncion.gridx =0;
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFuncion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFuncion, this.gridBagConstraintsFuncion);
				
		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFuncion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionFuncion, this.gridBagConstraintsFuncion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(FuncionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosFuncion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFuncion = new GridBagLayout();
			this.jPanelBusquedasParametrosFuncion.setLayout(gridaBagLayoutBusquedasParametrosFuncion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralFuncion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFuncion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFuncion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFuncion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFuncion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFuncion, this.gridBagConstraintsFuncion);
			
			
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFuncion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFuncion, this.gridBagConstraintsFuncion);
		
			
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFuncion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFuncion, this.gridBagConstraintsFuncion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralFuncion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoFuncion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoFuncion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoFuncion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoFuncion.setName("jPanelReporteDinamicoFuncion"); 
		
		this.jPanelReporteDinamicoFuncion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFuncion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoFuncion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoFuncion.setLayout(gridaBagLayoutReporteDinamicoFuncion);
		
		
		this.jInternalFrameReporteDinamicoFuncion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoFuncion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFuncion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoFuncion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoFuncion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoFuncion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoFuncion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoFuncion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoFuncion.setResizable(true);
	    this.jInternalFrameReporteDinamicoFuncion.setClosable(true);
	    this.jInternalFrameReporteDinamicoFuncion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoFuncion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFuncion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoFuncion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Funciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteFuncion = new JLabelMe();

		this.jLabelColumnasSelectReporteFuncion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFuncion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFuncion.add(this.jLabelColumnasSelectReporteFuncion, this.gridBagConstraintsFuncion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteFuncion = new JList<Reporte>();
		this.jListColumnasSelectReporteFuncion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteFuncion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteFuncion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFuncion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteFuncion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteFuncion=new JScrollPane(this.jListColumnasSelectReporteFuncion);
			
			this.jScrollColumnasSelectReporteFuncion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFuncion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteFuncion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFuncion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFuncion.add(this.jListColumnasSelectReporteFuncion, this.gridBagConstraintsFuncion);
		this.jPanelReporteDinamicoFuncion.add(this.jScrollColumnasSelectReporteFuncion, this.gridBagConstraintsFuncion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteFuncion = new JLabelMe();

		this.jLabelRelacionesSelectReporteFuncion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFuncion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoFuncion.add(this.jLabelRelacionesSelectReporteFuncion, this.gridBagConstraintsFuncion);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteFuncion = new JList<Reporte>();
		this.jListRelacionesSelectReporteFuncion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteFuncion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteFuncion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFuncion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteFuncion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteFuncion=new JScrollPane(this.jListRelacionesSelectReporteFuncion);
			
			this.jScrollRelacionesSelectReporteFuncion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFuncion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteFuncion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFuncion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoFuncion.add(this.jListRelacionesSelectReporteFuncion, this.gridBagConstraintsFuncion);
		this.jPanelReporteDinamicoFuncion.add(this.jScrollRelacionesSelectReporteFuncion, this.gridBagConstraintsFuncion);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoFuncion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoFuncion = new JComboBoxMe();
		this.jListColumnasValoresGraficoFuncion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoFuncion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoFuncion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoFuncion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFuncion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoFuncion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoFuncion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoFuncion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoFuncion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFuncion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoFuncion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoFuncion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoFuncion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFuncion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFuncion.add(this.jLabelGenerarExcelReporteDinamicoFuncion, this.gridBagConstraintsFuncion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoFuncion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoFuncion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoFuncion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoFuncion.setToolTipText("Generar EXCEL"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsFuncion = new GridBagConstraints();
		//this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsFuncion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsFuncion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoFuncion.add(this.jButtonGenerarExcelReporteDinamicoFuncion, this.gridBagConstraintsFuncion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFuncion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFuncion.add(this.jComboBoxTiposReportesDinamicoFuncion, this.gridBagConstraintsFuncion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoFuncion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoFuncion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsFuncion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoFuncion.add(this.jLabelTiposArchivoReporteDinamicoFuncion, this.gridBagConstraintsFuncion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFuncion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFuncion.add(this.jComboBoxTiposArchivosReportesDinamicoFuncion, this.gridBagConstraintsFuncion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoFuncion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoFuncion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoFuncion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoFuncion.setToolTipText("Generar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFuncion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFuncion.add(this.jButtonGenerarReporteDinamicoFuncion, this.gridBagConstraintsFuncion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoFuncion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoFuncion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoFuncion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoFuncion.setToolTipText("Cancelar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsFuncion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoFuncion.add(this.jButtonCerrarReporteDinamicoFuncion, this.gridBagConstraintsFuncion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalFuncion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoFuncion= new JScrollPane(jPanelReporteDinamicoFuncion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoFuncion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFuncion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoFuncion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Funciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsFuncion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoFuncion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoFuncion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalFuncion);
		this.jInternalFrameReporteDinamicoFuncion.getContentPane().add(this.jScrollPanelReporteDinamicoFuncion, this.gridBagConstraintsFuncion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionFuncion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionFuncion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionFuncion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionFuncion.setName("jPanelImportacionFuncion"); 
		
		this.jPanelImportacionFuncion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFuncion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionFuncion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionFuncion.setLayout(gridaBagLayoutImportacionFuncion);
		
		
		this.jInternalFrameImportacionFuncion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionFuncion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionFuncion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteFuncion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionFuncion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFuncion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFuncion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionFuncion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFuncion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFuncion.setResizable(true);
	    this.jInternalFrameImportacionFuncion.setClosable(true);
	    this.jInternalFrameImportacionFuncion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionFuncion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionFuncion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionFuncion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionFuncion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionFuncion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionFuncion.setResizable(true);
	    this.jInternalFrameImportacionFuncion.setClosable(true);
	    this.jInternalFrameImportacionFuncion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionFuncion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFuncion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionFuncion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Funciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionFuncion = new JLabelMe();

		this.jLabelArchivoImportacionFuncion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncion.gridy = iPosYImportacion;		
		this.gridBagConstraintsFuncion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFuncion.add(this.jLabelArchivoImportacionFuncion, this.gridBagConstraintsFuncion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionFuncion = new JFileChooser();		
		this.jFileChooserImportacionFuncion.setToolTipText("ESCOGER ARCHIVO"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionFuncion = new JButtonMe();
		this.jButtonAbrirImportacionFuncion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionFuncion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionFuncion.setToolTipText("Generar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncion.gridy = iPosYImportacion;
		this.gridBagConstraintsFuncion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFuncion.add(this.jButtonAbrirImportacionFuncion, this.gridBagConstraintsFuncion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionFuncion = new JLabelMe();

		this.jLabelPathArchivoImportacionFuncion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncion.gridy = iPosYImportacion;		
		this.gridBagConstraintsFuncion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionFuncion.add(this.jLabelPathArchivoImportacionFuncion, this.gridBagConstraintsFuncion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionFuncion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionFuncion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFuncion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionFuncion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncion.gridy = iPosYImportacion;
		this.gridBagConstraintsFuncion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFuncion.add(this.jTextFieldPathArchivoImportacionFuncion, this.gridBagConstraintsFuncion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionFuncion = new JButtonMe();
		this.jButtonGenerarImportacionFuncion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionFuncion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionFuncion.setToolTipText("Generar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncion.gridy = iPosYImportacion;
		this.gridBagConstraintsFuncion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFuncion.add(this.jButtonGenerarImportacionFuncion, this.gridBagConstraintsFuncion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionFuncion = new JButtonMe();
		this.jButtonCerrarImportacionFuncion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionFuncion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionFuncion.setToolTipText("Cancelar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncion.gridy = iPosYImportacion;
		this.gridBagConstraintsFuncion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionFuncion.add(this.jButtonCerrarImportacionFuncion, this.gridBagConstraintsFuncion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalFuncion = new GridBagLayout();
		
		this.jScrollPanelImportacionFuncion= new JScrollPane(jPanelImportacionFuncion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy =iPosYImportacion;
		this.gridBagConstraintsFuncion.gridx =iPosXImportacion;
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionFuncion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionFuncion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalFuncion);
		this.jInternalFrameImportacionFuncion.getContentPane().add(this.jScrollPanelImportacionFuncion, this.gridBagConstraintsFuncion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByFuncion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByFuncion = new JButtonMe();
			this.jButtonAbrirOrderByFuncion.setText("Orden");
			this.jButtonAbrirOrderByFuncion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByFuncion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByFuncion";
			inputMap = this.jButtonAbrirOrderByFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByFuncion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByFuncion"));
		
		
			GridBagLayout gridaBagLayoutOrderByFuncion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByFuncion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByFuncion.setName("jPanelOrderByFuncion"); 
			
			this.jPanelOrderByFuncion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFuncion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByFuncion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByFuncion.setLayout(gridaBagLayoutOrderByFuncion);
			
			
			this.jTableDatosFuncionOrderBy = new JTableMe();        
			this.jTableDatosFuncionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosFuncionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosFuncionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosFuncionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosFuncionOrderBy.setViewportView(this.jTableDatosFuncionOrderBy);
			this.jTableDatosFuncionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosFuncionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByFuncion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByFuncion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByFuncion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteFuncion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByFuncion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByFuncion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByFuncion.setTitle("Orden");
			this.jInternalFrameOrderByFuncion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByFuncion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByFuncion.setResizable(true);
			this.jInternalFrameOrderByFuncion.setClosable(true);
			this.jInternalFrameOrderByFuncion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByFuncion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFuncion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByFuncion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Funciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsFuncion.gridx =iPosXOrderBy;
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsFuncion.ipady =150;
				
			this.jPanelOrderByFuncion.add(jScrollPanelDatosFuncionOrderBy, this.gridBagConstraintsFuncion);//this.jTableDatosFuncionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByFuncion = new JButtonMe();
			this.jButtonCerrarOrderByFuncion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByFuncion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByFuncion.setToolTipText("Cancelar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsFuncion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByFuncion.add(this.jButtonCerrarOrderByFuncion, this.gridBagConstraintsFuncion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalFuncion = new GridBagLayout();
			
			this.jScrollPanelOrderByFuncion= new JScrollPane(jPanelOrderByFuncion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.gridy =iPosYOrderBy;
			this.gridBagConstraintsFuncion.gridx =iPosXOrderBy;
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByFuncion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByFuncion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalFuncion);
			
			this.jInternalFrameOrderByFuncion.getContentPane().add(this.jScrollPanelOrderByFuncion, this.gridBagConstraintsFuncion);			
		
		} else {
			this.jButtonAbrirOrderByFuncion = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.funcionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosFuncion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosFuncion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosFuncion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosFuncion.getRowHeight();//FuncionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.funcionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > FuncionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFuncion.isSelected()) {
					iHeightTable=FuncionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FuncionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FuncionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > FuncionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaFuncion.isSelected()) {
					iHeightTable=FuncionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < FuncionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=FuncionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosFuncion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFuncion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosFuncion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosFuncion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFuncion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosFuncion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByFuncion!=null && this.jInternalFrameOrderByFuncion.getjTableDatosOrderBy()!=null) {
			//if(!this.funcionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByFuncion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByFuncion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByFuncion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByFuncion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByFuncion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByFuncion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByFuncion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosFuncion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFuncion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosFuncion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=funcionLogic.getFuncions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=funcions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Funcion> TraerFuncionBeans(List<Funcion> funcions,ArrayList<Classe> classes)throws Exception {
		try {
			for(Funcion funcion:funcions) {
					
				if(!(FuncionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || FuncionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					funcion.setsDetalleGeneralEntityReporte(FuncionConstantesFunciones.getFuncionDescripcion(funcion));
										
						
					
					

					if(funcion.getFuncionEstrucs()!=null && Funciones.existeClass(classes,FuncionEstruc.class)) {
						try{funcion.setfuncionestrucsDescripcionReporte(new JRBeanCollectionDataSource(FuncionEstrucJInternalFrame.TraerFuncionEstrucBeans(funcion.getFuncionEstrucs(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//funcion.setsDetalleGeneralEntityReporte(funcion.getsDetalleGeneralEntityReporte());
										
				}
				
				//funcionbeans.add(funcionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return funcions;
    }
	//PARA REPORTES FIN
}
