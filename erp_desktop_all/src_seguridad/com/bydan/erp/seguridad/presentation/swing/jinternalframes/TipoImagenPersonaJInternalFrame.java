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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.seguridad.util.TipoImagenPersonaConstantesFunciones;

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
public class TipoImagenPersonaJInternalFrame extends TipoImagenPersonaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoImagenPersona;
	
	protected JMenuBar jmenuBarTipoImagenPersona;
	
	protected JMenu jmenuTipoImagenPersona;
	protected JMenu jmenuDatosTipoImagenPersona;
	protected JMenu jmenuArchivoTipoImagenPersona;
	protected JMenu jmenuAccionesTipoImagenPersona;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoImagenPersona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoImagenPersona;	
	protected GridBagConstraints gridBagConstraintsTipoImagenPersona;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoImagenPersonaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoImagenPersona;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoImagenPersona;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoImagenPersona;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoImagenPersonaSessionBean tipoimagenpersonaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoImagenPersona> tipoimagenpersonas;		
	public List<TipoImagenPersona> tipoimagenpersonasEliminados;	
	public List<TipoImagenPersona> tipoimagenpersonasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoImagenPersona;		
	protected JButton jButtonAbrirOrderByTipoImagenPersona;
	
	
	//protected JPanel jPanelOrderByTipoImagenPersona;
	//public JScrollPane jScrollPanelOrderByTipoImagenPersona;	
	//protected JButton jButtonCerrarOrderByTipoImagenPersona;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoImagenPersonaLogic tipoimagenpersonaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoImagenPersona;
	public JScrollPane jScrollPanelDatosEdicionTipoImagenPersona;
	public JScrollPane jScrollPanelDatosGeneralTipoImagenPersona;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoImagenPersonaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoImagenPersona;
	//public JScrollPane jScrollPanelImportacionTipoImagenPersona;
	
	
	
	protected JPanel jPanelAccionesTipoImagenPersona;
	
    protected JPanel jPanelPaginacionTipoImagenPersona;
    protected JPanel jPanelParametrosReportesTipoImagenPersona;
	protected JPanel jPanelParametrosReportesAccionesTipoImagenPersona;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoImagenPersona;
	protected JPanel jPanelParametrosAuxiliar2TipoImagenPersona;
	protected JPanel jPanelParametrosAuxiliar3TipoImagenPersona;
	protected JPanel jPanelParametrosAuxiliar4TipoImagenPersona;
	//protected JPanel jPanelParametrosAuxiliar5TipoImagenPersona;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoImagenPersona;
	//protected JPanel jPanelImportacionTipoImagenPersona;
	
	
	public JTable jTableDatosTipoImagenPersona;
	
	
	
	//public JTable jTableDatosTipoImagenPersonaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoImagenPersona;
	protected JButton jButtonDuplicarTipoImagenPersona;
	protected JButton jButtonCopiarTipoImagenPersona;
	protected JButton jButtonVerFormTipoImagenPersona;
	protected JButton jButtonNuevoRelacionesTipoImagenPersona;
	protected JButton jButtonModificarTipoImagenPersona;
	
    protected JButton jButtonGuardarCambiosTablaTipoImagenPersona;
	protected JButton jButtonCerrarTipoImagenPersona;
	
	
	protected JButton jButtonRecargarInformacionTipoImagenPersona;
	protected JButton jButtonProcesarInformacionTipoImagenPersona;
	
	
	protected JButton jButtonAnterioresTipoImagenPersona;
	protected JButton jButtonSiguientesTipoImagenPersona;
	protected JButton jButtonNuevoGuardarCambiosTipoImagenPersona;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoImagenPersona;
	//protected JButton jButtonCerrarReporteDinamicoTipoImagenPersona;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoImagenPersona;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoImagenPersona;
	//protected JButton jButtonGenerarImportacionTipoImagenPersona;
	//protected JButton jButtonCerrarImportacionTipoImagenPersona;
	//protected JFileChooser jFileChooserImportacionTipoImagenPersona;
	//protected File fileImportacionTipoImagenPersona;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoImagenPersona;
	protected JButton jButtonDuplicarToolBarTipoImagenPersona;
	protected JButton jButtonNuevoRelacionesToolBarTipoImagenPersona;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoImagenPersona;
	protected JButton jButtonCopiarToolBarTipoImagenPersona;
	protected JButton jButtonVerFormToolBarTipoImagenPersona;
	public JButton jButtonGuardarCambiosTablaToolBarTipoImagenPersona;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoImagenPersona;
	protected JButton jButtonCerrarToolBarTipoImagenPersona;
	
	protected JButton jButtonRecargarInformacionToolBarTipoImagenPersona;
	protected JButton jButtonProcesarInformacionToolBarTipoImagenPersona;
	protected JButton jButtonAnterioresToolBarTipoImagenPersona;
	protected JButton jButtonSiguientesToolBarTipoImagenPersona;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoImagenPersona;
	protected JButton jButtonAbrirOrderByToolBarTipoImagenPersona;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoImagenPersona;
	protected JMenuItem jMenuItemDuplicarTipoImagenPersona;
	protected JMenuItem jMenuItemNuevoRelacionesTipoImagenPersona;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoImagenPersona;
	protected JMenuItem jMenuItemCopiarTipoImagenPersona;
	protected JMenuItem jMenuItemVerFormTipoImagenPersona;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoImagenPersona;
	protected JMenuItem jMenuItemCerrarTipoImagenPersona;
	protected JMenuItem jMenuItemDetalleCerrarTipoImagenPersona;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoImagenPersona;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoImagenPersona;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoImagenPersona;
	protected JMenuItem jMenuItemProcesarInformacionTipoImagenPersona;
	protected JMenuItem jMenuItemAnterioresTipoImagenPersona;
	protected JMenuItem jMenuItemSiguientesTipoImagenPersona;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoImagenPersona;
	protected JMenuItem jMenuItemAbrirOrderByTipoImagenPersona;
	protected JMenuItem jMenuItemMostrarOcultarTipoImagenPersona;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoImagenPersona;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoImagenPersona;
	protected JCheckBox jCheckBoxSeleccionadosTipoImagenPersona;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoImagenPersona;
	protected JCheckBox jCheckBoxConGraficoReporteTipoImagenPersona;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoImagenPersona;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoImagenPersona;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoImagenPersona;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoImagenPersona;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoImagenPersona;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoImagenPersona;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoImagenPersona;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoImagenPersona;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoImagenPersona;
	protected JTextField jTextFieldValorCampoGeneralTipoImagenPersona;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoImagenPersona;
	//public JList<Reporte> jListColumnasSelectReporteTipoImagenPersona;
	//public JScrollPane jScrollColumnasSelectReporteTipoImagenPersona;
	
	//public JLabel jLabelRelacionesSelectReporteTipoImagenPersona;
	//public JList<Reporte> jListRelacionesSelectReporteTipoImagenPersona;
	//public JScrollPane jScrollRelacionesSelectReporteTipoImagenPersona;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoImagenPersona;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoImagenPersona;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoImagenPersona;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoImagenPersona;
	
		
	//public JLabel jLabelArchivoImportacionTipoImagenPersona;	
	//public JLabel jLabelPathArchivoImportacionTipoImagenPersona;
	//protected JTextField jTextFieldPathArchivoImportacionTipoImagenPersona;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoImagenPersona;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoImagenPersona;
	
	//public JLabel jLabelColumnaCategoriaValorTipoImagenPersona;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoImagenPersona;
	
	//public JLabel jLabelColumnasValoresGraficoTipoImagenPersona;
	//public JList<Reporte> jListColumnasValoresGraficoTipoImagenPersona;
	//public JScrollPane jScrollColumnasValoresGraficoTipoImagenPersona;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoImagenPersona;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoImagenPersona;	
	
	
	
	
	
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
	public TipoImagenPersonaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoImagenPersona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImagenPersonaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoImagenPersona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImagenPersonaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoImagenPersona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImagenPersonaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoImagenPersona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoImagenPersona)	{
		this.jButtonRecargarInformacionTipoImagenPersona = jButtonRecargarInformacionTipoImagenPersona;
	}
	
	public JButton getjButtonProcesarInformacionTipoImagenPersona() {
		return this.jButtonProcesarInformacionTipoImagenPersona;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoImagenPersona)	{
		this.jButtonProcesarInformacionTipoImagenPersona = jButtonProcesarInformacionTipoImagenPersona;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoImagenPersona() {
		return this.jButtonRecargarInformacionTipoImagenPersona;
	}
	
	
	public List<TipoImagenPersona> gettipoimagenpersonas() {
		return this.tipoimagenpersonas;
	}

	public void settipoimagenpersonas(List<TipoImagenPersona> tipoimagenpersonas) {
		this.tipoimagenpersonas = tipoimagenpersonas;
	}
	
	public List<TipoImagenPersona> gettipoimagenpersonasAux() {
		return this.tipoimagenpersonasAux;
	}

	public void settipoimagenpersonasAux(List<TipoImagenPersona> tipoimagenpersonasAux) {
		this.tipoimagenpersonasAux = tipoimagenpersonasAux;
	}
	
	public List<TipoImagenPersona> gettipoimagenpersonasEliminados() {
		return this.tipoimagenpersonasEliminados;
	}

	public void setTipoImagenPersonasEliminados(List<TipoImagenPersona> tipoimagenpersonasEliminados) {
		this.tipoimagenpersonasEliminados = tipoimagenpersonasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoImagenPersona() {
		return jComboBoxTiposSeleccionarTipoImagenPersona;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoImagenPersona(
			JComboBox jComboBoxTiposSeleccionarTipoImagenPersona) {
		this.jComboBoxTiposSeleccionarTipoImagenPersona = jComboBoxTiposSeleccionarTipoImagenPersona;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoImagenPersona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoImagenPersona.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoImagenPersona .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoImagenPersona() {
		return jTextFieldValorCampoGeneralTipoImagenPersona;
	}

	public void setjTextFieldValorCampoGeneralTipoImagenPersona(
			JTextField jTextFieldValorCampoGeneralTipoImagenPersona) {
		this.jTextFieldValorCampoGeneralTipoImagenPersona = jTextFieldValorCampoGeneralTipoImagenPersona;
	}

	public void setBorderResaltarValorCampoGeneralTipoImagenPersona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagenPersona.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoImagenPersona .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoImagenPersona() {
		return this.jCheckBoxSeleccionarTodosTipoImagenPersona;
	}

	public void setjCheckBoxSeleccionarTodosTipoImagenPersona(
			JCheckBox jCheckBoxSeleccionarTodosTipoImagenPersona) {
		this.jCheckBoxSeleccionarTodosTipoImagenPersona = jCheckBoxSeleccionarTodosTipoImagenPersona;
	}

	public void setBorderResaltarSeleccionarTodosTipoImagenPersona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagenPersona.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoImagenPersona .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoImagenPersona() {
		return this.jCheckBoxSeleccionadosTipoImagenPersona;
	}

	public void setjCheckBoxSeleccionadosTipoImagenPersona(
			JCheckBox jCheckBoxSeleccionadosTipoImagenPersona) {
		this.jCheckBoxSeleccionadosTipoImagenPersona = jCheckBoxSeleccionadosTipoImagenPersona;
	}
	
	public void setBorderResaltarSeleccionadosTipoImagenPersona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagenPersona.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoImagenPersona .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoImagenPersona() {
		return this.jComboBoxTiposArchivosReportesTipoImagenPersona;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoImagenPersona(
			JComboBox jComboBoxTiposArchivosReportesTipoImagenPersona) {
		this.jComboBoxTiposArchivosReportesTipoImagenPersona = jComboBoxTiposArchivosReportesTipoImagenPersona;
	}

	public void setBorderResaltarTiposArchivosReportesTipoImagenPersona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagenPersona.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoImagenPersona .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoImagenPersona() {
		return this.jComboBoxTiposReportesTipoImagenPersona;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoImagenPersona(
			JComboBox jComboBoxTiposReportesTipoImagenPersona) {
		this.jComboBoxTiposReportesTipoImagenPersona = jComboBoxTiposReportesTipoImagenPersona;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoImagenPersona() {
	//	return jComboBoxTiposReportesDinamicoTipoImagenPersona;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoImagenPersona(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoImagenPersona) {
	//	this.jComboBoxTiposReportesDinamicoTipoImagenPersona = jComboBoxTiposReportesDinamicoTipoImagenPersona;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoImagenPersona() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoImagenPersona;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoImagenPersona(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoImagenPersona) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoImagenPersona = jComboBoxTiposArchivosReportesDinamicoTipoImagenPersona;
	//}
	
	public void setBorderResaltarTiposReportesTipoImagenPersona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagenPersona.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoImagenPersona .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoImagenPersona() {
		return this.jComboBoxTiposGraficosReportesTipoImagenPersona;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoImagenPersona(
			JComboBox jComboBoxTiposGraficosReportesTipoImagenPersona) {
		this.jComboBoxTiposGraficosReportesTipoImagenPersona = jComboBoxTiposGraficosReportesTipoImagenPersona;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoImagenPersona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagenPersona.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoImagenPersona .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoImagenPersona() {
		return this.jComboBoxTiposPaginacionTipoImagenPersona;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoImagenPersona(
			JComboBox jComboBoxTiposPaginacionTipoImagenPersona) {
		this.jComboBoxTiposPaginacionTipoImagenPersona = jComboBoxTiposPaginacionTipoImagenPersona;
	}
	
	public void setBorderResaltarTiposPaginacionTipoImagenPersona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagenPersona.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoImagenPersona .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoImagenPersona() {
		return this.jComboBoxTiposRelacionesTipoImagenPersona;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoImagenPersona() {
		return this.jComboBoxTiposAccionesTipoImagenPersona;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoImagenPersona(
			JComboBox jComboBoxTiposRelacionesTipoImagenPersona) {
		this.jComboBoxTiposRelacionesTipoImagenPersona = jComboBoxTiposRelacionesTipoImagenPersona;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoImagenPersona(
			JComboBox jComboBoxTiposAccionesTipoImagenPersona) {
		this.jComboBoxTiposAccionesTipoImagenPersona = jComboBoxTiposAccionesTipoImagenPersona;
	}
	
	public void setBorderResaltarTiposRelacionesTipoImagenPersona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagenPersona.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoImagenPersona .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoImagenPersona() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoImagenPersona.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoImagenPersona .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoImagenPersona() {
	//	return jCheckBoxConGraficoDinamicoTipoImagenPersona;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoImagenPersona(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoImagenPersona) {
	//	this.jCheckBoxConGraficoDinamicoTipoImagenPersona = jCheckBoxConGraficoDinamicoTipoImagenPersona;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoImagenPersona() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoImagenPersona.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoImagenPersona .setBorder(borderResaltar);		
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
		this.tipoimagenpersonaSessionBean=new TipoImagenPersonaSessionBean();
		
		this.tipoimagenpersonaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoimagenpersonaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoImagenPersonaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoImagenPersonaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoImagenPersonaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoImagenPersonaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoImagenPersonaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Imagen Persona MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoImagenPersonaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoImagenPersona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoImagenPersona= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoImagenPersona,this.jTtoolBarTipoImagenPersona,
							"nuevo","nuevo","Nuevo"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoImagenPersona,this.jTtoolBarTipoImagenPersona,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoImagenPersona,this.jTtoolBarTipoImagenPersona,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoImagenPersona,this.jTtoolBarTipoImagenPersona,
							"duplicar","duplicar","Duplicar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoImagenPersona,this.jTtoolBarTipoImagenPersona,
							"copiar","copiar","Copiar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoImagenPersona,this.jTtoolBarTipoImagenPersona,
							"ver_form","ver_form","Ver"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoImagenPersona,this.jTtoolBarTipoImagenPersona,
							"recargar","recargar","Recargar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoImagenPersona,this.jTtoolBarTipoImagenPersona,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoImagenPersona,this.jTtoolBarTipoImagenPersona,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoImagenPersona,this.jTtoolBarTipoImagenPersona,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoImagenPersona,this.jTtoolBarTipoImagenPersona,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoImagenPersona,this.jTtoolBarTipoImagenPersona,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoImagenPersona,this.jTtoolBarTipoImagenPersona,
							"cerrar","cerrar","Salir"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoImagenPersona=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoImagenPersona;
			
				this.jButtonProcesarInformacionToolBarTipoImagenPersona=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoImagenPersona;
				
		//protected JButton jButtonModificarToolBarTipoImagenPersona;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoImagenPersona=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoImagenPersona=new JMenuMe("General");
		this.jmenuArchivoTipoImagenPersona=new JMenuMe("Archivo");
		this.jmenuAccionesTipoImagenPersona=new JMenuMe("Acciones");
		this.jmenuDatosTipoImagenPersona=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoImagenPersona= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoImagenPersona.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoImagenPersona,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoImagenPersona= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoImagenPersona.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoImagenPersona,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoImagenPersona= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoImagenPersona.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoImagenPersona,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoImagenPersona= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoImagenPersona.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoImagenPersona,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoImagenPersona= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoImagenPersona.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoImagenPersona,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoImagenPersona= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoImagenPersona.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoImagenPersona,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoImagenPersona= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoImagenPersona.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoImagenPersona,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoImagenPersona= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoImagenPersona.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoImagenPersona,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoImagenPersona= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoImagenPersona.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoImagenPersona,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoImagenPersona= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoImagenPersona.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoImagenPersona,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoImagenPersona= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoImagenPersona.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoImagenPersona,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoImagenPersona= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoImagenPersona.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoImagenPersona,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoImagenPersona= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoImagenPersona.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoImagenPersona,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoImagenPersona= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoImagenPersona.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoImagenPersona,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoImagenPersona= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoImagenPersona.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoImagenPersona,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoImagenPersona= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoImagenPersona.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoImagenPersona,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoImagenPersona= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoImagenPersona.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoImagenPersona,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoImagenPersona.add(this.jMenuItemCerrarTipoImagenPersona);
			
			this.jmenuAccionesTipoImagenPersona.add(this.jMenuItemNuevoTipoImagenPersona);
			this.jmenuAccionesTipoImagenPersona.add(this.jMenuItemNuevoGuardarCambiosTipoImagenPersona);
			this.jmenuAccionesTipoImagenPersona.add(this.jMenuItemNuevoRelacionesTipoImagenPersona);
			this.jmenuAccionesTipoImagenPersona.add(this.jMenuItemGuardarCambiosTablaTipoImagenPersona);		
			this.jmenuAccionesTipoImagenPersona.add(this.jMenuItemDuplicarTipoImagenPersona);		
			this.jmenuAccionesTipoImagenPersona.add(this.jMenuItemCopiarTipoImagenPersona);		
			this.jmenuAccionesTipoImagenPersona.add(this.jMenuItemVerFormTipoImagenPersona);		
			
			this.jmenuDatosTipoImagenPersona.add(this.jMenuItemRecargarInformacionTipoImagenPersona);				
			this.jmenuDatosTipoImagenPersona.add(this.jMenuItemAnterioresTipoImagenPersona);				
			this.jmenuDatosTipoImagenPersona.add(this.jMenuItemSiguientesTipoImagenPersona);				
			this.jmenuDatosTipoImagenPersona.add(this.jMenuItemAbrirOrderByTipoImagenPersona);				
			this.jmenuDatosTipoImagenPersona.add(this.jMenuItemMostrarOcultarTipoImagenPersona);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoImagenPersona.add(this.jMenuItemGuardarCambiosTipoImagenPersona);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoImagenPersona.add(this.jmenuArchivoTipoImagenPersona);		
			this.jmenuBarTipoImagenPersona.add(this.jmenuAccionesTipoImagenPersona);		
			this.jmenuBarTipoImagenPersona.add(this.jmenuDatosTipoImagenPersona);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoImagenPersona);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoImagenPersona() {
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
			//this.jInternalFrameDetalleTipoImagenPersona = new TipoImagenPersonaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Imagen Persona DATOS");
			this.jInternalFrameDetalleFormTipoImagenPersona = new TipoImagenPersonaDetalleFormJInternalFrame(jDesktopPane,this.tipoimagenpersonaSessionBean.getConGuardarRelaciones(),this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoImagenPersona = null;//new TipoImagenPersonaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoImagenPersona= new GridBagLayout();
		
		
		this.jTableDatosTipoImagenPersona = new JTableMe();      
		
		String sToolTipTipoImagenPersona="";
		sToolTipTipoImagenPersona=TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoImagenPersona+="(Seguridad.TipoImagenPersona)";
		}
		
		if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoImagenPersona+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoImagenPersona.setToolTipText(sToolTipTipoImagenPersona);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoImagenPersona);
		this.jTableDatosTipoImagenPersona.setAutoCreateRowSorter(true);
		this.jTableDatosTipoImagenPersona.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoImagenPersona.setRowSelectionAllowed(true);
		this.jTableDatosTipoImagenPersona.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoImagenPersona,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoImagenPersona = new JButtonMe();
		this.jButtonDuplicarTipoImagenPersona = new JButtonMe();
		this.jButtonCopiarTipoImagenPersona = new JButtonMe();
		this.jButtonVerFormTipoImagenPersona = new JButtonMe();
		this.jButtonNuevoRelacionesTipoImagenPersona = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoImagenPersona = new JButtonMe();
		this.jButtonCerrarTipoImagenPersona = new JButtonMe();
		
		this.jScrollPanelDatosTipoImagenPersona = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoImagenPersona = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoImagenPersona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Imagen Persona";
		
		if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Imagen Personas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoImagenPersona.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoImagenPersona.setToolTipText("Acciones");
        this.jPanelAccionesTipoImagenPersona.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoImagenPersona=new ReporteDinamicoJInternalFrame(TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoImagenPersona();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoImagenPersona=new ImportacionJInternalFrame(TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoImagenPersona();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoImagenPersona = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoImagenPersona.setText("Orden");
		this.jButtonAbrirOrderByTipoImagenPersona.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoImagenPersona,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoImagenPersona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoImagenPersona=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoImagenPersona,false,this);
			
			//this.cargarOrderByTipoImagenPersona(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoImagenPersona=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoImagenPersona,true,this);
			
			//this.cargarOrderByTipoImagenPersona(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoImagenPersona.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoImagenPersona.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoImagenPersona.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoImagenPersona.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoImagenPersona.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoImagenPersona.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoImagenPersona.setText("Nuevo");
		this.jButtonDuplicarTipoImagenPersona.setText("Duplicar");
		this.jButtonCopiarTipoImagenPersona.setText("Copiar");
		this.jButtonVerFormTipoImagenPersona.setText("Ver");
		this.jButtonNuevoRelacionesTipoImagenPersona.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoImagenPersona.setText("Guardar");
		this.jButtonCerrarTipoImagenPersona.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoImagenPersona,"nuevo_button","Nuevo",this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoImagenPersona,"duplicar_button","Duplicar",this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoImagenPersona,"copiar_button","Copiar",this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoImagenPersona,"ver_form","Ver",this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoImagenPersona,"nuevorelaciones_button","Nuevo Rel",this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoImagenPersona,"guardarcambiostabla_button","Guardar",this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoImagenPersona,"cerrar_button","Salir",this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoImagenPersona.setToolTipText("Nuevo"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoImagenPersona.setToolTipText("Duplicar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoImagenPersona.setToolTipText("Copiar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoImagenPersona.setToolTipText("Ver"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoImagenPersona.setToolTipText("Nuevo Rel"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoImagenPersona.setToolTipText("Guardar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoImagenPersona.setToolTipText("Salir"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoImagenPersona";
		inputMap = this.jButtonNuevoTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoImagenPersona.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoImagenPersona"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoImagenPersona";
		inputMap = this.jButtonDuplicarTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoImagenPersona.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoImagenPersona"));
		
		//COPIAR
		sMapKey = "CopiarTipoImagenPersona";
		inputMap = this.jButtonCopiarTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoImagenPersona.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoImagenPersona"));
		
		//VEr FORM
		sMapKey = "VerFormTipoImagenPersona";
		inputMap = this.jButtonVerFormTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoImagenPersona.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoImagenPersona"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoImagenPersona";
		inputMap = this.jButtonNuevoRelacionesTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoImagenPersona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoImagenPersona"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoImagenPersona";
		inputMap = this.jButtonModificarTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoImagenPersona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoImagenPersona"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoImagenPersona";
		inputMap = this.jButtonCerrarTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoImagenPersona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoImagenPersona"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoImagenPersona";
		inputMap = this.jButtonGuardarCambiosTablaTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoImagenPersona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoImagenPersona"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoImagenPersona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoImagenPersona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoImagenPersona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoImagenPersona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoImagenPersona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoImagenPersona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoImagenPersona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoImagenPersona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoImagenPersona.setName("jPanelParametrosReportesTipoImagenPersona"); 
		
		this.jPanelParametrosReportesAccionesTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoImagenPersona.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoImagenPersona.setName("jPanelParametrosReportesAccionesTipoImagenPersona"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoImagenPersona = new JButtonMe();
		this.jButtonRecargarInformacionTipoImagenPersona.setText("Recargar");
		this.jButtonRecargarInformacionTipoImagenPersona.setToolTipText("Recargar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoImagenPersona,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoImagenPersona = new JButtonMe();
		this.jButtonProcesarInformacionTipoImagenPersona.setText("Procesar");
		this.jButtonProcesarInformacionTipoImagenPersona.setToolTipText("Procesar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoImagenPersona.setVisible(false);
			
		this.jButtonProcesarInformacionTipoImagenPersona.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoImagenPersona.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoImagenPersona.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoImagenPersona = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoImagenPersona.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoImagenPersona.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoImagenPersona = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoImagenPersona.setText("TIPO");       
		this.jComboBoxTiposReportesTipoImagenPersona.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoImagenPersona = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoImagenPersona.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoImagenPersona.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoImagenPersona = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoImagenPersona.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoImagenPersona.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoImagenPersona = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoImagenPersona.setText("Accion");
		this.jComboBoxTiposRelacionesTipoImagenPersona.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoImagenPersona = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoImagenPersona.setText("Accion");
		this.jComboBoxTiposAccionesTipoImagenPersona.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoImagenPersona = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoImagenPersona.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoImagenPersona.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoImagenPersona=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoImagenPersona.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoImagenPersona.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoImagenPersona.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoImagenPersona = new JLabelMe();
		
		this.jLabelAccionesTipoImagenPersona.setText("Acciones");		
		this.jLabelAccionesTipoImagenPersona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoImagenPersona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoImagenPersona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoImagenPersona = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoImagenPersona.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoImagenPersona.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoImagenPersona = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoImagenPersona.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoImagenPersona.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoImagenPersona = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoImagenPersona.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoImagenPersona.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoImagenPersona = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoImagenPersona.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoImagenPersona.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoImagenPersona = new JButtonMe();
		//this.jButtonAnterioresTipoImagenPersona.setText("<<");
        this.jButtonAnterioresTipoImagenPersona.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoImagenPersona,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoImagenPersona = new JButtonMe();
		//this.jButtonSiguientesTipoImagenPersona.setText(">>");
        this.jButtonSiguientesTipoImagenPersona.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoImagenPersona,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoImagenPersona = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoImagenPersona.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoImagenPersona.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoImagenPersona,"nuevoguardarcambios_button","Nue",this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoImagenPersona";
		inputMap = this.jButtonNuevoGuardarCambiosTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoImagenPersona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoImagenPersona"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoImagenPersona";
		inputMap = this.jButtonRecargarInformacionTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoImagenPersona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoImagenPersona"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoImagenPersona";
		inputMap = this.jButtonSiguientesTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoImagenPersona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoImagenPersona"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoImagenPersona";
		inputMap = this.jButtonAnterioresTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoImagenPersona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoImagenPersona"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoImagenPersona();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoImagenPersona.setMinimumSize(new Dimension(this.getWidth(),TipoImagenPersonaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoImagenPersonaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoImagenPersona.setMaximumSize(new Dimension(this.getWidth(),TipoImagenPersonaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoImagenPersonaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoImagenPersona.setPreferredSize(new Dimension(this.getWidth(),TipoImagenPersonaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoImagenPersonaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoImagenPersona = new GridBagLayout();

			this.jPanelPaginacionTipoImagenPersona.setLayout(gridaBagLayoutPaginacionTipoImagenPersona);						
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagenPersona.gridy = 0;
			this.gridBagConstraintsTipoImagenPersona.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoImagenPersona.add(this.jButtonAnterioresTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
					
						
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoImagenPersona.gridy = 0;
			
			this.jPanelPaginacionTipoImagenPersona.add(this.jButtonNuevoGuardarCambiosTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
						
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoImagenPersona.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoImagenPersona.gridy = 0;
			this.jPanelPaginacionTipoImagenPersona.add(this.jButtonSiguientesTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagenPersona.gridy = 1;
			this.gridBagConstraintsTipoImagenPersona.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoImagenPersona.add(this.jButtonNuevoTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
						
			
			
			if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
				this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoImagenPersona.gridy = 1;
				this.gridBagConstraintsTipoImagenPersona.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoImagenPersona.add(this.jButtonGuardarCambiosTablaTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
			}
			
			
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagenPersona.gridy = 1;
			this.gridBagConstraintsTipoImagenPersona.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoImagenPersona.add(this.jButtonDuplicarTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagenPersona.gridy = 1;
			this.gridBagConstraintsTipoImagenPersona.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoImagenPersona.add(this.jButtonCopiarTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagenPersona.gridy = 1;
			this.gridBagConstraintsTipoImagenPersona.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoImagenPersona.add(this.jButtonVerFormTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagenPersona.gridy = 1;
			this.gridBagConstraintsTipoImagenPersona.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoImagenPersona.add(this.jButtonCerrarTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		
		
		
		this.jButtonRecargarInformacionTipoImagenPersona.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoImagenPersona.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoImagenPersona.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoImagenPersona.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoImagenPersona.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoImagenPersona.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoImagenPersona.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoImagenPersona.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoImagenPersona.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoImagenPersona.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoImagenPersona.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoImagenPersona.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoImagenPersona.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoImagenPersona.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoImagenPersona.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoImagenPersona.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoImagenPersona.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoImagenPersona.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoImagenPersona.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoImagenPersona.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoImagenPersona.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoImagenPersona.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoImagenPersona.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoImagenPersona.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoImagenPersona.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoImagenPersona.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoImagenPersona.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoImagenPersona.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoImagenPersona.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoImagenPersona.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoImagenPersona.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoImagenPersona.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoImagenPersona.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoImagenPersona.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoImagenPersona.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoImagenPersona.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoImagenPersona = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoImagenPersona = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoImagenPersona = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoImagenPersona = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoImagenPersona = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoImagenPersona = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoImagenPersona.setLayout(gridaBagParametrosReportesTipoImagenPersona);
			this.jPanelParametrosReportesAccionesTipoImagenPersona.setLayout(gridaBagParametrosReportesAccionesTipoImagenPersona);
			
			
			this.jPanelParametrosAuxiliar1TipoImagenPersona.setLayout(gridaBagParametrosAuxiliar1TipoImagenPersona);
			this.jPanelParametrosAuxiliar2TipoImagenPersona.setLayout(gridaBagParametrosAuxiliar2TipoImagenPersona);
			this.jPanelParametrosAuxiliar3TipoImagenPersona.setLayout(gridaBagParametrosAuxiliar3TipoImagenPersona);
			this.jPanelParametrosAuxiliar4TipoImagenPersona.setLayout(gridaBagParametrosAuxiliar4TipoImagenPersona);
			//this.jPanelParametrosAuxiliar5TipoImagenPersona.setLayout(gridaBagParametrosAuxiliar2TipoImagenPersona);			
			
			
			
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoImagenPersona.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoImagenPersona.add(this.jButtonRecargarInformacionTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagenPersona.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoImagenPersona.add(this.jComboBoxTiposPaginacionTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagenPersona.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoImagenPersona.add(this.jCheckBoxConAltoMaximoTablaTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagenPersona.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoImagenPersona.add(this.jComboBoxTiposArchivosReportesTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagenPersona.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoImagenPersona.add(this.jPanelParametrosAuxiliar1TipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagenPersona.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoImagenPersona.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoImagenPersona.add(this.jComboBoxTiposReportesTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagenPersona.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoImagenPersona.add(this.jPanelParametrosAuxiliar4TipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagenPersona.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoImagenPersona.add(this.jComboBoxTiposReportesTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagenPersona.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoImagenPersona.add(this.jCheckBoxGenerarReporteTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagenPersona.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoImagenPersona.add(this.jPanelParametrosAuxiliar2TipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoImagenPersona.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoImagenPersona.add(this.jLabelAccionesTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
				this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoImagenPersona.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoImagenPersona.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoImagenPersona.add(this.jButtonAbrirOrderByTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagenPersona.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoImagenPersona.add(this.jComboBoxTiposSeleccionarTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);			
			
			
			/*
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoImagenPersona.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoImagenPersona.add(this.jCheckBoxSeleccionarTodosTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagenPersona.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoImagenPersona.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoImagenPersona.add(this.jCheckBoxSeleccionarTodosTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);															
				
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagenPersona.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoImagenPersona.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoImagenPersona.add(this.jCheckBoxSeleccionadosTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagenPersona.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoImagenPersona.add(this.jPanelParametrosAuxiliar3TipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagenPersona.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoImagenPersona.add(this.jComboBoxTiposRelacionesTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
				
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoImagenPersona.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoImagenPersona.add(this.jComboBoxTiposAccionesTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoImagenPersona = new GridBagLayout();

			this.jScrollPanelDatosTipoImagenPersona.setLayout(gridaBagLayoutDatosTipoImagenPersona);
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagenPersona.gridy = 0;
			this.gridBagConstraintsTipoImagenPersona.gridx = 0;
			
			this.jScrollPanelDatosTipoImagenPersona.add(this.jTableDatosTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoImagenPersona.setViewportView(this.jTableDatosTipoImagenPersona);
		this.jTableDatosTipoImagenPersona.setFillsViewportHeight(true);
		this.jTableDatosTipoImagenPersona.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoImagenPersona= new GridBagLayout();
		this.jPanelAccionesTipoImagenPersona.setLayout(gridaBagLayoutAccionesTipoImagenPersona);
		
		
		/*	
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = 0;
		this.gridBagConstraintsTipoImagenPersona.gridx = 0;
			
		this.jPanelAccionesTipoImagenPersona.add(this.jButtonNuevoTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoImagenPersona = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoImagenPersona);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();						
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoImagenPersona.gridx = 0;		
			//this.gridBagConstraintsTipoImagenPersona.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoImagenPersona.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoImagenPersona.gridx = 0;		
		//this.gridBagConstraintsTipoImagenPersona.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoImagenPersona.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoImagenPersona);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagenPersona.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);								
		
		
		/*
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagenPersona.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		*/		
		
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoImagenPersona.gridx =0;
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoImagenPersona.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
				
		
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagenPersona.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoImagenPersonaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoImagenPersona= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoImagenPersona = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoImagenPersona.setLayout(gridaBagLayoutBusquedasParametrosTipoImagenPersona);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoImagenPersona=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoImagenPersona.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoImagenPersona.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoImagenPersona.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagenPersona.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
			
			
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagenPersona.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		
			
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagenPersona.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoImagenPersona;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoImagenPersona() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoImagenPersona = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoImagenPersona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoImagenPersona.setName("jPanelReporteDinamicoTipoImagenPersona"); 
		
		this.jPanelReporteDinamicoTipoImagenPersona.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoImagenPersona.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoImagenPersona.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoImagenPersona.setLayout(gridaBagLayoutReporteDinamicoTipoImagenPersona);
		
		
		this.jInternalFrameReporteDinamicoTipoImagenPersona= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoImagenPersona = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoImagenPersona= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoImagenPersona.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoImagenPersona.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoImagenPersona.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoImagenPersona.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoImagenPersona.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoImagenPersona.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoImagenPersona.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoImagenPersona.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoImagenPersona.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoImagenPersona.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoImagenPersona.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Imagen Personas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoImagenPersona = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoImagenPersona.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoImagenPersona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoImagenPersona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoImagenPersona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoImagenPersona.add(this.jLabelColumnasSelectReporteTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoImagenPersona = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoImagenPersona.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoImagenPersona.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoImagenPersona.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoImagenPersona.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoImagenPersona.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoImagenPersona=new JScrollPane(this.jListColumnasSelectReporteTipoImagenPersona);
			
			this.jScrollColumnasSelectReporteTipoImagenPersona.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoImagenPersona.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoImagenPersona.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoImagenPersona.add(this.jListColumnasSelectReporteTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		this.jPanelReporteDinamicoTipoImagenPersona.add(this.jScrollColumnasSelectReporteTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoImagenPersona = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoImagenPersona.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoImagenPersona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoImagenPersona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoImagenPersona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoImagenPersona = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoImagenPersona.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoImagenPersona.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoImagenPersona.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoImagenPersona.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoImagenPersona.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoImagenPersona=new JScrollPane(this.jListRelacionesSelectReporteTipoImagenPersona);
			
			this.jScrollRelacionesSelectReporteTipoImagenPersona.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoImagenPersona.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoImagenPersona.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoImagenPersona = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoImagenPersona = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoImagenPersona = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoImagenPersona = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoImagenPersona.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoImagenPersona.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoImagenPersona.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoImagenPersona.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoImagenPersona = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoImagenPersona.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoImagenPersona.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoImagenPersona.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoImagenPersona.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoImagenPersona = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoImagenPersona.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoImagenPersona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoImagenPersona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoImagenPersona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoImagenPersona.add(this.jLabelGenerarExcelReporteDinamicoTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoImagenPersona = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoImagenPersona.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoImagenPersona,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoImagenPersona.setToolTipText("Generar EXCEL"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		//this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoImagenPersona.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoImagenPersona.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoImagenPersona.add(this.jButtonGenerarExcelReporteDinamicoTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoImagenPersona.add(this.jComboBoxTiposReportesDinamicoTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoImagenPersona = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoImagenPersona.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoImagenPersona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoImagenPersona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoImagenPersona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoImagenPersona.add(this.jLabelTiposArchivoReporteDinamicoTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoImagenPersona.add(this.jComboBoxTiposArchivosReportesDinamicoTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoImagenPersona = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoImagenPersona.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoImagenPersona,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoImagenPersona.setToolTipText("Generar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoImagenPersona.add(this.jButtonGenerarReporteDinamicoTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoImagenPersona = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoImagenPersona.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoImagenPersona,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoImagenPersona.setToolTipText("Cancelar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoImagenPersona.add(this.jButtonCerrarReporteDinamicoTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoImagenPersona = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoImagenPersona= new JScrollPane(jPanelReporteDinamicoTipoImagenPersona,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoImagenPersona.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoImagenPersona.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoImagenPersona.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Imagen Personas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoImagenPersona.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoImagenPersona.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoImagenPersona.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoImagenPersona);
		this.jInternalFrameReporteDinamicoTipoImagenPersona.getContentPane().add(this.jScrollPanelReporteDinamicoTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoImagenPersona() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoImagenPersona = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoImagenPersona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoImagenPersona.setName("jPanelImportacionTipoImagenPersona"); 
		
		this.jPanelImportacionTipoImagenPersona.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoImagenPersona.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoImagenPersona.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoImagenPersona.setLayout(gridaBagLayoutImportacionTipoImagenPersona);
		
		
		this.jInternalFrameImportacionTipoImagenPersona= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoImagenPersona= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoImagenPersona = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoImagenPersona= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoImagenPersona.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoImagenPersona.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoImagenPersona.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoImagenPersona.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoImagenPersona.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoImagenPersona.setResizable(true);
	    this.jInternalFrameImportacionTipoImagenPersona.setClosable(true);
	    this.jInternalFrameImportacionTipoImagenPersona.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoImagenPersona.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoImagenPersona.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoImagenPersona.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoImagenPersona.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoImagenPersona.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoImagenPersona.setResizable(true);
	    this.jInternalFrameImportacionTipoImagenPersona.setClosable(true);
	    this.jInternalFrameImportacionTipoImagenPersona.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoImagenPersona.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoImagenPersona.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoImagenPersona.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Imagen Personas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoImagenPersona = new JLabelMe();

		this.jLabelArchivoImportacionTipoImagenPersona.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoImagenPersona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoImagenPersona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoImagenPersona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoImagenPersona.add(this.jLabelArchivoImportacionTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoImagenPersona = new JFileChooser();		
		this.jFileChooserImportacionTipoImagenPersona.setToolTipText("ESCOGER ARCHIVO"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoImagenPersona = new JButtonMe();
		this.jButtonAbrirImportacionTipoImagenPersona.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoImagenPersona,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoImagenPersona.setToolTipText("Generar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoImagenPersona.add(this.jButtonAbrirImportacionTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoImagenPersona = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoImagenPersona.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoImagenPersona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoImagenPersona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoImagenPersona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoImagenPersona.add(this.jLabelPathArchivoImportacionTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoImagenPersona=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoImagenPersona.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoImagenPersona.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoImagenPersona.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoImagenPersona.add(this.jTextFieldPathArchivoImportacionTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoImagenPersona = new JButtonMe();
		this.jButtonGenerarImportacionTipoImagenPersona.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoImagenPersona,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoImagenPersona.setToolTipText("Generar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoImagenPersona.add(this.jButtonGenerarImportacionTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoImagenPersona = new JButtonMe();
		this.jButtonCerrarImportacionTipoImagenPersona.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoImagenPersona,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoImagenPersona.setToolTipText("Cancelar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoImagenPersona.add(this.jButtonCerrarImportacionTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoImagenPersona = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoImagenPersona= new JScrollPane(jPanelImportacionTipoImagenPersona,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoImagenPersona.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoImagenPersona.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoImagenPersona.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoImagenPersona);
		this.jInternalFrameImportacionTipoImagenPersona.getContentPane().add(this.jScrollPanelImportacionTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoImagenPersona(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoImagenPersona = new JButtonMe();
			this.jButtonAbrirOrderByTipoImagenPersona.setText("Orden");
			this.jButtonAbrirOrderByTipoImagenPersona.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoImagenPersona,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoImagenPersona";
			inputMap = this.jButtonAbrirOrderByTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoImagenPersona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoImagenPersona"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoImagenPersona = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoImagenPersona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoImagenPersona.setName("jPanelOrderByTipoImagenPersona"); 
			
			this.jPanelOrderByTipoImagenPersona.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoImagenPersona.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoImagenPersona.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoImagenPersona.setLayout(gridaBagLayoutOrderByTipoImagenPersona);
			
			
			this.jTableDatosTipoImagenPersonaOrderBy = new JTableMe();        
			this.jTableDatosTipoImagenPersonaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoImagenPersonaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoImagenPersonaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoImagenPersonaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoImagenPersonaOrderBy.setViewportView(this.jTableDatosTipoImagenPersonaOrderBy);
			this.jTableDatosTipoImagenPersonaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoImagenPersonaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoImagenPersona= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoImagenPersona= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoImagenPersona = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoImagenPersona= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoImagenPersona.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoImagenPersona.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoImagenPersona.setTitle("Orden");
			this.jInternalFrameOrderByTipoImagenPersona.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoImagenPersona.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoImagenPersona.setResizable(true);
			this.jInternalFrameOrderByTipoImagenPersona.setClosable(true);
			this.jInternalFrameOrderByTipoImagenPersona.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoImagenPersona.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoImagenPersona.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoImagenPersona.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Imagen Personas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoImagenPersona.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoImagenPersona.ipady =150;
				
			this.jPanelOrderByTipoImagenPersona.add(jScrollPanelDatosTipoImagenPersonaOrderBy, this.gridBagConstraintsTipoImagenPersona);//this.jTableDatosTipoImagenPersonaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoImagenPersona = new JButtonMe();
			this.jButtonCerrarOrderByTipoImagenPersona.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoImagenPersona,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoImagenPersona.setToolTipText("Cancelar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagenPersona.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoImagenPersona.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoImagenPersona.add(this.jButtonCerrarOrderByTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoImagenPersona = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoImagenPersona= new JScrollPane(jPanelOrderByTipoImagenPersona,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoImagenPersona.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoImagenPersona.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoImagenPersona.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoImagenPersona);
			
			this.jInternalFrameOrderByTipoImagenPersona.getContentPane().add(this.jScrollPanelOrderByTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);			
		
		} else {
			this.jButtonAbrirOrderByTipoImagenPersona = new JButtonMe();
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
			&& this.tipoimagenpersonaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoImagenPersona.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoImagenPersona.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoImagenPersona.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoImagenPersona.getRowHeight();//TipoImagenPersonaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoImagenPersonaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoImagenPersona.isSelected()) {
					iHeightTable=TipoImagenPersonaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoImagenPersonaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoImagenPersonaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoImagenPersonaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoImagenPersona.isSelected()) {
					iHeightTable=TipoImagenPersonaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoImagenPersonaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoImagenPersonaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoImagenPersona.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoImagenPersona.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoImagenPersona.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoImagenPersona.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoImagenPersona.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoImagenPersona.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoImagenPersona!=null && this.jInternalFrameOrderByTipoImagenPersona.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoImagenPersona.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoImagenPersona.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoImagenPersona.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoImagenPersona.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoImagenPersona.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoImagenPersona.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoImagenPersona.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoImagenPersona.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoImagenPersona.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoImagenPersona.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoimagenpersonaLogic.getTipoImagenPersonas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoimagenpersonas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoImagenPersona> TraerTipoImagenPersonaBeans(List<TipoImagenPersona> tipoimagenpersonas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoImagenPersona tipoimagenpersona:tipoimagenpersonas) {
					
				if(!(TipoImagenPersonaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoImagenPersonaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoimagenpersona.setsDetalleGeneralEntityReporte(TipoImagenPersonaConstantesFunciones.getTipoImagenPersonaDescripcion(tipoimagenpersona));
										
						
					
						
					
				} else  {
							
					//tipoimagenpersona.setsDetalleGeneralEntityReporte(tipoimagenpersona.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoimagenpersonabeans.add(tipoimagenpersonabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoimagenpersonas;
    }
	//PARA REPORTES FIN
}
