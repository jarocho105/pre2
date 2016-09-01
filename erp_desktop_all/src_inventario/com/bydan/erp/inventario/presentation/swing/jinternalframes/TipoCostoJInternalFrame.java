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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;



import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.TipoCostoConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class TipoCostoJInternalFrame extends TipoCostoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCosto;
	
	protected JMenuBar jmenuBarTipoCosto;
	
	protected JMenu jmenuTipoCosto;
	protected JMenu jmenuDatosTipoCosto;
	protected JMenu jmenuArchivoTipoCosto;
	protected JMenu jmenuAccionesTipoCosto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCosto;	
	protected GridBagConstraints gridBagConstraintsTipoCosto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCostoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCosto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCosto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCosto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCostoSessionBean tipocostoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCosto> tipocostos;		
	public List<TipoCosto> tipocostosEliminados;	
	public List<TipoCosto> tipocostosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCosto;		
	protected JButton jButtonAbrirOrderByTipoCosto;
	
	
	//protected JPanel jPanelOrderByTipoCosto;
	//public JScrollPane jScrollPanelOrderByTipoCosto;	
	//protected JButton jButtonCerrarOrderByTipoCosto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCostoLogic tipocostoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCosto;
	public JScrollPane jScrollPanelDatosEdicionTipoCosto;
	public JScrollPane jScrollPanelDatosGeneralTipoCosto;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCostoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCosto;
	//public JScrollPane jScrollPanelImportacionTipoCosto;
	
	
	
	protected JPanel jPanelAccionesTipoCosto;
	
    protected JPanel jPanelPaginacionTipoCosto;
    protected JPanel jPanelParametrosReportesTipoCosto;
	protected JPanel jPanelParametrosReportesAccionesTipoCosto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCosto;
	protected JPanel jPanelParametrosAuxiliar2TipoCosto;
	protected JPanel jPanelParametrosAuxiliar3TipoCosto;
	protected JPanel jPanelParametrosAuxiliar4TipoCosto;
	//protected JPanel jPanelParametrosAuxiliar5TipoCosto;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCosto;
	//protected JPanel jPanelImportacionTipoCosto;
	
	
	public JTable jTableDatosTipoCosto;
	
	
	
	//public JTable jTableDatosTipoCostoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCosto;
	protected JButton jButtonDuplicarTipoCosto;
	protected JButton jButtonCopiarTipoCosto;
	protected JButton jButtonVerFormTipoCosto;
	protected JButton jButtonNuevoRelacionesTipoCosto;
	protected JButton jButtonModificarTipoCosto;
	
    protected JButton jButtonGuardarCambiosTablaTipoCosto;
	protected JButton jButtonCerrarTipoCosto;
	
	
	protected JButton jButtonRecargarInformacionTipoCosto;
	protected JButton jButtonProcesarInformacionTipoCosto;
	
	
	protected JButton jButtonAnterioresTipoCosto;
	protected JButton jButtonSiguientesTipoCosto;
	protected JButton jButtonNuevoGuardarCambiosTipoCosto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCosto;
	//protected JButton jButtonCerrarReporteDinamicoTipoCosto;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCosto;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCosto;
	//protected JButton jButtonGenerarImportacionTipoCosto;
	//protected JButton jButtonCerrarImportacionTipoCosto;
	//protected JFileChooser jFileChooserImportacionTipoCosto;
	//protected File fileImportacionTipoCosto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCosto;
	protected JButton jButtonDuplicarToolBarTipoCosto;
	protected JButton jButtonNuevoRelacionesToolBarTipoCosto;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCosto;
	protected JButton jButtonCopiarToolBarTipoCosto;
	protected JButton jButtonVerFormToolBarTipoCosto;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCosto;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCosto;
	protected JButton jButtonCerrarToolBarTipoCosto;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCosto;
	protected JButton jButtonProcesarInformacionToolBarTipoCosto;
	protected JButton jButtonAnterioresToolBarTipoCosto;
	protected JButton jButtonSiguientesToolBarTipoCosto;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCosto;
	protected JButton jButtonAbrirOrderByToolBarTipoCosto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCosto;
	protected JMenuItem jMenuItemDuplicarTipoCosto;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCosto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCosto;
	protected JMenuItem jMenuItemCopiarTipoCosto;
	protected JMenuItem jMenuItemVerFormTipoCosto;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCosto;
	protected JMenuItem jMenuItemCerrarTipoCosto;
	protected JMenuItem jMenuItemDetalleCerrarTipoCosto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCosto;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCosto;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCosto;
	protected JMenuItem jMenuItemProcesarInformacionTipoCosto;
	protected JMenuItem jMenuItemAnterioresTipoCosto;
	protected JMenuItem jMenuItemSiguientesTipoCosto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCosto;
	protected JMenuItem jMenuItemAbrirOrderByTipoCosto;
	protected JMenuItem jMenuItemMostrarOcultarTipoCosto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCosto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCosto;
	protected JCheckBox jCheckBoxSeleccionadosTipoCosto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCosto;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCosto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCosto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCosto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCosto;
	protected JTextField jTextFieldValorCampoGeneralTipoCosto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCosto;
	//public JList<Reporte> jListColumnasSelectReporteTipoCosto;
	//public JScrollPane jScrollColumnasSelectReporteTipoCosto;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCosto;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCosto;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCosto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCosto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCosto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCosto;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCosto;
	
		
	//public JLabel jLabelArchivoImportacionTipoCosto;	
	//public JLabel jLabelPathArchivoImportacionTipoCosto;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCosto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCosto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCosto;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCosto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCosto;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCosto;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCosto;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCosto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCosto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCosto;	
	
	
	
	
	
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
	public TipoCostoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCostoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCosto)	{
		this.jButtonRecargarInformacionTipoCosto = jButtonRecargarInformacionTipoCosto;
	}
	
	public JButton getjButtonProcesarInformacionTipoCosto() {
		return this.jButtonProcesarInformacionTipoCosto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCosto)	{
		this.jButtonProcesarInformacionTipoCosto = jButtonProcesarInformacionTipoCosto;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCosto() {
		return this.jButtonRecargarInformacionTipoCosto;
	}
	
	
	public List<TipoCosto> gettipocostos() {
		return this.tipocostos;
	}

	public void settipocostos(List<TipoCosto> tipocostos) {
		this.tipocostos = tipocostos;
	}
	
	public List<TipoCosto> gettipocostosAux() {
		return this.tipocostosAux;
	}

	public void settipocostosAux(List<TipoCosto> tipocostosAux) {
		this.tipocostosAux = tipocostosAux;
	}
	
	public List<TipoCosto> gettipocostosEliminados() {
		return this.tipocostosEliminados;
	}

	public void setTipoCostosEliminados(List<TipoCosto> tipocostosEliminados) {
		this.tipocostosEliminados = tipocostosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCosto() {
		return jComboBoxTiposSeleccionarTipoCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCosto(
			JComboBox jComboBoxTiposSeleccionarTipoCosto) {
		this.jComboBoxTiposSeleccionarTipoCosto = jComboBoxTiposSeleccionarTipoCosto;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCosto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCosto() {
		return jTextFieldValorCampoGeneralTipoCosto;
	}

	public void setjTextFieldValorCampoGeneralTipoCosto(
			JTextField jTextFieldValorCampoGeneralTipoCosto) {
		this.jTextFieldValorCampoGeneralTipoCosto = jTextFieldValorCampoGeneralTipoCosto;
	}

	public void setBorderResaltarValorCampoGeneralTipoCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCosto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCosto() {
		return this.jCheckBoxSeleccionarTodosTipoCosto;
	}

	public void setjCheckBoxSeleccionarTodosTipoCosto(
			JCheckBox jCheckBoxSeleccionarTodosTipoCosto) {
		this.jCheckBoxSeleccionarTodosTipoCosto = jCheckBoxSeleccionarTodosTipoCosto;
	}

	public void setBorderResaltarSeleccionarTodosTipoCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCosto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCosto() {
		return this.jCheckBoxSeleccionadosTipoCosto;
	}

	public void setjCheckBoxSeleccionadosTipoCosto(
			JCheckBox jCheckBoxSeleccionadosTipoCosto) {
		this.jCheckBoxSeleccionadosTipoCosto = jCheckBoxSeleccionadosTipoCosto;
	}
	
	public void setBorderResaltarSeleccionadosTipoCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCosto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCosto() {
		return this.jComboBoxTiposArchivosReportesTipoCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCosto(
			JComboBox jComboBoxTiposArchivosReportesTipoCosto) {
		this.jComboBoxTiposArchivosReportesTipoCosto = jComboBoxTiposArchivosReportesTipoCosto;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCosto() {
		return this.jComboBoxTiposReportesTipoCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCosto(
			JComboBox jComboBoxTiposReportesTipoCosto) {
		this.jComboBoxTiposReportesTipoCosto = jComboBoxTiposReportesTipoCosto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCosto() {
	//	return jComboBoxTiposReportesDinamicoTipoCosto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCosto(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCosto) {
	//	this.jComboBoxTiposReportesDinamicoTipoCosto = jComboBoxTiposReportesDinamicoTipoCosto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCosto() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCosto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCosto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCosto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCosto = jComboBoxTiposArchivosReportesDinamicoTipoCosto;
	//}
	
	public void setBorderResaltarTiposReportesTipoCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCosto() {
		return this.jComboBoxTiposGraficosReportesTipoCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCosto(
			JComboBox jComboBoxTiposGraficosReportesTipoCosto) {
		this.jComboBoxTiposGraficosReportesTipoCosto = jComboBoxTiposGraficosReportesTipoCosto;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCosto() {
		return this.jComboBoxTiposPaginacionTipoCosto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCosto(
			JComboBox jComboBoxTiposPaginacionTipoCosto) {
		this.jComboBoxTiposPaginacionTipoCosto = jComboBoxTiposPaginacionTipoCosto;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCosto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCosto() {
		return this.jComboBoxTiposRelacionesTipoCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCosto() {
		return this.jComboBoxTiposAccionesTipoCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCosto(
			JComboBox jComboBoxTiposRelacionesTipoCosto) {
		this.jComboBoxTiposRelacionesTipoCosto = jComboBoxTiposRelacionesTipoCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCosto(
			JComboBox jComboBoxTiposAccionesTipoCosto) {
		this.jComboBoxTiposAccionesTipoCosto = jComboBoxTiposAccionesTipoCosto;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCosto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCosto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCosto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCosto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCosto() {
	//	return jCheckBoxConGraficoDinamicoTipoCosto;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCosto(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCosto) {
	//	this.jCheckBoxConGraficoDinamicoTipoCosto = jCheckBoxConGraficoDinamicoTipoCosto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCosto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCosto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCosto .setBorder(borderResaltar);		
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
		this.tipocostoSessionBean=new TipoCostoSessionBean();
		
		this.tipocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocostoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCostoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCostoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCostoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Costo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCostoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCosto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCosto,this.jTtoolBarTipoCosto,
							"nuevo","nuevo","Nuevo"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCosto,this.jTtoolBarTipoCosto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCosto,this.jTtoolBarTipoCosto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCosto,this.jTtoolBarTipoCosto,
							"duplicar","duplicar","Duplicar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCosto,this.jTtoolBarTipoCosto,
							"copiar","copiar","Copiar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCosto,this.jTtoolBarTipoCosto,
							"ver_form","ver_form","Ver"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCosto,this.jTtoolBarTipoCosto,
							"recargar","recargar","Recargar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCosto,this.jTtoolBarTipoCosto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCosto,this.jTtoolBarTipoCosto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCosto,this.jTtoolBarTipoCosto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCosto,this.jTtoolBarTipoCosto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCosto,this.jTtoolBarTipoCosto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCosto,this.jTtoolBarTipoCosto,
							"cerrar","cerrar","Salir"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCosto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCosto;
			
				this.jButtonProcesarInformacionToolBarTipoCosto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCosto;
				
		//protected JButton jButtonModificarToolBarTipoCosto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCosto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCosto=new JMenuMe("General");
		this.jmenuArchivoTipoCosto=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCosto=new JMenuMe("Acciones");
		this.jmenuDatosTipoCosto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCosto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCosto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCosto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCosto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCosto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCosto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCosto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCosto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCosto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCosto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCosto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCosto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCosto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCosto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCosto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCosto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCosto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCosto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCosto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCosto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCosto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCosto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCosto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCosto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCosto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCosto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCosto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCosto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCosto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCosto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCosto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCosto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCosto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCosto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCosto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCosto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCosto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCosto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCosto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCosto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCosto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCosto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCosto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCosto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCosto.add(this.jMenuItemCerrarTipoCosto);
			
			this.jmenuAccionesTipoCosto.add(this.jMenuItemNuevoTipoCosto);
			this.jmenuAccionesTipoCosto.add(this.jMenuItemNuevoGuardarCambiosTipoCosto);
			this.jmenuAccionesTipoCosto.add(this.jMenuItemNuevoRelacionesTipoCosto);
			this.jmenuAccionesTipoCosto.add(this.jMenuItemGuardarCambiosTablaTipoCosto);		
			this.jmenuAccionesTipoCosto.add(this.jMenuItemDuplicarTipoCosto);		
			this.jmenuAccionesTipoCosto.add(this.jMenuItemCopiarTipoCosto);		
			this.jmenuAccionesTipoCosto.add(this.jMenuItemVerFormTipoCosto);		
			
			this.jmenuDatosTipoCosto.add(this.jMenuItemRecargarInformacionTipoCosto);				
			this.jmenuDatosTipoCosto.add(this.jMenuItemAnterioresTipoCosto);				
			this.jmenuDatosTipoCosto.add(this.jMenuItemSiguientesTipoCosto);				
			this.jmenuDatosTipoCosto.add(this.jMenuItemAbrirOrderByTipoCosto);				
			this.jmenuDatosTipoCosto.add(this.jMenuItemMostrarOcultarTipoCosto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCosto.add(this.jMenuItemGuardarCambiosTipoCosto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCosto.add(this.jmenuArchivoTipoCosto);		
			this.jmenuBarTipoCosto.add(this.jmenuAccionesTipoCosto);		
			this.jmenuBarTipoCosto.add(this.jmenuDatosTipoCosto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCosto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCosto() {
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
			//this.jInternalFrameDetalleTipoCosto = new TipoCostoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Costo DATOS");
			this.jInternalFrameDetalleFormTipoCosto = new TipoCostoDetalleFormJInternalFrame(jDesktopPane,this.tipocostoSessionBean.getConGuardarRelaciones(),this.tipocostoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCosto = null;//new TipoCostoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCosto= new GridBagLayout();
		
		
		this.jTableDatosTipoCosto = new JTableMe();      
		
		String sToolTipTipoCosto="";
		sToolTipTipoCosto=TipoCostoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCosto+="(Inventario.TipoCosto)";
		}
		
		if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCosto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCosto.setToolTipText(sToolTipTipoCosto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCosto);
		this.jTableDatosTipoCosto.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCosto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCosto.setRowSelectionAllowed(true);
		this.jTableDatosTipoCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCosto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCosto = new JButtonMe();
		this.jButtonDuplicarTipoCosto = new JButtonMe();
		this.jButtonCopiarTipoCosto = new JButtonMe();
		this.jButtonVerFormTipoCosto = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCosto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCosto = new JButtonMe();
		this.jButtonCerrarTipoCosto = new JButtonMe();
		
		this.jScrollPanelDatosTipoCosto = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCosto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Costo";
		
		if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCosto.setToolTipText("Acciones");
        this.jPanelAccionesTipoCosto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCosto=new ReporteDinamicoJInternalFrame(TipoCostoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCosto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCosto=new ImportacionJInternalFrame(TipoCostoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCosto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCosto = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCosto.setText("Orden");
		this.jButtonAbrirOrderByTipoCosto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCosto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCosto,false,this);
			
			//this.cargarOrderByTipoCosto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCosto,true,this);
			
			//this.cargarOrderByTipoCosto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCosto.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCosto.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoCosto.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoCosto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCosto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCosto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCosto.setText("Nuevo");
		this.jButtonDuplicarTipoCosto.setText("Duplicar");
		this.jButtonCopiarTipoCosto.setText("Copiar");
		this.jButtonVerFormTipoCosto.setText("Ver");
		this.jButtonNuevoRelacionesTipoCosto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCosto.setText("Guardar");
		this.jButtonCerrarTipoCosto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCosto,"nuevo_button","Nuevo",this.tipocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCosto,"duplicar_button","Duplicar",this.tipocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCosto,"copiar_button","Copiar",this.tipocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCosto,"ver_form","Ver",this.tipocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCosto,"nuevorelaciones_button","Nuevo Rel",this.tipocostoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCosto,"guardarcambiostabla_button","Guardar",this.tipocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCosto,"cerrar_button","Salir",this.tipocostoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCosto.setToolTipText("Nuevo"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCosto.setToolTipText("Duplicar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCosto.setToolTipText("Copiar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCosto.setToolTipText("Ver"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCosto.setToolTipText("Nuevo Rel"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCosto.setToolTipText("Guardar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCosto.setToolTipText("Salir"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCosto";
		inputMap = this.jButtonNuevoTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCosto"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCosto";
		inputMap = this.jButtonDuplicarTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCosto"));
		
		//COPIAR
		sMapKey = "CopiarTipoCosto";
		inputMap = this.jButtonCopiarTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCosto"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCosto";
		inputMap = this.jButtonVerFormTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCosto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCosto";
		inputMap = this.jButtonNuevoRelacionesTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCosto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCosto";
		inputMap = this.jButtonModificarTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCosto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCosto";
		inputMap = this.jButtonCerrarTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCosto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCosto";
		inputMap = this.jButtonGuardarCambiosTablaTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCosto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCosto.setName("jPanelParametrosReportesTipoCosto"); 
		
		this.jPanelParametrosReportesAccionesTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCosto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCosto.setName("jPanelParametrosReportesAccionesTipoCosto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCosto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCosto = new JButtonMe();
		this.jButtonRecargarInformacionTipoCosto.setText("Recargar");
		this.jButtonRecargarInformacionTipoCosto.setToolTipText("Recargar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCosto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCosto = new JButtonMe();
		this.jButtonProcesarInformacionTipoCosto.setText("Procesar");
		this.jButtonProcesarInformacionTipoCosto.setToolTipText("Procesar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCosto.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCosto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCosto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCosto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCosto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCosto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCosto.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCosto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCosto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCosto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCosto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCosto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCosto.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCosto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCosto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCosto.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCosto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCosto.setText("Accion");
		this.jComboBoxTiposAccionesTipoCosto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCosto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCosto.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCosto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCosto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCosto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCosto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCosto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCosto = new JLabelMe();
		
		this.jLabelAccionesTipoCosto.setText("Acciones");		
		this.jLabelAccionesTipoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCosto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCosto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCosto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCosto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCosto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCosto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCosto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCosto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCosto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCosto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCosto.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCosto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCosto = new JButtonMe();
		//this.jButtonAnterioresTipoCosto.setText("<<");
        this.jButtonAnterioresTipoCosto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCosto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCosto = new JButtonMe();
		//this.jButtonSiguientesTipoCosto.setText(">>");
        this.jButtonSiguientesTipoCosto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCosto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCosto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCosto.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCosto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCosto,"nuevoguardarcambios_button","Nue",this.tipocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCosto";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCosto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCosto";
		inputMap = this.jButtonRecargarInformacionTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCosto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCosto";
		inputMap = this.jButtonSiguientesTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCosto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCosto";
		inputMap = this.jButtonAnterioresTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCosto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCosto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCosto.setMinimumSize(new Dimension(this.getWidth(),TipoCostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCostoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCosto.setMaximumSize(new Dimension(this.getWidth(),TipoCostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCostoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCosto.setPreferredSize(new Dimension(this.getWidth(),TipoCostoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCostoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCosto = new GridBagLayout();

			this.jPanelPaginacionTipoCosto.setLayout(gridaBagLayoutPaginacionTipoCosto);						
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosto.gridy = 0;
			this.gridBagConstraintsTipoCosto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCosto.add(this.jButtonAnterioresTipoCosto, this.gridBagConstraintsTipoCosto);
					
						
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCosto.gridy = 0;
			
			this.jPanelPaginacionTipoCosto.add(this.jButtonNuevoGuardarCambiosTipoCosto, this.gridBagConstraintsTipoCosto);
						
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCosto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCosto.gridy = 0;
			this.jPanelPaginacionTipoCosto.add(this.jButtonSiguientesTipoCosto, this.gridBagConstraintsTipoCosto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosto.gridy = 1;
			this.gridBagConstraintsTipoCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCosto.add(this.jButtonNuevoTipoCosto, this.gridBagConstraintsTipoCosto);
						
			
			
			if(!this.tipocostoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCosto = new GridBagConstraints();
				this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCosto.gridy = 1;
				this.gridBagConstraintsTipoCosto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCosto.add(this.jButtonGuardarCambiosTablaTipoCosto, this.gridBagConstraintsTipoCosto);
			}
			
			
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosto.gridy = 1;
			this.gridBagConstraintsTipoCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCosto.add(this.jButtonDuplicarTipoCosto, this.gridBagConstraintsTipoCosto);
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosto.gridy = 1;
			this.gridBagConstraintsTipoCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCosto.add(this.jButtonCopiarTipoCosto, this.gridBagConstraintsTipoCosto);
		
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosto.gridy = 1;
			this.gridBagConstraintsTipoCosto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCosto.add(this.jButtonVerFormTipoCosto, this.gridBagConstraintsTipoCosto);
		
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosto.gridy = 1;
			this.gridBagConstraintsTipoCosto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCosto.add(this.jButtonCerrarTipoCosto, this.gridBagConstraintsTipoCosto);
		
		
		
		this.jButtonRecargarInformacionTipoCosto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCosto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCosto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCosto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCosto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCosto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCosto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCosto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCosto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCosto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCosto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCosto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCosto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCosto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCosto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCosto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCosto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCosto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCosto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCosto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCosto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCosto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCosto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCosto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCosto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCosto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCosto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCosto.setLayout(gridaBagParametrosReportesTipoCosto);
			this.jPanelParametrosReportesAccionesTipoCosto.setLayout(gridaBagParametrosReportesAccionesTipoCosto);
			
			
			this.jPanelParametrosAuxiliar1TipoCosto.setLayout(gridaBagParametrosAuxiliar1TipoCosto);
			this.jPanelParametrosAuxiliar2TipoCosto.setLayout(gridaBagParametrosAuxiliar2TipoCosto);
			this.jPanelParametrosAuxiliar3TipoCosto.setLayout(gridaBagParametrosAuxiliar3TipoCosto);
			this.jPanelParametrosAuxiliar4TipoCosto.setLayout(gridaBagParametrosAuxiliar4TipoCosto);
			//this.jPanelParametrosAuxiliar5TipoCosto.setLayout(gridaBagParametrosAuxiliar2TipoCosto);			
			
			
			
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCosto.add(this.jButtonRecargarInformacionTipoCosto, this.gridBagConstraintsTipoCosto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCosto.add(this.jComboBoxTiposPaginacionTipoCosto, this.gridBagConstraintsTipoCosto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCosto.add(this.jCheckBoxConAltoMaximoTablaTipoCosto, this.gridBagConstraintsTipoCosto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCosto.add(this.jComboBoxTiposArchivosReportesTipoCosto, this.gridBagConstraintsTipoCosto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCosto.add(this.jPanelParametrosAuxiliar1TipoCosto, this.gridBagConstraintsTipoCosto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCosto.add(this.jComboBoxTiposReportesTipoCosto, this.gridBagConstraintsTipoCosto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCosto.add(this.jPanelParametrosAuxiliar4TipoCosto, this.gridBagConstraintsTipoCosto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCosto.add(this.jComboBoxTiposReportesTipoCosto, this.gridBagConstraintsTipoCosto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCosto.add(this.jCheckBoxGenerarReporteTipoCosto, this.gridBagConstraintsTipoCosto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCosto.add(this.jPanelParametrosAuxiliar2TipoCosto, this.gridBagConstraintsTipoCosto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCosto.add(this.jLabelAccionesTipoCosto, this.gridBagConstraintsTipoCosto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCosto = new GridBagConstraints();
				this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCosto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCosto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCosto.add(this.jButtonAbrirOrderByTipoCosto, this.gridBagConstraintsTipoCosto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCosto.add(this.jComboBoxTiposSeleccionarTipoCosto, this.gridBagConstraintsTipoCosto);			
			
			
			/*
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCosto.add(this.jCheckBoxSeleccionarTodosTipoCosto, this.gridBagConstraintsTipoCosto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCosto.add(this.jCheckBoxSeleccionarTodosTipoCosto, this.gridBagConstraintsTipoCosto);															
				
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCosto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCosto.add(this.jCheckBoxSeleccionadosTipoCosto, this.gridBagConstraintsTipoCosto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCosto.add(this.jPanelParametrosAuxiliar3TipoCosto, this.gridBagConstraintsTipoCosto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCosto.add(this.jComboBoxTiposRelacionesTipoCosto, this.gridBagConstraintsTipoCosto);
				
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCosto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCosto.add(this.jComboBoxTiposAccionesTipoCosto, this.gridBagConstraintsTipoCosto);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCosto = new GridBagLayout();

			this.jScrollPanelDatosTipoCosto.setLayout(gridaBagLayoutDatosTipoCosto);
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosto.gridy = 0;
			this.gridBagConstraintsTipoCosto.gridx = 0;
			
			this.jScrollPanelDatosTipoCosto.add(this.jTableDatosTipoCosto, this.gridBagConstraintsTipoCosto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCosto.setViewportView(this.jTableDatosTipoCosto);
		this.jTableDatosTipoCosto.setFillsViewportHeight(true);
		this.jTableDatosTipoCosto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCosto= new GridBagLayout();
		this.jPanelAccionesTipoCosto.setLayout(gridaBagLayoutAccionesTipoCosto);
		
		
		/*	
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosto.gridy = 0;
		this.gridBagConstraintsTipoCosto.gridx = 0;
			
		this.jPanelAccionesTipoCosto.add(this.jButtonNuevoTipoCosto, this.gridBagConstraintsTipoCosto);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCosto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCosto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocostoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();						
			this.gridBagConstraintsTipoCosto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCosto.gridx = 0;		
			//this.gridBagConstraintsTipoCosto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCosto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCosto, this.gridBagConstraintsTipoCosto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCosto.gridx = 0;		
		//this.gridBagConstraintsTipoCosto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCosto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCosto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCosto, this.gridBagConstraintsTipoCosto);								
		
		
		/*
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCosto, this.gridBagConstraintsTipoCosto);
		*/		
		
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCosto.gridx =0;
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCosto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCosto, this.gridBagConstraintsTipoCosto);
				
		
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCosto, this.gridBagConstraintsTipoCosto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoCostoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCosto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCosto = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCosto.setLayout(gridaBagLayoutBusquedasParametrosTipoCosto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCosto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCosto, this.gridBagConstraintsTipoCosto);
			
			
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCosto, this.gridBagConstraintsTipoCosto);
		
			
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCosto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCosto, this.gridBagConstraintsTipoCosto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCosto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCosto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCosto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCosto.setName("jPanelReporteDinamicoTipoCosto"); 
		
		this.jPanelReporteDinamicoTipoCosto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCosto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCosto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCosto.setLayout(gridaBagLayoutReporteDinamicoTipoCosto);
		
		
		this.jInternalFrameReporteDinamicoTipoCosto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCosto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCosto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCosto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCosto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCosto.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCosto.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCosto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCosto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCosto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCosto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCosto = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCosto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCosto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCosto.add(this.jLabelColumnasSelectReporteTipoCosto, this.gridBagConstraintsTipoCosto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCosto = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCosto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCosto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCosto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCosto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCosto=new JScrollPane(this.jListColumnasSelectReporteTipoCosto);
			
			this.jScrollColumnasSelectReporteTipoCosto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCosto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCosto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCosto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCosto.add(this.jListColumnasSelectReporteTipoCosto, this.gridBagConstraintsTipoCosto);
		this.jPanelReporteDinamicoTipoCosto.add(this.jScrollColumnasSelectReporteTipoCosto, this.gridBagConstraintsTipoCosto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCosto = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCosto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCosto = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCosto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCosto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCosto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCosto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCosto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCosto=new JScrollPane(this.jListRelacionesSelectReporteTipoCosto);
			
			this.jScrollRelacionesSelectReporteTipoCosto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCosto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCosto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoCosto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCosto = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCosto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCosto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCosto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCosto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCosto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCosto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCosto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCosto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCosto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCosto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCosto.add(this.jLabelGenerarExcelReporteDinamicoTipoCosto, this.gridBagConstraintsTipoCosto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCosto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCosto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCosto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCosto.setToolTipText("Generar EXCEL"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		//this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCosto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCosto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCosto.add(this.jButtonGenerarExcelReporteDinamicoTipoCosto, this.gridBagConstraintsTipoCosto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCosto.add(this.jComboBoxTiposReportesDinamicoTipoCosto, this.gridBagConstraintsTipoCosto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCosto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCosto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCosto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCosto.add(this.jLabelTiposArchivoReporteDinamicoTipoCosto, this.gridBagConstraintsTipoCosto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCosto.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCosto, this.gridBagConstraintsTipoCosto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCosto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCosto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCosto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCosto.setToolTipText("Generar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCosto.add(this.jButtonGenerarReporteDinamicoTipoCosto, this.gridBagConstraintsTipoCosto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCosto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCosto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCosto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCosto.setToolTipText("Cancelar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCosto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCosto.add(this.jButtonCerrarReporteDinamicoTipoCosto, this.gridBagConstraintsTipoCosto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCosto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCosto= new JScrollPane(jPanelReporteDinamicoTipoCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCosto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCosto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCosto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCosto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCosto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCosto);
		this.jInternalFrameReporteDinamicoTipoCosto.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCosto, this.gridBagConstraintsTipoCosto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCosto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCosto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCosto.setName("jPanelImportacionTipoCosto"); 
		
		this.jPanelImportacionTipoCosto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCosto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCosto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCosto.setLayout(gridaBagLayoutImportacionTipoCosto);
		
		
		this.jInternalFrameImportacionTipoCosto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCosto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCosto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCosto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCosto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCosto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCosto.setResizable(true);
	    this.jInternalFrameImportacionTipoCosto.setClosable(true);
	    this.jInternalFrameImportacionTipoCosto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCosto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCosto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCosto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCosto.setResizable(true);
	    this.jInternalFrameImportacionTipoCosto.setClosable(true);
	    this.jInternalFrameImportacionTipoCosto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCosto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCosto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCosto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCosto = new JLabelMe();

		this.jLabelArchivoImportacionTipoCosto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosto.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCosto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCosto.add(this.jLabelArchivoImportacionTipoCosto, this.gridBagConstraintsTipoCosto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCosto = new JFileChooser();		
		this.jFileChooserImportacionTipoCosto.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCosto = new JButtonMe();
		this.jButtonAbrirImportacionTipoCosto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCosto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCosto.setToolTipText("Generar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCosto.add(this.jButtonAbrirImportacionTipoCosto, this.gridBagConstraintsTipoCosto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCosto = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCosto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCosto.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCosto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCosto.add(this.jLabelPathArchivoImportacionTipoCosto, this.gridBagConstraintsTipoCosto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCosto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCosto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCosto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCosto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCosto.add(this.jTextFieldPathArchivoImportacionTipoCosto, this.gridBagConstraintsTipoCosto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCosto = new JButtonMe();
		this.jButtonGenerarImportacionTipoCosto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCosto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCosto.setToolTipText("Generar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCosto.add(this.jButtonGenerarImportacionTipoCosto, this.gridBagConstraintsTipoCosto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCosto = new JButtonMe();
		this.jButtonCerrarImportacionTipoCosto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCosto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCosto.setToolTipText("Cancelar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCosto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCosto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCosto.add(this.jButtonCerrarImportacionTipoCosto, this.gridBagConstraintsTipoCosto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCosto = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCosto= new JScrollPane(jPanelImportacionTipoCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCosto = new GridBagConstraints();
		this.gridBagConstraintsTipoCosto.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCosto.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCosto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCosto);
		this.jInternalFrameImportacionTipoCosto.getContentPane().add(this.jScrollPanelImportacionTipoCosto, this.gridBagConstraintsTipoCosto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCosto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCosto = new JButtonMe();
			this.jButtonAbrirOrderByTipoCosto.setText("Orden");
			this.jButtonAbrirOrderByTipoCosto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCosto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCosto";
			inputMap = this.jButtonAbrirOrderByTipoCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCosto"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCosto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCosto.setName("jPanelOrderByTipoCosto"); 
			
			this.jPanelOrderByTipoCosto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCosto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCosto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCosto.setLayout(gridaBagLayoutOrderByTipoCosto);
			
			
			this.jTableDatosTipoCostoOrderBy = new JTableMe();        
			this.jTableDatosTipoCostoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCostoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCostoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCostoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCostoOrderBy.setViewportView(this.jTableDatosTipoCostoOrderBy);
			this.jTableDatosTipoCostoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCostoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCosto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCosto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCosto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCosto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCosto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCosto.setTitle("Orden");
			this.jInternalFrameOrderByTipoCosto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCosto.setResizable(true);
			this.jInternalFrameOrderByTipoCosto.setClosable(true);
			this.jInternalFrameOrderByTipoCosto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCosto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCosto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCosto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCosto.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCosto.ipady =150;
				
			this.jPanelOrderByTipoCosto.add(jScrollPanelDatosTipoCostoOrderBy, this.gridBagConstraintsTipoCosto);//this.jTableDatosTipoCostoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCosto = new JButtonMe();
			this.jButtonCerrarOrderByTipoCosto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCosto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCosto.setToolTipText("Cancelar"+" "+TipoCostoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCosto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCosto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCosto.add(this.jButtonCerrarOrderByTipoCosto, this.gridBagConstraintsTipoCosto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCosto = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCosto= new JScrollPane(jPanelOrderByTipoCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCosto = new GridBagConstraints();
			this.gridBagConstraintsTipoCosto.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCosto.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCosto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCosto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCosto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCosto);
			
			this.jInternalFrameOrderByTipoCosto.getContentPane().add(this.jScrollPanelOrderByTipoCosto, this.gridBagConstraintsTipoCosto);			
		
		} else {
			this.jButtonAbrirOrderByTipoCosto = new JButtonMe();
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
			&& this.tipocostoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCosto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCosto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCosto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCosto.getRowHeight();//TipoCostoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCosto.isSelected()) {
					iHeightTable=TipoCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCosto.isSelected()) {
					iHeightTable=TipoCostoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCostoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCosto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCosto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCosto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCosto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCosto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCosto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCosto!=null && this.jInternalFrameOrderByTipoCosto.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocostoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCosto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCosto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCosto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCosto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCosto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCosto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCosto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCosto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCosto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCosto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocostoLogic.getTipoCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocostos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCosto> TraerTipoCostoBeans(List<TipoCosto> tipocostos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCosto tipocosto:tipocostos) {
					
				if(!(TipoCostoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCostoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocosto.setsDetalleGeneralEntityReporte(TipoCostoConstantesFunciones.getTipoCostoDescripcion(tipocosto));
										
						
					
						
					
				} else  {
							
					//tipocosto.setsDetalleGeneralEntityReporte(tipocosto.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocostobeans.add(tipocostobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocostos;
    }
	//PARA REPORTES FIN
}
