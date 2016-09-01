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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.nomina.util.TipoProcesoNominaConstantesFunciones;

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
public class TipoProcesoNominaJInternalFrame extends TipoProcesoNominaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoProcesoNomina;
	
	protected JMenuBar jmenuBarTipoProcesoNomina;
	
	protected JMenu jmenuTipoProcesoNomina;
	protected JMenu jmenuDatosTipoProcesoNomina;
	protected JMenu jmenuArchivoTipoProcesoNomina;
	protected JMenu jmenuAccionesTipoProcesoNomina;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoProcesoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProcesoNomina;	
	protected GridBagConstraints gridBagConstraintsTipoProcesoNomina;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoProcesoNominaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoProcesoNomina;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoProcesoNomina;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoProcesoNomina;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoProcesoNominaSessionBean tipoprocesonominaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoProcesoNomina> tipoprocesonominas;		
	public List<TipoProcesoNomina> tipoprocesonominasEliminados;	
	public List<TipoProcesoNomina> tipoprocesonominasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoProcesoNomina;		
	protected JButton jButtonAbrirOrderByTipoProcesoNomina;
	
	
	//protected JPanel jPanelOrderByTipoProcesoNomina;
	//public JScrollPane jScrollPanelOrderByTipoProcesoNomina;	
	//protected JButton jButtonCerrarOrderByTipoProcesoNomina;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoProcesoNominaLogic tipoprocesonominaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoProcesoNomina;
	public JScrollPane jScrollPanelDatosEdicionTipoProcesoNomina;
	public JScrollPane jScrollPanelDatosGeneralTipoProcesoNomina;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoProcesoNominaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoProcesoNomina;
	//public JScrollPane jScrollPanelImportacionTipoProcesoNomina;
	
	
	
	protected JPanel jPanelAccionesTipoProcesoNomina;
	
    protected JPanel jPanelPaginacionTipoProcesoNomina;
    protected JPanel jPanelParametrosReportesTipoProcesoNomina;
	protected JPanel jPanelParametrosReportesAccionesTipoProcesoNomina;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoProcesoNomina;
	protected JPanel jPanelParametrosAuxiliar2TipoProcesoNomina;
	protected JPanel jPanelParametrosAuxiliar3TipoProcesoNomina;
	protected JPanel jPanelParametrosAuxiliar4TipoProcesoNomina;
	//protected JPanel jPanelParametrosAuxiliar5TipoProcesoNomina;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoProcesoNomina;
	//protected JPanel jPanelImportacionTipoProcesoNomina;
	
	
	public JTable jTableDatosTipoProcesoNomina;
	
	
	
	//public JTable jTableDatosTipoProcesoNominaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoProcesoNomina;
	protected JButton jButtonDuplicarTipoProcesoNomina;
	protected JButton jButtonCopiarTipoProcesoNomina;
	protected JButton jButtonVerFormTipoProcesoNomina;
	protected JButton jButtonNuevoRelacionesTipoProcesoNomina;
	protected JButton jButtonModificarTipoProcesoNomina;
	
    protected JButton jButtonGuardarCambiosTablaTipoProcesoNomina;
	protected JButton jButtonCerrarTipoProcesoNomina;
	
	
	protected JButton jButtonRecargarInformacionTipoProcesoNomina;
	protected JButton jButtonProcesarInformacionTipoProcesoNomina;
	
	
	protected JButton jButtonAnterioresTipoProcesoNomina;
	protected JButton jButtonSiguientesTipoProcesoNomina;
	protected JButton jButtonNuevoGuardarCambiosTipoProcesoNomina;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoProcesoNomina;
	//protected JButton jButtonCerrarReporteDinamicoTipoProcesoNomina;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoProcesoNomina;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoProcesoNomina;
	//protected JButton jButtonGenerarImportacionTipoProcesoNomina;
	//protected JButton jButtonCerrarImportacionTipoProcesoNomina;
	//protected JFileChooser jFileChooserImportacionTipoProcesoNomina;
	//protected File fileImportacionTipoProcesoNomina;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProcesoNomina;
	protected JButton jButtonDuplicarToolBarTipoProcesoNomina;
	protected JButton jButtonNuevoRelacionesToolBarTipoProcesoNomina;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoProcesoNomina;
	protected JButton jButtonCopiarToolBarTipoProcesoNomina;
	protected JButton jButtonVerFormToolBarTipoProcesoNomina;
	public JButton jButtonGuardarCambiosTablaToolBarTipoProcesoNomina;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProcesoNomina;
	protected JButton jButtonCerrarToolBarTipoProcesoNomina;
	
	protected JButton jButtonRecargarInformacionToolBarTipoProcesoNomina;
	protected JButton jButtonProcesarInformacionToolBarTipoProcesoNomina;
	protected JButton jButtonAnterioresToolBarTipoProcesoNomina;
	protected JButton jButtonSiguientesToolBarTipoProcesoNomina;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoProcesoNomina;
	protected JButton jButtonAbrirOrderByToolBarTipoProcesoNomina;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProcesoNomina;
	protected JMenuItem jMenuItemDuplicarTipoProcesoNomina;
	protected JMenuItem jMenuItemNuevoRelacionesTipoProcesoNomina;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoProcesoNomina;
	protected JMenuItem jMenuItemCopiarTipoProcesoNomina;
	protected JMenuItem jMenuItemVerFormTipoProcesoNomina;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProcesoNomina;
	protected JMenuItem jMenuItemCerrarTipoProcesoNomina;
	protected JMenuItem jMenuItemDetalleCerrarTipoProcesoNomina;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoProcesoNomina;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProcesoNomina;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoProcesoNomina;
	protected JMenuItem jMenuItemProcesarInformacionTipoProcesoNomina;
	protected JMenuItem jMenuItemAnterioresTipoProcesoNomina;
	protected JMenuItem jMenuItemSiguientesTipoProcesoNomina;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProcesoNomina;
	protected JMenuItem jMenuItemAbrirOrderByTipoProcesoNomina;
	protected JMenuItem jMenuItemMostrarOcultarTipoProcesoNomina;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProcesoNomina;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoProcesoNomina;
	protected JCheckBox jCheckBoxSeleccionadosTipoProcesoNomina;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoProcesoNomina;
	protected JCheckBox jCheckBoxConGraficoReporteTipoProcesoNomina;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoProcesoNomina;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoProcesoNomina;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProcesoNomina;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoProcesoNomina;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoProcesoNomina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoProcesoNomina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProcesoNomina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProcesoNomina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoProcesoNomina;
	protected JTextField jTextFieldValorCampoGeneralTipoProcesoNomina;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoProcesoNomina;
	//public JList<Reporte> jListColumnasSelectReporteTipoProcesoNomina;
	//public JScrollPane jScrollColumnasSelectReporteTipoProcesoNomina;
	
	//public JLabel jLabelRelacionesSelectReporteTipoProcesoNomina;
	//public JList<Reporte> jListRelacionesSelectReporteTipoProcesoNomina;
	//public JScrollPane jScrollRelacionesSelectReporteTipoProcesoNomina;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoProcesoNomina;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoProcesoNomina;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoProcesoNomina;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoProcesoNomina;
	
		
	//public JLabel jLabelArchivoImportacionTipoProcesoNomina;	
	//public JLabel jLabelPathArchivoImportacionTipoProcesoNomina;
	//protected JTextField jTextFieldPathArchivoImportacionTipoProcesoNomina;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoProcesoNomina;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoProcesoNomina;
	
	//public JLabel jLabelColumnaCategoriaValorTipoProcesoNomina;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoProcesoNomina;
	
	//public JLabel jLabelColumnasValoresGraficoTipoProcesoNomina;
	//public JList<Reporte> jListColumnasValoresGraficoTipoProcesoNomina;
	//public JScrollPane jScrollColumnasValoresGraficoTipoProcesoNomina;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoProcesoNomina;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoProcesoNomina;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	
	
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
	public TipoProcesoNominaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoProcesoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoNominaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProcesoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoNominaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProcesoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProcesoNominaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProcesoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoProcesoNomina)	{
		this.jButtonRecargarInformacionTipoProcesoNomina = jButtonRecargarInformacionTipoProcesoNomina;
	}
	
	public JButton getjButtonProcesarInformacionTipoProcesoNomina() {
		return this.jButtonProcesarInformacionTipoProcesoNomina;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProcesoNomina)	{
		this.jButtonProcesarInformacionTipoProcesoNomina = jButtonProcesarInformacionTipoProcesoNomina;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoProcesoNomina() {
		return this.jButtonRecargarInformacionTipoProcesoNomina;
	}
	
	
	public List<TipoProcesoNomina> gettipoprocesonominas() {
		return this.tipoprocesonominas;
	}

	public void settipoprocesonominas(List<TipoProcesoNomina> tipoprocesonominas) {
		this.tipoprocesonominas = tipoprocesonominas;
	}
	
	public List<TipoProcesoNomina> gettipoprocesonominasAux() {
		return this.tipoprocesonominasAux;
	}

	public void settipoprocesonominasAux(List<TipoProcesoNomina> tipoprocesonominasAux) {
		this.tipoprocesonominasAux = tipoprocesonominasAux;
	}
	
	public List<TipoProcesoNomina> gettipoprocesonominasEliminados() {
		return this.tipoprocesonominasEliminados;
	}

	public void setTipoProcesoNominasEliminados(List<TipoProcesoNomina> tipoprocesonominasEliminados) {
		this.tipoprocesonominasEliminados = tipoprocesonominasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoProcesoNomina() {
		return jComboBoxTiposSeleccionarTipoProcesoNomina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoProcesoNomina(
			JComboBox jComboBoxTiposSeleccionarTipoProcesoNomina) {
		this.jComboBoxTiposSeleccionarTipoProcesoNomina = jComboBoxTiposSeleccionarTipoProcesoNomina;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoProcesoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoProcesoNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoProcesoNomina .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoProcesoNomina() {
		return jTextFieldValorCampoGeneralTipoProcesoNomina;
	}

	public void setjTextFieldValorCampoGeneralTipoProcesoNomina(
			JTextField jTextFieldValorCampoGeneralTipoProcesoNomina) {
		this.jTextFieldValorCampoGeneralTipoProcesoNomina = jTextFieldValorCampoGeneralTipoProcesoNomina;
	}

	public void setBorderResaltarValorCampoGeneralTipoProcesoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoNomina.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoProcesoNomina .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoProcesoNomina() {
		return this.jCheckBoxSeleccionarTodosTipoProcesoNomina;
	}

	public void setjCheckBoxSeleccionarTodosTipoProcesoNomina(
			JCheckBox jCheckBoxSeleccionarTodosTipoProcesoNomina) {
		this.jCheckBoxSeleccionarTodosTipoProcesoNomina = jCheckBoxSeleccionarTodosTipoProcesoNomina;
	}

	public void setBorderResaltarSeleccionarTodosTipoProcesoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoNomina.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoProcesoNomina .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoProcesoNomina() {
		return this.jCheckBoxSeleccionadosTipoProcesoNomina;
	}

	public void setjCheckBoxSeleccionadosTipoProcesoNomina(
			JCheckBox jCheckBoxSeleccionadosTipoProcesoNomina) {
		this.jCheckBoxSeleccionadosTipoProcesoNomina = jCheckBoxSeleccionadosTipoProcesoNomina;
	}
	
	public void setBorderResaltarSeleccionadosTipoProcesoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoNomina.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoProcesoNomina .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoProcesoNomina() {
		return this.jComboBoxTiposArchivosReportesTipoProcesoNomina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoProcesoNomina(
			JComboBox jComboBoxTiposArchivosReportesTipoProcesoNomina) {
		this.jComboBoxTiposArchivosReportesTipoProcesoNomina = jComboBoxTiposArchivosReportesTipoProcesoNomina;
	}

	public void setBorderResaltarTiposArchivosReportesTipoProcesoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoProcesoNomina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoProcesoNomina() {
		return this.jComboBoxTiposReportesTipoProcesoNomina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoProcesoNomina(
			JComboBox jComboBoxTiposReportesTipoProcesoNomina) {
		this.jComboBoxTiposReportesTipoProcesoNomina = jComboBoxTiposReportesTipoProcesoNomina;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoProcesoNomina() {
	//	return jComboBoxTiposReportesDinamicoTipoProcesoNomina;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoProcesoNomina(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoProcesoNomina) {
	//	this.jComboBoxTiposReportesDinamicoTipoProcesoNomina = jComboBoxTiposReportesDinamicoTipoProcesoNomina;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoProcesoNomina() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoProcesoNomina;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoProcesoNomina(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProcesoNomina) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoNomina = jComboBoxTiposArchivosReportesDinamicoTipoProcesoNomina;
	//}
	
	public void setBorderResaltarTiposReportesTipoProcesoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoProcesoNomina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoProcesoNomina() {
		return this.jComboBoxTiposGraficosReportesTipoProcesoNomina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoProcesoNomina(
			JComboBox jComboBoxTiposGraficosReportesTipoProcesoNomina) {
		this.jComboBoxTiposGraficosReportesTipoProcesoNomina = jComboBoxTiposGraficosReportesTipoProcesoNomina;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoProcesoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoProcesoNomina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoProcesoNomina() {
		return this.jComboBoxTiposPaginacionTipoProcesoNomina;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoProcesoNomina(
			JComboBox jComboBoxTiposPaginacionTipoProcesoNomina) {
		this.jComboBoxTiposPaginacionTipoProcesoNomina = jComboBoxTiposPaginacionTipoProcesoNomina;
	}
	
	public void setBorderResaltarTiposPaginacionTipoProcesoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoProcesoNomina .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoProcesoNomina() {
		return this.jComboBoxTiposRelacionesTipoProcesoNomina;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProcesoNomina() {
		return this.jComboBoxTiposAccionesTipoProcesoNomina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProcesoNomina(
			JComboBox jComboBoxTiposRelacionesTipoProcesoNomina) {
		this.jComboBoxTiposRelacionesTipoProcesoNomina = jComboBoxTiposRelacionesTipoProcesoNomina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProcesoNomina(
			JComboBox jComboBoxTiposAccionesTipoProcesoNomina) {
		this.jComboBoxTiposAccionesTipoProcesoNomina = jComboBoxTiposAccionesTipoProcesoNomina;
	}
	
	public void setBorderResaltarTiposRelacionesTipoProcesoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoProcesoNomina .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoProcesoNomina() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProcesoNomina.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoProcesoNomina .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoProcesoNomina() {
	//	return jCheckBoxConGraficoDinamicoTipoProcesoNomina;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoProcesoNomina(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoProcesoNomina) {
	//	this.jCheckBoxConGraficoDinamicoTipoProcesoNomina = jCheckBoxConGraficoDinamicoTipoProcesoNomina;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoProcesoNomina() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoProcesoNomina.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoProcesoNomina .setBorder(borderResaltar);		
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
		this.tipoprocesonominaSessionBean=new TipoProcesoNominaSessionBean();
		
		this.tipoprocesonominaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprocesonominaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprocesonominaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoProcesoNominaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoProcesoNominaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProcesoNominaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProcesoNominaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProcesoNominaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Proceso Nomina MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoProcesoNominaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoProcesoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoProcesoNomina= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoProcesoNomina,this.jTtoolBarTipoProcesoNomina,
							"nuevo","nuevo","Nuevo"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoProcesoNomina,this.jTtoolBarTipoProcesoNomina,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoProcesoNomina,this.jTtoolBarTipoProcesoNomina,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoProcesoNomina,this.jTtoolBarTipoProcesoNomina,
							"duplicar","duplicar","Duplicar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoProcesoNomina,this.jTtoolBarTipoProcesoNomina,
							"copiar","copiar","Copiar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoProcesoNomina,this.jTtoolBarTipoProcesoNomina,
							"ver_form","ver_form","Ver"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProcesoNomina,this.jTtoolBarTipoProcesoNomina,
							"recargar","recargar","Recargar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProcesoNomina,this.jTtoolBarTipoProcesoNomina,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProcesoNomina,this.jTtoolBarTipoProcesoNomina,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoProcesoNomina,this.jTtoolBarTipoProcesoNomina,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoProcesoNomina,this.jTtoolBarTipoProcesoNomina,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoProcesoNomina,this.jTtoolBarTipoProcesoNomina,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoProcesoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoProcesoNomina,this.jTtoolBarTipoProcesoNomina,
							"cerrar","cerrar","Salir"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoProcesoNomina=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoProcesoNomina;
			
				this.jButtonProcesarInformacionToolBarTipoProcesoNomina=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoProcesoNomina;
				
		//protected JButton jButtonModificarToolBarTipoProcesoNomina;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoProcesoNomina=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoProcesoNomina=new JMenuMe("General");
		this.jmenuArchivoTipoProcesoNomina=new JMenuMe("Archivo");
		this.jmenuAccionesTipoProcesoNomina=new JMenuMe("Acciones");
		this.jmenuDatosTipoProcesoNomina=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProcesoNomina= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProcesoNomina.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProcesoNomina,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoProcesoNomina= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoProcesoNomina.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoProcesoNomina,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoProcesoNomina= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoProcesoNomina.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoProcesoNomina,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoProcesoNomina= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProcesoNomina.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProcesoNomina,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoProcesoNomina= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoProcesoNomina.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoProcesoNomina,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoProcesoNomina= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoProcesoNomina.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoProcesoNomina,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoProcesoNomina= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoProcesoNomina.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoProcesoNomina,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProcesoNomina= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProcesoNomina.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProcesoNomina,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoProcesoNomina= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoProcesoNomina.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoProcesoNomina,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoProcesoNomina= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoProcesoNomina.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoProcesoNomina,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoProcesoNomina= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoProcesoNomina.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoProcesoNomina,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoProcesoNomina= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoProcesoNomina.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoProcesoNomina,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoProcesoNomina= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoProcesoNomina.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoProcesoNomina,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProcesoNomina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProcesoNomina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProcesoNomina,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoProcesoNomina= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoProcesoNomina.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoProcesoNomina,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProcesoNomina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProcesoNomina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProcesoNomina,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoProcesoNomina= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoProcesoNomina.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoProcesoNomina,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoProcesoNomina.add(this.jMenuItemCerrarTipoProcesoNomina);
			
			this.jmenuAccionesTipoProcesoNomina.add(this.jMenuItemNuevoTipoProcesoNomina);
			this.jmenuAccionesTipoProcesoNomina.add(this.jMenuItemNuevoGuardarCambiosTipoProcesoNomina);
			this.jmenuAccionesTipoProcesoNomina.add(this.jMenuItemNuevoRelacionesTipoProcesoNomina);
			this.jmenuAccionesTipoProcesoNomina.add(this.jMenuItemGuardarCambiosTablaTipoProcesoNomina);		
			this.jmenuAccionesTipoProcesoNomina.add(this.jMenuItemDuplicarTipoProcesoNomina);		
			this.jmenuAccionesTipoProcesoNomina.add(this.jMenuItemCopiarTipoProcesoNomina);		
			this.jmenuAccionesTipoProcesoNomina.add(this.jMenuItemVerFormTipoProcesoNomina);		
			
			this.jmenuDatosTipoProcesoNomina.add(this.jMenuItemRecargarInformacionTipoProcesoNomina);				
			this.jmenuDatosTipoProcesoNomina.add(this.jMenuItemAnterioresTipoProcesoNomina);				
			this.jmenuDatosTipoProcesoNomina.add(this.jMenuItemSiguientesTipoProcesoNomina);				
			this.jmenuDatosTipoProcesoNomina.add(this.jMenuItemAbrirOrderByTipoProcesoNomina);				
			this.jmenuDatosTipoProcesoNomina.add(this.jMenuItemMostrarOcultarTipoProcesoNomina);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoProcesoNomina.add(this.jMenuItemGuardarCambiosTipoProcesoNomina);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoProcesoNomina.add(this.jmenuArchivoTipoProcesoNomina);		
			this.jmenuBarTipoProcesoNomina.add(this.jmenuAccionesTipoProcesoNomina);		
			this.jmenuBarTipoProcesoNomina.add(this.jmenuDatosTipoProcesoNomina);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoProcesoNomina);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoProcesoNomina() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
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
			//this.jInternalFrameDetalleTipoProcesoNomina = new TipoProcesoNominaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Proceso Nomina DATOS");
			this.jInternalFrameDetalleFormTipoProcesoNomina = new TipoProcesoNominaDetalleFormJInternalFrame(jDesktopPane,this.tipoprocesonominaSessionBean.getConGuardarRelaciones(),this.tipoprocesonominaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoProcesoNomina = null;//new TipoProcesoNominaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProcesoNomina= new GridBagLayout();
		
		
		this.jTableDatosTipoProcesoNomina = new JTableMe();      
		
		String sToolTipTipoProcesoNomina="";
		sToolTipTipoProcesoNomina=TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProcesoNomina+="(Nomina.TipoProcesoNomina)";
		}
		
		if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProcesoNomina+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoProcesoNomina.setToolTipText(sToolTipTipoProcesoNomina);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoProcesoNomina);
		this.jTableDatosTipoProcesoNomina.setAutoCreateRowSorter(true);
		this.jTableDatosTipoProcesoNomina.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoProcesoNomina.setRowSelectionAllowed(true);
		this.jTableDatosTipoProcesoNomina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoProcesoNomina,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoProcesoNomina = new JButtonMe();
		this.jButtonDuplicarTipoProcesoNomina = new JButtonMe();
		this.jButtonCopiarTipoProcesoNomina = new JButtonMe();
		this.jButtonVerFormTipoProcesoNomina = new JButtonMe();
		this.jButtonNuevoRelacionesTipoProcesoNomina = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoProcesoNomina = new JButtonMe();
		this.jButtonCerrarTipoProcesoNomina = new JButtonMe();
		
		this.jScrollPanelDatosTipoProcesoNomina = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoProcesoNomina = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoProcesoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Proceso Nomina";
		
		if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Nominaes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProcesoNomina.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProcesoNomina.setToolTipText("Acciones");
        this.jPanelAccionesTipoProcesoNomina.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoProcesoNomina=new ReporteDinamicoJInternalFrame(TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoProcesoNomina();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoProcesoNomina=new ImportacionJInternalFrame(TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoProcesoNomina();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoProcesoNomina = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoProcesoNomina.setText("Orden");
		this.jButtonAbrirOrderByTipoProcesoNomina.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProcesoNomina,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoProcesoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProcesoNomina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProcesoNomina,false,this);
			
			//this.cargarOrderByTipoProcesoNomina(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProcesoNomina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProcesoNomina,true,this);
			
			//this.cargarOrderByTipoProcesoNomina(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoProcesoNomina.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoProcesoNomina.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoProcesoNomina.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoProcesoNomina.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProcesoNomina.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProcesoNomina.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoProcesoNomina.setText("Nuevo");
		this.jButtonDuplicarTipoProcesoNomina.setText("Duplicar");
		this.jButtonCopiarTipoProcesoNomina.setText("Copiar");
		this.jButtonVerFormTipoProcesoNomina.setText("Ver");
		this.jButtonNuevoRelacionesTipoProcesoNomina.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoProcesoNomina.setText("Guardar");
		this.jButtonCerrarTipoProcesoNomina.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProcesoNomina,"nuevo_button","Nuevo",this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoProcesoNomina,"duplicar_button","Duplicar",this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoProcesoNomina,"copiar_button","Copiar",this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoProcesoNomina,"ver_form","Ver",this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoProcesoNomina,"nuevorelaciones_button","Nuevo Rel",this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProcesoNomina,"guardarcambiostabla_button","Guardar",this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProcesoNomina,"cerrar_button","Salir",this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoProcesoNomina.setToolTipText("Nuevo"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoProcesoNomina.setToolTipText("Duplicar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoProcesoNomina.setToolTipText("Copiar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoProcesoNomina.setToolTipText("Ver"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoProcesoNomina.setToolTipText("Nuevo Rel"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoProcesoNomina.setToolTipText("Guardar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProcesoNomina.setToolTipText("Salir"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProcesoNomina";
		inputMap = this.jButtonNuevoTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProcesoNomina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProcesoNomina"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoProcesoNomina";
		inputMap = this.jButtonDuplicarTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoProcesoNomina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoProcesoNomina"));
		
		//COPIAR
		sMapKey = "CopiarTipoProcesoNomina";
		inputMap = this.jButtonCopiarTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoProcesoNomina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoProcesoNomina"));
		
		//VEr FORM
		sMapKey = "VerFormTipoProcesoNomina";
		inputMap = this.jButtonVerFormTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoProcesoNomina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoProcesoNomina"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoProcesoNomina";
		inputMap = this.jButtonNuevoRelacionesTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoProcesoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoProcesoNomina"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoProcesoNomina";
		inputMap = this.jButtonModificarTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoProcesoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoProcesoNomina"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoProcesoNomina";
		inputMap = this.jButtonCerrarTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProcesoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProcesoNomina"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProcesoNomina";
		inputMap = this.jButtonGuardarCambiosTablaTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProcesoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProcesoNomina"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoProcesoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoProcesoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoProcesoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoProcesoNomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoProcesoNomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoProcesoNomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoProcesoNomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoProcesoNomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoProcesoNomina.setName("jPanelParametrosReportesTipoProcesoNomina"); 
		
		this.jPanelParametrosReportesAccionesTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoProcesoNomina.setName("jPanelParametrosReportesAccionesTipoProcesoNomina"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoProcesoNomina = new JButtonMe();
		this.jButtonRecargarInformacionTipoProcesoNomina.setText("Recargar");
		this.jButtonRecargarInformacionTipoProcesoNomina.setToolTipText("Recargar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoProcesoNomina,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoProcesoNomina = new JButtonMe();
		this.jButtonProcesarInformacionTipoProcesoNomina.setText("Procesar");
		this.jButtonProcesarInformacionTipoProcesoNomina.setToolTipText("Procesar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoProcesoNomina.setVisible(false);
			
		this.jButtonProcesarInformacionTipoProcesoNomina.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProcesoNomina.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProcesoNomina.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoProcesoNomina = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProcesoNomina.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoProcesoNomina.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoProcesoNomina = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProcesoNomina.setText("TIPO");       
		this.jComboBoxTiposReportesTipoProcesoNomina.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoProcesoNomina = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProcesoNomina.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoProcesoNomina.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoProcesoNomina = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoProcesoNomina.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoProcesoNomina.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoProcesoNomina = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoProcesoNomina.setText("Accion");
		this.jComboBoxTiposRelacionesTipoProcesoNomina.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoProcesoNomina = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProcesoNomina.setText("Accion");
		this.jComboBoxTiposAccionesTipoProcesoNomina.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoProcesoNomina = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoProcesoNomina.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoProcesoNomina.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoProcesoNomina=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoProcesoNomina.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProcesoNomina.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProcesoNomina.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoProcesoNomina = new JLabelMe();
		
		this.jLabelAccionesTipoProcesoNomina.setText("Acciones");		
		this.jLabelAccionesTipoProcesoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProcesoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProcesoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoProcesoNomina = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoProcesoNomina.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoProcesoNomina.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoProcesoNomina = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoProcesoNomina.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoProcesoNomina.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoProcesoNomina = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoProcesoNomina.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoProcesoNomina.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoProcesoNomina = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoProcesoNomina.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoProcesoNomina.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoProcesoNomina = new JButtonMe();
		//this.jButtonAnterioresTipoProcesoNomina.setText("<<");
        this.jButtonAnterioresTipoProcesoNomina.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoProcesoNomina,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoProcesoNomina = new JButtonMe();
		//this.jButtonSiguientesTipoProcesoNomina.setText(">>");
        this.jButtonSiguientesTipoProcesoNomina.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoProcesoNomina,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoProcesoNomina = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoProcesoNomina.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoProcesoNomina.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoProcesoNomina,"nuevoguardarcambios_button","Nue",this.tipoprocesonominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoProcesoNomina";
		inputMap = this.jButtonNuevoGuardarCambiosTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoProcesoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoProcesoNomina"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoProcesoNomina";
		inputMap = this.jButtonRecargarInformacionTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoProcesoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoProcesoNomina"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoProcesoNomina";
		inputMap = this.jButtonSiguientesTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoProcesoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoProcesoNomina"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoProcesoNomina";
		inputMap = this.jButtonAnterioresTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoProcesoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoProcesoNomina"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoProcesoNomina();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoProcesoNomina.setMinimumSize(new Dimension(this.getWidth(),TipoProcesoNominaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProcesoNominaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProcesoNomina.setMaximumSize(new Dimension(this.getWidth(),TipoProcesoNominaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProcesoNominaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProcesoNomina.setPreferredSize(new Dimension(this.getWidth(),TipoProcesoNominaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProcesoNominaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoProcesoNomina = new GridBagLayout();

			this.jPanelPaginacionTipoProcesoNomina.setLayout(gridaBagLayoutPaginacionTipoProcesoNomina);						
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoNomina.gridy = 0;
			this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoProcesoNomina.add(this.jButtonAnterioresTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
					
						
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProcesoNomina.gridy = 0;
			
			this.jPanelPaginacionTipoProcesoNomina.add(this.jButtonNuevoGuardarCambiosTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
						
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProcesoNomina.gridy = 0;
			this.jPanelPaginacionTipoProcesoNomina.add(this.jButtonSiguientesTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoNomina.gridy = 1;
			this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProcesoNomina.add(this.jButtonNuevoTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
						
			
			
			if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
				this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProcesoNomina.gridy = 1;
				this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoProcesoNomina.add(this.jButtonGuardarCambiosTablaTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
			}
			
			
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoNomina.gridy = 1;
			this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProcesoNomina.add(this.jButtonDuplicarTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoNomina.gridy = 1;
			this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProcesoNomina.add(this.jButtonCopiarTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoNomina.gridy = 1;
			this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProcesoNomina.add(this.jButtonVerFormTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoNomina.gridy = 1;
			this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoProcesoNomina.add(this.jButtonCerrarTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		
		
		
		this.jButtonRecargarInformacionTipoProcesoNomina.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProcesoNomina.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProcesoNomina.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoProcesoNomina.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProcesoNomina.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProcesoNomina.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoProcesoNomina.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProcesoNomina.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProcesoNomina.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoProcesoNomina.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProcesoNomina.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProcesoNomina.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoProcesoNomina.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProcesoNomina.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProcesoNomina.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoProcesoNomina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProcesoNomina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProcesoNomina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoProcesoNomina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProcesoNomina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProcesoNomina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoProcesoNomina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProcesoNomina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProcesoNomina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoProcesoNomina.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProcesoNomina.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProcesoNomina.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoProcesoNomina.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProcesoNomina.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProcesoNomina.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoProcesoNomina.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProcesoNomina.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProcesoNomina.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoProcesoNomina.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProcesoNomina.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProcesoNomina.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoProcesoNomina = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoProcesoNomina = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoProcesoNomina = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoProcesoNomina = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoProcesoNomina = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoProcesoNomina = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoProcesoNomina.setLayout(gridaBagParametrosReportesTipoProcesoNomina);
			this.jPanelParametrosReportesAccionesTipoProcesoNomina.setLayout(gridaBagParametrosReportesAccionesTipoProcesoNomina);
			
			
			this.jPanelParametrosAuxiliar1TipoProcesoNomina.setLayout(gridaBagParametrosAuxiliar1TipoProcesoNomina);
			this.jPanelParametrosAuxiliar2TipoProcesoNomina.setLayout(gridaBagParametrosAuxiliar2TipoProcesoNomina);
			this.jPanelParametrosAuxiliar3TipoProcesoNomina.setLayout(gridaBagParametrosAuxiliar3TipoProcesoNomina);
			this.jPanelParametrosAuxiliar4TipoProcesoNomina.setLayout(gridaBagParametrosAuxiliar4TipoProcesoNomina);
			//this.jPanelParametrosAuxiliar5TipoProcesoNomina.setLayout(gridaBagParametrosAuxiliar2TipoProcesoNomina);			
			
			
			
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoNomina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProcesoNomina.add(this.jButtonRecargarInformacionTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoNomina.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProcesoNomina.add(this.jComboBoxTiposPaginacionTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoNomina.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProcesoNomina.add(this.jCheckBoxConAltoMaximoTablaTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoNomina.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProcesoNomina.add(this.jComboBoxTiposArchivosReportesTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoNomina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProcesoNomina.add(this.jPanelParametrosAuxiliar1TipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoNomina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoNomina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoProcesoNomina.add(this.jComboBoxTiposReportesTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoNomina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProcesoNomina.add(this.jPanelParametrosAuxiliar4TipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoNomina.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProcesoNomina.add(this.jComboBoxTiposReportesTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoNomina.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProcesoNomina.add(this.jCheckBoxGenerarReporteTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoNomina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProcesoNomina.add(this.jPanelParametrosAuxiliar2TipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoNomina.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProcesoNomina.add(this.jLabelAccionesTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
				this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoProcesoNomina.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoProcesoNomina.add(this.jButtonAbrirOrderByTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoNomina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProcesoNomina.add(this.jComboBoxTiposSeleccionarTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);			
			
			
			/*
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoNomina.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProcesoNomina.add(this.jCheckBoxSeleccionarTodosTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoNomina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoNomina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProcesoNomina.add(this.jCheckBoxSeleccionarTodosTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);															
				
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoNomina.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProcesoNomina.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProcesoNomina.add(this.jCheckBoxSeleccionadosTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoNomina.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProcesoNomina.add(this.jPanelParametrosAuxiliar3TipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProcesoNomina.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProcesoNomina.add(this.jComboBoxTiposAccionesTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoProcesoNomina = new GridBagLayout();

			this.jScrollPanelDatosTipoProcesoNomina.setLayout(gridaBagLayoutDatosTipoProcesoNomina);
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoNomina.gridy = 0;
			this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
			
			this.jScrollPanelDatosTipoProcesoNomina.add(this.jTableDatosTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoProcesoNomina.setViewportView(this.jTableDatosTipoProcesoNomina);
		this.jTableDatosTipoProcesoNomina.setFillsViewportHeight(true);
		this.jTableDatosTipoProcesoNomina.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoProcesoNomina= new GridBagLayout();
		this.jPanelAccionesTipoProcesoNomina.setLayout(gridaBagLayoutAccionesTipoProcesoNomina);
		
		
		/*	
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = 0;
		this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
			
		this.jPanelAccionesTipoProcesoNomina.add(this.jButtonNuevoTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProcesoNomina = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProcesoNomina);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();						
			this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProcesoNomina.gridx = 0;		
			//this.gridBagConstraintsTipoProcesoNomina.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProcesoNomina.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoProcesoNomina.gridx = 0;		
		//this.gridBagConstraintsTipoProcesoNomina.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoNomina.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoProcesoNomina.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoProcesoNomina);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);								
		
		
		/*
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		*/		
		
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProcesoNomina.gridx =0;
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProcesoNomina.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
				
		
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoProcesoNominaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoProcesoNomina= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProcesoNomina = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoProcesoNomina.setLayout(gridaBagLayoutBusquedasParametrosTipoProcesoNomina);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoProcesoNomina=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProcesoNomina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProcesoNomina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProcesoNomina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
			
			
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		
			
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProcesoNomina.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoProcesoNomina;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoProcesoNomina() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoProcesoNomina = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoProcesoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoProcesoNomina.setName("jPanelReporteDinamicoTipoProcesoNomina"); 
		
		this.jPanelReporteDinamicoTipoProcesoNomina.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProcesoNomina.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProcesoNomina.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoProcesoNomina.setLayout(gridaBagLayoutReporteDinamicoTipoProcesoNomina);
		
		
		this.jInternalFrameReporteDinamicoTipoProcesoNomina= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoProcesoNomina = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProcesoNomina= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoProcesoNomina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoProcesoNomina.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoProcesoNomina.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoProcesoNomina.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoProcesoNomina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoProcesoNomina.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoProcesoNomina.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoProcesoNomina.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoProcesoNomina.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProcesoNomina.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProcesoNomina.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Nominaes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoProcesoNomina = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoProcesoNomina.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoProcesoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProcesoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProcesoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProcesoNomina.add(this.jLabelColumnasSelectReporteTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoProcesoNomina = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoProcesoNomina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoProcesoNomina.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoProcesoNomina.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProcesoNomina.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProcesoNomina.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoProcesoNomina=new JScrollPane(this.jListColumnasSelectReporteTipoProcesoNomina);
			
			this.jScrollColumnasSelectReporteTipoProcesoNomina.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProcesoNomina.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProcesoNomina.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProcesoNomina.add(this.jListColumnasSelectReporteTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		this.jPanelReporteDinamicoTipoProcesoNomina.add(this.jScrollColumnasSelectReporteTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoProcesoNomina = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoProcesoNomina.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoProcesoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProcesoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProcesoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoProcesoNomina = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoProcesoNomina.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoProcesoNomina.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoProcesoNomina.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProcesoNomina.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProcesoNomina.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoProcesoNomina=new JScrollPane(this.jListRelacionesSelectReporteTipoProcesoNomina);
			
			this.jScrollRelacionesSelectReporteTipoProcesoNomina.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProcesoNomina.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProcesoNomina.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoProcesoNomina = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoProcesoNomina = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoProcesoNomina = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoProcesoNomina = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoProcesoNomina.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoProcesoNomina.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProcesoNomina.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProcesoNomina.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoNomina = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoNomina.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoNomina.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoNomina.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoNomina.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoProcesoNomina = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoProcesoNomina.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoProcesoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProcesoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProcesoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProcesoNomina.add(this.jLabelGenerarExcelReporteDinamicoTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoProcesoNomina = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoProcesoNomina.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoProcesoNomina,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoProcesoNomina.setToolTipText("Generar EXCEL"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		//this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoProcesoNomina.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoProcesoNomina.add(this.jButtonGenerarExcelReporteDinamicoTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProcesoNomina.add(this.jComboBoxTiposReportesDinamicoTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoProcesoNomina = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoProcesoNomina.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoProcesoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProcesoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProcesoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProcesoNomina.add(this.jLabelTiposArchivoReporteDinamicoTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProcesoNomina.add(this.jComboBoxTiposArchivosReportesDinamicoTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoProcesoNomina = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoProcesoNomina.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoProcesoNomina,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoProcesoNomina.setToolTipText("Generar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProcesoNomina.add(this.jButtonGenerarReporteDinamicoTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoProcesoNomina = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoProcesoNomina.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoProcesoNomina,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoProcesoNomina.setToolTipText("Cancelar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProcesoNomina.add(this.jButtonCerrarReporteDinamicoTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoProcesoNomina = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoProcesoNomina= new JScrollPane(jPanelReporteDinamicoTipoProcesoNomina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoProcesoNomina.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProcesoNomina.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProcesoNomina.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Nominaes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoProcesoNomina.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoProcesoNomina.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoProcesoNomina.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoProcesoNomina);
		this.jInternalFrameReporteDinamicoTipoProcesoNomina.getContentPane().add(this.jScrollPanelReporteDinamicoTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoProcesoNomina() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoProcesoNomina = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoProcesoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoProcesoNomina.setName("jPanelImportacionTipoProcesoNomina"); 
		
		this.jPanelImportacionTipoProcesoNomina.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProcesoNomina.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProcesoNomina.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoProcesoNomina.setLayout(gridaBagLayoutImportacionTipoProcesoNomina);
		
		
		this.jInternalFrameImportacionTipoProcesoNomina= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoProcesoNomina= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoProcesoNomina = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProcesoNomina= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoProcesoNomina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProcesoNomina.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProcesoNomina.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoProcesoNomina.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProcesoNomina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProcesoNomina.setResizable(true);
	    this.jInternalFrameImportacionTipoProcesoNomina.setClosable(true);
	    this.jInternalFrameImportacionTipoProcesoNomina.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoProcesoNomina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProcesoNomina.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProcesoNomina.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoProcesoNomina.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProcesoNomina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProcesoNomina.setResizable(true);
	    this.jInternalFrameImportacionTipoProcesoNomina.setClosable(true);
	    this.jInternalFrameImportacionTipoProcesoNomina.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoProcesoNomina.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProcesoNomina.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProcesoNomina.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Nominaes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoProcesoNomina = new JLabelMe();

		this.jLabelArchivoImportacionTipoProcesoNomina.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoProcesoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProcesoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProcesoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProcesoNomina.add(this.jLabelArchivoImportacionTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoProcesoNomina = new JFileChooser();		
		this.jFileChooserImportacionTipoProcesoNomina.setToolTipText("ESCOGER ARCHIVO"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoProcesoNomina = new JButtonMe();
		this.jButtonAbrirImportacionTipoProcesoNomina.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoProcesoNomina,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoProcesoNomina.setToolTipText("Generar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProcesoNomina.add(this.jButtonAbrirImportacionTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoProcesoNomina = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoProcesoNomina.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoProcesoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProcesoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProcesoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProcesoNomina.add(this.jLabelPathArchivoImportacionTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoProcesoNomina=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoProcesoNomina.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProcesoNomina.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProcesoNomina.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProcesoNomina.add(this.jTextFieldPathArchivoImportacionTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoProcesoNomina = new JButtonMe();
		this.jButtonGenerarImportacionTipoProcesoNomina.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoProcesoNomina,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoProcesoNomina.setToolTipText("Generar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProcesoNomina.add(this.jButtonGenerarImportacionTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoProcesoNomina = new JButtonMe();
		this.jButtonCerrarImportacionTipoProcesoNomina.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoProcesoNomina,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoProcesoNomina.setToolTipText("Cancelar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProcesoNomina.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProcesoNomina.add(this.jButtonCerrarImportacionTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoProcesoNomina = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoProcesoNomina= new JScrollPane(jPanelImportacionTipoProcesoNomina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
		this.gridBagConstraintsTipoProcesoNomina.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoProcesoNomina.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoProcesoNomina.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoProcesoNomina.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoProcesoNomina);
		this.jInternalFrameImportacionTipoProcesoNomina.getContentPane().add(this.jScrollPanelImportacionTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoProcesoNomina(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoProcesoNomina = new JButtonMe();
			this.jButtonAbrirOrderByTipoProcesoNomina.setText("Orden");
			this.jButtonAbrirOrderByTipoProcesoNomina.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProcesoNomina,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoProcesoNomina";
			inputMap = this.jButtonAbrirOrderByTipoProcesoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoProcesoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoProcesoNomina"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoProcesoNomina = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoProcesoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoProcesoNomina.setName("jPanelOrderByTipoProcesoNomina"); 
			
			this.jPanelOrderByTipoProcesoNomina.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProcesoNomina.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProcesoNomina.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoProcesoNomina.setLayout(gridaBagLayoutOrderByTipoProcesoNomina);
			
			
			this.jTableDatosTipoProcesoNominaOrderBy = new JTableMe();        
			this.jTableDatosTipoProcesoNominaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoProcesoNominaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoProcesoNominaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoProcesoNominaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoProcesoNominaOrderBy.setViewportView(this.jTableDatosTipoProcesoNominaOrderBy);
			this.jTableDatosTipoProcesoNominaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoProcesoNominaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoProcesoNomina= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoProcesoNomina= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoProcesoNomina = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoProcesoNomina= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoProcesoNomina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoProcesoNomina.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoProcesoNomina.setTitle("Orden");
			this.jInternalFrameOrderByTipoProcesoNomina.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoProcesoNomina.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoProcesoNomina.setResizable(true);
			this.jInternalFrameOrderByTipoProcesoNomina.setClosable(true);
			this.jInternalFrameOrderByTipoProcesoNomina.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoProcesoNomina.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProcesoNomina.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProcesoNomina.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoProcesoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proceso Nominaes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoProcesoNomina.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoProcesoNomina.ipady =150;
				
			this.jPanelOrderByTipoProcesoNomina.add(jScrollPanelDatosTipoProcesoNominaOrderBy, this.gridBagConstraintsTipoProcesoNomina);//this.jTableDatosTipoProcesoNominaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoProcesoNomina = new JButtonMe();
			this.jButtonCerrarOrderByTipoProcesoNomina.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoProcesoNomina,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoProcesoNomina.setToolTipText("Cancelar"+" "+TipoProcesoNominaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoProcesoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProcesoNomina.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoProcesoNomina.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoProcesoNomina.add(this.jButtonCerrarOrderByTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoProcesoNomina = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoProcesoNomina= new JScrollPane(jPanelOrderByTipoProcesoNomina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoProcesoNomina = new GridBagConstraints();
			this.gridBagConstraintsTipoProcesoNomina.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoProcesoNomina.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProcesoNomina.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoProcesoNomina.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoProcesoNomina.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoProcesoNomina);
			
			this.jInternalFrameOrderByTipoProcesoNomina.getContentPane().add(this.jScrollPanelOrderByTipoProcesoNomina, this.gridBagConstraintsTipoProcesoNomina);			
		
		} else {
			this.jButtonAbrirOrderByTipoProcesoNomina = new JButtonMe();
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
		int iWidthTableCalculado=0;//730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoprocesonominaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoProcesoNomina.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoProcesoNomina.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoProcesoNomina.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoProcesoNomina.getRowHeight();//TipoProcesoNominaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoProcesoNominaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProcesoNomina.isSelected()) {
					iHeightTable=TipoProcesoNominaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProcesoNominaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProcesoNominaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoProcesoNominaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProcesoNomina.isSelected()) {
					iHeightTable=TipoProcesoNominaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProcesoNominaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProcesoNominaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoProcesoNomina.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProcesoNomina.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProcesoNomina.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoProcesoNomina.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProcesoNomina.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProcesoNomina.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoProcesoNomina!=null && this.jInternalFrameOrderByTipoProcesoNomina.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoprocesonominaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoProcesoNomina.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoProcesoNomina.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoProcesoNomina.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoProcesoNomina.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoProcesoNomina.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoProcesoNomina.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoProcesoNomina.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoProcesoNomina.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProcesoNomina.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProcesoNomina.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoprocesonominaLogic.getTipoProcesoNominas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprocesonominas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoProcesoNomina> TraerTipoProcesoNominaBeans(List<TipoProcesoNomina> tipoprocesonominas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoProcesoNomina tipoprocesonomina:tipoprocesonominas) {
					
				if(!(TipoProcesoNominaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoProcesoNominaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoprocesonomina.setsDetalleGeneralEntityReporte(TipoProcesoNominaConstantesFunciones.getTipoProcesoNominaDescripcion(tipoprocesonomina));
										
						
					
						
					
				} else  {
							
					//tipoprocesonomina.setsDetalleGeneralEntityReporte(tipoprocesonomina.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoprocesonominabeans.add(tipoprocesonominabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoprocesonominas;
    }
	//PARA REPORTES FIN
}
