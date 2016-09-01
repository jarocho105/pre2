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
import com.bydan.erp.nomina.util.TipoSangreConstantesFunciones;

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
public class TipoSangreJInternalFrame extends TipoSangreBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoSangre;
	
	protected JMenuBar jmenuBarTipoSangre;
	
	protected JMenu jmenuTipoSangre;
	protected JMenu jmenuDatosTipoSangre;
	protected JMenu jmenuArchivoTipoSangre;
	protected JMenu jmenuAccionesTipoSangre;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoSangre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoSangre;	
	protected GridBagConstraints gridBagConstraintsTipoSangre;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoSangreDetalleFormJInternalFrame jInternalFrameDetalleFormTipoSangre;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoSangre;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoSangre;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoSangreSessionBean tiposangreSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoSangre> tiposangres;		
	public List<TipoSangre> tiposangresEliminados;	
	public List<TipoSangre> tiposangresAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoSangre;		
	protected JButton jButtonAbrirOrderByTipoSangre;
	
	
	//protected JPanel jPanelOrderByTipoSangre;
	//public JScrollPane jScrollPanelOrderByTipoSangre;	
	//protected JButton jButtonCerrarOrderByTipoSangre;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoSangreLogic tiposangreLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoSangre;
	public JScrollPane jScrollPanelDatosEdicionTipoSangre;
	public JScrollPane jScrollPanelDatosGeneralTipoSangre;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoSangreOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoSangre;
	//public JScrollPane jScrollPanelImportacionTipoSangre;
	
	
	
	protected JPanel jPanelAccionesTipoSangre;
	
    protected JPanel jPanelPaginacionTipoSangre;
    protected JPanel jPanelParametrosReportesTipoSangre;
	protected JPanel jPanelParametrosReportesAccionesTipoSangre;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoSangre;
	protected JPanel jPanelParametrosAuxiliar2TipoSangre;
	protected JPanel jPanelParametrosAuxiliar3TipoSangre;
	protected JPanel jPanelParametrosAuxiliar4TipoSangre;
	//protected JPanel jPanelParametrosAuxiliar5TipoSangre;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoSangre;
	//protected JPanel jPanelImportacionTipoSangre;
	
	
	public JTable jTableDatosTipoSangre;
	
	
	
	//public JTable jTableDatosTipoSangreOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoSangre;
	protected JButton jButtonDuplicarTipoSangre;
	protected JButton jButtonCopiarTipoSangre;
	protected JButton jButtonVerFormTipoSangre;
	protected JButton jButtonNuevoRelacionesTipoSangre;
	protected JButton jButtonModificarTipoSangre;
	
    protected JButton jButtonGuardarCambiosTablaTipoSangre;
	protected JButton jButtonCerrarTipoSangre;
	
	
	protected JButton jButtonRecargarInformacionTipoSangre;
	protected JButton jButtonProcesarInformacionTipoSangre;
	
	
	protected JButton jButtonAnterioresTipoSangre;
	protected JButton jButtonSiguientesTipoSangre;
	protected JButton jButtonNuevoGuardarCambiosTipoSangre;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoSangre;
	//protected JButton jButtonCerrarReporteDinamicoTipoSangre;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoSangre;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoSangre;
	//protected JButton jButtonGenerarImportacionTipoSangre;
	//protected JButton jButtonCerrarImportacionTipoSangre;
	//protected JFileChooser jFileChooserImportacionTipoSangre;
	//protected File fileImportacionTipoSangre;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoSangre;
	protected JButton jButtonDuplicarToolBarTipoSangre;
	protected JButton jButtonNuevoRelacionesToolBarTipoSangre;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoSangre;
	protected JButton jButtonCopiarToolBarTipoSangre;
	protected JButton jButtonVerFormToolBarTipoSangre;
	public JButton jButtonGuardarCambiosTablaToolBarTipoSangre;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoSangre;
	protected JButton jButtonCerrarToolBarTipoSangre;
	
	protected JButton jButtonRecargarInformacionToolBarTipoSangre;
	protected JButton jButtonProcesarInformacionToolBarTipoSangre;
	protected JButton jButtonAnterioresToolBarTipoSangre;
	protected JButton jButtonSiguientesToolBarTipoSangre;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoSangre;
	protected JButton jButtonAbrirOrderByToolBarTipoSangre;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoSangre;
	protected JMenuItem jMenuItemDuplicarTipoSangre;
	protected JMenuItem jMenuItemNuevoRelacionesTipoSangre;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoSangre;
	protected JMenuItem jMenuItemCopiarTipoSangre;
	protected JMenuItem jMenuItemVerFormTipoSangre;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoSangre;
	protected JMenuItem jMenuItemCerrarTipoSangre;
	protected JMenuItem jMenuItemDetalleCerrarTipoSangre;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoSangre;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoSangre;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoSangre;
	protected JMenuItem jMenuItemProcesarInformacionTipoSangre;
	protected JMenuItem jMenuItemAnterioresTipoSangre;
	protected JMenuItem jMenuItemSiguientesTipoSangre;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoSangre;
	protected JMenuItem jMenuItemAbrirOrderByTipoSangre;
	protected JMenuItem jMenuItemMostrarOcultarTipoSangre;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoSangre;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoSangre;
	protected JCheckBox jCheckBoxSeleccionadosTipoSangre;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoSangre;
	protected JCheckBox jCheckBoxConGraficoReporteTipoSangre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoSangre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoSangre;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoSangre;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoSangre;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoSangre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoSangre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoSangre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoSangre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoSangre;
	protected JTextField jTextFieldValorCampoGeneralTipoSangre;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoSangre;
	//public JList<Reporte> jListColumnasSelectReporteTipoSangre;
	//public JScrollPane jScrollColumnasSelectReporteTipoSangre;
	
	//public JLabel jLabelRelacionesSelectReporteTipoSangre;
	//public JList<Reporte> jListRelacionesSelectReporteTipoSangre;
	//public JScrollPane jScrollRelacionesSelectReporteTipoSangre;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoSangre;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoSangre;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoSangre;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoSangre;
	
		
	//public JLabel jLabelArchivoImportacionTipoSangre;	
	//public JLabel jLabelPathArchivoImportacionTipoSangre;
	//protected JTextField jTextFieldPathArchivoImportacionTipoSangre;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoSangre;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoSangre;
	
	//public JLabel jLabelColumnaCategoriaValorTipoSangre;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoSangre;
	
	//public JLabel jLabelColumnasValoresGraficoTipoSangre;
	//public JList<Reporte> jListColumnasValoresGraficoTipoSangre;
	//public JScrollPane jScrollColumnasValoresGraficoTipoSangre;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoSangre;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoSangre;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoSangre;
	
	
	
	
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
	public TipoSangreJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoSangre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSangreJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSangre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSangreJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSangre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSangreJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoSangre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoSangre)	{
		this.jButtonRecargarInformacionTipoSangre = jButtonRecargarInformacionTipoSangre;
	}
	
	public JButton getjButtonProcesarInformacionTipoSangre() {
		return this.jButtonProcesarInformacionTipoSangre;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoSangre)	{
		this.jButtonProcesarInformacionTipoSangre = jButtonProcesarInformacionTipoSangre;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoSangre() {
		return this.jButtonRecargarInformacionTipoSangre;
	}
	
	
	public List<TipoSangre> gettiposangres() {
		return this.tiposangres;
	}

	public void settiposangres(List<TipoSangre> tiposangres) {
		this.tiposangres = tiposangres;
	}
	
	public List<TipoSangre> gettiposangresAux() {
		return this.tiposangresAux;
	}

	public void settiposangresAux(List<TipoSangre> tiposangresAux) {
		this.tiposangresAux = tiposangresAux;
	}
	
	public List<TipoSangre> gettiposangresEliminados() {
		return this.tiposangresEliminados;
	}

	public void setTipoSangresEliminados(List<TipoSangre> tiposangresEliminados) {
		this.tiposangresEliminados = tiposangresEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoSangre() {
		return jComboBoxTiposSeleccionarTipoSangre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoSangre(
			JComboBox jComboBoxTiposSeleccionarTipoSangre) {
		this.jComboBoxTiposSeleccionarTipoSangre = jComboBoxTiposSeleccionarTipoSangre;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoSangre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoSangre.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoSangre .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoSangre() {
		return jTextFieldValorCampoGeneralTipoSangre;
	}

	public void setjTextFieldValorCampoGeneralTipoSangre(
			JTextField jTextFieldValorCampoGeneralTipoSangre) {
		this.jTextFieldValorCampoGeneralTipoSangre = jTextFieldValorCampoGeneralTipoSangre;
	}

	public void setBorderResaltarValorCampoGeneralTipoSangre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSangre.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoSangre .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoSangre() {
		return this.jCheckBoxSeleccionarTodosTipoSangre;
	}

	public void setjCheckBoxSeleccionarTodosTipoSangre(
			JCheckBox jCheckBoxSeleccionarTodosTipoSangre) {
		this.jCheckBoxSeleccionarTodosTipoSangre = jCheckBoxSeleccionarTodosTipoSangre;
	}

	public void setBorderResaltarSeleccionarTodosTipoSangre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSangre.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoSangre .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoSangre() {
		return this.jCheckBoxSeleccionadosTipoSangre;
	}

	public void setjCheckBoxSeleccionadosTipoSangre(
			JCheckBox jCheckBoxSeleccionadosTipoSangre) {
		this.jCheckBoxSeleccionadosTipoSangre = jCheckBoxSeleccionadosTipoSangre;
	}
	
	public void setBorderResaltarSeleccionadosTipoSangre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSangre.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoSangre .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoSangre() {
		return this.jComboBoxTiposArchivosReportesTipoSangre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoSangre(
			JComboBox jComboBoxTiposArchivosReportesTipoSangre) {
		this.jComboBoxTiposArchivosReportesTipoSangre = jComboBoxTiposArchivosReportesTipoSangre;
	}

	public void setBorderResaltarTiposArchivosReportesTipoSangre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSangre.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoSangre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoSangre() {
		return this.jComboBoxTiposReportesTipoSangre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoSangre(
			JComboBox jComboBoxTiposReportesTipoSangre) {
		this.jComboBoxTiposReportesTipoSangre = jComboBoxTiposReportesTipoSangre;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoSangre() {
	//	return jComboBoxTiposReportesDinamicoTipoSangre;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoSangre(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoSangre) {
	//	this.jComboBoxTiposReportesDinamicoTipoSangre = jComboBoxTiposReportesDinamicoTipoSangre;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoSangre() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoSangre;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoSangre(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoSangre) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoSangre = jComboBoxTiposArchivosReportesDinamicoTipoSangre;
	//}
	
	public void setBorderResaltarTiposReportesTipoSangre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSangre.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoSangre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoSangre() {
		return this.jComboBoxTiposGraficosReportesTipoSangre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoSangre(
			JComboBox jComboBoxTiposGraficosReportesTipoSangre) {
		this.jComboBoxTiposGraficosReportesTipoSangre = jComboBoxTiposGraficosReportesTipoSangre;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoSangre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSangre.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoSangre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoSangre() {
		return this.jComboBoxTiposPaginacionTipoSangre;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoSangre(
			JComboBox jComboBoxTiposPaginacionTipoSangre) {
		this.jComboBoxTiposPaginacionTipoSangre = jComboBoxTiposPaginacionTipoSangre;
	}
	
	public void setBorderResaltarTiposPaginacionTipoSangre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSangre.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoSangre .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoSangre() {
		return this.jComboBoxTiposRelacionesTipoSangre;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoSangre() {
		return this.jComboBoxTiposAccionesTipoSangre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoSangre(
			JComboBox jComboBoxTiposRelacionesTipoSangre) {
		this.jComboBoxTiposRelacionesTipoSangre = jComboBoxTiposRelacionesTipoSangre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoSangre(
			JComboBox jComboBoxTiposAccionesTipoSangre) {
		this.jComboBoxTiposAccionesTipoSangre = jComboBoxTiposAccionesTipoSangre;
	}
	
	public void setBorderResaltarTiposRelacionesTipoSangre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSangre.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoSangre .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoSangre() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoSangre.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoSangre .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoSangre() {
	//	return jCheckBoxConGraficoDinamicoTipoSangre;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoSangre(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoSangre) {
	//	this.jCheckBoxConGraficoDinamicoTipoSangre = jCheckBoxConGraficoDinamicoTipoSangre;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoSangre() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoSangre.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoSangre .setBorder(borderResaltar);		
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
		this.tiposangreSessionBean=new TipoSangreSessionBean();
		
		this.tiposangreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposangreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiposangreSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoSangreJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoSangreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoSangreJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoSangreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoSangreJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Sangre MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoSangreJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoSangre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoSangre= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoSangre,this.jTtoolBarTipoSangre,
							"nuevo","nuevo","Nuevo"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoSangre,this.jTtoolBarTipoSangre,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoSangre,this.jTtoolBarTipoSangre,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoSangre,this.jTtoolBarTipoSangre,
							"duplicar","duplicar","Duplicar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoSangre,this.jTtoolBarTipoSangre,
							"copiar","copiar","Copiar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoSangre,this.jTtoolBarTipoSangre,
							"ver_form","ver_form","Ver"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoSangre,this.jTtoolBarTipoSangre,
							"recargar","recargar","Recargar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoSangre,this.jTtoolBarTipoSangre,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoSangre,this.jTtoolBarTipoSangre,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoSangre,this.jTtoolBarTipoSangre,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoSangre,this.jTtoolBarTipoSangre,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoSangre,this.jTtoolBarTipoSangre,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoSangre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoSangre,this.jTtoolBarTipoSangre,
							"cerrar","cerrar","Salir"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoSangre=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoSangre;
			
				this.jButtonProcesarInformacionToolBarTipoSangre=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoSangre;
				
		//protected JButton jButtonModificarToolBarTipoSangre;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoSangre=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoSangre=new JMenuMe("General");
		this.jmenuArchivoTipoSangre=new JMenuMe("Archivo");
		this.jmenuAccionesTipoSangre=new JMenuMe("Acciones");
		this.jmenuDatosTipoSangre=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoSangre= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoSangre.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoSangre,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoSangre= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoSangre.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoSangre,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoSangre= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoSangre.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoSangre,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoSangre= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoSangre.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoSangre,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoSangre= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoSangre.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoSangre,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoSangre= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoSangre.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoSangre,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoSangre= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoSangre.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoSangre,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoSangre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoSangre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoSangre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoSangre= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoSangre.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoSangre,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoSangre= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoSangre.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoSangre,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoSangre= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoSangre.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoSangre,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoSangre= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoSangre.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoSangre,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoSangre= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoSangre.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoSangre,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoSangre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoSangre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoSangre,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoSangre= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoSangre.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoSangre,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoSangre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoSangre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoSangre,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoSangre= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoSangre.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoSangre,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoSangre.add(this.jMenuItemCerrarTipoSangre);
			
			this.jmenuAccionesTipoSangre.add(this.jMenuItemNuevoTipoSangre);
			this.jmenuAccionesTipoSangre.add(this.jMenuItemNuevoGuardarCambiosTipoSangre);
			this.jmenuAccionesTipoSangre.add(this.jMenuItemNuevoRelacionesTipoSangre);
			this.jmenuAccionesTipoSangre.add(this.jMenuItemGuardarCambiosTablaTipoSangre);		
			this.jmenuAccionesTipoSangre.add(this.jMenuItemDuplicarTipoSangre);		
			this.jmenuAccionesTipoSangre.add(this.jMenuItemCopiarTipoSangre);		
			this.jmenuAccionesTipoSangre.add(this.jMenuItemVerFormTipoSangre);		
			
			this.jmenuDatosTipoSangre.add(this.jMenuItemRecargarInformacionTipoSangre);				
			this.jmenuDatosTipoSangre.add(this.jMenuItemAnterioresTipoSangre);				
			this.jmenuDatosTipoSangre.add(this.jMenuItemSiguientesTipoSangre);				
			this.jmenuDatosTipoSangre.add(this.jMenuItemAbrirOrderByTipoSangre);				
			this.jmenuDatosTipoSangre.add(this.jMenuItemMostrarOcultarTipoSangre);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoSangre.add(this.jMenuItemGuardarCambiosTipoSangre);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoSangre.add(this.jmenuArchivoTipoSangre);		
			this.jmenuBarTipoSangre.add(this.jmenuAccionesTipoSangre);		
			this.jmenuBarTipoSangre.add(this.jmenuDatosTipoSangre);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoSangre);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoSangre() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoSangre=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoSangre.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoSangre.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoSangre.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoSangre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoSangre,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoSangre = new TipoSangreDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Sangre DATOS");
			this.jInternalFrameDetalleFormTipoSangre = new TipoSangreDetalleFormJInternalFrame(jDesktopPane,this.tiposangreSessionBean.getConGuardarRelaciones(),this.tiposangreSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoSangre = null;//new TipoSangreDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoSangre= new GridBagLayout();
		
		
		this.jTableDatosTipoSangre = new JTableMe();      
		
		String sToolTipTipoSangre="";
		sToolTipTipoSangre=TipoSangreConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoSangre+="(Nomina.TipoSangre)";
		}
		
		if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoSangre+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoSangre.setToolTipText(sToolTipTipoSangre);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoSangre);
		this.jTableDatosTipoSangre.setAutoCreateRowSorter(true);
		this.jTableDatosTipoSangre.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoSangre.setRowSelectionAllowed(true);
		this.jTableDatosTipoSangre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoSangre,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoSangre = new JButtonMe();
		this.jButtonDuplicarTipoSangre = new JButtonMe();
		this.jButtonCopiarTipoSangre = new JButtonMe();
		this.jButtonVerFormTipoSangre = new JButtonMe();
		this.jButtonNuevoRelacionesTipoSangre = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoSangre = new JButtonMe();
		this.jButtonCerrarTipoSangre = new JButtonMe();
		
		this.jScrollPanelDatosTipoSangre = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoSangre = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoSangre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Sangre";
		
		if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sangres" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoSangre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoSangre.setToolTipText("Acciones");
        this.jPanelAccionesTipoSangre.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoSangre=new ReporteDinamicoJInternalFrame(TipoSangreConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoSangre();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoSangre=new ImportacionJInternalFrame(TipoSangreConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoSangre();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoSangre = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoSangre.setText("Orden");
		this.jButtonAbrirOrderByTipoSangre.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoSangre,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoSangre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoSangre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSangre,false,this);
			
			//this.cargarOrderByTipoSangre(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoSangre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSangre,true,this);
			
			//this.cargarOrderByTipoSangre(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoSangre.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoSangre.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoSangre.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoSangre.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoSangre.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoSangre.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoSangre.setText("Nuevo");
		this.jButtonDuplicarTipoSangre.setText("Duplicar");
		this.jButtonCopiarTipoSangre.setText("Copiar");
		this.jButtonVerFormTipoSangre.setText("Ver");
		this.jButtonNuevoRelacionesTipoSangre.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoSangre.setText("Guardar");
		this.jButtonCerrarTipoSangre.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoSangre,"nuevo_button","Nuevo",this.tiposangreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoSangre,"duplicar_button","Duplicar",this.tiposangreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoSangre,"copiar_button","Copiar",this.tiposangreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoSangre,"ver_form","Ver",this.tiposangreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoSangre,"nuevorelaciones_button","Nuevo Rel",this.tiposangreSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoSangre,"guardarcambiostabla_button","Guardar",this.tiposangreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoSangre,"cerrar_button","Salir",this.tiposangreSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoSangre.setToolTipText("Nuevo"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoSangre.setToolTipText("Duplicar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoSangre.setToolTipText("Copiar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoSangre.setToolTipText("Ver"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoSangre.setToolTipText("Nuevo Rel"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoSangre.setToolTipText("Guardar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoSangre.setToolTipText("Salir"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoSangre";
		inputMap = this.jButtonNuevoTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoSangre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoSangre"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoSangre";
		inputMap = this.jButtonDuplicarTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoSangre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoSangre"));
		
		//COPIAR
		sMapKey = "CopiarTipoSangre";
		inputMap = this.jButtonCopiarTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoSangre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoSangre"));
		
		//VEr FORM
		sMapKey = "VerFormTipoSangre";
		inputMap = this.jButtonVerFormTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoSangre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoSangre"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoSangre";
		inputMap = this.jButtonNuevoRelacionesTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoSangre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoSangre"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoSangre";
		inputMap = this.jButtonModificarTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoSangre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoSangre"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoSangre";
		inputMap = this.jButtonCerrarTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoSangre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoSangre"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoSangre";
		inputMap = this.jButtonGuardarCambiosTablaTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoSangre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoSangre"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoSangre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoSangre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoSangre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoSangre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoSangre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoSangre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoSangre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoSangre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoSangre.setName("jPanelParametrosReportesTipoSangre"); 
		
		this.jPanelParametrosReportesAccionesTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoSangre.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoSangre.setName("jPanelParametrosReportesAccionesTipoSangre"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoSangre, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoSangre = new JButtonMe();
		this.jButtonRecargarInformacionTipoSangre.setText("Recargar");
		this.jButtonRecargarInformacionTipoSangre.setToolTipText("Recargar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoSangre,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoSangre = new JButtonMe();
		this.jButtonProcesarInformacionTipoSangre.setText("Procesar");
		this.jButtonProcesarInformacionTipoSangre.setToolTipText("Procesar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoSangre.setVisible(false);
			
		this.jButtonProcesarInformacionTipoSangre.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoSangre.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoSangre.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoSangre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoSangre.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoSangre.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoSangre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoSangre.setText("TIPO");       
		this.jComboBoxTiposReportesTipoSangre.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoSangre = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoSangre.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoSangre.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoSangre = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoSangre.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoSangre.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoSangre = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoSangre.setText("Accion");
		this.jComboBoxTiposRelacionesTipoSangre.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoSangre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoSangre.setText("Accion");
		this.jComboBoxTiposAccionesTipoSangre.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoSangre = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoSangre.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoSangre.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoSangre=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoSangre.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoSangre.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoSangre.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoSangre = new JLabelMe();
		
		this.jLabelAccionesTipoSangre.setText("Acciones");		
		this.jLabelAccionesTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoSangre = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoSangre.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoSangre.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoSangre = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoSangre.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoSangre.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoSangre = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoSangre.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoSangre.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoSangre = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoSangre.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoSangre.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoSangre = new JButtonMe();
		//this.jButtonAnterioresTipoSangre.setText("<<");
        this.jButtonAnterioresTipoSangre.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoSangre,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoSangre = new JButtonMe();
		//this.jButtonSiguientesTipoSangre.setText(">>");
        this.jButtonSiguientesTipoSangre.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoSangre,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoSangre = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoSangre.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoSangre.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoSangre,"nuevoguardarcambios_button","Nue",this.tiposangreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoSangre";
		inputMap = this.jButtonNuevoGuardarCambiosTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoSangre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoSangre"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoSangre";
		inputMap = this.jButtonRecargarInformacionTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoSangre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoSangre"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoSangre";
		inputMap = this.jButtonSiguientesTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoSangre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoSangre"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoSangre";
		inputMap = this.jButtonAnterioresTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoSangre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoSangre"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoSangre();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoSangre.setMinimumSize(new Dimension(this.getWidth(),TipoSangreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoSangreBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoSangre.setMaximumSize(new Dimension(this.getWidth(),TipoSangreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoSangreBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoSangre.setPreferredSize(new Dimension(this.getWidth(),TipoSangreBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoSangreBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoSangre = new GridBagLayout();

			this.jPanelPaginacionTipoSangre.setLayout(gridaBagLayoutPaginacionTipoSangre);						
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSangre.gridy = 0;
			this.gridBagConstraintsTipoSangre.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoSangre.add(this.jButtonAnterioresTipoSangre, this.gridBagConstraintsTipoSangre);
					
						
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoSangre.gridy = 0;
			
			this.jPanelPaginacionTipoSangre.add(this.jButtonNuevoGuardarCambiosTipoSangre, this.gridBagConstraintsTipoSangre);
						
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoSangre.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoSangre.gridy = 0;
			this.jPanelPaginacionTipoSangre.add(this.jButtonSiguientesTipoSangre, this.gridBagConstraintsTipoSangre);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSangre.gridy = 1;
			this.gridBagConstraintsTipoSangre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSangre.add(this.jButtonNuevoTipoSangre, this.gridBagConstraintsTipoSangre);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoSangre = new GridBagConstraints();
				this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoSangre.gridy = 1;
				this.gridBagConstraintsTipoSangre.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoSangre.add(this.jButtonNuevoRelacionesTipoSangre, this.gridBagConstraintsTipoSangre);
			}
			
			
			if(!this.tiposangreSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoSangre = new GridBagConstraints();
				this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoSangre.gridy = 1;
				this.gridBagConstraintsTipoSangre.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoSangre.add(this.jButtonGuardarCambiosTablaTipoSangre, this.gridBagConstraintsTipoSangre);
			}
			
			
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSangre.gridy = 1;
			this.gridBagConstraintsTipoSangre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSangre.add(this.jButtonDuplicarTipoSangre, this.gridBagConstraintsTipoSangre);
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSangre.gridy = 1;
			this.gridBagConstraintsTipoSangre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSangre.add(this.jButtonCopiarTipoSangre, this.gridBagConstraintsTipoSangre);
		
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSangre.gridy = 1;
			this.gridBagConstraintsTipoSangre.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoSangre.add(this.jButtonVerFormTipoSangre, this.gridBagConstraintsTipoSangre);
		
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSangre.gridy = 1;
			this.gridBagConstraintsTipoSangre.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoSangre.add(this.jButtonCerrarTipoSangre, this.gridBagConstraintsTipoSangre);
		
		
		
		this.jButtonRecargarInformacionTipoSangre.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoSangre.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoSangre.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoSangre.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoSangre.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoSangre.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoSangre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoSangre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoSangre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoSangre.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoSangre.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoSangre.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoSangre.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoSangre.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoSangre.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoSangre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoSangre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoSangre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoSangre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSangre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSangre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoSangre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoSangre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoSangre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoSangre.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoSangre.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoSangre.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoSangre.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoSangre.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoSangre.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoSangre.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoSangre.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoSangre.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoSangre.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoSangre.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoSangre.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoSangre = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoSangre = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoSangre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoSangre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoSangre = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoSangre = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoSangre.setLayout(gridaBagParametrosReportesTipoSangre);
			this.jPanelParametrosReportesAccionesTipoSangre.setLayout(gridaBagParametrosReportesAccionesTipoSangre);
			
			
			this.jPanelParametrosAuxiliar1TipoSangre.setLayout(gridaBagParametrosAuxiliar1TipoSangre);
			this.jPanelParametrosAuxiliar2TipoSangre.setLayout(gridaBagParametrosAuxiliar2TipoSangre);
			this.jPanelParametrosAuxiliar3TipoSangre.setLayout(gridaBagParametrosAuxiliar3TipoSangre);
			this.jPanelParametrosAuxiliar4TipoSangre.setLayout(gridaBagParametrosAuxiliar4TipoSangre);
			//this.jPanelParametrosAuxiliar5TipoSangre.setLayout(gridaBagParametrosAuxiliar2TipoSangre);			
			
			
			
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoSangre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSangre.add(this.jButtonRecargarInformacionTipoSangre, this.gridBagConstraintsTipoSangre);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSangre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoSangre.add(this.jComboBoxTiposPaginacionTipoSangre, this.gridBagConstraintsTipoSangre);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSangre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoSangre.add(this.jCheckBoxConAltoMaximoTablaTipoSangre, this.gridBagConstraintsTipoSangre);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSangre.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoSangre.add(this.jComboBoxTiposArchivosReportesTipoSangre, this.gridBagConstraintsTipoSangre);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSangre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSangre.add(this.jPanelParametrosAuxiliar1TipoSangre, this.gridBagConstraintsTipoSangre);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSangre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoSangre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoSangre.add(this.jComboBoxTiposReportesTipoSangre, this.gridBagConstraintsTipoSangre);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSangre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSangre.add(this.jPanelParametrosAuxiliar4TipoSangre, this.gridBagConstraintsTipoSangre);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSangre.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSangre.add(this.jComboBoxTiposReportesTipoSangre, this.gridBagConstraintsTipoSangre);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSangre.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoSangre.add(this.jCheckBoxGenerarReporteTipoSangre, this.gridBagConstraintsTipoSangre);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSangre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSangre.add(this.jPanelParametrosAuxiliar2TipoSangre, this.gridBagConstraintsTipoSangre);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoSangre.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoSangre.add(this.jLabelAccionesTipoSangre, this.gridBagConstraintsTipoSangre);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoSangre = new GridBagConstraints();
				this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoSangre.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoSangre.add(this.jButtonAbrirOrderByTipoSangre, this.gridBagConstraintsTipoSangre);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSangre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSangre.add(this.jComboBoxTiposSeleccionarTipoSangre, this.gridBagConstraintsTipoSangre);			
			
			
			/*
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoSangre.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoSangre.add(this.jCheckBoxSeleccionarTodosTipoSangre, this.gridBagConstraintsTipoSangre);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSangre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoSangre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoSangre.add(this.jCheckBoxSeleccionarTodosTipoSangre, this.gridBagConstraintsTipoSangre);															
				
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSangre.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoSangre.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoSangre.add(this.jCheckBoxSeleccionadosTipoSangre, this.gridBagConstraintsTipoSangre);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSangre.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoSangre.add(this.jPanelParametrosAuxiliar3TipoSangre, this.gridBagConstraintsTipoSangre);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSangre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSangre.add(this.jComboBoxTiposRelacionesTipoSangre, this.gridBagConstraintsTipoSangre);
				
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSangre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSangre.add(this.jComboBoxTiposAccionesTipoSangre, this.gridBagConstraintsTipoSangre);
	
				
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoSangre.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoSangre.add(this.jTextFieldValorCampoGeneralTipoSangre, this.gridBagConstraintsTipoSangre);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoSangre = new GridBagLayout();

			this.jScrollPanelDatosTipoSangre.setLayout(gridaBagLayoutDatosTipoSangre);
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSangre.gridy = 0;
			this.gridBagConstraintsTipoSangre.gridx = 0;
			
			this.jScrollPanelDatosTipoSangre.add(this.jTableDatosTipoSangre, this.gridBagConstraintsTipoSangre);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoSangre.setViewportView(this.jTableDatosTipoSangre);
		this.jTableDatosTipoSangre.setFillsViewportHeight(true);
		this.jTableDatosTipoSangre.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoSangre= new GridBagLayout();
		this.jPanelAccionesTipoSangre.setLayout(gridaBagLayoutAccionesTipoSangre);
		
		
		/*	
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSangre.gridy = 0;
		this.gridBagConstraintsTipoSangre.gridx = 0;
			
		this.jPanelAccionesTipoSangre.add(this.jButtonNuevoTipoSangre, this.gridBagConstraintsTipoSangre);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoSangre = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoSangre);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiposangreSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();						
			this.gridBagConstraintsTipoSangre.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoSangre.gridx = 0;		
			//this.gridBagConstraintsTipoSangre.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoSangre.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoSangre, this.gridBagConstraintsTipoSangre);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoSangre.gridx = 0;		
		//this.gridBagConstraintsTipoSangre.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSangre.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoSangre.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoSangre);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSangre.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoSangre, this.gridBagConstraintsTipoSangre);								
		
		
		/*
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSangre.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoSangre, this.gridBagConstraintsTipoSangre);
		*/		
		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoSangre.gridx =0;
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoSangre.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoSangre, this.gridBagConstraintsTipoSangre);
				
		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSangre.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoSangre, this.gridBagConstraintsTipoSangre);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoSangreJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoSangre= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoSangre = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoSangre.setLayout(gridaBagLayoutBusquedasParametrosTipoSangre);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoSangre=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoSangre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSangre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSangre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSangre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoSangre, this.gridBagConstraintsTipoSangre);
			
			
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSangre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoSangre, this.gridBagConstraintsTipoSangre);
		
			
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoSangre.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoSangre, this.gridBagConstraintsTipoSangre);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoSangre;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoSangre() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoSangre = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoSangre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoSangre.setName("jPanelReporteDinamicoTipoSangre"); 
		
		this.jPanelReporteDinamicoTipoSangre.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoSangre.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoSangre.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoSangre.setLayout(gridaBagLayoutReporteDinamicoTipoSangre);
		
		
		this.jInternalFrameReporteDinamicoTipoSangre= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoSangre = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoSangre= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoSangre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoSangre.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoSangre.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoSangre.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoSangre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoSangre.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoSangre.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoSangre.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoSangre.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoSangre.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoSangre.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sangres"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoSangre = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoSangre.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSangre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSangre.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoSangre.add(this.jLabelColumnasSelectReporteTipoSangre, this.gridBagConstraintsTipoSangre);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoSangre = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoSangre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoSangre.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoSangre.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoSangre.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoSangre.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoSangre=new JScrollPane(this.jListColumnasSelectReporteTipoSangre);
			
			this.jScrollColumnasSelectReporteTipoSangre.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoSangre.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoSangre.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSangre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSangre.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoSangre.add(this.jListColumnasSelectReporteTipoSangre, this.gridBagConstraintsTipoSangre);
		this.jPanelReporteDinamicoTipoSangre.add(this.jScrollColumnasSelectReporteTipoSangre, this.gridBagConstraintsTipoSangre);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoSangre = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoSangre.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSangre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSangre.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoSangre.add(this.jLabelRelacionesSelectReporteTipoSangre, this.gridBagConstraintsTipoSangre);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoSangre = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoSangre.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoSangre.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoSangre.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoSangre.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoSangre.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoSangre=new JScrollPane(this.jListRelacionesSelectReporteTipoSangre);
			
			this.jScrollRelacionesSelectReporteTipoSangre.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoSangre.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoSangre.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSangre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSangre.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoSangre.add(this.jListRelacionesSelectReporteTipoSangre, this.gridBagConstraintsTipoSangre);
		this.jPanelReporteDinamicoTipoSangre.add(this.jScrollRelacionesSelectReporteTipoSangre, this.gridBagConstraintsTipoSangre);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoSangre = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoSangre = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoSangre = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoSangre = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoSangre.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoSangre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoSangre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoSangre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoSangre = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoSangre.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoSangre.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoSangre.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoSangre.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoSangre = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoSangre.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSangre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSangre.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoSangre.add(this.jLabelGenerarExcelReporteDinamicoTipoSangre, this.gridBagConstraintsTipoSangre);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoSangre = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoSangre.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoSangre,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoSangre.setToolTipText("Generar EXCEL"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		//this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoSangre.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoSangre.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoSangre.add(this.jButtonGenerarExcelReporteDinamicoTipoSangre, this.gridBagConstraintsTipoSangre);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSangre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSangre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSangre.add(this.jComboBoxTiposReportesDinamicoTipoSangre, this.gridBagConstraintsTipoSangre);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoSangre = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoSangre.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSangre.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoSangre.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoSangre.add(this.jLabelTiposArchivoReporteDinamicoTipoSangre, this.gridBagConstraintsTipoSangre);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSangre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSangre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSangre.add(this.jComboBoxTiposArchivosReportesDinamicoTipoSangre, this.gridBagConstraintsTipoSangre);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoSangre = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoSangre.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoSangre,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoSangre.setToolTipText("Generar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSangre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSangre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSangre.add(this.jButtonGenerarReporteDinamicoTipoSangre, this.gridBagConstraintsTipoSangre);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoSangre = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoSangre.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoSangre,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoSangre.setToolTipText("Cancelar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSangre.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoSangre.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoSangre.add(this.jButtonCerrarReporteDinamicoTipoSangre, this.gridBagConstraintsTipoSangre);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoSangre = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoSangre= new JScrollPane(jPanelReporteDinamicoTipoSangre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoSangre.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoSangre.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoSangre.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sangres"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoSangre.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoSangre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoSangre.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoSangre);
		this.jInternalFrameReporteDinamicoTipoSangre.getContentPane().add(this.jScrollPanelReporteDinamicoTipoSangre, this.gridBagConstraintsTipoSangre);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoSangre() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoSangre = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoSangre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoSangre.setName("jPanelImportacionTipoSangre"); 
		
		this.jPanelImportacionTipoSangre.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoSangre.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoSangre.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoSangre.setLayout(gridaBagLayoutImportacionTipoSangre);
		
		
		this.jInternalFrameImportacionTipoSangre= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoSangre= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoSangre = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoSangre= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoSangre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoSangre.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoSangre.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoSangre.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoSangre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoSangre.setResizable(true);
	    this.jInternalFrameImportacionTipoSangre.setClosable(true);
	    this.jInternalFrameImportacionTipoSangre.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoSangre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoSangre.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoSangre.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoSangre.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoSangre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoSangre.setResizable(true);
	    this.jInternalFrameImportacionTipoSangre.setClosable(true);
	    this.jInternalFrameImportacionTipoSangre.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoSangre.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoSangre.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoSangre.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sangres"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoSangre = new JLabelMe();

		this.jLabelArchivoImportacionTipoSangre.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSangre.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoSangre.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoSangre.add(this.jLabelArchivoImportacionTipoSangre, this.gridBagConstraintsTipoSangre);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoSangre = new JFileChooser();		
		this.jFileChooserImportacionTipoSangre.setToolTipText("ESCOGER ARCHIVO"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoSangre = new JButtonMe();
		this.jButtonAbrirImportacionTipoSangre.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoSangre,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoSangre.setToolTipText("Generar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSangre.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSangre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSangre.add(this.jButtonAbrirImportacionTipoSangre, this.gridBagConstraintsTipoSangre);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoSangre = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoSangre.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoSangre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoSangre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoSangre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSangre.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoSangre.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoSangre.add(this.jLabelPathArchivoImportacionTipoSangre, this.gridBagConstraintsTipoSangre);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoSangre=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoSangre.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoSangre.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoSangre.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSangre.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSangre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSangre.add(this.jTextFieldPathArchivoImportacionTipoSangre, this.gridBagConstraintsTipoSangre);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoSangre = new JButtonMe();
		this.jButtonGenerarImportacionTipoSangre.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoSangre,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoSangre.setToolTipText("Generar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSangre.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSangre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSangre.add(this.jButtonGenerarImportacionTipoSangre, this.gridBagConstraintsTipoSangre);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoSangre = new JButtonMe();
		this.jButtonCerrarImportacionTipoSangre.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoSangre,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoSangre.setToolTipText("Cancelar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSangre.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoSangre.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoSangre.add(this.jButtonCerrarImportacionTipoSangre, this.gridBagConstraintsTipoSangre);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoSangre = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoSangre= new JScrollPane(jPanelImportacionTipoSangre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoSangre = new GridBagConstraints();
		this.gridBagConstraintsTipoSangre.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoSangre.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoSangre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoSangre.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoSangre);
		this.jInternalFrameImportacionTipoSangre.getContentPane().add(this.jScrollPanelImportacionTipoSangre, this.gridBagConstraintsTipoSangre);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoSangre(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoSangre = new JButtonMe();
			this.jButtonAbrirOrderByTipoSangre.setText("Orden");
			this.jButtonAbrirOrderByTipoSangre.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoSangre,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoSangre";
			inputMap = this.jButtonAbrirOrderByTipoSangre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoSangre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoSangre"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoSangre = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoSangre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoSangre.setName("jPanelOrderByTipoSangre"); 
			
			this.jPanelOrderByTipoSangre.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoSangre.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoSangre.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoSangre.setLayout(gridaBagLayoutOrderByTipoSangre);
			
			
			this.jTableDatosTipoSangreOrderBy = new JTableMe();        
			this.jTableDatosTipoSangreOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoSangreOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoSangreOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoSangreOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoSangreOrderBy.setViewportView(this.jTableDatosTipoSangreOrderBy);
			this.jTableDatosTipoSangreOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoSangreOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoSangre= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoSangre= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoSangre = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoSangre= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoSangre.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoSangre.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoSangre.setTitle("Orden");
			this.jInternalFrameOrderByTipoSangre.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoSangre.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoSangre.setResizable(true);
			this.jInternalFrameOrderByTipoSangre.setClosable(true);
			this.jInternalFrameOrderByTipoSangre.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoSangre.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoSangre.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoSangre.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoSangre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sangres"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoSangre.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoSangre.ipady =150;
				
			this.jPanelOrderByTipoSangre.add(jScrollPanelDatosTipoSangreOrderBy, this.gridBagConstraintsTipoSangre);//this.jTableDatosTipoSangreTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoSangre = new JButtonMe();
			this.jButtonCerrarOrderByTipoSangre.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoSangre,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoSangre.setToolTipText("Cancelar"+" "+TipoSangreConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoSangre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSangre.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoSangre.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoSangre.add(this.jButtonCerrarOrderByTipoSangre, this.gridBagConstraintsTipoSangre);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoSangre = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoSangre= new JScrollPane(jPanelOrderByTipoSangre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoSangre = new GridBagConstraints();
			this.gridBagConstraintsTipoSangre.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoSangre.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoSangre.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoSangre.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoSangre.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoSangre);
			
			this.jInternalFrameOrderByTipoSangre.getContentPane().add(this.jScrollPanelOrderByTipoSangre, this.gridBagConstraintsTipoSangre);			
		
		} else {
			this.jButtonAbrirOrderByTipoSangre = new JButtonMe();
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
			&& this.tiposangreSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoSangre.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoSangre.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoSangre.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoSangre.getRowHeight();//TipoSangreConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoSangreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoSangre.isSelected()) {
					iHeightTable=TipoSangreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoSangreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoSangreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoSangreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoSangre.isSelected()) {
					iHeightTable=TipoSangreConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoSangreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoSangreConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoSangre.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoSangre.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoSangre.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoSangre.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoSangre.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoSangre.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoSangre!=null && this.jInternalFrameOrderByTipoSangre.getjTableDatosOrderBy()!=null) {
			//if(!this.tiposangreSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoSangre.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoSangre.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoSangre.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoSangre.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoSangre.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoSangre.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoSangre.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoSangre.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoSangre.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoSangre.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiposangreLogic.getTipoSangres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposangres.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoSangre> TraerTipoSangreBeans(List<TipoSangre> tiposangres,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoSangre tiposangre:tiposangres) {
					
				if(!(TipoSangreConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoSangreConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiposangre.setsDetalleGeneralEntityReporte(TipoSangreConstantesFunciones.getTipoSangreDescripcion(tiposangre));
										
						
					
					

					if(tiposangre.getDatoGeneralEmpleados()!=null && Funciones.existeClass(classes,DatoGeneralEmpleado.class)) {
						try{tiposangre.setdatogeneralempleadosDescripcionReporte(new JRBeanCollectionDataSource(DatoGeneralEmpleadoJInternalFrame.TraerDatoGeneralEmpleadoBeans(tiposangre.getDatoGeneralEmpleados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tiposangre.setsDetalleGeneralEntityReporte(tiposangre.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiposangrebeans.add(tiposangrebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiposangres;
    }
	//PARA REPORTES FIN
}
