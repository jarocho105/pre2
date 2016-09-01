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



import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;





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
import com.bydan.erp.puntoventa.util.TipoInteresTarjetaConstantesFunciones;

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
public class TipoInteresTarjetaJInternalFrame extends TipoInteresTarjetaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoInteresTarjeta;
	
	protected JMenuBar jmenuBarTipoInteresTarjeta;
	
	protected JMenu jmenuTipoInteresTarjeta;
	protected JMenu jmenuDatosTipoInteresTarjeta;
	protected JMenu jmenuArchivoTipoInteresTarjeta;
	protected JMenu jmenuAccionesTipoInteresTarjeta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoInteresTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoInteresTarjeta;	
	protected GridBagConstraints gridBagConstraintsTipoInteresTarjeta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoInteresTarjetaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoInteresTarjeta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoInteresTarjeta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoInteresTarjeta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoInteresTarjetaSessionBean tipointerestarjetaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoInteresTarjeta> tipointerestarjetas;		
	public List<TipoInteresTarjeta> tipointerestarjetasEliminados;	
	public List<TipoInteresTarjeta> tipointerestarjetasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoInteresTarjeta;		
	protected JButton jButtonAbrirOrderByTipoInteresTarjeta;
	
	
	//protected JPanel jPanelOrderByTipoInteresTarjeta;
	//public JScrollPane jScrollPanelOrderByTipoInteresTarjeta;	
	//protected JButton jButtonCerrarOrderByTipoInteresTarjeta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoInteresTarjetaLogic tipointerestarjetaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoInteresTarjeta;
	public JScrollPane jScrollPanelDatosEdicionTipoInteresTarjeta;
	public JScrollPane jScrollPanelDatosGeneralTipoInteresTarjeta;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoInteresTarjetaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoInteresTarjeta;
	//public JScrollPane jScrollPanelImportacionTipoInteresTarjeta;
	
	
	
	protected JPanel jPanelAccionesTipoInteresTarjeta;
	
    protected JPanel jPanelPaginacionTipoInteresTarjeta;
    protected JPanel jPanelParametrosReportesTipoInteresTarjeta;
	protected JPanel jPanelParametrosReportesAccionesTipoInteresTarjeta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoInteresTarjeta;
	protected JPanel jPanelParametrosAuxiliar2TipoInteresTarjeta;
	protected JPanel jPanelParametrosAuxiliar3TipoInteresTarjeta;
	protected JPanel jPanelParametrosAuxiliar4TipoInteresTarjeta;
	//protected JPanel jPanelParametrosAuxiliar5TipoInteresTarjeta;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoInteresTarjeta;
	//protected JPanel jPanelImportacionTipoInteresTarjeta;
	
	
	public JTable jTableDatosTipoInteresTarjeta;
	
	
	
	//public JTable jTableDatosTipoInteresTarjetaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoInteresTarjeta;
	protected JButton jButtonDuplicarTipoInteresTarjeta;
	protected JButton jButtonCopiarTipoInteresTarjeta;
	protected JButton jButtonVerFormTipoInteresTarjeta;
	protected JButton jButtonNuevoRelacionesTipoInteresTarjeta;
	protected JButton jButtonModificarTipoInteresTarjeta;
	
    protected JButton jButtonGuardarCambiosTablaTipoInteresTarjeta;
	protected JButton jButtonCerrarTipoInteresTarjeta;
	
	
	protected JButton jButtonRecargarInformacionTipoInteresTarjeta;
	protected JButton jButtonProcesarInformacionTipoInteresTarjeta;
	
	
	protected JButton jButtonAnterioresTipoInteresTarjeta;
	protected JButton jButtonSiguientesTipoInteresTarjeta;
	protected JButton jButtonNuevoGuardarCambiosTipoInteresTarjeta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoInteresTarjeta;
	//protected JButton jButtonCerrarReporteDinamicoTipoInteresTarjeta;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoInteresTarjeta;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoInteresTarjeta;
	//protected JButton jButtonGenerarImportacionTipoInteresTarjeta;
	//protected JButton jButtonCerrarImportacionTipoInteresTarjeta;
	//protected JFileChooser jFileChooserImportacionTipoInteresTarjeta;
	//protected File fileImportacionTipoInteresTarjeta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoInteresTarjeta;
	protected JButton jButtonDuplicarToolBarTipoInteresTarjeta;
	protected JButton jButtonNuevoRelacionesToolBarTipoInteresTarjeta;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoInteresTarjeta;
	protected JButton jButtonCopiarToolBarTipoInteresTarjeta;
	protected JButton jButtonVerFormToolBarTipoInteresTarjeta;
	public JButton jButtonGuardarCambiosTablaToolBarTipoInteresTarjeta;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoInteresTarjeta;
	protected JButton jButtonCerrarToolBarTipoInteresTarjeta;
	
	protected JButton jButtonRecargarInformacionToolBarTipoInteresTarjeta;
	protected JButton jButtonProcesarInformacionToolBarTipoInteresTarjeta;
	protected JButton jButtonAnterioresToolBarTipoInteresTarjeta;
	protected JButton jButtonSiguientesToolBarTipoInteresTarjeta;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoInteresTarjeta;
	protected JButton jButtonAbrirOrderByToolBarTipoInteresTarjeta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoInteresTarjeta;
	protected JMenuItem jMenuItemDuplicarTipoInteresTarjeta;
	protected JMenuItem jMenuItemNuevoRelacionesTipoInteresTarjeta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoInteresTarjeta;
	protected JMenuItem jMenuItemCopiarTipoInteresTarjeta;
	protected JMenuItem jMenuItemVerFormTipoInteresTarjeta;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoInteresTarjeta;
	protected JMenuItem jMenuItemCerrarTipoInteresTarjeta;
	protected JMenuItem jMenuItemDetalleCerrarTipoInteresTarjeta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoInteresTarjeta;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoInteresTarjeta;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoInteresTarjeta;
	protected JMenuItem jMenuItemProcesarInformacionTipoInteresTarjeta;
	protected JMenuItem jMenuItemAnterioresTipoInteresTarjeta;
	protected JMenuItem jMenuItemSiguientesTipoInteresTarjeta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoInteresTarjeta;
	protected JMenuItem jMenuItemAbrirOrderByTipoInteresTarjeta;
	protected JMenuItem jMenuItemMostrarOcultarTipoInteresTarjeta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoInteresTarjeta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoInteresTarjeta;
	protected JCheckBox jCheckBoxSeleccionadosTipoInteresTarjeta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoInteresTarjeta;
	protected JCheckBox jCheckBoxConGraficoReporteTipoInteresTarjeta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoInteresTarjeta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoInteresTarjeta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoInteresTarjeta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoInteresTarjeta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoInteresTarjeta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoInteresTarjeta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoInteresTarjeta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoInteresTarjeta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoInteresTarjeta;
	protected JTextField jTextFieldValorCampoGeneralTipoInteresTarjeta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoInteresTarjeta;
	//public JList<Reporte> jListColumnasSelectReporteTipoInteresTarjeta;
	//public JScrollPane jScrollColumnasSelectReporteTipoInteresTarjeta;
	
	//public JLabel jLabelRelacionesSelectReporteTipoInteresTarjeta;
	//public JList<Reporte> jListRelacionesSelectReporteTipoInteresTarjeta;
	//public JScrollPane jScrollRelacionesSelectReporteTipoInteresTarjeta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoInteresTarjeta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoInteresTarjeta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoInteresTarjeta;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoInteresTarjeta;
	
		
	//public JLabel jLabelArchivoImportacionTipoInteresTarjeta;	
	//public JLabel jLabelPathArchivoImportacionTipoInteresTarjeta;
	//protected JTextField jTextFieldPathArchivoImportacionTipoInteresTarjeta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoInteresTarjeta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoInteresTarjeta;
	
	//public JLabel jLabelColumnaCategoriaValorTipoInteresTarjeta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoInteresTarjeta;
	
	//public JLabel jLabelColumnasValoresGraficoTipoInteresTarjeta;
	//public JList<Reporte> jListColumnasValoresGraficoTipoInteresTarjeta;
	//public JScrollPane jScrollColumnasValoresGraficoTipoInteresTarjeta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoInteresTarjeta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoInteresTarjeta;	
	
	
	
	
	
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
	public TipoInteresTarjetaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoInteresTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInteresTarjetaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInteresTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInteresTarjetaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInteresTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInteresTarjetaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoInteresTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoInteresTarjeta)	{
		this.jButtonRecargarInformacionTipoInteresTarjeta = jButtonRecargarInformacionTipoInteresTarjeta;
	}
	
	public JButton getjButtonProcesarInformacionTipoInteresTarjeta() {
		return this.jButtonProcesarInformacionTipoInteresTarjeta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoInteresTarjeta)	{
		this.jButtonProcesarInformacionTipoInteresTarjeta = jButtonProcesarInformacionTipoInteresTarjeta;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoInteresTarjeta() {
		return this.jButtonRecargarInformacionTipoInteresTarjeta;
	}
	
	
	public List<TipoInteresTarjeta> gettipointerestarjetas() {
		return this.tipointerestarjetas;
	}

	public void settipointerestarjetas(List<TipoInteresTarjeta> tipointerestarjetas) {
		this.tipointerestarjetas = tipointerestarjetas;
	}
	
	public List<TipoInteresTarjeta> gettipointerestarjetasAux() {
		return this.tipointerestarjetasAux;
	}

	public void settipointerestarjetasAux(List<TipoInteresTarjeta> tipointerestarjetasAux) {
		this.tipointerestarjetasAux = tipointerestarjetasAux;
	}
	
	public List<TipoInteresTarjeta> gettipointerestarjetasEliminados() {
		return this.tipointerestarjetasEliminados;
	}

	public void setTipoInteresTarjetasEliminados(List<TipoInteresTarjeta> tipointerestarjetasEliminados) {
		this.tipointerestarjetasEliminados = tipointerestarjetasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoInteresTarjeta() {
		return jComboBoxTiposSeleccionarTipoInteresTarjeta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoInteresTarjeta(
			JComboBox jComboBoxTiposSeleccionarTipoInteresTarjeta) {
		this.jComboBoxTiposSeleccionarTipoInteresTarjeta = jComboBoxTiposSeleccionarTipoInteresTarjeta;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoInteresTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoInteresTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoInteresTarjeta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoInteresTarjeta() {
		return jTextFieldValorCampoGeneralTipoInteresTarjeta;
	}

	public void setjTextFieldValorCampoGeneralTipoInteresTarjeta(
			JTextField jTextFieldValorCampoGeneralTipoInteresTarjeta) {
		this.jTextFieldValorCampoGeneralTipoInteresTarjeta = jTextFieldValorCampoGeneralTipoInteresTarjeta;
	}

	public void setBorderResaltarValorCampoGeneralTipoInteresTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInteresTarjeta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoInteresTarjeta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoInteresTarjeta() {
		return this.jCheckBoxSeleccionarTodosTipoInteresTarjeta;
	}

	public void setjCheckBoxSeleccionarTodosTipoInteresTarjeta(
			JCheckBox jCheckBoxSeleccionarTodosTipoInteresTarjeta) {
		this.jCheckBoxSeleccionarTodosTipoInteresTarjeta = jCheckBoxSeleccionarTodosTipoInteresTarjeta;
	}

	public void setBorderResaltarSeleccionarTodosTipoInteresTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInteresTarjeta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoInteresTarjeta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoInteresTarjeta() {
		return this.jCheckBoxSeleccionadosTipoInteresTarjeta;
	}

	public void setjCheckBoxSeleccionadosTipoInteresTarjeta(
			JCheckBox jCheckBoxSeleccionadosTipoInteresTarjeta) {
		this.jCheckBoxSeleccionadosTipoInteresTarjeta = jCheckBoxSeleccionadosTipoInteresTarjeta;
	}
	
	public void setBorderResaltarSeleccionadosTipoInteresTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInteresTarjeta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoInteresTarjeta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoInteresTarjeta() {
		return this.jComboBoxTiposArchivosReportesTipoInteresTarjeta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoInteresTarjeta(
			JComboBox jComboBoxTiposArchivosReportesTipoInteresTarjeta) {
		this.jComboBoxTiposArchivosReportesTipoInteresTarjeta = jComboBoxTiposArchivosReportesTipoInteresTarjeta;
	}

	public void setBorderResaltarTiposArchivosReportesTipoInteresTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInteresTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoInteresTarjeta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoInteresTarjeta() {
		return this.jComboBoxTiposReportesTipoInteresTarjeta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoInteresTarjeta(
			JComboBox jComboBoxTiposReportesTipoInteresTarjeta) {
		this.jComboBoxTiposReportesTipoInteresTarjeta = jComboBoxTiposReportesTipoInteresTarjeta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoInteresTarjeta() {
	//	return jComboBoxTiposReportesDinamicoTipoInteresTarjeta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoInteresTarjeta(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoInteresTarjeta) {
	//	this.jComboBoxTiposReportesDinamicoTipoInteresTarjeta = jComboBoxTiposReportesDinamicoTipoInteresTarjeta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoInteresTarjeta() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoInteresTarjeta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoInteresTarjeta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoInteresTarjeta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoInteresTarjeta = jComboBoxTiposArchivosReportesDinamicoTipoInteresTarjeta;
	//}
	
	public void setBorderResaltarTiposReportesTipoInteresTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInteresTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoInteresTarjeta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoInteresTarjeta() {
		return this.jComboBoxTiposGraficosReportesTipoInteresTarjeta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoInteresTarjeta(
			JComboBox jComboBoxTiposGraficosReportesTipoInteresTarjeta) {
		this.jComboBoxTiposGraficosReportesTipoInteresTarjeta = jComboBoxTiposGraficosReportesTipoInteresTarjeta;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoInteresTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInteresTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoInteresTarjeta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoInteresTarjeta() {
		return this.jComboBoxTiposPaginacionTipoInteresTarjeta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoInteresTarjeta(
			JComboBox jComboBoxTiposPaginacionTipoInteresTarjeta) {
		this.jComboBoxTiposPaginacionTipoInteresTarjeta = jComboBoxTiposPaginacionTipoInteresTarjeta;
	}
	
	public void setBorderResaltarTiposPaginacionTipoInteresTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInteresTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoInteresTarjeta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoInteresTarjeta() {
		return this.jComboBoxTiposRelacionesTipoInteresTarjeta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoInteresTarjeta() {
		return this.jComboBoxTiposAccionesTipoInteresTarjeta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoInteresTarjeta(
			JComboBox jComboBoxTiposRelacionesTipoInteresTarjeta) {
		this.jComboBoxTiposRelacionesTipoInteresTarjeta = jComboBoxTiposRelacionesTipoInteresTarjeta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoInteresTarjeta(
			JComboBox jComboBoxTiposAccionesTipoInteresTarjeta) {
		this.jComboBoxTiposAccionesTipoInteresTarjeta = jComboBoxTiposAccionesTipoInteresTarjeta;
	}
	
	public void setBorderResaltarTiposRelacionesTipoInteresTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInteresTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoInteresTarjeta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoInteresTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoInteresTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoInteresTarjeta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoInteresTarjeta() {
	//	return jCheckBoxConGraficoDinamicoTipoInteresTarjeta;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoInteresTarjeta(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoInteresTarjeta) {
	//	this.jCheckBoxConGraficoDinamicoTipoInteresTarjeta = jCheckBoxConGraficoDinamicoTipoInteresTarjeta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoInteresTarjeta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoInteresTarjeta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoInteresTarjeta .setBorder(borderResaltar);		
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
		this.tipointerestarjetaSessionBean=new TipoInteresTarjetaSessionBean();
		
		this.tipointerestarjetaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipointerestarjetaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipointerestarjetaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoInteresTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoInteresTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoInteresTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoInteresTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoInteresTarjetaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Interes Tarjeta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoInteresTarjetaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoInteresTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoInteresTarjeta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoInteresTarjeta,this.jTtoolBarTipoInteresTarjeta,
							"nuevo","nuevo","Nuevo"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoInteresTarjeta,this.jTtoolBarTipoInteresTarjeta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoInteresTarjeta,this.jTtoolBarTipoInteresTarjeta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoInteresTarjeta,this.jTtoolBarTipoInteresTarjeta,
							"duplicar","duplicar","Duplicar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoInteresTarjeta,this.jTtoolBarTipoInteresTarjeta,
							"copiar","copiar","Copiar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoInteresTarjeta,this.jTtoolBarTipoInteresTarjeta,
							"ver_form","ver_form","Ver"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoInteresTarjeta,this.jTtoolBarTipoInteresTarjeta,
							"recargar","recargar","Recargar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoInteresTarjeta,this.jTtoolBarTipoInteresTarjeta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoInteresTarjeta,this.jTtoolBarTipoInteresTarjeta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoInteresTarjeta,this.jTtoolBarTipoInteresTarjeta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoInteresTarjeta,this.jTtoolBarTipoInteresTarjeta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoInteresTarjeta,this.jTtoolBarTipoInteresTarjeta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoInteresTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoInteresTarjeta,this.jTtoolBarTipoInteresTarjeta,
							"cerrar","cerrar","Salir"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoInteresTarjeta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoInteresTarjeta;
			
				this.jButtonProcesarInformacionToolBarTipoInteresTarjeta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoInteresTarjeta;
				
		//protected JButton jButtonModificarToolBarTipoInteresTarjeta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoInteresTarjeta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoInteresTarjeta=new JMenuMe("General");
		this.jmenuArchivoTipoInteresTarjeta=new JMenuMe("Archivo");
		this.jmenuAccionesTipoInteresTarjeta=new JMenuMe("Acciones");
		this.jmenuDatosTipoInteresTarjeta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoInteresTarjeta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoInteresTarjeta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoInteresTarjeta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoInteresTarjeta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoInteresTarjeta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoInteresTarjeta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoInteresTarjeta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoInteresTarjeta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoInteresTarjeta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoInteresTarjeta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoInteresTarjeta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoInteresTarjeta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoInteresTarjeta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoInteresTarjeta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoInteresTarjeta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoInteresTarjeta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoInteresTarjeta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoInteresTarjeta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoInteresTarjeta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoInteresTarjeta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoInteresTarjeta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoInteresTarjeta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoInteresTarjeta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoInteresTarjeta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoInteresTarjeta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoInteresTarjeta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoInteresTarjeta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoInteresTarjeta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoInteresTarjeta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoInteresTarjeta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoInteresTarjeta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoInteresTarjeta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoInteresTarjeta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoInteresTarjeta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoInteresTarjeta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoInteresTarjeta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoInteresTarjeta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoInteresTarjeta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoInteresTarjeta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoInteresTarjeta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoInteresTarjeta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoInteresTarjeta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoInteresTarjeta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoInteresTarjeta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoInteresTarjeta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoInteresTarjeta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoInteresTarjeta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoInteresTarjeta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoInteresTarjeta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoInteresTarjeta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoInteresTarjeta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoInteresTarjeta.add(this.jMenuItemCerrarTipoInteresTarjeta);
			
			this.jmenuAccionesTipoInteresTarjeta.add(this.jMenuItemNuevoTipoInteresTarjeta);
			this.jmenuAccionesTipoInteresTarjeta.add(this.jMenuItemNuevoGuardarCambiosTipoInteresTarjeta);
			this.jmenuAccionesTipoInteresTarjeta.add(this.jMenuItemNuevoRelacionesTipoInteresTarjeta);
			this.jmenuAccionesTipoInteresTarjeta.add(this.jMenuItemGuardarCambiosTablaTipoInteresTarjeta);		
			this.jmenuAccionesTipoInteresTarjeta.add(this.jMenuItemDuplicarTipoInteresTarjeta);		
			this.jmenuAccionesTipoInteresTarjeta.add(this.jMenuItemCopiarTipoInteresTarjeta);		
			this.jmenuAccionesTipoInteresTarjeta.add(this.jMenuItemVerFormTipoInteresTarjeta);		
			
			this.jmenuDatosTipoInteresTarjeta.add(this.jMenuItemRecargarInformacionTipoInteresTarjeta);				
			this.jmenuDatosTipoInteresTarjeta.add(this.jMenuItemAnterioresTipoInteresTarjeta);				
			this.jmenuDatosTipoInteresTarjeta.add(this.jMenuItemSiguientesTipoInteresTarjeta);				
			this.jmenuDatosTipoInteresTarjeta.add(this.jMenuItemAbrirOrderByTipoInteresTarjeta);				
			this.jmenuDatosTipoInteresTarjeta.add(this.jMenuItemMostrarOcultarTipoInteresTarjeta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoInteresTarjeta.add(this.jMenuItemGuardarCambiosTipoInteresTarjeta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoInteresTarjeta.add(this.jmenuArchivoTipoInteresTarjeta);		
			this.jmenuBarTipoInteresTarjeta.add(this.jmenuAccionesTipoInteresTarjeta);		
			this.jmenuBarTipoInteresTarjeta.add(this.jmenuDatosTipoInteresTarjeta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoInteresTarjeta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoInteresTarjeta() {
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
			//this.jInternalFrameDetalleTipoInteresTarjeta = new TipoInteresTarjetaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Interes Tarjeta DATOS");
			this.jInternalFrameDetalleFormTipoInteresTarjeta = new TipoInteresTarjetaDetalleFormJInternalFrame(jDesktopPane,this.tipointerestarjetaSessionBean.getConGuardarRelaciones(),this.tipointerestarjetaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoInteresTarjeta = null;//new TipoInteresTarjetaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoInteresTarjeta= new GridBagLayout();
		
		
		this.jTableDatosTipoInteresTarjeta = new JTableMe();      
		
		String sToolTipTipoInteresTarjeta="";
		sToolTipTipoInteresTarjeta=TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoInteresTarjeta+="(PuntoVenta.TipoInteresTarjeta)";
		}
		
		if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoInteresTarjeta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoInteresTarjeta.setToolTipText(sToolTipTipoInteresTarjeta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoInteresTarjeta);
		this.jTableDatosTipoInteresTarjeta.setAutoCreateRowSorter(true);
		this.jTableDatosTipoInteresTarjeta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoInteresTarjeta.setRowSelectionAllowed(true);
		this.jTableDatosTipoInteresTarjeta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoInteresTarjeta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoInteresTarjeta = new JButtonMe();
		this.jButtonDuplicarTipoInteresTarjeta = new JButtonMe();
		this.jButtonCopiarTipoInteresTarjeta = new JButtonMe();
		this.jButtonVerFormTipoInteresTarjeta = new JButtonMe();
		this.jButtonNuevoRelacionesTipoInteresTarjeta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoInteresTarjeta = new JButtonMe();
		this.jButtonCerrarTipoInteresTarjeta = new JButtonMe();
		
		this.jScrollPanelDatosTipoInteresTarjeta = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoInteresTarjeta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoInteresTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Interes Tarjeta";
		
		if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Interes Tarjetas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoInteresTarjeta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoInteresTarjeta.setToolTipText("Acciones");
        this.jPanelAccionesTipoInteresTarjeta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoInteresTarjeta=new ReporteDinamicoJInternalFrame(TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoInteresTarjeta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoInteresTarjeta=new ImportacionJInternalFrame(TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoInteresTarjeta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoInteresTarjeta = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoInteresTarjeta.setText("Orden");
		this.jButtonAbrirOrderByTipoInteresTarjeta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoInteresTarjeta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoInteresTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoInteresTarjeta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInteresTarjeta,false,this);
			
			//this.cargarOrderByTipoInteresTarjeta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoInteresTarjeta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInteresTarjeta,true,this);
			
			//this.cargarOrderByTipoInteresTarjeta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoInteresTarjeta.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoInteresTarjeta.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoInteresTarjeta.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoInteresTarjeta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoInteresTarjeta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoInteresTarjeta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoInteresTarjeta.setText("Nuevo");
		this.jButtonDuplicarTipoInteresTarjeta.setText("Duplicar");
		this.jButtonCopiarTipoInteresTarjeta.setText("Copiar");
		this.jButtonVerFormTipoInteresTarjeta.setText("Ver");
		this.jButtonNuevoRelacionesTipoInteresTarjeta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoInteresTarjeta.setText("Guardar");
		this.jButtonCerrarTipoInteresTarjeta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoInteresTarjeta,"nuevo_button","Nuevo",this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoInteresTarjeta,"duplicar_button","Duplicar",this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoInteresTarjeta,"copiar_button","Copiar",this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoInteresTarjeta,"ver_form","Ver",this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoInteresTarjeta,"nuevorelaciones_button","Nuevo Rel",this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoInteresTarjeta,"guardarcambiostabla_button","Guardar",this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoInteresTarjeta,"cerrar_button","Salir",this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoInteresTarjeta.setToolTipText("Nuevo"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoInteresTarjeta.setToolTipText("Duplicar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoInteresTarjeta.setToolTipText("Copiar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoInteresTarjeta.setToolTipText("Ver"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoInteresTarjeta.setToolTipText("Nuevo Rel"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoInteresTarjeta.setToolTipText("Guardar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoInteresTarjeta.setToolTipText("Salir"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoInteresTarjeta";
		inputMap = this.jButtonNuevoTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoInteresTarjeta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoInteresTarjeta"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoInteresTarjeta";
		inputMap = this.jButtonDuplicarTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoInteresTarjeta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoInteresTarjeta"));
		
		//COPIAR
		sMapKey = "CopiarTipoInteresTarjeta";
		inputMap = this.jButtonCopiarTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoInteresTarjeta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoInteresTarjeta"));
		
		//VEr FORM
		sMapKey = "VerFormTipoInteresTarjeta";
		inputMap = this.jButtonVerFormTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoInteresTarjeta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoInteresTarjeta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoInteresTarjeta";
		inputMap = this.jButtonNuevoRelacionesTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoInteresTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoInteresTarjeta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoInteresTarjeta";
		inputMap = this.jButtonModificarTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoInteresTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoInteresTarjeta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoInteresTarjeta";
		inputMap = this.jButtonCerrarTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoInteresTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoInteresTarjeta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoInteresTarjeta";
		inputMap = this.jButtonGuardarCambiosTablaTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoInteresTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoInteresTarjeta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoInteresTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoInteresTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoInteresTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoInteresTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoInteresTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoInteresTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoInteresTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoInteresTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoInteresTarjeta.setName("jPanelParametrosReportesTipoInteresTarjeta"); 
		
		this.jPanelParametrosReportesAccionesTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoInteresTarjeta.setName("jPanelParametrosReportesAccionesTipoInteresTarjeta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoInteresTarjeta = new JButtonMe();
		this.jButtonRecargarInformacionTipoInteresTarjeta.setText("Recargar");
		this.jButtonRecargarInformacionTipoInteresTarjeta.setToolTipText("Recargar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoInteresTarjeta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoInteresTarjeta = new JButtonMe();
		this.jButtonProcesarInformacionTipoInteresTarjeta.setText("Procesar");
		this.jButtonProcesarInformacionTipoInteresTarjeta.setToolTipText("Procesar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoInteresTarjeta.setVisible(false);
			
		this.jButtonProcesarInformacionTipoInteresTarjeta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoInteresTarjeta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoInteresTarjeta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoInteresTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoInteresTarjeta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoInteresTarjeta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoInteresTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoInteresTarjeta.setText("TIPO");       
		this.jComboBoxTiposReportesTipoInteresTarjeta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoInteresTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoInteresTarjeta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoInteresTarjeta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoInteresTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoInteresTarjeta.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoInteresTarjeta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoInteresTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoInteresTarjeta.setText("Accion");
		this.jComboBoxTiposRelacionesTipoInteresTarjeta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoInteresTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoInteresTarjeta.setText("Accion");
		this.jComboBoxTiposAccionesTipoInteresTarjeta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoInteresTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoInteresTarjeta.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoInteresTarjeta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoInteresTarjeta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoInteresTarjeta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoInteresTarjeta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoInteresTarjeta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoInteresTarjeta = new JLabelMe();
		
		this.jLabelAccionesTipoInteresTarjeta.setText("Acciones");		
		this.jLabelAccionesTipoInteresTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInteresTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInteresTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoInteresTarjeta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoInteresTarjeta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoInteresTarjeta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoInteresTarjeta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoInteresTarjeta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoInteresTarjeta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoInteresTarjeta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoInteresTarjeta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoInteresTarjeta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoInteresTarjeta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoInteresTarjeta.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoInteresTarjeta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoInteresTarjeta = new JButtonMe();
		//this.jButtonAnterioresTipoInteresTarjeta.setText("<<");
        this.jButtonAnterioresTipoInteresTarjeta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoInteresTarjeta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoInteresTarjeta = new JButtonMe();
		//this.jButtonSiguientesTipoInteresTarjeta.setText(">>");
        this.jButtonSiguientesTipoInteresTarjeta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoInteresTarjeta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoInteresTarjeta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoInteresTarjeta.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoInteresTarjeta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoInteresTarjeta,"nuevoguardarcambios_button","Nue",this.tipointerestarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoInteresTarjeta";
		inputMap = this.jButtonNuevoGuardarCambiosTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoInteresTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoInteresTarjeta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoInteresTarjeta";
		inputMap = this.jButtonRecargarInformacionTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoInteresTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoInteresTarjeta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoInteresTarjeta";
		inputMap = this.jButtonSiguientesTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoInteresTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoInteresTarjeta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoInteresTarjeta";
		inputMap = this.jButtonAnterioresTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoInteresTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoInteresTarjeta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoInteresTarjeta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoInteresTarjeta.setMinimumSize(new Dimension(this.getWidth(),TipoInteresTarjetaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoInteresTarjetaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoInteresTarjeta.setMaximumSize(new Dimension(this.getWidth(),TipoInteresTarjetaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoInteresTarjetaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoInteresTarjeta.setPreferredSize(new Dimension(this.getWidth(),TipoInteresTarjetaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoInteresTarjetaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoInteresTarjeta = new GridBagLayout();

			this.jPanelPaginacionTipoInteresTarjeta.setLayout(gridaBagLayoutPaginacionTipoInteresTarjeta);						
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoInteresTarjeta.add(this.jButtonAnterioresTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
					
						
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;
			
			this.jPanelPaginacionTipoInteresTarjeta.add(this.jButtonNuevoGuardarCambiosTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
						
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;
			this.jPanelPaginacionTipoInteresTarjeta.add(this.jButtonSiguientesTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = 1;
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInteresTarjeta.add(this.jButtonNuevoTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
				this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoInteresTarjeta.gridy = 1;
				this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoInteresTarjeta.add(this.jButtonNuevoRelacionesTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
			}
			
			
			if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
				this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoInteresTarjeta.gridy = 1;
				this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoInteresTarjeta.add(this.jButtonGuardarCambiosTablaTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
			}
			
			
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = 1;
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInteresTarjeta.add(this.jButtonDuplicarTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = 1;
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInteresTarjeta.add(this.jButtonCopiarTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = 1;
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoInteresTarjeta.add(this.jButtonVerFormTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = 1;
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoInteresTarjeta.add(this.jButtonCerrarTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		
		
		
		this.jButtonRecargarInformacionTipoInteresTarjeta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoInteresTarjeta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoInteresTarjeta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoInteresTarjeta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoInteresTarjeta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoInteresTarjeta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoInteresTarjeta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoInteresTarjeta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoInteresTarjeta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoInteresTarjeta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoInteresTarjeta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoInteresTarjeta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoInteresTarjeta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoInteresTarjeta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoInteresTarjeta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoInteresTarjeta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoInteresTarjeta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoInteresTarjeta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoInteresTarjeta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInteresTarjeta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInteresTarjeta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoInteresTarjeta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoInteresTarjeta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoInteresTarjeta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoInteresTarjeta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoInteresTarjeta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoInteresTarjeta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoInteresTarjeta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoInteresTarjeta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoInteresTarjeta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoInteresTarjeta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoInteresTarjeta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoInteresTarjeta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoInteresTarjeta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoInteresTarjeta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoInteresTarjeta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoInteresTarjeta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoInteresTarjeta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoInteresTarjeta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoInteresTarjeta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoInteresTarjeta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoInteresTarjeta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoInteresTarjeta.setLayout(gridaBagParametrosReportesTipoInteresTarjeta);
			this.jPanelParametrosReportesAccionesTipoInteresTarjeta.setLayout(gridaBagParametrosReportesAccionesTipoInteresTarjeta);
			
			
			this.jPanelParametrosAuxiliar1TipoInteresTarjeta.setLayout(gridaBagParametrosAuxiliar1TipoInteresTarjeta);
			this.jPanelParametrosAuxiliar2TipoInteresTarjeta.setLayout(gridaBagParametrosAuxiliar2TipoInteresTarjeta);
			this.jPanelParametrosAuxiliar3TipoInteresTarjeta.setLayout(gridaBagParametrosAuxiliar3TipoInteresTarjeta);
			this.jPanelParametrosAuxiliar4TipoInteresTarjeta.setLayout(gridaBagParametrosAuxiliar4TipoInteresTarjeta);
			//this.jPanelParametrosAuxiliar5TipoInteresTarjeta.setLayout(gridaBagParametrosAuxiliar2TipoInteresTarjeta);			
			
			
			
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInteresTarjeta.add(this.jButtonRecargarInformacionTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoInteresTarjeta.add(this.jComboBoxTiposPaginacionTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoInteresTarjeta.add(this.jCheckBoxConAltoMaximoTablaTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoInteresTarjeta.add(this.jComboBoxTiposArchivosReportesTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInteresTarjeta.add(this.jPanelParametrosAuxiliar1TipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInteresTarjeta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoInteresTarjeta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoInteresTarjeta.add(this.jComboBoxTiposReportesTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInteresTarjeta.add(this.jPanelParametrosAuxiliar4TipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInteresTarjeta.add(this.jComboBoxTiposReportesTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoInteresTarjeta.add(this.jCheckBoxGenerarReporteTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInteresTarjeta.add(this.jPanelParametrosAuxiliar2TipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoInteresTarjeta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoInteresTarjeta.add(this.jLabelAccionesTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
				this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoInteresTarjeta.add(this.jButtonAbrirOrderByTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInteresTarjeta.add(this.jComboBoxTiposSeleccionarTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);			
			
			
			/*
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoInteresTarjeta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoInteresTarjeta.add(this.jCheckBoxSeleccionarTodosTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInteresTarjeta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoInteresTarjeta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoInteresTarjeta.add(this.jCheckBoxSeleccionarTodosTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);															
				
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInteresTarjeta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoInteresTarjeta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoInteresTarjeta.add(this.jCheckBoxSeleccionadosTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoInteresTarjeta.add(this.jPanelParametrosAuxiliar3TipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInteresTarjeta.add(this.jComboBoxTiposRelacionesTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
				
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoInteresTarjeta.add(this.jComboBoxTiposAccionesTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoInteresTarjeta = new GridBagLayout();

			this.jScrollPanelDatosTipoInteresTarjeta.setLayout(gridaBagLayoutDatosTipoInteresTarjeta);
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;
			this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
			
			this.jScrollPanelDatosTipoInteresTarjeta.add(this.jTableDatosTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoInteresTarjeta.setViewportView(this.jTableDatosTipoInteresTarjeta);
		this.jTableDatosTipoInteresTarjeta.setFillsViewportHeight(true);
		this.jTableDatosTipoInteresTarjeta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoInteresTarjeta= new GridBagLayout();
		this.jPanelAccionesTipoInteresTarjeta.setLayout(gridaBagLayoutAccionesTipoInteresTarjeta);
		
		
		/*	
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = 0;
		this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
			
		this.jPanelAccionesTipoInteresTarjeta.add(this.jButtonNuevoTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoInteresTarjeta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoInteresTarjeta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();						
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;		
			//this.gridBagConstraintsTipoInteresTarjeta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoInteresTarjeta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;		
		//this.gridBagConstraintsTipoInteresTarjeta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInteresTarjeta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoInteresTarjeta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoInteresTarjeta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);								
		
		
		/*
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		*/		
		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoInteresTarjeta.gridx =0;
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoInteresTarjeta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
				
		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoInteresTarjetaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoInteresTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoInteresTarjeta = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoInteresTarjeta.setLayout(gridaBagLayoutBusquedasParametrosTipoInteresTarjeta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoInteresTarjeta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoInteresTarjeta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInteresTarjeta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInteresTarjeta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
			
			
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		
			
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoInteresTarjeta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoInteresTarjeta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoInteresTarjeta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoInteresTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoInteresTarjeta.setName("jPanelReporteDinamicoTipoInteresTarjeta"); 
		
		this.jPanelReporteDinamicoTipoInteresTarjeta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoInteresTarjeta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoInteresTarjeta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoInteresTarjeta.setLayout(gridaBagLayoutReporteDinamicoTipoInteresTarjeta);
		
		
		this.jInternalFrameReporteDinamicoTipoInteresTarjeta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoInteresTarjeta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoInteresTarjeta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoInteresTarjeta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoInteresTarjeta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoInteresTarjeta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Interes Tarjetas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoInteresTarjeta = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoInteresTarjeta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoInteresTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoInteresTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoInteresTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoInteresTarjeta.add(this.jLabelColumnasSelectReporteTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoInteresTarjeta = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoInteresTarjeta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoInteresTarjeta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoInteresTarjeta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoInteresTarjeta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoInteresTarjeta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoInteresTarjeta=new JScrollPane(this.jListColumnasSelectReporteTipoInteresTarjeta);
			
			this.jScrollColumnasSelectReporteTipoInteresTarjeta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoInteresTarjeta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoInteresTarjeta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoInteresTarjeta.add(this.jListColumnasSelectReporteTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		this.jPanelReporteDinamicoTipoInteresTarjeta.add(this.jScrollColumnasSelectReporteTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoInteresTarjeta = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoInteresTarjeta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoInteresTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoInteresTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoInteresTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoInteresTarjeta.add(this.jLabelRelacionesSelectReporteTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoInteresTarjeta = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoInteresTarjeta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoInteresTarjeta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoInteresTarjeta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoInteresTarjeta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoInteresTarjeta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoInteresTarjeta=new JScrollPane(this.jListRelacionesSelectReporteTipoInteresTarjeta);
			
			this.jScrollRelacionesSelectReporteTipoInteresTarjeta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoInteresTarjeta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoInteresTarjeta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoInteresTarjeta.add(this.jListRelacionesSelectReporteTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		this.jPanelReporteDinamicoTipoInteresTarjeta.add(this.jScrollRelacionesSelectReporteTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoInteresTarjeta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoInteresTarjeta = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoInteresTarjeta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoInteresTarjeta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoInteresTarjeta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoInteresTarjeta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoInteresTarjeta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoInteresTarjeta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoInteresTarjeta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoInteresTarjeta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoInteresTarjeta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoInteresTarjeta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoInteresTarjeta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoInteresTarjeta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoInteresTarjeta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoInteresTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoInteresTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoInteresTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoInteresTarjeta.add(this.jLabelGenerarExcelReporteDinamicoTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoInteresTarjeta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoInteresTarjeta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoInteresTarjeta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoInteresTarjeta.setToolTipText("Generar EXCEL"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoInteresTarjeta.add(this.jButtonGenerarExcelReporteDinamicoTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInteresTarjeta.add(this.jComboBoxTiposReportesDinamicoTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoInteresTarjeta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoInteresTarjeta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoInteresTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoInteresTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoInteresTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoInteresTarjeta.add(this.jLabelTiposArchivoReporteDinamicoTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInteresTarjeta.add(this.jComboBoxTiposArchivosReportesDinamicoTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoInteresTarjeta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoInteresTarjeta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoInteresTarjeta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoInteresTarjeta.setToolTipText("Generar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInteresTarjeta.add(this.jButtonGenerarReporteDinamicoTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoInteresTarjeta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoInteresTarjeta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoInteresTarjeta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoInteresTarjeta.setToolTipText("Cancelar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoInteresTarjeta.add(this.jButtonCerrarReporteDinamicoTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoInteresTarjeta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoInteresTarjeta= new JScrollPane(jPanelReporteDinamicoTipoInteresTarjeta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoInteresTarjeta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoInteresTarjeta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoInteresTarjeta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Interes Tarjetas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoInteresTarjeta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoInteresTarjeta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoInteresTarjeta);
		this.jInternalFrameReporteDinamicoTipoInteresTarjeta.getContentPane().add(this.jScrollPanelReporteDinamicoTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoInteresTarjeta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoInteresTarjeta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoInteresTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoInteresTarjeta.setName("jPanelImportacionTipoInteresTarjeta"); 
		
		this.jPanelImportacionTipoInteresTarjeta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoInteresTarjeta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoInteresTarjeta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoInteresTarjeta.setLayout(gridaBagLayoutImportacionTipoInteresTarjeta);
		
		
		this.jInternalFrameImportacionTipoInteresTarjeta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoInteresTarjeta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoInteresTarjeta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoInteresTarjeta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoInteresTarjeta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoInteresTarjeta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoInteresTarjeta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoInteresTarjeta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoInteresTarjeta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoInteresTarjeta.setResizable(true);
	    this.jInternalFrameImportacionTipoInteresTarjeta.setClosable(true);
	    this.jInternalFrameImportacionTipoInteresTarjeta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoInteresTarjeta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoInteresTarjeta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoInteresTarjeta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoInteresTarjeta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoInteresTarjeta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoInteresTarjeta.setResizable(true);
	    this.jInternalFrameImportacionTipoInteresTarjeta.setClosable(true);
	    this.jInternalFrameImportacionTipoInteresTarjeta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoInteresTarjeta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoInteresTarjeta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoInteresTarjeta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Interes Tarjetas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoInteresTarjeta = new JLabelMe();

		this.jLabelArchivoImportacionTipoInteresTarjeta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoInteresTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoInteresTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoInteresTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoInteresTarjeta.add(this.jLabelArchivoImportacionTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoInteresTarjeta = new JFileChooser();		
		this.jFileChooserImportacionTipoInteresTarjeta.setToolTipText("ESCOGER ARCHIVO"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoInteresTarjeta = new JButtonMe();
		this.jButtonAbrirImportacionTipoInteresTarjeta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoInteresTarjeta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoInteresTarjeta.setToolTipText("Generar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInteresTarjeta.add(this.jButtonAbrirImportacionTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoInteresTarjeta = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoInteresTarjeta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoInteresTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoInteresTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoInteresTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoInteresTarjeta.add(this.jLabelPathArchivoImportacionTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoInteresTarjeta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoInteresTarjeta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoInteresTarjeta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoInteresTarjeta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInteresTarjeta.add(this.jTextFieldPathArchivoImportacionTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoInteresTarjeta = new JButtonMe();
		this.jButtonGenerarImportacionTipoInteresTarjeta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoInteresTarjeta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoInteresTarjeta.setToolTipText("Generar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInteresTarjeta.add(this.jButtonGenerarImportacionTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoInteresTarjeta = new JButtonMe();
		this.jButtonCerrarImportacionTipoInteresTarjeta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoInteresTarjeta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoInteresTarjeta.setToolTipText("Cancelar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoInteresTarjeta.add(this.jButtonCerrarImportacionTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoInteresTarjeta = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoInteresTarjeta= new JScrollPane(jPanelImportacionTipoInteresTarjeta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoInteresTarjeta.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoInteresTarjeta.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoInteresTarjeta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoInteresTarjeta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoInteresTarjeta);
		this.jInternalFrameImportacionTipoInteresTarjeta.getContentPane().add(this.jScrollPanelImportacionTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoInteresTarjeta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoInteresTarjeta = new JButtonMe();
			this.jButtonAbrirOrderByTipoInteresTarjeta.setText("Orden");
			this.jButtonAbrirOrderByTipoInteresTarjeta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoInteresTarjeta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoInteresTarjeta";
			inputMap = this.jButtonAbrirOrderByTipoInteresTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoInteresTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoInteresTarjeta"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoInteresTarjeta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoInteresTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoInteresTarjeta.setName("jPanelOrderByTipoInteresTarjeta"); 
			
			this.jPanelOrderByTipoInteresTarjeta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoInteresTarjeta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoInteresTarjeta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoInteresTarjeta.setLayout(gridaBagLayoutOrderByTipoInteresTarjeta);
			
			
			this.jTableDatosTipoInteresTarjetaOrderBy = new JTableMe();        
			this.jTableDatosTipoInteresTarjetaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoInteresTarjetaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoInteresTarjetaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoInteresTarjetaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoInteresTarjetaOrderBy.setViewportView(this.jTableDatosTipoInteresTarjetaOrderBy);
			this.jTableDatosTipoInteresTarjetaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoInteresTarjetaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoInteresTarjeta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoInteresTarjeta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoInteresTarjeta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoInteresTarjeta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoInteresTarjeta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoInteresTarjeta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoInteresTarjeta.setTitle("Orden");
			this.jInternalFrameOrderByTipoInteresTarjeta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoInteresTarjeta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoInteresTarjeta.setResizable(true);
			this.jInternalFrameOrderByTipoInteresTarjeta.setClosable(true);
			this.jInternalFrameOrderByTipoInteresTarjeta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoInteresTarjeta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoInteresTarjeta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoInteresTarjeta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoInteresTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Interes Tarjetas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoInteresTarjeta.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoInteresTarjeta.ipady =150;
				
			this.jPanelOrderByTipoInteresTarjeta.add(jScrollPanelDatosTipoInteresTarjetaOrderBy, this.gridBagConstraintsTipoInteresTarjeta);//this.jTableDatosTipoInteresTarjetaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoInteresTarjeta = new JButtonMe();
			this.jButtonCerrarOrderByTipoInteresTarjeta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoInteresTarjeta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoInteresTarjeta.setToolTipText("Cancelar"+" "+TipoInteresTarjetaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoInteresTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInteresTarjeta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoInteresTarjeta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoInteresTarjeta.add(this.jButtonCerrarOrderByTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoInteresTarjeta = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoInteresTarjeta= new JScrollPane(jPanelOrderByTipoInteresTarjeta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoInteresTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoInteresTarjeta.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoInteresTarjeta.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoInteresTarjeta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoInteresTarjeta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoInteresTarjeta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoInteresTarjeta);
			
			this.jInternalFrameOrderByTipoInteresTarjeta.getContentPane().add(this.jScrollPanelOrderByTipoInteresTarjeta, this.gridBagConstraintsTipoInteresTarjeta);			
		
		} else {
			this.jButtonAbrirOrderByTipoInteresTarjeta = new JButtonMe();
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
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipointerestarjetaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoInteresTarjeta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoInteresTarjeta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoInteresTarjeta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoInteresTarjeta.getRowHeight();//TipoInteresTarjetaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoInteresTarjetaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoInteresTarjeta.isSelected()) {
					iHeightTable=TipoInteresTarjetaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoInteresTarjetaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoInteresTarjetaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoInteresTarjetaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoInteresTarjeta.isSelected()) {
					iHeightTable=TipoInteresTarjetaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoInteresTarjetaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoInteresTarjetaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoInteresTarjeta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoInteresTarjeta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoInteresTarjeta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoInteresTarjeta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoInteresTarjeta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoInteresTarjeta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoInteresTarjeta!=null && this.jInternalFrameOrderByTipoInteresTarjeta.getjTableDatosOrderBy()!=null) {
			//if(!this.tipointerestarjetaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoInteresTarjeta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoInteresTarjeta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoInteresTarjeta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoInteresTarjeta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoInteresTarjeta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoInteresTarjeta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoInteresTarjeta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoInteresTarjeta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoInteresTarjeta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoInteresTarjeta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipointerestarjetaLogic.getTipoInteresTarjetas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipointerestarjetas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoInteresTarjeta> TraerTipoInteresTarjetaBeans(List<TipoInteresTarjeta> tipointerestarjetas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoInteresTarjeta tipointerestarjeta:tipointerestarjetas) {
					
				if(!(TipoInteresTarjetaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoInteresTarjetaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipointerestarjeta.setsDetalleGeneralEntityReporte(TipoInteresTarjetaConstantesFunciones.getTipoInteresTarjetaDescripcion(tipointerestarjeta));
										
						
					
					

					if(tipointerestarjeta.getFormaPagoPuntoVentas()!=null && Funciones.existeClass(classes,FormaPagoPuntoVenta.class)) {
						try{tipointerestarjeta.setformapagopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(FormaPagoPuntoVentaJInternalFrame.TraerFormaPagoPuntoVentaBeans(tipointerestarjeta.getFormaPagoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipointerestarjeta.setsDetalleGeneralEntityReporte(tipointerestarjeta.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipointerestarjetabeans.add(tipointerestarjetabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipointerestarjetas;
    }
	//PARA REPORTES FIN
}
