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
import com.bydan.erp.nomina.util.TipoColegioProfeConstantesFunciones;

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
public class TipoColegioProfeJInternalFrame extends TipoColegioProfeBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoColegioProfe;
	
	protected JMenuBar jmenuBarTipoColegioProfe;
	
	protected JMenu jmenuTipoColegioProfe;
	protected JMenu jmenuDatosTipoColegioProfe;
	protected JMenu jmenuArchivoTipoColegioProfe;
	protected JMenu jmenuAccionesTipoColegioProfe;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoColegioProfe = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoColegioProfe;	
	protected GridBagConstraints gridBagConstraintsTipoColegioProfe;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoColegioProfeDetalleFormJInternalFrame jInternalFrameDetalleFormTipoColegioProfe;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoColegioProfe;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoColegioProfe;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoColegioProfeSessionBean tipocolegioprofeSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoColegioProfe> tipocolegioprofes;		
	public List<TipoColegioProfe> tipocolegioprofesEliminados;	
	public List<TipoColegioProfe> tipocolegioprofesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoColegioProfe;		
	protected JButton jButtonAbrirOrderByTipoColegioProfe;
	
	
	//protected JPanel jPanelOrderByTipoColegioProfe;
	//public JScrollPane jScrollPanelOrderByTipoColegioProfe;	
	//protected JButton jButtonCerrarOrderByTipoColegioProfe;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoColegioProfeLogic tipocolegioprofeLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoColegioProfe;
	public JScrollPane jScrollPanelDatosEdicionTipoColegioProfe;
	public JScrollPane jScrollPanelDatosGeneralTipoColegioProfe;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoColegioProfeOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoColegioProfe;
	//public JScrollPane jScrollPanelImportacionTipoColegioProfe;
	
	
	
	protected JPanel jPanelAccionesTipoColegioProfe;
	
    protected JPanel jPanelPaginacionTipoColegioProfe;
    protected JPanel jPanelParametrosReportesTipoColegioProfe;
	protected JPanel jPanelParametrosReportesAccionesTipoColegioProfe;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoColegioProfe;
	protected JPanel jPanelParametrosAuxiliar2TipoColegioProfe;
	protected JPanel jPanelParametrosAuxiliar3TipoColegioProfe;
	protected JPanel jPanelParametrosAuxiliar4TipoColegioProfe;
	//protected JPanel jPanelParametrosAuxiliar5TipoColegioProfe;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoColegioProfe;
	//protected JPanel jPanelImportacionTipoColegioProfe;
	
	
	public JTable jTableDatosTipoColegioProfe;
	
	
	
	//public JTable jTableDatosTipoColegioProfeOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoColegioProfe;
	protected JButton jButtonDuplicarTipoColegioProfe;
	protected JButton jButtonCopiarTipoColegioProfe;
	protected JButton jButtonVerFormTipoColegioProfe;
	protected JButton jButtonNuevoRelacionesTipoColegioProfe;
	protected JButton jButtonModificarTipoColegioProfe;
	
    protected JButton jButtonGuardarCambiosTablaTipoColegioProfe;
	protected JButton jButtonCerrarTipoColegioProfe;
	
	
	protected JButton jButtonRecargarInformacionTipoColegioProfe;
	protected JButton jButtonProcesarInformacionTipoColegioProfe;
	
	
	protected JButton jButtonAnterioresTipoColegioProfe;
	protected JButton jButtonSiguientesTipoColegioProfe;
	protected JButton jButtonNuevoGuardarCambiosTipoColegioProfe;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoColegioProfe;
	//protected JButton jButtonCerrarReporteDinamicoTipoColegioProfe;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoColegioProfe;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoColegioProfe;
	//protected JButton jButtonGenerarImportacionTipoColegioProfe;
	//protected JButton jButtonCerrarImportacionTipoColegioProfe;
	//protected JFileChooser jFileChooserImportacionTipoColegioProfe;
	//protected File fileImportacionTipoColegioProfe;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoColegioProfe;
	protected JButton jButtonDuplicarToolBarTipoColegioProfe;
	protected JButton jButtonNuevoRelacionesToolBarTipoColegioProfe;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoColegioProfe;
	protected JButton jButtonCopiarToolBarTipoColegioProfe;
	protected JButton jButtonVerFormToolBarTipoColegioProfe;
	public JButton jButtonGuardarCambiosTablaToolBarTipoColegioProfe;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoColegioProfe;
	protected JButton jButtonCerrarToolBarTipoColegioProfe;
	
	protected JButton jButtonRecargarInformacionToolBarTipoColegioProfe;
	protected JButton jButtonProcesarInformacionToolBarTipoColegioProfe;
	protected JButton jButtonAnterioresToolBarTipoColegioProfe;
	protected JButton jButtonSiguientesToolBarTipoColegioProfe;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoColegioProfe;
	protected JButton jButtonAbrirOrderByToolBarTipoColegioProfe;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoColegioProfe;
	protected JMenuItem jMenuItemDuplicarTipoColegioProfe;
	protected JMenuItem jMenuItemNuevoRelacionesTipoColegioProfe;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoColegioProfe;
	protected JMenuItem jMenuItemCopiarTipoColegioProfe;
	protected JMenuItem jMenuItemVerFormTipoColegioProfe;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoColegioProfe;
	protected JMenuItem jMenuItemCerrarTipoColegioProfe;
	protected JMenuItem jMenuItemDetalleCerrarTipoColegioProfe;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoColegioProfe;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoColegioProfe;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoColegioProfe;
	protected JMenuItem jMenuItemProcesarInformacionTipoColegioProfe;
	protected JMenuItem jMenuItemAnterioresTipoColegioProfe;
	protected JMenuItem jMenuItemSiguientesTipoColegioProfe;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoColegioProfe;
	protected JMenuItem jMenuItemAbrirOrderByTipoColegioProfe;
	protected JMenuItem jMenuItemMostrarOcultarTipoColegioProfe;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoColegioProfe;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoColegioProfe;
	protected JCheckBox jCheckBoxSeleccionadosTipoColegioProfe;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoColegioProfe;
	protected JCheckBox jCheckBoxConGraficoReporteTipoColegioProfe;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoColegioProfe;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoColegioProfe;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoColegioProfe;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoColegioProfe;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoColegioProfe;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoColegioProfe;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoColegioProfe;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoColegioProfe;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoColegioProfe;
	protected JTextField jTextFieldValorCampoGeneralTipoColegioProfe;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoColegioProfe;
	//public JList<Reporte> jListColumnasSelectReporteTipoColegioProfe;
	//public JScrollPane jScrollColumnasSelectReporteTipoColegioProfe;
	
	//public JLabel jLabelRelacionesSelectReporteTipoColegioProfe;
	//public JList<Reporte> jListRelacionesSelectReporteTipoColegioProfe;
	//public JScrollPane jScrollRelacionesSelectReporteTipoColegioProfe;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoColegioProfe;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoColegioProfe;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoColegioProfe;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoColegioProfe;
	
		
	//public JLabel jLabelArchivoImportacionTipoColegioProfe;	
	//public JLabel jLabelPathArchivoImportacionTipoColegioProfe;
	//protected JTextField jTextFieldPathArchivoImportacionTipoColegioProfe;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoColegioProfe;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoColegioProfe;
	
	//public JLabel jLabelColumnaCategoriaValorTipoColegioProfe;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoColegioProfe;
	
	//public JLabel jLabelColumnasValoresGraficoTipoColegioProfe;
	//public JList<Reporte> jListColumnasValoresGraficoTipoColegioProfe;
	//public JScrollPane jScrollColumnasValoresGraficoTipoColegioProfe;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoColegioProfe;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoColegioProfe;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoColegioProfe;
	
	
	
	
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
	public TipoColegioProfeJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoColegioProfe No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoColegioProfeJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoColegioProfe No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoColegioProfeJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoColegioProfe No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoColegioProfeJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoColegioProfe No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoColegioProfe)	{
		this.jButtonRecargarInformacionTipoColegioProfe = jButtonRecargarInformacionTipoColegioProfe;
	}
	
	public JButton getjButtonProcesarInformacionTipoColegioProfe() {
		return this.jButtonProcesarInformacionTipoColegioProfe;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoColegioProfe)	{
		this.jButtonProcesarInformacionTipoColegioProfe = jButtonProcesarInformacionTipoColegioProfe;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoColegioProfe() {
		return this.jButtonRecargarInformacionTipoColegioProfe;
	}
	
	
	public List<TipoColegioProfe> gettipocolegioprofes() {
		return this.tipocolegioprofes;
	}

	public void settipocolegioprofes(List<TipoColegioProfe> tipocolegioprofes) {
		this.tipocolegioprofes = tipocolegioprofes;
	}
	
	public List<TipoColegioProfe> gettipocolegioprofesAux() {
		return this.tipocolegioprofesAux;
	}

	public void settipocolegioprofesAux(List<TipoColegioProfe> tipocolegioprofesAux) {
		this.tipocolegioprofesAux = tipocolegioprofesAux;
	}
	
	public List<TipoColegioProfe> gettipocolegioprofesEliminados() {
		return this.tipocolegioprofesEliminados;
	}

	public void setTipoColegioProfesEliminados(List<TipoColegioProfe> tipocolegioprofesEliminados) {
		this.tipocolegioprofesEliminados = tipocolegioprofesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoColegioProfe() {
		return jComboBoxTiposSeleccionarTipoColegioProfe;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoColegioProfe(
			JComboBox jComboBoxTiposSeleccionarTipoColegioProfe) {
		this.jComboBoxTiposSeleccionarTipoColegioProfe = jComboBoxTiposSeleccionarTipoColegioProfe;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoColegioProfe() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoColegioProfe.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoColegioProfe .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoColegioProfe() {
		return jTextFieldValorCampoGeneralTipoColegioProfe;
	}

	public void setjTextFieldValorCampoGeneralTipoColegioProfe(
			JTextField jTextFieldValorCampoGeneralTipoColegioProfe) {
		this.jTextFieldValorCampoGeneralTipoColegioProfe = jTextFieldValorCampoGeneralTipoColegioProfe;
	}

	public void setBorderResaltarValorCampoGeneralTipoColegioProfe() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoColegioProfe.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoColegioProfe .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoColegioProfe() {
		return this.jCheckBoxSeleccionarTodosTipoColegioProfe;
	}

	public void setjCheckBoxSeleccionarTodosTipoColegioProfe(
			JCheckBox jCheckBoxSeleccionarTodosTipoColegioProfe) {
		this.jCheckBoxSeleccionarTodosTipoColegioProfe = jCheckBoxSeleccionarTodosTipoColegioProfe;
	}

	public void setBorderResaltarSeleccionarTodosTipoColegioProfe() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoColegioProfe.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoColegioProfe .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoColegioProfe() {
		return this.jCheckBoxSeleccionadosTipoColegioProfe;
	}

	public void setjCheckBoxSeleccionadosTipoColegioProfe(
			JCheckBox jCheckBoxSeleccionadosTipoColegioProfe) {
		this.jCheckBoxSeleccionadosTipoColegioProfe = jCheckBoxSeleccionadosTipoColegioProfe;
	}
	
	public void setBorderResaltarSeleccionadosTipoColegioProfe() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoColegioProfe.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoColegioProfe .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoColegioProfe() {
		return this.jComboBoxTiposArchivosReportesTipoColegioProfe;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoColegioProfe(
			JComboBox jComboBoxTiposArchivosReportesTipoColegioProfe) {
		this.jComboBoxTiposArchivosReportesTipoColegioProfe = jComboBoxTiposArchivosReportesTipoColegioProfe;
	}

	public void setBorderResaltarTiposArchivosReportesTipoColegioProfe() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoColegioProfe.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoColegioProfe .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoColegioProfe() {
		return this.jComboBoxTiposReportesTipoColegioProfe;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoColegioProfe(
			JComboBox jComboBoxTiposReportesTipoColegioProfe) {
		this.jComboBoxTiposReportesTipoColegioProfe = jComboBoxTiposReportesTipoColegioProfe;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoColegioProfe() {
	//	return jComboBoxTiposReportesDinamicoTipoColegioProfe;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoColegioProfe(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoColegioProfe) {
	//	this.jComboBoxTiposReportesDinamicoTipoColegioProfe = jComboBoxTiposReportesDinamicoTipoColegioProfe;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoColegioProfe() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoColegioProfe;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoColegioProfe(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoColegioProfe) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoColegioProfe = jComboBoxTiposArchivosReportesDinamicoTipoColegioProfe;
	//}
	
	public void setBorderResaltarTiposReportesTipoColegioProfe() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoColegioProfe.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoColegioProfe .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoColegioProfe() {
		return this.jComboBoxTiposGraficosReportesTipoColegioProfe;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoColegioProfe(
			JComboBox jComboBoxTiposGraficosReportesTipoColegioProfe) {
		this.jComboBoxTiposGraficosReportesTipoColegioProfe = jComboBoxTiposGraficosReportesTipoColegioProfe;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoColegioProfe() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoColegioProfe.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoColegioProfe .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoColegioProfe() {
		return this.jComboBoxTiposPaginacionTipoColegioProfe;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoColegioProfe(
			JComboBox jComboBoxTiposPaginacionTipoColegioProfe) {
		this.jComboBoxTiposPaginacionTipoColegioProfe = jComboBoxTiposPaginacionTipoColegioProfe;
	}
	
	public void setBorderResaltarTiposPaginacionTipoColegioProfe() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoColegioProfe.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoColegioProfe .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoColegioProfe() {
		return this.jComboBoxTiposRelacionesTipoColegioProfe;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoColegioProfe() {
		return this.jComboBoxTiposAccionesTipoColegioProfe;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoColegioProfe(
			JComboBox jComboBoxTiposRelacionesTipoColegioProfe) {
		this.jComboBoxTiposRelacionesTipoColegioProfe = jComboBoxTiposRelacionesTipoColegioProfe;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoColegioProfe(
			JComboBox jComboBoxTiposAccionesTipoColegioProfe) {
		this.jComboBoxTiposAccionesTipoColegioProfe = jComboBoxTiposAccionesTipoColegioProfe;
	}
	
	public void setBorderResaltarTiposRelacionesTipoColegioProfe() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoColegioProfe.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoColegioProfe .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoColegioProfe() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoColegioProfe.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoColegioProfe .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoColegioProfe() {
	//	return jCheckBoxConGraficoDinamicoTipoColegioProfe;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoColegioProfe(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoColegioProfe) {
	//	this.jCheckBoxConGraficoDinamicoTipoColegioProfe = jCheckBoxConGraficoDinamicoTipoColegioProfe;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoColegioProfe() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoColegioProfe.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoColegioProfe .setBorder(borderResaltar);		
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
		this.tipocolegioprofeSessionBean=new TipoColegioProfeSessionBean();
		
		this.tipocolegioprofeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocolegioprofeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocolegioprofeSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoColegioProfeJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoColegioProfeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoColegioProfeJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoColegioProfeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoColegioProfeJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Colegio Profe MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoColegioProfeJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoColegioProfe No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoColegioProfe= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoColegioProfe,this.jTtoolBarTipoColegioProfe,
							"nuevo","nuevo","Nuevo"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoColegioProfe,this.jTtoolBarTipoColegioProfe,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoColegioProfe,this.jTtoolBarTipoColegioProfe,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoColegioProfe,this.jTtoolBarTipoColegioProfe,
							"duplicar","duplicar","Duplicar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoColegioProfe,this.jTtoolBarTipoColegioProfe,
							"copiar","copiar","Copiar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoColegioProfe,this.jTtoolBarTipoColegioProfe,
							"ver_form","ver_form","Ver"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoColegioProfe,this.jTtoolBarTipoColegioProfe,
							"recargar","recargar","Recargar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoColegioProfe,this.jTtoolBarTipoColegioProfe,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoColegioProfe,this.jTtoolBarTipoColegioProfe,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoColegioProfe,this.jTtoolBarTipoColegioProfe,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoColegioProfe,this.jTtoolBarTipoColegioProfe,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoColegioProfe,this.jTtoolBarTipoColegioProfe,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoColegioProfe,this.jTtoolBarTipoColegioProfe,
							"cerrar","cerrar","Salir"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoColegioProfe=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoColegioProfe;
			
				this.jButtonProcesarInformacionToolBarTipoColegioProfe=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoColegioProfe;
				
		//protected JButton jButtonModificarToolBarTipoColegioProfe;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoColegioProfe=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoColegioProfe=new JMenuMe("General");
		this.jmenuArchivoTipoColegioProfe=new JMenuMe("Archivo");
		this.jmenuAccionesTipoColegioProfe=new JMenuMe("Acciones");
		this.jmenuDatosTipoColegioProfe=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoColegioProfe= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoColegioProfe.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoColegioProfe,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoColegioProfe= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoColegioProfe.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoColegioProfe,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoColegioProfe= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoColegioProfe.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoColegioProfe,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoColegioProfe= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoColegioProfe.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoColegioProfe,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoColegioProfe= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoColegioProfe.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoColegioProfe,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoColegioProfe= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoColegioProfe.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoColegioProfe,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoColegioProfe= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoColegioProfe.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoColegioProfe,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoColegioProfe= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoColegioProfe.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoColegioProfe,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoColegioProfe= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoColegioProfe.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoColegioProfe,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoColegioProfe= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoColegioProfe.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoColegioProfe,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoColegioProfe= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoColegioProfe.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoColegioProfe,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoColegioProfe= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoColegioProfe.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoColegioProfe,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoColegioProfe= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoColegioProfe.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoColegioProfe,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoColegioProfe= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoColegioProfe.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoColegioProfe,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoColegioProfe= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoColegioProfe.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoColegioProfe,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoColegioProfe= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoColegioProfe.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoColegioProfe,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoColegioProfe= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoColegioProfe.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoColegioProfe,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoColegioProfe.add(this.jMenuItemCerrarTipoColegioProfe);
			
			this.jmenuAccionesTipoColegioProfe.add(this.jMenuItemNuevoTipoColegioProfe);
			this.jmenuAccionesTipoColegioProfe.add(this.jMenuItemNuevoGuardarCambiosTipoColegioProfe);
			this.jmenuAccionesTipoColegioProfe.add(this.jMenuItemNuevoRelacionesTipoColegioProfe);
			this.jmenuAccionesTipoColegioProfe.add(this.jMenuItemGuardarCambiosTablaTipoColegioProfe);		
			this.jmenuAccionesTipoColegioProfe.add(this.jMenuItemDuplicarTipoColegioProfe);		
			this.jmenuAccionesTipoColegioProfe.add(this.jMenuItemCopiarTipoColegioProfe);		
			this.jmenuAccionesTipoColegioProfe.add(this.jMenuItemVerFormTipoColegioProfe);		
			
			this.jmenuDatosTipoColegioProfe.add(this.jMenuItemRecargarInformacionTipoColegioProfe);				
			this.jmenuDatosTipoColegioProfe.add(this.jMenuItemAnterioresTipoColegioProfe);				
			this.jmenuDatosTipoColegioProfe.add(this.jMenuItemSiguientesTipoColegioProfe);				
			this.jmenuDatosTipoColegioProfe.add(this.jMenuItemAbrirOrderByTipoColegioProfe);				
			this.jmenuDatosTipoColegioProfe.add(this.jMenuItemMostrarOcultarTipoColegioProfe);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoColegioProfe.add(this.jMenuItemGuardarCambiosTipoColegioProfe);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoColegioProfe.add(this.jmenuArchivoTipoColegioProfe);		
			this.jmenuBarTipoColegioProfe.add(this.jmenuAccionesTipoColegioProfe);		
			this.jmenuBarTipoColegioProfe.add(this.jmenuDatosTipoColegioProfe);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoColegioProfe);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoColegioProfe() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoColegioProfe=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoColegioProfe.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoColegioProfe.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoColegioProfe.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoColegioProfe.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoColegioProfe,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoColegioProfe = new TipoColegioProfeDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Colegio Profe DATOS");
			this.jInternalFrameDetalleFormTipoColegioProfe = new TipoColegioProfeDetalleFormJInternalFrame(jDesktopPane,this.tipocolegioprofeSessionBean.getConGuardarRelaciones(),this.tipocolegioprofeSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoColegioProfe = null;//new TipoColegioProfeDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoColegioProfe= new GridBagLayout();
		
		
		this.jTableDatosTipoColegioProfe = new JTableMe();      
		
		String sToolTipTipoColegioProfe="";
		sToolTipTipoColegioProfe=TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoColegioProfe+="(Nomina.TipoColegioProfe)";
		}
		
		if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoColegioProfe+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoColegioProfe.setToolTipText(sToolTipTipoColegioProfe);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoColegioProfe);
		this.jTableDatosTipoColegioProfe.setAutoCreateRowSorter(true);
		this.jTableDatosTipoColegioProfe.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoColegioProfe.setRowSelectionAllowed(true);
		this.jTableDatosTipoColegioProfe.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoColegioProfe,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoColegioProfe = new JButtonMe();
		this.jButtonDuplicarTipoColegioProfe = new JButtonMe();
		this.jButtonCopiarTipoColegioProfe = new JButtonMe();
		this.jButtonVerFormTipoColegioProfe = new JButtonMe();
		this.jButtonNuevoRelacionesTipoColegioProfe = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoColegioProfe = new JButtonMe();
		this.jButtonCerrarTipoColegioProfe = new JButtonMe();
		
		this.jScrollPanelDatosTipoColegioProfe = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoColegioProfe = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoColegioProfe = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Colegio Profe";
		
		if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Colegio Profes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoColegioProfe.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoColegioProfe.setToolTipText("Acciones");
        this.jPanelAccionesTipoColegioProfe.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoColegioProfe=new ReporteDinamicoJInternalFrame(TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoColegioProfe();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoColegioProfe=new ImportacionJInternalFrame(TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoColegioProfe();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoColegioProfe = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoColegioProfe.setText("Orden");
		this.jButtonAbrirOrderByTipoColegioProfe.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoColegioProfe,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoColegioProfe.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoColegioProfe=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoColegioProfe,false,this);
			
			//this.cargarOrderByTipoColegioProfe(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoColegioProfe=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoColegioProfe,true,this);
			
			//this.cargarOrderByTipoColegioProfe(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoColegioProfe.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoColegioProfe.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoColegioProfe.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoColegioProfe.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoColegioProfe.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoColegioProfe.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoColegioProfe.setText("Nuevo");
		this.jButtonDuplicarTipoColegioProfe.setText("Duplicar");
		this.jButtonCopiarTipoColegioProfe.setText("Copiar");
		this.jButtonVerFormTipoColegioProfe.setText("Ver");
		this.jButtonNuevoRelacionesTipoColegioProfe.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoColegioProfe.setText("Guardar");
		this.jButtonCerrarTipoColegioProfe.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoColegioProfe,"nuevo_button","Nuevo",this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoColegioProfe,"duplicar_button","Duplicar",this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoColegioProfe,"copiar_button","Copiar",this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoColegioProfe,"ver_form","Ver",this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoColegioProfe,"nuevorelaciones_button","Nuevo Rel",this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoColegioProfe,"guardarcambiostabla_button","Guardar",this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoColegioProfe,"cerrar_button","Salir",this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoColegioProfe.setToolTipText("Nuevo"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoColegioProfe.setToolTipText("Duplicar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoColegioProfe.setToolTipText("Copiar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoColegioProfe.setToolTipText("Ver"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoColegioProfe.setToolTipText("Nuevo Rel"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoColegioProfe.setToolTipText("Guardar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoColegioProfe.setToolTipText("Salir"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoColegioProfe";
		inputMap = this.jButtonNuevoTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoColegioProfe.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoColegioProfe"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoColegioProfe";
		inputMap = this.jButtonDuplicarTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoColegioProfe.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoColegioProfe"));
		
		//COPIAR
		sMapKey = "CopiarTipoColegioProfe";
		inputMap = this.jButtonCopiarTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoColegioProfe.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoColegioProfe"));
		
		//VEr FORM
		sMapKey = "VerFormTipoColegioProfe";
		inputMap = this.jButtonVerFormTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoColegioProfe.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoColegioProfe"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoColegioProfe";
		inputMap = this.jButtonNuevoRelacionesTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoColegioProfe.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoColegioProfe"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoColegioProfe";
		inputMap = this.jButtonModificarTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoColegioProfe.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoColegioProfe"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoColegioProfe";
		inputMap = this.jButtonCerrarTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoColegioProfe.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoColegioProfe"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoColegioProfe";
		inputMap = this.jButtonGuardarCambiosTablaTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoColegioProfe.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoColegioProfe"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoColegioProfe = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoColegioProfe = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoColegioProfe = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoColegioProfe= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoColegioProfe= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoColegioProfe= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoColegioProfe= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoColegioProfe= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoColegioProfe.setName("jPanelParametrosReportesTipoColegioProfe"); 
		
		this.jPanelParametrosReportesAccionesTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoColegioProfe.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoColegioProfe.setName("jPanelParametrosReportesAccionesTipoColegioProfe"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoColegioProfe = new JButtonMe();
		this.jButtonRecargarInformacionTipoColegioProfe.setText("Recargar");
		this.jButtonRecargarInformacionTipoColegioProfe.setToolTipText("Recargar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoColegioProfe,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoColegioProfe = new JButtonMe();
		this.jButtonProcesarInformacionTipoColegioProfe.setText("Procesar");
		this.jButtonProcesarInformacionTipoColegioProfe.setToolTipText("Procesar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoColegioProfe.setVisible(false);
			
		this.jButtonProcesarInformacionTipoColegioProfe.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoColegioProfe.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoColegioProfe.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoColegioProfe = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoColegioProfe.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoColegioProfe.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoColegioProfe = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoColegioProfe.setText("TIPO");       
		this.jComboBoxTiposReportesTipoColegioProfe.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoColegioProfe = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoColegioProfe.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoColegioProfe.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoColegioProfe = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoColegioProfe.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoColegioProfe.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoColegioProfe = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoColegioProfe.setText("Accion");
		this.jComboBoxTiposRelacionesTipoColegioProfe.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoColegioProfe = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoColegioProfe.setText("Accion");
		this.jComboBoxTiposAccionesTipoColegioProfe.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoColegioProfe = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoColegioProfe.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoColegioProfe.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoColegioProfe=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoColegioProfe.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoColegioProfe.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoColegioProfe.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoColegioProfe = new JLabelMe();
		
		this.jLabelAccionesTipoColegioProfe.setText("Acciones");		
		this.jLabelAccionesTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoColegioProfe = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoColegioProfe.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoColegioProfe.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoColegioProfe = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoColegioProfe.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoColegioProfe.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoColegioProfe = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoColegioProfe.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoColegioProfe.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoColegioProfe = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoColegioProfe.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoColegioProfe.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoColegioProfe = new JButtonMe();
		//this.jButtonAnterioresTipoColegioProfe.setText("<<");
        this.jButtonAnterioresTipoColegioProfe.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoColegioProfe,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoColegioProfe = new JButtonMe();
		//this.jButtonSiguientesTipoColegioProfe.setText(">>");
        this.jButtonSiguientesTipoColegioProfe.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoColegioProfe,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoColegioProfe = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoColegioProfe.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoColegioProfe.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoColegioProfe,"nuevoguardarcambios_button","Nue",this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoColegioProfe";
		inputMap = this.jButtonNuevoGuardarCambiosTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoColegioProfe.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoColegioProfe"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoColegioProfe";
		inputMap = this.jButtonRecargarInformacionTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoColegioProfe.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoColegioProfe"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoColegioProfe";
		inputMap = this.jButtonSiguientesTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoColegioProfe.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoColegioProfe"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoColegioProfe";
		inputMap = this.jButtonAnterioresTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoColegioProfe.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoColegioProfe"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoColegioProfe();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoColegioProfe.setMinimumSize(new Dimension(this.getWidth(),TipoColegioProfeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoColegioProfeBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoColegioProfe.setMaximumSize(new Dimension(this.getWidth(),TipoColegioProfeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoColegioProfeBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoColegioProfe.setPreferredSize(new Dimension(this.getWidth(),TipoColegioProfeBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoColegioProfeBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoColegioProfe = new GridBagLayout();

			this.jPanelPaginacionTipoColegioProfe.setLayout(gridaBagLayoutPaginacionTipoColegioProfe);						
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoColegioProfe.gridy = 0;
			this.gridBagConstraintsTipoColegioProfe.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoColegioProfe.add(this.jButtonAnterioresTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
					
						
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoColegioProfe.gridy = 0;
			
			this.jPanelPaginacionTipoColegioProfe.add(this.jButtonNuevoGuardarCambiosTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
						
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoColegioProfe.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoColegioProfe.gridy = 0;
			this.jPanelPaginacionTipoColegioProfe.add(this.jButtonSiguientesTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoColegioProfe.gridy = 1;
			this.gridBagConstraintsTipoColegioProfe.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoColegioProfe.add(this.jButtonNuevoTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
						
			
			
			if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
				this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoColegioProfe.gridy = 1;
				this.gridBagConstraintsTipoColegioProfe.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoColegioProfe.add(this.jButtonGuardarCambiosTablaTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
			}
			
			
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoColegioProfe.gridy = 1;
			this.gridBagConstraintsTipoColegioProfe.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoColegioProfe.add(this.jButtonDuplicarTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoColegioProfe.gridy = 1;
			this.gridBagConstraintsTipoColegioProfe.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoColegioProfe.add(this.jButtonCopiarTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoColegioProfe.gridy = 1;
			this.gridBagConstraintsTipoColegioProfe.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoColegioProfe.add(this.jButtonVerFormTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoColegioProfe.gridy = 1;
			this.gridBagConstraintsTipoColegioProfe.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoColegioProfe.add(this.jButtonCerrarTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		
		
		
		this.jButtonRecargarInformacionTipoColegioProfe.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoColegioProfe.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoColegioProfe.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoColegioProfe.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoColegioProfe.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoColegioProfe.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoColegioProfe.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoColegioProfe.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoColegioProfe.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoColegioProfe.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoColegioProfe.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoColegioProfe.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoColegioProfe.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoColegioProfe.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoColegioProfe.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoColegioProfe.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoColegioProfe.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoColegioProfe.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoColegioProfe.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoColegioProfe.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoColegioProfe.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoColegioProfe.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoColegioProfe.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoColegioProfe.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoColegioProfe.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoColegioProfe.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoColegioProfe.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoColegioProfe.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoColegioProfe.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoColegioProfe.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoColegioProfe.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoColegioProfe.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoColegioProfe.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoColegioProfe.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoColegioProfe.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoColegioProfe.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoColegioProfe = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoColegioProfe = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoColegioProfe = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoColegioProfe = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoColegioProfe = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoColegioProfe = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoColegioProfe.setLayout(gridaBagParametrosReportesTipoColegioProfe);
			this.jPanelParametrosReportesAccionesTipoColegioProfe.setLayout(gridaBagParametrosReportesAccionesTipoColegioProfe);
			
			
			this.jPanelParametrosAuxiliar1TipoColegioProfe.setLayout(gridaBagParametrosAuxiliar1TipoColegioProfe);
			this.jPanelParametrosAuxiliar2TipoColegioProfe.setLayout(gridaBagParametrosAuxiliar2TipoColegioProfe);
			this.jPanelParametrosAuxiliar3TipoColegioProfe.setLayout(gridaBagParametrosAuxiliar3TipoColegioProfe);
			this.jPanelParametrosAuxiliar4TipoColegioProfe.setLayout(gridaBagParametrosAuxiliar4TipoColegioProfe);
			//this.jPanelParametrosAuxiliar5TipoColegioProfe.setLayout(gridaBagParametrosAuxiliar2TipoColegioProfe);			
			
			
			
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoColegioProfe.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoColegioProfe.add(this.jButtonRecargarInformacionTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoColegioProfe.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoColegioProfe.add(this.jComboBoxTiposPaginacionTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoColegioProfe.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoColegioProfe.add(this.jCheckBoxConAltoMaximoTablaTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoColegioProfe.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoColegioProfe.add(this.jComboBoxTiposArchivosReportesTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoColegioProfe.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoColegioProfe.add(this.jPanelParametrosAuxiliar1TipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoColegioProfe.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoColegioProfe.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoColegioProfe.add(this.jComboBoxTiposReportesTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoColegioProfe.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoColegioProfe.add(this.jPanelParametrosAuxiliar4TipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoColegioProfe.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoColegioProfe.add(this.jComboBoxTiposReportesTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoColegioProfe.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoColegioProfe.add(this.jCheckBoxGenerarReporteTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoColegioProfe.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoColegioProfe.add(this.jPanelParametrosAuxiliar2TipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoColegioProfe.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoColegioProfe.add(this.jLabelAccionesTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
				this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoColegioProfe.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoColegioProfe.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoColegioProfe.add(this.jButtonAbrirOrderByTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoColegioProfe.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoColegioProfe.add(this.jComboBoxTiposSeleccionarTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);			
			
			
			/*
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoColegioProfe.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoColegioProfe.add(this.jCheckBoxSeleccionarTodosTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoColegioProfe.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoColegioProfe.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoColegioProfe.add(this.jCheckBoxSeleccionarTodosTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);															
				
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoColegioProfe.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoColegioProfe.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoColegioProfe.add(this.jCheckBoxSeleccionadosTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoColegioProfe.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoColegioProfe.add(this.jPanelParametrosAuxiliar3TipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoColegioProfe.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoColegioProfe.add(this.jComboBoxTiposAccionesTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
	
				
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoColegioProfe.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoColegioProfe.add(this.jTextFieldValorCampoGeneralTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoColegioProfe = new GridBagLayout();

			this.jScrollPanelDatosTipoColegioProfe.setLayout(gridaBagLayoutDatosTipoColegioProfe);
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoColegioProfe.gridy = 0;
			this.gridBagConstraintsTipoColegioProfe.gridx = 0;
			
			this.jScrollPanelDatosTipoColegioProfe.add(this.jTableDatosTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoColegioProfe.setViewportView(this.jTableDatosTipoColegioProfe);
		this.jTableDatosTipoColegioProfe.setFillsViewportHeight(true);
		this.jTableDatosTipoColegioProfe.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoColegioProfe= new GridBagLayout();
		this.jPanelAccionesTipoColegioProfe.setLayout(gridaBagLayoutAccionesTipoColegioProfe);
		
		
		/*	
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = 0;
		this.gridBagConstraintsTipoColegioProfe.gridx = 0;
			
		this.jPanelAccionesTipoColegioProfe.add(this.jButtonNuevoTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoColegioProfe = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoColegioProfe);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();						
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoColegioProfe.gridx = 0;		
			//this.gridBagConstraintsTipoColegioProfe.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoColegioProfe.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoColegioProfe.gridx = 0;		
		//this.gridBagConstraintsTipoColegioProfe.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoColegioProfe.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoColegioProfe);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoColegioProfe.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);								
		
		
		/*
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoColegioProfe.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		*/		
		
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoColegioProfe.gridx =0;
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoColegioProfe.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
				
		
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoColegioProfe.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoColegioProfeJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoColegioProfe= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoColegioProfe = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoColegioProfe.setLayout(gridaBagLayoutBusquedasParametrosTipoColegioProfe);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoColegioProfe=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoColegioProfe.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoColegioProfe.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoColegioProfe.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoColegioProfe.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
			
			
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoColegioProfe.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		
			
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoColegioProfe.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoColegioProfe;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoColegioProfe() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoColegioProfe = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoColegioProfe = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoColegioProfe.setName("jPanelReporteDinamicoTipoColegioProfe"); 
		
		this.jPanelReporteDinamicoTipoColegioProfe.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoColegioProfe.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoColegioProfe.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoColegioProfe.setLayout(gridaBagLayoutReporteDinamicoTipoColegioProfe);
		
		
		this.jInternalFrameReporteDinamicoTipoColegioProfe= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoColegioProfe = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoColegioProfe= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoColegioProfe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoColegioProfe.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoColegioProfe.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoColegioProfe.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoColegioProfe.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoColegioProfe.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoColegioProfe.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoColegioProfe.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoColegioProfe.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoColegioProfe.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoColegioProfe.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Colegio Profes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoColegioProfe = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoColegioProfe.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoColegioProfe.add(this.jLabelColumnasSelectReporteTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoColegioProfe = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoColegioProfe.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoColegioProfe.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoColegioProfe.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoColegioProfe.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoColegioProfe.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoColegioProfe=new JScrollPane(this.jListColumnasSelectReporteTipoColegioProfe);
			
			this.jScrollColumnasSelectReporteTipoColegioProfe.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoColegioProfe.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoColegioProfe.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoColegioProfe.add(this.jListColumnasSelectReporteTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		this.jPanelReporteDinamicoTipoColegioProfe.add(this.jScrollColumnasSelectReporteTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoColegioProfe = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoColegioProfe.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoColegioProfe = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoColegioProfe.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoColegioProfe.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoColegioProfe.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoColegioProfe.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoColegioProfe.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoColegioProfe=new JScrollPane(this.jListRelacionesSelectReporteTipoColegioProfe);
			
			this.jScrollRelacionesSelectReporteTipoColegioProfe.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoColegioProfe.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoColegioProfe.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoColegioProfe = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoColegioProfe = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoColegioProfe = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoColegioProfe = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoColegioProfe.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoColegioProfe.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoColegioProfe.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoColegioProfe.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoColegioProfe = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoColegioProfe.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoColegioProfe.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoColegioProfe.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoColegioProfe.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoColegioProfe = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoColegioProfe.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoColegioProfe.add(this.jLabelGenerarExcelReporteDinamicoTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoColegioProfe = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoColegioProfe.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoColegioProfe,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoColegioProfe.setToolTipText("Generar EXCEL"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		//this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoColegioProfe.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoColegioProfe.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoColegioProfe.add(this.jButtonGenerarExcelReporteDinamicoTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoColegioProfe.add(this.jComboBoxTiposReportesDinamicoTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoColegioProfe = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoColegioProfe.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoColegioProfe.add(this.jLabelTiposArchivoReporteDinamicoTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoColegioProfe.add(this.jComboBoxTiposArchivosReportesDinamicoTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoColegioProfe = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoColegioProfe.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoColegioProfe,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoColegioProfe.setToolTipText("Generar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoColegioProfe.add(this.jButtonGenerarReporteDinamicoTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoColegioProfe = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoColegioProfe.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoColegioProfe,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoColegioProfe.setToolTipText("Cancelar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoColegioProfe.add(this.jButtonCerrarReporteDinamicoTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoColegioProfe = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoColegioProfe= new JScrollPane(jPanelReporteDinamicoTipoColegioProfe,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoColegioProfe.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoColegioProfe.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoColegioProfe.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Colegio Profes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoColegioProfe.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoColegioProfe.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoColegioProfe.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoColegioProfe);
		this.jInternalFrameReporteDinamicoTipoColegioProfe.getContentPane().add(this.jScrollPanelReporteDinamicoTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoColegioProfe() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoColegioProfe = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoColegioProfe = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoColegioProfe.setName("jPanelImportacionTipoColegioProfe"); 
		
		this.jPanelImportacionTipoColegioProfe.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoColegioProfe.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoColegioProfe.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoColegioProfe.setLayout(gridaBagLayoutImportacionTipoColegioProfe);
		
		
		this.jInternalFrameImportacionTipoColegioProfe= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoColegioProfe= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoColegioProfe = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoColegioProfe= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoColegioProfe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoColegioProfe.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoColegioProfe.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoColegioProfe.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoColegioProfe.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoColegioProfe.setResizable(true);
	    this.jInternalFrameImportacionTipoColegioProfe.setClosable(true);
	    this.jInternalFrameImportacionTipoColegioProfe.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoColegioProfe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoColegioProfe.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoColegioProfe.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoColegioProfe.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoColegioProfe.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoColegioProfe.setResizable(true);
	    this.jInternalFrameImportacionTipoColegioProfe.setClosable(true);
	    this.jInternalFrameImportacionTipoColegioProfe.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoColegioProfe.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoColegioProfe.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoColegioProfe.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Colegio Profes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoColegioProfe = new JLabelMe();

		this.jLabelArchivoImportacionTipoColegioProfe.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoColegioProfe.add(this.jLabelArchivoImportacionTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoColegioProfe = new JFileChooser();		
		this.jFileChooserImportacionTipoColegioProfe.setToolTipText("ESCOGER ARCHIVO"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoColegioProfe = new JButtonMe();
		this.jButtonAbrirImportacionTipoColegioProfe.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoColegioProfe,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoColegioProfe.setToolTipText("Generar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoColegioProfe.add(this.jButtonAbrirImportacionTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoColegioProfe = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoColegioProfe.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoColegioProfe.add(this.jLabelPathArchivoImportacionTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoColegioProfe=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoColegioProfe.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoColegioProfe.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoColegioProfe.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoColegioProfe.add(this.jTextFieldPathArchivoImportacionTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoColegioProfe = new JButtonMe();
		this.jButtonGenerarImportacionTipoColegioProfe.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoColegioProfe,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoColegioProfe.setToolTipText("Generar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoColegioProfe.add(this.jButtonGenerarImportacionTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoColegioProfe = new JButtonMe();
		this.jButtonCerrarImportacionTipoColegioProfe.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoColegioProfe,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoColegioProfe.setToolTipText("Cancelar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoColegioProfe.add(this.jButtonCerrarImportacionTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoColegioProfe = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoColegioProfe= new JScrollPane(jPanelImportacionTipoColegioProfe,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoColegioProfe.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoColegioProfe.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoColegioProfe.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoColegioProfe);
		this.jInternalFrameImportacionTipoColegioProfe.getContentPane().add(this.jScrollPanelImportacionTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoColegioProfe(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoColegioProfe = new JButtonMe();
			this.jButtonAbrirOrderByTipoColegioProfe.setText("Orden");
			this.jButtonAbrirOrderByTipoColegioProfe.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoColegioProfe,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoColegioProfe";
			inputMap = this.jButtonAbrirOrderByTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoColegioProfe.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoColegioProfe"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoColegioProfe = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoColegioProfe = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoColegioProfe.setName("jPanelOrderByTipoColegioProfe"); 
			
			this.jPanelOrderByTipoColegioProfe.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoColegioProfe.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoColegioProfe.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoColegioProfe.setLayout(gridaBagLayoutOrderByTipoColegioProfe);
			
			
			this.jTableDatosTipoColegioProfeOrderBy = new JTableMe();        
			this.jTableDatosTipoColegioProfeOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoColegioProfeOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoColegioProfeOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoColegioProfeOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoColegioProfeOrderBy.setViewportView(this.jTableDatosTipoColegioProfeOrderBy);
			this.jTableDatosTipoColegioProfeOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoColegioProfeOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoColegioProfe= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoColegioProfe= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoColegioProfe = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoColegioProfe= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoColegioProfe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoColegioProfe.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoColegioProfe.setTitle("Orden");
			this.jInternalFrameOrderByTipoColegioProfe.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoColegioProfe.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoColegioProfe.setResizable(true);
			this.jInternalFrameOrderByTipoColegioProfe.setClosable(true);
			this.jInternalFrameOrderByTipoColegioProfe.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoColegioProfe.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoColegioProfe.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoColegioProfe.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Colegio Profes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoColegioProfe.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoColegioProfe.ipady =150;
				
			this.jPanelOrderByTipoColegioProfe.add(jScrollPanelDatosTipoColegioProfeOrderBy, this.gridBagConstraintsTipoColegioProfe);//this.jTableDatosTipoColegioProfeTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoColegioProfe = new JButtonMe();
			this.jButtonCerrarOrderByTipoColegioProfe.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoColegioProfe,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoColegioProfe.setToolTipText("Cancelar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoColegioProfe.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoColegioProfe.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoColegioProfe.add(this.jButtonCerrarOrderByTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoColegioProfe = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoColegioProfe= new JScrollPane(jPanelOrderByTipoColegioProfe,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoColegioProfe.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoColegioProfe.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoColegioProfe.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoColegioProfe);
			
			this.jInternalFrameOrderByTipoColegioProfe.getContentPane().add(this.jScrollPanelOrderByTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);			
		
		} else {
			this.jButtonAbrirOrderByTipoColegioProfe = new JButtonMe();
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
		int iWidthTableCalculado=0;//830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipocolegioprofeSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoColegioProfe.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoColegioProfe.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoColegioProfe.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoColegioProfe.getRowHeight();//TipoColegioProfeConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoColegioProfeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoColegioProfe.isSelected()) {
					iHeightTable=TipoColegioProfeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoColegioProfeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoColegioProfeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoColegioProfeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoColegioProfe.isSelected()) {
					iHeightTable=TipoColegioProfeConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoColegioProfeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoColegioProfeConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoColegioProfe.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoColegioProfe.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoColegioProfe.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoColegioProfe.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoColegioProfe.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoColegioProfe.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoColegioProfe!=null && this.jInternalFrameOrderByTipoColegioProfe.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoColegioProfe.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoColegioProfe.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoColegioProfe.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoColegioProfe.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoColegioProfe.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoColegioProfe.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoColegioProfe.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoColegioProfe.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoColegioProfe.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoColegioProfe.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocolegioprofeLogic.getTipoColegioProfes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocolegioprofes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoColegioProfe> TraerTipoColegioProfeBeans(List<TipoColegioProfe> tipocolegioprofes,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoColegioProfe tipocolegioprofe:tipocolegioprofes) {
					
				if(!(TipoColegioProfeConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoColegioProfeConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocolegioprofe.setsDetalleGeneralEntityReporte(TipoColegioProfeConstantesFunciones.getTipoColegioProfeDescripcion(tipocolegioprofe));
										
						
					
						
					
				} else  {
							
					//tipocolegioprofe.setsDetalleGeneralEntityReporte(tipocolegioprofe.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocolegioprofebeans.add(tipocolegioprofebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocolegioprofes;
    }
	//PARA REPORTES FIN
}
