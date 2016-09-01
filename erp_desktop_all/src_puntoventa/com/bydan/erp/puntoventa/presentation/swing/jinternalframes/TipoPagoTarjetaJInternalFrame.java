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
import com.bydan.erp.puntoventa.util.TipoPagoTarjetaConstantesFunciones;

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
public class TipoPagoTarjetaJInternalFrame extends TipoPagoTarjetaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoPagoTarjeta;
	
	protected JMenuBar jmenuBarTipoPagoTarjeta;
	
	protected JMenu jmenuTipoPagoTarjeta;
	protected JMenu jmenuDatosTipoPagoTarjeta;
	protected JMenu jmenuArchivoTipoPagoTarjeta;
	protected JMenu jmenuAccionesTipoPagoTarjeta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoPagoTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPagoTarjeta;	
	protected GridBagConstraints gridBagConstraintsTipoPagoTarjeta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoPagoTarjetaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoPagoTarjeta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoPagoTarjeta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoPagoTarjeta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoPagoTarjetaSessionBean tipopagotarjetaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoPagoTarjeta> tipopagotarjetas;		
	public List<TipoPagoTarjeta> tipopagotarjetasEliminados;	
	public List<TipoPagoTarjeta> tipopagotarjetasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoPagoTarjeta;		
	protected JButton jButtonAbrirOrderByTipoPagoTarjeta;
	
	
	//protected JPanel jPanelOrderByTipoPagoTarjeta;
	//public JScrollPane jScrollPanelOrderByTipoPagoTarjeta;	
	//protected JButton jButtonCerrarOrderByTipoPagoTarjeta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoPagoTarjetaLogic tipopagotarjetaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoPagoTarjeta;
	public JScrollPane jScrollPanelDatosEdicionTipoPagoTarjeta;
	public JScrollPane jScrollPanelDatosGeneralTipoPagoTarjeta;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoPagoTarjetaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoPagoTarjeta;
	//public JScrollPane jScrollPanelImportacionTipoPagoTarjeta;
	
	
	
	protected JPanel jPanelAccionesTipoPagoTarjeta;
	
    protected JPanel jPanelPaginacionTipoPagoTarjeta;
    protected JPanel jPanelParametrosReportesTipoPagoTarjeta;
	protected JPanel jPanelParametrosReportesAccionesTipoPagoTarjeta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoPagoTarjeta;
	protected JPanel jPanelParametrosAuxiliar2TipoPagoTarjeta;
	protected JPanel jPanelParametrosAuxiliar3TipoPagoTarjeta;
	protected JPanel jPanelParametrosAuxiliar4TipoPagoTarjeta;
	//protected JPanel jPanelParametrosAuxiliar5TipoPagoTarjeta;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoPagoTarjeta;
	//protected JPanel jPanelImportacionTipoPagoTarjeta;
	
	
	public JTable jTableDatosTipoPagoTarjeta;
	
	
	
	//public JTable jTableDatosTipoPagoTarjetaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoPagoTarjeta;
	protected JButton jButtonDuplicarTipoPagoTarjeta;
	protected JButton jButtonCopiarTipoPagoTarjeta;
	protected JButton jButtonVerFormTipoPagoTarjeta;
	protected JButton jButtonNuevoRelacionesTipoPagoTarjeta;
	protected JButton jButtonModificarTipoPagoTarjeta;
	
    protected JButton jButtonGuardarCambiosTablaTipoPagoTarjeta;
	protected JButton jButtonCerrarTipoPagoTarjeta;
	
	
	protected JButton jButtonRecargarInformacionTipoPagoTarjeta;
	protected JButton jButtonProcesarInformacionTipoPagoTarjeta;
	
	
	protected JButton jButtonAnterioresTipoPagoTarjeta;
	protected JButton jButtonSiguientesTipoPagoTarjeta;
	protected JButton jButtonNuevoGuardarCambiosTipoPagoTarjeta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoPagoTarjeta;
	//protected JButton jButtonCerrarReporteDinamicoTipoPagoTarjeta;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoPagoTarjeta;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoPagoTarjeta;
	//protected JButton jButtonGenerarImportacionTipoPagoTarjeta;
	//protected JButton jButtonCerrarImportacionTipoPagoTarjeta;
	//protected JFileChooser jFileChooserImportacionTipoPagoTarjeta;
	//protected File fileImportacionTipoPagoTarjeta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPagoTarjeta;
	protected JButton jButtonDuplicarToolBarTipoPagoTarjeta;
	protected JButton jButtonNuevoRelacionesToolBarTipoPagoTarjeta;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoPagoTarjeta;
	protected JButton jButtonCopiarToolBarTipoPagoTarjeta;
	protected JButton jButtonVerFormToolBarTipoPagoTarjeta;
	public JButton jButtonGuardarCambiosTablaToolBarTipoPagoTarjeta;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPagoTarjeta;
	protected JButton jButtonCerrarToolBarTipoPagoTarjeta;
	
	protected JButton jButtonRecargarInformacionToolBarTipoPagoTarjeta;
	protected JButton jButtonProcesarInformacionToolBarTipoPagoTarjeta;
	protected JButton jButtonAnterioresToolBarTipoPagoTarjeta;
	protected JButton jButtonSiguientesToolBarTipoPagoTarjeta;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoPagoTarjeta;
	protected JButton jButtonAbrirOrderByToolBarTipoPagoTarjeta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPagoTarjeta;
	protected JMenuItem jMenuItemDuplicarTipoPagoTarjeta;
	protected JMenuItem jMenuItemNuevoRelacionesTipoPagoTarjeta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoPagoTarjeta;
	protected JMenuItem jMenuItemCopiarTipoPagoTarjeta;
	protected JMenuItem jMenuItemVerFormTipoPagoTarjeta;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPagoTarjeta;
	protected JMenuItem jMenuItemCerrarTipoPagoTarjeta;
	protected JMenuItem jMenuItemDetalleCerrarTipoPagoTarjeta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoPagoTarjeta;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPagoTarjeta;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoPagoTarjeta;
	protected JMenuItem jMenuItemProcesarInformacionTipoPagoTarjeta;
	protected JMenuItem jMenuItemAnterioresTipoPagoTarjeta;
	protected JMenuItem jMenuItemSiguientesTipoPagoTarjeta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPagoTarjeta;
	protected JMenuItem jMenuItemAbrirOrderByTipoPagoTarjeta;
	protected JMenuItem jMenuItemMostrarOcultarTipoPagoTarjeta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPagoTarjeta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoPagoTarjeta;
	protected JCheckBox jCheckBoxSeleccionadosTipoPagoTarjeta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoPagoTarjeta;
	protected JCheckBox jCheckBoxConGraficoReporteTipoPagoTarjeta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoPagoTarjeta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoPagoTarjeta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPagoTarjeta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoPagoTarjeta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoPagoTarjeta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoPagoTarjeta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPagoTarjeta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPagoTarjeta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoPagoTarjeta;
	protected JTextField jTextFieldValorCampoGeneralTipoPagoTarjeta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoPagoTarjeta;
	//public JList<Reporte> jListColumnasSelectReporteTipoPagoTarjeta;
	//public JScrollPane jScrollColumnasSelectReporteTipoPagoTarjeta;
	
	//public JLabel jLabelRelacionesSelectReporteTipoPagoTarjeta;
	//public JList<Reporte> jListRelacionesSelectReporteTipoPagoTarjeta;
	//public JScrollPane jScrollRelacionesSelectReporteTipoPagoTarjeta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoPagoTarjeta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoPagoTarjeta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoPagoTarjeta;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoPagoTarjeta;
	
		
	//public JLabel jLabelArchivoImportacionTipoPagoTarjeta;	
	//public JLabel jLabelPathArchivoImportacionTipoPagoTarjeta;
	//protected JTextField jTextFieldPathArchivoImportacionTipoPagoTarjeta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoPagoTarjeta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoPagoTarjeta;
	
	//public JLabel jLabelColumnaCategoriaValorTipoPagoTarjeta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoPagoTarjeta;
	
	//public JLabel jLabelColumnasValoresGraficoTipoPagoTarjeta;
	//public JList<Reporte> jListColumnasValoresGraficoTipoPagoTarjeta;
	//public JScrollPane jScrollColumnasValoresGraficoTipoPagoTarjeta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoPagoTarjeta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoPagoTarjeta;	
	
	
	
	
	
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
	public TipoPagoTarjetaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoPagoTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPagoTarjetaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPagoTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPagoTarjetaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPagoTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPagoTarjetaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPagoTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoPagoTarjeta)	{
		this.jButtonRecargarInformacionTipoPagoTarjeta = jButtonRecargarInformacionTipoPagoTarjeta;
	}
	
	public JButton getjButtonProcesarInformacionTipoPagoTarjeta() {
		return this.jButtonProcesarInformacionTipoPagoTarjeta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPagoTarjeta)	{
		this.jButtonProcesarInformacionTipoPagoTarjeta = jButtonProcesarInformacionTipoPagoTarjeta;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoPagoTarjeta() {
		return this.jButtonRecargarInformacionTipoPagoTarjeta;
	}
	
	
	public List<TipoPagoTarjeta> gettipopagotarjetas() {
		return this.tipopagotarjetas;
	}

	public void settipopagotarjetas(List<TipoPagoTarjeta> tipopagotarjetas) {
		this.tipopagotarjetas = tipopagotarjetas;
	}
	
	public List<TipoPagoTarjeta> gettipopagotarjetasAux() {
		return this.tipopagotarjetasAux;
	}

	public void settipopagotarjetasAux(List<TipoPagoTarjeta> tipopagotarjetasAux) {
		this.tipopagotarjetasAux = tipopagotarjetasAux;
	}
	
	public List<TipoPagoTarjeta> gettipopagotarjetasEliminados() {
		return this.tipopagotarjetasEliminados;
	}

	public void setTipoPagoTarjetasEliminados(List<TipoPagoTarjeta> tipopagotarjetasEliminados) {
		this.tipopagotarjetasEliminados = tipopagotarjetasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoPagoTarjeta() {
		return jComboBoxTiposSeleccionarTipoPagoTarjeta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoPagoTarjeta(
			JComboBox jComboBoxTiposSeleccionarTipoPagoTarjeta) {
		this.jComboBoxTiposSeleccionarTipoPagoTarjeta = jComboBoxTiposSeleccionarTipoPagoTarjeta;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoPagoTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoPagoTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoPagoTarjeta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoPagoTarjeta() {
		return jTextFieldValorCampoGeneralTipoPagoTarjeta;
	}

	public void setjTextFieldValorCampoGeneralTipoPagoTarjeta(
			JTextField jTextFieldValorCampoGeneralTipoPagoTarjeta) {
		this.jTextFieldValorCampoGeneralTipoPagoTarjeta = jTextFieldValorCampoGeneralTipoPagoTarjeta;
	}

	public void setBorderResaltarValorCampoGeneralTipoPagoTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPagoTarjeta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoPagoTarjeta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoPagoTarjeta() {
		return this.jCheckBoxSeleccionarTodosTipoPagoTarjeta;
	}

	public void setjCheckBoxSeleccionarTodosTipoPagoTarjeta(
			JCheckBox jCheckBoxSeleccionarTodosTipoPagoTarjeta) {
		this.jCheckBoxSeleccionarTodosTipoPagoTarjeta = jCheckBoxSeleccionarTodosTipoPagoTarjeta;
	}

	public void setBorderResaltarSeleccionarTodosTipoPagoTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPagoTarjeta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoPagoTarjeta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoPagoTarjeta() {
		return this.jCheckBoxSeleccionadosTipoPagoTarjeta;
	}

	public void setjCheckBoxSeleccionadosTipoPagoTarjeta(
			JCheckBox jCheckBoxSeleccionadosTipoPagoTarjeta) {
		this.jCheckBoxSeleccionadosTipoPagoTarjeta = jCheckBoxSeleccionadosTipoPagoTarjeta;
	}
	
	public void setBorderResaltarSeleccionadosTipoPagoTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPagoTarjeta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoPagoTarjeta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoPagoTarjeta() {
		return this.jComboBoxTiposArchivosReportesTipoPagoTarjeta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoPagoTarjeta(
			JComboBox jComboBoxTiposArchivosReportesTipoPagoTarjeta) {
		this.jComboBoxTiposArchivosReportesTipoPagoTarjeta = jComboBoxTiposArchivosReportesTipoPagoTarjeta;
	}

	public void setBorderResaltarTiposArchivosReportesTipoPagoTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPagoTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoPagoTarjeta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoPagoTarjeta() {
		return this.jComboBoxTiposReportesTipoPagoTarjeta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoPagoTarjeta(
			JComboBox jComboBoxTiposReportesTipoPagoTarjeta) {
		this.jComboBoxTiposReportesTipoPagoTarjeta = jComboBoxTiposReportesTipoPagoTarjeta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoPagoTarjeta() {
	//	return jComboBoxTiposReportesDinamicoTipoPagoTarjeta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoPagoTarjeta(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoPagoTarjeta) {
	//	this.jComboBoxTiposReportesDinamicoTipoPagoTarjeta = jComboBoxTiposReportesDinamicoTipoPagoTarjeta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoPagoTarjeta() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoPagoTarjeta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoPagoTarjeta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPagoTarjeta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoPagoTarjeta = jComboBoxTiposArchivosReportesDinamicoTipoPagoTarjeta;
	//}
	
	public void setBorderResaltarTiposReportesTipoPagoTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPagoTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoPagoTarjeta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoPagoTarjeta() {
		return this.jComboBoxTiposGraficosReportesTipoPagoTarjeta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoPagoTarjeta(
			JComboBox jComboBoxTiposGraficosReportesTipoPagoTarjeta) {
		this.jComboBoxTiposGraficosReportesTipoPagoTarjeta = jComboBoxTiposGraficosReportesTipoPagoTarjeta;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoPagoTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPagoTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoPagoTarjeta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoPagoTarjeta() {
		return this.jComboBoxTiposPaginacionTipoPagoTarjeta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoPagoTarjeta(
			JComboBox jComboBoxTiposPaginacionTipoPagoTarjeta) {
		this.jComboBoxTiposPaginacionTipoPagoTarjeta = jComboBoxTiposPaginacionTipoPagoTarjeta;
	}
	
	public void setBorderResaltarTiposPaginacionTipoPagoTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPagoTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoPagoTarjeta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoPagoTarjeta() {
		return this.jComboBoxTiposRelacionesTipoPagoTarjeta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPagoTarjeta() {
		return this.jComboBoxTiposAccionesTipoPagoTarjeta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPagoTarjeta(
			JComboBox jComboBoxTiposRelacionesTipoPagoTarjeta) {
		this.jComboBoxTiposRelacionesTipoPagoTarjeta = jComboBoxTiposRelacionesTipoPagoTarjeta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPagoTarjeta(
			JComboBox jComboBoxTiposAccionesTipoPagoTarjeta) {
		this.jComboBoxTiposAccionesTipoPagoTarjeta = jComboBoxTiposAccionesTipoPagoTarjeta;
	}
	
	public void setBorderResaltarTiposRelacionesTipoPagoTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPagoTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoPagoTarjeta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoPagoTarjeta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPagoTarjeta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoPagoTarjeta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoPagoTarjeta() {
	//	return jCheckBoxConGraficoDinamicoTipoPagoTarjeta;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoPagoTarjeta(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoPagoTarjeta) {
	//	this.jCheckBoxConGraficoDinamicoTipoPagoTarjeta = jCheckBoxConGraficoDinamicoTipoPagoTarjeta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoPagoTarjeta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoPagoTarjeta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoPagoTarjeta .setBorder(borderResaltar);		
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
		this.tipopagotarjetaSessionBean=new TipoPagoTarjetaSessionBean();
		
		this.tipopagotarjetaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipopagotarjetaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipopagotarjetaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoPagoTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoPagoTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPagoTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPagoTarjetaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPagoTarjetaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoPagoTarjetaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoPagoTarjeta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoPagoTarjeta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoPagoTarjeta,this.jTtoolBarTipoPagoTarjeta,
							"nuevo","nuevo","Nuevo"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoPagoTarjeta,this.jTtoolBarTipoPagoTarjeta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoPagoTarjeta,this.jTtoolBarTipoPagoTarjeta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoPagoTarjeta,this.jTtoolBarTipoPagoTarjeta,
							"duplicar","duplicar","Duplicar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoPagoTarjeta,this.jTtoolBarTipoPagoTarjeta,
							"copiar","copiar","Copiar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoPagoTarjeta,this.jTtoolBarTipoPagoTarjeta,
							"ver_form","ver_form","Ver"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPagoTarjeta,this.jTtoolBarTipoPagoTarjeta,
							"recargar","recargar","Recargar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPagoTarjeta,this.jTtoolBarTipoPagoTarjeta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPagoTarjeta,this.jTtoolBarTipoPagoTarjeta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoPagoTarjeta,this.jTtoolBarTipoPagoTarjeta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoPagoTarjeta,this.jTtoolBarTipoPagoTarjeta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoPagoTarjeta,this.jTtoolBarTipoPagoTarjeta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoPagoTarjeta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoPagoTarjeta,this.jTtoolBarTipoPagoTarjeta,
							"cerrar","cerrar","Salir"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoPagoTarjeta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoPagoTarjeta;
			
				this.jButtonProcesarInformacionToolBarTipoPagoTarjeta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoPagoTarjeta;
				
		//protected JButton jButtonModificarToolBarTipoPagoTarjeta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoPagoTarjeta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoPagoTarjeta=new JMenuMe("General");
		this.jmenuArchivoTipoPagoTarjeta=new JMenuMe("Archivo");
		this.jmenuAccionesTipoPagoTarjeta=new JMenuMe("Acciones");
		this.jmenuDatosTipoPagoTarjeta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPagoTarjeta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPagoTarjeta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPagoTarjeta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoPagoTarjeta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoPagoTarjeta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoPagoTarjeta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoPagoTarjeta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoPagoTarjeta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoPagoTarjeta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoPagoTarjeta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPagoTarjeta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPagoTarjeta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoPagoTarjeta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoPagoTarjeta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoPagoTarjeta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoPagoTarjeta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoPagoTarjeta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoPagoTarjeta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoPagoTarjeta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoPagoTarjeta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoPagoTarjeta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPagoTarjeta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPagoTarjeta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPagoTarjeta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoPagoTarjeta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoPagoTarjeta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoPagoTarjeta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoPagoTarjeta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoPagoTarjeta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoPagoTarjeta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoPagoTarjeta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoPagoTarjeta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoPagoTarjeta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoPagoTarjeta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoPagoTarjeta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoPagoTarjeta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoPagoTarjeta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoPagoTarjeta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoPagoTarjeta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPagoTarjeta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPagoTarjeta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPagoTarjeta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoPagoTarjeta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoPagoTarjeta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoPagoTarjeta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPagoTarjeta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPagoTarjeta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPagoTarjeta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoPagoTarjeta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoPagoTarjeta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoPagoTarjeta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoPagoTarjeta.add(this.jMenuItemCerrarTipoPagoTarjeta);
			
			this.jmenuAccionesTipoPagoTarjeta.add(this.jMenuItemNuevoTipoPagoTarjeta);
			this.jmenuAccionesTipoPagoTarjeta.add(this.jMenuItemNuevoGuardarCambiosTipoPagoTarjeta);
			this.jmenuAccionesTipoPagoTarjeta.add(this.jMenuItemNuevoRelacionesTipoPagoTarjeta);
			this.jmenuAccionesTipoPagoTarjeta.add(this.jMenuItemGuardarCambiosTablaTipoPagoTarjeta);		
			this.jmenuAccionesTipoPagoTarjeta.add(this.jMenuItemDuplicarTipoPagoTarjeta);		
			this.jmenuAccionesTipoPagoTarjeta.add(this.jMenuItemCopiarTipoPagoTarjeta);		
			this.jmenuAccionesTipoPagoTarjeta.add(this.jMenuItemVerFormTipoPagoTarjeta);		
			
			this.jmenuDatosTipoPagoTarjeta.add(this.jMenuItemRecargarInformacionTipoPagoTarjeta);				
			this.jmenuDatosTipoPagoTarjeta.add(this.jMenuItemAnterioresTipoPagoTarjeta);				
			this.jmenuDatosTipoPagoTarjeta.add(this.jMenuItemSiguientesTipoPagoTarjeta);				
			this.jmenuDatosTipoPagoTarjeta.add(this.jMenuItemAbrirOrderByTipoPagoTarjeta);				
			this.jmenuDatosTipoPagoTarjeta.add(this.jMenuItemMostrarOcultarTipoPagoTarjeta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoPagoTarjeta.add(this.jMenuItemGuardarCambiosTipoPagoTarjeta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoPagoTarjeta.add(this.jmenuArchivoTipoPagoTarjeta);		
			this.jmenuBarTipoPagoTarjeta.add(this.jmenuAccionesTipoPagoTarjeta);		
			this.jmenuBarTipoPagoTarjeta.add(this.jmenuDatosTipoPagoTarjeta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoPagoTarjeta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoPagoTarjeta() {
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
			//this.jInternalFrameDetalleTipoPagoTarjeta = new TipoPagoTarjetaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Pago DATOS");
			this.jInternalFrameDetalleFormTipoPagoTarjeta = new TipoPagoTarjetaDetalleFormJInternalFrame(jDesktopPane,this.tipopagotarjetaSessionBean.getConGuardarRelaciones(),this.tipopagotarjetaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoPagoTarjeta = null;//new TipoPagoTarjetaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPagoTarjeta= new GridBagLayout();
		
		
		this.jTableDatosTipoPagoTarjeta = new JTableMe();      
		
		String sToolTipTipoPagoTarjeta="";
		sToolTipTipoPagoTarjeta=TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPagoTarjeta+="(PuntoVenta.TipoPagoTarjeta)";
		}
		
		if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPagoTarjeta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoPagoTarjeta.setToolTipText(sToolTipTipoPagoTarjeta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoPagoTarjeta);
		this.jTableDatosTipoPagoTarjeta.setAutoCreateRowSorter(true);
		this.jTableDatosTipoPagoTarjeta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoPagoTarjeta.setRowSelectionAllowed(true);
		this.jTableDatosTipoPagoTarjeta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoPagoTarjeta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoPagoTarjeta = new JButtonMe();
		this.jButtonDuplicarTipoPagoTarjeta = new JButtonMe();
		this.jButtonCopiarTipoPagoTarjeta = new JButtonMe();
		this.jButtonVerFormTipoPagoTarjeta = new JButtonMe();
		this.jButtonNuevoRelacionesTipoPagoTarjeta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoPagoTarjeta = new JButtonMe();
		this.jButtonCerrarTipoPagoTarjeta = new JButtonMe();
		
		this.jScrollPanelDatosTipoPagoTarjeta = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoPagoTarjeta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoPagoTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Pago";
		
		if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPagoTarjeta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPagoTarjeta.setToolTipText("Acciones");
        this.jPanelAccionesTipoPagoTarjeta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoPagoTarjeta=new ReporteDinamicoJInternalFrame(TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoPagoTarjeta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoPagoTarjeta=new ImportacionJInternalFrame(TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoPagoTarjeta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoPagoTarjeta = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoPagoTarjeta.setText("Orden");
		this.jButtonAbrirOrderByTipoPagoTarjeta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPagoTarjeta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoPagoTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPagoTarjeta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPagoTarjeta,false,this);
			
			//this.cargarOrderByTipoPagoTarjeta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPagoTarjeta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPagoTarjeta,true,this);
			
			//this.cargarOrderByTipoPagoTarjeta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoPagoTarjeta.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPagoTarjeta.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPagoTarjeta.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoPagoTarjeta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPagoTarjeta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPagoTarjeta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoPagoTarjeta.setText("Nuevo");
		this.jButtonDuplicarTipoPagoTarjeta.setText("Duplicar");
		this.jButtonCopiarTipoPagoTarjeta.setText("Copiar");
		this.jButtonVerFormTipoPagoTarjeta.setText("Ver");
		this.jButtonNuevoRelacionesTipoPagoTarjeta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoPagoTarjeta.setText("Guardar");
		this.jButtonCerrarTipoPagoTarjeta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPagoTarjeta,"nuevo_button","Nuevo",this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoPagoTarjeta,"duplicar_button","Duplicar",this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoPagoTarjeta,"copiar_button","Copiar",this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoPagoTarjeta,"ver_form","Ver",this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoPagoTarjeta,"nuevorelaciones_button","Nuevo Rel",this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPagoTarjeta,"guardarcambiostabla_button","Guardar",this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPagoTarjeta,"cerrar_button","Salir",this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoPagoTarjeta.setToolTipText("Nuevo"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoPagoTarjeta.setToolTipText("Duplicar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoPagoTarjeta.setToolTipText("Copiar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoPagoTarjeta.setToolTipText("Ver"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoPagoTarjeta.setToolTipText("Nuevo Rel"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoPagoTarjeta.setToolTipText("Guardar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPagoTarjeta.setToolTipText("Salir"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPagoTarjeta";
		inputMap = this.jButtonNuevoTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPagoTarjeta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPagoTarjeta"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoPagoTarjeta";
		inputMap = this.jButtonDuplicarTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoPagoTarjeta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoPagoTarjeta"));
		
		//COPIAR
		sMapKey = "CopiarTipoPagoTarjeta";
		inputMap = this.jButtonCopiarTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoPagoTarjeta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoPagoTarjeta"));
		
		//VEr FORM
		sMapKey = "VerFormTipoPagoTarjeta";
		inputMap = this.jButtonVerFormTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoPagoTarjeta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoPagoTarjeta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoPagoTarjeta";
		inputMap = this.jButtonNuevoRelacionesTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoPagoTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoPagoTarjeta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoPagoTarjeta";
		inputMap = this.jButtonModificarTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoPagoTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoPagoTarjeta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoPagoTarjeta";
		inputMap = this.jButtonCerrarTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPagoTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPagoTarjeta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPagoTarjeta";
		inputMap = this.jButtonGuardarCambiosTablaTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPagoTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPagoTarjeta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoPagoTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoPagoTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoPagoTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoPagoTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoPagoTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoPagoTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoPagoTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoPagoTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoPagoTarjeta.setName("jPanelParametrosReportesTipoPagoTarjeta"); 
		
		this.jPanelParametrosReportesAccionesTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoPagoTarjeta.setName("jPanelParametrosReportesAccionesTipoPagoTarjeta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoPagoTarjeta = new JButtonMe();
		this.jButtonRecargarInformacionTipoPagoTarjeta.setText("Recargar");
		this.jButtonRecargarInformacionTipoPagoTarjeta.setToolTipText("Recargar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoPagoTarjeta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoPagoTarjeta = new JButtonMe();
		this.jButtonProcesarInformacionTipoPagoTarjeta.setText("Procesar");
		this.jButtonProcesarInformacionTipoPagoTarjeta.setToolTipText("Procesar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoPagoTarjeta.setVisible(false);
			
		this.jButtonProcesarInformacionTipoPagoTarjeta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPagoTarjeta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPagoTarjeta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoPagoTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPagoTarjeta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoPagoTarjeta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoPagoTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPagoTarjeta.setText("TIPO");       
		this.jComboBoxTiposReportesTipoPagoTarjeta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoPagoTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPagoTarjeta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoPagoTarjeta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoPagoTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoPagoTarjeta.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoPagoTarjeta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoPagoTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoPagoTarjeta.setText("Accion");
		this.jComboBoxTiposRelacionesTipoPagoTarjeta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoPagoTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPagoTarjeta.setText("Accion");
		this.jComboBoxTiposAccionesTipoPagoTarjeta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoPagoTarjeta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoPagoTarjeta.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoPagoTarjeta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoPagoTarjeta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoPagoTarjeta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPagoTarjeta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPagoTarjeta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoPagoTarjeta = new JLabelMe();
		
		this.jLabelAccionesTipoPagoTarjeta.setText("Acciones");		
		this.jLabelAccionesTipoPagoTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPagoTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPagoTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoPagoTarjeta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoPagoTarjeta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoPagoTarjeta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoPagoTarjeta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoPagoTarjeta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoPagoTarjeta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoPagoTarjeta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoPagoTarjeta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoPagoTarjeta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoPagoTarjeta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoPagoTarjeta.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoPagoTarjeta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoPagoTarjeta = new JButtonMe();
		//this.jButtonAnterioresTipoPagoTarjeta.setText("<<");
        this.jButtonAnterioresTipoPagoTarjeta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoPagoTarjeta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoPagoTarjeta = new JButtonMe();
		//this.jButtonSiguientesTipoPagoTarjeta.setText(">>");
        this.jButtonSiguientesTipoPagoTarjeta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoPagoTarjeta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoPagoTarjeta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoPagoTarjeta.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoPagoTarjeta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoPagoTarjeta,"nuevoguardarcambios_button","Nue",this.tipopagotarjetaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoPagoTarjeta";
		inputMap = this.jButtonNuevoGuardarCambiosTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoPagoTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoPagoTarjeta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoPagoTarjeta";
		inputMap = this.jButtonRecargarInformacionTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoPagoTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoPagoTarjeta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoPagoTarjeta";
		inputMap = this.jButtonSiguientesTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoPagoTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoPagoTarjeta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoPagoTarjeta";
		inputMap = this.jButtonAnterioresTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoPagoTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoPagoTarjeta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoPagoTarjeta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoPagoTarjeta.setMinimumSize(new Dimension(this.getWidth(),TipoPagoTarjetaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPagoTarjetaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPagoTarjeta.setMaximumSize(new Dimension(this.getWidth(),TipoPagoTarjetaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPagoTarjetaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPagoTarjeta.setPreferredSize(new Dimension(this.getWidth(),TipoPagoTarjetaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPagoTarjetaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoPagoTarjeta = new GridBagLayout();

			this.jPanelPaginacionTipoPagoTarjeta.setLayout(gridaBagLayoutPaginacionTipoPagoTarjeta);						
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoPagoTarjeta.add(this.jButtonAnterioresTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
					
						
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;
			
			this.jPanelPaginacionTipoPagoTarjeta.add(this.jButtonNuevoGuardarCambiosTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
						
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;
			this.jPanelPaginacionTipoPagoTarjeta.add(this.jButtonSiguientesTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = 1;
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPagoTarjeta.add(this.jButtonNuevoTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
				this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoPagoTarjeta.gridy = 1;
				this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoPagoTarjeta.add(this.jButtonNuevoRelacionesTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
			}
			
			
			if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
				this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoPagoTarjeta.gridy = 1;
				this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoPagoTarjeta.add(this.jButtonGuardarCambiosTablaTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
			}
			
			
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = 1;
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPagoTarjeta.add(this.jButtonDuplicarTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = 1;
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPagoTarjeta.add(this.jButtonCopiarTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = 1;
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPagoTarjeta.add(this.jButtonVerFormTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = 1;
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoPagoTarjeta.add(this.jButtonCerrarTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		
		
		
		this.jButtonRecargarInformacionTipoPagoTarjeta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPagoTarjeta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPagoTarjeta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoPagoTarjeta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPagoTarjeta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPagoTarjeta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoPagoTarjeta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPagoTarjeta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPagoTarjeta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoPagoTarjeta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPagoTarjeta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPagoTarjeta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoPagoTarjeta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPagoTarjeta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPagoTarjeta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoPagoTarjeta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPagoTarjeta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPagoTarjeta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoPagoTarjeta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPagoTarjeta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPagoTarjeta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoPagoTarjeta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPagoTarjeta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPagoTarjeta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoPagoTarjeta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPagoTarjeta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPagoTarjeta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoPagoTarjeta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPagoTarjeta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPagoTarjeta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoPagoTarjeta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPagoTarjeta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPagoTarjeta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoPagoTarjeta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPagoTarjeta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPagoTarjeta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoPagoTarjeta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoPagoTarjeta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoPagoTarjeta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoPagoTarjeta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoPagoTarjeta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoPagoTarjeta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoPagoTarjeta.setLayout(gridaBagParametrosReportesTipoPagoTarjeta);
			this.jPanelParametrosReportesAccionesTipoPagoTarjeta.setLayout(gridaBagParametrosReportesAccionesTipoPagoTarjeta);
			
			
			this.jPanelParametrosAuxiliar1TipoPagoTarjeta.setLayout(gridaBagParametrosAuxiliar1TipoPagoTarjeta);
			this.jPanelParametrosAuxiliar2TipoPagoTarjeta.setLayout(gridaBagParametrosAuxiliar2TipoPagoTarjeta);
			this.jPanelParametrosAuxiliar3TipoPagoTarjeta.setLayout(gridaBagParametrosAuxiliar3TipoPagoTarjeta);
			this.jPanelParametrosAuxiliar4TipoPagoTarjeta.setLayout(gridaBagParametrosAuxiliar4TipoPagoTarjeta);
			//this.jPanelParametrosAuxiliar5TipoPagoTarjeta.setLayout(gridaBagParametrosAuxiliar2TipoPagoTarjeta);			
			
			
			
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPagoTarjeta.add(this.jButtonRecargarInformacionTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPagoTarjeta.add(this.jComboBoxTiposPaginacionTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPagoTarjeta.add(this.jCheckBoxConAltoMaximoTablaTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPagoTarjeta.add(this.jComboBoxTiposArchivosReportesTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPagoTarjeta.add(this.jPanelParametrosAuxiliar1TipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPagoTarjeta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPagoTarjeta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoPagoTarjeta.add(this.jComboBoxTiposReportesTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPagoTarjeta.add(this.jPanelParametrosAuxiliar4TipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPagoTarjeta.add(this.jComboBoxTiposReportesTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPagoTarjeta.add(this.jCheckBoxGenerarReporteTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPagoTarjeta.add(this.jPanelParametrosAuxiliar2TipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPagoTarjeta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPagoTarjeta.add(this.jLabelAccionesTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
				this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoPagoTarjeta.add(this.jButtonAbrirOrderByTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPagoTarjeta.add(this.jComboBoxTiposSeleccionarTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);			
			
			
			/*
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPagoTarjeta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPagoTarjeta.add(this.jCheckBoxSeleccionarTodosTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPagoTarjeta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPagoTarjeta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPagoTarjeta.add(this.jCheckBoxSeleccionarTodosTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);															
				
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPagoTarjeta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPagoTarjeta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPagoTarjeta.add(this.jCheckBoxSeleccionadosTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPagoTarjeta.add(this.jPanelParametrosAuxiliar3TipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPagoTarjeta.add(this.jComboBoxTiposRelacionesTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
				
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPagoTarjeta.add(this.jComboBoxTiposAccionesTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoPagoTarjeta = new GridBagLayout();

			this.jScrollPanelDatosTipoPagoTarjeta.setLayout(gridaBagLayoutDatosTipoPagoTarjeta);
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;
			this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
			
			this.jScrollPanelDatosTipoPagoTarjeta.add(this.jTableDatosTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoPagoTarjeta.setViewportView(this.jTableDatosTipoPagoTarjeta);
		this.jTableDatosTipoPagoTarjeta.setFillsViewportHeight(true);
		this.jTableDatosTipoPagoTarjeta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoPagoTarjeta= new GridBagLayout();
		this.jPanelAccionesTipoPagoTarjeta.setLayout(gridaBagLayoutAccionesTipoPagoTarjeta);
		
		
		/*	
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = 0;
		this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
			
		this.jPanelAccionesTipoPagoTarjeta.add(this.jButtonNuevoTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPagoTarjeta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPagoTarjeta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();						
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;		
			//this.gridBagConstraintsTipoPagoTarjeta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPagoTarjeta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;		
		//this.gridBagConstraintsTipoPagoTarjeta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPagoTarjeta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoPagoTarjeta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoPagoTarjeta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);								
		
		
		/*
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		*/		
		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPagoTarjeta.gridx =0;
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPagoTarjeta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
				
		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoPagoTarjetaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoPagoTarjeta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPagoTarjeta = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoPagoTarjeta.setLayout(gridaBagLayoutBusquedasParametrosTipoPagoTarjeta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoPagoTarjeta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPagoTarjeta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPagoTarjeta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPagoTarjeta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
			
			
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		
			
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoPagoTarjeta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoPagoTarjeta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoPagoTarjeta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoPagoTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoPagoTarjeta.setName("jPanelReporteDinamicoTipoPagoTarjeta"); 
		
		this.jPanelReporteDinamicoTipoPagoTarjeta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPagoTarjeta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPagoTarjeta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoPagoTarjeta.setLayout(gridaBagLayoutReporteDinamicoTipoPagoTarjeta);
		
		
		this.jInternalFrameReporteDinamicoTipoPagoTarjeta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoPagoTarjeta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPagoTarjeta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoPagoTarjeta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPagoTarjeta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPagoTarjeta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pagos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoPagoTarjeta = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoPagoTarjeta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoPagoTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPagoTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPagoTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPagoTarjeta.add(this.jLabelColumnasSelectReporteTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoPagoTarjeta = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoPagoTarjeta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoPagoTarjeta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoPagoTarjeta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPagoTarjeta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPagoTarjeta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoPagoTarjeta=new JScrollPane(this.jListColumnasSelectReporteTipoPagoTarjeta);
			
			this.jScrollColumnasSelectReporteTipoPagoTarjeta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPagoTarjeta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPagoTarjeta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoPagoTarjeta.add(this.jListColumnasSelectReporteTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		this.jPanelReporteDinamicoTipoPagoTarjeta.add(this.jScrollColumnasSelectReporteTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoPagoTarjeta = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoPagoTarjeta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoPagoTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPagoTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPagoTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPagoTarjeta.add(this.jLabelRelacionesSelectReporteTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoPagoTarjeta = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoPagoTarjeta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoPagoTarjeta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoPagoTarjeta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPagoTarjeta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPagoTarjeta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoPagoTarjeta=new JScrollPane(this.jListRelacionesSelectReporteTipoPagoTarjeta);
			
			this.jScrollRelacionesSelectReporteTipoPagoTarjeta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPagoTarjeta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPagoTarjeta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoPagoTarjeta.add(this.jListRelacionesSelectReporteTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		this.jPanelReporteDinamicoTipoPagoTarjeta.add(this.jScrollRelacionesSelectReporteTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoPagoTarjeta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoPagoTarjeta = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoPagoTarjeta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoPagoTarjeta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoPagoTarjeta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoPagoTarjeta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPagoTarjeta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPagoTarjeta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoPagoTarjeta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPagoTarjeta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPagoTarjeta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPagoTarjeta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPagoTarjeta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoPagoTarjeta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoPagoTarjeta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoPagoTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPagoTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPagoTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPagoTarjeta.add(this.jLabelGenerarExcelReporteDinamicoTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoPagoTarjeta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoPagoTarjeta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoPagoTarjeta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoPagoTarjeta.setToolTipText("Generar EXCEL"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		//this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoPagoTarjeta.add(this.jButtonGenerarExcelReporteDinamicoTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPagoTarjeta.add(this.jComboBoxTiposReportesDinamicoTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoPagoTarjeta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoPagoTarjeta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoPagoTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPagoTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPagoTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPagoTarjeta.add(this.jLabelTiposArchivoReporteDinamicoTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPagoTarjeta.add(this.jComboBoxTiposArchivosReportesDinamicoTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoPagoTarjeta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoPagoTarjeta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoPagoTarjeta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoPagoTarjeta.setToolTipText("Generar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPagoTarjeta.add(this.jButtonGenerarReporteDinamicoTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoPagoTarjeta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoPagoTarjeta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoPagoTarjeta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoPagoTarjeta.setToolTipText("Cancelar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPagoTarjeta.add(this.jButtonCerrarReporteDinamicoTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoPagoTarjeta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoPagoTarjeta= new JScrollPane(jPanelReporteDinamicoTipoPagoTarjeta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoPagoTarjeta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPagoTarjeta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPagoTarjeta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pagos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoPagoTarjeta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoPagoTarjeta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoPagoTarjeta);
		this.jInternalFrameReporteDinamicoTipoPagoTarjeta.getContentPane().add(this.jScrollPanelReporteDinamicoTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoPagoTarjeta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoPagoTarjeta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoPagoTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoPagoTarjeta.setName("jPanelImportacionTipoPagoTarjeta"); 
		
		this.jPanelImportacionTipoPagoTarjeta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPagoTarjeta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPagoTarjeta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoPagoTarjeta.setLayout(gridaBagLayoutImportacionTipoPagoTarjeta);
		
		
		this.jInternalFrameImportacionTipoPagoTarjeta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoPagoTarjeta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoPagoTarjeta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPagoTarjeta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoPagoTarjeta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPagoTarjeta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPagoTarjeta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoPagoTarjeta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPagoTarjeta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPagoTarjeta.setResizable(true);
	    this.jInternalFrameImportacionTipoPagoTarjeta.setClosable(true);
	    this.jInternalFrameImportacionTipoPagoTarjeta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoPagoTarjeta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPagoTarjeta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPagoTarjeta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoPagoTarjeta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPagoTarjeta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPagoTarjeta.setResizable(true);
	    this.jInternalFrameImportacionTipoPagoTarjeta.setClosable(true);
	    this.jInternalFrameImportacionTipoPagoTarjeta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoPagoTarjeta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPagoTarjeta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPagoTarjeta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pagos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoPagoTarjeta = new JLabelMe();

		this.jLabelArchivoImportacionTipoPagoTarjeta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoPagoTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPagoTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPagoTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPagoTarjeta.add(this.jLabelArchivoImportacionTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoPagoTarjeta = new JFileChooser();		
		this.jFileChooserImportacionTipoPagoTarjeta.setToolTipText("ESCOGER ARCHIVO"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoPagoTarjeta = new JButtonMe();
		this.jButtonAbrirImportacionTipoPagoTarjeta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoPagoTarjeta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoPagoTarjeta.setToolTipText("Generar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPagoTarjeta.add(this.jButtonAbrirImportacionTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoPagoTarjeta = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoPagoTarjeta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoPagoTarjeta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPagoTarjeta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPagoTarjeta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPagoTarjeta.add(this.jLabelPathArchivoImportacionTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoPagoTarjeta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoPagoTarjeta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPagoTarjeta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPagoTarjeta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPagoTarjeta.add(this.jTextFieldPathArchivoImportacionTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoPagoTarjeta = new JButtonMe();
		this.jButtonGenerarImportacionTipoPagoTarjeta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoPagoTarjeta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoPagoTarjeta.setToolTipText("Generar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPagoTarjeta.add(this.jButtonGenerarImportacionTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoPagoTarjeta = new JButtonMe();
		this.jButtonCerrarImportacionTipoPagoTarjeta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoPagoTarjeta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoPagoTarjeta.setToolTipText("Cancelar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPagoTarjeta.add(this.jButtonCerrarImportacionTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoPagoTarjeta = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoPagoTarjeta= new JScrollPane(jPanelImportacionTipoPagoTarjeta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
		this.gridBagConstraintsTipoPagoTarjeta.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoPagoTarjeta.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoPagoTarjeta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoPagoTarjeta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoPagoTarjeta);
		this.jInternalFrameImportacionTipoPagoTarjeta.getContentPane().add(this.jScrollPanelImportacionTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoPagoTarjeta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoPagoTarjeta = new JButtonMe();
			this.jButtonAbrirOrderByTipoPagoTarjeta.setText("Orden");
			this.jButtonAbrirOrderByTipoPagoTarjeta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPagoTarjeta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoPagoTarjeta";
			inputMap = this.jButtonAbrirOrderByTipoPagoTarjeta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoPagoTarjeta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoPagoTarjeta"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoPagoTarjeta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoPagoTarjeta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoPagoTarjeta.setName("jPanelOrderByTipoPagoTarjeta"); 
			
			this.jPanelOrderByTipoPagoTarjeta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPagoTarjeta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPagoTarjeta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoPagoTarjeta.setLayout(gridaBagLayoutOrderByTipoPagoTarjeta);
			
			
			this.jTableDatosTipoPagoTarjetaOrderBy = new JTableMe();        
			this.jTableDatosTipoPagoTarjetaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoPagoTarjetaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoPagoTarjetaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoPagoTarjetaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoPagoTarjetaOrderBy.setViewportView(this.jTableDatosTipoPagoTarjetaOrderBy);
			this.jTableDatosTipoPagoTarjetaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoPagoTarjetaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoPagoTarjeta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoPagoTarjeta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoPagoTarjeta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoPagoTarjeta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoPagoTarjeta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoPagoTarjeta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoPagoTarjeta.setTitle("Orden");
			this.jInternalFrameOrderByTipoPagoTarjeta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoPagoTarjeta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoPagoTarjeta.setResizable(true);
			this.jInternalFrameOrderByTipoPagoTarjeta.setClosable(true);
			this.jInternalFrameOrderByTipoPagoTarjeta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoPagoTarjeta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPagoTarjeta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPagoTarjeta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoPagoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pagos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoPagoTarjeta.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoPagoTarjeta.ipady =150;
				
			this.jPanelOrderByTipoPagoTarjeta.add(jScrollPanelDatosTipoPagoTarjetaOrderBy, this.gridBagConstraintsTipoPagoTarjeta);//this.jTableDatosTipoPagoTarjetaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoPagoTarjeta = new JButtonMe();
			this.jButtonCerrarOrderByTipoPagoTarjeta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoPagoTarjeta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoPagoTarjeta.setToolTipText("Cancelar"+" "+TipoPagoTarjetaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoPagoTarjeta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPagoTarjeta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoPagoTarjeta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoPagoTarjeta.add(this.jButtonCerrarOrderByTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoPagoTarjeta = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoPagoTarjeta= new JScrollPane(jPanelOrderByTipoPagoTarjeta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoPagoTarjeta = new GridBagConstraints();
			this.gridBagConstraintsTipoPagoTarjeta.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoPagoTarjeta.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPagoTarjeta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoPagoTarjeta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoPagoTarjeta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoPagoTarjeta);
			
			this.jInternalFrameOrderByTipoPagoTarjeta.getContentPane().add(this.jScrollPanelOrderByTipoPagoTarjeta, this.gridBagConstraintsTipoPagoTarjeta);			
		
		} else {
			this.jButtonAbrirOrderByTipoPagoTarjeta = new JButtonMe();
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
			&& this.tipopagotarjetaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoPagoTarjeta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoPagoTarjeta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoPagoTarjeta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoPagoTarjeta.getRowHeight();//TipoPagoTarjetaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoPagoTarjetaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPagoTarjeta.isSelected()) {
					iHeightTable=TipoPagoTarjetaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPagoTarjetaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPagoTarjetaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoPagoTarjetaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPagoTarjeta.isSelected()) {
					iHeightTable=TipoPagoTarjetaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPagoTarjetaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPagoTarjetaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoPagoTarjeta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPagoTarjeta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPagoTarjeta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoPagoTarjeta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPagoTarjeta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPagoTarjeta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoPagoTarjeta!=null && this.jInternalFrameOrderByTipoPagoTarjeta.getjTableDatosOrderBy()!=null) {
			//if(!this.tipopagotarjetaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoPagoTarjeta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoPagoTarjeta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoPagoTarjeta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoPagoTarjeta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoPagoTarjeta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoPagoTarjeta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoPagoTarjeta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoPagoTarjeta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPagoTarjeta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPagoTarjeta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipopagotarjetaLogic.getTipoPagoTarjetas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipopagotarjetas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoPagoTarjeta> TraerTipoPagoTarjetaBeans(List<TipoPagoTarjeta> tipopagotarjetas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoPagoTarjeta tipopagotarjeta:tipopagotarjetas) {
					
				if(!(TipoPagoTarjetaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoPagoTarjetaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipopagotarjeta.setsDetalleGeneralEntityReporte(TipoPagoTarjetaConstantesFunciones.getTipoPagoTarjetaDescripcion(tipopagotarjeta));
										
						
					
					

					if(tipopagotarjeta.getFormaPagoPuntoVentas()!=null && Funciones.existeClass(classes,FormaPagoPuntoVenta.class)) {
						try{tipopagotarjeta.setformapagopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(FormaPagoPuntoVentaJInternalFrame.TraerFormaPagoPuntoVentaBeans(tipopagotarjeta.getFormaPagoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipopagotarjeta.setsDetalleGeneralEntityReporte(tipopagotarjeta.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipopagotarjetabeans.add(tipopagotarjetabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipopagotarjetas;
    }
	//PARA REPORTES FIN
}
