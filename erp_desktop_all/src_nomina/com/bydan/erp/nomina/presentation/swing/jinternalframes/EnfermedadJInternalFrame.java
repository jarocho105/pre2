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
import com.bydan.erp.nomina.util.EnfermedadConstantesFunciones;

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
public class EnfermedadJInternalFrame extends EnfermedadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEnfermedad;
	
	protected JMenuBar jmenuBarEnfermedad;
	
	protected JMenu jmenuEnfermedad;
	protected JMenu jmenuDatosEnfermedad;
	protected JMenu jmenuArchivoEnfermedad;
	protected JMenu jmenuAccionesEnfermedad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEnfermedad;	
	protected GridBagConstraints gridBagConstraintsEnfermedad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EnfermedadDetalleFormJInternalFrame jInternalFrameDetalleFormEnfermedad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEnfermedad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEnfermedad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoEnfermedadBeanSwingJInternalFrame tipoenfermedadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoenfermedad="";
	
	public EnfermedadSessionBean enfermedadSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoEnfermedadSessionBean tipoenfermedadSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<Enfermedad> enfermedads;		
	public List<Enfermedad> enfermedadsEliminados;	
	public List<Enfermedad> enfermedadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEnfermedad;		
	protected JButton jButtonAbrirOrderByEnfermedad;
	
	
	//protected JPanel jPanelOrderByEnfermedad;
	//public JScrollPane jScrollPanelOrderByEnfermedad;	
	//protected JButton jButtonCerrarOrderByEnfermedad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EnfermedadLogic enfermedadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEnfermedad;
	public JScrollPane jScrollPanelDatosEdicionEnfermedad;
	public JScrollPane jScrollPanelDatosGeneralEnfermedad;
    
	
	
	//public JScrollPane jScrollPanelDatosEnfermedadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEnfermedad;
	//public JScrollPane jScrollPanelImportacionEnfermedad;
	
	
	
	protected JPanel jPanelAccionesEnfermedad;
	
    protected JPanel jPanelPaginacionEnfermedad;
    protected JPanel jPanelParametrosReportesEnfermedad;
	protected JPanel jPanelParametrosReportesAccionesEnfermedad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1Enfermedad;
	protected JPanel jPanelParametrosAuxiliar2Enfermedad;
	protected JPanel jPanelParametrosAuxiliar3Enfermedad;
	protected JPanel jPanelParametrosAuxiliar4Enfermedad;
	//protected JPanel jPanelParametrosAuxiliar5Enfermedad;
	
	
	
	//protected JPanel jPanelReporteDinamicoEnfermedad;
	//protected JPanel jPanelImportacionEnfermedad;
	
	
	public JTable jTableDatosEnfermedad;
	
	
	
	//public JTable jTableDatosEnfermedadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEnfermedad;
	protected JButton jButtonDuplicarEnfermedad;
	protected JButton jButtonCopiarEnfermedad;
	protected JButton jButtonVerFormEnfermedad;
	protected JButton jButtonNuevoRelacionesEnfermedad;
	protected JButton jButtonModificarEnfermedad;
	
    protected JButton jButtonGuardarCambiosTablaEnfermedad;
	protected JButton jButtonCerrarEnfermedad;
	
	
	protected JButton jButtonRecargarInformacionEnfermedad;
	protected JButton jButtonProcesarInformacionEnfermedad;
	
	
	protected JButton jButtonAnterioresEnfermedad;
	protected JButton jButtonSiguientesEnfermedad;
	protected JButton jButtonNuevoGuardarCambiosEnfermedad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEnfermedad;
	//protected JButton jButtonCerrarReporteDinamicoEnfermedad;
	//protected JButton jButtonGenerarExcelReporteDinamicoEnfermedad;	
	
	
	
	//protected JButton jButtonAbrirImportacionEnfermedad;
	//protected JButton jButtonGenerarImportacionEnfermedad;
	//protected JButton jButtonCerrarImportacionEnfermedad;
	//protected JFileChooser jFileChooserImportacionEnfermedad;
	//protected File fileImportacionEnfermedad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEnfermedad;
	protected JButton jButtonDuplicarToolBarEnfermedad;
	protected JButton jButtonNuevoRelacionesToolBarEnfermedad;
	
	
	public JButton jButtonGuardarCambiosToolBarEnfermedad;
	protected JButton jButtonCopiarToolBarEnfermedad;
	protected JButton jButtonVerFormToolBarEnfermedad;
	public JButton jButtonGuardarCambiosTablaToolBarEnfermedad;
	protected JButton jButtonMostrarOcultarTablaToolBarEnfermedad;
	protected JButton jButtonCerrarToolBarEnfermedad;
	
	protected JButton jButtonRecargarInformacionToolBarEnfermedad;
	protected JButton jButtonProcesarInformacionToolBarEnfermedad;
	protected JButton jButtonAnterioresToolBarEnfermedad;
	protected JButton jButtonSiguientesToolBarEnfermedad;
	protected JButton jButtonNuevoGuardarCambiosToolBarEnfermedad;
	protected JButton jButtonAbrirOrderByToolBarEnfermedad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEnfermedad;
	protected JMenuItem jMenuItemDuplicarEnfermedad;
	protected JMenuItem jMenuItemNuevoRelacionesEnfermedad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEnfermedad;
	protected JMenuItem jMenuItemCopiarEnfermedad;
	protected JMenuItem jMenuItemVerFormEnfermedad;
	protected JMenuItem jMenuItemGuardarCambiosTablaEnfermedad;
	protected JMenuItem jMenuItemCerrarEnfermedad;
	protected JMenuItem jMenuItemDetalleCerrarEnfermedad;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEnfermedad;
	protected JMenuItem jMenuItemDetalleMostarOcultarEnfermedad;
	
	protected JMenuItem jMenuItemRecargarInformacionEnfermedad;
	protected JMenuItem jMenuItemProcesarInformacionEnfermedad;
	protected JMenuItem jMenuItemAnterioresEnfermedad;
	protected JMenuItem jMenuItemSiguientesEnfermedad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEnfermedad;
	protected JMenuItem jMenuItemAbrirOrderByEnfermedad;
	protected JMenuItem jMenuItemMostrarOcultarEnfermedad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEnfermedad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEnfermedad;
	protected JCheckBox jCheckBoxSeleccionadosEnfermedad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEnfermedad;
	protected JCheckBox jCheckBoxConGraficoReporteEnfermedad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEnfermedad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEnfermedad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEnfermedad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEnfermedad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEnfermedad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEnfermedad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEnfermedad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEnfermedad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEnfermedad;
	protected JTextField jTextFieldValorCampoGeneralEnfermedad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEnfermedad;
	//public JList<Reporte> jListColumnasSelectReporteEnfermedad;
	//public JScrollPane jScrollColumnasSelectReporteEnfermedad;
	
	//public JLabel jLabelRelacionesSelectReporteEnfermedad;
	//public JList<Reporte> jListRelacionesSelectReporteEnfermedad;
	//public JScrollPane jScrollRelacionesSelectReporteEnfermedad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEnfermedad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEnfermedad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEnfermedad;
	//public JLabel jLabelTiposArchivoReporteDinamicoEnfermedad;
	
		
	//public JLabel jLabelArchivoImportacionEnfermedad;	
	//public JLabel jLabelPathArchivoImportacionEnfermedad;
	//protected JTextField jTextFieldPathArchivoImportacionEnfermedad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEnfermedad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEnfermedad;
	
	//public JLabel jLabelColumnaCategoriaValorEnfermedad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEnfermedad;
	
	//public JLabel jLabelColumnasValoresGraficoEnfermedad;
	//public JList<Reporte> jListColumnasValoresGraficoEnfermedad;
	//public JScrollPane jScrollColumnasValoresGraficoEnfermedad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEnfermedad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEnfermedad;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEnfermedad;
	public JPanel jPanelFK_IdTipoEnfermedadEnfermedad;
	public JButton jButtonFK_IdTipoEnfermedadEnfermedad;
	
	public JPanel jPanelid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad;
	public JLabel jLabelid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad;
	public JButton jButtonid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad= new JButtonMe();
	public JButton jButtonid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedadUpdate= new JButtonMe();
	public JButton jButtonid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedadBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EnfermedadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("Enfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EnfermedadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Enfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EnfermedadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Enfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EnfermedadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Enfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEnfermedad)	{
		this.jButtonRecargarInformacionEnfermedad = jButtonRecargarInformacionEnfermedad;
	}
	
	public JButton getjButtonProcesarInformacionEnfermedad() {
		return this.jButtonProcesarInformacionEnfermedad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEnfermedad)	{
		this.jButtonProcesarInformacionEnfermedad = jButtonProcesarInformacionEnfermedad;
	}
	
	
	public JButton getjButtonRecargarInformacionEnfermedad() {
		return this.jButtonRecargarInformacionEnfermedad;
	}
	
	
	public List<Enfermedad> getenfermedads() {
		return this.enfermedads;
	}

	public void setenfermedads(List<Enfermedad> enfermedads) {
		this.enfermedads = enfermedads;
	}
	
	public List<Enfermedad> getenfermedadsAux() {
		return this.enfermedadsAux;
	}

	public void setenfermedadsAux(List<Enfermedad> enfermedadsAux) {
		this.enfermedadsAux = enfermedadsAux;
	}
	
	public List<Enfermedad> getenfermedadsEliminados() {
		return this.enfermedadsEliminados;
	}

	public void setEnfermedadsEliminados(List<Enfermedad> enfermedadsEliminados) {
		this.enfermedadsEliminados = enfermedadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEnfermedad() {
		return jComboBoxTiposSeleccionarEnfermedad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEnfermedad(
			JComboBox jComboBoxTiposSeleccionarEnfermedad) {
		this.jComboBoxTiposSeleccionarEnfermedad = jComboBoxTiposSeleccionarEnfermedad;
	}
	
	public void setBorderResaltarTiposSeleccionarEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEnfermedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEnfermedad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEnfermedad() {
		return jTextFieldValorCampoGeneralEnfermedad;
	}

	public void setjTextFieldValorCampoGeneralEnfermedad(
			JTextField jTextFieldValorCampoGeneralEnfermedad) {
		this.jTextFieldValorCampoGeneralEnfermedad = jTextFieldValorCampoGeneralEnfermedad;
	}

	public void setBorderResaltarValorCampoGeneralEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEnfermedad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEnfermedad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEnfermedad() {
		return this.jCheckBoxSeleccionarTodosEnfermedad;
	}

	public void setjCheckBoxSeleccionarTodosEnfermedad(
			JCheckBox jCheckBoxSeleccionarTodosEnfermedad) {
		this.jCheckBoxSeleccionarTodosEnfermedad = jCheckBoxSeleccionarTodosEnfermedad;
	}

	public void setBorderResaltarSeleccionarTodosEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEnfermedad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEnfermedad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEnfermedad() {
		return this.jCheckBoxSeleccionadosEnfermedad;
	}

	public void setjCheckBoxSeleccionadosEnfermedad(
			JCheckBox jCheckBoxSeleccionadosEnfermedad) {
		this.jCheckBoxSeleccionadosEnfermedad = jCheckBoxSeleccionadosEnfermedad;
	}
	
	public void setBorderResaltarSeleccionadosEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEnfermedad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEnfermedad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEnfermedad() {
		return this.jComboBoxTiposArchivosReportesEnfermedad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEnfermedad(
			JComboBox jComboBoxTiposArchivosReportesEnfermedad) {
		this.jComboBoxTiposArchivosReportesEnfermedad = jComboBoxTiposArchivosReportesEnfermedad;
	}

	public void setBorderResaltarTiposArchivosReportesEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEnfermedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEnfermedad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEnfermedad() {
		return this.jComboBoxTiposReportesEnfermedad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEnfermedad(
			JComboBox jComboBoxTiposReportesEnfermedad) {
		this.jComboBoxTiposReportesEnfermedad = jComboBoxTiposReportesEnfermedad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEnfermedad() {
	//	return jComboBoxTiposReportesDinamicoEnfermedad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEnfermedad(
	//		JComboBox jComboBoxTiposReportesDinamicoEnfermedad) {
	//	this.jComboBoxTiposReportesDinamicoEnfermedad = jComboBoxTiposReportesDinamicoEnfermedad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEnfermedad() {
	//	return jComboBoxTiposArchivosReportesDinamicoEnfermedad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEnfermedad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEnfermedad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEnfermedad = jComboBoxTiposArchivosReportesDinamicoEnfermedad;
	//}
	
	public void setBorderResaltarTiposReportesEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEnfermedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEnfermedad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEnfermedad() {
		return this.jComboBoxTiposGraficosReportesEnfermedad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEnfermedad(
			JComboBox jComboBoxTiposGraficosReportesEnfermedad) {
		this.jComboBoxTiposGraficosReportesEnfermedad = jComboBoxTiposGraficosReportesEnfermedad;
	}
	
	public void setBorderResaltarTiposGraficosReportesEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEnfermedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEnfermedad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEnfermedad() {
		return this.jComboBoxTiposPaginacionEnfermedad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEnfermedad(
			JComboBox jComboBoxTiposPaginacionEnfermedad) {
		this.jComboBoxTiposPaginacionEnfermedad = jComboBoxTiposPaginacionEnfermedad;
	}
	
	public void setBorderResaltarTiposPaginacionEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEnfermedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEnfermedad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEnfermedad() {
		return this.jComboBoxTiposRelacionesEnfermedad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEnfermedad() {
		return this.jComboBoxTiposAccionesEnfermedad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEnfermedad(
			JComboBox jComboBoxTiposRelacionesEnfermedad) {
		this.jComboBoxTiposRelacionesEnfermedad = jComboBoxTiposRelacionesEnfermedad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEnfermedad(
			JComboBox jComboBoxTiposAccionesEnfermedad) {
		this.jComboBoxTiposAccionesEnfermedad = jComboBoxTiposAccionesEnfermedad;
	}
	
	public void setBorderResaltarTiposRelacionesEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEnfermedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEnfermedad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEnfermedad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEnfermedad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEnfermedad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEnfermedad() {
	//	return jCheckBoxConGraficoDinamicoEnfermedad;
	//}

	//public void setjCheckBoxConGraficoDinamicoEnfermedad(
	//		JCheckBox jCheckBoxConGraficoDinamicoEnfermedad) {
	//	this.jCheckBoxConGraficoDinamicoEnfermedad = jCheckBoxConGraficoDinamicoEnfermedad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEnfermedad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEnfermedad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEnfermedad .setBorder(borderResaltar);		
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
		this.enfermedadSessionBean=new EnfermedadSessionBean();
		
		this.enfermedadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.enfermedadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.enfermedadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EnfermedadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Enfermedad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
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
		
		EnfermedadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("Enfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEnfermedad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEnfermedad,this.jTtoolBarEnfermedad,
							"nuevo","nuevo","Nuevo"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEnfermedad,this.jTtoolBarEnfermedad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEnfermedad,this.jTtoolBarEnfermedad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEnfermedad,this.jTtoolBarEnfermedad,
							"duplicar","duplicar","Duplicar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEnfermedad,this.jTtoolBarEnfermedad,
							"copiar","copiar","Copiar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEnfermedad,this.jTtoolBarEnfermedad,
							"ver_form","ver_form","Ver"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEnfermedad,this.jTtoolBarEnfermedad,
							"recargar","recargar","Recargar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEnfermedad,this.jTtoolBarEnfermedad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEnfermedad,this.jTtoolBarEnfermedad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEnfermedad,this.jTtoolBarEnfermedad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEnfermedad,this.jTtoolBarEnfermedad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEnfermedad,this.jTtoolBarEnfermedad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEnfermedad,this.jTtoolBarEnfermedad,
							"cerrar","cerrar","Salir"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEnfermedad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEnfermedad;
			
				this.jButtonProcesarInformacionToolBarEnfermedad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEnfermedad;
				
		//protected JButton jButtonModificarToolBarEnfermedad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEnfermedad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEnfermedad=new JMenuMe("General");
		this.jmenuArchivoEnfermedad=new JMenuMe("Archivo");
		this.jmenuAccionesEnfermedad=new JMenuMe("Acciones");
		this.jmenuDatosEnfermedad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEnfermedad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEnfermedad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEnfermedad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEnfermedad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEnfermedad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEnfermedad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEnfermedad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEnfermedad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEnfermedad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEnfermedad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEnfermedad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEnfermedad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEnfermedad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEnfermedad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEnfermedad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEnfermedad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEnfermedad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEnfermedad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEnfermedad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEnfermedad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEnfermedad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEnfermedad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEnfermedad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEnfermedad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEnfermedad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEnfermedad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEnfermedad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEnfermedad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEnfermedad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEnfermedad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEnfermedad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEnfermedad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEnfermedad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEnfermedad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEnfermedad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEnfermedad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEnfermedad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEnfermedad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEnfermedad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEnfermedad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEnfermedad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEnfermedad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEnfermedad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEnfermedad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEnfermedad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEnfermedad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEnfermedad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEnfermedad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEnfermedad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEnfermedad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEnfermedad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEnfermedad.add(this.jMenuItemCerrarEnfermedad);
			
			this.jmenuAccionesEnfermedad.add(this.jMenuItemNuevoEnfermedad);
			this.jmenuAccionesEnfermedad.add(this.jMenuItemNuevoGuardarCambiosEnfermedad);
			this.jmenuAccionesEnfermedad.add(this.jMenuItemNuevoRelacionesEnfermedad);
			this.jmenuAccionesEnfermedad.add(this.jMenuItemGuardarCambiosTablaEnfermedad);		
			this.jmenuAccionesEnfermedad.add(this.jMenuItemDuplicarEnfermedad);		
			this.jmenuAccionesEnfermedad.add(this.jMenuItemCopiarEnfermedad);		
			this.jmenuAccionesEnfermedad.add(this.jMenuItemVerFormEnfermedad);		
			
			this.jmenuDatosEnfermedad.add(this.jMenuItemRecargarInformacionEnfermedad);				
			this.jmenuDatosEnfermedad.add(this.jMenuItemAnterioresEnfermedad);				
			this.jmenuDatosEnfermedad.add(this.jMenuItemSiguientesEnfermedad);				
			this.jmenuDatosEnfermedad.add(this.jMenuItemAbrirOrderByEnfermedad);				
			this.jmenuDatosEnfermedad.add(this.jMenuItemMostrarOcultarEnfermedad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEnfermedad.add(this.jMenuItemGuardarCambiosEnfermedad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEnfermedad.add(this.jmenuArchivoEnfermedad);		
			this.jmenuBarEnfermedad.add(this.jmenuAccionesEnfermedad);		
			this.jmenuBarEnfermedad.add(this.jmenuDatosEnfermedad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEnfermedad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEnfermedad() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoEnfermedadEnfermedad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoEnfermedadEnfermedad.setToolTipText("Buscar Por Tipo Enfermedad ");
		this.jButtonFK_IdTipoEnfermedadEnfermedad= new JButtonMe();
		this.jButtonFK_IdTipoEnfermedadEnfermedad.setText("Buscar");
		this.jButtonFK_IdTipoEnfermedadEnfermedad.setToolTipText("Buscar Por Tipo Enfermedad ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoEnfermedadEnfermedad,"buscar_button","Buscar Por Tipo Enfermedad ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoEnfermedadEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad = new JLabelMe();
		jLabelid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.setText("Tipo Enfermedad :");
		jLabelid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.setToolTipText("Tipo Enfermedad");
		jLabelid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad= new JComboBoxMe();
		jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasEnfermedad=new JTabbedPane();


		this.jTabbedPaneBusquedasEnfermedad.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEnfermedad.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEnfermedad.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEnfermedad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEnfermedad,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEnfermedad = new EnfermedadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Enfermedad DATOS");
			this.jInternalFrameDetalleFormEnfermedad = new EnfermedadDetalleFormJInternalFrame(jDesktopPane,this.enfermedadSessionBean.getConGuardarRelaciones(),this.enfermedadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEnfermedad = null;//new EnfermedadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEnfermedad= new GridBagLayout();
		
		
		this.jTableDatosEnfermedad = new JTableMe();      
		
		String sToolTipEnfermedad="";
		sToolTipEnfermedad=EnfermedadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEnfermedad+="(Nomina.Enfermedad)";
		}
		
		if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
			sToolTipEnfermedad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEnfermedad.setToolTipText(sToolTipEnfermedad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEnfermedad);
		this.jTableDatosEnfermedad.setAutoCreateRowSorter(true);
		this.jTableDatosEnfermedad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEnfermedad.setRowSelectionAllowed(true);
		this.jTableDatosEnfermedad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEnfermedad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEnfermedad = new JButtonMe();
		this.jButtonDuplicarEnfermedad = new JButtonMe();
		this.jButtonCopiarEnfermedad = new JButtonMe();
		this.jButtonVerFormEnfermedad = new JButtonMe();
		this.jButtonNuevoRelacionesEnfermedad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEnfermedad = new JButtonMe();
		this.jButtonCerrarEnfermedad = new JButtonMe();
		
		this.jScrollPanelDatosEnfermedad = new JScrollPane();   
        this.jScrollPanelDatosGeneralEnfermedad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Enfermedad";
		
		if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Enfermedades" + this.sPath));
		} else {
			this.jScrollPanelDatosEnfermedad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEnfermedad.setToolTipText("Acciones");
        this.jPanelAccionesEnfermedad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEnfermedad=new ReporteDinamicoJInternalFrame(EnfermedadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEnfermedad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEnfermedad=new ImportacionJInternalFrame(EnfermedadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEnfermedad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEnfermedad = new JButtonMe();
		
		this.jButtonAbrirOrderByEnfermedad.setText("Orden");
		this.jButtonAbrirOrderByEnfermedad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEnfermedad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEnfermedad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEnfermedad,false,this);
			
			//this.cargarOrderByEnfermedad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEnfermedad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEnfermedad,true,this);
			
			//this.cargarOrderByEnfermedad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEnfermedad.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosEnfermedad.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosEnfermedad.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosEnfermedad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEnfermedad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEnfermedad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEnfermedad.setText("Nuevo");
		this.jButtonDuplicarEnfermedad.setText("Duplicar");
		this.jButtonCopiarEnfermedad.setText("Copiar");
		this.jButtonVerFormEnfermedad.setText("Ver");
		this.jButtonNuevoRelacionesEnfermedad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEnfermedad.setText("Guardar");
		this.jButtonCerrarEnfermedad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEnfermedad,"nuevo_button","Nuevo",this.enfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEnfermedad,"duplicar_button","Duplicar",this.enfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEnfermedad,"copiar_button","Copiar",this.enfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEnfermedad,"ver_form","Ver",this.enfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEnfermedad,"nuevorelaciones_button","Nuevo Rel",this.enfermedadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEnfermedad,"guardarcambiostabla_button","Guardar",this.enfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEnfermedad,"cerrar_button","Salir",this.enfermedadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEnfermedad.setToolTipText("Nuevo"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEnfermedad.setToolTipText("Duplicar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEnfermedad.setToolTipText("Copiar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEnfermedad.setToolTipText("Ver"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEnfermedad.setToolTipText("Nuevo Rel"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEnfermedad.setToolTipText("Guardar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEnfermedad.setToolTipText("Salir"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEnfermedad";
		inputMap = this.jButtonNuevoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEnfermedad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEnfermedad"));
		
		//DUPLICAR
		sMapKey = "DuplicarEnfermedad";
		inputMap = this.jButtonDuplicarEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEnfermedad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEnfermedad"));
		
		//COPIAR
		sMapKey = "CopiarEnfermedad";
		inputMap = this.jButtonCopiarEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEnfermedad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEnfermedad"));
		
		//VEr FORM
		sMapKey = "VerFormEnfermedad";
		inputMap = this.jButtonVerFormEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEnfermedad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEnfermedad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEnfermedad";
		inputMap = this.jButtonNuevoRelacionesEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEnfermedad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEnfermedad";
		inputMap = this.jButtonModificarEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEnfermedad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEnfermedad";
		inputMap = this.jButtonCerrarEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEnfermedad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEnfermedad";
		inputMap = this.jButtonGuardarCambiosTablaEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEnfermedad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1Enfermedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2Enfermedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3Enfermedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4Enfermedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5Enfermedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEnfermedad.setName("jPanelParametrosReportesEnfermedad"); 
		
		this.jPanelParametrosReportesAccionesEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEnfermedad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEnfermedad.setName("jPanelParametrosReportesAccionesEnfermedad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEnfermedad = new JButtonMe();
		this.jButtonRecargarInformacionEnfermedad.setText("Recargar");
		this.jButtonRecargarInformacionEnfermedad.setToolTipText("Recargar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEnfermedad,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEnfermedad = new JButtonMe();
		this.jButtonProcesarInformacionEnfermedad.setText("Procesar");
		this.jButtonProcesarInformacionEnfermedad.setToolTipText("Procesar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEnfermedad.setVisible(false);
			
		this.jButtonProcesarInformacionEnfermedad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEnfermedad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEnfermedad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEnfermedad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEnfermedad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEnfermedad.setText("TIPO");       
		this.jComboBoxTiposReportesEnfermedad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEnfermedad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEnfermedad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEnfermedad.setText("Paginacion");
		this.jComboBoxTiposPaginacionEnfermedad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEnfermedad.setText("Accion");
		this.jComboBoxTiposRelacionesEnfermedad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEnfermedad.setText("Accion");
		this.jComboBoxTiposAccionesEnfermedad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEnfermedad.setText("Accion");
		this.jComboBoxTiposSeleccionarEnfermedad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEnfermedad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEnfermedad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEnfermedad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEnfermedad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEnfermedad = new JLabelMe();
		
		this.jLabelAccionesEnfermedad.setText("Acciones");		
		this.jLabelAccionesEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEnfermedad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEnfermedad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEnfermedad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEnfermedad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEnfermedad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEnfermedad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEnfermedad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEnfermedad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEnfermedad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEnfermedad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEnfermedad.setText("Graf.");
		this.jCheckBoxConGraficoReporteEnfermedad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEnfermedad = new JButtonMe();
		//this.jButtonAnterioresEnfermedad.setText("<<");
        this.jButtonAnterioresEnfermedad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEnfermedad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEnfermedad = new JButtonMe();
		//this.jButtonSiguientesEnfermedad.setText(">>");
        this.jButtonSiguientesEnfermedad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEnfermedad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEnfermedad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEnfermedad.setText("Nue");
        this.jButtonNuevoGuardarCambiosEnfermedad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEnfermedad,"nuevoguardarcambios_button","Nue",this.enfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEnfermedad";
		inputMap = this.jButtonNuevoGuardarCambiosEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEnfermedad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEnfermedad";
		inputMap = this.jButtonRecargarInformacionEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEnfermedad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEnfermedad";
		inputMap = this.jButtonSiguientesEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEnfermedad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEnfermedad";
		inputMap = this.jButtonAnterioresEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEnfermedad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEnfermedad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEnfermedad.setMinimumSize(new Dimension(this.getWidth(),EnfermedadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EnfermedadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEnfermedad.setMaximumSize(new Dimension(this.getWidth(),EnfermedadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EnfermedadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEnfermedad.setPreferredSize(new Dimension(this.getWidth(),EnfermedadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EnfermedadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEnfermedad = new GridBagLayout();

			this.jPanelPaginacionEnfermedad.setLayout(gridaBagLayoutPaginacionEnfermedad);						
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.gridy = 0;
			this.gridBagConstraintsEnfermedad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEnfermedad.add(this.jButtonAnterioresEnfermedad, this.gridBagConstraintsEnfermedad);
					
						
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEnfermedad.gridy = 0;
			
			this.jPanelPaginacionEnfermedad.add(this.jButtonNuevoGuardarCambiosEnfermedad, this.gridBagConstraintsEnfermedad);
						
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEnfermedad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEnfermedad.gridy = 0;
			this.jPanelPaginacionEnfermedad.add(this.jButtonSiguientesEnfermedad, this.gridBagConstraintsEnfermedad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.gridy = 1;
			this.gridBagConstraintsEnfermedad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEnfermedad.add(this.jButtonNuevoEnfermedad, this.gridBagConstraintsEnfermedad);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsEnfermedad = new GridBagConstraints();
				this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEnfermedad.gridy = 1;
				this.gridBagConstraintsEnfermedad.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionEnfermedad.add(this.jButtonNuevoRelacionesEnfermedad, this.gridBagConstraintsEnfermedad);
			}
			
			
			if(!this.enfermedadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEnfermedad = new GridBagConstraints();
				this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEnfermedad.gridy = 1;
				this.gridBagConstraintsEnfermedad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEnfermedad.add(this.jButtonGuardarCambiosTablaEnfermedad, this.gridBagConstraintsEnfermedad);
			}
			
			
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.gridy = 1;
			this.gridBagConstraintsEnfermedad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEnfermedad.add(this.jButtonDuplicarEnfermedad, this.gridBagConstraintsEnfermedad);
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.gridy = 1;
			this.gridBagConstraintsEnfermedad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEnfermedad.add(this.jButtonCopiarEnfermedad, this.gridBagConstraintsEnfermedad);
		
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.gridy = 1;
			this.gridBagConstraintsEnfermedad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEnfermedad.add(this.jButtonVerFormEnfermedad, this.gridBagConstraintsEnfermedad);
		
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.gridy = 1;
			this.gridBagConstraintsEnfermedad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEnfermedad.add(this.jButtonCerrarEnfermedad, this.gridBagConstraintsEnfermedad);
		
		
		
		this.jButtonRecargarInformacionEnfermedad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEnfermedad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEnfermedad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEnfermedad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEnfermedad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEnfermedad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEnfermedad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEnfermedad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEnfermedad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEnfermedad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEnfermedad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEnfermedad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEnfermedad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEnfermedad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEnfermedad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEnfermedad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEnfermedad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEnfermedad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEnfermedad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEnfermedad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEnfermedad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEnfermedad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEnfermedad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEnfermedad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEnfermedad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEnfermedad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEnfermedad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEnfermedad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEnfermedad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEnfermedad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEnfermedad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEnfermedad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEnfermedad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEnfermedad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEnfermedad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEnfermedad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEnfermedad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEnfermedad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1Enfermedad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2Enfermedad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3Enfermedad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4Enfermedad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEnfermedad.setLayout(gridaBagParametrosReportesEnfermedad);
			this.jPanelParametrosReportesAccionesEnfermedad.setLayout(gridaBagParametrosReportesAccionesEnfermedad);
			
			
			this.jPanelParametrosAuxiliar1Enfermedad.setLayout(gridaBagParametrosAuxiliar1Enfermedad);
			this.jPanelParametrosAuxiliar2Enfermedad.setLayout(gridaBagParametrosAuxiliar2Enfermedad);
			this.jPanelParametrosAuxiliar3Enfermedad.setLayout(gridaBagParametrosAuxiliar3Enfermedad);
			this.jPanelParametrosAuxiliar4Enfermedad.setLayout(gridaBagParametrosAuxiliar4Enfermedad);
			//this.jPanelParametrosAuxiliar5Enfermedad.setLayout(gridaBagParametrosAuxiliar2Enfermedad);			
			
			
			
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEnfermedad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEnfermedad.add(this.jButtonRecargarInformacionEnfermedad, this.gridBagConstraintsEnfermedad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEnfermedad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Enfermedad.add(this.jComboBoxTiposPaginacionEnfermedad, this.gridBagConstraintsEnfermedad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEnfermedad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Enfermedad.add(this.jCheckBoxConAltoMaximoTablaEnfermedad, this.gridBagConstraintsEnfermedad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEnfermedad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1Enfermedad.add(this.jComboBoxTiposArchivosReportesEnfermedad, this.gridBagConstraintsEnfermedad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEnfermedad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEnfermedad.add(this.jPanelParametrosAuxiliar1Enfermedad, this.gridBagConstraintsEnfermedad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEnfermedad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4Enfermedad.add(this.jComboBoxTiposReportesEnfermedad, this.gridBagConstraintsEnfermedad);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEnfermedad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEnfermedad.add(this.jPanelParametrosAuxiliar4Enfermedad, this.gridBagConstraintsEnfermedad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEnfermedad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEnfermedad.add(this.jComboBoxTiposReportesEnfermedad, this.gridBagConstraintsEnfermedad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEnfermedad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEnfermedad.add(this.jCheckBoxGenerarReporteEnfermedad, this.gridBagConstraintsEnfermedad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEnfermedad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEnfermedad.add(this.jPanelParametrosAuxiliar2Enfermedad, this.gridBagConstraintsEnfermedad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEnfermedad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEnfermedad.add(this.jLabelAccionesEnfermedad, this.gridBagConstraintsEnfermedad);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEnfermedad = new GridBagConstraints();
				this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEnfermedad.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEnfermedad.add(this.jButtonAbrirOrderByEnfermedad, this.gridBagConstraintsEnfermedad);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEnfermedad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEnfermedad.add(this.jComboBoxTiposSeleccionarEnfermedad, this.gridBagConstraintsEnfermedad);			
			
			
			/*
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEnfermedad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEnfermedad.add(this.jCheckBoxSeleccionarTodosEnfermedad, this.gridBagConstraintsEnfermedad);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEnfermedad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Enfermedad.add(this.jCheckBoxSeleccionarTodosEnfermedad, this.gridBagConstraintsEnfermedad);															
				
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEnfermedad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3Enfermedad.add(this.jCheckBoxSeleccionadosEnfermedad, this.gridBagConstraintsEnfermedad);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEnfermedad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEnfermedad.add(this.jPanelParametrosAuxiliar3Enfermedad, this.gridBagConstraintsEnfermedad);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEnfermedad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEnfermedad.add(this.jComboBoxTiposRelacionesEnfermedad, this.gridBagConstraintsEnfermedad);
				
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEnfermedad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEnfermedad.add(this.jComboBoxTiposAccionesEnfermedad, this.gridBagConstraintsEnfermedad);
	
				
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEnfermedad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEnfermedad.add(this.jTextFieldValorCampoGeneralEnfermedad, this.gridBagConstraintsEnfermedad);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEnfermedad = new GridBagLayout();

			this.jScrollPanelDatosEnfermedad.setLayout(gridaBagLayoutDatosEnfermedad);
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.gridy = 0;
			this.gridBagConstraintsEnfermedad.gridx = 0;
			
			this.jScrollPanelDatosEnfermedad.add(this.jTableDatosEnfermedad, this.gridBagConstraintsEnfermedad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEnfermedad.setViewportView(this.jTableDatosEnfermedad);
		this.jTableDatosEnfermedad.setFillsViewportHeight(true);
		this.jTableDatosEnfermedad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEnfermedad= new GridBagLayout();
		this.jPanelAccionesEnfermedad.setLayout(gridaBagLayoutAccionesEnfermedad);
		
		
		/*	
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEnfermedad.gridy = 0;
		this.gridBagConstraintsEnfermedad.gridx = 0;
			
		this.jPanelAccionesEnfermedad.add(this.jButtonNuevoEnfermedad, this.gridBagConstraintsEnfermedad);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoEnfermedadEnfermedad= new GridBagLayout();
		gridaBagLayoutFK_IdTipoEnfermedadEnfermedad.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoEnfermedadEnfermedad.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoEnfermedadEnfermedad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoEnfermedadEnfermedad.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoEnfermedadEnfermedad.setLayout(gridaBagLayoutFK_IdTipoEnfermedadEnfermedad);

		gridBagConstraintsEnfermedad = new GridBagConstraints();
		gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEnfermedad.gridy = 0;
		gridBagConstraintsEnfermedad.gridx = 0;
		jPanelFK_IdTipoEnfermedadEnfermedad.add(jLabelid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad, gridBagConstraintsEnfermedad);

		gridBagConstraintsEnfermedad = new GridBagConstraints();
		gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEnfermedad.gridy = 0;
		gridBagConstraintsEnfermedad.gridx = 1;
		jPanelFK_IdTipoEnfermedadEnfermedad.add(jComboBoxid_tipo_enfermedadFK_IdTipoEnfermedadEnfermedad, gridBagConstraintsEnfermedad);

		gridBagConstraintsEnfermedad = new GridBagConstraints();
		gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEnfermedad.gridy = 1;
		gridBagConstraintsEnfermedad.gridx =1;
		jPanelFK_IdTipoEnfermedadEnfermedad.add(jButtonFK_IdTipoEnfermedadEnfermedad, gridBagConstraintsEnfermedad);

		jTabbedPaneBusquedasEnfermedad.addTab("1.-Por Tipo Enfermedad ", jPanelFK_IdTipoEnfermedadEnfermedad);
		jTabbedPaneBusquedasEnfermedad.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEnfermedad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEnfermedad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.enfermedadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();						
			this.gridBagConstraintsEnfermedad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEnfermedad.gridx = 0;		
			//this.gridBagConstraintsEnfermedad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEnfermedad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEnfermedad, this.gridBagConstraintsEnfermedad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEnfermedad.gridx = 0;		
		//this.gridBagConstraintsEnfermedad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEnfermedad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEnfermedad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEnfermedad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEnfermedad.gridx = 0;		
			this.gridBagConstraintsEnfermedad.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEnfermedad.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEnfermedad, this.gridBagConstraintsEnfermedad);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEnfermedad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEnfermedad, this.gridBagConstraintsEnfermedad);								
		
		
		/*
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEnfermedad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEnfermedad, this.gridBagConstraintsEnfermedad);
		*/		
		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEnfermedad.gridx =0;
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEnfermedad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEnfermedad, this.gridBagConstraintsEnfermedad);
				
		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEnfermedad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEnfermedad, this.gridBagConstraintsEnfermedad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(EnfermedadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEnfermedad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEnfermedad = new GridBagLayout();
			this.jPanelBusquedasParametrosEnfermedad.setLayout(gridaBagLayoutBusquedasParametrosEnfermedad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEnfermedad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEnfermedad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEnfermedad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEnfermedad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEnfermedad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEnfermedad, this.gridBagConstraintsEnfermedad);
			
			
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEnfermedad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEnfermedad, this.gridBagConstraintsEnfermedad);
		
			
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEnfermedad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEnfermedad, this.gridBagConstraintsEnfermedad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEnfermedad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEnfermedad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEnfermedad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEnfermedad.setName("jPanelReporteDinamicoEnfermedad"); 
		
		this.jPanelReporteDinamicoEnfermedad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEnfermedad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEnfermedad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEnfermedad.setLayout(gridaBagLayoutReporteDinamicoEnfermedad);
		
		
		this.jInternalFrameReporteDinamicoEnfermedad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEnfermedad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEnfermedad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEnfermedad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEnfermedad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEnfermedad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEnfermedad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEnfermedad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEnfermedad.setResizable(true);
	    this.jInternalFrameReporteDinamicoEnfermedad.setClosable(true);
	    this.jInternalFrameReporteDinamicoEnfermedad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEnfermedad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEnfermedad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEnfermedad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Enfermedades"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEnfermedad = new JLabelMe();

		this.jLabelColumnasSelectReporteEnfermedad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEnfermedad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEnfermedad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEnfermedad.add(this.jLabelColumnasSelectReporteEnfermedad, this.gridBagConstraintsEnfermedad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEnfermedad = new JList<Reporte>();
		this.jListColumnasSelectReporteEnfermedad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEnfermedad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEnfermedad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEnfermedad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEnfermedad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEnfermedad=new JScrollPane(this.jListColumnasSelectReporteEnfermedad);
			
			this.jScrollColumnasSelectReporteEnfermedad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEnfermedad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEnfermedad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEnfermedad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEnfermedad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEnfermedad.add(this.jListColumnasSelectReporteEnfermedad, this.gridBagConstraintsEnfermedad);
		this.jPanelReporteDinamicoEnfermedad.add(this.jScrollColumnasSelectReporteEnfermedad, this.gridBagConstraintsEnfermedad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEnfermedad = new JLabelMe();

		this.jLabelRelacionesSelectReporteEnfermedad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEnfermedad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEnfermedad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEnfermedad.add(this.jLabelRelacionesSelectReporteEnfermedad, this.gridBagConstraintsEnfermedad);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEnfermedad = new JList<Reporte>();
		this.jListRelacionesSelectReporteEnfermedad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEnfermedad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEnfermedad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEnfermedad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEnfermedad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEnfermedad=new JScrollPane(this.jListRelacionesSelectReporteEnfermedad);
			
			this.jScrollRelacionesSelectReporteEnfermedad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEnfermedad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEnfermedad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEnfermedad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEnfermedad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEnfermedad.add(this.jListRelacionesSelectReporteEnfermedad, this.gridBagConstraintsEnfermedad);
		this.jPanelReporteDinamicoEnfermedad.add(this.jScrollRelacionesSelectReporteEnfermedad, this.gridBagConstraintsEnfermedad);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoEnfermedad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEnfermedad = new JComboBoxMe();
		this.jListColumnasValoresGraficoEnfermedad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEnfermedad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEnfermedad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEnfermedad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEnfermedad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEnfermedad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEnfermedad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEnfermedad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEnfermedad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEnfermedad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEnfermedad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEnfermedad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEnfermedad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEnfermedad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEnfermedad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEnfermedad.add(this.jLabelGenerarExcelReporteDinamicoEnfermedad, this.gridBagConstraintsEnfermedad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEnfermedad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEnfermedad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEnfermedad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEnfermedad.setToolTipText("Generar EXCEL"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		//this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEnfermedad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEnfermedad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEnfermedad.add(this.jButtonGenerarExcelReporteDinamicoEnfermedad, this.gridBagConstraintsEnfermedad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEnfermedad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEnfermedad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEnfermedad.add(this.jComboBoxTiposReportesDinamicoEnfermedad, this.gridBagConstraintsEnfermedad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEnfermedad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEnfermedad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEnfermedad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEnfermedad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEnfermedad.add(this.jLabelTiposArchivoReporteDinamicoEnfermedad, this.gridBagConstraintsEnfermedad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEnfermedad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEnfermedad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEnfermedad.add(this.jComboBoxTiposArchivosReportesDinamicoEnfermedad, this.gridBagConstraintsEnfermedad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEnfermedad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEnfermedad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEnfermedad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEnfermedad.setToolTipText("Generar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEnfermedad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEnfermedad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEnfermedad.add(this.jButtonGenerarReporteDinamicoEnfermedad, this.gridBagConstraintsEnfermedad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEnfermedad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEnfermedad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEnfermedad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEnfermedad.setToolTipText("Cancelar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEnfermedad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEnfermedad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEnfermedad.add(this.jButtonCerrarReporteDinamicoEnfermedad, this.gridBagConstraintsEnfermedad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEnfermedad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEnfermedad= new JScrollPane(jPanelReporteDinamicoEnfermedad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEnfermedad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEnfermedad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEnfermedad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Enfermedades"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEnfermedad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEnfermedad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEnfermedad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEnfermedad);
		this.jInternalFrameReporteDinamicoEnfermedad.getContentPane().add(this.jScrollPanelReporteDinamicoEnfermedad, this.gridBagConstraintsEnfermedad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEnfermedad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEnfermedad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEnfermedad.setName("jPanelImportacionEnfermedad"); 
		
		this.jPanelImportacionEnfermedad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEnfermedad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEnfermedad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEnfermedad.setLayout(gridaBagLayoutImportacionEnfermedad);
		
		
		this.jInternalFrameImportacionEnfermedad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEnfermedad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEnfermedad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEnfermedad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEnfermedad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEnfermedad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEnfermedad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEnfermedad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEnfermedad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEnfermedad.setResizable(true);
	    this.jInternalFrameImportacionEnfermedad.setClosable(true);
	    this.jInternalFrameImportacionEnfermedad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEnfermedad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEnfermedad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEnfermedad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEnfermedad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEnfermedad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEnfermedad.setResizable(true);
	    this.jInternalFrameImportacionEnfermedad.setClosable(true);
	    this.jInternalFrameImportacionEnfermedad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEnfermedad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEnfermedad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEnfermedad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Enfermedades"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEnfermedad = new JLabelMe();

		this.jLabelArchivoImportacionEnfermedad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEnfermedad.gridy = iPosYImportacion;		
		this.gridBagConstraintsEnfermedad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEnfermedad.add(this.jLabelArchivoImportacionEnfermedad, this.gridBagConstraintsEnfermedad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEnfermedad = new JFileChooser();		
		this.jFileChooserImportacionEnfermedad.setToolTipText("ESCOGER ARCHIVO"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEnfermedad = new JButtonMe();
		this.jButtonAbrirImportacionEnfermedad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEnfermedad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEnfermedad.setToolTipText("Generar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEnfermedad.gridy = iPosYImportacion;
		this.gridBagConstraintsEnfermedad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEnfermedad.add(this.jButtonAbrirImportacionEnfermedad, this.gridBagConstraintsEnfermedad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEnfermedad = new JLabelMe();

		this.jLabelPathArchivoImportacionEnfermedad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEnfermedad.gridy = iPosYImportacion;		
		this.gridBagConstraintsEnfermedad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEnfermedad.add(this.jLabelPathArchivoImportacionEnfermedad, this.gridBagConstraintsEnfermedad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEnfermedad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEnfermedad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEnfermedad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEnfermedad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEnfermedad.gridy = iPosYImportacion;
		this.gridBagConstraintsEnfermedad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEnfermedad.add(this.jTextFieldPathArchivoImportacionEnfermedad, this.gridBagConstraintsEnfermedad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEnfermedad = new JButtonMe();
		this.jButtonGenerarImportacionEnfermedad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEnfermedad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEnfermedad.setToolTipText("Generar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEnfermedad.gridy = iPosYImportacion;
		this.gridBagConstraintsEnfermedad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEnfermedad.add(this.jButtonGenerarImportacionEnfermedad, this.gridBagConstraintsEnfermedad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEnfermedad = new JButtonMe();
		this.jButtonCerrarImportacionEnfermedad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEnfermedad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEnfermedad.setToolTipText("Cancelar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEnfermedad.gridy = iPosYImportacion;
		this.gridBagConstraintsEnfermedad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEnfermedad.add(this.jButtonCerrarImportacionEnfermedad, this.gridBagConstraintsEnfermedad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEnfermedad = new GridBagLayout();
		
		this.jScrollPanelImportacionEnfermedad= new JScrollPane(jPanelImportacionEnfermedad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy =iPosYImportacion;
		this.gridBagConstraintsEnfermedad.gridx =iPosXImportacion;
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEnfermedad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEnfermedad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEnfermedad);
		this.jInternalFrameImportacionEnfermedad.getContentPane().add(this.jScrollPanelImportacionEnfermedad, this.gridBagConstraintsEnfermedad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEnfermedad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEnfermedad = new JButtonMe();
			this.jButtonAbrirOrderByEnfermedad.setText("Orden");
			this.jButtonAbrirOrderByEnfermedad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEnfermedad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEnfermedad";
			inputMap = this.jButtonAbrirOrderByEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEnfermedad"));
		
		
			GridBagLayout gridaBagLayoutOrderByEnfermedad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEnfermedad.setName("jPanelOrderByEnfermedad"); 
			
			this.jPanelOrderByEnfermedad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEnfermedad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEnfermedad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEnfermedad.setLayout(gridaBagLayoutOrderByEnfermedad);
			
			
			this.jTableDatosEnfermedadOrderBy = new JTableMe();        
			this.jTableDatosEnfermedadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEnfermedadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEnfermedadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEnfermedadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEnfermedadOrderBy.setViewportView(this.jTableDatosEnfermedadOrderBy);
			this.jTableDatosEnfermedadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEnfermedadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEnfermedad= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEnfermedad= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEnfermedad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEnfermedad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEnfermedad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEnfermedad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEnfermedad.setTitle("Orden");
			this.jInternalFrameOrderByEnfermedad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEnfermedad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEnfermedad.setResizable(true);
			this.jInternalFrameOrderByEnfermedad.setClosable(true);
			this.jInternalFrameOrderByEnfermedad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEnfermedad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEnfermedad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEnfermedad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Enfermedades"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEnfermedad.gridx =iPosXOrderBy;
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEnfermedad.ipady =150;
				
			this.jPanelOrderByEnfermedad.add(jScrollPanelDatosEnfermedadOrderBy, this.gridBagConstraintsEnfermedad);//this.jTableDatosEnfermedadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEnfermedad = new JButtonMe();
			this.jButtonCerrarOrderByEnfermedad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEnfermedad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEnfermedad.setToolTipText("Cancelar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEnfermedad.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEnfermedad.add(this.jButtonCerrarOrderByEnfermedad, this.gridBagConstraintsEnfermedad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEnfermedad = new GridBagLayout();
			
			this.jScrollPanelOrderByEnfermedad= new JScrollPane(jPanelOrderByEnfermedad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.gridy =iPosYOrderBy;
			this.gridBagConstraintsEnfermedad.gridx =iPosXOrderBy;
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEnfermedad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEnfermedad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEnfermedad);
			
			this.jInternalFrameOrderByEnfermedad.getContentPane().add(this.jScrollPanelOrderByEnfermedad, this.gridBagConstraintsEnfermedad);			
		
		} else {
			this.jButtonAbrirOrderByEnfermedad = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.enfermedadSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEnfermedad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEnfermedad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEnfermedad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEnfermedad.getRowHeight();//EnfermedadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EnfermedadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEnfermedad.isSelected()) {
					iHeightTable=EnfermedadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EnfermedadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EnfermedadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EnfermedadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEnfermedad.isSelected()) {
					iHeightTable=EnfermedadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EnfermedadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EnfermedadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEnfermedad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEnfermedad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEnfermedad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEnfermedad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEnfermedad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEnfermedad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEnfermedad!=null && this.jInternalFrameOrderByEnfermedad.getjTableDatosOrderBy()!=null) {
			//if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEnfermedad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEnfermedad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEnfermedad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEnfermedad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEnfermedad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEnfermedad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEnfermedad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEnfermedad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEnfermedad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEnfermedad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=enfermedadLogic.getEnfermedads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=enfermedads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<Enfermedad> TraerEnfermedadBeans(List<Enfermedad> enfermedads,ArrayList<Classe> classes)throws Exception {
		try {
			for(Enfermedad enfermedad:enfermedads) {
					
				if(!(EnfermedadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EnfermedadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					enfermedad.setsDetalleGeneralEntityReporte(EnfermedadConstantesFunciones.getEnfermedadDescripcion(enfermedad));
										
						
					
					

					if(enfermedad.getEmpleadoEnfers()!=null && Funciones.existeClass(classes,EmpleadoEnfer.class)) {
						try{enfermedad.setempleadoenfersDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoEnferJInternalFrame.TraerEmpleadoEnferBeans(enfermedad.getEmpleadoEnfers(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//enfermedad.setsDetalleGeneralEntityReporte(enfermedad.getsDetalleGeneralEntityReporte());
										
				}
				
				//enfermedadbeans.add(enfermedadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return enfermedads;
    }
	//PARA REPORTES FIN
}
