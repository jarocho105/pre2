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
import com.bydan.erp.seguridad.util.ResumenUsuarioConstantesFunciones;

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
public class ResumenUsuarioJInternalFrame extends ResumenUsuarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarResumenUsuario;
	
	protected JMenuBar jmenuBarResumenUsuario;
	
	protected JMenu jmenuResumenUsuario;
	protected JMenu jmenuDatosResumenUsuario;
	protected JMenu jmenuArchivoResumenUsuario;
	protected JMenu jmenuAccionesResumenUsuario;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosResumenUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutResumenUsuario;	
	protected GridBagConstraints gridBagConstraintsResumenUsuario;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ResumenUsuarioDetalleFormJInternalFrame jInternalFrameDetalleFormResumenUsuario;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoResumenUsuario;	
	protected ImportacionJInternalFrame jInternalFrameImportacionResumenUsuario;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public ResumenUsuarioSessionBean resumenusuarioSessionBean;
		
	
	
	public UsuarioSessionBean usuarioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ResumenUsuario> resumenusuarios;		
	public List<ResumenUsuario> resumenusuariosEliminados;	
	public List<ResumenUsuario> resumenusuariosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByResumenUsuario;		
	protected JButton jButtonAbrirOrderByResumenUsuario;
	
	
	//protected JPanel jPanelOrderByResumenUsuario;
	//public JScrollPane jScrollPanelOrderByResumenUsuario;	
	//protected JButton jButtonCerrarOrderByResumenUsuario;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ResumenUsuarioLogic resumenusuarioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosResumenUsuario;
	public JScrollPane jScrollPanelDatosEdicionResumenUsuario;
	public JScrollPane jScrollPanelDatosGeneralResumenUsuario;
    
	
	
	//public JScrollPane jScrollPanelDatosResumenUsuarioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoResumenUsuario;
	//public JScrollPane jScrollPanelImportacionResumenUsuario;
	
	
	
	protected JPanel jPanelAccionesResumenUsuario;
	
    protected JPanel jPanelPaginacionResumenUsuario;
    protected JPanel jPanelParametrosReportesResumenUsuario;
	protected JPanel jPanelParametrosReportesAccionesResumenUsuario;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ResumenUsuario;
	protected JPanel jPanelParametrosAuxiliar2ResumenUsuario;
	protected JPanel jPanelParametrosAuxiliar3ResumenUsuario;
	protected JPanel jPanelParametrosAuxiliar4ResumenUsuario;
	//protected JPanel jPanelParametrosAuxiliar5ResumenUsuario;
	
	
	
	//protected JPanel jPanelReporteDinamicoResumenUsuario;
	//protected JPanel jPanelImportacionResumenUsuario;
	
	
	public JTable jTableDatosResumenUsuario;
	
	
	
	//public JTable jTableDatosResumenUsuarioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoResumenUsuario;
	protected JButton jButtonDuplicarResumenUsuario;
	protected JButton jButtonCopiarResumenUsuario;
	protected JButton jButtonVerFormResumenUsuario;
	protected JButton jButtonNuevoRelacionesResumenUsuario;
	protected JButton jButtonModificarResumenUsuario;
	
    protected JButton jButtonGuardarCambiosTablaResumenUsuario;
	protected JButton jButtonCerrarResumenUsuario;
	
	
	protected JButton jButtonRecargarInformacionResumenUsuario;
	protected JButton jButtonProcesarInformacionResumenUsuario;
	
	
	protected JButton jButtonAnterioresResumenUsuario;
	protected JButton jButtonSiguientesResumenUsuario;
	protected JButton jButtonNuevoGuardarCambiosResumenUsuario;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoResumenUsuario;
	//protected JButton jButtonCerrarReporteDinamicoResumenUsuario;
	//protected JButton jButtonGenerarExcelReporteDinamicoResumenUsuario;	
	
	
	
	//protected JButton jButtonAbrirImportacionResumenUsuario;
	//protected JButton jButtonGenerarImportacionResumenUsuario;
	//protected JButton jButtonCerrarImportacionResumenUsuario;
	//protected JFileChooser jFileChooserImportacionResumenUsuario;
	//protected File fileImportacionResumenUsuario;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarResumenUsuario;
	protected JButton jButtonDuplicarToolBarResumenUsuario;
	protected JButton jButtonNuevoRelacionesToolBarResumenUsuario;
	
	
	public JButton jButtonGuardarCambiosToolBarResumenUsuario;
	protected JButton jButtonCopiarToolBarResumenUsuario;
	protected JButton jButtonVerFormToolBarResumenUsuario;
	public JButton jButtonGuardarCambiosTablaToolBarResumenUsuario;
	protected JButton jButtonMostrarOcultarTablaToolBarResumenUsuario;
	protected JButton jButtonCerrarToolBarResumenUsuario;
	
	protected JButton jButtonRecargarInformacionToolBarResumenUsuario;
	protected JButton jButtonProcesarInformacionToolBarResumenUsuario;
	protected JButton jButtonAnterioresToolBarResumenUsuario;
	protected JButton jButtonSiguientesToolBarResumenUsuario;
	protected JButton jButtonNuevoGuardarCambiosToolBarResumenUsuario;
	protected JButton jButtonAbrirOrderByToolBarResumenUsuario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoResumenUsuario;
	protected JMenuItem jMenuItemDuplicarResumenUsuario;
	protected JMenuItem jMenuItemNuevoRelacionesResumenUsuario;
	
	
	protected JMenuItem jMenuItemGuardarCambiosResumenUsuario;
	protected JMenuItem jMenuItemCopiarResumenUsuario;
	protected JMenuItem jMenuItemVerFormResumenUsuario;
	protected JMenuItem jMenuItemGuardarCambiosTablaResumenUsuario;
	protected JMenuItem jMenuItemCerrarResumenUsuario;
	protected JMenuItem jMenuItemDetalleCerrarResumenUsuario;
	protected JMenuItem jMenuItemDetalleAbrirOrderByResumenUsuario;
	protected JMenuItem jMenuItemDetalleMostarOcultarResumenUsuario;
	
	protected JMenuItem jMenuItemRecargarInformacionResumenUsuario;
	protected JMenuItem jMenuItemProcesarInformacionResumenUsuario;
	protected JMenuItem jMenuItemAnterioresResumenUsuario;
	protected JMenuItem jMenuItemSiguientesResumenUsuario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosResumenUsuario;
	protected JMenuItem jMenuItemAbrirOrderByResumenUsuario;
	protected JMenuItem jMenuItemMostrarOcultarResumenUsuario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesResumenUsuario;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosResumenUsuario;
	protected JCheckBox jCheckBoxSeleccionadosResumenUsuario;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaResumenUsuario;
	protected JCheckBox jCheckBoxConGraficoReporteResumenUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesResumenUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesResumenUsuario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoResumenUsuario;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoResumenUsuario;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesResumenUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionResumenUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesResumenUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesResumenUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarResumenUsuario;
	protected JTextField jTextFieldValorCampoGeneralResumenUsuario;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteResumenUsuario;
	//public JList<Reporte> jListColumnasSelectReporteResumenUsuario;
	//public JScrollPane jScrollColumnasSelectReporteResumenUsuario;
	
	//public JLabel jLabelRelacionesSelectReporteResumenUsuario;
	//public JList<Reporte> jListRelacionesSelectReporteResumenUsuario;
	//public JScrollPane jScrollRelacionesSelectReporteResumenUsuario;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoResumenUsuario;
	//protected JCheckBox jCheckBoxConGraficoDinamicoResumenUsuario;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoResumenUsuario;
	//public JLabel jLabelTiposArchivoReporteDinamicoResumenUsuario;
	
		
	//public JLabel jLabelArchivoImportacionResumenUsuario;	
	//public JLabel jLabelPathArchivoImportacionResumenUsuario;
	//protected JTextField jTextFieldPathArchivoImportacionResumenUsuario;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoResumenUsuario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoResumenUsuario;
	
	//public JLabel jLabelColumnaCategoriaValorResumenUsuario;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorResumenUsuario;
	
	//public JLabel jLabelColumnasValoresGraficoResumenUsuario;
	//public JList<Reporte> jListColumnasValoresGraficoResumenUsuario;
	//public JScrollPane jScrollColumnasValoresGraficoResumenUsuario;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoResumenUsuario;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoResumenUsuario;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasResumenUsuario;
	
	
	
	
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
	public ResumenUsuarioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ResumenUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenUsuarioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResumenUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenUsuarioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResumenUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenUsuarioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ResumenUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionResumenUsuario)	{
		this.jButtonRecargarInformacionResumenUsuario = jButtonRecargarInformacionResumenUsuario;
	}
	
	public JButton getjButtonProcesarInformacionResumenUsuario() {
		return this.jButtonProcesarInformacionResumenUsuario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionResumenUsuario)	{
		this.jButtonProcesarInformacionResumenUsuario = jButtonProcesarInformacionResumenUsuario;
	}
	
	
	public JButton getjButtonRecargarInformacionResumenUsuario() {
		return this.jButtonRecargarInformacionResumenUsuario;
	}
	
	
	public List<ResumenUsuario> getresumenusuarios() {
		return this.resumenusuarios;
	}

	public void setresumenusuarios(List<ResumenUsuario> resumenusuarios) {
		this.resumenusuarios = resumenusuarios;
	}
	
	public List<ResumenUsuario> getresumenusuariosAux() {
		return this.resumenusuariosAux;
	}

	public void setresumenusuariosAux(List<ResumenUsuario> resumenusuariosAux) {
		this.resumenusuariosAux = resumenusuariosAux;
	}
	
	public List<ResumenUsuario> getresumenusuariosEliminados() {
		return this.resumenusuariosEliminados;
	}

	public void setResumenUsuariosEliminados(List<ResumenUsuario> resumenusuariosEliminados) {
		this.resumenusuariosEliminados = resumenusuariosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarResumenUsuario() {
		return jComboBoxTiposSeleccionarResumenUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarResumenUsuario(
			JComboBox jComboBoxTiposSeleccionarResumenUsuario) {
		this.jComboBoxTiposSeleccionarResumenUsuario = jComboBoxTiposSeleccionarResumenUsuario;
	}
	
	public void setBorderResaltarTiposSeleccionarResumenUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarResumenUsuario .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralResumenUsuario() {
		return jTextFieldValorCampoGeneralResumenUsuario;
	}

	public void setjTextFieldValorCampoGeneralResumenUsuario(
			JTextField jTextFieldValorCampoGeneralResumenUsuario) {
		this.jTextFieldValorCampoGeneralResumenUsuario = jTextFieldValorCampoGeneralResumenUsuario;
	}

	public void setBorderResaltarValorCampoGeneralResumenUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralResumenUsuario .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosResumenUsuario() {
		return this.jCheckBoxSeleccionarTodosResumenUsuario;
	}

	public void setjCheckBoxSeleccionarTodosResumenUsuario(
			JCheckBox jCheckBoxSeleccionarTodosResumenUsuario) {
		this.jCheckBoxSeleccionarTodosResumenUsuario = jCheckBoxSeleccionarTodosResumenUsuario;
	}

	public void setBorderResaltarSeleccionarTodosResumenUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosResumenUsuario .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosResumenUsuario() {
		return this.jCheckBoxSeleccionadosResumenUsuario;
	}

	public void setjCheckBoxSeleccionadosResumenUsuario(
			JCheckBox jCheckBoxSeleccionadosResumenUsuario) {
		this.jCheckBoxSeleccionadosResumenUsuario = jCheckBoxSeleccionadosResumenUsuario;
	}
	
	public void setBorderResaltarSeleccionadosResumenUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosResumenUsuario .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesResumenUsuario() {
		return this.jComboBoxTiposArchivosReportesResumenUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesResumenUsuario(
			JComboBox jComboBoxTiposArchivosReportesResumenUsuario) {
		this.jComboBoxTiposArchivosReportesResumenUsuario = jComboBoxTiposArchivosReportesResumenUsuario;
	}

	public void setBorderResaltarTiposArchivosReportesResumenUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesResumenUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesResumenUsuario() {
		return this.jComboBoxTiposReportesResumenUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesResumenUsuario(
			JComboBox jComboBoxTiposReportesResumenUsuario) {
		this.jComboBoxTiposReportesResumenUsuario = jComboBoxTiposReportesResumenUsuario;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoResumenUsuario() {
	//	return jComboBoxTiposReportesDinamicoResumenUsuario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoResumenUsuario(
	//		JComboBox jComboBoxTiposReportesDinamicoResumenUsuario) {
	//	this.jComboBoxTiposReportesDinamicoResumenUsuario = jComboBoxTiposReportesDinamicoResumenUsuario;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoResumenUsuario() {
	//	return jComboBoxTiposArchivosReportesDinamicoResumenUsuario;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoResumenUsuario(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoResumenUsuario) {
	//	this.jComboBoxTiposArchivosReportesDinamicoResumenUsuario = jComboBoxTiposArchivosReportesDinamicoResumenUsuario;
	//}
	
	public void setBorderResaltarTiposReportesResumenUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesResumenUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesResumenUsuario() {
		return this.jComboBoxTiposGraficosReportesResumenUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesResumenUsuario(
			JComboBox jComboBoxTiposGraficosReportesResumenUsuario) {
		this.jComboBoxTiposGraficosReportesResumenUsuario = jComboBoxTiposGraficosReportesResumenUsuario;
	}
	
	public void setBorderResaltarTiposGraficosReportesResumenUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesResumenUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionResumenUsuario() {
		return this.jComboBoxTiposPaginacionResumenUsuario;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionResumenUsuario(
			JComboBox jComboBoxTiposPaginacionResumenUsuario) {
		this.jComboBoxTiposPaginacionResumenUsuario = jComboBoxTiposPaginacionResumenUsuario;
	}
	
	public void setBorderResaltarTiposPaginacionResumenUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionResumenUsuario .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesResumenUsuario() {
		return this.jComboBoxTiposRelacionesResumenUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesResumenUsuario() {
		return this.jComboBoxTiposAccionesResumenUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesResumenUsuario(
			JComboBox jComboBoxTiposRelacionesResumenUsuario) {
		this.jComboBoxTiposRelacionesResumenUsuario = jComboBoxTiposRelacionesResumenUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesResumenUsuario(
			JComboBox jComboBoxTiposAccionesResumenUsuario) {
		this.jComboBoxTiposAccionesResumenUsuario = jComboBoxTiposAccionesResumenUsuario;
	}
	
	public void setBorderResaltarTiposRelacionesResumenUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesResumenUsuario .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesResumenUsuario() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarResumenUsuario.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesResumenUsuario .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoResumenUsuario() {
	//	return jCheckBoxConGraficoDinamicoResumenUsuario;
	//}

	//public void setjCheckBoxConGraficoDinamicoResumenUsuario(
	//		JCheckBox jCheckBoxConGraficoDinamicoResumenUsuario) {
	//	this.jCheckBoxConGraficoDinamicoResumenUsuario = jCheckBoxConGraficoDinamicoResumenUsuario;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoResumenUsuario() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarResumenUsuario.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoResumenUsuario .setBorder(borderResaltar);		
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
		this.resumenusuarioSessionBean=new ResumenUsuarioSessionBean();
		
		this.resumenusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.resumenusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.resumenusuarioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ResumenUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ResumenUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ResumenUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ResumenUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ResumenUsuarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Resumen Usuario MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
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
		
		ResumenUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ResumenUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarResumenUsuario= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarResumenUsuario,this.jTtoolBarResumenUsuario,
							"nuevo","nuevo","Nuevo"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarResumenUsuario,this.jTtoolBarResumenUsuario,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarResumenUsuario,this.jTtoolBarResumenUsuario,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarResumenUsuario,this.jTtoolBarResumenUsuario,
							"duplicar","duplicar","Duplicar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarResumenUsuario,this.jTtoolBarResumenUsuario,
							"copiar","copiar","Copiar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarResumenUsuario,this.jTtoolBarResumenUsuario,
							"ver_form","ver_form","Ver"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResumenUsuario,this.jTtoolBarResumenUsuario,
							"recargar","recargar","Recargar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResumenUsuario,this.jTtoolBarResumenUsuario,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarResumenUsuario,this.jTtoolBarResumenUsuario,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarResumenUsuario,this.jTtoolBarResumenUsuario,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarResumenUsuario,this.jTtoolBarResumenUsuario,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarResumenUsuario,this.jTtoolBarResumenUsuario,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarResumenUsuario,this.jTtoolBarResumenUsuario,
							"cerrar","cerrar","Salir"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarResumenUsuario=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarResumenUsuario;
			
				this.jButtonProcesarInformacionToolBarResumenUsuario=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarResumenUsuario;
				
		//protected JButton jButtonModificarToolBarResumenUsuario;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarResumenUsuario=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuResumenUsuario=new JMenuMe("General");
		this.jmenuArchivoResumenUsuario=new JMenuMe("Archivo");
		this.jmenuAccionesResumenUsuario=new JMenuMe("Acciones");
		this.jmenuDatosResumenUsuario=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoResumenUsuario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoResumenUsuario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoResumenUsuario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarResumenUsuario= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarResumenUsuario.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarResumenUsuario,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesResumenUsuario= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesResumenUsuario.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesResumenUsuario,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosResumenUsuario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosResumenUsuario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosResumenUsuario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarResumenUsuario= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarResumenUsuario.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarResumenUsuario,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormResumenUsuario= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormResumenUsuario.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormResumenUsuario,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaResumenUsuario= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaResumenUsuario.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaResumenUsuario,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarResumenUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarResumenUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarResumenUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionResumenUsuario= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionResumenUsuario.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionResumenUsuario,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionResumenUsuario= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionResumenUsuario.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionResumenUsuario,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresResumenUsuario= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresResumenUsuario.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresResumenUsuario,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesResumenUsuario= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesResumenUsuario.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesResumenUsuario,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByResumenUsuario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByResumenUsuario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByResumenUsuario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarResumenUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarResumenUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarResumenUsuario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByResumenUsuario= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByResumenUsuario.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByResumenUsuario,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarResumenUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarResumenUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarResumenUsuario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosResumenUsuario= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosResumenUsuario.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosResumenUsuario,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoResumenUsuario.add(this.jMenuItemCerrarResumenUsuario);
			
			this.jmenuAccionesResumenUsuario.add(this.jMenuItemNuevoResumenUsuario);
			this.jmenuAccionesResumenUsuario.add(this.jMenuItemNuevoGuardarCambiosResumenUsuario);
			this.jmenuAccionesResumenUsuario.add(this.jMenuItemNuevoRelacionesResumenUsuario);
			this.jmenuAccionesResumenUsuario.add(this.jMenuItemGuardarCambiosTablaResumenUsuario);		
			this.jmenuAccionesResumenUsuario.add(this.jMenuItemDuplicarResumenUsuario);		
			this.jmenuAccionesResumenUsuario.add(this.jMenuItemCopiarResumenUsuario);		
			this.jmenuAccionesResumenUsuario.add(this.jMenuItemVerFormResumenUsuario);		
			
			this.jmenuDatosResumenUsuario.add(this.jMenuItemRecargarInformacionResumenUsuario);				
			this.jmenuDatosResumenUsuario.add(this.jMenuItemAnterioresResumenUsuario);				
			this.jmenuDatosResumenUsuario.add(this.jMenuItemSiguientesResumenUsuario);				
			this.jmenuDatosResumenUsuario.add(this.jMenuItemAbrirOrderByResumenUsuario);				
			this.jmenuDatosResumenUsuario.add(this.jMenuItemMostrarOcultarResumenUsuario);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesResumenUsuario.add(this.jMenuItemGuardarCambiosResumenUsuario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarResumenUsuario.add(this.jmenuArchivoResumenUsuario);		
			this.jmenuBarResumenUsuario.add(this.jmenuAccionesResumenUsuario);		
			this.jmenuBarResumenUsuario.add(this.jmenuDatosResumenUsuario);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarResumenUsuario);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasResumenUsuario() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasResumenUsuario=new JTabbedPane();


		this.jTabbedPaneBusquedasResumenUsuario.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasResumenUsuario.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasResumenUsuario.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasResumenUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasResumenUsuario,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleResumenUsuario = new ResumenUsuarioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Resumen Usuario DATOS");
			this.jInternalFrameDetalleFormResumenUsuario = new ResumenUsuarioDetalleFormJInternalFrame(jDesktopPane,this.resumenusuarioSessionBean.getConGuardarRelaciones(),this.resumenusuarioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormResumenUsuario = null;//new ResumenUsuarioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutResumenUsuario= new GridBagLayout();
		
		
		this.jTableDatosResumenUsuario = new JTableMe();      
		
		String sToolTipResumenUsuario="";
		sToolTipResumenUsuario=ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipResumenUsuario+="(Seguridad.ResumenUsuario)";
		}
		
		if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipResumenUsuario+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosResumenUsuario.setToolTipText(sToolTipResumenUsuario);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosResumenUsuario);
		this.jTableDatosResumenUsuario.setAutoCreateRowSorter(true);
		this.jTableDatosResumenUsuario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosResumenUsuario.setRowSelectionAllowed(true);
		this.jTableDatosResumenUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosResumenUsuario,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoResumenUsuario = new JButtonMe();
		this.jButtonDuplicarResumenUsuario = new JButtonMe();
		this.jButtonCopiarResumenUsuario = new JButtonMe();
		this.jButtonVerFormResumenUsuario = new JButtonMe();
		this.jButtonNuevoRelacionesResumenUsuario = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaResumenUsuario = new JButtonMe();
		this.jButtonCerrarResumenUsuario = new JButtonMe();
		
		this.jScrollPanelDatosResumenUsuario = new JScrollPane();   
        this.jScrollPanelDatosGeneralResumenUsuario = new JScrollPane();
		
				
		
		
		this.jPanelAccionesResumenUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Resumen Usuario";
		
		if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Resumen Usuarios" + this.sPath));
		} else {
			this.jScrollPanelDatosResumenUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesResumenUsuario.setToolTipText("Acciones");
        this.jPanelAccionesResumenUsuario.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoResumenUsuario=new ReporteDinamicoJInternalFrame(ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoResumenUsuario();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionResumenUsuario=new ImportacionJInternalFrame(ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionResumenUsuario();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByResumenUsuario = new JButtonMe();
		
		this.jButtonAbrirOrderByResumenUsuario.setText("Orden");
		this.jButtonAbrirOrderByResumenUsuario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByResumenUsuario,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByResumenUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByResumenUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResumenUsuario,false,this);
			
			//this.cargarOrderByResumenUsuario(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByResumenUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResumenUsuario,true,this);
			
			//this.cargarOrderByResumenUsuario(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosResumenUsuario.setMinimumSize(new Dimension(400,50));//1230
		this.jTableDatosResumenUsuario.setMaximumSize(new Dimension(400,50));//1230
		this.jTableDatosResumenUsuario.setPreferredSize(new Dimension(400,50));//1230
		
		this.jScrollPanelDatosResumenUsuario.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosResumenUsuario.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosResumenUsuario.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoResumenUsuario.setText("Nuevo");
		this.jButtonDuplicarResumenUsuario.setText("Duplicar");
		this.jButtonCopiarResumenUsuario.setText("Copiar");
		this.jButtonVerFormResumenUsuario.setText("Ver");
		this.jButtonNuevoRelacionesResumenUsuario.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaResumenUsuario.setText("Guardar");
		this.jButtonCerrarResumenUsuario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoResumenUsuario,"nuevo_button","Nuevo",this.resumenusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarResumenUsuario,"duplicar_button","Duplicar",this.resumenusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarResumenUsuario,"copiar_button","Copiar",this.resumenusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormResumenUsuario,"ver_form","Ver",this.resumenusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesResumenUsuario,"nuevorelaciones_button","Nuevo Rel",this.resumenusuarioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaResumenUsuario,"guardarcambiostabla_button","Guardar",this.resumenusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarResumenUsuario,"cerrar_button","Salir",this.resumenusuarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoResumenUsuario.setToolTipText("Nuevo"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarResumenUsuario.setToolTipText("Duplicar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarResumenUsuario.setToolTipText("Copiar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormResumenUsuario.setToolTipText("Ver"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesResumenUsuario.setToolTipText("Nuevo Rel"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaResumenUsuario.setToolTipText("Guardar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarResumenUsuario.setToolTipText("Salir"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoResumenUsuario";
		inputMap = this.jButtonNuevoResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoResumenUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoResumenUsuario"));
		
		//DUPLICAR
		sMapKey = "DuplicarResumenUsuario";
		inputMap = this.jButtonDuplicarResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarResumenUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarResumenUsuario"));
		
		//COPIAR
		sMapKey = "CopiarResumenUsuario";
		inputMap = this.jButtonCopiarResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarResumenUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarResumenUsuario"));
		
		//VEr FORM
		sMapKey = "VerFormResumenUsuario";
		inputMap = this.jButtonVerFormResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormResumenUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormResumenUsuario"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesResumenUsuario";
		inputMap = this.jButtonNuevoRelacionesResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesResumenUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesResumenUsuario"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarResumenUsuario";
		inputMap = this.jButtonModificarResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarResumenUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarResumenUsuario"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarResumenUsuario";
		inputMap = this.jButtonCerrarResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarResumenUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarResumenUsuario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaResumenUsuario";
		inputMap = this.jButtonGuardarCambiosTablaResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaResumenUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaResumenUsuario"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesResumenUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesResumenUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionResumenUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ResumenUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ResumenUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ResumenUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ResumenUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ResumenUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesResumenUsuario.setName("jPanelParametrosReportesResumenUsuario"); 
		
		this.jPanelParametrosReportesAccionesResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesResumenUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesResumenUsuario.setName("jPanelParametrosReportesAccionesResumenUsuario"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionResumenUsuario = new JButtonMe();
		this.jButtonRecargarInformacionResumenUsuario.setText("Recargar");
		this.jButtonRecargarInformacionResumenUsuario.setToolTipText("Recargar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionResumenUsuario,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionResumenUsuario = new JButtonMe();
		this.jButtonProcesarInformacionResumenUsuario.setText("Procesar");
		this.jButtonProcesarInformacionResumenUsuario.setToolTipText("Procesar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionResumenUsuario.setVisible(false);
			
		this.jButtonProcesarInformacionResumenUsuario.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionResumenUsuario.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionResumenUsuario.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesResumenUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResumenUsuario.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesResumenUsuario.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesResumenUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResumenUsuario.setText("TIPO");       
		this.jComboBoxTiposReportesResumenUsuario.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesResumenUsuario = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesResumenUsuario.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesResumenUsuario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionResumenUsuario = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionResumenUsuario.setText("Paginacion");
		this.jComboBoxTiposPaginacionResumenUsuario.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesResumenUsuario = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesResumenUsuario.setText("Accion");
		this.jComboBoxTiposRelacionesResumenUsuario.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesResumenUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesResumenUsuario.setText("Accion");
		this.jComboBoxTiposAccionesResumenUsuario.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarResumenUsuario = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarResumenUsuario.setText("Accion");
		this.jComboBoxTiposSeleccionarResumenUsuario.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralResumenUsuario=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralResumenUsuario.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralResumenUsuario.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralResumenUsuario.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesResumenUsuario = new JLabelMe();
		
		this.jLabelAccionesResumenUsuario.setText("Acciones");		
		this.jLabelAccionesResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosResumenUsuario = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosResumenUsuario.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosResumenUsuario.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosResumenUsuario = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosResumenUsuario.setText("Seleccionados");
		this.jCheckBoxSeleccionadosResumenUsuario.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaResumenUsuario = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaResumenUsuario.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaResumenUsuario.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteResumenUsuario = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteResumenUsuario.setText("Graf.");
		this.jCheckBoxConGraficoReporteResumenUsuario.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresResumenUsuario = new JButtonMe();
		//this.jButtonAnterioresResumenUsuario.setText("<<");
        this.jButtonAnterioresResumenUsuario.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresResumenUsuario,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesResumenUsuario = new JButtonMe();
		//this.jButtonSiguientesResumenUsuario.setText(">>");
        this.jButtonSiguientesResumenUsuario.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesResumenUsuario,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosResumenUsuario = new JButtonMe();
		this.jButtonNuevoGuardarCambiosResumenUsuario.setText("Nue");
        this.jButtonNuevoGuardarCambiosResumenUsuario.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosResumenUsuario,"nuevoguardarcambios_button","Nue",this.resumenusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosResumenUsuario";
		inputMap = this.jButtonNuevoGuardarCambiosResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosResumenUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosResumenUsuario"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionResumenUsuario";
		inputMap = this.jButtonRecargarInformacionResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionResumenUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionResumenUsuario"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesResumenUsuario";
		inputMap = this.jButtonSiguientesResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesResumenUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesResumenUsuario"));
		
		//ANTERIORES		
		sMapKey = "AnterioresResumenUsuario";
		inputMap = this.jButtonAnterioresResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresResumenUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresResumenUsuario"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasResumenUsuario();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesResumenUsuario.setMinimumSize(new Dimension(this.getWidth(),ResumenUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResumenUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesResumenUsuario.setMaximumSize(new Dimension(this.getWidth(),ResumenUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResumenUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesResumenUsuario.setPreferredSize(new Dimension(this.getWidth(),ResumenUsuarioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ResumenUsuarioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionResumenUsuario = new GridBagLayout();

			this.jPanelPaginacionResumenUsuario.setLayout(gridaBagLayoutPaginacionResumenUsuario);						
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenUsuario.gridy = 0;
			this.gridBagConstraintsResumenUsuario.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionResumenUsuario.add(this.jButtonAnterioresResumenUsuario, this.gridBagConstraintsResumenUsuario);
					
						
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsResumenUsuario.gridy = 0;
			
			this.jPanelPaginacionResumenUsuario.add(this.jButtonNuevoGuardarCambiosResumenUsuario, this.gridBagConstraintsResumenUsuario);
						
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsResumenUsuario.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsResumenUsuario.gridy = 0;
			this.jPanelPaginacionResumenUsuario.add(this.jButtonSiguientesResumenUsuario, this.gridBagConstraintsResumenUsuario);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenUsuario.gridy = 1;
			this.gridBagConstraintsResumenUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResumenUsuario.add(this.jButtonNuevoResumenUsuario, this.gridBagConstraintsResumenUsuario);
						
			
			
			if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
				this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsResumenUsuario.gridy = 1;
				this.gridBagConstraintsResumenUsuario.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionResumenUsuario.add(this.jButtonGuardarCambiosTablaResumenUsuario, this.gridBagConstraintsResumenUsuario);
			}
			
			
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenUsuario.gridy = 1;
			this.gridBagConstraintsResumenUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResumenUsuario.add(this.jButtonDuplicarResumenUsuario, this.gridBagConstraintsResumenUsuario);
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenUsuario.gridy = 1;
			this.gridBagConstraintsResumenUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResumenUsuario.add(this.jButtonCopiarResumenUsuario, this.gridBagConstraintsResumenUsuario);
		
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenUsuario.gridy = 1;
			this.gridBagConstraintsResumenUsuario.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionResumenUsuario.add(this.jButtonVerFormResumenUsuario, this.gridBagConstraintsResumenUsuario);
		
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenUsuario.gridy = 1;
			this.gridBagConstraintsResumenUsuario.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionResumenUsuario.add(this.jButtonCerrarResumenUsuario, this.gridBagConstraintsResumenUsuario);
		
		
		
		this.jButtonRecargarInformacionResumenUsuario.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionResumenUsuario.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionResumenUsuario.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesResumenUsuario.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesResumenUsuario.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesResumenUsuario.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesResumenUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesResumenUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesResumenUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesResumenUsuario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesResumenUsuario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesResumenUsuario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionResumenUsuario.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionResumenUsuario.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionResumenUsuario.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesResumenUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesResumenUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesResumenUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesResumenUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResumenUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResumenUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarResumenUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarResumenUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarResumenUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaResumenUsuario.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaResumenUsuario.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaResumenUsuario.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteResumenUsuario.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteResumenUsuario.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteResumenUsuario.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosResumenUsuario.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosResumenUsuario.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosResumenUsuario.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosResumenUsuario.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosResumenUsuario.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosResumenUsuario.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesResumenUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesResumenUsuario = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ResumenUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ResumenUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ResumenUsuario = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ResumenUsuario = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesResumenUsuario.setLayout(gridaBagParametrosReportesResumenUsuario);
			this.jPanelParametrosReportesAccionesResumenUsuario.setLayout(gridaBagParametrosReportesAccionesResumenUsuario);
			
			
			this.jPanelParametrosAuxiliar1ResumenUsuario.setLayout(gridaBagParametrosAuxiliar1ResumenUsuario);
			this.jPanelParametrosAuxiliar2ResumenUsuario.setLayout(gridaBagParametrosAuxiliar2ResumenUsuario);
			this.jPanelParametrosAuxiliar3ResumenUsuario.setLayout(gridaBagParametrosAuxiliar3ResumenUsuario);
			this.jPanelParametrosAuxiliar4ResumenUsuario.setLayout(gridaBagParametrosAuxiliar4ResumenUsuario);
			//this.jPanelParametrosAuxiliar5ResumenUsuario.setLayout(gridaBagParametrosAuxiliar2ResumenUsuario);			
			
			
			
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResumenUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResumenUsuario.add(this.jButtonRecargarInformacionResumenUsuario, this.gridBagConstraintsResumenUsuario);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResumenUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ResumenUsuario.add(this.jComboBoxTiposPaginacionResumenUsuario, this.gridBagConstraintsResumenUsuario);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResumenUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ResumenUsuario.add(this.jCheckBoxConAltoMaximoTablaResumenUsuario, this.gridBagConstraintsResumenUsuario);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenUsuario.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsResumenUsuario.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ResumenUsuario.add(this.jComboBoxTiposArchivosReportesResumenUsuario, this.gridBagConstraintsResumenUsuario);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResumenUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResumenUsuario.add(this.jPanelParametrosAuxiliar1ResumenUsuario, this.gridBagConstraintsResumenUsuario);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResumenUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ResumenUsuario.add(this.jComboBoxTiposReportesResumenUsuario, this.gridBagConstraintsResumenUsuario);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResumenUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResumenUsuario.add(this.jPanelParametrosAuxiliar4ResumenUsuario, this.gridBagConstraintsResumenUsuario);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenUsuario.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsResumenUsuario.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResumenUsuario.add(this.jComboBoxTiposReportesResumenUsuario, this.gridBagConstraintsResumenUsuario);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResumenUsuario.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResumenUsuario.add(this.jCheckBoxGenerarReporteResumenUsuario, this.gridBagConstraintsResumenUsuario);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResumenUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResumenUsuario.add(this.jPanelParametrosAuxiliar2ResumenUsuario, this.gridBagConstraintsResumenUsuario);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResumenUsuario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResumenUsuario.add(this.jLabelAccionesResumenUsuario, this.gridBagConstraintsResumenUsuario);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
				this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsResumenUsuario.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsResumenUsuario.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesResumenUsuario.add(this.jButtonAbrirOrderByResumenUsuario, this.gridBagConstraintsResumenUsuario);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsResumenUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResumenUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResumenUsuario.add(this.jComboBoxTiposSeleccionarResumenUsuario, this.gridBagConstraintsResumenUsuario);			
			
			
			/*
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenUsuario.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsResumenUsuario.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesResumenUsuario.add(this.jCheckBoxSeleccionarTodosResumenUsuario, this.gridBagConstraintsResumenUsuario);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResumenUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ResumenUsuario.add(this.jCheckBoxSeleccionarTodosResumenUsuario, this.gridBagConstraintsResumenUsuario);															
				
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenUsuario.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsResumenUsuario.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ResumenUsuario.add(this.jCheckBoxSeleccionadosResumenUsuario, this.gridBagConstraintsResumenUsuario);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsResumenUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResumenUsuario.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesResumenUsuario.add(this.jPanelParametrosAuxiliar3ResumenUsuario, this.gridBagConstraintsResumenUsuario);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResumenUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResumenUsuario.add(this.jComboBoxTiposAccionesResumenUsuario, this.gridBagConstraintsResumenUsuario);
	
				
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsResumenUsuario.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesResumenUsuario.add(this.jTextFieldValorCampoGeneralResumenUsuario, this.gridBagConstraintsResumenUsuario);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosResumenUsuario = new GridBagLayout();

			this.jScrollPanelDatosResumenUsuario.setLayout(gridaBagLayoutDatosResumenUsuario);
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenUsuario.gridy = 0;
			this.gridBagConstraintsResumenUsuario.gridx = 0;
			
			this.jScrollPanelDatosResumenUsuario.add(this.jTableDatosResumenUsuario, this.gridBagConstraintsResumenUsuario);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosResumenUsuario.setViewportView(this.jTableDatosResumenUsuario);
		this.jTableDatosResumenUsuario.setFillsViewportHeight(true);
		this.jTableDatosResumenUsuario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesResumenUsuario= new GridBagLayout();
		this.jPanelAccionesResumenUsuario.setLayout(gridaBagLayoutAccionesResumenUsuario);
		
		
		/*	
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenUsuario.gridy = 0;
		this.gridBagConstraintsResumenUsuario.gridx = 0;
			
		this.jPanelAccionesResumenUsuario.add(this.jButtonNuevoResumenUsuario, this.gridBagConstraintsResumenUsuario);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutResumenUsuario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutResumenUsuario);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();						
			this.gridBagConstraintsResumenUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResumenUsuario.gridx = 0;		
			//this.gridBagConstraintsResumenUsuario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsResumenUsuario.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarResumenUsuario, this.gridBagConstraintsResumenUsuario);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy = iGridyPrincipal++;
		this.gridBagConstraintsResumenUsuario.gridx = 0;		
		//this.gridBagConstraintsResumenUsuario.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsResumenUsuario.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsResumenUsuario);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResumenUsuario.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesResumenUsuario, this.gridBagConstraintsResumenUsuario);								
		
		
		/*
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResumenUsuario.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesResumenUsuario, this.gridBagConstraintsResumenUsuario);
		*/		
		
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsResumenUsuario.gridx =0;
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsResumenUsuario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosResumenUsuario, this.gridBagConstraintsResumenUsuario);
				
		
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResumenUsuario.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionResumenUsuario, this.gridBagConstraintsResumenUsuario);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ResumenUsuarioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosResumenUsuario= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosResumenUsuario = new GridBagLayout();
			this.jPanelBusquedasParametrosResumenUsuario.setLayout(gridaBagLayoutBusquedasParametrosResumenUsuario);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralResumenUsuario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralResumenUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResumenUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResumenUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResumenUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposResumenUsuario, this.gridBagConstraintsResumenUsuario);
			
			
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResumenUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosResumenUsuario, this.gridBagConstraintsResumenUsuario);
		
			
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsResumenUsuario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesResumenUsuario, this.gridBagConstraintsResumenUsuario);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralResumenUsuario;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoResumenUsuario() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoResumenUsuario = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoResumenUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoResumenUsuario.setName("jPanelReporteDinamicoResumenUsuario"); 
		
		this.jPanelReporteDinamicoResumenUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoResumenUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoResumenUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoResumenUsuario.setLayout(gridaBagLayoutReporteDinamicoResumenUsuario);
		
		
		this.jInternalFrameReporteDinamicoResumenUsuario= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoResumenUsuario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteResumenUsuario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoResumenUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoResumenUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoResumenUsuario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoResumenUsuario.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoResumenUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoResumenUsuario.setResizable(true);
	    this.jInternalFrameReporteDinamicoResumenUsuario.setClosable(true);
	    this.jInternalFrameReporteDinamicoResumenUsuario.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoResumenUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoResumenUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoResumenUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Resumen Usuarios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteResumenUsuario = new JLabelMe();

		this.jLabelColumnasSelectReporteResumenUsuario.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenUsuario.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoResumenUsuario.add(this.jLabelColumnasSelectReporteResumenUsuario, this.gridBagConstraintsResumenUsuario);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteResumenUsuario = new JList<Reporte>();
		this.jListColumnasSelectReporteResumenUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteResumenUsuario.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteResumenUsuario.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteResumenUsuario.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteResumenUsuario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteResumenUsuario=new JScrollPane(this.jListColumnasSelectReporteResumenUsuario);
			
			this.jScrollColumnasSelectReporteResumenUsuario.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteResumenUsuario.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteResumenUsuario.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenUsuario.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoResumenUsuario.add(this.jListColumnasSelectReporteResumenUsuario, this.gridBagConstraintsResumenUsuario);
		this.jPanelReporteDinamicoResumenUsuario.add(this.jScrollColumnasSelectReporteResumenUsuario, this.gridBagConstraintsResumenUsuario);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteResumenUsuario = new JLabelMe();

		this.jLabelRelacionesSelectReporteResumenUsuario.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteResumenUsuario = new JList<Reporte>();
		this.jListRelacionesSelectReporteResumenUsuario.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteResumenUsuario.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteResumenUsuario.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteResumenUsuario.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteResumenUsuario.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteResumenUsuario=new JScrollPane(this.jListRelacionesSelectReporteResumenUsuario);
			
			this.jScrollRelacionesSelectReporteResumenUsuario.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteResumenUsuario.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteResumenUsuario.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoResumenUsuario = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoResumenUsuario = new JComboBoxMe();
		this.jListColumnasValoresGraficoResumenUsuario = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoResumenUsuario = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoResumenUsuario.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoResumenUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoResumenUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoResumenUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoResumenUsuario = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoResumenUsuario.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoResumenUsuario.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoResumenUsuario.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoResumenUsuario.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoResumenUsuario = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoResumenUsuario.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResumenUsuario.add(this.jLabelGenerarExcelReporteDinamicoResumenUsuario, this.gridBagConstraintsResumenUsuario);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoResumenUsuario = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoResumenUsuario.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoResumenUsuario,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoResumenUsuario.setToolTipText("Generar EXCEL"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		//this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsResumenUsuario.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsResumenUsuario.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoResumenUsuario.add(this.jButtonGenerarExcelReporteDinamicoResumenUsuario, this.gridBagConstraintsResumenUsuario);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResumenUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResumenUsuario.add(this.jComboBoxTiposReportesDinamicoResumenUsuario, this.gridBagConstraintsResumenUsuario);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoResumenUsuario = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoResumenUsuario.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsResumenUsuario.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoResumenUsuario.add(this.jLabelTiposArchivoReporteDinamicoResumenUsuario, this.gridBagConstraintsResumenUsuario);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResumenUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResumenUsuario.add(this.jComboBoxTiposArchivosReportesDinamicoResumenUsuario, this.gridBagConstraintsResumenUsuario);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoResumenUsuario = new JButtonMe();
		this.jButtonGenerarReporteDinamicoResumenUsuario.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoResumenUsuario,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoResumenUsuario.setToolTipText("Generar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResumenUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResumenUsuario.add(this.jButtonGenerarReporteDinamicoResumenUsuario, this.gridBagConstraintsResumenUsuario);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoResumenUsuario = new JButtonMe();
		this.jButtonCerrarReporteDinamicoResumenUsuario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoResumenUsuario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoResumenUsuario.setToolTipText("Cancelar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenUsuario.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsResumenUsuario.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoResumenUsuario.add(this.jButtonCerrarReporteDinamicoResumenUsuario, this.gridBagConstraintsResumenUsuario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalResumenUsuario = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoResumenUsuario= new JScrollPane(jPanelReporteDinamicoResumenUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoResumenUsuario.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoResumenUsuario.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoResumenUsuario.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Resumen Usuarios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsResumenUsuario.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoResumenUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoResumenUsuario.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalResumenUsuario);
		this.jInternalFrameReporteDinamicoResumenUsuario.getContentPane().add(this.jScrollPanelReporteDinamicoResumenUsuario, this.gridBagConstraintsResumenUsuario);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionResumenUsuario() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionResumenUsuario = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionResumenUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionResumenUsuario.setName("jPanelImportacionResumenUsuario"); 
		
		this.jPanelImportacionResumenUsuario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionResumenUsuario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionResumenUsuario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionResumenUsuario.setLayout(gridaBagLayoutImportacionResumenUsuario);
		
		
		this.jInternalFrameImportacionResumenUsuario= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionResumenUsuario= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionResumenUsuario = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteResumenUsuario= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionResumenUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionResumenUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionResumenUsuario.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionResumenUsuario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionResumenUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionResumenUsuario.setResizable(true);
	    this.jInternalFrameImportacionResumenUsuario.setClosable(true);
	    this.jInternalFrameImportacionResumenUsuario.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionResumenUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionResumenUsuario.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionResumenUsuario.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionResumenUsuario.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionResumenUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionResumenUsuario.setResizable(true);
	    this.jInternalFrameImportacionResumenUsuario.setClosable(true);
	    this.jInternalFrameImportacionResumenUsuario.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionResumenUsuario.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionResumenUsuario.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionResumenUsuario.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Resumen Usuarios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionResumenUsuario = new JLabelMe();

		this.jLabelArchivoImportacionResumenUsuario.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = iPosYImportacion;		
		this.gridBagConstraintsResumenUsuario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionResumenUsuario.add(this.jLabelArchivoImportacionResumenUsuario, this.gridBagConstraintsResumenUsuario);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionResumenUsuario = new JFileChooser();		
		this.jFileChooserImportacionResumenUsuario.setToolTipText("ESCOGER ARCHIVO"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionResumenUsuario = new JButtonMe();
		this.jButtonAbrirImportacionResumenUsuario.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionResumenUsuario,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionResumenUsuario.setToolTipText("Generar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsResumenUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResumenUsuario.add(this.jButtonAbrirImportacionResumenUsuario, this.gridBagConstraintsResumenUsuario);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionResumenUsuario = new JLabelMe();

		this.jLabelPathArchivoImportacionResumenUsuario.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = iPosYImportacion;		
		this.gridBagConstraintsResumenUsuario.gridx = iPosXImportacion++;
			
		this.jPanelImportacionResumenUsuario.add(this.jLabelPathArchivoImportacionResumenUsuario, this.gridBagConstraintsResumenUsuario);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionResumenUsuario=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionResumenUsuario.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionResumenUsuario.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionResumenUsuario.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsResumenUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResumenUsuario.add(this.jTextFieldPathArchivoImportacionResumenUsuario, this.gridBagConstraintsResumenUsuario);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionResumenUsuario = new JButtonMe();
		this.jButtonGenerarImportacionResumenUsuario.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionResumenUsuario,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionResumenUsuario.setToolTipText("Generar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsResumenUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResumenUsuario.add(this.jButtonGenerarImportacionResumenUsuario, this.gridBagConstraintsResumenUsuario);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionResumenUsuario = new JButtonMe();
		this.jButtonCerrarImportacionResumenUsuario.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionResumenUsuario,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionResumenUsuario.setToolTipText("Cancelar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenUsuario.gridy = iPosYImportacion;
		this.gridBagConstraintsResumenUsuario.gridx = iPosXImportacion++;
							
		this.jPanelImportacionResumenUsuario.add(this.jButtonCerrarImportacionResumenUsuario, this.gridBagConstraintsResumenUsuario);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalResumenUsuario = new GridBagLayout();
		
		this.jScrollPanelImportacionResumenUsuario= new JScrollPane(jPanelImportacionResumenUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy =iPosYImportacion;
		this.gridBagConstraintsResumenUsuario.gridx =iPosXImportacion;
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionResumenUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionResumenUsuario.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalResumenUsuario);
		this.jInternalFrameImportacionResumenUsuario.getContentPane().add(this.jScrollPanelImportacionResumenUsuario, this.gridBagConstraintsResumenUsuario);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByResumenUsuario(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByResumenUsuario = new JButtonMe();
			this.jButtonAbrirOrderByResumenUsuario.setText("Orden");
			this.jButtonAbrirOrderByResumenUsuario.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByResumenUsuario,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByResumenUsuario";
			inputMap = this.jButtonAbrirOrderByResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByResumenUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByResumenUsuario"));
		
		
			GridBagLayout gridaBagLayoutOrderByResumenUsuario = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByResumenUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByResumenUsuario.setName("jPanelOrderByResumenUsuario"); 
			
			this.jPanelOrderByResumenUsuario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByResumenUsuario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByResumenUsuario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByResumenUsuario.setLayout(gridaBagLayoutOrderByResumenUsuario);
			
			
			this.jTableDatosResumenUsuarioOrderBy = new JTableMe();        
			this.jTableDatosResumenUsuarioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosResumenUsuarioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosResumenUsuarioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosResumenUsuarioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosResumenUsuarioOrderBy.setViewportView(this.jTableDatosResumenUsuarioOrderBy);
			this.jTableDatosResumenUsuarioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosResumenUsuarioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByResumenUsuario= new OrderByJInternalFrame();
			this.jInternalFrameOrderByResumenUsuario= new OrderByJInternalFrame();
			this.jScrollPanelOrderByResumenUsuario = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteResumenUsuario= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByResumenUsuario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByResumenUsuario.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByResumenUsuario.setTitle("Orden");
			this.jInternalFrameOrderByResumenUsuario.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByResumenUsuario.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByResumenUsuario.setResizable(true);
			this.jInternalFrameOrderByResumenUsuario.setClosable(true);
			this.jInternalFrameOrderByResumenUsuario.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByResumenUsuario.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByResumenUsuario.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByResumenUsuario.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Resumen Usuarios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.gridy =iPosYOrderBy++;
			this.gridBagConstraintsResumenUsuario.gridx =iPosXOrderBy;
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsResumenUsuario.ipady =150;
				
			this.jPanelOrderByResumenUsuario.add(jScrollPanelDatosResumenUsuarioOrderBy, this.gridBagConstraintsResumenUsuario);//this.jTableDatosResumenUsuarioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByResumenUsuario = new JButtonMe();
			this.jButtonCerrarOrderByResumenUsuario.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByResumenUsuario,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByResumenUsuario.setToolTipText("Cancelar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenUsuario.gridy = iPosYOrderBy++;
			this.gridBagConstraintsResumenUsuario.gridx = iPosXOrderBy;
									
			this.jPanelOrderByResumenUsuario.add(this.jButtonCerrarOrderByResumenUsuario, this.gridBagConstraintsResumenUsuario);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalResumenUsuario = new GridBagLayout();
			
			this.jScrollPanelOrderByResumenUsuario= new JScrollPane(jPanelOrderByResumenUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.gridy =iPosYOrderBy;
			this.gridBagConstraintsResumenUsuario.gridx =iPosXOrderBy;
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByResumenUsuario.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByResumenUsuario.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalResumenUsuario);
			
			this.jInternalFrameOrderByResumenUsuario.getContentPane().add(this.jScrollPanelOrderByResumenUsuario, this.gridBagConstraintsResumenUsuario);			
		
		} else {
			this.jButtonAbrirOrderByResumenUsuario = new JButtonMe();
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
		int iWidthTableCalculado=0;//2430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1230;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.resumenusuarioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosResumenUsuario.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosResumenUsuario.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosResumenUsuario.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosResumenUsuario.getRowHeight();//ResumenUsuarioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ResumenUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaResumenUsuario.isSelected()) {
					iHeightTable=ResumenUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ResumenUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ResumenUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ResumenUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaResumenUsuario.isSelected()) {
					iHeightTable=ResumenUsuarioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ResumenUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ResumenUsuarioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosResumenUsuario.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosResumenUsuario.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosResumenUsuario.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosResumenUsuario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosResumenUsuario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosResumenUsuario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByResumenUsuario!=null && this.jInternalFrameOrderByResumenUsuario.getjTableDatosOrderBy()!=null) {
			//if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByResumenUsuario.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByResumenUsuario.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByResumenUsuario.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByResumenUsuario.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByResumenUsuario.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByResumenUsuario.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByResumenUsuario.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosResumenUsuario.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosResumenUsuario.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosResumenUsuario.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=resumenusuarioLogic.getResumenUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=resumenusuarios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ResumenUsuario> TraerResumenUsuarioBeans(List<ResumenUsuario> resumenusuarios,ArrayList<Classe> classes)throws Exception {
		try {
			for(ResumenUsuario resumenusuario:resumenusuarios) {
					
				if(!(ResumenUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ResumenUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					resumenusuario.setsDetalleGeneralEntityReporte(ResumenUsuarioConstantesFunciones.getResumenUsuarioDescripcion(resumenusuario));
										
						
					
						
					
				} else  {
							
					//resumenusuario.setsDetalleGeneralEntityReporte(resumenusuario.getsDetalleGeneralEntityReporte());
										
				}
				
				//resumenusuariobeans.add(resumenusuariobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return resumenusuarios;
    }
	//PARA REPORTES FIN
}
