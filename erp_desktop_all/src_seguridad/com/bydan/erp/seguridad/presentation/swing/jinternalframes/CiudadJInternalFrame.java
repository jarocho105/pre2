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
import com.bydan.erp.seguridad.util.CiudadConstantesFunciones;

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
public class CiudadJInternalFrame extends CiudadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCiudad;
	
	protected JMenuBar jmenuBarCiudad;
	
	protected JMenu jmenuCiudad;
	protected JMenu jmenuDatosCiudad;
	protected JMenu jmenuArchivoCiudad;
	protected JMenu jmenuAccionesCiudad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCiudad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCiudad;	
	protected GridBagConstraints gridBagConstraintsCiudad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CiudadDetalleFormJInternalFrame jInternalFrameDetalleFormCiudad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCiudad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCiudad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";
	
	public CiudadSessionBean ciudadSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Ciudad> ciudads;		
	public List<Ciudad> ciudadsEliminados;	
	public List<Ciudad> ciudadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCiudad;		
	protected JButton jButtonAbrirOrderByCiudad;
	
	
	//protected JPanel jPanelOrderByCiudad;
	//public JScrollPane jScrollPanelOrderByCiudad;	
	//protected JButton jButtonCerrarOrderByCiudad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CiudadLogic ciudadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCiudad;
	public JScrollPane jScrollPanelDatosEdicionCiudad;
	public JScrollPane jScrollPanelDatosGeneralCiudad;
    
	
	
	//public JScrollPane jScrollPanelDatosCiudadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCiudad;
	//public JScrollPane jScrollPanelImportacionCiudad;
	
	
	
	protected JPanel jPanelAccionesCiudad;
	
    protected JPanel jPanelPaginacionCiudad;
    protected JPanel jPanelParametrosReportesCiudad;
	protected JPanel jPanelParametrosReportesAccionesCiudad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Ciudad;
	protected JPanel jPanelParametrosAuxiliar2Ciudad;
	protected JPanel jPanelParametrosAuxiliar3Ciudad;
	protected JPanel jPanelParametrosAuxiliar4Ciudad;
	//protected JPanel jPanelParametrosAuxiliar5Ciudad;
	
	
	
	//protected JPanel jPanelReporteDinamicoCiudad;
	//protected JPanel jPanelImportacionCiudad;
	
	
	public JTable jTableDatosCiudad;
	
	
	
	//public JTable jTableDatosCiudadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCiudad;
	protected JButton jButtonDuplicarCiudad;
	protected JButton jButtonCopiarCiudad;
	protected JButton jButtonVerFormCiudad;
	protected JButton jButtonNuevoRelacionesCiudad;
	protected JButton jButtonModificarCiudad;
	
    protected JButton jButtonGuardarCambiosTablaCiudad;
	protected JButton jButtonCerrarCiudad;
	
	
	protected JButton jButtonRecargarInformacionCiudad;
	protected JButton jButtonProcesarInformacionCiudad;
	
	
	protected JButton jButtonAnterioresCiudad;
	protected JButton jButtonSiguientesCiudad;
	protected JButton jButtonNuevoGuardarCambiosCiudad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCiudad;
	//protected JButton jButtonCerrarReporteDinamicoCiudad;
	//protected JButton jButtonGenerarExcelReporteDinamicoCiudad;	
	
	
	
	//protected JButton jButtonAbrirImportacionCiudad;
	//protected JButton jButtonGenerarImportacionCiudad;
	//protected JButton jButtonCerrarImportacionCiudad;
	//protected JFileChooser jFileChooserImportacionCiudad;
	//protected File fileImportacionCiudad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCiudad;
	protected JButton jButtonDuplicarToolBarCiudad;
	protected JButton jButtonNuevoRelacionesToolBarCiudad;
	
	
	public JButton jButtonGuardarCambiosToolBarCiudad;
	protected JButton jButtonCopiarToolBarCiudad;
	protected JButton jButtonVerFormToolBarCiudad;
	public JButton jButtonGuardarCambiosTablaToolBarCiudad;
	protected JButton jButtonMostrarOcultarTablaToolBarCiudad;
	protected JButton jButtonCerrarToolBarCiudad;
	
	protected JButton jButtonRecargarInformacionToolBarCiudad;
	protected JButton jButtonProcesarInformacionToolBarCiudad;
	protected JButton jButtonAnterioresToolBarCiudad;
	protected JButton jButtonSiguientesToolBarCiudad;
	protected JButton jButtonNuevoGuardarCambiosToolBarCiudad;
	protected JButton jButtonAbrirOrderByToolBarCiudad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCiudad;
	protected JMenuItem jMenuItemDuplicarCiudad;
	protected JMenuItem jMenuItemNuevoRelacionesCiudad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCiudad;
	protected JMenuItem jMenuItemCopiarCiudad;
	protected JMenuItem jMenuItemVerFormCiudad;
	protected JMenuItem jMenuItemGuardarCambiosTablaCiudad;
	protected JMenuItem jMenuItemCerrarCiudad;
	protected JMenuItem jMenuItemDetalleCerrarCiudad;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCiudad;
	protected JMenuItem jMenuItemDetalleMostarOcultarCiudad;
	
	protected JMenuItem jMenuItemRecargarInformacionCiudad;
	protected JMenuItem jMenuItemProcesarInformacionCiudad;
	protected JMenuItem jMenuItemAnterioresCiudad;
	protected JMenuItem jMenuItemSiguientesCiudad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCiudad;
	protected JMenuItem jMenuItemAbrirOrderByCiudad;
	protected JMenuItem jMenuItemMostrarOcultarCiudad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCiudad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCiudad;
	protected JCheckBox jCheckBoxSeleccionadosCiudad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCiudad;
	protected JCheckBox jCheckBoxConGraficoReporteCiudad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCiudad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCiudad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCiudad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCiudad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCiudad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCiudad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCiudad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCiudad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCiudad;
	protected JTextField jTextFieldValorCampoGeneralCiudad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCiudad;
	//public JList<Reporte> jListColumnasSelectReporteCiudad;
	//public JScrollPane jScrollColumnasSelectReporteCiudad;
	
	//public JLabel jLabelRelacionesSelectReporteCiudad;
	//public JList<Reporte> jListRelacionesSelectReporteCiudad;
	//public JScrollPane jScrollRelacionesSelectReporteCiudad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCiudad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCiudad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCiudad;
	//public JLabel jLabelTiposArchivoReporteDinamicoCiudad;
	
		
	//public JLabel jLabelArchivoImportacionCiudad;	
	//public JLabel jLabelPathArchivoImportacionCiudad;
	//protected JTextField jTextFieldPathArchivoImportacionCiudad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCiudad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCiudad;
	
	//public JLabel jLabelColumnaCategoriaValorCiudad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCiudad;
	
	//public JLabel jLabelColumnasValoresGraficoCiudad;
	//public JList<Reporte> jListColumnasValoresGraficoCiudad;
	//public JScrollPane jScrollColumnasValoresGraficoCiudad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCiudad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCiudad;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCiudad;
	public JPanel jPanelBusquedaPorNombreCiudad;
	public JButton jButtonBusquedaPorNombreCiudad;
	public JPanel jPanelFK_IdPaisCiudad;
	public JButton jButtonFK_IdPaisCiudad;
	
	public JPanel jPanelnombreBusquedaPorNombreCiudad;
	public JLabel jLabelnombreBusquedaPorNombreCiudad;
	public JTextArea jTextAreanombreBusquedaPorNombreCiudad;
	public JButton jButtonnombreBusquedaPorNombreCiudadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisCiudad;
	public JLabel jLabelid_paisFK_IdPaisCiudad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisCiudad;
	public JButton jButtonid_paisFK_IdPaisCiudad= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisCiudadUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisCiudadBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CiudadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Ciudad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CiudadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ciudad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CiudadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ciudad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CiudadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Ciudad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCiudad)	{
		this.jButtonRecargarInformacionCiudad = jButtonRecargarInformacionCiudad;
	}
	
	public JButton getjButtonProcesarInformacionCiudad() {
		return this.jButtonProcesarInformacionCiudad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCiudad)	{
		this.jButtonProcesarInformacionCiudad = jButtonProcesarInformacionCiudad;
	}
	
	
	public JButton getjButtonRecargarInformacionCiudad() {
		return this.jButtonRecargarInformacionCiudad;
	}
	
	
	public List<Ciudad> getciudads() {
		return this.ciudads;
	}

	public void setciudads(List<Ciudad> ciudads) {
		this.ciudads = ciudads;
	}
	
	public List<Ciudad> getciudadsAux() {
		return this.ciudadsAux;
	}

	public void setciudadsAux(List<Ciudad> ciudadsAux) {
		this.ciudadsAux = ciudadsAux;
	}
	
	public List<Ciudad> getciudadsEliminados() {
		return this.ciudadsEliminados;
	}

	public void setCiudadsEliminados(List<Ciudad> ciudadsEliminados) {
		this.ciudadsEliminados = ciudadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCiudad() {
		return jComboBoxTiposSeleccionarCiudad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCiudad(
			JComboBox jComboBoxTiposSeleccionarCiudad) {
		this.jComboBoxTiposSeleccionarCiudad = jComboBoxTiposSeleccionarCiudad;
	}
	
	public void setBorderResaltarTiposSeleccionarCiudad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCiudad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCiudad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCiudad() {
		return jTextFieldValorCampoGeneralCiudad;
	}

	public void setjTextFieldValorCampoGeneralCiudad(
			JTextField jTextFieldValorCampoGeneralCiudad) {
		this.jTextFieldValorCampoGeneralCiudad = jTextFieldValorCampoGeneralCiudad;
	}

	public void setBorderResaltarValorCampoGeneralCiudad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCiudad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCiudad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCiudad() {
		return this.jCheckBoxSeleccionarTodosCiudad;
	}

	public void setjCheckBoxSeleccionarTodosCiudad(
			JCheckBox jCheckBoxSeleccionarTodosCiudad) {
		this.jCheckBoxSeleccionarTodosCiudad = jCheckBoxSeleccionarTodosCiudad;
	}

	public void setBorderResaltarSeleccionarTodosCiudad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCiudad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCiudad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCiudad() {
		return this.jCheckBoxSeleccionadosCiudad;
	}

	public void setjCheckBoxSeleccionadosCiudad(
			JCheckBox jCheckBoxSeleccionadosCiudad) {
		this.jCheckBoxSeleccionadosCiudad = jCheckBoxSeleccionadosCiudad;
	}
	
	public void setBorderResaltarSeleccionadosCiudad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCiudad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCiudad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCiudad() {
		return this.jComboBoxTiposArchivosReportesCiudad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCiudad(
			JComboBox jComboBoxTiposArchivosReportesCiudad) {
		this.jComboBoxTiposArchivosReportesCiudad = jComboBoxTiposArchivosReportesCiudad;
	}

	public void setBorderResaltarTiposArchivosReportesCiudad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCiudad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCiudad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCiudad() {
		return this.jComboBoxTiposReportesCiudad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCiudad(
			JComboBox jComboBoxTiposReportesCiudad) {
		this.jComboBoxTiposReportesCiudad = jComboBoxTiposReportesCiudad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCiudad() {
	//	return jComboBoxTiposReportesDinamicoCiudad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCiudad(
	//		JComboBox jComboBoxTiposReportesDinamicoCiudad) {
	//	this.jComboBoxTiposReportesDinamicoCiudad = jComboBoxTiposReportesDinamicoCiudad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCiudad() {
	//	return jComboBoxTiposArchivosReportesDinamicoCiudad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCiudad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCiudad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCiudad = jComboBoxTiposArchivosReportesDinamicoCiudad;
	//}
	
	public void setBorderResaltarTiposReportesCiudad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCiudad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCiudad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCiudad() {
		return this.jComboBoxTiposGraficosReportesCiudad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCiudad(
			JComboBox jComboBoxTiposGraficosReportesCiudad) {
		this.jComboBoxTiposGraficosReportesCiudad = jComboBoxTiposGraficosReportesCiudad;
	}
	
	public void setBorderResaltarTiposGraficosReportesCiudad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCiudad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCiudad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCiudad() {
		return this.jComboBoxTiposPaginacionCiudad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCiudad(
			JComboBox jComboBoxTiposPaginacionCiudad) {
		this.jComboBoxTiposPaginacionCiudad = jComboBoxTiposPaginacionCiudad;
	}
	
	public void setBorderResaltarTiposPaginacionCiudad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCiudad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCiudad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCiudad() {
		return this.jComboBoxTiposRelacionesCiudad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCiudad() {
		return this.jComboBoxTiposAccionesCiudad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCiudad(
			JComboBox jComboBoxTiposRelacionesCiudad) {
		this.jComboBoxTiposRelacionesCiudad = jComboBoxTiposRelacionesCiudad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCiudad(
			JComboBox jComboBoxTiposAccionesCiudad) {
		this.jComboBoxTiposAccionesCiudad = jComboBoxTiposAccionesCiudad;
	}
	
	public void setBorderResaltarTiposRelacionesCiudad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCiudad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCiudad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCiudad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCiudad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCiudad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCiudad() {
	//	return jCheckBoxConGraficoDinamicoCiudad;
	//}

	//public void setjCheckBoxConGraficoDinamicoCiudad(
	//		JCheckBox jCheckBoxConGraficoDinamicoCiudad) {
	//	this.jCheckBoxConGraficoDinamicoCiudad = jCheckBoxConGraficoDinamicoCiudad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCiudad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCiudad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCiudad .setBorder(borderResaltar);		
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
		this.ciudadSessionBean=new CiudadSessionBean();
		
		this.ciudadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ciudadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ciudadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CiudadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CiudadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CiudadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CiudadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CiudadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ciudad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {
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
		
		CiudadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Ciudad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCiudad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCiudad,this.jTtoolBarCiudad,
							"nuevo","nuevo","Nuevo"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCiudad,this.jTtoolBarCiudad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCiudad,this.jTtoolBarCiudad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCiudad,this.jTtoolBarCiudad,
							"duplicar","duplicar","Duplicar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCiudad,this.jTtoolBarCiudad,
							"copiar","copiar","Copiar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCiudad,this.jTtoolBarCiudad,
							"ver_form","ver_form","Ver"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCiudad,this.jTtoolBarCiudad,
							"recargar","recargar","Recargar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCiudad,this.jTtoolBarCiudad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCiudad,this.jTtoolBarCiudad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCiudad,this.jTtoolBarCiudad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCiudad,this.jTtoolBarCiudad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCiudad,this.jTtoolBarCiudad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCiudad,this.jTtoolBarCiudad,
							"cerrar","cerrar","Salir"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCiudad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCiudad;
			
				this.jButtonProcesarInformacionToolBarCiudad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCiudad;
				
		//protected JButton jButtonModificarToolBarCiudad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCiudad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCiudad=new JMenuMe("General");
		this.jmenuArchivoCiudad=new JMenuMe("Archivo");
		this.jmenuAccionesCiudad=new JMenuMe("Acciones");
		this.jmenuDatosCiudad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCiudad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCiudad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCiudad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCiudad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCiudad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCiudad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCiudad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCiudad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCiudad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCiudad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCiudad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCiudad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCiudad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCiudad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCiudad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCiudad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCiudad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCiudad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCiudad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCiudad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCiudad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCiudad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCiudad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCiudad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCiudad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCiudad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCiudad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCiudad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCiudad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCiudad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCiudad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCiudad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCiudad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCiudad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCiudad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCiudad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCiudad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCiudad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCiudad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCiudad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCiudad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCiudad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCiudad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCiudad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCiudad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCiudad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCiudad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCiudad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCiudad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCiudad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCiudad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCiudad.add(this.jMenuItemCerrarCiudad);
			
			this.jmenuAccionesCiudad.add(this.jMenuItemNuevoCiudad);
			this.jmenuAccionesCiudad.add(this.jMenuItemNuevoGuardarCambiosCiudad);
			this.jmenuAccionesCiudad.add(this.jMenuItemNuevoRelacionesCiudad);
			this.jmenuAccionesCiudad.add(this.jMenuItemGuardarCambiosTablaCiudad);		
			this.jmenuAccionesCiudad.add(this.jMenuItemDuplicarCiudad);		
			this.jmenuAccionesCiudad.add(this.jMenuItemCopiarCiudad);		
			this.jmenuAccionesCiudad.add(this.jMenuItemVerFormCiudad);		
			
			this.jmenuDatosCiudad.add(this.jMenuItemRecargarInformacionCiudad);				
			this.jmenuDatosCiudad.add(this.jMenuItemAnterioresCiudad);				
			this.jmenuDatosCiudad.add(this.jMenuItemSiguientesCiudad);				
			this.jmenuDatosCiudad.add(this.jMenuItemAbrirOrderByCiudad);				
			this.jmenuDatosCiudad.add(this.jMenuItemMostrarOcultarCiudad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCiudad.add(this.jMenuItemGuardarCambiosCiudad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCiudad.add(this.jmenuArchivoCiudad);		
			this.jmenuBarCiudad.add(this.jmenuAccionesCiudad);		
			this.jmenuBarCiudad.add(this.jmenuDatosCiudad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCiudad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCiudad() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreCiudad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreCiudad.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreCiudad= new JButtonMe();
		this.jButtonBusquedaPorNombreCiudad.setText("Buscar");
		this.jButtonBusquedaPorNombreCiudad.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreCiudad,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreCiudad = new JLabelMe();
		jLabelnombreBusquedaPorNombreCiudad.setText("Nombre :");
		jLabelnombreBusquedaPorNombreCiudad.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreCiudad,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreCiudad= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreCiudad,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisCiudad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisCiudad.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisCiudad= new JButtonMe();
		this.jButtonFK_IdPaisCiudad.setText("Buscar");
		this.jButtonFK_IdPaisCiudad.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisCiudad,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisCiudad = new JLabelMe();
		jLabelid_paisFK_IdPaisCiudad.setText("Pais :");
		jLabelid_paisFK_IdPaisCiudad.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisCiudad,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisCiudad= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisCiudad,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCiudad=new JTabbedPane();


		this.jTabbedPaneBusquedasCiudad.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCiudad.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCiudad.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCiudad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCiudad,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCiudad = new CiudadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ciudad DATOS");
			this.jInternalFrameDetalleFormCiudad = new CiudadDetalleFormJInternalFrame(jDesktopPane,this.ciudadSessionBean.getConGuardarRelaciones(),this.ciudadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCiudad = null;//new CiudadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCiudad= new GridBagLayout();
		
		
		this.jTableDatosCiudad = new JTableMe();      
		
		String sToolTipCiudad="";
		sToolTipCiudad=CiudadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCiudad+="(Seguridad.Ciudad)";
		}
		
		if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {
			sToolTipCiudad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCiudad.setToolTipText(sToolTipCiudad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCiudad);
		this.jTableDatosCiudad.setAutoCreateRowSorter(true);
		this.jTableDatosCiudad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCiudad.setRowSelectionAllowed(true);
		this.jTableDatosCiudad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCiudad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCiudad = new JButtonMe();
		this.jButtonDuplicarCiudad = new JButtonMe();
		this.jButtonCopiarCiudad = new JButtonMe();
		this.jButtonVerFormCiudad = new JButtonMe();
		this.jButtonNuevoRelacionesCiudad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCiudad = new JButtonMe();
		this.jButtonCerrarCiudad = new JButtonMe();
		
		this.jScrollPanelDatosCiudad = new JScrollPane();   
        this.jScrollPanelDatosGeneralCiudad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCiudad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ciudad";
		
		if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ciudades" + this.sPath));
		} else {
			this.jScrollPanelDatosCiudad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCiudad.setToolTipText("Acciones");
        this.jPanelAccionesCiudad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCiudad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCiudad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCiudad=new ReporteDinamicoJInternalFrame(CiudadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCiudad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCiudad=new ImportacionJInternalFrame(CiudadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCiudad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCiudad = new JButtonMe();
		
		this.jButtonAbrirOrderByCiudad.setText("Orden");
		this.jButtonAbrirOrderByCiudad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCiudad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCiudad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCiudad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCiudad,false,this);
			
			//this.cargarOrderByCiudad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCiudad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCiudad,true,this);
			
			//this.cargarOrderByCiudad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCiudad.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosCiudad.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosCiudad.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosCiudad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCiudad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCiudad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCiudad.setText("Nuevo");
		this.jButtonDuplicarCiudad.setText("Duplicar");
		this.jButtonCopiarCiudad.setText("Copiar");
		this.jButtonVerFormCiudad.setText("Ver");
		this.jButtonNuevoRelacionesCiudad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCiudad.setText("Guardar");
		this.jButtonCerrarCiudad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCiudad,"nuevo_button","Nuevo",this.ciudadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCiudad,"duplicar_button","Duplicar",this.ciudadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCiudad,"copiar_button","Copiar",this.ciudadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCiudad,"ver_form","Ver",this.ciudadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCiudad,"nuevorelaciones_button","Nuevo Rel",this.ciudadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCiudad,"guardarcambiostabla_button","Guardar",this.ciudadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCiudad,"cerrar_button","Salir",this.ciudadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCiudad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCiudad.setToolTipText("Nuevo"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCiudad.setToolTipText("Duplicar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCiudad.setToolTipText("Copiar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCiudad.setToolTipText("Ver"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCiudad.setToolTipText("Nuevo Rel"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCiudad.setToolTipText("Guardar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCiudad.setToolTipText("Salir"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCiudad";
		inputMap = this.jButtonNuevoCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCiudad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCiudad"));
		
		//DUPLICAR
		sMapKey = "DuplicarCiudad";
		inputMap = this.jButtonDuplicarCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCiudad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCiudad"));
		
		//COPIAR
		sMapKey = "CopiarCiudad";
		inputMap = this.jButtonCopiarCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCiudad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCiudad"));
		
		//VEr FORM
		sMapKey = "VerFormCiudad";
		inputMap = this.jButtonVerFormCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCiudad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCiudad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCiudad";
		inputMap = this.jButtonNuevoRelacionesCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCiudad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCiudad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCiudad";
		inputMap = this.jButtonModificarCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCiudad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCiudad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCiudad";
		inputMap = this.jButtonCerrarCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCiudad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCiudad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCiudad";
		inputMap = this.jButtonGuardarCambiosTablaCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCiudad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCiudad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCiudad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCiudad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCiudad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Ciudad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Ciudad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Ciudad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Ciudad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Ciudad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCiudad.setName("jPanelParametrosReportesCiudad"); 
		
		this.jPanelParametrosReportesAccionesCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCiudad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCiudad.setName("jPanelParametrosReportesAccionesCiudad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCiudad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCiudad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCiudad = new JButtonMe();
		this.jButtonRecargarInformacionCiudad.setText("Recargar");
		this.jButtonRecargarInformacionCiudad.setToolTipText("Recargar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCiudad,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCiudad = new JButtonMe();
		this.jButtonProcesarInformacionCiudad.setText("Procesar");
		this.jButtonProcesarInformacionCiudad.setToolTipText("Procesar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCiudad.setVisible(false);
			
		this.jButtonProcesarInformacionCiudad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCiudad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCiudad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCiudad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCiudad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCiudad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCiudad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCiudad.setText("TIPO");       
		this.jComboBoxTiposReportesCiudad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCiudad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCiudad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCiudad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCiudad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCiudad.setText("Paginacion");
		this.jComboBoxTiposPaginacionCiudad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCiudad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCiudad.setText("Accion");
		this.jComboBoxTiposRelacionesCiudad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCiudad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCiudad.setText("Accion");
		this.jComboBoxTiposAccionesCiudad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCiudad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCiudad.setText("Accion");
		this.jComboBoxTiposSeleccionarCiudad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCiudad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCiudad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCiudad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCiudad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCiudad = new JLabelMe();
		
		this.jLabelAccionesCiudad.setText("Acciones");		
		this.jLabelAccionesCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCiudad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCiudad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCiudad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCiudad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCiudad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCiudad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCiudad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCiudad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCiudad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCiudad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCiudad.setText("Graf.");
		this.jCheckBoxConGraficoReporteCiudad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCiudad = new JButtonMe();
		//this.jButtonAnterioresCiudad.setText("<<");
        this.jButtonAnterioresCiudad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCiudad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCiudad = new JButtonMe();
		//this.jButtonSiguientesCiudad.setText(">>");
        this.jButtonSiguientesCiudad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCiudad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCiudad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCiudad.setText("Nue");
        this.jButtonNuevoGuardarCambiosCiudad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCiudad,"nuevoguardarcambios_button","Nue",this.ciudadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCiudad";
		inputMap = this.jButtonNuevoGuardarCambiosCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCiudad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCiudad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCiudad";
		inputMap = this.jButtonRecargarInformacionCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCiudad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCiudad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCiudad";
		inputMap = this.jButtonSiguientesCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCiudad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCiudad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCiudad";
		inputMap = this.jButtonAnterioresCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCiudad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCiudad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCiudad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCiudad.setMinimumSize(new Dimension(this.getWidth(),CiudadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CiudadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCiudad.setMaximumSize(new Dimension(this.getWidth(),CiudadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CiudadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCiudad.setPreferredSize(new Dimension(this.getWidth(),CiudadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CiudadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCiudad = new GridBagLayout();

			this.jPanelPaginacionCiudad.setLayout(gridaBagLayoutPaginacionCiudad);						
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.gridy = 0;
			this.gridBagConstraintsCiudad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCiudad.add(this.jButtonAnterioresCiudad, this.gridBagConstraintsCiudad);
					
						
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCiudad.gridy = 0;
			
			this.jPanelPaginacionCiudad.add(this.jButtonNuevoGuardarCambiosCiudad, this.gridBagConstraintsCiudad);
						
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCiudad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCiudad.gridy = 0;
			this.jPanelPaginacionCiudad.add(this.jButtonSiguientesCiudad, this.gridBagConstraintsCiudad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.gridy = 1;
			this.gridBagConstraintsCiudad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCiudad.add(this.jButtonNuevoCiudad, this.gridBagConstraintsCiudad);
						
			
			
			if(!this.ciudadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCiudad = new GridBagConstraints();
				this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCiudad.gridy = 1;
				this.gridBagConstraintsCiudad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCiudad.add(this.jButtonGuardarCambiosTablaCiudad, this.gridBagConstraintsCiudad);
			}
			
			
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.gridy = 1;
			this.gridBagConstraintsCiudad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCiudad.add(this.jButtonDuplicarCiudad, this.gridBagConstraintsCiudad);
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.gridy = 1;
			this.gridBagConstraintsCiudad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCiudad.add(this.jButtonCopiarCiudad, this.gridBagConstraintsCiudad);
		
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.gridy = 1;
			this.gridBagConstraintsCiudad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCiudad.add(this.jButtonVerFormCiudad, this.gridBagConstraintsCiudad);
		
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.gridy = 1;
			this.gridBagConstraintsCiudad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCiudad.add(this.jButtonCerrarCiudad, this.gridBagConstraintsCiudad);
		
		
		
		this.jButtonRecargarInformacionCiudad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCiudad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCiudad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCiudad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCiudad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCiudad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCiudad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCiudad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCiudad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCiudad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCiudad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCiudad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCiudad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCiudad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCiudad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCiudad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCiudad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCiudad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCiudad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCiudad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCiudad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCiudad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCiudad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCiudad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCiudad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCiudad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCiudad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCiudad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCiudad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCiudad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCiudad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCiudad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCiudad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCiudad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCiudad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCiudad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCiudad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCiudad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCiudad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCiudad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Ciudad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Ciudad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Ciudad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Ciudad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCiudad.setLayout(gridaBagParametrosReportesCiudad);
			this.jPanelParametrosReportesAccionesCiudad.setLayout(gridaBagParametrosReportesAccionesCiudad);
			
			
			this.jPanelParametrosAuxiliar1Ciudad.setLayout(gridaBagParametrosAuxiliar1Ciudad);
			this.jPanelParametrosAuxiliar2Ciudad.setLayout(gridaBagParametrosAuxiliar2Ciudad);
			this.jPanelParametrosAuxiliar3Ciudad.setLayout(gridaBagParametrosAuxiliar3Ciudad);
			this.jPanelParametrosAuxiliar4Ciudad.setLayout(gridaBagParametrosAuxiliar4Ciudad);
			//this.jPanelParametrosAuxiliar5Ciudad.setLayout(gridaBagParametrosAuxiliar2Ciudad);			
			
			
			
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCiudad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCiudad.add(this.jButtonRecargarInformacionCiudad, this.gridBagConstraintsCiudad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCiudad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCiudad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Ciudad.add(this.jComboBoxTiposPaginacionCiudad, this.gridBagConstraintsCiudad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCiudad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCiudad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Ciudad.add(this.jCheckBoxConAltoMaximoTablaCiudad, this.gridBagConstraintsCiudad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCiudad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCiudad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Ciudad.add(this.jComboBoxTiposArchivosReportesCiudad, this.gridBagConstraintsCiudad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCiudad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCiudad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCiudad.add(this.jPanelParametrosAuxiliar1Ciudad, this.gridBagConstraintsCiudad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCiudad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Ciudad.add(this.jComboBoxTiposReportesCiudad, this.gridBagConstraintsCiudad);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCiudad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCiudad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCiudad.add(this.jPanelParametrosAuxiliar4Ciudad, this.gridBagConstraintsCiudad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCiudad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCiudad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCiudad.add(this.jComboBoxTiposReportesCiudad, this.gridBagConstraintsCiudad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCiudad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCiudad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCiudad.add(this.jCheckBoxGenerarReporteCiudad, this.gridBagConstraintsCiudad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCiudad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCiudad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCiudad.add(this.jPanelParametrosAuxiliar2Ciudad, this.gridBagConstraintsCiudad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCiudad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCiudad.add(this.jLabelAccionesCiudad, this.gridBagConstraintsCiudad);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCiudad = new GridBagConstraints();
				this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCiudad.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCiudad.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCiudad.add(this.jButtonAbrirOrderByCiudad, this.gridBagConstraintsCiudad);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCiudad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCiudad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCiudad.add(this.jComboBoxTiposSeleccionarCiudad, this.gridBagConstraintsCiudad);			
			
			
			/*
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCiudad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCiudad.add(this.jCheckBoxSeleccionarTodosCiudad, this.gridBagConstraintsCiudad);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCiudad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Ciudad.add(this.jCheckBoxSeleccionarTodosCiudad, this.gridBagConstraintsCiudad);															
				
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCiudad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Ciudad.add(this.jCheckBoxSeleccionadosCiudad, this.gridBagConstraintsCiudad);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCiudad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCiudad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCiudad.add(this.jPanelParametrosAuxiliar3Ciudad, this.gridBagConstraintsCiudad);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCiudad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCiudad.add(this.jComboBoxTiposAccionesCiudad, this.gridBagConstraintsCiudad);
	
				
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCiudad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCiudad.add(this.jTextFieldValorCampoGeneralCiudad, this.gridBagConstraintsCiudad);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCiudad = new GridBagLayout();

			this.jScrollPanelDatosCiudad.setLayout(gridaBagLayoutDatosCiudad);
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.gridy = 0;
			this.gridBagConstraintsCiudad.gridx = 0;
			
			this.jScrollPanelDatosCiudad.add(this.jTableDatosCiudad, this.gridBagConstraintsCiudad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCiudad.setViewportView(this.jTableDatosCiudad);
		this.jTableDatosCiudad.setFillsViewportHeight(true);
		this.jTableDatosCiudad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCiudad= new GridBagLayout();
		this.jPanelAccionesCiudad.setLayout(gridaBagLayoutAccionesCiudad);
		
		
		/*	
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCiudad.gridy = 0;
		this.gridBagConstraintsCiudad.gridx = 0;
			
		this.jPanelAccionesCiudad.add(this.jButtonNuevoCiudad, this.gridBagConstraintsCiudad);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreCiudad= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreCiudad.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCiudad.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCiudad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreCiudad.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreCiudad.setLayout(gridaBagLayoutBusquedaPorNombreCiudad);

		gridBagConstraintsCiudad = new GridBagConstraints();
		gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCiudad.gridy = 0;
		gridBagConstraintsCiudad.gridx = 0;
		jPanelBusquedaPorNombreCiudad.add(jLabelnombreBusquedaPorNombreCiudad, gridBagConstraintsCiudad);

		gridBagConstraintsCiudad = new GridBagConstraints();
		gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCiudad.gridy = 0;
		gridBagConstraintsCiudad.gridx = 1;
		jPanelBusquedaPorNombreCiudad.add(jTextAreanombreBusquedaPorNombreCiudad, gridBagConstraintsCiudad);

		gridBagConstraintsCiudad = new GridBagConstraints();
		gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCiudad.gridy = 1;
		gridBagConstraintsCiudad.gridx =1;
		jPanelBusquedaPorNombreCiudad.add(jButtonBusquedaPorNombreCiudad, gridBagConstraintsCiudad);

		jTabbedPaneBusquedasCiudad.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreCiudad);
		jTabbedPaneBusquedasCiudad.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdPaisCiudad= new GridBagLayout();
		gridaBagLayoutFK_IdPaisCiudad.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisCiudad.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisCiudad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisCiudad.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisCiudad.setLayout(gridaBagLayoutFK_IdPaisCiudad);

		gridBagConstraintsCiudad = new GridBagConstraints();
		gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCiudad.gridy = 0;
		gridBagConstraintsCiudad.gridx = 0;
		jPanelFK_IdPaisCiudad.add(jLabelid_paisFK_IdPaisCiudad, gridBagConstraintsCiudad);

		gridBagConstraintsCiudad = new GridBagConstraints();
		gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCiudad.gridy = 0;
		gridBagConstraintsCiudad.gridx = 1;
		jPanelFK_IdPaisCiudad.add(jComboBoxid_paisFK_IdPaisCiudad, gridBagConstraintsCiudad);

		gridBagConstraintsCiudad = new GridBagConstraints();
		gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCiudad.gridy = 1;
		gridBagConstraintsCiudad.gridx =1;
		jPanelFK_IdPaisCiudad.add(jButtonFK_IdPaisCiudad, gridBagConstraintsCiudad);

		jTabbedPaneBusquedasCiudad.addTab("2.-Por Pais ", jPanelFK_IdPaisCiudad);
		jTabbedPaneBusquedasCiudad.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCiudad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCiudad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ciudadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCiudad = new GridBagConstraints();						
			this.gridBagConstraintsCiudad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCiudad.gridx = 0;		
			//this.gridBagConstraintsCiudad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCiudad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCiudad, this.gridBagConstraintsCiudad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCiudad.gridx = 0;		
		//this.gridBagConstraintsCiudad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCiudad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCiudad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCiudad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCiudad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCiudad.gridx = 0;		
			this.gridBagConstraintsCiudad.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCiudad.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCiudad, this.gridBagConstraintsCiudad);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCiudad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCiudad, this.gridBagConstraintsCiudad);								
		
		
		/*
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCiudad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCiudad, this.gridBagConstraintsCiudad);
		*/		
		
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCiudad.gridx =0;
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCiudad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCiudad, this.gridBagConstraintsCiudad);
				
		
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCiudad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCiudad, this.gridBagConstraintsCiudad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(CiudadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCiudad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCiudad = new GridBagLayout();
			this.jPanelBusquedasParametrosCiudad.setLayout(gridaBagLayoutBusquedasParametrosCiudad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCiudad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCiudad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCiudad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCiudad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCiudad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCiudad, this.gridBagConstraintsCiudad);
			
			
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCiudad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCiudad, this.gridBagConstraintsCiudad);
		
			
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCiudad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCiudad, this.gridBagConstraintsCiudad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCiudad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCiudad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCiudad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCiudad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCiudad.setName("jPanelReporteDinamicoCiudad"); 
		
		this.jPanelReporteDinamicoCiudad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCiudad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCiudad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCiudad.setLayout(gridaBagLayoutReporteDinamicoCiudad);
		
		
		this.jInternalFrameReporteDinamicoCiudad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCiudad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCiudad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCiudad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCiudad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCiudad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCiudad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCiudad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCiudad.setResizable(true);
	    this.jInternalFrameReporteDinamicoCiudad.setClosable(true);
	    this.jInternalFrameReporteDinamicoCiudad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCiudad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCiudad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCiudad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ciudades"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCiudad = new JLabelMe();

		this.jLabelColumnasSelectReporteCiudad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCiudad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCiudad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCiudad.add(this.jLabelColumnasSelectReporteCiudad, this.gridBagConstraintsCiudad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCiudad = new JList<Reporte>();
		this.jListColumnasSelectReporteCiudad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCiudad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCiudad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCiudad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCiudad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCiudad=new JScrollPane(this.jListColumnasSelectReporteCiudad);
			
			this.jScrollColumnasSelectReporteCiudad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCiudad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCiudad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCiudad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCiudad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCiudad.add(this.jListColumnasSelectReporteCiudad, this.gridBagConstraintsCiudad);
		this.jPanelReporteDinamicoCiudad.add(this.jScrollColumnasSelectReporteCiudad, this.gridBagConstraintsCiudad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCiudad = new JLabelMe();

		this.jLabelRelacionesSelectReporteCiudad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCiudad = new JList<Reporte>();
		this.jListRelacionesSelectReporteCiudad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCiudad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCiudad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCiudad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCiudad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCiudad=new JScrollPane(this.jListRelacionesSelectReporteCiudad);
			
			this.jScrollRelacionesSelectReporteCiudad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCiudad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCiudad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoCiudad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCiudad = new JComboBoxMe();
		this.jListColumnasValoresGraficoCiudad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCiudad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCiudad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCiudad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCiudad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCiudad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCiudad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCiudad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCiudad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCiudad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCiudad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCiudad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCiudad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCiudad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCiudad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCiudad.add(this.jLabelGenerarExcelReporteDinamicoCiudad, this.gridBagConstraintsCiudad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCiudad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCiudad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCiudad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCiudad.setToolTipText("Generar EXCEL"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCiudad = new GridBagConstraints();
		//this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCiudad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCiudad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCiudad.add(this.jButtonGenerarExcelReporteDinamicoCiudad, this.gridBagConstraintsCiudad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCiudad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCiudad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCiudad.add(this.jComboBoxTiposReportesDinamicoCiudad, this.gridBagConstraintsCiudad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCiudad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCiudad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCiudad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCiudad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCiudad.add(this.jLabelTiposArchivoReporteDinamicoCiudad, this.gridBagConstraintsCiudad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCiudad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCiudad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCiudad.add(this.jComboBoxTiposArchivosReportesDinamicoCiudad, this.gridBagConstraintsCiudad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCiudad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCiudad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCiudad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCiudad.setToolTipText("Generar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCiudad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCiudad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCiudad.add(this.jButtonGenerarReporteDinamicoCiudad, this.gridBagConstraintsCiudad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCiudad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCiudad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCiudad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCiudad.setToolTipText("Cancelar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCiudad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCiudad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCiudad.add(this.jButtonCerrarReporteDinamicoCiudad, this.gridBagConstraintsCiudad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCiudad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCiudad= new JScrollPane(jPanelReporteDinamicoCiudad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCiudad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCiudad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCiudad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ciudades"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCiudad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCiudad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCiudad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCiudad);
		this.jInternalFrameReporteDinamicoCiudad.getContentPane().add(this.jScrollPanelReporteDinamicoCiudad, this.gridBagConstraintsCiudad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCiudad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCiudad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCiudad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCiudad.setName("jPanelImportacionCiudad"); 
		
		this.jPanelImportacionCiudad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCiudad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCiudad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCiudad.setLayout(gridaBagLayoutImportacionCiudad);
		
		
		this.jInternalFrameImportacionCiudad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCiudad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCiudad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCiudad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCiudad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCiudad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCiudad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCiudad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCiudad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCiudad.setResizable(true);
	    this.jInternalFrameImportacionCiudad.setClosable(true);
	    this.jInternalFrameImportacionCiudad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCiudad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCiudad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCiudad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCiudad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCiudad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCiudad.setResizable(true);
	    this.jInternalFrameImportacionCiudad.setClosable(true);
	    this.jInternalFrameImportacionCiudad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCiudad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCiudad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCiudad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ciudades"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCiudad = new JLabelMe();

		this.jLabelArchivoImportacionCiudad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCiudad.gridy = iPosYImportacion;		
		this.gridBagConstraintsCiudad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCiudad.add(this.jLabelArchivoImportacionCiudad, this.gridBagConstraintsCiudad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCiudad = new JFileChooser();		
		this.jFileChooserImportacionCiudad.setToolTipText("ESCOGER ARCHIVO"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCiudad = new JButtonMe();
		this.jButtonAbrirImportacionCiudad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCiudad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCiudad.setToolTipText("Generar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCiudad.gridy = iPosYImportacion;
		this.gridBagConstraintsCiudad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCiudad.add(this.jButtonAbrirImportacionCiudad, this.gridBagConstraintsCiudad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCiudad = new JLabelMe();

		this.jLabelPathArchivoImportacionCiudad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCiudad.gridy = iPosYImportacion;		
		this.gridBagConstraintsCiudad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCiudad.add(this.jLabelPathArchivoImportacionCiudad, this.gridBagConstraintsCiudad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCiudad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCiudad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCiudad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCiudad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCiudad.gridy = iPosYImportacion;
		this.gridBagConstraintsCiudad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCiudad.add(this.jTextFieldPathArchivoImportacionCiudad, this.gridBagConstraintsCiudad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCiudad = new JButtonMe();
		this.jButtonGenerarImportacionCiudad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCiudad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCiudad.setToolTipText("Generar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCiudad.gridy = iPosYImportacion;
		this.gridBagConstraintsCiudad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCiudad.add(this.jButtonGenerarImportacionCiudad, this.gridBagConstraintsCiudad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCiudad = new JButtonMe();
		this.jButtonCerrarImportacionCiudad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCiudad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCiudad.setToolTipText("Cancelar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCiudad.gridy = iPosYImportacion;
		this.gridBagConstraintsCiudad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCiudad.add(this.jButtonCerrarImportacionCiudad, this.gridBagConstraintsCiudad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCiudad = new GridBagLayout();
		
		this.jScrollPanelImportacionCiudad= new JScrollPane(jPanelImportacionCiudad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy =iPosYImportacion;
		this.gridBagConstraintsCiudad.gridx =iPosXImportacion;
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCiudad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCiudad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCiudad);
		this.jInternalFrameImportacionCiudad.getContentPane().add(this.jScrollPanelImportacionCiudad, this.gridBagConstraintsCiudad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCiudad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCiudad = new JButtonMe();
			this.jButtonAbrirOrderByCiudad.setText("Orden");
			this.jButtonAbrirOrderByCiudad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCiudad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCiudad";
			inputMap = this.jButtonAbrirOrderByCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCiudad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCiudad"));
		
		
			GridBagLayout gridaBagLayoutOrderByCiudad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCiudad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCiudad.setName("jPanelOrderByCiudad"); 
			
			this.jPanelOrderByCiudad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCiudad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCiudad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCiudad.setLayout(gridaBagLayoutOrderByCiudad);
			
			
			this.jTableDatosCiudadOrderBy = new JTableMe();        
			this.jTableDatosCiudadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCiudadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCiudadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCiudadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCiudadOrderBy.setViewportView(this.jTableDatosCiudadOrderBy);
			this.jTableDatosCiudadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCiudadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCiudad= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCiudad= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCiudad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCiudad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCiudad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCiudad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCiudad.setTitle("Orden");
			this.jInternalFrameOrderByCiudad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCiudad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCiudad.setResizable(true);
			this.jInternalFrameOrderByCiudad.setClosable(true);
			this.jInternalFrameOrderByCiudad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCiudad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCiudad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCiudad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ciudades"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCiudad.gridx =iPosXOrderBy;
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCiudad.ipady =150;
				
			this.jPanelOrderByCiudad.add(jScrollPanelDatosCiudadOrderBy, this.gridBagConstraintsCiudad);//this.jTableDatosCiudadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCiudad = new JButtonMe();
			this.jButtonCerrarOrderByCiudad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCiudad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCiudad.setToolTipText("Cancelar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCiudad.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCiudad.add(this.jButtonCerrarOrderByCiudad, this.gridBagConstraintsCiudad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCiudad = new GridBagLayout();
			
			this.jScrollPanelOrderByCiudad= new JScrollPane(jPanelOrderByCiudad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.gridy =iPosYOrderBy;
			this.gridBagConstraintsCiudad.gridx =iPosXOrderBy;
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCiudad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCiudad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCiudad);
			
			this.jInternalFrameOrderByCiudad.getContentPane().add(this.jScrollPanelOrderByCiudad, this.gridBagConstraintsCiudad);			
		
		} else {
			this.jButtonAbrirOrderByCiudad = new JButtonMe();
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
		int iWidthTableCalculado=0;//1130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.ciudadSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCiudad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCiudad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCiudad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCiudad.getRowHeight();//CiudadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CiudadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCiudad.isSelected()) {
					iHeightTable=CiudadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CiudadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CiudadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CiudadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCiudad.isSelected()) {
					iHeightTable=CiudadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CiudadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CiudadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCiudad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCiudad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCiudad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCiudad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCiudad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCiudad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCiudad!=null && this.jInternalFrameOrderByCiudad.getjTableDatosOrderBy()!=null) {
			//if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCiudad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCiudad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCiudad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCiudad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCiudad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCiudad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCiudad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCiudad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCiudad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCiudad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=ciudadLogic.getCiudads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ciudads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Ciudad> TraerCiudadBeans(List<Ciudad> ciudads,ArrayList<Classe> classes)throws Exception {
		try {
			for(Ciudad ciudad:ciudads) {
					
				if(!(CiudadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CiudadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ciudad.setsDetalleGeneralEntityReporte(CiudadConstantesFunciones.getCiudadDescripcion(ciudad));
										
						
					
						
					
				} else  {
							
					//ciudad.setsDetalleGeneralEntityReporte(ciudad.getsDetalleGeneralEntityReporte());
										
				}
				
				//ciudadbeans.add(ciudadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ciudads;
    }
	//PARA REPORTES FIN
}
