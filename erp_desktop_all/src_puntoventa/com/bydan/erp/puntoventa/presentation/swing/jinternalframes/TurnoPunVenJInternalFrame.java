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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.TurnoPunVenConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class TurnoPunVenJInternalFrame extends TurnoPunVenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTurnoPunVen;
	
	protected JMenuBar jmenuBarTurnoPunVen;
	
	protected JMenu jmenuTurnoPunVen;
	protected JMenu jmenuDatosTurnoPunVen;
	protected JMenu jmenuArchivoTurnoPunVen;
	protected JMenu jmenuAccionesTurnoPunVen;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTurnoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTurnoPunVen;	
	protected GridBagConstraints gridBagConstraintsTurnoPunVen;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TurnoPunVenDetalleFormJInternalFrame jInternalFrameDetalleFormTurnoPunVen;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTurnoPunVen;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTurnoPunVen;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public TurnoPunVenSessionBean turnopunvenSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TurnoPunVen> turnopunvens;		
	public List<TurnoPunVen> turnopunvensEliminados;	
	public List<TurnoPunVen> turnopunvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTurnoPunVen;		
	protected JButton jButtonAbrirOrderByTurnoPunVen;
	
	
	//protected JPanel jPanelOrderByTurnoPunVen;
	//public JScrollPane jScrollPanelOrderByTurnoPunVen;	
	//protected JButton jButtonCerrarOrderByTurnoPunVen;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TurnoPunVenLogic turnopunvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTurnoPunVen;
	public JScrollPane jScrollPanelDatosEdicionTurnoPunVen;
	public JScrollPane jScrollPanelDatosGeneralTurnoPunVen;
    
	
	
	//public JScrollPane jScrollPanelDatosTurnoPunVenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTurnoPunVen;
	//public JScrollPane jScrollPanelImportacionTurnoPunVen;
	
	
	
	protected JPanel jPanelAccionesTurnoPunVen;
	
    protected JPanel jPanelPaginacionTurnoPunVen;
    protected JPanel jPanelParametrosReportesTurnoPunVen;
	protected JPanel jPanelParametrosReportesAccionesTurnoPunVen;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TurnoPunVen;
	protected JPanel jPanelParametrosAuxiliar2TurnoPunVen;
	protected JPanel jPanelParametrosAuxiliar3TurnoPunVen;
	protected JPanel jPanelParametrosAuxiliar4TurnoPunVen;
	//protected JPanel jPanelParametrosAuxiliar5TurnoPunVen;
	
	
	
	//protected JPanel jPanelReporteDinamicoTurnoPunVen;
	//protected JPanel jPanelImportacionTurnoPunVen;
	
	
	public JTable jTableDatosTurnoPunVen;
	
	
	
	//public JTable jTableDatosTurnoPunVenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTurnoPunVen;
	protected JButton jButtonDuplicarTurnoPunVen;
	protected JButton jButtonCopiarTurnoPunVen;
	protected JButton jButtonVerFormTurnoPunVen;
	protected JButton jButtonNuevoRelacionesTurnoPunVen;
	protected JButton jButtonModificarTurnoPunVen;
	
    protected JButton jButtonGuardarCambiosTablaTurnoPunVen;
	protected JButton jButtonCerrarTurnoPunVen;
	
	
	protected JButton jButtonRecargarInformacionTurnoPunVen;
	protected JButton jButtonProcesarInformacionTurnoPunVen;
	
	
	protected JButton jButtonAnterioresTurnoPunVen;
	protected JButton jButtonSiguientesTurnoPunVen;
	protected JButton jButtonNuevoGuardarCambiosTurnoPunVen;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTurnoPunVen;
	//protected JButton jButtonCerrarReporteDinamicoTurnoPunVen;
	//protected JButton jButtonGenerarExcelReporteDinamicoTurnoPunVen;	
	
	
	
	//protected JButton jButtonAbrirImportacionTurnoPunVen;
	//protected JButton jButtonGenerarImportacionTurnoPunVen;
	//protected JButton jButtonCerrarImportacionTurnoPunVen;
	//protected JFileChooser jFileChooserImportacionTurnoPunVen;
	//protected File fileImportacionTurnoPunVen;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTurnoPunVen;
	protected JButton jButtonDuplicarToolBarTurnoPunVen;
	protected JButton jButtonNuevoRelacionesToolBarTurnoPunVen;
	
	
	public JButton jButtonGuardarCambiosToolBarTurnoPunVen;
	protected JButton jButtonCopiarToolBarTurnoPunVen;
	protected JButton jButtonVerFormToolBarTurnoPunVen;
	public JButton jButtonGuardarCambiosTablaToolBarTurnoPunVen;
	protected JButton jButtonMostrarOcultarTablaToolBarTurnoPunVen;
	protected JButton jButtonCerrarToolBarTurnoPunVen;
	
	protected JButton jButtonRecargarInformacionToolBarTurnoPunVen;
	protected JButton jButtonProcesarInformacionToolBarTurnoPunVen;
	protected JButton jButtonAnterioresToolBarTurnoPunVen;
	protected JButton jButtonSiguientesToolBarTurnoPunVen;
	protected JButton jButtonNuevoGuardarCambiosToolBarTurnoPunVen;
	protected JButton jButtonAbrirOrderByToolBarTurnoPunVen;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTurnoPunVen;
	protected JMenuItem jMenuItemDuplicarTurnoPunVen;
	protected JMenuItem jMenuItemNuevoRelacionesTurnoPunVen;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTurnoPunVen;
	protected JMenuItem jMenuItemCopiarTurnoPunVen;
	protected JMenuItem jMenuItemVerFormTurnoPunVen;
	protected JMenuItem jMenuItemGuardarCambiosTablaTurnoPunVen;
	protected JMenuItem jMenuItemCerrarTurnoPunVen;
	protected JMenuItem jMenuItemDetalleCerrarTurnoPunVen;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTurnoPunVen;
	protected JMenuItem jMenuItemDetalleMostarOcultarTurnoPunVen;
	
	protected JMenuItem jMenuItemRecargarInformacionTurnoPunVen;
	protected JMenuItem jMenuItemProcesarInformacionTurnoPunVen;
	protected JMenuItem jMenuItemAnterioresTurnoPunVen;
	protected JMenuItem jMenuItemSiguientesTurnoPunVen;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTurnoPunVen;
	protected JMenuItem jMenuItemAbrirOrderByTurnoPunVen;
	protected JMenuItem jMenuItemMostrarOcultarTurnoPunVen;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTurnoPunVen;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTurnoPunVen;
	protected JCheckBox jCheckBoxSeleccionadosTurnoPunVen;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTurnoPunVen;
	protected JCheckBox jCheckBoxConGraficoReporteTurnoPunVen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTurnoPunVen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTurnoPunVen;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTurnoPunVen;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTurnoPunVen;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTurnoPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTurnoPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTurnoPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTurnoPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTurnoPunVen;
	protected JTextField jTextFieldValorCampoGeneralTurnoPunVen;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTurnoPunVen;
	//public JList<Reporte> jListColumnasSelectReporteTurnoPunVen;
	//public JScrollPane jScrollColumnasSelectReporteTurnoPunVen;
	
	//public JLabel jLabelRelacionesSelectReporteTurnoPunVen;
	//public JList<Reporte> jListRelacionesSelectReporteTurnoPunVen;
	//public JScrollPane jScrollRelacionesSelectReporteTurnoPunVen;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTurnoPunVen;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTurnoPunVen;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTurnoPunVen;
	//public JLabel jLabelTiposArchivoReporteDinamicoTurnoPunVen;
	
		
	//public JLabel jLabelArchivoImportacionTurnoPunVen;	
	//public JLabel jLabelPathArchivoImportacionTurnoPunVen;
	//protected JTextField jTextFieldPathArchivoImportacionTurnoPunVen;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTurnoPunVen;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTurnoPunVen;
	
	//public JLabel jLabelColumnaCategoriaValorTurnoPunVen;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTurnoPunVen;
	
	//public JLabel jLabelColumnasValoresGraficoTurnoPunVen;
	//public JList<Reporte> jListColumnasValoresGraficoTurnoPunVen;
	//public JScrollPane jScrollColumnasValoresGraficoTurnoPunVen;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTurnoPunVen;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTurnoPunVen;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTurnoPunVen;
	
	
	
	
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
	//public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TurnoPunVenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TurnoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TurnoPunVenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TurnoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TurnoPunVenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TurnoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TurnoPunVenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TurnoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTurnoPunVen)	{
		this.jButtonRecargarInformacionTurnoPunVen = jButtonRecargarInformacionTurnoPunVen;
	}
	
	public JButton getjButtonProcesarInformacionTurnoPunVen() {
		return this.jButtonProcesarInformacionTurnoPunVen;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTurnoPunVen)	{
		this.jButtonProcesarInformacionTurnoPunVen = jButtonProcesarInformacionTurnoPunVen;
	}
	
	
	public JButton getjButtonRecargarInformacionTurnoPunVen() {
		return this.jButtonRecargarInformacionTurnoPunVen;
	}
	
	
	public List<TurnoPunVen> getturnopunvens() {
		return this.turnopunvens;
	}

	public void setturnopunvens(List<TurnoPunVen> turnopunvens) {
		this.turnopunvens = turnopunvens;
	}
	
	public List<TurnoPunVen> getturnopunvensAux() {
		return this.turnopunvensAux;
	}

	public void setturnopunvensAux(List<TurnoPunVen> turnopunvensAux) {
		this.turnopunvensAux = turnopunvensAux;
	}
	
	public List<TurnoPunVen> getturnopunvensEliminados() {
		return this.turnopunvensEliminados;
	}

	public void setTurnoPunVensEliminados(List<TurnoPunVen> turnopunvensEliminados) {
		this.turnopunvensEliminados = turnopunvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTurnoPunVen() {
		return jComboBoxTiposSeleccionarTurnoPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTurnoPunVen(
			JComboBox jComboBoxTiposSeleccionarTurnoPunVen) {
		this.jComboBoxTiposSeleccionarTurnoPunVen = jComboBoxTiposSeleccionarTurnoPunVen;
	}
	
	public void setBorderResaltarTiposSeleccionarTurnoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTurnoPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTurnoPunVen .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTurnoPunVen() {
		return jTextFieldValorCampoGeneralTurnoPunVen;
	}

	public void setjTextFieldValorCampoGeneralTurnoPunVen(
			JTextField jTextFieldValorCampoGeneralTurnoPunVen) {
		this.jTextFieldValorCampoGeneralTurnoPunVen = jTextFieldValorCampoGeneralTurnoPunVen;
	}

	public void setBorderResaltarValorCampoGeneralTurnoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurnoPunVen.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTurnoPunVen .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTurnoPunVen() {
		return this.jCheckBoxSeleccionarTodosTurnoPunVen;
	}

	public void setjCheckBoxSeleccionarTodosTurnoPunVen(
			JCheckBox jCheckBoxSeleccionarTodosTurnoPunVen) {
		this.jCheckBoxSeleccionarTodosTurnoPunVen = jCheckBoxSeleccionarTodosTurnoPunVen;
	}

	public void setBorderResaltarSeleccionarTodosTurnoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurnoPunVen.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTurnoPunVen .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTurnoPunVen() {
		return this.jCheckBoxSeleccionadosTurnoPunVen;
	}

	public void setjCheckBoxSeleccionadosTurnoPunVen(
			JCheckBox jCheckBoxSeleccionadosTurnoPunVen) {
		this.jCheckBoxSeleccionadosTurnoPunVen = jCheckBoxSeleccionadosTurnoPunVen;
	}
	
	public void setBorderResaltarSeleccionadosTurnoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurnoPunVen.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTurnoPunVen .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTurnoPunVen() {
		return this.jComboBoxTiposArchivosReportesTurnoPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTurnoPunVen(
			JComboBox jComboBoxTiposArchivosReportesTurnoPunVen) {
		this.jComboBoxTiposArchivosReportesTurnoPunVen = jComboBoxTiposArchivosReportesTurnoPunVen;
	}

	public void setBorderResaltarTiposArchivosReportesTurnoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurnoPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTurnoPunVen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTurnoPunVen() {
		return this.jComboBoxTiposReportesTurnoPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTurnoPunVen(
			JComboBox jComboBoxTiposReportesTurnoPunVen) {
		this.jComboBoxTiposReportesTurnoPunVen = jComboBoxTiposReportesTurnoPunVen;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTurnoPunVen() {
	//	return jComboBoxTiposReportesDinamicoTurnoPunVen;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTurnoPunVen(
	//		JComboBox jComboBoxTiposReportesDinamicoTurnoPunVen) {
	//	this.jComboBoxTiposReportesDinamicoTurnoPunVen = jComboBoxTiposReportesDinamicoTurnoPunVen;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTurnoPunVen() {
	//	return jComboBoxTiposArchivosReportesDinamicoTurnoPunVen;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTurnoPunVen(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTurnoPunVen) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTurnoPunVen = jComboBoxTiposArchivosReportesDinamicoTurnoPunVen;
	//}
	
	public void setBorderResaltarTiposReportesTurnoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurnoPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTurnoPunVen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTurnoPunVen() {
		return this.jComboBoxTiposGraficosReportesTurnoPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTurnoPunVen(
			JComboBox jComboBoxTiposGraficosReportesTurnoPunVen) {
		this.jComboBoxTiposGraficosReportesTurnoPunVen = jComboBoxTiposGraficosReportesTurnoPunVen;
	}
	
	public void setBorderResaltarTiposGraficosReportesTurnoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurnoPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTurnoPunVen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTurnoPunVen() {
		return this.jComboBoxTiposPaginacionTurnoPunVen;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTurnoPunVen(
			JComboBox jComboBoxTiposPaginacionTurnoPunVen) {
		this.jComboBoxTiposPaginacionTurnoPunVen = jComboBoxTiposPaginacionTurnoPunVen;
	}
	
	public void setBorderResaltarTiposPaginacionTurnoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurnoPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTurnoPunVen .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTurnoPunVen() {
		return this.jComboBoxTiposRelacionesTurnoPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTurnoPunVen() {
		return this.jComboBoxTiposAccionesTurnoPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTurnoPunVen(
			JComboBox jComboBoxTiposRelacionesTurnoPunVen) {
		this.jComboBoxTiposRelacionesTurnoPunVen = jComboBoxTiposRelacionesTurnoPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTurnoPunVen(
			JComboBox jComboBoxTiposAccionesTurnoPunVen) {
		this.jComboBoxTiposAccionesTurnoPunVen = jComboBoxTiposAccionesTurnoPunVen;
	}
	
	public void setBorderResaltarTiposRelacionesTurnoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurnoPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTurnoPunVen .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTurnoPunVen() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTurnoPunVen.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTurnoPunVen .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTurnoPunVen() {
	//	return jCheckBoxConGraficoDinamicoTurnoPunVen;
	//}

	//public void setjCheckBoxConGraficoDinamicoTurnoPunVen(
	//		JCheckBox jCheckBoxConGraficoDinamicoTurnoPunVen) {
	//	this.jCheckBoxConGraficoDinamicoTurnoPunVen = jCheckBoxConGraficoDinamicoTurnoPunVen;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTurnoPunVen() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTurnoPunVen.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTurnoPunVen .setBorder(borderResaltar);		
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
		this.turnopunvenSessionBean=new TurnoPunVenSessionBean();
		
		this.turnopunvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.turnopunvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.turnopunvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TurnoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TurnoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TurnoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TurnoPunVenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TurnoPunVenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Turno Pun Ven MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
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
		
		TurnoPunVenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TurnoPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTurnoPunVen= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTurnoPunVen,this.jTtoolBarTurnoPunVen,
							"nuevo","nuevo","Nuevo"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTurnoPunVen,this.jTtoolBarTurnoPunVen,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTurnoPunVen,this.jTtoolBarTurnoPunVen,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTurnoPunVen,this.jTtoolBarTurnoPunVen,
							"duplicar","duplicar","Duplicar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTurnoPunVen,this.jTtoolBarTurnoPunVen,
							"copiar","copiar","Copiar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTurnoPunVen,this.jTtoolBarTurnoPunVen,
							"ver_form","ver_form","Ver"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTurnoPunVen,this.jTtoolBarTurnoPunVen,
							"recargar","recargar","Recargar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTurnoPunVen,this.jTtoolBarTurnoPunVen,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTurnoPunVen,this.jTtoolBarTurnoPunVen,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTurnoPunVen,this.jTtoolBarTurnoPunVen,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTurnoPunVen,this.jTtoolBarTurnoPunVen,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTurnoPunVen,this.jTtoolBarTurnoPunVen,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTurnoPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTurnoPunVen,this.jTtoolBarTurnoPunVen,
							"cerrar","cerrar","Salir"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTurnoPunVen=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTurnoPunVen;
			
				this.jButtonProcesarInformacionToolBarTurnoPunVen=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTurnoPunVen;
				
		//protected JButton jButtonModificarToolBarTurnoPunVen;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTurnoPunVen=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTurnoPunVen=new JMenuMe("General");
		this.jmenuArchivoTurnoPunVen=new JMenuMe("Archivo");
		this.jmenuAccionesTurnoPunVen=new JMenuMe("Acciones");
		this.jmenuDatosTurnoPunVen=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTurnoPunVen= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTurnoPunVen.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTurnoPunVen,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTurnoPunVen= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTurnoPunVen.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTurnoPunVen,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTurnoPunVen= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTurnoPunVen.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTurnoPunVen,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTurnoPunVen= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTurnoPunVen.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTurnoPunVen,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTurnoPunVen= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTurnoPunVen.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTurnoPunVen,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTurnoPunVen= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTurnoPunVen.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTurnoPunVen,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTurnoPunVen= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTurnoPunVen.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTurnoPunVen,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTurnoPunVen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTurnoPunVen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTurnoPunVen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTurnoPunVen= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTurnoPunVen.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTurnoPunVen,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTurnoPunVen= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTurnoPunVen.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTurnoPunVen,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTurnoPunVen= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTurnoPunVen.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTurnoPunVen,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTurnoPunVen= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTurnoPunVen.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTurnoPunVen,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTurnoPunVen= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTurnoPunVen.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTurnoPunVen,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTurnoPunVen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTurnoPunVen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTurnoPunVen,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTurnoPunVen= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTurnoPunVen.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTurnoPunVen,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTurnoPunVen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTurnoPunVen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTurnoPunVen,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTurnoPunVen= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTurnoPunVen.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTurnoPunVen,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTurnoPunVen.add(this.jMenuItemCerrarTurnoPunVen);
			
			this.jmenuAccionesTurnoPunVen.add(this.jMenuItemNuevoTurnoPunVen);
			this.jmenuAccionesTurnoPunVen.add(this.jMenuItemNuevoGuardarCambiosTurnoPunVen);
			this.jmenuAccionesTurnoPunVen.add(this.jMenuItemNuevoRelacionesTurnoPunVen);
			this.jmenuAccionesTurnoPunVen.add(this.jMenuItemGuardarCambiosTablaTurnoPunVen);		
			this.jmenuAccionesTurnoPunVen.add(this.jMenuItemDuplicarTurnoPunVen);		
			this.jmenuAccionesTurnoPunVen.add(this.jMenuItemCopiarTurnoPunVen);		
			this.jmenuAccionesTurnoPunVen.add(this.jMenuItemVerFormTurnoPunVen);		
			
			this.jmenuDatosTurnoPunVen.add(this.jMenuItemRecargarInformacionTurnoPunVen);				
			this.jmenuDatosTurnoPunVen.add(this.jMenuItemAnterioresTurnoPunVen);				
			this.jmenuDatosTurnoPunVen.add(this.jMenuItemSiguientesTurnoPunVen);				
			this.jmenuDatosTurnoPunVen.add(this.jMenuItemAbrirOrderByTurnoPunVen);				
			this.jmenuDatosTurnoPunVen.add(this.jMenuItemMostrarOcultarTurnoPunVen);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTurnoPunVen.add(this.jMenuItemGuardarCambiosTurnoPunVen);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTurnoPunVen.add(this.jmenuArchivoTurnoPunVen);		
			this.jmenuBarTurnoPunVen.add(this.jmenuAccionesTurnoPunVen);		
			this.jmenuBarTurnoPunVen.add(this.jmenuDatosTurnoPunVen);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTurnoPunVen);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTurnoPunVen() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTurnoPunVen=new JTabbedPane();


		this.jTabbedPaneBusquedasTurnoPunVen.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTurnoPunVen.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTurnoPunVen.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTurnoPunVen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTurnoPunVen,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTurnoPunVen = new TurnoPunVenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Turno Pun Ven DATOS");
			this.jInternalFrameDetalleFormTurnoPunVen = new TurnoPunVenDetalleFormJInternalFrame(jDesktopPane,this.turnopunvenSessionBean.getConGuardarRelaciones(),this.turnopunvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTurnoPunVen = null;//new TurnoPunVenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTurnoPunVen= new GridBagLayout();
		
		
		this.jTableDatosTurnoPunVen = new JTableMe();      
		
		String sToolTipTurnoPunVen="";
		sToolTipTurnoPunVen=TurnoPunVenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTurnoPunVen+="(PuntoVenta.TurnoPunVen)";
		}
		
		if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipTurnoPunVen+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTurnoPunVen.setToolTipText(sToolTipTurnoPunVen);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTurnoPunVen);
		this.jTableDatosTurnoPunVen.setAutoCreateRowSorter(true);
		this.jTableDatosTurnoPunVen.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTurnoPunVen.setRowSelectionAllowed(true);
		this.jTableDatosTurnoPunVen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTurnoPunVen,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTurnoPunVen = new JButtonMe();
		this.jButtonDuplicarTurnoPunVen = new JButtonMe();
		this.jButtonCopiarTurnoPunVen = new JButtonMe();
		this.jButtonVerFormTurnoPunVen = new JButtonMe();
		this.jButtonNuevoRelacionesTurnoPunVen = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTurnoPunVen = new JButtonMe();
		this.jButtonCerrarTurnoPunVen = new JButtonMe();
		
		this.jScrollPanelDatosTurnoPunVen = new JScrollPane();   
        this.jScrollPanelDatosGeneralTurnoPunVen = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTurnoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Turno Pun Ven";
		
		if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Turno Pun Venes" + this.sPath));
		} else {
			this.jScrollPanelDatosTurnoPunVen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTurnoPunVen.setToolTipText("Acciones");
        this.jPanelAccionesTurnoPunVen.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTurnoPunVen=new ReporteDinamicoJInternalFrame(TurnoPunVenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTurnoPunVen();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTurnoPunVen=new ImportacionJInternalFrame(TurnoPunVenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTurnoPunVen();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTurnoPunVen = new JButtonMe();
		
		this.jButtonAbrirOrderByTurnoPunVen.setText("Orden");
		this.jButtonAbrirOrderByTurnoPunVen.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTurnoPunVen,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTurnoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTurnoPunVen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTurnoPunVen,false,this);
			
			//this.cargarOrderByTurnoPunVen(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTurnoPunVen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTurnoPunVen,true,this);
			
			//this.cargarOrderByTurnoPunVen(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTurnoPunVen.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTurnoPunVen.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTurnoPunVen.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTurnoPunVen.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTurnoPunVen.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTurnoPunVen.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTurnoPunVen.setText("Nuevo");
		this.jButtonDuplicarTurnoPunVen.setText("Duplicar");
		this.jButtonCopiarTurnoPunVen.setText("Copiar");
		this.jButtonVerFormTurnoPunVen.setText("Ver");
		this.jButtonNuevoRelacionesTurnoPunVen.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTurnoPunVen.setText("Guardar");
		this.jButtonCerrarTurnoPunVen.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTurnoPunVen,"nuevo_button","Nuevo",this.turnopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTurnoPunVen,"duplicar_button","Duplicar",this.turnopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTurnoPunVen,"copiar_button","Copiar",this.turnopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTurnoPunVen,"ver_form","Ver",this.turnopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTurnoPunVen,"nuevorelaciones_button","Nuevo Rel",this.turnopunvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTurnoPunVen,"guardarcambiostabla_button","Guardar",this.turnopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTurnoPunVen,"cerrar_button","Salir",this.turnopunvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTurnoPunVen.setToolTipText("Nuevo"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTurnoPunVen.setToolTipText("Duplicar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTurnoPunVen.setToolTipText("Copiar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTurnoPunVen.setToolTipText("Ver"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTurnoPunVen.setToolTipText("Nuevo Rel"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTurnoPunVen.setToolTipText("Guardar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTurnoPunVen.setToolTipText("Salir"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTurnoPunVen";
		inputMap = this.jButtonNuevoTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTurnoPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTurnoPunVen"));
		
		//DUPLICAR
		sMapKey = "DuplicarTurnoPunVen";
		inputMap = this.jButtonDuplicarTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTurnoPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTurnoPunVen"));
		
		//COPIAR
		sMapKey = "CopiarTurnoPunVen";
		inputMap = this.jButtonCopiarTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTurnoPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTurnoPunVen"));
		
		//VEr FORM
		sMapKey = "VerFormTurnoPunVen";
		inputMap = this.jButtonVerFormTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTurnoPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTurnoPunVen"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTurnoPunVen";
		inputMap = this.jButtonNuevoRelacionesTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTurnoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTurnoPunVen"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTurnoPunVen";
		inputMap = this.jButtonModificarTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTurnoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTurnoPunVen"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTurnoPunVen";
		inputMap = this.jButtonCerrarTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTurnoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTurnoPunVen"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTurnoPunVen";
		inputMap = this.jButtonGuardarCambiosTablaTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTurnoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTurnoPunVen"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTurnoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTurnoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTurnoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TurnoPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TurnoPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TurnoPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TurnoPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TurnoPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTurnoPunVen.setName("jPanelParametrosReportesTurnoPunVen"); 
		
		this.jPanelParametrosReportesAccionesTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTurnoPunVen.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTurnoPunVen.setName("jPanelParametrosReportesAccionesTurnoPunVen"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTurnoPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTurnoPunVen = new JButtonMe();
		this.jButtonRecargarInformacionTurnoPunVen.setText("Recargar");
		this.jButtonRecargarInformacionTurnoPunVen.setToolTipText("Recargar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTurnoPunVen,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTurnoPunVen = new JButtonMe();
		this.jButtonProcesarInformacionTurnoPunVen.setText("Procesar");
		this.jButtonProcesarInformacionTurnoPunVen.setToolTipText("Procesar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTurnoPunVen.setVisible(false);
			
		this.jButtonProcesarInformacionTurnoPunVen.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTurnoPunVen.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTurnoPunVen.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTurnoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTurnoPunVen.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTurnoPunVen.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTurnoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTurnoPunVen.setText("TIPO");       
		this.jComboBoxTiposReportesTurnoPunVen.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTurnoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTurnoPunVen.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTurnoPunVen.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTurnoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTurnoPunVen.setText("Paginacion");
		this.jComboBoxTiposPaginacionTurnoPunVen.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTurnoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTurnoPunVen.setText("Accion");
		this.jComboBoxTiposRelacionesTurnoPunVen.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTurnoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTurnoPunVen.setText("Accion");
		this.jComboBoxTiposAccionesTurnoPunVen.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTurnoPunVen = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTurnoPunVen.setText("Accion");
		this.jComboBoxTiposSeleccionarTurnoPunVen.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTurnoPunVen=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTurnoPunVen.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTurnoPunVen.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTurnoPunVen.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTurnoPunVen = new JLabelMe();
		
		this.jLabelAccionesTurnoPunVen.setText("Acciones");		
		this.jLabelAccionesTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTurnoPunVen = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTurnoPunVen.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTurnoPunVen.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTurnoPunVen = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTurnoPunVen.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTurnoPunVen.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTurnoPunVen = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTurnoPunVen.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTurnoPunVen.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTurnoPunVen = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTurnoPunVen.setText("Graf.");
		this.jCheckBoxConGraficoReporteTurnoPunVen.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTurnoPunVen = new JButtonMe();
		//this.jButtonAnterioresTurnoPunVen.setText("<<");
        this.jButtonAnterioresTurnoPunVen.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTurnoPunVen,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTurnoPunVen = new JButtonMe();
		//this.jButtonSiguientesTurnoPunVen.setText(">>");
        this.jButtonSiguientesTurnoPunVen.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTurnoPunVen,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTurnoPunVen = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTurnoPunVen.setText("Nue");
        this.jButtonNuevoGuardarCambiosTurnoPunVen.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTurnoPunVen,"nuevoguardarcambios_button","Nue",this.turnopunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTurnoPunVen";
		inputMap = this.jButtonNuevoGuardarCambiosTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTurnoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTurnoPunVen"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTurnoPunVen";
		inputMap = this.jButtonRecargarInformacionTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTurnoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTurnoPunVen"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTurnoPunVen";
		inputMap = this.jButtonSiguientesTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTurnoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTurnoPunVen"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTurnoPunVen";
		inputMap = this.jButtonAnterioresTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTurnoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTurnoPunVen"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTurnoPunVen();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTurnoPunVen.setMinimumSize(new Dimension(this.getWidth(),TurnoPunVenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TurnoPunVenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTurnoPunVen.setMaximumSize(new Dimension(this.getWidth(),TurnoPunVenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TurnoPunVenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTurnoPunVen.setPreferredSize(new Dimension(this.getWidth(),TurnoPunVenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TurnoPunVenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTurnoPunVen = new GridBagLayout();

			this.jPanelPaginacionTurnoPunVen.setLayout(gridaBagLayoutPaginacionTurnoPunVen);						
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurnoPunVen.gridy = 0;
			this.gridBagConstraintsTurnoPunVen.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTurnoPunVen.add(this.jButtonAnterioresTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
					
						
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTurnoPunVen.gridy = 0;
			
			this.jPanelPaginacionTurnoPunVen.add(this.jButtonNuevoGuardarCambiosTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
						
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTurnoPunVen.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTurnoPunVen.gridy = 0;
			this.jPanelPaginacionTurnoPunVen.add(this.jButtonSiguientesTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurnoPunVen.gridy = 1;
			this.gridBagConstraintsTurnoPunVen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTurnoPunVen.add(this.jButtonNuevoTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
				this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTurnoPunVen.gridy = 1;
				this.gridBagConstraintsTurnoPunVen.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTurnoPunVen.add(this.jButtonNuevoRelacionesTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
			}
			
			
			if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
				this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTurnoPunVen.gridy = 1;
				this.gridBagConstraintsTurnoPunVen.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTurnoPunVen.add(this.jButtonGuardarCambiosTablaTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
			}
			
			
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurnoPunVen.gridy = 1;
			this.gridBagConstraintsTurnoPunVen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTurnoPunVen.add(this.jButtonDuplicarTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurnoPunVen.gridy = 1;
			this.gridBagConstraintsTurnoPunVen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTurnoPunVen.add(this.jButtonCopiarTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurnoPunVen.gridy = 1;
			this.gridBagConstraintsTurnoPunVen.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTurnoPunVen.add(this.jButtonVerFormTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurnoPunVen.gridy = 1;
			this.gridBagConstraintsTurnoPunVen.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTurnoPunVen.add(this.jButtonCerrarTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		
		
		
		this.jButtonRecargarInformacionTurnoPunVen.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTurnoPunVen.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTurnoPunVen.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTurnoPunVen.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTurnoPunVen.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTurnoPunVen.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTurnoPunVen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTurnoPunVen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTurnoPunVen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTurnoPunVen.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTurnoPunVen.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTurnoPunVen.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTurnoPunVen.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTurnoPunVen.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTurnoPunVen.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTurnoPunVen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTurnoPunVen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTurnoPunVen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTurnoPunVen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTurnoPunVen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTurnoPunVen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTurnoPunVen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTurnoPunVen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTurnoPunVen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTurnoPunVen.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTurnoPunVen.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTurnoPunVen.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTurnoPunVen.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTurnoPunVen.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTurnoPunVen.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTurnoPunVen.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTurnoPunVen.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTurnoPunVen.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTurnoPunVen.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTurnoPunVen.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTurnoPunVen.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTurnoPunVen = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTurnoPunVen = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TurnoPunVen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TurnoPunVen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TurnoPunVen = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TurnoPunVen = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTurnoPunVen.setLayout(gridaBagParametrosReportesTurnoPunVen);
			this.jPanelParametrosReportesAccionesTurnoPunVen.setLayout(gridaBagParametrosReportesAccionesTurnoPunVen);
			
			
			this.jPanelParametrosAuxiliar1TurnoPunVen.setLayout(gridaBagParametrosAuxiliar1TurnoPunVen);
			this.jPanelParametrosAuxiliar2TurnoPunVen.setLayout(gridaBagParametrosAuxiliar2TurnoPunVen);
			this.jPanelParametrosAuxiliar3TurnoPunVen.setLayout(gridaBagParametrosAuxiliar3TurnoPunVen);
			this.jPanelParametrosAuxiliar4TurnoPunVen.setLayout(gridaBagParametrosAuxiliar4TurnoPunVen);
			//this.jPanelParametrosAuxiliar5TurnoPunVen.setLayout(gridaBagParametrosAuxiliar2TurnoPunVen);			
			
			
			
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTurnoPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTurnoPunVen.add(this.jButtonRecargarInformacionTurnoPunVen, this.gridBagConstraintsTurnoPunVen);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTurnoPunVen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TurnoPunVen.add(this.jComboBoxTiposPaginacionTurnoPunVen, this.gridBagConstraintsTurnoPunVen);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTurnoPunVen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TurnoPunVen.add(this.jCheckBoxConAltoMaximoTablaTurnoPunVen, this.gridBagConstraintsTurnoPunVen);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTurnoPunVen.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TurnoPunVen.add(this.jComboBoxTiposArchivosReportesTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurnoPunVen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTurnoPunVen.add(this.jPanelParametrosAuxiliar1TurnoPunVen, this.gridBagConstraintsTurnoPunVen);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurnoPunVen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTurnoPunVen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TurnoPunVen.add(this.jComboBoxTiposReportesTurnoPunVen, this.gridBagConstraintsTurnoPunVen);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurnoPunVen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTurnoPunVen.add(this.jPanelParametrosAuxiliar4TurnoPunVen, this.gridBagConstraintsTurnoPunVen);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTurnoPunVen.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTurnoPunVen.add(this.jComboBoxTiposReportesTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurnoPunVen.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTurnoPunVen.add(this.jCheckBoxGenerarReporteTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurnoPunVen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTurnoPunVen.add(this.jPanelParametrosAuxiliar2TurnoPunVen, this.gridBagConstraintsTurnoPunVen);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTurnoPunVen.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTurnoPunVen.add(this.jLabelAccionesTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
				this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTurnoPunVen.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTurnoPunVen.add(this.jButtonAbrirOrderByTurnoPunVen, this.gridBagConstraintsTurnoPunVen);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurnoPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTurnoPunVen.add(this.jComboBoxTiposSeleccionarTurnoPunVen, this.gridBagConstraintsTurnoPunVen);			
			
			
			/*
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTurnoPunVen.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTurnoPunVen.add(this.jCheckBoxSeleccionarTodosTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurnoPunVen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTurnoPunVen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TurnoPunVen.add(this.jCheckBoxSeleccionarTodosTurnoPunVen, this.gridBagConstraintsTurnoPunVen);															
				
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurnoPunVen.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTurnoPunVen.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TurnoPunVen.add(this.jCheckBoxSeleccionadosTurnoPunVen, this.gridBagConstraintsTurnoPunVen);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurnoPunVen.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTurnoPunVen.add(this.jPanelParametrosAuxiliar3TurnoPunVen, this.gridBagConstraintsTurnoPunVen);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurnoPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTurnoPunVen.add(this.jComboBoxTiposRelacionesTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
				
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurnoPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTurnoPunVen.add(this.jComboBoxTiposAccionesTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
	
				
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTurnoPunVen.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTurnoPunVen.add(this.jTextFieldValorCampoGeneralTurnoPunVen, this.gridBagConstraintsTurnoPunVen);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTurnoPunVen = new GridBagLayout();

			this.jScrollPanelDatosTurnoPunVen.setLayout(gridaBagLayoutDatosTurnoPunVen);
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurnoPunVen.gridy = 0;
			this.gridBagConstraintsTurnoPunVen.gridx = 0;
			
			this.jScrollPanelDatosTurnoPunVen.add(this.jTableDatosTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTurnoPunVen.setViewportView(this.jTableDatosTurnoPunVen);
		this.jTableDatosTurnoPunVen.setFillsViewportHeight(true);
		this.jTableDatosTurnoPunVen.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTurnoPunVen= new GridBagLayout();
		this.jPanelAccionesTurnoPunVen.setLayout(gridaBagLayoutAccionesTurnoPunVen);
		
		
		/*	
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurnoPunVen.gridy = 0;
		this.gridBagConstraintsTurnoPunVen.gridx = 0;
			
		this.jPanelAccionesTurnoPunVen.add(this.jButtonNuevoTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTurnoPunVen = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTurnoPunVen);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.turnopunvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();						
			this.gridBagConstraintsTurnoPunVen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTurnoPunVen.gridx = 0;		
			//this.gridBagConstraintsTurnoPunVen.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTurnoPunVen.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTurnoPunVen, this.gridBagConstraintsTurnoPunVen);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTurnoPunVen.gridx = 0;		
		//this.gridBagConstraintsTurnoPunVen.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurnoPunVen.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTurnoPunVen.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTurnoPunVen);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTurnoPunVen.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTurnoPunVen, this.gridBagConstraintsTurnoPunVen);								
		
		
		/*
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTurnoPunVen.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		*/		
		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTurnoPunVen.gridx =0;
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTurnoPunVen.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
				
		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTurnoPunVen.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TurnoPunVenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTurnoPunVen= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTurnoPunVen = new GridBagLayout();
			this.jPanelBusquedasParametrosTurnoPunVen.setLayout(gridaBagLayoutBusquedasParametrosTurnoPunVen);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTurnoPunVen=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTurnoPunVen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTurnoPunVen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTurnoPunVen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTurnoPunVen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
			
			
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTurnoPunVen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		
			
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTurnoPunVen.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTurnoPunVen;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTurnoPunVen() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTurnoPunVen = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTurnoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTurnoPunVen.setName("jPanelReporteDinamicoTurnoPunVen"); 
		
		this.jPanelReporteDinamicoTurnoPunVen.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTurnoPunVen.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTurnoPunVen.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTurnoPunVen.setLayout(gridaBagLayoutReporteDinamicoTurnoPunVen);
		
		
		this.jInternalFrameReporteDinamicoTurnoPunVen= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTurnoPunVen = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTurnoPunVen= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTurnoPunVen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTurnoPunVen.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTurnoPunVen.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTurnoPunVen.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTurnoPunVen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTurnoPunVen.setResizable(true);
	    this.jInternalFrameReporteDinamicoTurnoPunVen.setClosable(true);
	    this.jInternalFrameReporteDinamicoTurnoPunVen.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTurnoPunVen.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTurnoPunVen.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTurnoPunVen.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Turno Pun Venes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTurnoPunVen = new JLabelMe();

		this.jLabelColumnasSelectReporteTurnoPunVen.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTurnoPunVen.add(this.jLabelColumnasSelectReporteTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTurnoPunVen = new JList<Reporte>();
		this.jListColumnasSelectReporteTurnoPunVen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTurnoPunVen.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTurnoPunVen.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTurnoPunVen.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTurnoPunVen.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTurnoPunVen=new JScrollPane(this.jListColumnasSelectReporteTurnoPunVen);
			
			this.jScrollColumnasSelectReporteTurnoPunVen.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTurnoPunVen.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTurnoPunVen.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTurnoPunVen.add(this.jListColumnasSelectReporteTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		this.jPanelReporteDinamicoTurnoPunVen.add(this.jScrollColumnasSelectReporteTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTurnoPunVen = new JLabelMe();

		this.jLabelRelacionesSelectReporteTurnoPunVen.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTurnoPunVen.add(this.jLabelRelacionesSelectReporteTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTurnoPunVen = new JList<Reporte>();
		this.jListRelacionesSelectReporteTurnoPunVen.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTurnoPunVen.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTurnoPunVen.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTurnoPunVen.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTurnoPunVen.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTurnoPunVen=new JScrollPane(this.jListRelacionesSelectReporteTurnoPunVen);
			
			this.jScrollRelacionesSelectReporteTurnoPunVen.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTurnoPunVen.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTurnoPunVen.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTurnoPunVen.add(this.jListRelacionesSelectReporteTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		this.jPanelReporteDinamicoTurnoPunVen.add(this.jScrollRelacionesSelectReporteTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTurnoPunVen = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTurnoPunVen = new JComboBoxMe();
		this.jListColumnasValoresGraficoTurnoPunVen = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTurnoPunVen = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTurnoPunVen.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTurnoPunVen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTurnoPunVen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTurnoPunVen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTurnoPunVen = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTurnoPunVen.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTurnoPunVen.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTurnoPunVen.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTurnoPunVen.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTurnoPunVen = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTurnoPunVen.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTurnoPunVen.add(this.jLabelGenerarExcelReporteDinamicoTurnoPunVen, this.gridBagConstraintsTurnoPunVen);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTurnoPunVen = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTurnoPunVen.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTurnoPunVen,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTurnoPunVen.setToolTipText("Generar EXCEL"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		//this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTurnoPunVen.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTurnoPunVen.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTurnoPunVen.add(this.jButtonGenerarExcelReporteDinamicoTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurnoPunVen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTurnoPunVen.add(this.jComboBoxTiposReportesDinamicoTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTurnoPunVen = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTurnoPunVen.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTurnoPunVen.add(this.jLabelTiposArchivoReporteDinamicoTurnoPunVen, this.gridBagConstraintsTurnoPunVen);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurnoPunVen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTurnoPunVen.add(this.jComboBoxTiposArchivosReportesDinamicoTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTurnoPunVen = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTurnoPunVen.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTurnoPunVen,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTurnoPunVen.setToolTipText("Generar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurnoPunVen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTurnoPunVen.add(this.jButtonGenerarReporteDinamicoTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTurnoPunVen = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTurnoPunVen.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTurnoPunVen,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTurnoPunVen.setToolTipText("Cancelar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurnoPunVen.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTurnoPunVen.add(this.jButtonCerrarReporteDinamicoTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTurnoPunVen = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTurnoPunVen= new JScrollPane(jPanelReporteDinamicoTurnoPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTurnoPunVen.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTurnoPunVen.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTurnoPunVen.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Turno Pun Venes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTurnoPunVen.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTurnoPunVen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTurnoPunVen.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTurnoPunVen);
		this.jInternalFrameReporteDinamicoTurnoPunVen.getContentPane().add(this.jScrollPanelReporteDinamicoTurnoPunVen, this.gridBagConstraintsTurnoPunVen);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTurnoPunVen() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTurnoPunVen = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTurnoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTurnoPunVen.setName("jPanelImportacionTurnoPunVen"); 
		
		this.jPanelImportacionTurnoPunVen.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTurnoPunVen.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTurnoPunVen.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTurnoPunVen.setLayout(gridaBagLayoutImportacionTurnoPunVen);
		
		
		this.jInternalFrameImportacionTurnoPunVen= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTurnoPunVen= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTurnoPunVen = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTurnoPunVen= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTurnoPunVen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTurnoPunVen.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTurnoPunVen.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTurnoPunVen.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTurnoPunVen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTurnoPunVen.setResizable(true);
	    this.jInternalFrameImportacionTurnoPunVen.setClosable(true);
	    this.jInternalFrameImportacionTurnoPunVen.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTurnoPunVen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTurnoPunVen.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTurnoPunVen.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTurnoPunVen.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTurnoPunVen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTurnoPunVen.setResizable(true);
	    this.jInternalFrameImportacionTurnoPunVen.setClosable(true);
	    this.jInternalFrameImportacionTurnoPunVen.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTurnoPunVen.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTurnoPunVen.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTurnoPunVen.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Turno Pun Venes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTurnoPunVen = new JLabelMe();

		this.jLabelArchivoImportacionTurnoPunVen.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = iPosYImportacion;		
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTurnoPunVen.add(this.jLabelArchivoImportacionTurnoPunVen, this.gridBagConstraintsTurnoPunVen);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTurnoPunVen = new JFileChooser();		
		this.jFileChooserImportacionTurnoPunVen.setToolTipText("ESCOGER ARCHIVO"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTurnoPunVen = new JButtonMe();
		this.jButtonAbrirImportacionTurnoPunVen.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTurnoPunVen,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTurnoPunVen.setToolTipText("Generar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurnoPunVen.gridy = iPosYImportacion;
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTurnoPunVen.add(this.jButtonAbrirImportacionTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTurnoPunVen = new JLabelMe();

		this.jLabelPathArchivoImportacionTurnoPunVen.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTurnoPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTurnoPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTurnoPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTurnoPunVen.gridy = iPosYImportacion;		
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTurnoPunVen.add(this.jLabelPathArchivoImportacionTurnoPunVen, this.gridBagConstraintsTurnoPunVen);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTurnoPunVen=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTurnoPunVen.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTurnoPunVen.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTurnoPunVen.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurnoPunVen.gridy = iPosYImportacion;
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTurnoPunVen.add(this.jTextFieldPathArchivoImportacionTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTurnoPunVen = new JButtonMe();
		this.jButtonGenerarImportacionTurnoPunVen.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTurnoPunVen,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTurnoPunVen.setToolTipText("Generar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurnoPunVen.gridy = iPosYImportacion;
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTurnoPunVen.add(this.jButtonGenerarImportacionTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTurnoPunVen = new JButtonMe();
		this.jButtonCerrarImportacionTurnoPunVen.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTurnoPunVen,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTurnoPunVen.setToolTipText("Cancelar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTurnoPunVen.gridy = iPosYImportacion;
		this.gridBagConstraintsTurnoPunVen.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTurnoPunVen.add(this.jButtonCerrarImportacionTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTurnoPunVen = new GridBagLayout();
		
		this.jScrollPanelImportacionTurnoPunVen= new JScrollPane(jPanelImportacionTurnoPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
		this.gridBagConstraintsTurnoPunVen.gridy =iPosYImportacion;
		this.gridBagConstraintsTurnoPunVen.gridx =iPosXImportacion;
		this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTurnoPunVen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTurnoPunVen.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTurnoPunVen);
		this.jInternalFrameImportacionTurnoPunVen.getContentPane().add(this.jScrollPanelImportacionTurnoPunVen, this.gridBagConstraintsTurnoPunVen);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTurnoPunVen(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTurnoPunVen = new JButtonMe();
			this.jButtonAbrirOrderByTurnoPunVen.setText("Orden");
			this.jButtonAbrirOrderByTurnoPunVen.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTurnoPunVen,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTurnoPunVen";
			inputMap = this.jButtonAbrirOrderByTurnoPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTurnoPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTurnoPunVen"));
		
		
			GridBagLayout gridaBagLayoutOrderByTurnoPunVen = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTurnoPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTurnoPunVen.setName("jPanelOrderByTurnoPunVen"); 
			
			this.jPanelOrderByTurnoPunVen.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTurnoPunVen.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTurnoPunVen.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTurnoPunVen.setLayout(gridaBagLayoutOrderByTurnoPunVen);
			
			
			this.jTableDatosTurnoPunVenOrderBy = new JTableMe();        
			this.jTableDatosTurnoPunVenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTurnoPunVenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTurnoPunVenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTurnoPunVenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTurnoPunVenOrderBy.setViewportView(this.jTableDatosTurnoPunVenOrderBy);
			this.jTableDatosTurnoPunVenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTurnoPunVenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTurnoPunVen= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTurnoPunVen= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTurnoPunVen = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTurnoPunVen= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTurnoPunVen.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTurnoPunVen.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTurnoPunVen.setTitle("Orden");
			this.jInternalFrameOrderByTurnoPunVen.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTurnoPunVen.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTurnoPunVen.setResizable(true);
			this.jInternalFrameOrderByTurnoPunVen.setClosable(true);
			this.jInternalFrameOrderByTurnoPunVen.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTurnoPunVen.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTurnoPunVen.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTurnoPunVen.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTurnoPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Turno Pun Venes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTurnoPunVen.gridx =iPosXOrderBy;
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTurnoPunVen.ipady =150;
				
			this.jPanelOrderByTurnoPunVen.add(jScrollPanelDatosTurnoPunVenOrderBy, this.gridBagConstraintsTurnoPunVen);//this.jTableDatosTurnoPunVenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTurnoPunVen = new JButtonMe();
			this.jButtonCerrarOrderByTurnoPunVen.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTurnoPunVen,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTurnoPunVen.setToolTipText("Cancelar"+" "+TurnoPunVenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTurnoPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTurnoPunVen.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTurnoPunVen.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTurnoPunVen.add(this.jButtonCerrarOrderByTurnoPunVen, this.gridBagConstraintsTurnoPunVen);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTurnoPunVen = new GridBagLayout();
			
			this.jScrollPanelOrderByTurnoPunVen= new JScrollPane(jPanelOrderByTurnoPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTurnoPunVen = new GridBagConstraints();
			this.gridBagConstraintsTurnoPunVen.gridy =iPosYOrderBy;
			this.gridBagConstraintsTurnoPunVen.gridx =iPosXOrderBy;
			this.gridBagConstraintsTurnoPunVen.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTurnoPunVen.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTurnoPunVen.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTurnoPunVen);
			
			this.jInternalFrameOrderByTurnoPunVen.getContentPane().add(this.jScrollPanelOrderByTurnoPunVen, this.gridBagConstraintsTurnoPunVen);			
		
		} else {
			this.jButtonAbrirOrderByTurnoPunVen = new JButtonMe();
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
		int iWidthTableCalculado=0;//1530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.turnopunvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTurnoPunVen.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTurnoPunVen.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTurnoPunVen.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTurnoPunVen.getRowHeight();//TurnoPunVenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TurnoPunVenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTurnoPunVen.isSelected()) {
					iHeightTable=TurnoPunVenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TurnoPunVenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TurnoPunVenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TurnoPunVenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTurnoPunVen.isSelected()) {
					iHeightTable=TurnoPunVenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TurnoPunVenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TurnoPunVenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTurnoPunVen.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTurnoPunVen.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTurnoPunVen.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTurnoPunVen.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTurnoPunVen.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTurnoPunVen.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTurnoPunVen!=null && this.jInternalFrameOrderByTurnoPunVen.getjTableDatosOrderBy()!=null) {
			//if(!this.turnopunvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTurnoPunVen.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTurnoPunVen.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTurnoPunVen.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTurnoPunVen.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTurnoPunVen.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTurnoPunVen.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTurnoPunVen.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTurnoPunVen.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTurnoPunVen.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTurnoPunVen.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=turnopunvenLogic.getTurnoPunVens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=turnopunvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TurnoPunVen> TraerTurnoPunVenBeans(List<TurnoPunVen> turnopunvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(TurnoPunVen turnopunven:turnopunvens) {
					
				if(!(TurnoPunVenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TurnoPunVenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					turnopunven.setsDetalleGeneralEntityReporte(TurnoPunVenConstantesFunciones.getTurnoPunVenDescripcion(turnopunven));
										
						
					
					

					if(turnopunven.getCajaIngresos()!=null && Funciones.existeClass(classes,CajaIngreso.class)) {
						try{turnopunven.setcajaingresosDescripcionReporte(new JRBeanCollectionDataSource(CajaIngresoJInternalFrame.TraerCajaIngresoBeans(turnopunven.getCajaIngresos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(turnopunven.getCajeroTurnos()!=null && Funciones.existeClass(classes,CajeroTurno.class)) {
						try{turnopunven.setcajeroturnosDescripcionReporte(new JRBeanCollectionDataSource(CajeroTurnoJInternalFrame.TraerCajeroTurnoBeans(turnopunven.getCajeroTurnos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(turnopunven.getCajaEgresos()!=null && Funciones.existeClass(classes,CajaEgreso.class)) {
						try{turnopunven.setcajaegresosDescripcionReporte(new JRBeanCollectionDataSource(CajaEgresoJInternalFrame.TraerCajaEgresoBeans(turnopunven.getCajaEgresos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//turnopunven.setsDetalleGeneralEntityReporte(turnopunven.getsDetalleGeneralEntityReporte());
										
				}
				
				//turnopunvenbeans.add(turnopunvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return turnopunvens;
    }
	//PARA REPORTES FIN
}
