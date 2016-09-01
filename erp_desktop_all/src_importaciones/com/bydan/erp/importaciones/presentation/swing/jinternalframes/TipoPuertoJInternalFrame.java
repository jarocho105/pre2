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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.TipoPuertoConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class TipoPuertoJInternalFrame extends TipoPuertoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoPuerto;
	
	protected JMenuBar jmenuBarTipoPuerto;
	
	protected JMenu jmenuTipoPuerto;
	protected JMenu jmenuDatosTipoPuerto;
	protected JMenu jmenuArchivoTipoPuerto;
	protected JMenu jmenuAccionesTipoPuerto;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPuerto;	
	protected GridBagConstraints gridBagConstraintsTipoPuerto;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoPuertoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoPuerto;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoPuerto;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoPuerto;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoPuertoSessionBean tipopuertoSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoPuerto> tipopuertos;		
	public List<TipoPuerto> tipopuertosEliminados;	
	public List<TipoPuerto> tipopuertosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoPuerto;		
	protected JButton jButtonAbrirOrderByTipoPuerto;
	
	
	//protected JPanel jPanelOrderByTipoPuerto;
	//public JScrollPane jScrollPanelOrderByTipoPuerto;	
	//protected JButton jButtonCerrarOrderByTipoPuerto;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoPuertoLogic tipopuertoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoPuerto;
	public JScrollPane jScrollPanelDatosEdicionTipoPuerto;
	public JScrollPane jScrollPanelDatosGeneralTipoPuerto;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoPuertoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoPuerto;
	//public JScrollPane jScrollPanelImportacionTipoPuerto;
	
	
	
	protected JPanel jPanelAccionesTipoPuerto;
	
    protected JPanel jPanelPaginacionTipoPuerto;
    protected JPanel jPanelParametrosReportesTipoPuerto;
	protected JPanel jPanelParametrosReportesAccionesTipoPuerto;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoPuerto;
	protected JPanel jPanelParametrosAuxiliar2TipoPuerto;
	protected JPanel jPanelParametrosAuxiliar3TipoPuerto;
	protected JPanel jPanelParametrosAuxiliar4TipoPuerto;
	//protected JPanel jPanelParametrosAuxiliar5TipoPuerto;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoPuerto;
	//protected JPanel jPanelImportacionTipoPuerto;
	
	
	public JTable jTableDatosTipoPuerto;
	
	
	
	//public JTable jTableDatosTipoPuertoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoPuerto;
	protected JButton jButtonDuplicarTipoPuerto;
	protected JButton jButtonCopiarTipoPuerto;
	protected JButton jButtonVerFormTipoPuerto;
	protected JButton jButtonNuevoRelacionesTipoPuerto;
	protected JButton jButtonModificarTipoPuerto;
	
    protected JButton jButtonGuardarCambiosTablaTipoPuerto;
	protected JButton jButtonCerrarTipoPuerto;
	
	
	protected JButton jButtonRecargarInformacionTipoPuerto;
	protected JButton jButtonProcesarInformacionTipoPuerto;
	
	
	protected JButton jButtonAnterioresTipoPuerto;
	protected JButton jButtonSiguientesTipoPuerto;
	protected JButton jButtonNuevoGuardarCambiosTipoPuerto;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoPuerto;
	//protected JButton jButtonCerrarReporteDinamicoTipoPuerto;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoPuerto;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoPuerto;
	//protected JButton jButtonGenerarImportacionTipoPuerto;
	//protected JButton jButtonCerrarImportacionTipoPuerto;
	//protected JFileChooser jFileChooserImportacionTipoPuerto;
	//protected File fileImportacionTipoPuerto;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPuerto;
	protected JButton jButtonDuplicarToolBarTipoPuerto;
	protected JButton jButtonNuevoRelacionesToolBarTipoPuerto;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoPuerto;
	protected JButton jButtonCopiarToolBarTipoPuerto;
	protected JButton jButtonVerFormToolBarTipoPuerto;
	public JButton jButtonGuardarCambiosTablaToolBarTipoPuerto;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPuerto;
	protected JButton jButtonCerrarToolBarTipoPuerto;
	
	protected JButton jButtonRecargarInformacionToolBarTipoPuerto;
	protected JButton jButtonProcesarInformacionToolBarTipoPuerto;
	protected JButton jButtonAnterioresToolBarTipoPuerto;
	protected JButton jButtonSiguientesToolBarTipoPuerto;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoPuerto;
	protected JButton jButtonAbrirOrderByToolBarTipoPuerto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPuerto;
	protected JMenuItem jMenuItemDuplicarTipoPuerto;
	protected JMenuItem jMenuItemNuevoRelacionesTipoPuerto;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoPuerto;
	protected JMenuItem jMenuItemCopiarTipoPuerto;
	protected JMenuItem jMenuItemVerFormTipoPuerto;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPuerto;
	protected JMenuItem jMenuItemCerrarTipoPuerto;
	protected JMenuItem jMenuItemDetalleCerrarTipoPuerto;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoPuerto;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPuerto;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoPuerto;
	protected JMenuItem jMenuItemProcesarInformacionTipoPuerto;
	protected JMenuItem jMenuItemAnterioresTipoPuerto;
	protected JMenuItem jMenuItemSiguientesTipoPuerto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPuerto;
	protected JMenuItem jMenuItemAbrirOrderByTipoPuerto;
	protected JMenuItem jMenuItemMostrarOcultarTipoPuerto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPuerto;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoPuerto;
	protected JCheckBox jCheckBoxSeleccionadosTipoPuerto;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoPuerto;
	protected JCheckBox jCheckBoxConGraficoReporteTipoPuerto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoPuerto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoPuerto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPuerto;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoPuerto;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoPuerto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoPuerto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPuerto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPuerto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoPuerto;
	protected JTextField jTextFieldValorCampoGeneralTipoPuerto;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoPuerto;
	//public JList<Reporte> jListColumnasSelectReporteTipoPuerto;
	//public JScrollPane jScrollColumnasSelectReporteTipoPuerto;
	
	//public JLabel jLabelRelacionesSelectReporteTipoPuerto;
	//public JList<Reporte> jListRelacionesSelectReporteTipoPuerto;
	//public JScrollPane jScrollRelacionesSelectReporteTipoPuerto;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoPuerto;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoPuerto;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoPuerto;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoPuerto;
	
		
	//public JLabel jLabelArchivoImportacionTipoPuerto;	
	//public JLabel jLabelPathArchivoImportacionTipoPuerto;
	//protected JTextField jTextFieldPathArchivoImportacionTipoPuerto;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoPuerto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoPuerto;
	
	//public JLabel jLabelColumnaCategoriaValorTipoPuerto;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoPuerto;
	
	//public JLabel jLabelColumnasValoresGraficoTipoPuerto;
	//public JList<Reporte> jListColumnasValoresGraficoTipoPuerto;
	//public JScrollPane jScrollColumnasValoresGraficoTipoPuerto;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoPuerto;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoPuerto;	
	
	
	
	
	
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
	public TipoPuertoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoPuerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPuertoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPuerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPuertoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPuerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPuertoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPuerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoPuerto)	{
		this.jButtonRecargarInformacionTipoPuerto = jButtonRecargarInformacionTipoPuerto;
	}
	
	public JButton getjButtonProcesarInformacionTipoPuerto() {
		return this.jButtonProcesarInformacionTipoPuerto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPuerto)	{
		this.jButtonProcesarInformacionTipoPuerto = jButtonProcesarInformacionTipoPuerto;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoPuerto() {
		return this.jButtonRecargarInformacionTipoPuerto;
	}
	
	
	public List<TipoPuerto> gettipopuertos() {
		return this.tipopuertos;
	}

	public void settipopuertos(List<TipoPuerto> tipopuertos) {
		this.tipopuertos = tipopuertos;
	}
	
	public List<TipoPuerto> gettipopuertosAux() {
		return this.tipopuertosAux;
	}

	public void settipopuertosAux(List<TipoPuerto> tipopuertosAux) {
		this.tipopuertosAux = tipopuertosAux;
	}
	
	public List<TipoPuerto> gettipopuertosEliminados() {
		return this.tipopuertosEliminados;
	}

	public void setTipoPuertosEliminados(List<TipoPuerto> tipopuertosEliminados) {
		this.tipopuertosEliminados = tipopuertosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoPuerto() {
		return jComboBoxTiposSeleccionarTipoPuerto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoPuerto(
			JComboBox jComboBoxTiposSeleccionarTipoPuerto) {
		this.jComboBoxTiposSeleccionarTipoPuerto = jComboBoxTiposSeleccionarTipoPuerto;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoPuerto.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoPuerto .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoPuerto() {
		return jTextFieldValorCampoGeneralTipoPuerto;
	}

	public void setjTextFieldValorCampoGeneralTipoPuerto(
			JTextField jTextFieldValorCampoGeneralTipoPuerto) {
		this.jTextFieldValorCampoGeneralTipoPuerto = jTextFieldValorCampoGeneralTipoPuerto;
	}

	public void setBorderResaltarValorCampoGeneralTipoPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPuerto.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoPuerto .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoPuerto() {
		return this.jCheckBoxSeleccionarTodosTipoPuerto;
	}

	public void setjCheckBoxSeleccionarTodosTipoPuerto(
			JCheckBox jCheckBoxSeleccionarTodosTipoPuerto) {
		this.jCheckBoxSeleccionarTodosTipoPuerto = jCheckBoxSeleccionarTodosTipoPuerto;
	}

	public void setBorderResaltarSeleccionarTodosTipoPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPuerto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoPuerto .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoPuerto() {
		return this.jCheckBoxSeleccionadosTipoPuerto;
	}

	public void setjCheckBoxSeleccionadosTipoPuerto(
			JCheckBox jCheckBoxSeleccionadosTipoPuerto) {
		this.jCheckBoxSeleccionadosTipoPuerto = jCheckBoxSeleccionadosTipoPuerto;
	}
	
	public void setBorderResaltarSeleccionadosTipoPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPuerto.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoPuerto .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoPuerto() {
		return this.jComboBoxTiposArchivosReportesTipoPuerto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoPuerto(
			JComboBox jComboBoxTiposArchivosReportesTipoPuerto) {
		this.jComboBoxTiposArchivosReportesTipoPuerto = jComboBoxTiposArchivosReportesTipoPuerto;
	}

	public void setBorderResaltarTiposArchivosReportesTipoPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPuerto.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoPuerto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoPuerto() {
		return this.jComboBoxTiposReportesTipoPuerto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoPuerto(
			JComboBox jComboBoxTiposReportesTipoPuerto) {
		this.jComboBoxTiposReportesTipoPuerto = jComboBoxTiposReportesTipoPuerto;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoPuerto() {
	//	return jComboBoxTiposReportesDinamicoTipoPuerto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoPuerto(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoPuerto) {
	//	this.jComboBoxTiposReportesDinamicoTipoPuerto = jComboBoxTiposReportesDinamicoTipoPuerto;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoPuerto() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoPuerto;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoPuerto(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPuerto) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoPuerto = jComboBoxTiposArchivosReportesDinamicoTipoPuerto;
	//}
	
	public void setBorderResaltarTiposReportesTipoPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPuerto.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoPuerto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoPuerto() {
		return this.jComboBoxTiposGraficosReportesTipoPuerto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoPuerto(
			JComboBox jComboBoxTiposGraficosReportesTipoPuerto) {
		this.jComboBoxTiposGraficosReportesTipoPuerto = jComboBoxTiposGraficosReportesTipoPuerto;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPuerto.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoPuerto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoPuerto() {
		return this.jComboBoxTiposPaginacionTipoPuerto;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoPuerto(
			JComboBox jComboBoxTiposPaginacionTipoPuerto) {
		this.jComboBoxTiposPaginacionTipoPuerto = jComboBoxTiposPaginacionTipoPuerto;
	}
	
	public void setBorderResaltarTiposPaginacionTipoPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPuerto.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoPuerto .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoPuerto() {
		return this.jComboBoxTiposRelacionesTipoPuerto;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPuerto() {
		return this.jComboBoxTiposAccionesTipoPuerto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPuerto(
			JComboBox jComboBoxTiposRelacionesTipoPuerto) {
		this.jComboBoxTiposRelacionesTipoPuerto = jComboBoxTiposRelacionesTipoPuerto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPuerto(
			JComboBox jComboBoxTiposAccionesTipoPuerto) {
		this.jComboBoxTiposAccionesTipoPuerto = jComboBoxTiposAccionesTipoPuerto;
	}
	
	public void setBorderResaltarTiposRelacionesTipoPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPuerto.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoPuerto .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoPuerto() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPuerto.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoPuerto .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoPuerto() {
	//	return jCheckBoxConGraficoDinamicoTipoPuerto;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoPuerto(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoPuerto) {
	//	this.jCheckBoxConGraficoDinamicoTipoPuerto = jCheckBoxConGraficoDinamicoTipoPuerto;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoPuerto() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoPuerto.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoPuerto .setBorder(borderResaltar);		
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
		this.tipopuertoSessionBean=new TipoPuertoSessionBean();
		
		this.tipopuertoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipopuertoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipopuertoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoPuertoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoPuertoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPuertoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPuertoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPuertoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Puerto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoPuertoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoPuerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoPuerto= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoPuerto,this.jTtoolBarTipoPuerto,
							"nuevo","nuevo","Nuevo"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoPuerto,this.jTtoolBarTipoPuerto,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoPuerto,this.jTtoolBarTipoPuerto,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoPuerto,this.jTtoolBarTipoPuerto,
							"duplicar","duplicar","Duplicar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoPuerto,this.jTtoolBarTipoPuerto,
							"copiar","copiar","Copiar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoPuerto,this.jTtoolBarTipoPuerto,
							"ver_form","ver_form","Ver"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPuerto,this.jTtoolBarTipoPuerto,
							"recargar","recargar","Recargar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPuerto,this.jTtoolBarTipoPuerto,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPuerto,this.jTtoolBarTipoPuerto,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoPuerto,this.jTtoolBarTipoPuerto,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoPuerto,this.jTtoolBarTipoPuerto,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoPuerto,this.jTtoolBarTipoPuerto,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoPuerto,this.jTtoolBarTipoPuerto,
							"cerrar","cerrar","Salir"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoPuerto=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoPuerto;
			
				this.jButtonProcesarInformacionToolBarTipoPuerto=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoPuerto;
				
		//protected JButton jButtonModificarToolBarTipoPuerto;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoPuerto=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoPuerto=new JMenuMe("General");
		this.jmenuArchivoTipoPuerto=new JMenuMe("Archivo");
		this.jmenuAccionesTipoPuerto=new JMenuMe("Acciones");
		this.jmenuDatosTipoPuerto=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPuerto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPuerto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPuerto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoPuerto= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoPuerto.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoPuerto,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoPuerto= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoPuerto.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoPuerto,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoPuerto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPuerto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPuerto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoPuerto= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoPuerto.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoPuerto,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoPuerto= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoPuerto.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoPuerto,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoPuerto= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoPuerto.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoPuerto,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPuerto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPuerto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPuerto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoPuerto= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoPuerto.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoPuerto,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoPuerto= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoPuerto.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoPuerto,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoPuerto= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoPuerto.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoPuerto,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoPuerto= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoPuerto.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoPuerto,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoPuerto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoPuerto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoPuerto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPuerto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPuerto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPuerto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoPuerto= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoPuerto.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoPuerto,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPuerto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPuerto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPuerto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoPuerto= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoPuerto.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoPuerto,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoPuerto.add(this.jMenuItemCerrarTipoPuerto);
			
			this.jmenuAccionesTipoPuerto.add(this.jMenuItemNuevoTipoPuerto);
			this.jmenuAccionesTipoPuerto.add(this.jMenuItemNuevoGuardarCambiosTipoPuerto);
			this.jmenuAccionesTipoPuerto.add(this.jMenuItemNuevoRelacionesTipoPuerto);
			this.jmenuAccionesTipoPuerto.add(this.jMenuItemGuardarCambiosTablaTipoPuerto);		
			this.jmenuAccionesTipoPuerto.add(this.jMenuItemDuplicarTipoPuerto);		
			this.jmenuAccionesTipoPuerto.add(this.jMenuItemCopiarTipoPuerto);		
			this.jmenuAccionesTipoPuerto.add(this.jMenuItemVerFormTipoPuerto);		
			
			this.jmenuDatosTipoPuerto.add(this.jMenuItemRecargarInformacionTipoPuerto);				
			this.jmenuDatosTipoPuerto.add(this.jMenuItemAnterioresTipoPuerto);				
			this.jmenuDatosTipoPuerto.add(this.jMenuItemSiguientesTipoPuerto);				
			this.jmenuDatosTipoPuerto.add(this.jMenuItemAbrirOrderByTipoPuerto);				
			this.jmenuDatosTipoPuerto.add(this.jMenuItemMostrarOcultarTipoPuerto);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoPuerto.add(this.jMenuItemGuardarCambiosTipoPuerto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoPuerto.add(this.jmenuArchivoTipoPuerto);		
			this.jmenuBarTipoPuerto.add(this.jmenuAccionesTipoPuerto);		
			this.jmenuBarTipoPuerto.add(this.jmenuDatosTipoPuerto);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoPuerto);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoPuerto() {
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
			//this.jInternalFrameDetalleTipoPuerto = new TipoPuertoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Puerto DATOS");
			this.jInternalFrameDetalleFormTipoPuerto = new TipoPuertoDetalleFormJInternalFrame(jDesktopPane,this.tipopuertoSessionBean.getConGuardarRelaciones(),this.tipopuertoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoPuerto = null;//new TipoPuertoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPuerto= new GridBagLayout();
		
		
		this.jTableDatosTipoPuerto = new JTableMe();      
		
		String sToolTipTipoPuerto="";
		sToolTipTipoPuerto=TipoPuertoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPuerto+="(Importaciones.TipoPuerto)";
		}
		
		if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPuerto+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoPuerto.setToolTipText(sToolTipTipoPuerto);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoPuerto);
		this.jTableDatosTipoPuerto.setAutoCreateRowSorter(true);
		this.jTableDatosTipoPuerto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoPuerto.setRowSelectionAllowed(true);
		this.jTableDatosTipoPuerto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoPuerto,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoPuerto = new JButtonMe();
		this.jButtonDuplicarTipoPuerto = new JButtonMe();
		this.jButtonCopiarTipoPuerto = new JButtonMe();
		this.jButtonVerFormTipoPuerto = new JButtonMe();
		this.jButtonNuevoRelacionesTipoPuerto = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoPuerto = new JButtonMe();
		this.jButtonCerrarTipoPuerto = new JButtonMe();
		
		this.jScrollPanelDatosTipoPuerto = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoPuerto = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Puerto";
		
		if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Puertos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPuerto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPuerto.setToolTipText("Acciones");
        this.jPanelAccionesTipoPuerto.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoPuerto=new ReporteDinamicoJInternalFrame(TipoPuertoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoPuerto();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoPuerto=new ImportacionJInternalFrame(TipoPuertoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoPuerto();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoPuerto = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoPuerto.setText("Orden");
		this.jButtonAbrirOrderByTipoPuerto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPuerto,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPuerto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPuerto,false,this);
			
			//this.cargarOrderByTipoPuerto(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPuerto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPuerto,true,this);
			
			//this.cargarOrderByTipoPuerto(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoPuerto.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPuerto.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTipoPuerto.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTipoPuerto.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPuerto.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPuerto.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoPuerto.setText("Nuevo");
		this.jButtonDuplicarTipoPuerto.setText("Duplicar");
		this.jButtonCopiarTipoPuerto.setText("Copiar");
		this.jButtonVerFormTipoPuerto.setText("Ver");
		this.jButtonNuevoRelacionesTipoPuerto.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoPuerto.setText("Guardar");
		this.jButtonCerrarTipoPuerto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPuerto,"nuevo_button","Nuevo",this.tipopuertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoPuerto,"duplicar_button","Duplicar",this.tipopuertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoPuerto,"copiar_button","Copiar",this.tipopuertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoPuerto,"ver_form","Ver",this.tipopuertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoPuerto,"nuevorelaciones_button","Nuevo Rel",this.tipopuertoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPuerto,"guardarcambiostabla_button","Guardar",this.tipopuertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPuerto,"cerrar_button","Salir",this.tipopuertoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoPuerto.setToolTipText("Nuevo"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoPuerto.setToolTipText("Duplicar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoPuerto.setToolTipText("Copiar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoPuerto.setToolTipText("Ver"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoPuerto.setToolTipText("Nuevo Rel"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoPuerto.setToolTipText("Guardar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPuerto.setToolTipText("Salir"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPuerto";
		inputMap = this.jButtonNuevoTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPuerto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPuerto"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoPuerto";
		inputMap = this.jButtonDuplicarTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoPuerto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoPuerto"));
		
		//COPIAR
		sMapKey = "CopiarTipoPuerto";
		inputMap = this.jButtonCopiarTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoPuerto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoPuerto"));
		
		//VEr FORM
		sMapKey = "VerFormTipoPuerto";
		inputMap = this.jButtonVerFormTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoPuerto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoPuerto"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoPuerto";
		inputMap = this.jButtonNuevoRelacionesTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoPuerto"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoPuerto";
		inputMap = this.jButtonModificarTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoPuerto"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoPuerto";
		inputMap = this.jButtonCerrarTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPuerto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPuerto";
		inputMap = this.jButtonGuardarCambiosTablaTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPuerto"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoPuerto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoPuerto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoPuerto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoPuerto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoPuerto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoPuerto.setName("jPanelParametrosReportesTipoPuerto"); 
		
		this.jPanelParametrosReportesAccionesTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoPuerto.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoPuerto.setName("jPanelParametrosReportesAccionesTipoPuerto"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoPuerto = new JButtonMe();
		this.jButtonRecargarInformacionTipoPuerto.setText("Recargar");
		this.jButtonRecargarInformacionTipoPuerto.setToolTipText("Recargar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoPuerto,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoPuerto = new JButtonMe();
		this.jButtonProcesarInformacionTipoPuerto.setText("Procesar");
		this.jButtonProcesarInformacionTipoPuerto.setToolTipText("Procesar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoPuerto.setVisible(false);
			
		this.jButtonProcesarInformacionTipoPuerto.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPuerto.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPuerto.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoPuerto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPuerto.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoPuerto.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoPuerto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPuerto.setText("TIPO");       
		this.jComboBoxTiposReportesTipoPuerto.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoPuerto = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPuerto.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoPuerto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoPuerto = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoPuerto.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoPuerto.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoPuerto = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoPuerto.setText("Accion");
		this.jComboBoxTiposRelacionesTipoPuerto.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoPuerto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPuerto.setText("Accion");
		this.jComboBoxTiposAccionesTipoPuerto.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoPuerto = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoPuerto.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoPuerto.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoPuerto=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoPuerto.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPuerto.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPuerto.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoPuerto = new JLabelMe();
		
		this.jLabelAccionesTipoPuerto.setText("Acciones");		
		this.jLabelAccionesTipoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoPuerto = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoPuerto.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoPuerto.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoPuerto = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoPuerto.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoPuerto.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoPuerto = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoPuerto.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoPuerto.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoPuerto = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoPuerto.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoPuerto.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoPuerto = new JButtonMe();
		//this.jButtonAnterioresTipoPuerto.setText("<<");
        this.jButtonAnterioresTipoPuerto.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoPuerto,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoPuerto = new JButtonMe();
		//this.jButtonSiguientesTipoPuerto.setText(">>");
        this.jButtonSiguientesTipoPuerto.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoPuerto,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoPuerto = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoPuerto.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoPuerto.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoPuerto,"nuevoguardarcambios_button","Nue",this.tipopuertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoPuerto";
		inputMap = this.jButtonNuevoGuardarCambiosTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoPuerto"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoPuerto";
		inputMap = this.jButtonRecargarInformacionTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoPuerto"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoPuerto";
		inputMap = this.jButtonSiguientesTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoPuerto"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoPuerto";
		inputMap = this.jButtonAnterioresTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoPuerto"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoPuerto();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoPuerto.setMinimumSize(new Dimension(this.getWidth(),TipoPuertoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPuertoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPuerto.setMaximumSize(new Dimension(this.getWidth(),TipoPuertoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPuertoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPuerto.setPreferredSize(new Dimension(this.getWidth(),TipoPuertoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPuertoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoPuerto = new GridBagLayout();

			this.jPanelPaginacionTipoPuerto.setLayout(gridaBagLayoutPaginacionTipoPuerto);						
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPuerto.gridy = 0;
			this.gridBagConstraintsTipoPuerto.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoPuerto.add(this.jButtonAnterioresTipoPuerto, this.gridBagConstraintsTipoPuerto);
					
						
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPuerto.gridy = 0;
			
			this.jPanelPaginacionTipoPuerto.add(this.jButtonNuevoGuardarCambiosTipoPuerto, this.gridBagConstraintsTipoPuerto);
						
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoPuerto.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPuerto.gridy = 0;
			this.jPanelPaginacionTipoPuerto.add(this.jButtonSiguientesTipoPuerto, this.gridBagConstraintsTipoPuerto);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPuerto.gridy = 1;
			this.gridBagConstraintsTipoPuerto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPuerto.add(this.jButtonNuevoTipoPuerto, this.gridBagConstraintsTipoPuerto);
						
			
			
			if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
				this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoPuerto.gridy = 1;
				this.gridBagConstraintsTipoPuerto.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoPuerto.add(this.jButtonGuardarCambiosTablaTipoPuerto, this.gridBagConstraintsTipoPuerto);
			}
			
			
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPuerto.gridy = 1;
			this.gridBagConstraintsTipoPuerto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPuerto.add(this.jButtonDuplicarTipoPuerto, this.gridBagConstraintsTipoPuerto);
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPuerto.gridy = 1;
			this.gridBagConstraintsTipoPuerto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPuerto.add(this.jButtonCopiarTipoPuerto, this.gridBagConstraintsTipoPuerto);
		
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPuerto.gridy = 1;
			this.gridBagConstraintsTipoPuerto.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPuerto.add(this.jButtonVerFormTipoPuerto, this.gridBagConstraintsTipoPuerto);
		
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPuerto.gridy = 1;
			this.gridBagConstraintsTipoPuerto.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoPuerto.add(this.jButtonCerrarTipoPuerto, this.gridBagConstraintsTipoPuerto);
		
		
		
		this.jButtonRecargarInformacionTipoPuerto.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPuerto.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPuerto.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoPuerto.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPuerto.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPuerto.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoPuerto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPuerto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPuerto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoPuerto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPuerto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPuerto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoPuerto.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPuerto.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPuerto.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoPuerto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPuerto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPuerto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoPuerto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPuerto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPuerto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoPuerto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPuerto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPuerto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoPuerto.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPuerto.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPuerto.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoPuerto.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPuerto.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPuerto.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoPuerto.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPuerto.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPuerto.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoPuerto.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPuerto.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPuerto.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoPuerto = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoPuerto = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoPuerto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoPuerto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoPuerto = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoPuerto = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoPuerto.setLayout(gridaBagParametrosReportesTipoPuerto);
			this.jPanelParametrosReportesAccionesTipoPuerto.setLayout(gridaBagParametrosReportesAccionesTipoPuerto);
			
			
			this.jPanelParametrosAuxiliar1TipoPuerto.setLayout(gridaBagParametrosAuxiliar1TipoPuerto);
			this.jPanelParametrosAuxiliar2TipoPuerto.setLayout(gridaBagParametrosAuxiliar2TipoPuerto);
			this.jPanelParametrosAuxiliar3TipoPuerto.setLayout(gridaBagParametrosAuxiliar3TipoPuerto);
			this.jPanelParametrosAuxiliar4TipoPuerto.setLayout(gridaBagParametrosAuxiliar4TipoPuerto);
			//this.jPanelParametrosAuxiliar5TipoPuerto.setLayout(gridaBagParametrosAuxiliar2TipoPuerto);			
			
			
			
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPuerto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPuerto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPuerto.add(this.jButtonRecargarInformacionTipoPuerto, this.gridBagConstraintsTipoPuerto);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPuerto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPuerto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPuerto.add(this.jComboBoxTiposPaginacionTipoPuerto, this.gridBagConstraintsTipoPuerto);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPuerto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPuerto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPuerto.add(this.jCheckBoxConAltoMaximoTablaTipoPuerto, this.gridBagConstraintsTipoPuerto);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPuerto.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPuerto.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPuerto.add(this.jComboBoxTiposArchivosReportesTipoPuerto, this.gridBagConstraintsTipoPuerto);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPuerto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPuerto.add(this.jPanelParametrosAuxiliar1TipoPuerto, this.gridBagConstraintsTipoPuerto);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPuerto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPuerto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoPuerto.add(this.jComboBoxTiposReportesTipoPuerto, this.gridBagConstraintsTipoPuerto);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPuerto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPuerto.add(this.jPanelParametrosAuxiliar4TipoPuerto, this.gridBagConstraintsTipoPuerto);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPuerto.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPuerto.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPuerto.add(this.jComboBoxTiposReportesTipoPuerto, this.gridBagConstraintsTipoPuerto);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPuerto.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPuerto.add(this.jCheckBoxGenerarReporteTipoPuerto, this.gridBagConstraintsTipoPuerto);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPuerto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPuerto.add(this.jPanelParametrosAuxiliar2TipoPuerto, this.gridBagConstraintsTipoPuerto);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPuerto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPuerto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPuerto.add(this.jLabelAccionesTipoPuerto, this.gridBagConstraintsTipoPuerto);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
				this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoPuerto.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoPuerto.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoPuerto.add(this.jButtonAbrirOrderByTipoPuerto, this.gridBagConstraintsTipoPuerto);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPuerto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPuerto.add(this.jComboBoxTiposSeleccionarTipoPuerto, this.gridBagConstraintsTipoPuerto);			
			
			
			/*
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPuerto.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPuerto.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPuerto.add(this.jCheckBoxSeleccionarTodosTipoPuerto, this.gridBagConstraintsTipoPuerto);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPuerto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPuerto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPuerto.add(this.jCheckBoxSeleccionarTodosTipoPuerto, this.gridBagConstraintsTipoPuerto);															
				
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPuerto.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPuerto.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPuerto.add(this.jCheckBoxSeleccionadosTipoPuerto, this.gridBagConstraintsTipoPuerto);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPuerto.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPuerto.add(this.jPanelParametrosAuxiliar3TipoPuerto, this.gridBagConstraintsTipoPuerto);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPuerto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPuerto.add(this.jComboBoxTiposRelacionesTipoPuerto, this.gridBagConstraintsTipoPuerto);
				
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPuerto.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPuerto.add(this.jComboBoxTiposAccionesTipoPuerto, this.gridBagConstraintsTipoPuerto);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoPuerto = new GridBagLayout();

			this.jScrollPanelDatosTipoPuerto.setLayout(gridaBagLayoutDatosTipoPuerto);
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPuerto.gridy = 0;
			this.gridBagConstraintsTipoPuerto.gridx = 0;
			
			this.jScrollPanelDatosTipoPuerto.add(this.jTableDatosTipoPuerto, this.gridBagConstraintsTipoPuerto);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoPuerto.setViewportView(this.jTableDatosTipoPuerto);
		this.jTableDatosTipoPuerto.setFillsViewportHeight(true);
		this.jTableDatosTipoPuerto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoPuerto= new GridBagLayout();
		this.jPanelAccionesTipoPuerto.setLayout(gridaBagLayoutAccionesTipoPuerto);
		
		
		/*	
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPuerto.gridy = 0;
		this.gridBagConstraintsTipoPuerto.gridx = 0;
			
		this.jPanelAccionesTipoPuerto.add(this.jButtonNuevoTipoPuerto, this.gridBagConstraintsTipoPuerto);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPuerto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPuerto);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipopuertoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();						
			this.gridBagConstraintsTipoPuerto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPuerto.gridx = 0;		
			//this.gridBagConstraintsTipoPuerto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPuerto.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoPuerto, this.gridBagConstraintsTipoPuerto);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoPuerto.gridx = 0;		
		//this.gridBagConstraintsTipoPuerto.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPuerto.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoPuerto.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoPuerto);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPuerto.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoPuerto, this.gridBagConstraintsTipoPuerto);								
		
		
		/*
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPuerto.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoPuerto, this.gridBagConstraintsTipoPuerto);
		*/		
		
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPuerto.gridx =0;
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPuerto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPuerto, this.gridBagConstraintsTipoPuerto);
				
		
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPuerto.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoPuerto, this.gridBagConstraintsTipoPuerto);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoPuertoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoPuerto= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPuerto = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoPuerto.setLayout(gridaBagLayoutBusquedasParametrosTipoPuerto);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoPuerto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPuerto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPuerto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPuerto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPuerto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPuerto, this.gridBagConstraintsTipoPuerto);
			
			
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPuerto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPuerto, this.gridBagConstraintsTipoPuerto);
		
			
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPuerto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPuerto, this.gridBagConstraintsTipoPuerto);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoPuerto;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoPuerto() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoPuerto = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoPuerto.setName("jPanelReporteDinamicoTipoPuerto"); 
		
		this.jPanelReporteDinamicoTipoPuerto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPuerto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPuerto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoPuerto.setLayout(gridaBagLayoutReporteDinamicoTipoPuerto);
		
		
		this.jInternalFrameReporteDinamicoTipoPuerto= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoPuerto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPuerto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoPuerto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoPuerto.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoPuerto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoPuerto.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoPuerto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoPuerto.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoPuerto.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoPuerto.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoPuerto.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPuerto.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPuerto.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Puertos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoPuerto = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoPuerto.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPuerto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPuerto.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPuerto.add(this.jLabelColumnasSelectReporteTipoPuerto, this.gridBagConstraintsTipoPuerto);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoPuerto = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoPuerto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoPuerto.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoPuerto.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPuerto.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPuerto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoPuerto=new JScrollPane(this.jListColumnasSelectReporteTipoPuerto);
			
			this.jScrollColumnasSelectReporteTipoPuerto.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPuerto.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPuerto.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPuerto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPuerto.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoPuerto.add(this.jListColumnasSelectReporteTipoPuerto, this.gridBagConstraintsTipoPuerto);
		this.jPanelReporteDinamicoTipoPuerto.add(this.jScrollColumnasSelectReporteTipoPuerto, this.gridBagConstraintsTipoPuerto);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoPuerto = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoPuerto.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoPuerto = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoPuerto.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoPuerto.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoPuerto.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPuerto.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPuerto.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoPuerto=new JScrollPane(this.jListRelacionesSelectReporteTipoPuerto);
			
			this.jScrollRelacionesSelectReporteTipoPuerto.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPuerto.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPuerto.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoPuerto = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoPuerto = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoPuerto = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoPuerto = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoPuerto.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoPuerto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPuerto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPuerto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoPuerto = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPuerto.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPuerto.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPuerto.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPuerto.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoPuerto = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoPuerto.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPuerto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPuerto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPuerto.add(this.jLabelGenerarExcelReporteDinamicoTipoPuerto, this.gridBagConstraintsTipoPuerto);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoPuerto = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoPuerto.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoPuerto,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoPuerto.setToolTipText("Generar EXCEL"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		//this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoPuerto.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoPuerto.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoPuerto.add(this.jButtonGenerarExcelReporteDinamicoTipoPuerto, this.gridBagConstraintsTipoPuerto);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPuerto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPuerto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPuerto.add(this.jComboBoxTiposReportesDinamicoTipoPuerto, this.gridBagConstraintsTipoPuerto);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoPuerto = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoPuerto.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPuerto.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPuerto.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPuerto.add(this.jLabelTiposArchivoReporteDinamicoTipoPuerto, this.gridBagConstraintsTipoPuerto);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPuerto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPuerto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPuerto.add(this.jComboBoxTiposArchivosReportesDinamicoTipoPuerto, this.gridBagConstraintsTipoPuerto);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoPuerto = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoPuerto.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoPuerto,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoPuerto.setToolTipText("Generar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPuerto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPuerto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPuerto.add(this.jButtonGenerarReporteDinamicoTipoPuerto, this.gridBagConstraintsTipoPuerto);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoPuerto = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoPuerto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoPuerto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoPuerto.setToolTipText("Cancelar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPuerto.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPuerto.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPuerto.add(this.jButtonCerrarReporteDinamicoTipoPuerto, this.gridBagConstraintsTipoPuerto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoPuerto = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoPuerto= new JScrollPane(jPanelReporteDinamicoTipoPuerto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoPuerto.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPuerto.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPuerto.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Puertos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoPuerto.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoPuerto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoPuerto.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoPuerto);
		this.jInternalFrameReporteDinamicoTipoPuerto.getContentPane().add(this.jScrollPanelReporteDinamicoTipoPuerto, this.gridBagConstraintsTipoPuerto);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoPuerto() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoPuerto = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoPuerto.setName("jPanelImportacionTipoPuerto"); 
		
		this.jPanelImportacionTipoPuerto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPuerto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPuerto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoPuerto.setLayout(gridaBagLayoutImportacionTipoPuerto);
		
		
		this.jInternalFrameImportacionTipoPuerto= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoPuerto= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoPuerto = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPuerto= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoPuerto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPuerto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPuerto.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoPuerto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPuerto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPuerto.setResizable(true);
	    this.jInternalFrameImportacionTipoPuerto.setClosable(true);
	    this.jInternalFrameImportacionTipoPuerto.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoPuerto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPuerto.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPuerto.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoPuerto.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPuerto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPuerto.setResizable(true);
	    this.jInternalFrameImportacionTipoPuerto.setClosable(true);
	    this.jInternalFrameImportacionTipoPuerto.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoPuerto.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPuerto.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPuerto.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Puertos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoPuerto = new JLabelMe();

		this.jLabelArchivoImportacionTipoPuerto.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPuerto.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPuerto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPuerto.add(this.jLabelArchivoImportacionTipoPuerto, this.gridBagConstraintsTipoPuerto);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoPuerto = new JFileChooser();		
		this.jFileChooserImportacionTipoPuerto.setToolTipText("ESCOGER ARCHIVO"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoPuerto = new JButtonMe();
		this.jButtonAbrirImportacionTipoPuerto.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoPuerto,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoPuerto.setToolTipText("Generar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPuerto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPuerto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPuerto.add(this.jButtonAbrirImportacionTipoPuerto, this.gridBagConstraintsTipoPuerto);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoPuerto = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoPuerto.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPuerto.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPuerto.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPuerto.add(this.jLabelPathArchivoImportacionTipoPuerto, this.gridBagConstraintsTipoPuerto);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoPuerto=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoPuerto.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPuerto.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPuerto.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPuerto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPuerto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPuerto.add(this.jTextFieldPathArchivoImportacionTipoPuerto, this.gridBagConstraintsTipoPuerto);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoPuerto = new JButtonMe();
		this.jButtonGenerarImportacionTipoPuerto.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoPuerto,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoPuerto.setToolTipText("Generar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPuerto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPuerto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPuerto.add(this.jButtonGenerarImportacionTipoPuerto, this.gridBagConstraintsTipoPuerto);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoPuerto = new JButtonMe();
		this.jButtonCerrarImportacionTipoPuerto.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoPuerto,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoPuerto.setToolTipText("Cancelar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPuerto.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPuerto.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPuerto.add(this.jButtonCerrarImportacionTipoPuerto, this.gridBagConstraintsTipoPuerto);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoPuerto = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoPuerto= new JScrollPane(jPanelImportacionTipoPuerto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
		this.gridBagConstraintsTipoPuerto.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoPuerto.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoPuerto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoPuerto.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoPuerto);
		this.jInternalFrameImportacionTipoPuerto.getContentPane().add(this.jScrollPanelImportacionTipoPuerto, this.gridBagConstraintsTipoPuerto);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoPuerto(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoPuerto = new JButtonMe();
			this.jButtonAbrirOrderByTipoPuerto.setText("Orden");
			this.jButtonAbrirOrderByTipoPuerto.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPuerto,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoPuerto";
			inputMap = this.jButtonAbrirOrderByTipoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoPuerto"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoPuerto = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoPuerto.setName("jPanelOrderByTipoPuerto"); 
			
			this.jPanelOrderByTipoPuerto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPuerto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPuerto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoPuerto.setLayout(gridaBagLayoutOrderByTipoPuerto);
			
			
			this.jTableDatosTipoPuertoOrderBy = new JTableMe();        
			this.jTableDatosTipoPuertoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoPuertoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoPuertoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoPuertoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoPuertoOrderBy.setViewportView(this.jTableDatosTipoPuertoOrderBy);
			this.jTableDatosTipoPuertoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoPuertoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoPuerto= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoPuerto= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoPuerto = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoPuerto= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoPuerto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoPuerto.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoPuerto.setTitle("Orden");
			this.jInternalFrameOrderByTipoPuerto.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoPuerto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoPuerto.setResizable(true);
			this.jInternalFrameOrderByTipoPuerto.setClosable(true);
			this.jInternalFrameOrderByTipoPuerto.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoPuerto.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPuerto.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPuerto.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Puertos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoPuerto.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoPuerto.ipady =150;
				
			this.jPanelOrderByTipoPuerto.add(jScrollPanelDatosTipoPuertoOrderBy, this.gridBagConstraintsTipoPuerto);//this.jTableDatosTipoPuertoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoPuerto = new JButtonMe();
			this.jButtonCerrarOrderByTipoPuerto.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoPuerto,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoPuerto.setToolTipText("Cancelar"+" "+TipoPuertoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPuerto.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoPuerto.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoPuerto.add(this.jButtonCerrarOrderByTipoPuerto, this.gridBagConstraintsTipoPuerto);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoPuerto = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoPuerto= new JScrollPane(jPanelOrderByTipoPuerto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoPuerto = new GridBagConstraints();
			this.gridBagConstraintsTipoPuerto.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoPuerto.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPuerto.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoPuerto.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoPuerto.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoPuerto);
			
			this.jInternalFrameOrderByTipoPuerto.getContentPane().add(this.jScrollPanelOrderByTipoPuerto, this.gridBagConstraintsTipoPuerto);			
		
		} else {
			this.jButtonAbrirOrderByTipoPuerto = new JButtonMe();
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
			&& this.tipopuertoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoPuerto.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoPuerto.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoPuerto.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoPuerto.getRowHeight();//TipoPuertoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoPuertoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPuerto.isSelected()) {
					iHeightTable=TipoPuertoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPuertoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPuertoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoPuertoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPuerto.isSelected()) {
					iHeightTable=TipoPuertoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPuertoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPuertoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoPuerto.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPuerto.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPuerto.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoPuerto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPuerto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPuerto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoPuerto!=null && this.jInternalFrameOrderByTipoPuerto.getjTableDatosOrderBy()!=null) {
			//if(!this.tipopuertoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoPuerto.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoPuerto.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoPuerto.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoPuerto.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoPuerto.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoPuerto.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoPuerto.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoPuerto.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPuerto.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPuerto.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipopuertoLogic.getTipoPuertos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipopuertos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoPuerto> TraerTipoPuertoBeans(List<TipoPuerto> tipopuertos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoPuerto tipopuerto:tipopuertos) {
					
				if(!(TipoPuertoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoPuertoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipopuerto.setsDetalleGeneralEntityReporte(TipoPuertoConstantesFunciones.getTipoPuertoDescripcion(tipopuerto));
										
						
					
						
					
				} else  {
							
					//tipopuerto.setsDetalleGeneralEntityReporte(tipopuerto.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipopuertobeans.add(tipopuertobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipopuertos;
    }
	//PARA REPORTES FIN
}
