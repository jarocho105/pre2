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
import com.bydan.erp.seguridad.util.CampoConstantesFunciones;

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
public class CampoJInternalFrame extends CampoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCampo;
	
	protected JMenuBar jmenuBarCampo;
	
	protected JMenu jmenuCampo;
	protected JMenu jmenuDatosCampo;
	protected JMenu jmenuArchivoCampo;
	protected JMenu jmenuAccionesCampo;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCampo;	
	protected GridBagConstraints gridBagConstraintsCampo;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CampoDetalleFormJInternalFrame jInternalFrameDetalleFormCampo;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCampo;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCampo;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_opcion="";
	
	public CampoSessionBean campoSessionBean;
		
	
	
	public OpcionSessionBean opcionSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Campo> campos;		
	public List<Campo> camposEliminados;	
	public List<Campo> camposAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCampo;		
	protected JButton jButtonAbrirOrderByCampo;
	
	
	//protected JPanel jPanelOrderByCampo;
	//public JScrollPane jScrollPanelOrderByCampo;	
	//protected JButton jButtonCerrarOrderByCampo;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CampoLogic campoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCampo;
	public JScrollPane jScrollPanelDatosEdicionCampo;
	public JScrollPane jScrollPanelDatosGeneralCampo;
    
	
	
	//public JScrollPane jScrollPanelDatosCampoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCampo;
	//public JScrollPane jScrollPanelImportacionCampo;
	
	
	
	protected JPanel jPanelAccionesCampo;
	
    protected JPanel jPanelPaginacionCampo;
    protected JPanel jPanelParametrosReportesCampo;
	protected JPanel jPanelParametrosReportesAccionesCampo;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Campo;
	protected JPanel jPanelParametrosAuxiliar2Campo;
	protected JPanel jPanelParametrosAuxiliar3Campo;
	protected JPanel jPanelParametrosAuxiliar4Campo;
	//protected JPanel jPanelParametrosAuxiliar5Campo;
	
	
	
	//protected JPanel jPanelReporteDinamicoCampo;
	//protected JPanel jPanelImportacionCampo;
	
	
	public JTable jTableDatosCampo;
	
	
	
	//public JTable jTableDatosCampoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCampo;
	protected JButton jButtonDuplicarCampo;
	protected JButton jButtonCopiarCampo;
	protected JButton jButtonVerFormCampo;
	protected JButton jButtonNuevoRelacionesCampo;
	protected JButton jButtonModificarCampo;
	
    protected JButton jButtonGuardarCambiosTablaCampo;
	protected JButton jButtonCerrarCampo;
	
	
	protected JButton jButtonRecargarInformacionCampo;
	protected JButton jButtonProcesarInformacionCampo;
	
	
	protected JButton jButtonAnterioresCampo;
	protected JButton jButtonSiguientesCampo;
	protected JButton jButtonNuevoGuardarCambiosCampo;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCampo;
	//protected JButton jButtonCerrarReporteDinamicoCampo;
	//protected JButton jButtonGenerarExcelReporteDinamicoCampo;	
	
	
	
	//protected JButton jButtonAbrirImportacionCampo;
	//protected JButton jButtonGenerarImportacionCampo;
	//protected JButton jButtonCerrarImportacionCampo;
	//protected JFileChooser jFileChooserImportacionCampo;
	//protected File fileImportacionCampo;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCampo;
	protected JButton jButtonDuplicarToolBarCampo;
	protected JButton jButtonNuevoRelacionesToolBarCampo;
	
	
	public JButton jButtonGuardarCambiosToolBarCampo;
	protected JButton jButtonCopiarToolBarCampo;
	protected JButton jButtonVerFormToolBarCampo;
	public JButton jButtonGuardarCambiosTablaToolBarCampo;
	protected JButton jButtonMostrarOcultarTablaToolBarCampo;
	protected JButton jButtonCerrarToolBarCampo;
	
	protected JButton jButtonRecargarInformacionToolBarCampo;
	protected JButton jButtonProcesarInformacionToolBarCampo;
	protected JButton jButtonAnterioresToolBarCampo;
	protected JButton jButtonSiguientesToolBarCampo;
	protected JButton jButtonNuevoGuardarCambiosToolBarCampo;
	protected JButton jButtonAbrirOrderByToolBarCampo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCampo;
	protected JMenuItem jMenuItemDuplicarCampo;
	protected JMenuItem jMenuItemNuevoRelacionesCampo;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCampo;
	protected JMenuItem jMenuItemCopiarCampo;
	protected JMenuItem jMenuItemVerFormCampo;
	protected JMenuItem jMenuItemGuardarCambiosTablaCampo;
	protected JMenuItem jMenuItemCerrarCampo;
	protected JMenuItem jMenuItemDetalleCerrarCampo;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCampo;
	protected JMenuItem jMenuItemDetalleMostarOcultarCampo;
	
	protected JMenuItem jMenuItemRecargarInformacionCampo;
	protected JMenuItem jMenuItemProcesarInformacionCampo;
	protected JMenuItem jMenuItemAnterioresCampo;
	protected JMenuItem jMenuItemSiguientesCampo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCampo;
	protected JMenuItem jMenuItemAbrirOrderByCampo;
	protected JMenuItem jMenuItemMostrarOcultarCampo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCampo;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCampo;
	protected JCheckBox jCheckBoxSeleccionadosCampo;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCampo;
	protected JCheckBox jCheckBoxConGraficoReporteCampo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCampo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCampo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCampo;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCampo;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCampo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCampo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCampo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCampo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCampo;
	protected JTextField jTextFieldValorCampoGeneralCampo;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCampo;
	//public JList<Reporte> jListColumnasSelectReporteCampo;
	//public JScrollPane jScrollColumnasSelectReporteCampo;
	
	//public JLabel jLabelRelacionesSelectReporteCampo;
	//public JList<Reporte> jListRelacionesSelectReporteCampo;
	//public JScrollPane jScrollRelacionesSelectReporteCampo;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCampo;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCampo;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCampo;
	//public JLabel jLabelTiposArchivoReporteDinamicoCampo;
	
		
	//public JLabel jLabelArchivoImportacionCampo;	
	//public JLabel jLabelPathArchivoImportacionCampo;
	//protected JTextField jTextFieldPathArchivoImportacionCampo;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCampo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCampo;
	
	//public JLabel jLabelColumnaCategoriaValorCampo;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCampo;
	
	//public JLabel jLabelColumnasValoresGraficoCampo;
	//public JList<Reporte> jListColumnasValoresGraficoCampo;
	//public JScrollPane jScrollColumnasValoresGraficoCampo;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCampo;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCampo;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCampo;
	public JPanel jPanelFK_IdOpcionCampo;
	public JButton jButtonFK_IdOpcionCampo;
	
	public JPanel jPanelid_opcionFK_IdOpcionCampo;
	public JLabel jLabelid_opcionFK_IdOpcionCampo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_opcionFK_IdOpcionCampo;
	public JButton jButtonid_opcionFK_IdOpcionCampo= new JButtonMe();
	public JButton jButtonid_opcionFK_IdOpcionCampoUpdate= new JButtonMe();
	public JButton jButtonid_opcionFK_IdOpcionCampoBusqueda= new JButtonMe();
	public JButton jButtonid_opcionFK_IdOpcionCampoArbol= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CampoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Campo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CampoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Campo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CampoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Campo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CampoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Campo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCampo)	{
		this.jButtonRecargarInformacionCampo = jButtonRecargarInformacionCampo;
	}
	
	public JButton getjButtonProcesarInformacionCampo() {
		return this.jButtonProcesarInformacionCampo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCampo)	{
		this.jButtonProcesarInformacionCampo = jButtonProcesarInformacionCampo;
	}
	
	
	public JButton getjButtonRecargarInformacionCampo() {
		return this.jButtonRecargarInformacionCampo;
	}
	
	
	public List<Campo> getcampos() {
		return this.campos;
	}

	public void setcampos(List<Campo> campos) {
		this.campos = campos;
	}
	
	public List<Campo> getcamposAux() {
		return this.camposAux;
	}

	public void setcamposAux(List<Campo> camposAux) {
		this.camposAux = camposAux;
	}
	
	public List<Campo> getcamposEliminados() {
		return this.camposEliminados;
	}

	public void setCamposEliminados(List<Campo> camposEliminados) {
		this.camposEliminados = camposEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCampo() {
		return jComboBoxTiposSeleccionarCampo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCampo(
			JComboBox jComboBoxTiposSeleccionarCampo) {
		this.jComboBoxTiposSeleccionarCampo = jComboBoxTiposSeleccionarCampo;
	}
	
	public void setBorderResaltarTiposSeleccionarCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCampo.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCampo .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCampo() {
		return jTextFieldValorCampoGeneralCampo;
	}

	public void setjTextFieldValorCampoGeneralCampo(
			JTextField jTextFieldValorCampoGeneralCampo) {
		this.jTextFieldValorCampoGeneralCampo = jTextFieldValorCampoGeneralCampo;
	}

	public void setBorderResaltarValorCampoGeneralCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCampo.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCampo .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCampo() {
		return this.jCheckBoxSeleccionarTodosCampo;
	}

	public void setjCheckBoxSeleccionarTodosCampo(
			JCheckBox jCheckBoxSeleccionarTodosCampo) {
		this.jCheckBoxSeleccionarTodosCampo = jCheckBoxSeleccionarTodosCampo;
	}

	public void setBorderResaltarSeleccionarTodosCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCampo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCampo .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCampo() {
		return this.jCheckBoxSeleccionadosCampo;
	}

	public void setjCheckBoxSeleccionadosCampo(
			JCheckBox jCheckBoxSeleccionadosCampo) {
		this.jCheckBoxSeleccionadosCampo = jCheckBoxSeleccionadosCampo;
	}
	
	public void setBorderResaltarSeleccionadosCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCampo.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCampo .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCampo() {
		return this.jComboBoxTiposArchivosReportesCampo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCampo(
			JComboBox jComboBoxTiposArchivosReportesCampo) {
		this.jComboBoxTiposArchivosReportesCampo = jComboBoxTiposArchivosReportesCampo;
	}

	public void setBorderResaltarTiposArchivosReportesCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCampo.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCampo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCampo() {
		return this.jComboBoxTiposReportesCampo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCampo(
			JComboBox jComboBoxTiposReportesCampo) {
		this.jComboBoxTiposReportesCampo = jComboBoxTiposReportesCampo;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCampo() {
	//	return jComboBoxTiposReportesDinamicoCampo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCampo(
	//		JComboBox jComboBoxTiposReportesDinamicoCampo) {
	//	this.jComboBoxTiposReportesDinamicoCampo = jComboBoxTiposReportesDinamicoCampo;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCampo() {
	//	return jComboBoxTiposArchivosReportesDinamicoCampo;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCampo(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCampo) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCampo = jComboBoxTiposArchivosReportesDinamicoCampo;
	//}
	
	public void setBorderResaltarTiposReportesCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCampo.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCampo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCampo() {
		return this.jComboBoxTiposGraficosReportesCampo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCampo(
			JComboBox jComboBoxTiposGraficosReportesCampo) {
		this.jComboBoxTiposGraficosReportesCampo = jComboBoxTiposGraficosReportesCampo;
	}
	
	public void setBorderResaltarTiposGraficosReportesCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCampo.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCampo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCampo() {
		return this.jComboBoxTiposPaginacionCampo;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCampo(
			JComboBox jComboBoxTiposPaginacionCampo) {
		this.jComboBoxTiposPaginacionCampo = jComboBoxTiposPaginacionCampo;
	}
	
	public void setBorderResaltarTiposPaginacionCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCampo.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCampo .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCampo() {
		return this.jComboBoxTiposRelacionesCampo;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCampo() {
		return this.jComboBoxTiposAccionesCampo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCampo(
			JComboBox jComboBoxTiposRelacionesCampo) {
		this.jComboBoxTiposRelacionesCampo = jComboBoxTiposRelacionesCampo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCampo(
			JComboBox jComboBoxTiposAccionesCampo) {
		this.jComboBoxTiposAccionesCampo = jComboBoxTiposAccionesCampo;
	}
	
	public void setBorderResaltarTiposRelacionesCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCampo.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCampo .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCampo() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCampo.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCampo .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCampo() {
	//	return jCheckBoxConGraficoDinamicoCampo;
	//}

	//public void setjCheckBoxConGraficoDinamicoCampo(
	//		JCheckBox jCheckBoxConGraficoDinamicoCampo) {
	//	this.jCheckBoxConGraficoDinamicoCampo = jCheckBoxConGraficoDinamicoCampo;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCampo() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCampo.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCampo .setBorder(borderResaltar);		
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
		this.campoSessionBean=new CampoSessionBean();
		
		this.campoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.campoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.campoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CampoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CampoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CampoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CampoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CampoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Campo MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.campoSessionBean.getEsGuardarRelacionado()) {
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
		
		CampoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Campo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCampo= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCampo,this.jTtoolBarCampo,
							"nuevo","nuevo","Nuevo"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCampo,this.jTtoolBarCampo,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCampo,this.jTtoolBarCampo,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCampo,this.jTtoolBarCampo,
							"duplicar","duplicar","Duplicar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCampo,this.jTtoolBarCampo,
							"copiar","copiar","Copiar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCampo,this.jTtoolBarCampo,
							"ver_form","ver_form","Ver"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCampo,this.jTtoolBarCampo,
							"recargar","recargar","Recargar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCampo,this.jTtoolBarCampo,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCampo,this.jTtoolBarCampo,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCampo,this.jTtoolBarCampo,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCampo,this.jTtoolBarCampo,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCampo,this.jTtoolBarCampo,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCampo,this.jTtoolBarCampo,
							"cerrar","cerrar","Salir"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCampo=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCampo;
			
				this.jButtonProcesarInformacionToolBarCampo=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCampo;
				
		//protected JButton jButtonModificarToolBarCampo;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCampo=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCampo=new JMenuMe("General");
		this.jmenuArchivoCampo=new JMenuMe("Archivo");
		this.jmenuAccionesCampo=new JMenuMe("Acciones");
		this.jmenuDatosCampo=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCampo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCampo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCampo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCampo= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCampo.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCampo,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCampo= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCampo.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCampo,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCampo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCampo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCampo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCampo= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCampo.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCampo,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCampo= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCampo.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCampo,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCampo= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCampo.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCampo,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCampo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCampo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCampo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCampo= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCampo.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCampo,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCampo= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCampo.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCampo,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCampo= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCampo.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCampo,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCampo= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCampo.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCampo,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCampo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCampo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCampo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCampo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCampo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCampo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCampo= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCampo.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCampo,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCampo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCampo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCampo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCampo= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCampo.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCampo,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCampo.add(this.jMenuItemCerrarCampo);
			
			this.jmenuAccionesCampo.add(this.jMenuItemNuevoCampo);
			this.jmenuAccionesCampo.add(this.jMenuItemNuevoGuardarCambiosCampo);
			this.jmenuAccionesCampo.add(this.jMenuItemNuevoRelacionesCampo);
			this.jmenuAccionesCampo.add(this.jMenuItemGuardarCambiosTablaCampo);		
			this.jmenuAccionesCampo.add(this.jMenuItemDuplicarCampo);		
			this.jmenuAccionesCampo.add(this.jMenuItemCopiarCampo);		
			this.jmenuAccionesCampo.add(this.jMenuItemVerFormCampo);		
			
			this.jmenuDatosCampo.add(this.jMenuItemRecargarInformacionCampo);				
			this.jmenuDatosCampo.add(this.jMenuItemAnterioresCampo);				
			this.jmenuDatosCampo.add(this.jMenuItemSiguientesCampo);				
			this.jmenuDatosCampo.add(this.jMenuItemAbrirOrderByCampo);				
			this.jmenuDatosCampo.add(this.jMenuItemMostrarOcultarCampo);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCampo.add(this.jMenuItemGuardarCambiosCampo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCampo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCampo, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCampo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCampo.add(this.jmenuArchivoCampo);		
			this.jmenuBarCampo.add(this.jmenuAccionesCampo);		
			this.jmenuBarCampo.add(this.jmenuDatosCampo);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCampo);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCampo() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdOpcionCampo=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdOpcionCampo.setToolTipText("Buscar Por Opcion ");
		this.jButtonFK_IdOpcionCampo= new JButtonMe();
		this.jButtonFK_IdOpcionCampo.setText("Buscar");
		this.jButtonFK_IdOpcionCampo.setToolTipText("Buscar Por Opcion ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdOpcionCampo,"buscar_button","Buscar Por Opcion ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdOpcionCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_opcionFK_IdOpcionCampo = new JLabelMe();
		jLabelid_opcionFK_IdOpcionCampo.setText("Opcion :");
		jLabelid_opcionFK_IdOpcionCampo.setToolTipText("Opcion");
		jLabelid_opcionFK_IdOpcionCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_opcionFK_IdOpcionCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_opcionFK_IdOpcionCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_opcionFK_IdOpcionCampo,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_opcionFK_IdOpcionCampo= new JComboBoxMe();
		jComboBoxid_opcionFK_IdOpcionCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionFK_IdOpcionCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionFK_IdOpcionCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_opcionFK_IdOpcionCampo,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCampo=new JTabbedPane();


		this.jTabbedPaneBusquedasCampo.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCampo.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCampo.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCampo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCampo,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCampo = new CampoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Campo DATOS");
			this.jInternalFrameDetalleFormCampo = new CampoDetalleFormJInternalFrame(jDesktopPane,this.campoSessionBean.getConGuardarRelaciones(),this.campoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCampo = null;//new CampoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCampo= new GridBagLayout();
		
		
		this.jTableDatosCampo = new JTableMe();      
		
		String sToolTipCampo="";
		sToolTipCampo=CampoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCampo+="(Seguridad.Campo)";
		}
		
		if(!this.campoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCampo+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCampo.setToolTipText(sToolTipCampo);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCampo);
		this.jTableDatosCampo.setAutoCreateRowSorter(true);
		this.jTableDatosCampo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCampo.setRowSelectionAllowed(true);
		this.jTableDatosCampo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCampo,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCampo = new JButtonMe();
		this.jButtonDuplicarCampo = new JButtonMe();
		this.jButtonCopiarCampo = new JButtonMe();
		this.jButtonVerFormCampo = new JButtonMe();
		this.jButtonNuevoRelacionesCampo = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCampo = new JButtonMe();
		this.jButtonCerrarCampo = new JButtonMe();
		
		this.jScrollPanelDatosCampo = new JScrollPane();   
        this.jScrollPanelDatosGeneralCampo = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Campo";
		
		if(!this.campoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Campos" + this.sPath));
		} else {
			this.jScrollPanelDatosCampo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCampo.setToolTipText("Acciones");
        this.jPanelAccionesCampo.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCampo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCampo, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCampo=new ReporteDinamicoJInternalFrame(CampoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCampo();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCampo=new ImportacionJInternalFrame(CampoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCampo();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCampo = new JButtonMe();
		
		this.jButtonAbrirOrderByCampo.setText("Orden");
		this.jButtonAbrirOrderByCampo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCampo,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCampo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCampo,false,this);
			
			//this.cargarOrderByCampo(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCampo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCampo,true,this);
			
			//this.cargarOrderByCampo(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCampo.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosCampo.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosCampo.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosCampo.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCampo.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCampo.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCampo.setText("Nuevo");
		this.jButtonDuplicarCampo.setText("Duplicar");
		this.jButtonCopiarCampo.setText("Copiar");
		this.jButtonVerFormCampo.setText("Ver");
		this.jButtonNuevoRelacionesCampo.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCampo.setText("Guardar");
		this.jButtonCerrarCampo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCampo,"nuevo_button","Nuevo",this.campoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCampo,"duplicar_button","Duplicar",this.campoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCampo,"copiar_button","Copiar",this.campoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCampo,"ver_form","Ver",this.campoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCampo,"nuevorelaciones_button","Nuevo Rel",this.campoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCampo,"guardarcambiostabla_button","Guardar",this.campoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCampo,"cerrar_button","Salir",this.campoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCampo, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCampo.setToolTipText("Nuevo"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCampo.setToolTipText("Duplicar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCampo.setToolTipText("Copiar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCampo.setToolTipText("Ver"+" "+CampoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCampo.setToolTipText("Nuevo Rel"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCampo.setToolTipText("Guardar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCampo.setToolTipText("Salir"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCampo";
		inputMap = this.jButtonNuevoCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCampo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCampo"));
		
		//DUPLICAR
		sMapKey = "DuplicarCampo";
		inputMap = this.jButtonDuplicarCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCampo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCampo"));
		
		//COPIAR
		sMapKey = "CopiarCampo";
		inputMap = this.jButtonCopiarCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCampo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCampo"));
		
		//VEr FORM
		sMapKey = "VerFormCampo";
		inputMap = this.jButtonVerFormCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCampo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCampo"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCampo";
		inputMap = this.jButtonNuevoRelacionesCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCampo"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCampo";
		inputMap = this.jButtonModificarCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCampo"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCampo";
		inputMap = this.jButtonCerrarCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCampo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCampo";
		inputMap = this.jButtonGuardarCambiosTablaCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCampo"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Campo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Campo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Campo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Campo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Campo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCampo.setName("jPanelParametrosReportesCampo"); 
		
		this.jPanelParametrosReportesAccionesCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCampo.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCampo.setName("jPanelParametrosReportesAccionesCampo"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCampo, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCampo, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCampo = new JButtonMe();
		this.jButtonRecargarInformacionCampo.setText("Recargar");
		this.jButtonRecargarInformacionCampo.setToolTipText("Recargar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCampo,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCampo = new JButtonMe();
		this.jButtonProcesarInformacionCampo.setText("Procesar");
		this.jButtonProcesarInformacionCampo.setToolTipText("Procesar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCampo.setVisible(false);
			
		this.jButtonProcesarInformacionCampo.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCampo.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCampo.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCampo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCampo.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCampo.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCampo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCampo.setText("TIPO");       
		this.jComboBoxTiposReportesCampo.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCampo = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCampo.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCampo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCampo = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCampo.setText("Paginacion");
		this.jComboBoxTiposPaginacionCampo.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCampo = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCampo.setText("Accion");
		this.jComboBoxTiposRelacionesCampo.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCampo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCampo.setText("Accion");
		this.jComboBoxTiposAccionesCampo.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCampo = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCampo.setText("Accion");
		this.jComboBoxTiposSeleccionarCampo.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCampo=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCampo.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCampo.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCampo.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCampo = new JLabelMe();
		
		this.jLabelAccionesCampo.setText("Acciones");		
		this.jLabelAccionesCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCampo = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCampo.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCampo.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCampo = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCampo.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCampo.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCampo = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCampo.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCampo.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCampo = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCampo.setText("Graf.");
		this.jCheckBoxConGraficoReporteCampo.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCampo = new JButtonMe();
		//this.jButtonAnterioresCampo.setText("<<");
        this.jButtonAnterioresCampo.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCampo,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCampo = new JButtonMe();
		//this.jButtonSiguientesCampo.setText(">>");
        this.jButtonSiguientesCampo.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCampo,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCampo = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCampo.setText("Nue");
        this.jButtonNuevoGuardarCambiosCampo.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCampo,"nuevoguardarcambios_button","Nue",this.campoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCampo";
		inputMap = this.jButtonNuevoGuardarCambiosCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCampo"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCampo";
		inputMap = this.jButtonRecargarInformacionCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCampo"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCampo";
		inputMap = this.jButtonSiguientesCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCampo"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCampo";
		inputMap = this.jButtonAnterioresCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCampo"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCampo();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCampo.setMinimumSize(new Dimension(this.getWidth(),CampoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CampoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCampo.setMaximumSize(new Dimension(this.getWidth(),CampoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CampoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCampo.setPreferredSize(new Dimension(this.getWidth(),CampoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CampoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCampo = new GridBagLayout();

			this.jPanelPaginacionCampo.setLayout(gridaBagLayoutPaginacionCampo);						
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.gridy = 0;
			this.gridBagConstraintsCampo.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCampo.add(this.jButtonAnterioresCampo, this.gridBagConstraintsCampo);
					
						
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCampo.gridy = 0;
			
			this.jPanelPaginacionCampo.add(this.jButtonNuevoGuardarCambiosCampo, this.gridBagConstraintsCampo);
						
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCampo.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCampo.gridy = 0;
			this.jPanelPaginacionCampo.add(this.jButtonSiguientesCampo, this.gridBagConstraintsCampo);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.gridy = 1;
			this.gridBagConstraintsCampo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCampo.add(this.jButtonNuevoCampo, this.gridBagConstraintsCampo);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCampo = new GridBagConstraints();
				this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCampo.gridy = 1;
				this.gridBagConstraintsCampo.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCampo.add(this.jButtonNuevoRelacionesCampo, this.gridBagConstraintsCampo);
			}
			
			
			if(!this.campoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCampo = new GridBagConstraints();
				this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCampo.gridy = 1;
				this.gridBagConstraintsCampo.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCampo.add(this.jButtonGuardarCambiosTablaCampo, this.gridBagConstraintsCampo);
			}
			
			
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.gridy = 1;
			this.gridBagConstraintsCampo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCampo.add(this.jButtonDuplicarCampo, this.gridBagConstraintsCampo);
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.gridy = 1;
			this.gridBagConstraintsCampo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCampo.add(this.jButtonCopiarCampo, this.gridBagConstraintsCampo);
		
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.gridy = 1;
			this.gridBagConstraintsCampo.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCampo.add(this.jButtonVerFormCampo, this.gridBagConstraintsCampo);
		
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.gridy = 1;
			this.gridBagConstraintsCampo.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCampo.add(this.jButtonCerrarCampo, this.gridBagConstraintsCampo);
		
		
		
		this.jButtonRecargarInformacionCampo.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCampo.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCampo.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCampo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCampo.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCampo.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCampo.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCampo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCampo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCampo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCampo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCampo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCampo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCampo.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCampo.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCampo.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCampo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCampo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCampo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCampo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCampo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCampo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCampo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCampo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCampo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCampo.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCampo.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCampo.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCampo.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCampo.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCampo.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCampo, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCampo.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCampo.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCampo.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCampo.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCampo.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCampo.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCampo = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCampo = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Campo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Campo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Campo = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Campo = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCampo.setLayout(gridaBagParametrosReportesCampo);
			this.jPanelParametrosReportesAccionesCampo.setLayout(gridaBagParametrosReportesAccionesCampo);
			
			
			this.jPanelParametrosAuxiliar1Campo.setLayout(gridaBagParametrosAuxiliar1Campo);
			this.jPanelParametrosAuxiliar2Campo.setLayout(gridaBagParametrosAuxiliar2Campo);
			this.jPanelParametrosAuxiliar3Campo.setLayout(gridaBagParametrosAuxiliar3Campo);
			this.jPanelParametrosAuxiliar4Campo.setLayout(gridaBagParametrosAuxiliar4Campo);
			//this.jPanelParametrosAuxiliar5Campo.setLayout(gridaBagParametrosAuxiliar2Campo);			
			
			
			
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCampo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCampo.add(this.jButtonRecargarInformacionCampo, this.gridBagConstraintsCampo);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCampo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCampo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Campo.add(this.jComboBoxTiposPaginacionCampo, this.gridBagConstraintsCampo);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCampo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCampo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Campo.add(this.jCheckBoxConAltoMaximoTablaCampo, this.gridBagConstraintsCampo);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCampo.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCampo.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Campo.add(this.jComboBoxTiposArchivosReportesCampo, this.gridBagConstraintsCampo);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCampo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCampo.add(this.jPanelParametrosAuxiliar1Campo, this.gridBagConstraintsCampo);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCampo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Campo.add(this.jComboBoxTiposReportesCampo, this.gridBagConstraintsCampo);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCampo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCampo.add(this.jPanelParametrosAuxiliar4Campo, this.gridBagConstraintsCampo);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCampo.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCampo.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCampo.add(this.jComboBoxTiposReportesCampo, this.gridBagConstraintsCampo);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCampo.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCampo.add(this.jCheckBoxGenerarReporteCampo, this.gridBagConstraintsCampo);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCampo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCampo.add(this.jPanelParametrosAuxiliar2Campo, this.gridBagConstraintsCampo);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCampo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCampo.add(this.jLabelAccionesCampo, this.gridBagConstraintsCampo);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCampo = new GridBagConstraints();
				this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCampo.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCampo.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCampo.add(this.jButtonAbrirOrderByCampo, this.gridBagConstraintsCampo);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCampo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCampo.add(this.jComboBoxTiposSeleccionarCampo, this.gridBagConstraintsCampo);			
			
			
			/*
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCampo.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCampo.add(this.jCheckBoxSeleccionarTodosCampo, this.gridBagConstraintsCampo);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCampo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Campo.add(this.jCheckBoxSeleccionarTodosCampo, this.gridBagConstraintsCampo);															
				
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCampo.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Campo.add(this.jCheckBoxSeleccionadosCampo, this.gridBagConstraintsCampo);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCampo.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCampo.add(this.jPanelParametrosAuxiliar3Campo, this.gridBagConstraintsCampo);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCampo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCampo.add(this.jComboBoxTiposRelacionesCampo, this.gridBagConstraintsCampo);
				
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCampo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCampo.add(this.jComboBoxTiposAccionesCampo, this.gridBagConstraintsCampo);
	
				
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCampo.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCampo.add(this.jTextFieldValorCampoGeneralCampo, this.gridBagConstraintsCampo);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCampo = new GridBagLayout();

			this.jScrollPanelDatosCampo.setLayout(gridaBagLayoutDatosCampo);
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.gridy = 0;
			this.gridBagConstraintsCampo.gridx = 0;
			
			this.jScrollPanelDatosCampo.add(this.jTableDatosCampo, this.gridBagConstraintsCampo);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCampo.setViewportView(this.jTableDatosCampo);
		this.jTableDatosCampo.setFillsViewportHeight(true);
		this.jTableDatosCampo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCampo= new GridBagLayout();
		this.jPanelAccionesCampo.setLayout(gridaBagLayoutAccionesCampo);
		
		
		/*	
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCampo.gridy = 0;
		this.gridBagConstraintsCampo.gridx = 0;
			
		this.jPanelAccionesCampo.add(this.jButtonNuevoCampo, this.gridBagConstraintsCampo);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdOpcionCampo= new GridBagLayout();
		gridaBagLayoutFK_IdOpcionCampo.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdOpcionCampo.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdOpcionCampo.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdOpcionCampo.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdOpcionCampo.setLayout(gridaBagLayoutFK_IdOpcionCampo);

		gridBagConstraintsCampo = new GridBagConstraints();
		gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCampo.gridy = 0;
		gridBagConstraintsCampo.gridx = 0;
		jPanelFK_IdOpcionCampo.add(jLabelid_opcionFK_IdOpcionCampo, gridBagConstraintsCampo);

		gridBagConstraintsCampo = new GridBagConstraints();
		gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCampo.gridy = 0;
		gridBagConstraintsCampo.gridx = 1;
		jPanelFK_IdOpcionCampo.add(jComboBoxid_opcionFK_IdOpcionCampo, gridBagConstraintsCampo);

		gridBagConstraintsCampo = new GridBagConstraints();
		gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCampo.gridy = 1;
		gridBagConstraintsCampo.gridx =1;
		jPanelFK_IdOpcionCampo.add(jButtonFK_IdOpcionCampo, gridBagConstraintsCampo);

		jTabbedPaneBusquedasCampo.addTab("1.-Por Opcion ", jPanelFK_IdOpcionCampo);
		jTabbedPaneBusquedasCampo.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCampo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCampo);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.campoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCampo = new GridBagConstraints();						
			this.gridBagConstraintsCampo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCampo.gridx = 0;		
			//this.gridBagConstraintsCampo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCampo.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCampo, this.gridBagConstraintsCampo);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCampo.gridx = 0;		
		//this.gridBagConstraintsCampo.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCampo.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCampo.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCampo);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCampo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCampo.gridx = 0;		
			this.gridBagConstraintsCampo.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCampo.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCampo, this.gridBagConstraintsCampo);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCampo.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCampo, this.gridBagConstraintsCampo);								
		
		
		/*
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCampo.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCampo, this.gridBagConstraintsCampo);
		*/		
		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCampo.gridx =0;
		this.gridBagConstraintsCampo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCampo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCampo, this.gridBagConstraintsCampo);
				
		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCampo.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCampo, this.gridBagConstraintsCampo);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(CampoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCampo= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCampo = new GridBagLayout();
			this.jPanelBusquedasParametrosCampo.setLayout(gridaBagLayoutBusquedasParametrosCampo);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCampo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCampo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCampo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCampo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCampo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCampo, this.gridBagConstraintsCampo);
			
			
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCampo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCampo, this.gridBagConstraintsCampo);
		
			
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCampo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCampo, this.gridBagConstraintsCampo);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCampo;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCampo() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCampo = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCampo.setName("jPanelReporteDinamicoCampo"); 
		
		this.jPanelReporteDinamicoCampo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCampo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCampo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCampo.setLayout(gridaBagLayoutReporteDinamicoCampo);
		
		
		this.jInternalFrameReporteDinamicoCampo= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCampo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCampo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCampo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCampo.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCampo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCampo.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCampo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCampo.setResizable(true);
	    this.jInternalFrameReporteDinamicoCampo.setClosable(true);
	    this.jInternalFrameReporteDinamicoCampo.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCampo.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCampo.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCampo.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Campos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCampo = new JLabelMe();

		this.jLabelColumnasSelectReporteCampo.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCampo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCampo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCampo.add(this.jLabelColumnasSelectReporteCampo, this.gridBagConstraintsCampo);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCampo = new JList<Reporte>();
		this.jListColumnasSelectReporteCampo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCampo.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCampo.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCampo.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCampo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCampo=new JScrollPane(this.jListColumnasSelectReporteCampo);
			
			this.jScrollColumnasSelectReporteCampo.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCampo.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCampo.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCampo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCampo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCampo.add(this.jListColumnasSelectReporteCampo, this.gridBagConstraintsCampo);
		this.jPanelReporteDinamicoCampo.add(this.jScrollColumnasSelectReporteCampo, this.gridBagConstraintsCampo);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCampo = new JLabelMe();

		this.jLabelRelacionesSelectReporteCampo.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCampo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCampo.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCampo.add(this.jLabelRelacionesSelectReporteCampo, this.gridBagConstraintsCampo);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCampo = new JList<Reporte>();
		this.jListRelacionesSelectReporteCampo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCampo.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCampo.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCampo.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCampo.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCampo=new JScrollPane(this.jListRelacionesSelectReporteCampo);
			
			this.jScrollRelacionesSelectReporteCampo.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCampo.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCampo.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCampo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCampo.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCampo.add(this.jListRelacionesSelectReporteCampo, this.gridBagConstraintsCampo);
		this.jPanelReporteDinamicoCampo.add(this.jScrollRelacionesSelectReporteCampo, this.gridBagConstraintsCampo);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCampo = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCampo = new JComboBoxMe();
		this.jListColumnasValoresGraficoCampo = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCampo = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCampo.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCampo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCampo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCampo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCampo = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCampo.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCampo.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCampo.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCampo.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCampo = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCampo.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCampo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCampo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCampo.add(this.jLabelGenerarExcelReporteDinamicoCampo, this.gridBagConstraintsCampo);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCampo = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCampo.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCampo,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCampo.setToolTipText("Generar EXCEL"+" "+CampoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCampo = new GridBagConstraints();
		//this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCampo.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCampo.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCampo.add(this.jButtonGenerarExcelReporteDinamicoCampo, this.gridBagConstraintsCampo);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCampo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCampo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCampo.add(this.jComboBoxTiposReportesDinamicoCampo, this.gridBagConstraintsCampo);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCampo = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCampo.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCampo.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCampo.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCampo.add(this.jLabelTiposArchivoReporteDinamicoCampo, this.gridBagConstraintsCampo);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCampo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCampo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCampo.add(this.jComboBoxTiposArchivosReportesDinamicoCampo, this.gridBagConstraintsCampo);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCampo = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCampo.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCampo,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCampo.setToolTipText("Generar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCampo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCampo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCampo.add(this.jButtonGenerarReporteDinamicoCampo, this.gridBagConstraintsCampo);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCampo = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCampo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCampo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCampo.setToolTipText("Cancelar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCampo.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCampo.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCampo.add(this.jButtonCerrarReporteDinamicoCampo, this.gridBagConstraintsCampo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCampo = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCampo= new JScrollPane(jPanelReporteDinamicoCampo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCampo.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCampo.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCampo.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Campos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCampo.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCampo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCampo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCampo.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCampo);
		this.jInternalFrameReporteDinamicoCampo.getContentPane().add(this.jScrollPanelReporteDinamicoCampo, this.gridBagConstraintsCampo);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCampo() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCampo = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCampo.setName("jPanelImportacionCampo"); 
		
		this.jPanelImportacionCampo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCampo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCampo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCampo.setLayout(gridaBagLayoutImportacionCampo);
		
		
		this.jInternalFrameImportacionCampo= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCampo= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCampo = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCampo= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCampo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCampo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCampo.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCampo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCampo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCampo.setResizable(true);
	    this.jInternalFrameImportacionCampo.setClosable(true);
	    this.jInternalFrameImportacionCampo.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCampo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCampo.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCampo.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCampo.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCampo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCampo.setResizable(true);
	    this.jInternalFrameImportacionCampo.setClosable(true);
	    this.jInternalFrameImportacionCampo.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCampo.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCampo.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCampo.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Campos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCampo = new JLabelMe();

		this.jLabelArchivoImportacionCampo.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCampo.gridy = iPosYImportacion;		
		this.gridBagConstraintsCampo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCampo.add(this.jLabelArchivoImportacionCampo, this.gridBagConstraintsCampo);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCampo = new JFileChooser();		
		this.jFileChooserImportacionCampo.setToolTipText("ESCOGER ARCHIVO"+" "+CampoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCampo = new JButtonMe();
		this.jButtonAbrirImportacionCampo.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCampo,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCampo.setToolTipText("Generar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCampo.gridy = iPosYImportacion;
		this.gridBagConstraintsCampo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCampo.add(this.jButtonAbrirImportacionCampo, this.gridBagConstraintsCampo);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCampo = new JLabelMe();

		this.jLabelPathArchivoImportacionCampo.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCampo.gridy = iPosYImportacion;		
		this.gridBagConstraintsCampo.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCampo.add(this.jLabelPathArchivoImportacionCampo, this.gridBagConstraintsCampo);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCampo=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCampo.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCampo.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCampo.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCampo.gridy = iPosYImportacion;
		this.gridBagConstraintsCampo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCampo.add(this.jTextFieldPathArchivoImportacionCampo, this.gridBagConstraintsCampo);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCampo = new JButtonMe();
		this.jButtonGenerarImportacionCampo.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCampo,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCampo.setToolTipText("Generar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCampo.gridy = iPosYImportacion;
		this.gridBagConstraintsCampo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCampo.add(this.jButtonGenerarImportacionCampo, this.gridBagConstraintsCampo);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCampo = new JButtonMe();
		this.jButtonCerrarImportacionCampo.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCampo,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCampo.setToolTipText("Cancelar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCampo.gridy = iPosYImportacion;
		this.gridBagConstraintsCampo.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCampo.add(this.jButtonCerrarImportacionCampo, this.gridBagConstraintsCampo);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCampo = new GridBagLayout();
		
		this.jScrollPanelImportacionCampo= new JScrollPane(jPanelImportacionCampo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy =iPosYImportacion;
		this.gridBagConstraintsCampo.gridx =iPosXImportacion;
		this.gridBagConstraintsCampo.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCampo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCampo.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCampo);
		this.jInternalFrameImportacionCampo.getContentPane().add(this.jScrollPanelImportacionCampo, this.gridBagConstraintsCampo);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCampo(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCampo = new JButtonMe();
			this.jButtonAbrirOrderByCampo.setText("Orden");
			this.jButtonAbrirOrderByCampo.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCampo,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCampo";
			inputMap = this.jButtonAbrirOrderByCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCampo"));
		
		
			GridBagLayout gridaBagLayoutOrderByCampo = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCampo.setName("jPanelOrderByCampo"); 
			
			this.jPanelOrderByCampo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCampo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCampo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCampo.setLayout(gridaBagLayoutOrderByCampo);
			
			
			this.jTableDatosCampoOrderBy = new JTableMe();        
			this.jTableDatosCampoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCampoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCampoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCampoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCampoOrderBy.setViewportView(this.jTableDatosCampoOrderBy);
			this.jTableDatosCampoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCampoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCampo= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCampo= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCampo = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCampo= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCampo.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCampo.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCampo.setTitle("Orden");
			this.jInternalFrameOrderByCampo.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCampo.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCampo.setResizable(true);
			this.jInternalFrameOrderByCampo.setClosable(true);
			this.jInternalFrameOrderByCampo.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCampo.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCampo.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCampo.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Campos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCampo.gridx =iPosXOrderBy;
			this.gridBagConstraintsCampo.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCampo.ipady =150;
				
			this.jPanelOrderByCampo.add(jScrollPanelDatosCampoOrderBy, this.gridBagConstraintsCampo);//this.jTableDatosCampoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCampo = new JButtonMe();
			this.jButtonCerrarOrderByCampo.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCampo,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCampo.setToolTipText("Cancelar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCampo.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCampo.add(this.jButtonCerrarOrderByCampo, this.gridBagConstraintsCampo);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCampo = new GridBagLayout();
			
			this.jScrollPanelOrderByCampo= new JScrollPane(jPanelOrderByCampo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.gridy =iPosYOrderBy;
			this.gridBagConstraintsCampo.gridx =iPosXOrderBy;
			this.gridBagConstraintsCampo.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCampo.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCampo.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCampo);
			
			this.jInternalFrameOrderByCampo.getContentPane().add(this.jScrollPanelOrderByCampo, this.gridBagConstraintsCampo);			
		
		} else {
			this.jButtonAbrirOrderByCampo = new JButtonMe();
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
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.campoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCampo.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCampo.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCampo.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCampo.getRowHeight();//CampoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.campoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CampoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCampo.isSelected()) {
					iHeightTable=CampoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CampoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CampoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CampoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCampo.isSelected()) {
					iHeightTable=CampoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CampoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CampoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCampo.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCampo.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCampo.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCampo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCampo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCampo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCampo!=null && this.jInternalFrameOrderByCampo.getjTableDatosOrderBy()!=null) {
			//if(!this.campoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCampo.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCampo.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCampo.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCampo.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCampo.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCampo.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCampo.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCampo.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCampo.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCampo.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=campoLogic.getCampos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=campos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Campo> TraerCampoBeans(List<Campo> campos,ArrayList<Classe> classes)throws Exception {
		try {
			for(Campo campo:campos) {
					
				if(!(CampoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CampoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					campo.setsDetalleGeneralEntityReporte(CampoConstantesFunciones.getCampoDescripcion(campo));
										
					campo.setestado_descripcion(CampoConstantesFunciones.getestadoDescripcion(campo));	
					
					

					if(campo.getPerfilCampos()!=null && Funciones.existeClass(classes,PerfilCampo.class)) {
						try{campo.setperfilcamposDescripcionReporte(new JRBeanCollectionDataSource(PerfilCampoJInternalFrame.TraerPerfilCampoBeans(campo.getPerfilCampos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(campo.getPerfils()!=null && Funciones.existeClass(classes,Perfil.class)) {
						try{campo.setperfilsDescripcionReporte(new JRBeanCollectionDataSource(PerfilJInternalFrame.TraerPerfilBeans(campo.getPerfils(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//campo.setsDetalleGeneralEntityReporte(campo.getsDetalleGeneralEntityReporte());
										
				}
				
				//campobeans.add(campobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return campos;
    }
	//PARA REPORTES FIN
}
