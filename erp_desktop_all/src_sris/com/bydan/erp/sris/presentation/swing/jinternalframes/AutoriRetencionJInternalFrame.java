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
package com.bydan.erp.sris.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.AutoriRetencionConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class AutoriRetencionJInternalFrame extends AutoriRetencionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarAutoriRetencion;
	
	protected JMenuBar jmenuBarAutoriRetencion;
	
	protected JMenu jmenuAutoriRetencion;
	protected JMenu jmenuDatosAutoriRetencion;
	protected JMenu jmenuArchivoAutoriRetencion;
	protected JMenu jmenuAccionesAutoriRetencion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosAutoriRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAutoriRetencion;	
	protected GridBagConstraints gridBagConstraintsAutoriRetencion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public AutoriRetencionDetalleFormJInternalFrame jInternalFrameDetalleFormAutoriRetencion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoAutoriRetencion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionAutoriRetencion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public AutoriRetencionSessionBean autoriretencionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<AutoriRetencion> autoriretencions;		
	public List<AutoriRetencion> autoriretencionsEliminados;	
	public List<AutoriRetencion> autoriretencionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByAutoriRetencion;		
	protected JButton jButtonAbrirOrderByAutoriRetencion;
	
	
	//protected JPanel jPanelOrderByAutoriRetencion;
	//public JScrollPane jScrollPanelOrderByAutoriRetencion;	
	//protected JButton jButtonCerrarOrderByAutoriRetencion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public AutoriRetencionLogic autoriretencionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosAutoriRetencion;
	public JScrollPane jScrollPanelDatosEdicionAutoriRetencion;
	public JScrollPane jScrollPanelDatosGeneralAutoriRetencion;
    
	
	
	//public JScrollPane jScrollPanelDatosAutoriRetencionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoAutoriRetencion;
	//public JScrollPane jScrollPanelImportacionAutoriRetencion;
	
	
	
	protected JPanel jPanelAccionesAutoriRetencion;
	
    protected JPanel jPanelPaginacionAutoriRetencion;
    protected JPanel jPanelParametrosReportesAutoriRetencion;
	protected JPanel jPanelParametrosReportesAccionesAutoriRetencion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1AutoriRetencion;
	protected JPanel jPanelParametrosAuxiliar2AutoriRetencion;
	protected JPanel jPanelParametrosAuxiliar3AutoriRetencion;
	protected JPanel jPanelParametrosAuxiliar4AutoriRetencion;
	//protected JPanel jPanelParametrosAuxiliar5AutoriRetencion;
	
	
	
	//protected JPanel jPanelReporteDinamicoAutoriRetencion;
	//protected JPanel jPanelImportacionAutoriRetencion;
	
	
	public JTable jTableDatosAutoriRetencion;
	
	
	
	//public JTable jTableDatosAutoriRetencionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoAutoriRetencion;
	protected JButton jButtonDuplicarAutoriRetencion;
	protected JButton jButtonCopiarAutoriRetencion;
	protected JButton jButtonVerFormAutoriRetencion;
	protected JButton jButtonNuevoRelacionesAutoriRetencion;
	protected JButton jButtonModificarAutoriRetencion;
	
    protected JButton jButtonGuardarCambiosTablaAutoriRetencion;
	protected JButton jButtonCerrarAutoriRetencion;
	
	
	protected JButton jButtonRecargarInformacionAutoriRetencion;
	protected JButton jButtonProcesarInformacionAutoriRetencion;
	
	
	protected JButton jButtonAnterioresAutoriRetencion;
	protected JButton jButtonSiguientesAutoriRetencion;
	protected JButton jButtonNuevoGuardarCambiosAutoriRetencion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoAutoriRetencion;
	//protected JButton jButtonCerrarReporteDinamicoAutoriRetencion;
	//protected JButton jButtonGenerarExcelReporteDinamicoAutoriRetencion;	
	
	
	
	//protected JButton jButtonAbrirImportacionAutoriRetencion;
	//protected JButton jButtonGenerarImportacionAutoriRetencion;
	//protected JButton jButtonCerrarImportacionAutoriRetencion;
	//protected JFileChooser jFileChooserImportacionAutoriRetencion;
	//protected File fileImportacionAutoriRetencion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAutoriRetencion;
	protected JButton jButtonDuplicarToolBarAutoriRetencion;
	protected JButton jButtonNuevoRelacionesToolBarAutoriRetencion;
	
	
	public JButton jButtonGuardarCambiosToolBarAutoriRetencion;
	protected JButton jButtonCopiarToolBarAutoriRetencion;
	protected JButton jButtonVerFormToolBarAutoriRetencion;
	public JButton jButtonGuardarCambiosTablaToolBarAutoriRetencion;
	protected JButton jButtonMostrarOcultarTablaToolBarAutoriRetencion;
	protected JButton jButtonCerrarToolBarAutoriRetencion;
	
	protected JButton jButtonRecargarInformacionToolBarAutoriRetencion;
	protected JButton jButtonProcesarInformacionToolBarAutoriRetencion;
	protected JButton jButtonAnterioresToolBarAutoriRetencion;
	protected JButton jButtonSiguientesToolBarAutoriRetencion;
	protected JButton jButtonNuevoGuardarCambiosToolBarAutoriRetencion;
	protected JButton jButtonAbrirOrderByToolBarAutoriRetencion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAutoriRetencion;
	protected JMenuItem jMenuItemDuplicarAutoriRetencion;
	protected JMenuItem jMenuItemNuevoRelacionesAutoriRetencion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosAutoriRetencion;
	protected JMenuItem jMenuItemCopiarAutoriRetencion;
	protected JMenuItem jMenuItemVerFormAutoriRetencion;
	protected JMenuItem jMenuItemGuardarCambiosTablaAutoriRetencion;
	protected JMenuItem jMenuItemCerrarAutoriRetencion;
	protected JMenuItem jMenuItemDetalleCerrarAutoriRetencion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByAutoriRetencion;
	protected JMenuItem jMenuItemDetalleMostarOcultarAutoriRetencion;
	
	protected JMenuItem jMenuItemRecargarInformacionAutoriRetencion;
	protected JMenuItem jMenuItemProcesarInformacionAutoriRetencion;
	protected JMenuItem jMenuItemAnterioresAutoriRetencion;
	protected JMenuItem jMenuItemSiguientesAutoriRetencion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAutoriRetencion;
	protected JMenuItem jMenuItemAbrirOrderByAutoriRetencion;
	protected JMenuItem jMenuItemMostrarOcultarAutoriRetencion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAutoriRetencion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosAutoriRetencion;
	protected JCheckBox jCheckBoxSeleccionadosAutoriRetencion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaAutoriRetencion;
	protected JCheckBox jCheckBoxConGraficoReporteAutoriRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesAutoriRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesAutoriRetencion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoAutoriRetencion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoAutoriRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesAutoriRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionAutoriRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAutoriRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAutoriRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarAutoriRetencion;
	protected JTextField jTextFieldValorCampoGeneralAutoriRetencion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteAutoriRetencion;
	//public JList<Reporte> jListColumnasSelectReporteAutoriRetencion;
	//public JScrollPane jScrollColumnasSelectReporteAutoriRetencion;
	
	//public JLabel jLabelRelacionesSelectReporteAutoriRetencion;
	//public JList<Reporte> jListRelacionesSelectReporteAutoriRetencion;
	//public JScrollPane jScrollRelacionesSelectReporteAutoriRetencion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoAutoriRetencion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoAutoriRetencion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoAutoriRetencion;
	//public JLabel jLabelTiposArchivoReporteDinamicoAutoriRetencion;
	
		
	//public JLabel jLabelArchivoImportacionAutoriRetencion;	
	//public JLabel jLabelPathArchivoImportacionAutoriRetencion;
	//protected JTextField jTextFieldPathArchivoImportacionAutoriRetencion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoAutoriRetencion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoAutoriRetencion;
	
	//public JLabel jLabelColumnaCategoriaValorAutoriRetencion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorAutoriRetencion;
	
	//public JLabel jLabelColumnasValoresGraficoAutoriRetencion;
	//public JList<Reporte> jListColumnasValoresGraficoAutoriRetencion;
	//public JScrollPane jScrollColumnasValoresGraficoAutoriRetencion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoAutoriRetencion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoAutoriRetencion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasAutoriRetencion;
	
	
	
	
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
	//public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public AutoriRetencionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("AutoriRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriRetencionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriRetencionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriRetencionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AutoriRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionAutoriRetencion)	{
		this.jButtonRecargarInformacionAutoriRetencion = jButtonRecargarInformacionAutoriRetencion;
	}
	
	public JButton getjButtonProcesarInformacionAutoriRetencion() {
		return this.jButtonProcesarInformacionAutoriRetencion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAutoriRetencion)	{
		this.jButtonProcesarInformacionAutoriRetencion = jButtonProcesarInformacionAutoriRetencion;
	}
	
	
	public JButton getjButtonRecargarInformacionAutoriRetencion() {
		return this.jButtonRecargarInformacionAutoriRetencion;
	}
	
	
	public List<AutoriRetencion> getautoriretencions() {
		return this.autoriretencions;
	}

	public void setautoriretencions(List<AutoriRetencion> autoriretencions) {
		this.autoriretencions = autoriretencions;
	}
	
	public List<AutoriRetencion> getautoriretencionsAux() {
		return this.autoriretencionsAux;
	}

	public void setautoriretencionsAux(List<AutoriRetencion> autoriretencionsAux) {
		this.autoriretencionsAux = autoriretencionsAux;
	}
	
	public List<AutoriRetencion> getautoriretencionsEliminados() {
		return this.autoriretencionsEliminados;
	}

	public void setAutoriRetencionsEliminados(List<AutoriRetencion> autoriretencionsEliminados) {
		this.autoriretencionsEliminados = autoriretencionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarAutoriRetencion() {
		return jComboBoxTiposSeleccionarAutoriRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarAutoriRetencion(
			JComboBox jComboBoxTiposSeleccionarAutoriRetencion) {
		this.jComboBoxTiposSeleccionarAutoriRetencion = jComboBoxTiposSeleccionarAutoriRetencion;
	}
	
	public void setBorderResaltarTiposSeleccionarAutoriRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarAutoriRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarAutoriRetencion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralAutoriRetencion() {
		return jTextFieldValorCampoGeneralAutoriRetencion;
	}

	public void setjTextFieldValorCampoGeneralAutoriRetencion(
			JTextField jTextFieldValorCampoGeneralAutoriRetencion) {
		this.jTextFieldValorCampoGeneralAutoriRetencion = jTextFieldValorCampoGeneralAutoriRetencion;
	}

	public void setBorderResaltarValorCampoGeneralAutoriRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriRetencion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralAutoriRetencion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosAutoriRetencion() {
		return this.jCheckBoxSeleccionarTodosAutoriRetencion;
	}

	public void setjCheckBoxSeleccionarTodosAutoriRetencion(
			JCheckBox jCheckBoxSeleccionarTodosAutoriRetencion) {
		this.jCheckBoxSeleccionarTodosAutoriRetencion = jCheckBoxSeleccionarTodosAutoriRetencion;
	}

	public void setBorderResaltarSeleccionarTodosAutoriRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriRetencion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosAutoriRetencion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosAutoriRetencion() {
		return this.jCheckBoxSeleccionadosAutoriRetencion;
	}

	public void setjCheckBoxSeleccionadosAutoriRetencion(
			JCheckBox jCheckBoxSeleccionadosAutoriRetencion) {
		this.jCheckBoxSeleccionadosAutoriRetencion = jCheckBoxSeleccionadosAutoriRetencion;
	}
	
	public void setBorderResaltarSeleccionadosAutoriRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriRetencion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosAutoriRetencion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesAutoriRetencion() {
		return this.jComboBoxTiposArchivosReportesAutoriRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesAutoriRetencion(
			JComboBox jComboBoxTiposArchivosReportesAutoriRetencion) {
		this.jComboBoxTiposArchivosReportesAutoriRetencion = jComboBoxTiposArchivosReportesAutoriRetencion;
	}

	public void setBorderResaltarTiposArchivosReportesAutoriRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesAutoriRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesAutoriRetencion() {
		return this.jComboBoxTiposReportesAutoriRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesAutoriRetencion(
			JComboBox jComboBoxTiposReportesAutoriRetencion) {
		this.jComboBoxTiposReportesAutoriRetencion = jComboBoxTiposReportesAutoriRetencion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoAutoriRetencion() {
	//	return jComboBoxTiposReportesDinamicoAutoriRetencion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoAutoriRetencion(
	//		JComboBox jComboBoxTiposReportesDinamicoAutoriRetencion) {
	//	this.jComboBoxTiposReportesDinamicoAutoriRetencion = jComboBoxTiposReportesDinamicoAutoriRetencion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoAutoriRetencion() {
	//	return jComboBoxTiposArchivosReportesDinamicoAutoriRetencion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoAutoriRetencion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoAutoriRetencion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoAutoriRetencion = jComboBoxTiposArchivosReportesDinamicoAutoriRetencion;
	//}
	
	public void setBorderResaltarTiposReportesAutoriRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesAutoriRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesAutoriRetencion() {
		return this.jComboBoxTiposGraficosReportesAutoriRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesAutoriRetencion(
			JComboBox jComboBoxTiposGraficosReportesAutoriRetencion) {
		this.jComboBoxTiposGraficosReportesAutoriRetencion = jComboBoxTiposGraficosReportesAutoriRetencion;
	}
	
	public void setBorderResaltarTiposGraficosReportesAutoriRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesAutoriRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionAutoriRetencion() {
		return this.jComboBoxTiposPaginacionAutoriRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionAutoriRetencion(
			JComboBox jComboBoxTiposPaginacionAutoriRetencion) {
		this.jComboBoxTiposPaginacionAutoriRetencion = jComboBoxTiposPaginacionAutoriRetencion;
	}
	
	public void setBorderResaltarTiposPaginacionAutoriRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionAutoriRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesAutoriRetencion() {
		return this.jComboBoxTiposRelacionesAutoriRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAutoriRetencion() {
		return this.jComboBoxTiposAccionesAutoriRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAutoriRetencion(
			JComboBox jComboBoxTiposRelacionesAutoriRetencion) {
		this.jComboBoxTiposRelacionesAutoriRetencion = jComboBoxTiposRelacionesAutoriRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAutoriRetencion(
			JComboBox jComboBoxTiposAccionesAutoriRetencion) {
		this.jComboBoxTiposAccionesAutoriRetencion = jComboBoxTiposAccionesAutoriRetencion;
	}
	
	public void setBorderResaltarTiposRelacionesAutoriRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesAutoriRetencion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesAutoriRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarAutoriRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesAutoriRetencion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoAutoriRetencion() {
	//	return jCheckBoxConGraficoDinamicoAutoriRetencion;
	//}

	//public void setjCheckBoxConGraficoDinamicoAutoriRetencion(
	//		JCheckBox jCheckBoxConGraficoDinamicoAutoriRetencion) {
	//	this.jCheckBoxConGraficoDinamicoAutoriRetencion = jCheckBoxConGraficoDinamicoAutoriRetencion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoAutoriRetencion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarAutoriRetencion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoAutoriRetencion .setBorder(borderResaltar);		
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
		this.autoriretencionSessionBean=new AutoriRetencionSessionBean();
		
		this.autoriretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.autoriretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.autoriretencionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=AutoriRetencionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=AutoriRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AutoriRetencionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AutoriRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AutoriRetencionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Autori Retencion MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
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
		
		AutoriRetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("AutoriRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarAutoriRetencion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarAutoriRetencion,this.jTtoolBarAutoriRetencion,
							"nuevo","nuevo","Nuevo"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarAutoriRetencion,this.jTtoolBarAutoriRetencion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarAutoriRetencion,this.jTtoolBarAutoriRetencion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarAutoriRetencion,this.jTtoolBarAutoriRetencion,
							"duplicar","duplicar","Duplicar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarAutoriRetencion,this.jTtoolBarAutoriRetencion,
							"copiar","copiar","Copiar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarAutoriRetencion,this.jTtoolBarAutoriRetencion,
							"ver_form","ver_form","Ver"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutoriRetencion,this.jTtoolBarAutoriRetencion,
							"recargar","recargar","Recargar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutoriRetencion,this.jTtoolBarAutoriRetencion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarAutoriRetencion,this.jTtoolBarAutoriRetencion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarAutoriRetencion,this.jTtoolBarAutoriRetencion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarAutoriRetencion,this.jTtoolBarAutoriRetencion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarAutoriRetencion,this.jTtoolBarAutoriRetencion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarAutoriRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarAutoriRetencion,this.jTtoolBarAutoriRetencion,
							"cerrar","cerrar","Salir"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarAutoriRetencion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarAutoriRetencion;
			
				this.jButtonProcesarInformacionToolBarAutoriRetencion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarAutoriRetencion;
				
		//protected JButton jButtonModificarToolBarAutoriRetencion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarAutoriRetencion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuAutoriRetencion=new JMenuMe("General");
		this.jmenuArchivoAutoriRetencion=new JMenuMe("Archivo");
		this.jmenuAccionesAutoriRetencion=new JMenuMe("Acciones");
		this.jmenuDatosAutoriRetencion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAutoriRetencion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAutoriRetencion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAutoriRetencion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarAutoriRetencion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarAutoriRetencion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarAutoriRetencion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesAutoriRetencion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesAutoriRetencion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesAutoriRetencion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosAutoriRetencion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAutoriRetencion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAutoriRetencion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarAutoriRetencion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarAutoriRetencion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarAutoriRetencion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormAutoriRetencion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormAutoriRetencion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormAutoriRetencion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaAutoriRetencion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaAutoriRetencion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaAutoriRetencion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAutoriRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAutoriRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAutoriRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionAutoriRetencion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionAutoriRetencion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionAutoriRetencion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionAutoriRetencion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionAutoriRetencion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionAutoriRetencion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresAutoriRetencion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresAutoriRetencion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresAutoriRetencion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesAutoriRetencion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesAutoriRetencion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesAutoriRetencion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByAutoriRetencion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByAutoriRetencion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByAutoriRetencion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAutoriRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAutoriRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAutoriRetencion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByAutoriRetencion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByAutoriRetencion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByAutoriRetencion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAutoriRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAutoriRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAutoriRetencion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosAutoriRetencion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosAutoriRetencion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosAutoriRetencion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoAutoriRetencion.add(this.jMenuItemCerrarAutoriRetencion);
			
			this.jmenuAccionesAutoriRetencion.add(this.jMenuItemNuevoAutoriRetencion);
			this.jmenuAccionesAutoriRetencion.add(this.jMenuItemNuevoGuardarCambiosAutoriRetencion);
			this.jmenuAccionesAutoriRetencion.add(this.jMenuItemNuevoRelacionesAutoriRetencion);
			this.jmenuAccionesAutoriRetencion.add(this.jMenuItemGuardarCambiosTablaAutoriRetencion);		
			this.jmenuAccionesAutoriRetencion.add(this.jMenuItemDuplicarAutoriRetencion);		
			this.jmenuAccionesAutoriRetencion.add(this.jMenuItemCopiarAutoriRetencion);		
			this.jmenuAccionesAutoriRetencion.add(this.jMenuItemVerFormAutoriRetencion);		
			
			this.jmenuDatosAutoriRetencion.add(this.jMenuItemRecargarInformacionAutoriRetencion);				
			this.jmenuDatosAutoriRetencion.add(this.jMenuItemAnterioresAutoriRetencion);				
			this.jmenuDatosAutoriRetencion.add(this.jMenuItemSiguientesAutoriRetencion);				
			this.jmenuDatosAutoriRetencion.add(this.jMenuItemAbrirOrderByAutoriRetencion);				
			this.jmenuDatosAutoriRetencion.add(this.jMenuItemMostrarOcultarAutoriRetencion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesAutoriRetencion.add(this.jMenuItemGuardarCambiosAutoriRetencion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarAutoriRetencion.add(this.jmenuArchivoAutoriRetencion);		
			this.jmenuBarAutoriRetencion.add(this.jmenuAccionesAutoriRetencion);		
			this.jmenuBarAutoriRetencion.add(this.jmenuDatosAutoriRetencion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarAutoriRetencion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasAutoriRetencion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasAutoriRetencion=new JTabbedPane();


		this.jTabbedPaneBusquedasAutoriRetencion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAutoriRetencion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasAutoriRetencion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasAutoriRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasAutoriRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleAutoriRetencion = new AutoriRetencionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Autori Retencion DATOS");
			this.jInternalFrameDetalleFormAutoriRetencion = new AutoriRetencionDetalleFormJInternalFrame(jDesktopPane,this.autoriretencionSessionBean.getConGuardarRelaciones(),this.autoriretencionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormAutoriRetencion = null;//new AutoriRetencionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAutoriRetencion= new GridBagLayout();
		
		
		this.jTableDatosAutoriRetencion = new JTableMe();      
		
		String sToolTipAutoriRetencion="";
		sToolTipAutoriRetencion=AutoriRetencionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAutoriRetencion+="(Sris.AutoriRetencion)";
		}
		
		if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
			sToolTipAutoriRetencion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosAutoriRetencion.setToolTipText(sToolTipAutoriRetencion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosAutoriRetencion);
		this.jTableDatosAutoriRetencion.setAutoCreateRowSorter(true);
		this.jTableDatosAutoriRetencion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosAutoriRetencion.setRowSelectionAllowed(true);
		this.jTableDatosAutoriRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosAutoriRetencion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoAutoriRetencion = new JButtonMe();
		this.jButtonDuplicarAutoriRetencion = new JButtonMe();
		this.jButtonCopiarAutoriRetencion = new JButtonMe();
		this.jButtonVerFormAutoriRetencion = new JButtonMe();
		this.jButtonNuevoRelacionesAutoriRetencion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaAutoriRetencion = new JButtonMe();
		this.jButtonCerrarAutoriRetencion = new JButtonMe();
		
		this.jScrollPanelDatosAutoriRetencion = new JScrollPane();   
        this.jScrollPanelDatosGeneralAutoriRetencion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesAutoriRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Autori Retencion";
		
		if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Retenciones" + this.sPath));
		} else {
			this.jScrollPanelDatosAutoriRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAutoriRetencion.setToolTipText("Acciones");
        this.jPanelAccionesAutoriRetencion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoAutoriRetencion=new ReporteDinamicoJInternalFrame(AutoriRetencionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoAutoriRetencion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionAutoriRetencion=new ImportacionJInternalFrame(AutoriRetencionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionAutoriRetencion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByAutoriRetencion = new JButtonMe();
		
		this.jButtonAbrirOrderByAutoriRetencion.setText("Orden");
		this.jButtonAbrirOrderByAutoriRetencion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAutoriRetencion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByAutoriRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAutoriRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutoriRetencion,false,this);
			
			//this.cargarOrderByAutoriRetencion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByAutoriRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutoriRetencion,true,this);
			
			//this.cargarOrderByAutoriRetencion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosAutoriRetencion.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosAutoriRetencion.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosAutoriRetencion.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosAutoriRetencion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosAutoriRetencion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosAutoriRetencion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoAutoriRetencion.setText("Nuevo");
		this.jButtonDuplicarAutoriRetencion.setText("Duplicar");
		this.jButtonCopiarAutoriRetencion.setText("Copiar");
		this.jButtonVerFormAutoriRetencion.setText("Ver");
		this.jButtonNuevoRelacionesAutoriRetencion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaAutoriRetencion.setText("Guardar");
		this.jButtonCerrarAutoriRetencion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAutoriRetencion,"nuevo_button","Nuevo",this.autoriretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarAutoriRetencion,"duplicar_button","Duplicar",this.autoriretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarAutoriRetencion,"copiar_button","Copiar",this.autoriretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormAutoriRetencion,"ver_form","Ver",this.autoriretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesAutoriRetencion,"nuevorelaciones_button","Nuevo Rel",this.autoriretencionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAutoriRetencion,"guardarcambiostabla_button","Guardar",this.autoriretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAutoriRetencion,"cerrar_button","Salir",this.autoriretencionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoAutoriRetencion.setToolTipText("Nuevo"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarAutoriRetencion.setToolTipText("Duplicar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarAutoriRetencion.setToolTipText("Copiar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormAutoriRetencion.setToolTipText("Ver"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesAutoriRetencion.setToolTipText("Nuevo Rel"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaAutoriRetencion.setToolTipText("Guardar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAutoriRetencion.setToolTipText("Salir"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAutoriRetencion";
		inputMap = this.jButtonNuevoAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAutoriRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAutoriRetencion"));
		
		//DUPLICAR
		sMapKey = "DuplicarAutoriRetencion";
		inputMap = this.jButtonDuplicarAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarAutoriRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarAutoriRetencion"));
		
		//COPIAR
		sMapKey = "CopiarAutoriRetencion";
		inputMap = this.jButtonCopiarAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarAutoriRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarAutoriRetencion"));
		
		//VEr FORM
		sMapKey = "VerFormAutoriRetencion";
		inputMap = this.jButtonVerFormAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormAutoriRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormAutoriRetencion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesAutoriRetencion";
		inputMap = this.jButtonNuevoRelacionesAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesAutoriRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesAutoriRetencion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarAutoriRetencion";
		inputMap = this.jButtonModificarAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarAutoriRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarAutoriRetencion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarAutoriRetencion";
		inputMap = this.jButtonCerrarAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAutoriRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAutoriRetencion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAutoriRetencion";
		inputMap = this.jButtonGuardarCambiosTablaAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAutoriRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAutoriRetencion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesAutoriRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesAutoriRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionAutoriRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1AutoriRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2AutoriRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3AutoriRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4AutoriRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5AutoriRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesAutoriRetencion.setName("jPanelParametrosReportesAutoriRetencion"); 
		
		this.jPanelParametrosReportesAccionesAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesAutoriRetencion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesAutoriRetencion.setName("jPanelParametrosReportesAccionesAutoriRetencion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesAutoriRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionAutoriRetencion = new JButtonMe();
		this.jButtonRecargarInformacionAutoriRetencion.setText("Recargar");
		this.jButtonRecargarInformacionAutoriRetencion.setToolTipText("Recargar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionAutoriRetencion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionAutoriRetencion = new JButtonMe();
		this.jButtonProcesarInformacionAutoriRetencion.setText("Procesar");
		this.jButtonProcesarInformacionAutoriRetencion.setToolTipText("Procesar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionAutoriRetencion.setVisible(false);
			
		this.jButtonProcesarInformacionAutoriRetencion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAutoriRetencion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionAutoriRetencion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesAutoriRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutoriRetencion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesAutoriRetencion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesAutoriRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutoriRetencion.setText("TIPO");       
		this.jComboBoxTiposReportesAutoriRetencion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesAutoriRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesAutoriRetencion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesAutoriRetencion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionAutoriRetencion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionAutoriRetencion.setText("Paginacion");
		this.jComboBoxTiposPaginacionAutoriRetencion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesAutoriRetencion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesAutoriRetencion.setText("Accion");
		this.jComboBoxTiposRelacionesAutoriRetencion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesAutoriRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAutoriRetencion.setText("Accion");
		this.jComboBoxTiposAccionesAutoriRetencion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarAutoriRetencion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarAutoriRetencion.setText("Accion");
		this.jComboBoxTiposSeleccionarAutoriRetencion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralAutoriRetencion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralAutoriRetencion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAutoriRetencion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralAutoriRetencion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesAutoriRetencion = new JLabelMe();
		
		this.jLabelAccionesAutoriRetencion.setText("Acciones");		
		this.jLabelAccionesAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosAutoriRetencion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosAutoriRetencion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosAutoriRetencion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosAutoriRetencion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosAutoriRetencion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosAutoriRetencion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaAutoriRetencion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaAutoriRetencion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaAutoriRetencion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteAutoriRetencion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteAutoriRetencion.setText("Graf.");
		this.jCheckBoxConGraficoReporteAutoriRetencion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresAutoriRetencion = new JButtonMe();
		//this.jButtonAnterioresAutoriRetencion.setText("<<");
        this.jButtonAnterioresAutoriRetencion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresAutoriRetencion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesAutoriRetencion = new JButtonMe();
		//this.jButtonSiguientesAutoriRetencion.setText(">>");
        this.jButtonSiguientesAutoriRetencion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesAutoriRetencion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosAutoriRetencion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosAutoriRetencion.setText("Nue");
        this.jButtonNuevoGuardarCambiosAutoriRetencion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosAutoriRetencion,"nuevoguardarcambios_button","Nue",this.autoriretencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosAutoriRetencion";
		inputMap = this.jButtonNuevoGuardarCambiosAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosAutoriRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosAutoriRetencion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionAutoriRetencion";
		inputMap = this.jButtonRecargarInformacionAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionAutoriRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionAutoriRetencion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesAutoriRetencion";
		inputMap = this.jButtonSiguientesAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesAutoriRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesAutoriRetencion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresAutoriRetencion";
		inputMap = this.jButtonAnterioresAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresAutoriRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresAutoriRetencion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasAutoriRetencion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesAutoriRetencion.setMinimumSize(new Dimension(this.getWidth(),AutoriRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutoriRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAutoriRetencion.setMaximumSize(new Dimension(this.getWidth(),AutoriRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutoriRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesAutoriRetencion.setPreferredSize(new Dimension(this.getWidth(),AutoriRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(AutoriRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionAutoriRetencion = new GridBagLayout();

			this.jPanelPaginacionAutoriRetencion.setLayout(gridaBagLayoutPaginacionAutoriRetencion);						
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriRetencion.gridy = 0;
			this.gridBagConstraintsAutoriRetencion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionAutoriRetencion.add(this.jButtonAnterioresAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
					
						
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAutoriRetencion.gridy = 0;
			
			this.jPanelPaginacionAutoriRetencion.add(this.jButtonNuevoGuardarCambiosAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
						
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsAutoriRetencion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsAutoriRetencion.gridy = 0;
			this.jPanelPaginacionAutoriRetencion.add(this.jButtonSiguientesAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriRetencion.gridy = 1;
			this.gridBagConstraintsAutoriRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutoriRetencion.add(this.jButtonNuevoAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
						
			
			
			if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
				this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsAutoriRetencion.gridy = 1;
				this.gridBagConstraintsAutoriRetencion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionAutoriRetencion.add(this.jButtonGuardarCambiosTablaAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
			}
			
			
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriRetencion.gridy = 1;
			this.gridBagConstraintsAutoriRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutoriRetencion.add(this.jButtonDuplicarAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriRetencion.gridy = 1;
			this.gridBagConstraintsAutoriRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutoriRetencion.add(this.jButtonCopiarAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriRetencion.gridy = 1;
			this.gridBagConstraintsAutoriRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionAutoriRetencion.add(this.jButtonVerFormAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriRetencion.gridy = 1;
			this.gridBagConstraintsAutoriRetencion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionAutoriRetencion.add(this.jButtonCerrarAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		
		
		
		this.jButtonRecargarInformacionAutoriRetencion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAutoriRetencion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionAutoriRetencion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesAutoriRetencion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAutoriRetencion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesAutoriRetencion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesAutoriRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAutoriRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesAutoriRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesAutoriRetencion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAutoriRetencion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesAutoriRetencion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionAutoriRetencion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAutoriRetencion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionAutoriRetencion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesAutoriRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAutoriRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesAutoriRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesAutoriRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarAutoriRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAutoriRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarAutoriRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaAutoriRetencion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAutoriRetencion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaAutoriRetencion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteAutoriRetencion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAutoriRetencion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteAutoriRetencion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosAutoriRetencion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAutoriRetencion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosAutoriRetencion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosAutoriRetencion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAutoriRetencion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosAutoriRetencion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesAutoriRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesAutoriRetencion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1AutoriRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2AutoriRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3AutoriRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4AutoriRetencion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesAutoriRetencion.setLayout(gridaBagParametrosReportesAutoriRetencion);
			this.jPanelParametrosReportesAccionesAutoriRetencion.setLayout(gridaBagParametrosReportesAccionesAutoriRetencion);
			
			
			this.jPanelParametrosAuxiliar1AutoriRetencion.setLayout(gridaBagParametrosAuxiliar1AutoriRetencion);
			this.jPanelParametrosAuxiliar2AutoriRetencion.setLayout(gridaBagParametrosAuxiliar2AutoriRetencion);
			this.jPanelParametrosAuxiliar3AutoriRetencion.setLayout(gridaBagParametrosAuxiliar3AutoriRetencion);
			this.jPanelParametrosAuxiliar4AutoriRetencion.setLayout(gridaBagParametrosAuxiliar4AutoriRetencion);
			//this.jPanelParametrosAuxiliar5AutoriRetencion.setLayout(gridaBagParametrosAuxiliar2AutoriRetencion);			
			
			
			
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriRetencion.add(this.jButtonRecargarInformacionAutoriRetencion, this.gridBagConstraintsAutoriRetencion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutoriRetencion.add(this.jComboBoxTiposPaginacionAutoriRetencion, this.gridBagConstraintsAutoriRetencion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutoriRetencion.add(this.jCheckBoxConAltoMaximoTablaAutoriRetencion, this.gridBagConstraintsAutoriRetencion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1AutoriRetencion.add(this.jComboBoxTiposArchivosReportesAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriRetencion.add(this.jPanelParametrosAuxiliar1AutoriRetencion, this.gridBagConstraintsAutoriRetencion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4AutoriRetencion.add(this.jComboBoxTiposReportesAutoriRetencion, this.gridBagConstraintsAutoriRetencion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriRetencion.add(this.jPanelParametrosAuxiliar4AutoriRetencion, this.gridBagConstraintsAutoriRetencion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriRetencion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriRetencion.add(this.jComboBoxTiposReportesAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriRetencion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriRetencion.add(this.jCheckBoxGenerarReporteAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriRetencion.add(this.jPanelParametrosAuxiliar2AutoriRetencion, this.gridBagConstraintsAutoriRetencion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriRetencion.add(this.jLabelAccionesAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
				this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsAutoriRetencion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsAutoriRetencion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesAutoriRetencion.add(this.jButtonAbrirOrderByAutoriRetencion, this.gridBagConstraintsAutoriRetencion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriRetencion.add(this.jComboBoxTiposSeleccionarAutoriRetencion, this.gridBagConstraintsAutoriRetencion);			
			
			
			/*
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsAutoriRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesAutoriRetencion.add(this.jCheckBoxSeleccionarTodosAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AutoriRetencion.add(this.jCheckBoxSeleccionarTodosAutoriRetencion, this.gridBagConstraintsAutoriRetencion);															
				
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsAutoriRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3AutoriRetencion.add(this.jCheckBoxSeleccionadosAutoriRetencion, this.gridBagConstraintsAutoriRetencion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesAutoriRetencion.add(this.jPanelParametrosAuxiliar3AutoriRetencion, this.gridBagConstraintsAutoriRetencion);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriRetencion.add(this.jComboBoxTiposAccionesAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
	
				
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsAutoriRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesAutoriRetencion.add(this.jTextFieldValorCampoGeneralAutoriRetencion, this.gridBagConstraintsAutoriRetencion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosAutoriRetencion = new GridBagLayout();

			this.jScrollPanelDatosAutoriRetencion.setLayout(gridaBagLayoutDatosAutoriRetencion);
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriRetencion.gridy = 0;
			this.gridBagConstraintsAutoriRetencion.gridx = 0;
			
			this.jScrollPanelDatosAutoriRetencion.add(this.jTableDatosAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosAutoriRetencion.setViewportView(this.jTableDatosAutoriRetencion);
		this.jTableDatosAutoriRetencion.setFillsViewportHeight(true);
		this.jTableDatosAutoriRetencion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesAutoriRetencion= new GridBagLayout();
		this.jPanelAccionesAutoriRetencion.setLayout(gridaBagLayoutAccionesAutoriRetencion);
		
		
		/*	
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriRetencion.gridy = 0;
		this.gridBagConstraintsAutoriRetencion.gridx = 0;
			
		this.jPanelAccionesAutoriRetencion.add(this.jButtonNuevoAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAutoriRetencion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAutoriRetencion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.autoriretencionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();						
			this.gridBagConstraintsAutoriRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutoriRetencion.gridx = 0;		
			//this.gridBagConstraintsAutoriRetencion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAutoriRetencion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarAutoriRetencion, this.gridBagConstraintsAutoriRetencion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsAutoriRetencion.gridx = 0;		
		//this.gridBagConstraintsAutoriRetencion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriRetencion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsAutoriRetencion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsAutoriRetencion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriRetencion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesAutoriRetencion, this.gridBagConstraintsAutoriRetencion);								
		
		
		/*
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriRetencion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		*/		
		
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAutoriRetencion.gridx =0;
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAutoriRetencion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
				
		
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriRetencion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(AutoriRetencionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosAutoriRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAutoriRetencion = new GridBagLayout();
			this.jPanelBusquedasParametrosAutoriRetencion.setLayout(gridaBagLayoutBusquedasParametrosAutoriRetencion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralAutoriRetencion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAutoriRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
			
			
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		
			
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAutoriRetencion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralAutoriRetencion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoAutoriRetencion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoAutoriRetencion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoAutoriRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoAutoriRetencion.setName("jPanelReporteDinamicoAutoriRetencion"); 
		
		this.jPanelReporteDinamicoAutoriRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAutoriRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoAutoriRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoAutoriRetencion.setLayout(gridaBagLayoutReporteDinamicoAutoriRetencion);
		
		
		this.jInternalFrameReporteDinamicoAutoriRetencion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoAutoriRetencion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAutoriRetencion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoAutoriRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoAutoriRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoAutoriRetencion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoAutoriRetencion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoAutoriRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoAutoriRetencion.setResizable(true);
	    this.jInternalFrameReporteDinamicoAutoriRetencion.setClosable(true);
	    this.jInternalFrameReporteDinamicoAutoriRetencion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoAutoriRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAutoriRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoAutoriRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Retenciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteAutoriRetencion = new JLabelMe();

		this.jLabelColumnasSelectReporteAutoriRetencion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoAutoriRetencion.add(this.jLabelColumnasSelectReporteAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteAutoriRetencion = new JList<Reporte>();
		this.jListColumnasSelectReporteAutoriRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteAutoriRetencion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteAutoriRetencion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAutoriRetencion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteAutoriRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteAutoriRetencion=new JScrollPane(this.jListColumnasSelectReporteAutoriRetencion);
			
			this.jScrollColumnasSelectReporteAutoriRetencion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAutoriRetencion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteAutoriRetencion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoAutoriRetencion.add(this.jListColumnasSelectReporteAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		this.jPanelReporteDinamicoAutoriRetencion.add(this.jScrollColumnasSelectReporteAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteAutoriRetencion = new JLabelMe();

		this.jLabelRelacionesSelectReporteAutoriRetencion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteAutoriRetencion = new JList<Reporte>();
		this.jListRelacionesSelectReporteAutoriRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteAutoriRetencion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteAutoriRetencion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAutoriRetencion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteAutoriRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteAutoriRetencion=new JScrollPane(this.jListRelacionesSelectReporteAutoriRetencion);
			
			this.jScrollRelacionesSelectReporteAutoriRetencion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAutoriRetencion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteAutoriRetencion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoAutoriRetencion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoAutoriRetencion = new JComboBoxMe();
		this.jListColumnasValoresGraficoAutoriRetencion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoAutoriRetencion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoAutoriRetencion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoAutoriRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAutoriRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoAutoriRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoAutoriRetencion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoAutoriRetencion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoAutoriRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAutoriRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoAutoriRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoAutoriRetencion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoAutoriRetencion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriRetencion.add(this.jLabelGenerarExcelReporteDinamicoAutoriRetencion, this.gridBagConstraintsAutoriRetencion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoAutoriRetencion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoAutoriRetencion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoAutoriRetencion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoAutoriRetencion.setToolTipText("Generar EXCEL"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		//this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsAutoriRetencion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsAutoriRetencion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoAutoriRetencion.add(this.jButtonGenerarExcelReporteDinamicoAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriRetencion.add(this.jComboBoxTiposReportesDinamicoAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoAutoriRetencion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoAutoriRetencion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoAutoriRetencion.add(this.jLabelTiposArchivoReporteDinamicoAutoriRetencion, this.gridBagConstraintsAutoriRetencion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriRetencion.add(this.jComboBoxTiposArchivosReportesDinamicoAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoAutoriRetencion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoAutoriRetencion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoAutoriRetencion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoAutoriRetencion.setToolTipText("Generar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriRetencion.add(this.jButtonGenerarReporteDinamicoAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoAutoriRetencion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoAutoriRetencion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoAutoriRetencion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoAutoriRetencion.setToolTipText("Cancelar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoAutoriRetencion.add(this.jButtonCerrarReporteDinamicoAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalAutoriRetencion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoAutoriRetencion= new JScrollPane(jPanelReporteDinamicoAutoriRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoAutoriRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAutoriRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoAutoriRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Retenciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsAutoriRetencion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoAutoriRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoAutoriRetencion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalAutoriRetencion);
		this.jInternalFrameReporteDinamicoAutoriRetencion.getContentPane().add(this.jScrollPanelReporteDinamicoAutoriRetencion, this.gridBagConstraintsAutoriRetencion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionAutoriRetencion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionAutoriRetencion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionAutoriRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionAutoriRetencion.setName("jPanelImportacionAutoriRetencion"); 
		
		this.jPanelImportacionAutoriRetencion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAutoriRetencion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionAutoriRetencion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionAutoriRetencion.setLayout(gridaBagLayoutImportacionAutoriRetencion);
		
		
		this.jInternalFrameImportacionAutoriRetencion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionAutoriRetencion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionAutoriRetencion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteAutoriRetencion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionAutoriRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAutoriRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAutoriRetencion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionAutoriRetencion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAutoriRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAutoriRetencion.setResizable(true);
	    this.jInternalFrameImportacionAutoriRetencion.setClosable(true);
	    this.jInternalFrameImportacionAutoriRetencion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionAutoriRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionAutoriRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionAutoriRetencion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionAutoriRetencion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionAutoriRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionAutoriRetencion.setResizable(true);
	    this.jInternalFrameImportacionAutoriRetencion.setClosable(true);
	    this.jInternalFrameImportacionAutoriRetencion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionAutoriRetencion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAutoriRetencion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionAutoriRetencion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Retenciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionAutoriRetencion = new JLabelMe();

		this.jLabelArchivoImportacionAutoriRetencion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = iPosYImportacion;		
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAutoriRetencion.add(this.jLabelArchivoImportacionAutoriRetencion, this.gridBagConstraintsAutoriRetencion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionAutoriRetencion = new JFileChooser();		
		this.jFileChooserImportacionAutoriRetencion.setToolTipText("ESCOGER ARCHIVO"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionAutoriRetencion = new JButtonMe();
		this.jButtonAbrirImportacionAutoriRetencion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionAutoriRetencion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionAutoriRetencion.setToolTipText("Generar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriRetencion.add(this.jButtonAbrirImportacionAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionAutoriRetencion = new JLabelMe();

		this.jLabelPathArchivoImportacionAutoriRetencion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionAutoriRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAutoriRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionAutoriRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriRetencion.gridy = iPosYImportacion;		
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionAutoriRetencion.add(this.jLabelPathArchivoImportacionAutoriRetencion, this.gridBagConstraintsAutoriRetencion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionAutoriRetencion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionAutoriRetencion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAutoriRetencion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionAutoriRetencion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriRetencion.add(this.jTextFieldPathArchivoImportacionAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionAutoriRetencion = new JButtonMe();
		this.jButtonGenerarImportacionAutoriRetencion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionAutoriRetencion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionAutoriRetencion.setToolTipText("Generar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriRetencion.add(this.jButtonGenerarImportacionAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionAutoriRetencion = new JButtonMe();
		this.jButtonCerrarImportacionAutoriRetencion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionAutoriRetencion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionAutoriRetencion.setToolTipText("Cancelar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsAutoriRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionAutoriRetencion.add(this.jButtonCerrarImportacionAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalAutoriRetencion = new GridBagLayout();
		
		this.jScrollPanelImportacionAutoriRetencion= new JScrollPane(jPanelImportacionAutoriRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
		this.gridBagConstraintsAutoriRetencion.gridy =iPosYImportacion;
		this.gridBagConstraintsAutoriRetencion.gridx =iPosXImportacion;
		this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionAutoriRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionAutoriRetencion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalAutoriRetencion);
		this.jInternalFrameImportacionAutoriRetencion.getContentPane().add(this.jScrollPanelImportacionAutoriRetencion, this.gridBagConstraintsAutoriRetencion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByAutoriRetencion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByAutoriRetencion = new JButtonMe();
			this.jButtonAbrirOrderByAutoriRetencion.setText("Orden");
			this.jButtonAbrirOrderByAutoriRetencion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByAutoriRetencion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByAutoriRetencion";
			inputMap = this.jButtonAbrirOrderByAutoriRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByAutoriRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByAutoriRetencion"));
		
		
			GridBagLayout gridaBagLayoutOrderByAutoriRetencion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByAutoriRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByAutoriRetencion.setName("jPanelOrderByAutoriRetencion"); 
			
			this.jPanelOrderByAutoriRetencion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAutoriRetencion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByAutoriRetencion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByAutoriRetencion.setLayout(gridaBagLayoutOrderByAutoriRetencion);
			
			
			this.jTableDatosAutoriRetencionOrderBy = new JTableMe();        
			this.jTableDatosAutoriRetencionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosAutoriRetencionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosAutoriRetencionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosAutoriRetencionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosAutoriRetencionOrderBy.setViewportView(this.jTableDatosAutoriRetencionOrderBy);
			this.jTableDatosAutoriRetencionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosAutoriRetencionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByAutoriRetencion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByAutoriRetencion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByAutoriRetencion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteAutoriRetencion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByAutoriRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByAutoriRetencion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByAutoriRetencion.setTitle("Orden");
			this.jInternalFrameOrderByAutoriRetencion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByAutoriRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByAutoriRetencion.setResizable(true);
			this.jInternalFrameOrderByAutoriRetencion.setClosable(true);
			this.jInternalFrameOrderByAutoriRetencion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByAutoriRetencion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAutoriRetencion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByAutoriRetencion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByAutoriRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autori Retenciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsAutoriRetencion.gridx =iPosXOrderBy;
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsAutoriRetencion.ipady =150;
				
			this.jPanelOrderByAutoriRetencion.add(jScrollPanelDatosAutoriRetencionOrderBy, this.gridBagConstraintsAutoriRetencion);//this.jTableDatosAutoriRetencionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByAutoriRetencion = new JButtonMe();
			this.jButtonCerrarOrderByAutoriRetencion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByAutoriRetencion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByAutoriRetencion.setToolTipText("Cancelar"+" "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByAutoriRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriRetencion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsAutoriRetencion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByAutoriRetencion.add(this.jButtonCerrarOrderByAutoriRetencion, this.gridBagConstraintsAutoriRetencion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalAutoriRetencion = new GridBagLayout();
			
			this.jScrollPanelOrderByAutoriRetencion= new JScrollPane(jPanelOrderByAutoriRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsAutoriRetencion = new GridBagConstraints();
			this.gridBagConstraintsAutoriRetencion.gridy =iPosYOrderBy;
			this.gridBagConstraintsAutoriRetencion.gridx =iPosXOrderBy;
			this.gridBagConstraintsAutoriRetencion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByAutoriRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByAutoriRetencion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalAutoriRetencion);
			
			this.jInternalFrameOrderByAutoriRetencion.getContentPane().add(this.jScrollPanelOrderByAutoriRetencion, this.gridBagConstraintsAutoriRetencion);			
		
		} else {
			this.jButtonAbrirOrderByAutoriRetencion = new JButtonMe();
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
		int iWidthTableCalculado=0;//1830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.autoriretencionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosAutoriRetencion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosAutoriRetencion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosAutoriRetencion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosAutoriRetencion.getRowHeight();//AutoriRetencionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > AutoriRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAutoriRetencion.isSelected()) {
					iHeightTable=AutoriRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AutoriRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AutoriRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > AutoriRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaAutoriRetencion.isSelected()) {
					iHeightTable=AutoriRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < AutoriRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=AutoriRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosAutoriRetencion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAutoriRetencion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosAutoriRetencion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosAutoriRetencion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAutoriRetencion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosAutoriRetencion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByAutoriRetencion!=null && this.jInternalFrameOrderByAutoriRetencion.getjTableDatosOrderBy()!=null) {
			//if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByAutoriRetencion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByAutoriRetencion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByAutoriRetencion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByAutoriRetencion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByAutoriRetencion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByAutoriRetencion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByAutoriRetencion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosAutoriRetencion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAutoriRetencion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosAutoriRetencion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=autoriretencionLogic.getAutoriRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=autoriretencions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<AutoriRetencion> TraerAutoriRetencionBeans(List<AutoriRetencion> autoriretencions,ArrayList<Classe> classes)throws Exception {
		try {
			for(AutoriRetencion autoriretencion:autoriretencions) {
					
				if(!(AutoriRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || AutoriRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					autoriretencion.setsDetalleGeneralEntityReporte(AutoriRetencionConstantesFunciones.getAutoriRetencionDescripcion(autoriretencion));
										
					autoriretencion.setesta_activo_descripcion(AutoriRetencionConstantesFunciones.getesta_activoDescripcion(autoriretencion));	
					
						
					
				} else  {
							
					//autoriretencion.setsDetalleGeneralEntityReporte(autoriretencion.getsDetalleGeneralEntityReporte());
										
				}
				
				//autoriretencionbeans.add(autoriretencionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return autoriretencions;
    }
	//PARA REPORTES FIN
}
