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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoTransaConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoTransaJInternalFrame extends TipoTransaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoTransa;
	
	protected JMenuBar jmenuBarTipoTransa;
	
	protected JMenu jmenuTipoTransa;
	protected JMenu jmenuDatosTipoTransa;
	protected JMenu jmenuArchivoTipoTransa;
	protected JMenu jmenuAccionesTipoTransa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoTransa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoTransa;	
	protected GridBagConstraints gridBagConstraintsTipoTransa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoTransaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoTransa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoTransa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoTransa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoTransaSessionBean tipotransaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoTransa> tipotransas;		
	public List<TipoTransa> tipotransasEliminados;	
	public List<TipoTransa> tipotransasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoTransa;		
	protected JButton jButtonAbrirOrderByTipoTransa;
	
	
	//protected JPanel jPanelOrderByTipoTransa;
	//public JScrollPane jScrollPanelOrderByTipoTransa;	
	//protected JButton jButtonCerrarOrderByTipoTransa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoTransaLogic tipotransaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoTransa;
	public JScrollPane jScrollPanelDatosEdicionTipoTransa;
	public JScrollPane jScrollPanelDatosGeneralTipoTransa;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoTransaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoTransa;
	//public JScrollPane jScrollPanelImportacionTipoTransa;
	
	
	
	protected JPanel jPanelAccionesTipoTransa;
	
    protected JPanel jPanelPaginacionTipoTransa;
    protected JPanel jPanelParametrosReportesTipoTransa;
	protected JPanel jPanelParametrosReportesAccionesTipoTransa;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoTransa;
	protected JPanel jPanelParametrosAuxiliar2TipoTransa;
	protected JPanel jPanelParametrosAuxiliar3TipoTransa;
	protected JPanel jPanelParametrosAuxiliar4TipoTransa;
	//protected JPanel jPanelParametrosAuxiliar5TipoTransa;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoTransa;
	//protected JPanel jPanelImportacionTipoTransa;
	
	
	public JTable jTableDatosTipoTransa;
	
	
	
	//public JTable jTableDatosTipoTransaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoTransa;
	protected JButton jButtonDuplicarTipoTransa;
	protected JButton jButtonCopiarTipoTransa;
	protected JButton jButtonVerFormTipoTransa;
	protected JButton jButtonNuevoRelacionesTipoTransa;
	protected JButton jButtonModificarTipoTransa;
	
    protected JButton jButtonGuardarCambiosTablaTipoTransa;
	protected JButton jButtonCerrarTipoTransa;
	
	
	protected JButton jButtonRecargarInformacionTipoTransa;
	protected JButton jButtonProcesarInformacionTipoTransa;
	
	
	protected JButton jButtonAnterioresTipoTransa;
	protected JButton jButtonSiguientesTipoTransa;
	protected JButton jButtonNuevoGuardarCambiosTipoTransa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoTransa;
	//protected JButton jButtonCerrarReporteDinamicoTipoTransa;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoTransa;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoTransa;
	//protected JButton jButtonGenerarImportacionTipoTransa;
	//protected JButton jButtonCerrarImportacionTipoTransa;
	//protected JFileChooser jFileChooserImportacionTipoTransa;
	//protected File fileImportacionTipoTransa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoTransa;
	protected JButton jButtonDuplicarToolBarTipoTransa;
	protected JButton jButtonNuevoRelacionesToolBarTipoTransa;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoTransa;
	protected JButton jButtonCopiarToolBarTipoTransa;
	protected JButton jButtonVerFormToolBarTipoTransa;
	public JButton jButtonGuardarCambiosTablaToolBarTipoTransa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoTransa;
	protected JButton jButtonCerrarToolBarTipoTransa;
	
	protected JButton jButtonRecargarInformacionToolBarTipoTransa;
	protected JButton jButtonProcesarInformacionToolBarTipoTransa;
	protected JButton jButtonAnterioresToolBarTipoTransa;
	protected JButton jButtonSiguientesToolBarTipoTransa;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoTransa;
	protected JButton jButtonAbrirOrderByToolBarTipoTransa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoTransa;
	protected JMenuItem jMenuItemDuplicarTipoTransa;
	protected JMenuItem jMenuItemNuevoRelacionesTipoTransa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoTransa;
	protected JMenuItem jMenuItemCopiarTipoTransa;
	protected JMenuItem jMenuItemVerFormTipoTransa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoTransa;
	protected JMenuItem jMenuItemCerrarTipoTransa;
	protected JMenuItem jMenuItemDetalleCerrarTipoTransa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoTransa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoTransa;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoTransa;
	protected JMenuItem jMenuItemProcesarInformacionTipoTransa;
	protected JMenuItem jMenuItemAnterioresTipoTransa;
	protected JMenuItem jMenuItemSiguientesTipoTransa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoTransa;
	protected JMenuItem jMenuItemAbrirOrderByTipoTransa;
	protected JMenuItem jMenuItemMostrarOcultarTipoTransa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoTransa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoTransa;
	protected JCheckBox jCheckBoxSeleccionadosTipoTransa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoTransa;
	protected JCheckBox jCheckBoxConGraficoReporteTipoTransa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoTransa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoTransa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoTransa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoTransa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoTransa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoTransa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoTransa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoTransa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoTransa;
	protected JTextField jTextFieldValorCampoGeneralTipoTransa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoTransa;
	//public JList<Reporte> jListColumnasSelectReporteTipoTransa;
	//public JScrollPane jScrollColumnasSelectReporteTipoTransa;
	
	//public JLabel jLabelRelacionesSelectReporteTipoTransa;
	//public JList<Reporte> jListRelacionesSelectReporteTipoTransa;
	//public JScrollPane jScrollRelacionesSelectReporteTipoTransa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoTransa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoTransa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoTransa;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoTransa;
	
		
	//public JLabel jLabelArchivoImportacionTipoTransa;	
	//public JLabel jLabelPathArchivoImportacionTipoTransa;
	//protected JTextField jTextFieldPathArchivoImportacionTipoTransa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoTransa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoTransa;
	
	//public JLabel jLabelColumnaCategoriaValorTipoTransa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoTransa;
	
	//public JLabel jLabelColumnasValoresGraficoTipoTransa;
	//public JList<Reporte> jListColumnasValoresGraficoTipoTransa;
	//public JScrollPane jScrollColumnasValoresGraficoTipoTransa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoTransa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoTransa;	
	
	
	
	
	
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
	//public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoTransaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoTransa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTransaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTransa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTransaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTransa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTransaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoTransa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoTransa)	{
		this.jButtonRecargarInformacionTipoTransa = jButtonRecargarInformacionTipoTransa;
	}
	
	public JButton getjButtonProcesarInformacionTipoTransa() {
		return this.jButtonProcesarInformacionTipoTransa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoTransa)	{
		this.jButtonProcesarInformacionTipoTransa = jButtonProcesarInformacionTipoTransa;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoTransa() {
		return this.jButtonRecargarInformacionTipoTransa;
	}
	
	
	public List<TipoTransa> gettipotransas() {
		return this.tipotransas;
	}

	public void settipotransas(List<TipoTransa> tipotransas) {
		this.tipotransas = tipotransas;
	}
	
	public List<TipoTransa> gettipotransasAux() {
		return this.tipotransasAux;
	}

	public void settipotransasAux(List<TipoTransa> tipotransasAux) {
		this.tipotransasAux = tipotransasAux;
	}
	
	public List<TipoTransa> gettipotransasEliminados() {
		return this.tipotransasEliminados;
	}

	public void setTipoTransasEliminados(List<TipoTransa> tipotransasEliminados) {
		this.tipotransasEliminados = tipotransasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoTransa() {
		return jComboBoxTiposSeleccionarTipoTransa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoTransa(
			JComboBox jComboBoxTiposSeleccionarTipoTransa) {
		this.jComboBoxTiposSeleccionarTipoTransa = jComboBoxTiposSeleccionarTipoTransa;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoTransa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoTransa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoTransa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoTransa() {
		return jTextFieldValorCampoGeneralTipoTransa;
	}

	public void setjTextFieldValorCampoGeneralTipoTransa(
			JTextField jTextFieldValorCampoGeneralTipoTransa) {
		this.jTextFieldValorCampoGeneralTipoTransa = jTextFieldValorCampoGeneralTipoTransa;
	}

	public void setBorderResaltarValorCampoGeneralTipoTransa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoTransa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoTransa() {
		return this.jCheckBoxSeleccionarTodosTipoTransa;
	}

	public void setjCheckBoxSeleccionarTodosTipoTransa(
			JCheckBox jCheckBoxSeleccionarTodosTipoTransa) {
		this.jCheckBoxSeleccionarTodosTipoTransa = jCheckBoxSeleccionarTodosTipoTransa;
	}

	public void setBorderResaltarSeleccionarTodosTipoTransa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoTransa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoTransa() {
		return this.jCheckBoxSeleccionadosTipoTransa;
	}

	public void setjCheckBoxSeleccionadosTipoTransa(
			JCheckBox jCheckBoxSeleccionadosTipoTransa) {
		this.jCheckBoxSeleccionadosTipoTransa = jCheckBoxSeleccionadosTipoTransa;
	}
	
	public void setBorderResaltarSeleccionadosTipoTransa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoTransa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoTransa() {
		return this.jComboBoxTiposArchivosReportesTipoTransa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoTransa(
			JComboBox jComboBoxTiposArchivosReportesTipoTransa) {
		this.jComboBoxTiposArchivosReportesTipoTransa = jComboBoxTiposArchivosReportesTipoTransa;
	}

	public void setBorderResaltarTiposArchivosReportesTipoTransa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoTransa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoTransa() {
		return this.jComboBoxTiposReportesTipoTransa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoTransa(
			JComboBox jComboBoxTiposReportesTipoTransa) {
		this.jComboBoxTiposReportesTipoTransa = jComboBoxTiposReportesTipoTransa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoTransa() {
	//	return jComboBoxTiposReportesDinamicoTipoTransa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoTransa(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoTransa) {
	//	this.jComboBoxTiposReportesDinamicoTipoTransa = jComboBoxTiposReportesDinamicoTipoTransa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoTransa() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoTransa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoTransa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoTransa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoTransa = jComboBoxTiposArchivosReportesDinamicoTipoTransa;
	//}
	
	public void setBorderResaltarTiposReportesTipoTransa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoTransa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoTransa() {
		return this.jComboBoxTiposGraficosReportesTipoTransa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoTransa(
			JComboBox jComboBoxTiposGraficosReportesTipoTransa) {
		this.jComboBoxTiposGraficosReportesTipoTransa = jComboBoxTiposGraficosReportesTipoTransa;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoTransa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoTransa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoTransa() {
		return this.jComboBoxTiposPaginacionTipoTransa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoTransa(
			JComboBox jComboBoxTiposPaginacionTipoTransa) {
		this.jComboBoxTiposPaginacionTipoTransa = jComboBoxTiposPaginacionTipoTransa;
	}
	
	public void setBorderResaltarTiposPaginacionTipoTransa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoTransa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoTransa() {
		return this.jComboBoxTiposRelacionesTipoTransa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoTransa() {
		return this.jComboBoxTiposAccionesTipoTransa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoTransa(
			JComboBox jComboBoxTiposRelacionesTipoTransa) {
		this.jComboBoxTiposRelacionesTipoTransa = jComboBoxTiposRelacionesTipoTransa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoTransa(
			JComboBox jComboBoxTiposAccionesTipoTransa) {
		this.jComboBoxTiposAccionesTipoTransa = jComboBoxTiposAccionesTipoTransa;
	}
	
	public void setBorderResaltarTiposRelacionesTipoTransa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoTransa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoTransa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoTransa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoTransa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoTransa() {
	//	return jCheckBoxConGraficoDinamicoTipoTransa;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoTransa(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoTransa) {
	//	this.jCheckBoxConGraficoDinamicoTipoTransa = jCheckBoxConGraficoDinamicoTipoTransa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoTransa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoTransa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoTransa .setBorder(borderResaltar);		
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
		this.tipotransaSessionBean=new TipoTransaSessionBean();
		
		this.tipotransaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotransaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipotransaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoTransaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoTransaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoTransaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoTransaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoTransaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Transa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoTransaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoTransa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoTransa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoTransa,this.jTtoolBarTipoTransa,
							"nuevo","nuevo","Nuevo"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoTransa,this.jTtoolBarTipoTransa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoTransa,this.jTtoolBarTipoTransa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoTransa,this.jTtoolBarTipoTransa,
							"duplicar","duplicar","Duplicar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoTransa,this.jTtoolBarTipoTransa,
							"copiar","copiar","Copiar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoTransa,this.jTtoolBarTipoTransa,
							"ver_form","ver_form","Ver"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTransa,this.jTtoolBarTipoTransa,
							"recargar","recargar","Recargar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTransa,this.jTtoolBarTipoTransa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoTransa,this.jTtoolBarTipoTransa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoTransa,this.jTtoolBarTipoTransa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoTransa,this.jTtoolBarTipoTransa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoTransa,this.jTtoolBarTipoTransa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoTransa,this.jTtoolBarTipoTransa,
							"cerrar","cerrar","Salir"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoTransa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoTransa;
			
				this.jButtonProcesarInformacionToolBarTipoTransa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoTransa;
				
		//protected JButton jButtonModificarToolBarTipoTransa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoTransa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoTransa=new JMenuMe("General");
		this.jmenuArchivoTipoTransa=new JMenuMe("Archivo");
		this.jmenuAccionesTipoTransa=new JMenuMe("Acciones");
		this.jmenuDatosTipoTransa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoTransa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoTransa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoTransa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoTransa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoTransa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoTransa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoTransa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoTransa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoTransa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoTransa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoTransa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoTransa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoTransa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoTransa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoTransa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoTransa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoTransa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoTransa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoTransa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoTransa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoTransa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoTransa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoTransa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoTransa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoTransa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoTransa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoTransa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoTransa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoTransa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoTransa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoTransa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoTransa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoTransa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoTransa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoTransa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoTransa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoTransa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoTransa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoTransa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoTransa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoTransa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoTransa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoTransa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoTransa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoTransa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoTransa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoTransa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoTransa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoTransa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoTransa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoTransa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoTransa.add(this.jMenuItemCerrarTipoTransa);
			
			this.jmenuAccionesTipoTransa.add(this.jMenuItemNuevoTipoTransa);
			this.jmenuAccionesTipoTransa.add(this.jMenuItemNuevoGuardarCambiosTipoTransa);
			this.jmenuAccionesTipoTransa.add(this.jMenuItemNuevoRelacionesTipoTransa);
			this.jmenuAccionesTipoTransa.add(this.jMenuItemGuardarCambiosTablaTipoTransa);		
			this.jmenuAccionesTipoTransa.add(this.jMenuItemDuplicarTipoTransa);		
			this.jmenuAccionesTipoTransa.add(this.jMenuItemCopiarTipoTransa);		
			this.jmenuAccionesTipoTransa.add(this.jMenuItemVerFormTipoTransa);		
			
			this.jmenuDatosTipoTransa.add(this.jMenuItemRecargarInformacionTipoTransa);				
			this.jmenuDatosTipoTransa.add(this.jMenuItemAnterioresTipoTransa);				
			this.jmenuDatosTipoTransa.add(this.jMenuItemSiguientesTipoTransa);				
			this.jmenuDatosTipoTransa.add(this.jMenuItemAbrirOrderByTipoTransa);				
			this.jmenuDatosTipoTransa.add(this.jMenuItemMostrarOcultarTipoTransa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoTransa.add(this.jMenuItemGuardarCambiosTipoTransa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoTransa.add(this.jmenuArchivoTipoTransa);		
			this.jmenuBarTipoTransa.add(this.jmenuAccionesTipoTransa);		
			this.jmenuBarTipoTransa.add(this.jmenuDatosTipoTransa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoTransa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoTransa() {
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
			//this.jInternalFrameDetalleTipoTransa = new TipoTransaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Transa DATOS");
			this.jInternalFrameDetalleFormTipoTransa = new TipoTransaDetalleFormJInternalFrame(jDesktopPane,this.tipotransaSessionBean.getConGuardarRelaciones(),this.tipotransaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoTransa = null;//new TipoTransaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoTransa= new GridBagLayout();
		
		
		this.jTableDatosTipoTransa = new JTableMe();      
		
		String sToolTipTipoTransa="";
		sToolTipTipoTransa=TipoTransaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoTransa+="(Cartera.TipoTransa)";
		}
		
		if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoTransa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoTransa.setToolTipText(sToolTipTipoTransa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoTransa);
		this.jTableDatosTipoTransa.setAutoCreateRowSorter(true);
		this.jTableDatosTipoTransa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoTransa.setRowSelectionAllowed(true);
		this.jTableDatosTipoTransa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoTransa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoTransa = new JButtonMe();
		this.jButtonDuplicarTipoTransa = new JButtonMe();
		this.jButtonCopiarTipoTransa = new JButtonMe();
		this.jButtonVerFormTipoTransa = new JButtonMe();
		this.jButtonNuevoRelacionesTipoTransa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoTransa = new JButtonMe();
		this.jButtonCerrarTipoTransa = new JButtonMe();
		
		this.jScrollPanelDatosTipoTransa = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoTransa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoTransa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Transa";
		
		if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Transas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoTransa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoTransa.setToolTipText("Acciones");
        this.jPanelAccionesTipoTransa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoTransa=new ReporteDinamicoJInternalFrame(TipoTransaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoTransa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoTransa=new ImportacionJInternalFrame(TipoTransaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoTransa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoTransa = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoTransa.setText("Orden");
		this.jButtonAbrirOrderByTipoTransa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoTransa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoTransa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoTransa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTransa,false,this);
			
			//this.cargarOrderByTipoTransa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoTransa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTransa,true,this);
			
			//this.cargarOrderByTipoTransa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoTransa.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoTransa.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoTransa.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoTransa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoTransa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoTransa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoTransa.setText("Nuevo");
		this.jButtonDuplicarTipoTransa.setText("Duplicar");
		this.jButtonCopiarTipoTransa.setText("Copiar");
		this.jButtonVerFormTipoTransa.setText("Ver");
		this.jButtonNuevoRelacionesTipoTransa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoTransa.setText("Guardar");
		this.jButtonCerrarTipoTransa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoTransa,"nuevo_button","Nuevo",this.tipotransaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoTransa,"duplicar_button","Duplicar",this.tipotransaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoTransa,"copiar_button","Copiar",this.tipotransaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoTransa,"ver_form","Ver",this.tipotransaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoTransa,"nuevorelaciones_button","Nuevo Rel",this.tipotransaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoTransa,"guardarcambiostabla_button","Guardar",this.tipotransaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoTransa,"cerrar_button","Salir",this.tipotransaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoTransa.setToolTipText("Nuevo"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoTransa.setToolTipText("Duplicar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoTransa.setToolTipText("Copiar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoTransa.setToolTipText("Ver"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoTransa.setToolTipText("Nuevo Rel"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoTransa.setToolTipText("Guardar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoTransa.setToolTipText("Salir"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoTransa";
		inputMap = this.jButtonNuevoTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoTransa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoTransa"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoTransa";
		inputMap = this.jButtonDuplicarTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoTransa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoTransa"));
		
		//COPIAR
		sMapKey = "CopiarTipoTransa";
		inputMap = this.jButtonCopiarTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoTransa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoTransa"));
		
		//VEr FORM
		sMapKey = "VerFormTipoTransa";
		inputMap = this.jButtonVerFormTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoTransa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoTransa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoTransa";
		inputMap = this.jButtonNuevoRelacionesTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoTransa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoTransa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoTransa";
		inputMap = this.jButtonModificarTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoTransa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoTransa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoTransa";
		inputMap = this.jButtonCerrarTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoTransa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoTransa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoTransa";
		inputMap = this.jButtonGuardarCambiosTablaTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoTransa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoTransa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoTransa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoTransa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoTransa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoTransa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoTransa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoTransa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoTransa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoTransa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoTransa.setName("jPanelParametrosReportesTipoTransa"); 
		
		this.jPanelParametrosReportesAccionesTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoTransa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoTransa.setName("jPanelParametrosReportesAccionesTipoTransa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoTransa = new JButtonMe();
		this.jButtonRecargarInformacionTipoTransa.setText("Recargar");
		this.jButtonRecargarInformacionTipoTransa.setToolTipText("Recargar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoTransa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoTransa = new JButtonMe();
		this.jButtonProcesarInformacionTipoTransa.setText("Procesar");
		this.jButtonProcesarInformacionTipoTransa.setToolTipText("Procesar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoTransa.setVisible(false);
			
		this.jButtonProcesarInformacionTipoTransa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoTransa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoTransa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoTransa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTransa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoTransa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoTransa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTransa.setText("TIPO");       
		this.jComboBoxTiposReportesTipoTransa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoTransa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoTransa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoTransa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoTransa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoTransa.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoTransa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoTransa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoTransa.setText("Accion");
		this.jComboBoxTiposRelacionesTipoTransa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoTransa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoTransa.setText("Accion");
		this.jComboBoxTiposAccionesTipoTransa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoTransa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoTransa.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoTransa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoTransa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoTransa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoTransa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoTransa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoTransa = new JLabelMe();
		
		this.jLabelAccionesTipoTransa.setText("Acciones");		
		this.jLabelAccionesTipoTransa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTransa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTransa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoTransa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoTransa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoTransa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoTransa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoTransa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoTransa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoTransa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoTransa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoTransa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoTransa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoTransa.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoTransa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoTransa = new JButtonMe();
		//this.jButtonAnterioresTipoTransa.setText("<<");
        this.jButtonAnterioresTipoTransa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoTransa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoTransa = new JButtonMe();
		//this.jButtonSiguientesTipoTransa.setText(">>");
        this.jButtonSiguientesTipoTransa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoTransa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoTransa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoTransa.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoTransa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoTransa,"nuevoguardarcambios_button","Nue",this.tipotransaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoTransa";
		inputMap = this.jButtonNuevoGuardarCambiosTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoTransa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoTransa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoTransa";
		inputMap = this.jButtonRecargarInformacionTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoTransa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoTransa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoTransa";
		inputMap = this.jButtonSiguientesTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoTransa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoTransa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoTransa";
		inputMap = this.jButtonAnterioresTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoTransa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoTransa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoTransa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoTransa.setMinimumSize(new Dimension(this.getWidth(),TipoTransaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTransaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoTransa.setMaximumSize(new Dimension(this.getWidth(),TipoTransaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTransaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoTransa.setPreferredSize(new Dimension(this.getWidth(),TipoTransaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoTransaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoTransa = new GridBagLayout();

			this.jPanelPaginacionTipoTransa.setLayout(gridaBagLayoutPaginacionTipoTransa);						
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransa.gridy = 0;
			this.gridBagConstraintsTipoTransa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoTransa.add(this.jButtonAnterioresTipoTransa, this.gridBagConstraintsTipoTransa);
					
						
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoTransa.gridy = 0;
			
			this.jPanelPaginacionTipoTransa.add(this.jButtonNuevoGuardarCambiosTipoTransa, this.gridBagConstraintsTipoTransa);
						
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoTransa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoTransa.gridy = 0;
			this.jPanelPaginacionTipoTransa.add(this.jButtonSiguientesTipoTransa, this.gridBagConstraintsTipoTransa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransa.gridy = 1;
			this.gridBagConstraintsTipoTransa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTransa.add(this.jButtonNuevoTipoTransa, this.gridBagConstraintsTipoTransa);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoTransa = new GridBagConstraints();
				this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoTransa.gridy = 1;
				this.gridBagConstraintsTipoTransa.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoTransa.add(this.jButtonNuevoRelacionesTipoTransa, this.gridBagConstraintsTipoTransa);
			}
			
			
			if(!this.tipotransaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoTransa = new GridBagConstraints();
				this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoTransa.gridy = 1;
				this.gridBagConstraintsTipoTransa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoTransa.add(this.jButtonGuardarCambiosTablaTipoTransa, this.gridBagConstraintsTipoTransa);
			}
			
			
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransa.gridy = 1;
			this.gridBagConstraintsTipoTransa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTransa.add(this.jButtonDuplicarTipoTransa, this.gridBagConstraintsTipoTransa);
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransa.gridy = 1;
			this.gridBagConstraintsTipoTransa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTransa.add(this.jButtonCopiarTipoTransa, this.gridBagConstraintsTipoTransa);
		
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransa.gridy = 1;
			this.gridBagConstraintsTipoTransa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoTransa.add(this.jButtonVerFormTipoTransa, this.gridBagConstraintsTipoTransa);
		
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransa.gridy = 1;
			this.gridBagConstraintsTipoTransa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoTransa.add(this.jButtonCerrarTipoTransa, this.gridBagConstraintsTipoTransa);
		
		
		
		this.jButtonRecargarInformacionTipoTransa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoTransa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoTransa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoTransa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoTransa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoTransa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoTransa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoTransa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoTransa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoTransa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoTransa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoTransa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoTransa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoTransa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoTransa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoTransa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoTransa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoTransa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoTransa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTransa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTransa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoTransa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoTransa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoTransa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoTransa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoTransa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoTransa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoTransa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoTransa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoTransa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoTransa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoTransa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoTransa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoTransa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoTransa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoTransa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoTransa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoTransa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoTransa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoTransa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoTransa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoTransa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoTransa.setLayout(gridaBagParametrosReportesTipoTransa);
			this.jPanelParametrosReportesAccionesTipoTransa.setLayout(gridaBagParametrosReportesAccionesTipoTransa);
			
			
			this.jPanelParametrosAuxiliar1TipoTransa.setLayout(gridaBagParametrosAuxiliar1TipoTransa);
			this.jPanelParametrosAuxiliar2TipoTransa.setLayout(gridaBagParametrosAuxiliar2TipoTransa);
			this.jPanelParametrosAuxiliar3TipoTransa.setLayout(gridaBagParametrosAuxiliar3TipoTransa);
			this.jPanelParametrosAuxiliar4TipoTransa.setLayout(gridaBagParametrosAuxiliar4TipoTransa);
			//this.jPanelParametrosAuxiliar5TipoTransa.setLayout(gridaBagParametrosAuxiliar2TipoTransa);			
			
			
			
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTransa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTransa.add(this.jButtonRecargarInformacionTipoTransa, this.gridBagConstraintsTipoTransa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTransa.add(this.jComboBoxTiposPaginacionTipoTransa, this.gridBagConstraintsTipoTransa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTransa.add(this.jCheckBoxConAltoMaximoTablaTipoTransa, this.gridBagConstraintsTipoTransa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoTransa.add(this.jComboBoxTiposArchivosReportesTipoTransa, this.gridBagConstraintsTipoTransa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTransa.add(this.jPanelParametrosAuxiliar1TipoTransa, this.gridBagConstraintsTipoTransa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTransa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoTransa.add(this.jComboBoxTiposReportesTipoTransa, this.gridBagConstraintsTipoTransa);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTransa.add(this.jPanelParametrosAuxiliar4TipoTransa, this.gridBagConstraintsTipoTransa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTransa.add(this.jComboBoxTiposReportesTipoTransa, this.gridBagConstraintsTipoTransa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTransa.add(this.jCheckBoxGenerarReporteTipoTransa, this.gridBagConstraintsTipoTransa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTransa.add(this.jPanelParametrosAuxiliar2TipoTransa, this.gridBagConstraintsTipoTransa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTransa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTransa.add(this.jLabelAccionesTipoTransa, this.gridBagConstraintsTipoTransa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoTransa = new GridBagConstraints();
				this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoTransa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoTransa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoTransa.add(this.jButtonAbrirOrderByTipoTransa, this.gridBagConstraintsTipoTransa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoTransa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTransa.add(this.jComboBoxTiposSeleccionarTipoTransa, this.gridBagConstraintsTipoTransa);			
			
			
			/*
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoTransa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoTransa.add(this.jCheckBoxSeleccionarTodosTipoTransa, this.gridBagConstraintsTipoTransa);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTransa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoTransa.add(this.jCheckBoxSeleccionarTodosTipoTransa, this.gridBagConstraintsTipoTransa);															
				
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoTransa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoTransa.add(this.jCheckBoxSeleccionadosTipoTransa, this.gridBagConstraintsTipoTransa);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoTransa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoTransa.add(this.jPanelParametrosAuxiliar3TipoTransa, this.gridBagConstraintsTipoTransa);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTransa.add(this.jComboBoxTiposRelacionesTipoTransa, this.gridBagConstraintsTipoTransa);
				
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoTransa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoTransa.add(this.jComboBoxTiposAccionesTipoTransa, this.gridBagConstraintsTipoTransa);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoTransa = new GridBagLayout();

			this.jScrollPanelDatosTipoTransa.setLayout(gridaBagLayoutDatosTipoTransa);
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransa.gridy = 0;
			this.gridBagConstraintsTipoTransa.gridx = 0;
			
			this.jScrollPanelDatosTipoTransa.add(this.jTableDatosTipoTransa, this.gridBagConstraintsTipoTransa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoTransa.setViewportView(this.jTableDatosTipoTransa);
		this.jTableDatosTipoTransa.setFillsViewportHeight(true);
		this.jTableDatosTipoTransa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoTransa= new GridBagLayout();
		this.jPanelAccionesTipoTransa.setLayout(gridaBagLayoutAccionesTipoTransa);
		
		
		/*	
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransa.gridy = 0;
		this.gridBagConstraintsTipoTransa.gridx = 0;
			
		this.jPanelAccionesTipoTransa.add(this.jButtonNuevoTipoTransa, this.gridBagConstraintsTipoTransa);
		*/
		int iPosXAccion=0;
		
						
		
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoTransa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoTransa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipotransaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();						
			this.gridBagConstraintsTipoTransa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTransa.gridx = 0;		
			//this.gridBagConstraintsTipoTransa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoTransa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoTransa, this.gridBagConstraintsTipoTransa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoTransa.gridx = 0;		
		//this.gridBagConstraintsTipoTransa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoTransa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoTransa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoTransa, this.gridBagConstraintsTipoTransa);								
		
		
		/*
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoTransa, this.gridBagConstraintsTipoTransa);
		*/		
		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoTransa.gridx =0;
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoTransa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoTransa, this.gridBagConstraintsTipoTransa);
				
		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoTransa, this.gridBagConstraintsTipoTransa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoTransaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoTransa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoTransa = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoTransa.setLayout(gridaBagLayoutBusquedasParametrosTipoTransa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoTransa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoTransa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTransa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTransa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoTransa, this.gridBagConstraintsTipoTransa);
			
			
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoTransa, this.gridBagConstraintsTipoTransa);
		
			
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoTransa, this.gridBagConstraintsTipoTransa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoTransa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoTransa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoTransa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoTransa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoTransa.setName("jPanelReporteDinamicoTipoTransa"); 
		
		this.jPanelReporteDinamicoTipoTransa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoTransa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoTransa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoTransa.setLayout(gridaBagLayoutReporteDinamicoTipoTransa);
		
		
		this.jInternalFrameReporteDinamicoTipoTransa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoTransa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoTransa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoTransa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoTransa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoTransa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoTransa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoTransa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoTransa.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoTransa.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoTransa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoTransa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoTransa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoTransa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Transas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoTransa = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoTransa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoTransa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoTransa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoTransa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTransa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoTransa.add(this.jLabelColumnasSelectReporteTipoTransa, this.gridBagConstraintsTipoTransa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoTransa = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoTransa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoTransa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoTransa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoTransa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoTransa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoTransa=new JScrollPane(this.jListColumnasSelectReporteTipoTransa);
			
			this.jScrollColumnasSelectReporteTipoTransa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoTransa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoTransa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTransa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoTransa.add(this.jListColumnasSelectReporteTipoTransa, this.gridBagConstraintsTipoTransa);
		this.jPanelReporteDinamicoTipoTransa.add(this.jScrollColumnasSelectReporteTipoTransa, this.gridBagConstraintsTipoTransa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoTransa = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoTransa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoTransa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoTransa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoTransa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTransa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoTransa.add(this.jLabelRelacionesSelectReporteTipoTransa, this.gridBagConstraintsTipoTransa);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoTransa = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoTransa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoTransa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoTransa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoTransa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoTransa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoTransa=new JScrollPane(this.jListRelacionesSelectReporteTipoTransa);
			
			this.jScrollRelacionesSelectReporteTipoTransa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoTransa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoTransa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTransa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoTransa.add(this.jListRelacionesSelectReporteTipoTransa, this.gridBagConstraintsTipoTransa);
		this.jPanelReporteDinamicoTipoTransa.add(this.jScrollRelacionesSelectReporteTipoTransa, this.gridBagConstraintsTipoTransa);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoTransa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoTransa = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoTransa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoTransa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoTransa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoTransa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoTransa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoTransa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoTransa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoTransa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoTransa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoTransa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoTransa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoTransa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoTransa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoTransa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoTransa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoTransa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTransa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoTransa.add(this.jLabelGenerarExcelReporteDinamicoTipoTransa, this.gridBagConstraintsTipoTransa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoTransa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoTransa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoTransa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoTransa.setToolTipText("Generar EXCEL"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		//this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoTransa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoTransa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoTransa.add(this.jButtonGenerarExcelReporteDinamicoTipoTransa, this.gridBagConstraintsTipoTransa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTransa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTransa.add(this.jComboBoxTiposReportesDinamicoTipoTransa, this.gridBagConstraintsTipoTransa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoTransa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoTransa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoTransa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoTransa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoTransa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoTransa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoTransa.add(this.jLabelTiposArchivoReporteDinamicoTipoTransa, this.gridBagConstraintsTipoTransa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTransa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTransa.add(this.jComboBoxTiposArchivosReportesDinamicoTipoTransa, this.gridBagConstraintsTipoTransa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoTransa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoTransa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoTransa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoTransa.setToolTipText("Generar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTransa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTransa.add(this.jButtonGenerarReporteDinamicoTipoTransa, this.gridBagConstraintsTipoTransa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoTransa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoTransa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoTransa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoTransa.setToolTipText("Cancelar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoTransa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoTransa.add(this.jButtonCerrarReporteDinamicoTipoTransa, this.gridBagConstraintsTipoTransa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoTransa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoTransa= new JScrollPane(jPanelReporteDinamicoTipoTransa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoTransa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoTransa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoTransa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Transas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoTransa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoTransa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoTransa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoTransa);
		this.jInternalFrameReporteDinamicoTipoTransa.getContentPane().add(this.jScrollPanelReporteDinamicoTipoTransa, this.gridBagConstraintsTipoTransa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoTransa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoTransa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoTransa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoTransa.setName("jPanelImportacionTipoTransa"); 
		
		this.jPanelImportacionTipoTransa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoTransa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoTransa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoTransa.setLayout(gridaBagLayoutImportacionTipoTransa);
		
		
		this.jInternalFrameImportacionTipoTransa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoTransa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoTransa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoTransa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoTransa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoTransa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoTransa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoTransa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoTransa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoTransa.setResizable(true);
	    this.jInternalFrameImportacionTipoTransa.setClosable(true);
	    this.jInternalFrameImportacionTipoTransa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoTransa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoTransa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoTransa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoTransa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoTransa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoTransa.setResizable(true);
	    this.jInternalFrameImportacionTipoTransa.setClosable(true);
	    this.jInternalFrameImportacionTipoTransa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoTransa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoTransa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoTransa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Transas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoTransa = new JLabelMe();

		this.jLabelArchivoImportacionTipoTransa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoTransa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoTransa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoTransa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoTransa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoTransa.add(this.jLabelArchivoImportacionTipoTransa, this.gridBagConstraintsTipoTransa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoTransa = new JFileChooser();		
		this.jFileChooserImportacionTipoTransa.setToolTipText("ESCOGER ARCHIVO"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoTransa = new JButtonMe();
		this.jButtonAbrirImportacionTipoTransa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoTransa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoTransa.setToolTipText("Generar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTransa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTransa.add(this.jButtonAbrirImportacionTipoTransa, this.gridBagConstraintsTipoTransa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoTransa = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoTransa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoTransa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoTransa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoTransa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransa.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoTransa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoTransa.add(this.jLabelPathArchivoImportacionTipoTransa, this.gridBagConstraintsTipoTransa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoTransa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoTransa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoTransa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoTransa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTransa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTransa.add(this.jTextFieldPathArchivoImportacionTipoTransa, this.gridBagConstraintsTipoTransa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoTransa = new JButtonMe();
		this.jButtonGenerarImportacionTipoTransa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoTransa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoTransa.setToolTipText("Generar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTransa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTransa.add(this.jButtonGenerarImportacionTipoTransa, this.gridBagConstraintsTipoTransa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoTransa = new JButtonMe();
		this.jButtonCerrarImportacionTipoTransa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoTransa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoTransa.setToolTipText("Cancelar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransa.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoTransa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoTransa.add(this.jButtonCerrarImportacionTipoTransa, this.gridBagConstraintsTipoTransa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoTransa = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoTransa= new JScrollPane(jPanelImportacionTipoTransa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoTransa.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoTransa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoTransa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoTransa);
		this.jInternalFrameImportacionTipoTransa.getContentPane().add(this.jScrollPanelImportacionTipoTransa, this.gridBagConstraintsTipoTransa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoTransa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoTransa = new JButtonMe();
			this.jButtonAbrirOrderByTipoTransa.setText("Orden");
			this.jButtonAbrirOrderByTipoTransa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoTransa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoTransa";
			inputMap = this.jButtonAbrirOrderByTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoTransa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoTransa"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoTransa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoTransa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoTransa.setName("jPanelOrderByTipoTransa"); 
			
			this.jPanelOrderByTipoTransa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoTransa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoTransa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoTransa.setLayout(gridaBagLayoutOrderByTipoTransa);
			
			
			this.jTableDatosTipoTransaOrderBy = new JTableMe();        
			this.jTableDatosTipoTransaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoTransaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoTransaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoTransaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoTransaOrderBy.setViewportView(this.jTableDatosTipoTransaOrderBy);
			this.jTableDatosTipoTransaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoTransaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoTransa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoTransa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoTransa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoTransa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoTransa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoTransa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoTransa.setTitle("Orden");
			this.jInternalFrameOrderByTipoTransa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoTransa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoTransa.setResizable(true);
			this.jInternalFrameOrderByTipoTransa.setClosable(true);
			this.jInternalFrameOrderByTipoTransa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoTransa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoTransa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoTransa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Transas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoTransa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoTransa.ipady =150;
				
			this.jPanelOrderByTipoTransa.add(jScrollPanelDatosTipoTransaOrderBy, this.gridBagConstraintsTipoTransa);//this.jTableDatosTipoTransaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoTransa = new JButtonMe();
			this.jButtonCerrarOrderByTipoTransa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoTransa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoTransa.setToolTipText("Cancelar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoTransa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoTransa.add(this.jButtonCerrarOrderByTipoTransa, this.gridBagConstraintsTipoTransa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoTransa = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoTransa= new JScrollPane(jPanelOrderByTipoTransa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoTransa.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoTransa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoTransa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoTransa);
			
			this.jInternalFrameOrderByTipoTransa.getContentPane().add(this.jScrollPanelOrderByTipoTransa, this.gridBagConstraintsTipoTransa);			
		
		} else {
			this.jButtonAbrirOrderByTipoTransa = new JButtonMe();
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
		int iWidthTableCalculado=0;//630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipotransaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoTransa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoTransa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoTransa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoTransa.getRowHeight();//TipoTransaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoTransaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoTransa.isSelected()) {
					iHeightTable=TipoTransaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoTransaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoTransaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoTransaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoTransa.isSelected()) {
					iHeightTable=TipoTransaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoTransaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoTransaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoTransa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoTransa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoTransa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoTransa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoTransa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoTransa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoTransa!=null && this.jInternalFrameOrderByTipoTransa.getjTableDatosOrderBy()!=null) {
			//if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoTransa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoTransa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoTransa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoTransa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoTransa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoTransa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoTransa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoTransa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoTransa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoTransa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipotransaLogic.getTipoTransas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotransas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoTransa> TraerTipoTransaBeans(List<TipoTransa> tipotransas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoTransa tipotransa:tipotransas) {
					
				if(!(TipoTransaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoTransaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipotransa.setsDetalleGeneralEntityReporte(TipoTransaConstantesFunciones.getTipoTransaDescripcion(tipotransa));
										
						
					
					

					if(tipotransa.getTransaccions()!=null && Funciones.existeClass(classes,Transaccion.class)) {
						try{tipotransa.settransaccionsDescripcionReporte(new JRBeanCollectionDataSource(TransaccionJInternalFrame.TraerTransaccionBeans(tipotransa.getTransaccions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipotransa.setsDetalleGeneralEntityReporte(tipotransa.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipotransabeans.add(tipotransabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipotransas;
    }
	//PARA REPORTES FIN
}
