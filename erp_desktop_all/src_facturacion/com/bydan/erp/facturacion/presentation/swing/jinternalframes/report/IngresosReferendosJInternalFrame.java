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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;





//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.IngresosReferendosConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class IngresosReferendosJInternalFrame extends IngresosReferendosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarIngresosReferendos;
	
	protected JMenuBar jmenuBarIngresosReferendos;
	
	protected JMenu jmenuIngresosReferendos;
	protected JMenu jmenuDatosIngresosReferendos;
	protected JMenu jmenuArchivoIngresosReferendos;
	protected JMenu jmenuAccionesIngresosReferendos;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosIngresosReferendos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutIngresosReferendos;	
	protected GridBagConstraints gridBagConstraintsIngresosReferendos;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public IngresosReferendosDetalleFormJInternalFrame jInternalFrameDetalleFormIngresosReferendos;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoIngresosReferendos;	
	protected ImportacionJInternalFrame jInternalFrameImportacionIngresosReferendos;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public IngresosReferendosSessionBean ingresosreferendosSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<IngresosReferendos> ingresosreferendoss;		
	public List<IngresosReferendos> ingresosreferendossEliminados;	
	public List<IngresosReferendos> ingresosreferendossAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByIngresosReferendos;		
	protected JButton jButtonAbrirOrderByIngresosReferendos;
	
	
	//protected JPanel jPanelOrderByIngresosReferendos;
	//public JScrollPane jScrollPanelOrderByIngresosReferendos;	
	//protected JButton jButtonCerrarOrderByIngresosReferendos;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public IngresosReferendosLogic ingresosreferendosLogic;
	
	
	
	public JScrollPane jScrollPanelDatosIngresosReferendos;
	public JScrollPane jScrollPanelDatosEdicionIngresosReferendos;
	public JScrollPane jScrollPanelDatosGeneralIngresosReferendos;
    
	
	
	//public JScrollPane jScrollPanelDatosIngresosReferendosOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoIngresosReferendos;
	//public JScrollPane jScrollPanelImportacionIngresosReferendos;
	
	
	
	protected JPanel jPanelAccionesIngresosReferendos;
	
    protected JPanel jPanelPaginacionIngresosReferendos;
    protected JPanel jPanelParametrosReportesIngresosReferendos;
	protected JPanel jPanelParametrosReportesAccionesIngresosReferendos;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1IngresosReferendos;
	protected JPanel jPanelParametrosAuxiliar2IngresosReferendos;
	protected JPanel jPanelParametrosAuxiliar3IngresosReferendos;
	protected JPanel jPanelParametrosAuxiliar4IngresosReferendos;
	//protected JPanel jPanelParametrosAuxiliar5IngresosReferendos;
	
	
	
	//protected JPanel jPanelReporteDinamicoIngresosReferendos;
	//protected JPanel jPanelImportacionIngresosReferendos;
	
	
	public JTable jTableDatosIngresosReferendos;
	
	
	
	//public JTable jTableDatosIngresosReferendosOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoIngresosReferendos;
	protected JButton jButtonDuplicarIngresosReferendos;
	protected JButton jButtonCopiarIngresosReferendos;
	protected JButton jButtonVerFormIngresosReferendos;
	protected JButton jButtonNuevoRelacionesIngresosReferendos;
	protected JButton jButtonModificarIngresosReferendos;
	
    protected JButton jButtonGuardarCambiosTablaIngresosReferendos;
	protected JButton jButtonCerrarIngresosReferendos;
	
	
	protected JButton jButtonRecargarInformacionIngresosReferendos;
	protected JButton jButtonProcesarInformacionIngresosReferendos;
	
	
	protected JButton jButtonAnterioresIngresosReferendos;
	protected JButton jButtonSiguientesIngresosReferendos;
	protected JButton jButtonNuevoGuardarCambiosIngresosReferendos;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoIngresosReferendos;
	//protected JButton jButtonCerrarReporteDinamicoIngresosReferendos;
	//protected JButton jButtonGenerarExcelReporteDinamicoIngresosReferendos;	
	
	
	
	//protected JButton jButtonAbrirImportacionIngresosReferendos;
	//protected JButton jButtonGenerarImportacionIngresosReferendos;
	//protected JButton jButtonCerrarImportacionIngresosReferendos;
	//protected JFileChooser jFileChooserImportacionIngresosReferendos;
	//protected File fileImportacionIngresosReferendos;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarIngresosReferendos;
	protected JButton jButtonDuplicarToolBarIngresosReferendos;
	protected JButton jButtonNuevoRelacionesToolBarIngresosReferendos;
	
	
	public JButton jButtonGuardarCambiosToolBarIngresosReferendos;
	protected JButton jButtonCopiarToolBarIngresosReferendos;
	protected JButton jButtonVerFormToolBarIngresosReferendos;
	public JButton jButtonGuardarCambiosTablaToolBarIngresosReferendos;
	protected JButton jButtonMostrarOcultarTablaToolBarIngresosReferendos;
	protected JButton jButtonCerrarToolBarIngresosReferendos;
	
	protected JButton jButtonRecargarInformacionToolBarIngresosReferendos;
	protected JButton jButtonProcesarInformacionToolBarIngresosReferendos;
	protected JButton jButtonAnterioresToolBarIngresosReferendos;
	protected JButton jButtonSiguientesToolBarIngresosReferendos;
	protected JButton jButtonNuevoGuardarCambiosToolBarIngresosReferendos;
	protected JButton jButtonAbrirOrderByToolBarIngresosReferendos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoIngresosReferendos;
	protected JMenuItem jMenuItemDuplicarIngresosReferendos;
	protected JMenuItem jMenuItemNuevoRelacionesIngresosReferendos;
	
	
	protected JMenuItem jMenuItemGuardarCambiosIngresosReferendos;
	protected JMenuItem jMenuItemCopiarIngresosReferendos;
	protected JMenuItem jMenuItemVerFormIngresosReferendos;
	protected JMenuItem jMenuItemGuardarCambiosTablaIngresosReferendos;
	protected JMenuItem jMenuItemCerrarIngresosReferendos;
	protected JMenuItem jMenuItemDetalleCerrarIngresosReferendos;
	protected JMenuItem jMenuItemDetalleAbrirOrderByIngresosReferendos;
	protected JMenuItem jMenuItemDetalleMostarOcultarIngresosReferendos;
	
	protected JMenuItem jMenuItemRecargarInformacionIngresosReferendos;
	protected JMenuItem jMenuItemProcesarInformacionIngresosReferendos;
	protected JMenuItem jMenuItemAnterioresIngresosReferendos;
	protected JMenuItem jMenuItemSiguientesIngresosReferendos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosIngresosReferendos;
	protected JMenuItem jMenuItemAbrirOrderByIngresosReferendos;
	protected JMenuItem jMenuItemMostrarOcultarIngresosReferendos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesIngresosReferendos;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosIngresosReferendos;
	protected JCheckBox jCheckBoxSeleccionadosIngresosReferendos;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaIngresosReferendos;
	protected JCheckBox jCheckBoxConGraficoReporteIngresosReferendos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesIngresosReferendos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesIngresosReferendos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoIngresosReferendos;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoIngresosReferendos;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesIngresosReferendos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionIngresosReferendos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesIngresosReferendos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesIngresosReferendos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarIngresosReferendos;
	protected JTextField jTextFieldValorCampoGeneralIngresosReferendos;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteIngresosReferendos;
	//public JList<Reporte> jListColumnasSelectReporteIngresosReferendos;
	//public JScrollPane jScrollColumnasSelectReporteIngresosReferendos;
	
	//public JLabel jLabelRelacionesSelectReporteIngresosReferendos;
	//public JList<Reporte> jListRelacionesSelectReporteIngresosReferendos;
	//public JScrollPane jScrollRelacionesSelectReporteIngresosReferendos;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoIngresosReferendos;
	//protected JCheckBox jCheckBoxConGraficoDinamicoIngresosReferendos;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoIngresosReferendos;
	//public JLabel jLabelTiposArchivoReporteDinamicoIngresosReferendos;
	
		
	//public JLabel jLabelArchivoImportacionIngresosReferendos;	
	//public JLabel jLabelPathArchivoImportacionIngresosReferendos;
	//protected JTextField jTextFieldPathArchivoImportacionIngresosReferendos;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoIngresosReferendos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoIngresosReferendos;
	
	//public JLabel jLabelColumnaCategoriaValorIngresosReferendos;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorIngresosReferendos;
	
	//public JLabel jLabelColumnasValoresGraficoIngresosReferendos;
	//public JList<Reporte> jListColumnasValoresGraficoIngresosReferendos;
	//public JScrollPane jScrollColumnasValoresGraficoIngresosReferendos;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoIngresosReferendos;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoIngresosReferendos;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasIngresosReferendos;
	public JPanel jPanelBusquedaIngresosReferendosIngresosReferendos;
	public JButton jButtonBusquedaIngresosReferendosIngresosReferendos;
	
	public JPanel jPanelfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos;
	public JLabel jLabelfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos;

	public JDateChooser jDateChooserfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos;
	public JButton jButtonfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendosBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos;
	public JLabel jLabelfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos;

	public JDateChooser jDateChooserfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos;
	public JButton jButtonfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendosBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	//public int iHeightFormulario=1342;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public IngresosReferendosJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("IngresosReferendos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngresosReferendosJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("IngresosReferendos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngresosReferendosJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("IngresosReferendos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngresosReferendosJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("IngresosReferendos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionIngresosReferendos)	{
		this.jButtonRecargarInformacionIngresosReferendos = jButtonRecargarInformacionIngresosReferendos;
	}
	
	public JButton getjButtonProcesarInformacionIngresosReferendos() {
		return this.jButtonProcesarInformacionIngresosReferendos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionIngresosReferendos)	{
		this.jButtonProcesarInformacionIngresosReferendos = jButtonProcesarInformacionIngresosReferendos;
	}
	
	
	public JButton getjButtonRecargarInformacionIngresosReferendos() {
		return this.jButtonRecargarInformacionIngresosReferendos;
	}
	
	
	public List<IngresosReferendos> getingresosreferendoss() {
		return this.ingresosreferendoss;
	}

	public void setingresosreferendoss(List<IngresosReferendos> ingresosreferendoss) {
		this.ingresosreferendoss = ingresosreferendoss;
	}
	
	public List<IngresosReferendos> getingresosreferendossAux() {
		return this.ingresosreferendossAux;
	}

	public void setingresosreferendossAux(List<IngresosReferendos> ingresosreferendossAux) {
		this.ingresosreferendossAux = ingresosreferendossAux;
	}
	
	public List<IngresosReferendos> getingresosreferendossEliminados() {
		return this.ingresosreferendossEliminados;
	}

	public void setIngresosReferendossEliminados(List<IngresosReferendos> ingresosreferendossEliminados) {
		this.ingresosreferendossEliminados = ingresosreferendossEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarIngresosReferendos() {
		return jComboBoxTiposSeleccionarIngresosReferendos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarIngresosReferendos(
			JComboBox jComboBoxTiposSeleccionarIngresosReferendos) {
		this.jComboBoxTiposSeleccionarIngresosReferendos = jComboBoxTiposSeleccionarIngresosReferendos;
	}
	
	public void setBorderResaltarTiposSeleccionarIngresosReferendos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarIngresosReferendos.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarIngresosReferendos .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralIngresosReferendos() {
		return jTextFieldValorCampoGeneralIngresosReferendos;
	}

	public void setjTextFieldValorCampoGeneralIngresosReferendos(
			JTextField jTextFieldValorCampoGeneralIngresosReferendos) {
		this.jTextFieldValorCampoGeneralIngresosReferendos = jTextFieldValorCampoGeneralIngresosReferendos;
	}

	public void setBorderResaltarValorCampoGeneralIngresosReferendos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosReferendos.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralIngresosReferendos .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosIngresosReferendos() {
		return this.jCheckBoxSeleccionarTodosIngresosReferendos;
	}

	public void setjCheckBoxSeleccionarTodosIngresosReferendos(
			JCheckBox jCheckBoxSeleccionarTodosIngresosReferendos) {
		this.jCheckBoxSeleccionarTodosIngresosReferendos = jCheckBoxSeleccionarTodosIngresosReferendos;
	}

	public void setBorderResaltarSeleccionarTodosIngresosReferendos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosReferendos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosIngresosReferendos .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosIngresosReferendos() {
		return this.jCheckBoxSeleccionadosIngresosReferendos;
	}

	public void setjCheckBoxSeleccionadosIngresosReferendos(
			JCheckBox jCheckBoxSeleccionadosIngresosReferendos) {
		this.jCheckBoxSeleccionadosIngresosReferendos = jCheckBoxSeleccionadosIngresosReferendos;
	}
	
	public void setBorderResaltarSeleccionadosIngresosReferendos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosReferendos.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosIngresosReferendos .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesIngresosReferendos() {
		return this.jComboBoxTiposArchivosReportesIngresosReferendos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesIngresosReferendos(
			JComboBox jComboBoxTiposArchivosReportesIngresosReferendos) {
		this.jComboBoxTiposArchivosReportesIngresosReferendos = jComboBoxTiposArchivosReportesIngresosReferendos;
	}

	public void setBorderResaltarTiposArchivosReportesIngresosReferendos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosReferendos.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesIngresosReferendos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesIngresosReferendos() {
		return this.jComboBoxTiposReportesIngresosReferendos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesIngresosReferendos(
			JComboBox jComboBoxTiposReportesIngresosReferendos) {
		this.jComboBoxTiposReportesIngresosReferendos = jComboBoxTiposReportesIngresosReferendos;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoIngresosReferendos() {
	//	return jComboBoxTiposReportesDinamicoIngresosReferendos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoIngresosReferendos(
	//		JComboBox jComboBoxTiposReportesDinamicoIngresosReferendos) {
	//	this.jComboBoxTiposReportesDinamicoIngresosReferendos = jComboBoxTiposReportesDinamicoIngresosReferendos;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoIngresosReferendos() {
	//	return jComboBoxTiposArchivosReportesDinamicoIngresosReferendos;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoIngresosReferendos(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoIngresosReferendos) {
	//	this.jComboBoxTiposArchivosReportesDinamicoIngresosReferendos = jComboBoxTiposArchivosReportesDinamicoIngresosReferendos;
	//}
	
	public void setBorderResaltarTiposReportesIngresosReferendos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosReferendos.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesIngresosReferendos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesIngresosReferendos() {
		return this.jComboBoxTiposGraficosReportesIngresosReferendos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesIngresosReferendos(
			JComboBox jComboBoxTiposGraficosReportesIngresosReferendos) {
		this.jComboBoxTiposGraficosReportesIngresosReferendos = jComboBoxTiposGraficosReportesIngresosReferendos;
	}
	
	public void setBorderResaltarTiposGraficosReportesIngresosReferendos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosReferendos.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesIngresosReferendos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionIngresosReferendos() {
		return this.jComboBoxTiposPaginacionIngresosReferendos;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionIngresosReferendos(
			JComboBox jComboBoxTiposPaginacionIngresosReferendos) {
		this.jComboBoxTiposPaginacionIngresosReferendos = jComboBoxTiposPaginacionIngresosReferendos;
	}
	
	public void setBorderResaltarTiposPaginacionIngresosReferendos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosReferendos.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionIngresosReferendos .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesIngresosReferendos() {
		return this.jComboBoxTiposRelacionesIngresosReferendos;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesIngresosReferendos() {
		return this.jComboBoxTiposAccionesIngresosReferendos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesIngresosReferendos(
			JComboBox jComboBoxTiposRelacionesIngresosReferendos) {
		this.jComboBoxTiposRelacionesIngresosReferendos = jComboBoxTiposRelacionesIngresosReferendos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesIngresosReferendos(
			JComboBox jComboBoxTiposAccionesIngresosReferendos) {
		this.jComboBoxTiposAccionesIngresosReferendos = jComboBoxTiposAccionesIngresosReferendos;
	}
	
	public void setBorderResaltarTiposRelacionesIngresosReferendos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosReferendos.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesIngresosReferendos .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesIngresosReferendos() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarIngresosReferendos.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesIngresosReferendos .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoIngresosReferendos() {
	//	return jCheckBoxConGraficoDinamicoIngresosReferendos;
	//}

	//public void setjCheckBoxConGraficoDinamicoIngresosReferendos(
	//		JCheckBox jCheckBoxConGraficoDinamicoIngresosReferendos) {
	//	this.jCheckBoxConGraficoDinamicoIngresosReferendos = jCheckBoxConGraficoDinamicoIngresosReferendos;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoIngresosReferendos() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarIngresosReferendos.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoIngresosReferendos .setBorder(borderResaltar);		
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
		this.ingresosreferendosSessionBean=new IngresosReferendosSessionBean();
		
		this.ingresosreferendosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ingresosreferendosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ingresosreferendosSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=IngresosReferendosJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=IngresosReferendosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		IngresosReferendosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		IngresosReferendosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		IngresosReferendosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ingresos Referendos MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
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
		
		IngresosReferendosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("IngresosReferendos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarIngresosReferendos= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarIngresosReferendos,this.jTtoolBarIngresosReferendos,
							"nuevo","nuevo","Nuevo"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarIngresosReferendos,this.jTtoolBarIngresosReferendos,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarIngresosReferendos,this.jTtoolBarIngresosReferendos,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarIngresosReferendos,this.jTtoolBarIngresosReferendos,
							"duplicar","duplicar","Duplicar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarIngresosReferendos,this.jTtoolBarIngresosReferendos,
							"copiar","copiar","Copiar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarIngresosReferendos,this.jTtoolBarIngresosReferendos,
							"ver_form","ver_form","Ver"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarIngresosReferendos,this.jTtoolBarIngresosReferendos,
							"recargar","recargar","Buscar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Buscar",false);
		
		
		
		this.jButtonAnterioresToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarIngresosReferendos,this.jTtoolBarIngresosReferendos,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarIngresosReferendos,this.jTtoolBarIngresosReferendos,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarIngresosReferendos,this.jTtoolBarIngresosReferendos,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarIngresosReferendos,this.jTtoolBarIngresosReferendos,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarIngresosReferendos,this.jTtoolBarIngresosReferendos,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarIngresosReferendos,this.jTtoolBarIngresosReferendos,
							"cerrar","cerrar","Salir"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarIngresosReferendos=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarIngresosReferendos;
			
				this.jButtonProcesarInformacionToolBarIngresosReferendos=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarIngresosReferendos;
				
		//protected JButton jButtonModificarToolBarIngresosReferendos;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarIngresosReferendos=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuIngresosReferendos=new JMenuMe("General");
		this.jmenuArchivoIngresosReferendos=new JMenuMe("Archivo");
		this.jmenuAccionesIngresosReferendos=new JMenuMe("Acciones");
		this.jmenuDatosIngresosReferendos=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoIngresosReferendos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoIngresosReferendos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoIngresosReferendos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarIngresosReferendos= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarIngresosReferendos.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarIngresosReferendos,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesIngresosReferendos= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesIngresosReferendos.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesIngresosReferendos,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosIngresosReferendos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosIngresosReferendos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosIngresosReferendos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarIngresosReferendos= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarIngresosReferendos.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarIngresosReferendos,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormIngresosReferendos= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormIngresosReferendos.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormIngresosReferendos,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaIngresosReferendos= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaIngresosReferendos.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaIngresosReferendos,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarIngresosReferendos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarIngresosReferendos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarIngresosReferendos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionIngresosReferendos= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionIngresosReferendos.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionIngresosReferendos,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionIngresosReferendos= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionIngresosReferendos.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionIngresosReferendos,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresIngresosReferendos= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresIngresosReferendos.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresIngresosReferendos,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesIngresosReferendos= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesIngresosReferendos.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesIngresosReferendos,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByIngresosReferendos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByIngresosReferendos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByIngresosReferendos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarIngresosReferendos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarIngresosReferendos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarIngresosReferendos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByIngresosReferendos= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByIngresosReferendos.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByIngresosReferendos,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarIngresosReferendos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarIngresosReferendos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarIngresosReferendos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosIngresosReferendos= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosIngresosReferendos.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosIngresosReferendos,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoIngresosReferendos.add(this.jMenuItemCerrarIngresosReferendos);
			
			this.jmenuAccionesIngresosReferendos.add(this.jMenuItemNuevoIngresosReferendos);
			this.jmenuAccionesIngresosReferendos.add(this.jMenuItemNuevoGuardarCambiosIngresosReferendos);
			this.jmenuAccionesIngresosReferendos.add(this.jMenuItemNuevoRelacionesIngresosReferendos);
			this.jmenuAccionesIngresosReferendos.add(this.jMenuItemGuardarCambiosTablaIngresosReferendos);		
			this.jmenuAccionesIngresosReferendos.add(this.jMenuItemDuplicarIngresosReferendos);		
			this.jmenuAccionesIngresosReferendos.add(this.jMenuItemCopiarIngresosReferendos);		
			this.jmenuAccionesIngresosReferendos.add(this.jMenuItemVerFormIngresosReferendos);		
			
			this.jmenuDatosIngresosReferendos.add(this.jMenuItemRecargarInformacionIngresosReferendos);				
			this.jmenuDatosIngresosReferendos.add(this.jMenuItemAnterioresIngresosReferendos);				
			this.jmenuDatosIngresosReferendos.add(this.jMenuItemSiguientesIngresosReferendos);				
			this.jmenuDatosIngresosReferendos.add(this.jMenuItemAbrirOrderByIngresosReferendos);				
			this.jmenuDatosIngresosReferendos.add(this.jMenuItemMostrarOcultarIngresosReferendos);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesIngresosReferendos.add(this.jMenuItemGuardarCambiosIngresosReferendos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarIngresosReferendos.add(this.jmenuArchivoIngresosReferendos);		
			this.jmenuBarIngresosReferendos.add(this.jmenuAccionesIngresosReferendos);		
			this.jmenuBarIngresosReferendos.add(this.jmenuDatosIngresosReferendos);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarIngresosReferendos);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasIngresosReferendos() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaIngresosReferendosIngresosReferendos=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaIngresosReferendosIngresosReferendos.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		this.jButtonBusquedaIngresosReferendosIngresosReferendos= new JButtonMe();
		this.jButtonBusquedaIngresosReferendosIngresosReferendos.setText("Buscar");
		this.jButtonBusquedaIngresosReferendosIngresosReferendos.setToolTipText("Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaIngresosReferendosIngresosReferendos,"buscar_button","Buscar Por Fecha Emision Desde Por Fecha Emision Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaIngresosReferendosIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos = new JLabelMe();
		jLabelfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos.setText("Fecha Emision Desde :");
		jLabelfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos.setToolTipText("Fecha Emision Desde");
		jLabelfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos= new JDateChooser();
		jDateChooserfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos.setDate(new Date());
		jDateChooserfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos.setText(Funciones.getStringMySqlCurrentDate());



	
		jLabelfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos = new JLabelMe();
		jLabelfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos.setText("Fecha Emision Hasta :");
		jLabelfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos.setToolTipText("Fecha Emision Hasta");
		jLabelfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos= new JDateChooser();
		jDateChooserfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos.setDate(new Date());
		jDateChooserfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos.setText(Funciones.getStringMySqlCurrentDate());




		this.jTabbedPaneBusquedasIngresosReferendos=new JTabbedPane();


		this.jTabbedPaneBusquedasIngresosReferendos.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasIngresosReferendos.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasIngresosReferendos.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasIngresosReferendos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasIngresosReferendos,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleIngresosReferendos = new IngresosReferendosDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Ingresos Referendos DATOS");
			this.jInternalFrameDetalleFormIngresosReferendos = new IngresosReferendosDetalleFormJInternalFrame(jDesktopPane,this.ingresosreferendosSessionBean.getConGuardarRelaciones(),this.ingresosreferendosSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormIngresosReferendos = null;//new IngresosReferendosDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutIngresosReferendos= new GridBagLayout();
		
		
		this.jTableDatosIngresosReferendos = new JTableMe();      
		
		String sToolTipIngresosReferendos="";
		sToolTipIngresosReferendos=IngresosReferendosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipIngresosReferendos+="(Facturacion.IngresosReferendos)";
		}
		
		if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
			sToolTipIngresosReferendos+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosIngresosReferendos.setToolTipText(sToolTipIngresosReferendos);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosIngresosReferendos);
		this.jTableDatosIngresosReferendos.setAutoCreateRowSorter(true);
		this.jTableDatosIngresosReferendos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosIngresosReferendos.setRowSelectionAllowed(true);
		this.jTableDatosIngresosReferendos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosIngresosReferendos,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoIngresosReferendos = new JButtonMe();
		this.jButtonDuplicarIngresosReferendos = new JButtonMe();
		this.jButtonCopiarIngresosReferendos = new JButtonMe();
		this.jButtonVerFormIngresosReferendos = new JButtonMe();
		this.jButtonNuevoRelacionesIngresosReferendos = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaIngresosReferendos = new JButtonMe();
		this.jButtonCerrarIngresosReferendos = new JButtonMe();
		
		this.jScrollPanelDatosIngresosReferendos = new JScrollPane();   
        this.jScrollPanelDatosGeneralIngresosReferendos = new JScrollPane();
		
				
		
		
		this.jPanelAccionesIngresosReferendos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Ingresos Referendos";
		
		if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingresos Referendoses" + this.sPath));
		} else {
			this.jScrollPanelDatosIngresosReferendos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesIngresosReferendos.setToolTipText("Acciones");
        this.jPanelAccionesIngresosReferendos.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoIngresosReferendos=new ReporteDinamicoJInternalFrame(IngresosReferendosConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoIngresosReferendos();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionIngresosReferendos=new ImportacionJInternalFrame(IngresosReferendosConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionIngresosReferendos();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByIngresosReferendos = new JButtonMe();
		
		this.jButtonAbrirOrderByIngresosReferendos.setText("Orden");
		this.jButtonAbrirOrderByIngresosReferendos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByIngresosReferendos,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByIngresosReferendos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByIngresosReferendos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIngresosReferendos,false,this);
			
			//this.cargarOrderByIngresosReferendos(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByIngresosReferendos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIngresosReferendos,true,this);
			
			//this.cargarOrderByIngresosReferendos(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosIngresosReferendos.setMinimumSize(new Dimension(400,50));//1130
		this.jTableDatosIngresosReferendos.setMaximumSize(new Dimension(400,50));//1130
		this.jTableDatosIngresosReferendos.setPreferredSize(new Dimension(400,50));//1130
		
		this.jScrollPanelDatosIngresosReferendos.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosIngresosReferendos.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosIngresosReferendos.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoIngresosReferendos.setText("Nuevo");
		this.jButtonDuplicarIngresosReferendos.setText("Duplicar");
		this.jButtonCopiarIngresosReferendos.setText("Copiar");
		this.jButtonVerFormIngresosReferendos.setText("Ver");
		this.jButtonNuevoRelacionesIngresosReferendos.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaIngresosReferendos.setText("Guardar");
		this.jButtonCerrarIngresosReferendos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoIngresosReferendos,"nuevo_button","Nuevo",this.ingresosreferendosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarIngresosReferendos,"duplicar_button","Duplicar",this.ingresosreferendosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarIngresosReferendos,"copiar_button","Copiar",this.ingresosreferendosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormIngresosReferendos,"ver_form","Ver",this.ingresosreferendosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesIngresosReferendos,"nuevorelaciones_button","Nuevo Rel",this.ingresosreferendosSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaIngresosReferendos,"guardarcambiostabla_button","Guardar",this.ingresosreferendosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarIngresosReferendos,"cerrar_button","Salir",this.ingresosreferendosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoIngresosReferendos.setToolTipText("Nuevo"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarIngresosReferendos.setToolTipText("Duplicar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarIngresosReferendos.setToolTipText("Copiar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormIngresosReferendos.setToolTipText("Ver"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesIngresosReferendos.setToolTipText("Nuevo Rel"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaIngresosReferendos.setToolTipText("Guardar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarIngresosReferendos.setToolTipText("Salir"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoIngresosReferendos";
		inputMap = this.jButtonNuevoIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoIngresosReferendos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoIngresosReferendos"));
		
		//DUPLICAR
		sMapKey = "DuplicarIngresosReferendos";
		inputMap = this.jButtonDuplicarIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarIngresosReferendos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarIngresosReferendos"));
		
		//COPIAR
		sMapKey = "CopiarIngresosReferendos";
		inputMap = this.jButtonCopiarIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarIngresosReferendos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarIngresosReferendos"));
		
		//VEr FORM
		sMapKey = "VerFormIngresosReferendos";
		inputMap = this.jButtonVerFormIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormIngresosReferendos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormIngresosReferendos"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesIngresosReferendos";
		inputMap = this.jButtonNuevoRelacionesIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesIngresosReferendos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesIngresosReferendos"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarIngresosReferendos";
		inputMap = this.jButtonModificarIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarIngresosReferendos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarIngresosReferendos"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarIngresosReferendos";
		inputMap = this.jButtonCerrarIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarIngresosReferendos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarIngresosReferendos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaIngresosReferendos";
		inputMap = this.jButtonGuardarCambiosTablaIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaIngresosReferendos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaIngresosReferendos"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesIngresosReferendos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesIngresosReferendos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionIngresosReferendos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1IngresosReferendos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2IngresosReferendos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3IngresosReferendos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4IngresosReferendos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5IngresosReferendos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesIngresosReferendos.setName("jPanelParametrosReportesIngresosReferendos"); 
		
		this.jPanelParametrosReportesAccionesIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesIngresosReferendos.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesIngresosReferendos.setName("jPanelParametrosReportesAccionesIngresosReferendos"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionIngresosReferendos = new JButtonMe();
		this.jButtonRecargarInformacionIngresosReferendos.setText("Buscar");
		this.jButtonRecargarInformacionIngresosReferendos.setToolTipText("Buscar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionIngresosReferendos,"recargar_button","Buscar");		
		
		
		this.jButtonRecargarInformacionIngresosReferendos.setVisible(false);
		
		
		this.jButtonProcesarInformacionIngresosReferendos = new JButtonMe();
		this.jButtonProcesarInformacionIngresosReferendos.setText("Procesar");
		this.jButtonProcesarInformacionIngresosReferendos.setToolTipText("Procesar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionIngresosReferendos.setVisible(false);
			
		this.jButtonProcesarInformacionIngresosReferendos.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionIngresosReferendos.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionIngresosReferendos.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesIngresosReferendos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesIngresosReferendos.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesIngresosReferendos.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesIngresosReferendos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesIngresosReferendos.setText("TIPO");       
		this.jComboBoxTiposReportesIngresosReferendos.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesIngresosReferendos = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesIngresosReferendos.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesIngresosReferendos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionIngresosReferendos = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionIngresosReferendos.setText("Paginacion");
		this.jComboBoxTiposPaginacionIngresosReferendos.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesIngresosReferendos = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesIngresosReferendos.setText("Accion");
		this.jComboBoxTiposRelacionesIngresosReferendos.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesIngresosReferendos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesIngresosReferendos.setText("Accion");
		this.jComboBoxTiposAccionesIngresosReferendos.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarIngresosReferendos = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarIngresosReferendos.setText("Accion");
		this.jComboBoxTiposSeleccionarIngresosReferendos.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralIngresosReferendos=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralIngresosReferendos.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralIngresosReferendos.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralIngresosReferendos.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesIngresosReferendos = new JLabelMe();
		
		this.jLabelAccionesIngresosReferendos.setText("Acciones");		
		this.jLabelAccionesIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosIngresosReferendos = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosIngresosReferendos.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosIngresosReferendos.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosIngresosReferendos = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosIngresosReferendos.setText("Seleccionados");
		this.jCheckBoxSeleccionadosIngresosReferendos.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaIngresosReferendos = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaIngresosReferendos.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaIngresosReferendos.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteIngresosReferendos = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteIngresosReferendos.setText("Graf.");
		this.jCheckBoxConGraficoReporteIngresosReferendos.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresIngresosReferendos = new JButtonMe();
		//this.jButtonAnterioresIngresosReferendos.setText("<<");
        this.jButtonAnterioresIngresosReferendos.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresIngresosReferendos,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesIngresosReferendos = new JButtonMe();
		//this.jButtonSiguientesIngresosReferendos.setText(">>");
        this.jButtonSiguientesIngresosReferendos.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesIngresosReferendos,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosIngresosReferendos = new JButtonMe();
		this.jButtonNuevoGuardarCambiosIngresosReferendos.setText("Nue");
        this.jButtonNuevoGuardarCambiosIngresosReferendos.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosIngresosReferendos,"nuevoguardarcambios_button","Nue",this.ingresosreferendosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosIngresosReferendos";
		inputMap = this.jButtonNuevoGuardarCambiosIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosIngresosReferendos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosIngresosReferendos"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionIngresosReferendos";
		inputMap = this.jButtonRecargarInformacionIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionIngresosReferendos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionIngresosReferendos"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesIngresosReferendos";
		inputMap = this.jButtonSiguientesIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesIngresosReferendos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesIngresosReferendos"));
		
		//ANTERIORES		
		sMapKey = "AnterioresIngresosReferendos";
		inputMap = this.jButtonAnterioresIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresIngresosReferendos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresIngresosReferendos"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasIngresosReferendos();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesIngresosReferendos.setMinimumSize(new Dimension(this.getWidth(),IngresosReferendosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(IngresosReferendosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesIngresosReferendos.setMaximumSize(new Dimension(this.getWidth(),IngresosReferendosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(IngresosReferendosBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesIngresosReferendos.setPreferredSize(new Dimension(this.getWidth(),IngresosReferendosBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(IngresosReferendosBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionIngresosReferendos = new GridBagLayout();

			this.jPanelPaginacionIngresosReferendos.setLayout(gridaBagLayoutPaginacionIngresosReferendos);						
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.gridy = 0;
			this.gridBagConstraintsIngresosReferendos.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionIngresosReferendos.add(this.jButtonAnterioresIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
					
						
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsIngresosReferendos.gridy = 0;
			
			this.jPanelPaginacionIngresosReferendos.add(this.jButtonNuevoGuardarCambiosIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
						
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsIngresosReferendos.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsIngresosReferendos.gridy = 0;
			this.jPanelPaginacionIngresosReferendos.add(this.jButtonSiguientesIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.gridy = 1;
			this.gridBagConstraintsIngresosReferendos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIngresosReferendos.add(this.jButtonNuevoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
						
			
			
			if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
				this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsIngresosReferendos.gridy = 1;
				this.gridBagConstraintsIngresosReferendos.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionIngresosReferendos.add(this.jButtonGuardarCambiosTablaIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
			}
			
			
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.gridy = 1;
			this.gridBagConstraintsIngresosReferendos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIngresosReferendos.add(this.jButtonDuplicarIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.gridy = 1;
			this.gridBagConstraintsIngresosReferendos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIngresosReferendos.add(this.jButtonCopiarIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.gridy = 1;
			this.gridBagConstraintsIngresosReferendos.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionIngresosReferendos.add(this.jButtonVerFormIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.gridy = 1;
			this.gridBagConstraintsIngresosReferendos.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionIngresosReferendos.add(this.jButtonCerrarIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		
		
		
		this.jButtonRecargarInformacionIngresosReferendos.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionIngresosReferendos.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionIngresosReferendos.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesIngresosReferendos.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesIngresosReferendos.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesIngresosReferendos.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesIngresosReferendos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesIngresosReferendos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesIngresosReferendos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesIngresosReferendos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesIngresosReferendos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesIngresosReferendos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionIngresosReferendos.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionIngresosReferendos.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionIngresosReferendos.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesIngresosReferendos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesIngresosReferendos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesIngresosReferendos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesIngresosReferendos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIngresosReferendos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIngresosReferendos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarIngresosReferendos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarIngresosReferendos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarIngresosReferendos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaIngresosReferendos.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaIngresosReferendos.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaIngresosReferendos.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteIngresosReferendos.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteIngresosReferendos.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteIngresosReferendos.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosIngresosReferendos.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosIngresosReferendos.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosIngresosReferendos.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosIngresosReferendos.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosIngresosReferendos.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosIngresosReferendos.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesIngresosReferendos = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesIngresosReferendos = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1IngresosReferendos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2IngresosReferendos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3IngresosReferendos = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4IngresosReferendos = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesIngresosReferendos.setLayout(gridaBagParametrosReportesIngresosReferendos);
			this.jPanelParametrosReportesAccionesIngresosReferendos.setLayout(gridaBagParametrosReportesAccionesIngresosReferendos);
			
			
			this.jPanelParametrosAuxiliar1IngresosReferendos.setLayout(gridaBagParametrosAuxiliar1IngresosReferendos);
			this.jPanelParametrosAuxiliar2IngresosReferendos.setLayout(gridaBagParametrosAuxiliar2IngresosReferendos);
			this.jPanelParametrosAuxiliar3IngresosReferendos.setLayout(gridaBagParametrosAuxiliar3IngresosReferendos);
			this.jPanelParametrosAuxiliar4IngresosReferendos.setLayout(gridaBagParametrosAuxiliar4IngresosReferendos);
			//this.jPanelParametrosAuxiliar5IngresosReferendos.setLayout(gridaBagParametrosAuxiliar2IngresosReferendos);			
			
			
			
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIngresosReferendos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIngresosReferendos.add(this.jButtonRecargarInformacionIngresosReferendos, this.gridBagConstraintsIngresosReferendos);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosReferendos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1IngresosReferendos.add(this.jComboBoxTiposPaginacionIngresosReferendos, this.gridBagConstraintsIngresosReferendos);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosReferendos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1IngresosReferendos.add(this.jCheckBoxConAltoMaximoTablaIngresosReferendos, this.gridBagConstraintsIngresosReferendos);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosReferendos.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1IngresosReferendos.add(this.jComboBoxTiposArchivosReportesIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosReferendos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIngresosReferendos.add(this.jPanelParametrosAuxiliar1IngresosReferendos, this.gridBagConstraintsIngresosReferendos);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIngresosReferendos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4IngresosReferendos.add(this.jComboBoxTiposReportesIngresosReferendos, this.gridBagConstraintsIngresosReferendos);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosReferendos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIngresosReferendos.add(this.jPanelParametrosAuxiliar4IngresosReferendos, this.gridBagConstraintsIngresosReferendos);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosReferendos.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIngresosReferendos.add(this.jComboBoxTiposReportesIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosReferendos.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIngresosReferendos.add(this.jCheckBoxGenerarReporteIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosReferendos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIngresosReferendos.add(this.jPanelParametrosAuxiliar2IngresosReferendos, this.gridBagConstraintsIngresosReferendos);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIngresosReferendos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIngresosReferendos.add(this.jLabelAccionesIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
				this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsIngresosReferendos.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsIngresosReferendos.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesIngresosReferendos.add(this.jButtonAbrirOrderByIngresosReferendos, this.gridBagConstraintsIngresosReferendos);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosReferendos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIngresosReferendos.add(this.jComboBoxTiposSeleccionarIngresosReferendos, this.gridBagConstraintsIngresosReferendos);			
			
			
			/*
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsIngresosReferendos.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesIngresosReferendos.add(this.jCheckBoxSeleccionarTodosIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIngresosReferendos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3IngresosReferendos.add(this.jCheckBoxSeleccionarTodosIngresosReferendos, this.gridBagConstraintsIngresosReferendos);															
				
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsIngresosReferendos.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3IngresosReferendos.add(this.jCheckBoxSeleccionadosIngresosReferendos, this.gridBagConstraintsIngresosReferendos);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosReferendos.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesIngresosReferendos.add(this.jPanelParametrosAuxiliar3IngresosReferendos, this.gridBagConstraintsIngresosReferendos);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsIngresosReferendos.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesIngresosReferendos.add(this.jComboBoxTiposAccionesIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosIngresosReferendos = new GridBagLayout();

			this.jScrollPanelDatosIngresosReferendos.setLayout(gridaBagLayoutDatosIngresosReferendos);
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.gridy = 0;
			this.gridBagConstraintsIngresosReferendos.gridx = 0;
			
			this.jScrollPanelDatosIngresosReferendos.add(this.jTableDatosIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosIngresosReferendos.setViewportView(this.jTableDatosIngresosReferendos);
		this.jTableDatosIngresosReferendos.setFillsViewportHeight(true);
		this.jTableDatosIngresosReferendos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesIngresosReferendos= new GridBagLayout();
		this.jPanelAccionesIngresosReferendos.setLayout(gridaBagLayoutAccionesIngresosReferendos);
		
		
		/*	
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosReferendos.gridy = 0;
		this.gridBagConstraintsIngresosReferendos.gridx = 0;
			
		this.jPanelAccionesIngresosReferendos.add(this.jButtonNuevoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaIngresosReferendosIngresosReferendos= new GridBagLayout();
		gridaBagLayoutBusquedaIngresosReferendosIngresosReferendos.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaIngresosReferendosIngresosReferendos.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaIngresosReferendosIngresosReferendos.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaIngresosReferendosIngresosReferendos.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaIngresosReferendosIngresosReferendos.setLayout(gridaBagLayoutBusquedaIngresosReferendosIngresosReferendos);

		gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngresosReferendos.gridy = 0;
		gridBagConstraintsIngresosReferendos.gridx = 0;
		jPanelBusquedaIngresosReferendosIngresosReferendos.add(jLabelfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos, gridBagConstraintsIngresosReferendos);

		gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngresosReferendos.gridy = 0;
		gridBagConstraintsIngresosReferendos.gridx = 1;
		jPanelBusquedaIngresosReferendosIngresosReferendos.add(jDateChooserfecha_emision_desdeBusquedaIngresosReferendosIngresosReferendos, gridBagConstraintsIngresosReferendos);


		gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngresosReferendos.gridy = 1;
		gridBagConstraintsIngresosReferendos.gridx = 0;
		jPanelBusquedaIngresosReferendosIngresosReferendos.add(jLabelfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos, gridBagConstraintsIngresosReferendos);

		gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngresosReferendos.gridy = 1;
		gridBagConstraintsIngresosReferendos.gridx = 1;
		jPanelBusquedaIngresosReferendosIngresosReferendos.add(jDateChooserfecha_emision_hastaBusquedaIngresosReferendosIngresosReferendos, gridBagConstraintsIngresosReferendos);

		gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
		gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsIngresosReferendos.gridy = 2;
		gridBagConstraintsIngresosReferendos.gridx =1;
		jPanelBusquedaIngresosReferendosIngresosReferendos.add(jButtonBusquedaIngresosReferendosIngresosReferendos, gridBagConstraintsIngresosReferendos);

		jTabbedPaneBusquedasIngresosReferendos.addTab("1.-Por Fecha Emision Desde Por Fecha Emision Hasta ", jPanelBusquedaIngresosReferendosIngresosReferendos);
		jTabbedPaneBusquedasIngresosReferendos.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutIngresosReferendos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutIngresosReferendos);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();						
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsIngresosReferendos.gridx = 0;		
			//this.gridBagConstraintsIngresosReferendos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsIngresosReferendos.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarIngresosReferendos, this.gridBagConstraintsIngresosReferendos);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy = iGridyPrincipal++;
		this.gridBagConstraintsIngresosReferendos.gridx = 0;		
		//this.gridBagConstraintsIngresosReferendos.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsIngresosReferendos.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsIngresosReferendos);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsIngresosReferendos.gridx = 0;		
			this.gridBagConstraintsIngresosReferendos.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsIngresosReferendos.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasIngresosReferendos, this.gridBagConstraintsIngresosReferendos);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngresosReferendos.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesIngresosReferendos, this.gridBagConstraintsIngresosReferendos);								
		
		
		/*
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngresosReferendos.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		*/		
		
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsIngresosReferendos.gridx =0;
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsIngresosReferendos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
				
		
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngresosReferendos.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(IngresosReferendosJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosIngresosReferendos= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosIngresosReferendos = new GridBagLayout();
			this.jPanelBusquedasParametrosIngresosReferendos.setLayout(gridaBagLayoutBusquedasParametrosIngresosReferendos);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralIngresosReferendos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralIngresosReferendos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIngresosReferendos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIngresosReferendos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngresosReferendos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
			
			
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngresosReferendos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		
			
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsIngresosReferendos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralIngresosReferendos;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoIngresosReferendos() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoIngresosReferendos = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoIngresosReferendos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoIngresosReferendos.setName("jPanelReporteDinamicoIngresosReferendos"); 
		
		this.jPanelReporteDinamicoIngresosReferendos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoIngresosReferendos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoIngresosReferendos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoIngresosReferendos.setLayout(gridaBagLayoutReporteDinamicoIngresosReferendos);
		
		
		this.jInternalFrameReporteDinamicoIngresosReferendos= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoIngresosReferendos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteIngresosReferendos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoIngresosReferendos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoIngresosReferendos.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoIngresosReferendos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoIngresosReferendos.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoIngresosReferendos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoIngresosReferendos.setResizable(true);
	    this.jInternalFrameReporteDinamicoIngresosReferendos.setClosable(true);
	    this.jInternalFrameReporteDinamicoIngresosReferendos.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoIngresosReferendos.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoIngresosReferendos.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoIngresosReferendos.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingresos Referendoses"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteIngresosReferendos = new JLabelMe();

		this.jLabelColumnasSelectReporteIngresosReferendos.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoIngresosReferendos.add(this.jLabelColumnasSelectReporteIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteIngresosReferendos = new JList<Reporte>();
		this.jListColumnasSelectReporteIngresosReferendos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteIngresosReferendos.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteIngresosReferendos.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteIngresosReferendos.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteIngresosReferendos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteIngresosReferendos=new JScrollPane(this.jListColumnasSelectReporteIngresosReferendos);
			
			this.jScrollColumnasSelectReporteIngresosReferendos.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteIngresosReferendos.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteIngresosReferendos.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoIngresosReferendos.add(this.jListColumnasSelectReporteIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		this.jPanelReporteDinamicoIngresosReferendos.add(this.jScrollColumnasSelectReporteIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteIngresosReferendos = new JLabelMe();

		this.jLabelRelacionesSelectReporteIngresosReferendos.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteIngresosReferendos = new JList<Reporte>();
		this.jListRelacionesSelectReporteIngresosReferendos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteIngresosReferendos.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteIngresosReferendos.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteIngresosReferendos.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteIngresosReferendos.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteIngresosReferendos=new JScrollPane(this.jListRelacionesSelectReporteIngresosReferendos);
			
			this.jScrollRelacionesSelectReporteIngresosReferendos.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteIngresosReferendos.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteIngresosReferendos.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoIngresosReferendos = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoIngresosReferendos = new JComboBoxMe();
		this.jListColumnasValoresGraficoIngresosReferendos = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoIngresosReferendos = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoIngresosReferendos.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoIngresosReferendos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoIngresosReferendos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoIngresosReferendos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoIngresosReferendos = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoIngresosReferendos.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoIngresosReferendos.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoIngresosReferendos.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoIngresosReferendos.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoIngresosReferendos = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoIngresosReferendos.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIngresosReferendos.add(this.jLabelGenerarExcelReporteDinamicoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoIngresosReferendos = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoIngresosReferendos.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoIngresosReferendos,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoIngresosReferendos.setToolTipText("Generar EXCEL"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		//this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsIngresosReferendos.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsIngresosReferendos.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoIngresosReferendos.add(this.jButtonGenerarExcelReporteDinamicoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosReferendos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIngresosReferendos.add(this.jComboBoxTiposReportesDinamicoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoIngresosReferendos = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoIngresosReferendos.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoIngresosReferendos.add(this.jLabelTiposArchivoReporteDinamicoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosReferendos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIngresosReferendos.add(this.jComboBoxTiposArchivosReportesDinamicoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoIngresosReferendos = new JButtonMe();
		this.jButtonGenerarReporteDinamicoIngresosReferendos.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoIngresosReferendos,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoIngresosReferendos.setToolTipText("Generar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosReferendos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIngresosReferendos.add(this.jButtonGenerarReporteDinamicoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoIngresosReferendos = new JButtonMe();
		this.jButtonCerrarReporteDinamicoIngresosReferendos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoIngresosReferendos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoIngresosReferendos.setToolTipText("Cancelar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosReferendos.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoIngresosReferendos.add(this.jButtonCerrarReporteDinamicoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalIngresosReferendos = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoIngresosReferendos= new JScrollPane(jPanelReporteDinamicoIngresosReferendos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoIngresosReferendos.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoIngresosReferendos.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoIngresosReferendos.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingresos Referendoses"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsIngresosReferendos.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoIngresosReferendos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoIngresosReferendos.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalIngresosReferendos);
		this.jInternalFrameReporteDinamicoIngresosReferendos.getContentPane().add(this.jScrollPanelReporteDinamicoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionIngresosReferendos() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionIngresosReferendos = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionIngresosReferendos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionIngresosReferendos.setName("jPanelImportacionIngresosReferendos"); 
		
		this.jPanelImportacionIngresosReferendos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionIngresosReferendos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionIngresosReferendos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionIngresosReferendos.setLayout(gridaBagLayoutImportacionIngresosReferendos);
		
		
		this.jInternalFrameImportacionIngresosReferendos= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionIngresosReferendos= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionIngresosReferendos = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteIngresosReferendos= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionIngresosReferendos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionIngresosReferendos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionIngresosReferendos.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionIngresosReferendos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionIngresosReferendos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionIngresosReferendos.setResizable(true);
	    this.jInternalFrameImportacionIngresosReferendos.setClosable(true);
	    this.jInternalFrameImportacionIngresosReferendos.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionIngresosReferendos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionIngresosReferendos.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionIngresosReferendos.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionIngresosReferendos.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionIngresosReferendos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionIngresosReferendos.setResizable(true);
	    this.jInternalFrameImportacionIngresosReferendos.setClosable(true);
	    this.jInternalFrameImportacionIngresosReferendos.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionIngresosReferendos.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionIngresosReferendos.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionIngresosReferendos.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingresos Referendoses"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionIngresosReferendos = new JLabelMe();

		this.jLabelArchivoImportacionIngresosReferendos.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = iPosYImportacion;		
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionIngresosReferendos.add(this.jLabelArchivoImportacionIngresosReferendos, this.gridBagConstraintsIngresosReferendos);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionIngresosReferendos = new JFileChooser();		
		this.jFileChooserImportacionIngresosReferendos.setToolTipText("ESCOGER ARCHIVO"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionIngresosReferendos = new JButtonMe();
		this.jButtonAbrirImportacionIngresosReferendos.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionIngresosReferendos,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionIngresosReferendos.setToolTipText("Generar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosReferendos.gridy = iPosYImportacion;
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIngresosReferendos.add(this.jButtonAbrirImportacionIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionIngresosReferendos = new JLabelMe();

		this.jLabelPathArchivoImportacionIngresosReferendos.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = iPosYImportacion;		
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXImportacion++;
			
		this.jPanelImportacionIngresosReferendos.add(this.jLabelPathArchivoImportacionIngresosReferendos, this.gridBagConstraintsIngresosReferendos);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionIngresosReferendos=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionIngresosReferendos.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionIngresosReferendos.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionIngresosReferendos.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosReferendos.gridy = iPosYImportacion;
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIngresosReferendos.add(this.jTextFieldPathArchivoImportacionIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionIngresosReferendos = new JButtonMe();
		this.jButtonGenerarImportacionIngresosReferendos.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionIngresosReferendos,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionIngresosReferendos.setToolTipText("Generar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosReferendos.gridy = iPosYImportacion;
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIngresosReferendos.add(this.jButtonGenerarImportacionIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionIngresosReferendos = new JButtonMe();
		this.jButtonCerrarImportacionIngresosReferendos.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionIngresosReferendos,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionIngresosReferendos.setToolTipText("Cancelar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosReferendos.gridy = iPosYImportacion;
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXImportacion++;
							
		this.jPanelImportacionIngresosReferendos.add(this.jButtonCerrarImportacionIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalIngresosReferendos = new GridBagLayout();
		
		this.jScrollPanelImportacionIngresosReferendos= new JScrollPane(jPanelImportacionIngresosReferendos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy =iPosYImportacion;
		this.gridBagConstraintsIngresosReferendos.gridx =iPosXImportacion;
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionIngresosReferendos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionIngresosReferendos.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalIngresosReferendos);
		this.jInternalFrameImportacionIngresosReferendos.getContentPane().add(this.jScrollPanelImportacionIngresosReferendos, this.gridBagConstraintsIngresosReferendos);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByIngresosReferendos(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByIngresosReferendos = new JButtonMe();
			this.jButtonAbrirOrderByIngresosReferendos.setText("Orden");
			this.jButtonAbrirOrderByIngresosReferendos.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByIngresosReferendos,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByIngresosReferendos";
			inputMap = this.jButtonAbrirOrderByIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByIngresosReferendos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByIngresosReferendos"));
		
		
			GridBagLayout gridaBagLayoutOrderByIngresosReferendos = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByIngresosReferendos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByIngresosReferendos.setName("jPanelOrderByIngresosReferendos"); 
			
			this.jPanelOrderByIngresosReferendos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByIngresosReferendos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByIngresosReferendos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByIngresosReferendos.setLayout(gridaBagLayoutOrderByIngresosReferendos);
			
			
			this.jTableDatosIngresosReferendosOrderBy = new JTableMe();        
			this.jTableDatosIngresosReferendosOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosIngresosReferendosOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosIngresosReferendosOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosIngresosReferendosOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosIngresosReferendosOrderBy.setViewportView(this.jTableDatosIngresosReferendosOrderBy);
			this.jTableDatosIngresosReferendosOrderBy.setFillsViewportHeight(true);
			this.jTableDatosIngresosReferendosOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByIngresosReferendos= new OrderByJInternalFrame();
			this.jInternalFrameOrderByIngresosReferendos= new OrderByJInternalFrame();
			this.jScrollPanelOrderByIngresosReferendos = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteIngresosReferendos= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByIngresosReferendos.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByIngresosReferendos.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByIngresosReferendos.setTitle("Orden");
			this.jInternalFrameOrderByIngresosReferendos.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByIngresosReferendos.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByIngresosReferendos.setResizable(true);
			this.jInternalFrameOrderByIngresosReferendos.setClosable(true);
			this.jInternalFrameOrderByIngresosReferendos.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByIngresosReferendos.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByIngresosReferendos.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByIngresosReferendos.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingresos Referendoses"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.gridy =iPosYOrderBy++;
			this.gridBagConstraintsIngresosReferendos.gridx =iPosXOrderBy;
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsIngresosReferendos.ipady =150;
				
			this.jPanelOrderByIngresosReferendos.add(jScrollPanelDatosIngresosReferendosOrderBy, this.gridBagConstraintsIngresosReferendos);//this.jTableDatosIngresosReferendosTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByIngresosReferendos = new JButtonMe();
			this.jButtonCerrarOrderByIngresosReferendos.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByIngresosReferendos,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByIngresosReferendos.setToolTipText("Cancelar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.gridy = iPosYOrderBy++;
			this.gridBagConstraintsIngresosReferendos.gridx = iPosXOrderBy;
									
			this.jPanelOrderByIngresosReferendos.add(this.jButtonCerrarOrderByIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalIngresosReferendos = new GridBagLayout();
			
			this.jScrollPanelOrderByIngresosReferendos= new JScrollPane(jPanelOrderByIngresosReferendos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.gridy =iPosYOrderBy;
			this.gridBagConstraintsIngresosReferendos.gridx =iPosXOrderBy;
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByIngresosReferendos.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByIngresosReferendos.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalIngresosReferendos);
			
			this.jInternalFrameOrderByIngresosReferendos.getContentPane().add(this.jScrollPanelOrderByIngresosReferendos, this.gridBagConstraintsIngresosReferendos);			
		
		} else {
			this.jButtonAbrirOrderByIngresosReferendos = new JButtonMe();
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
		int iWidthTableCalculado=0;//2330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1130;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		//if(this.conMaximoRelaciones 
		//	&& this.ingresosreferendosSessionBean.getConGuardarRelaciones()
		//	) {
		//}
		
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
		int iCountColumns=this.jTableDatosIngresosReferendos.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosIngresosReferendos.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosIngresosReferendos.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			//iTamanioFilaTabla=this.jTableDatosIngresosReferendos.getRowHeight();//IngresosReferendosConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > IngresosReferendosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaIngresosReferendos.isSelected()) {
					iHeightTable=IngresosReferendosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < IngresosReferendosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=IngresosReferendosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > IngresosReferendosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaIngresosReferendos.isSelected()) {
					iHeightTable=IngresosReferendosConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < IngresosReferendosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=IngresosReferendosConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosIngresosReferendos.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosIngresosReferendos.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosIngresosReferendos.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosIngresosReferendos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosIngresosReferendos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosIngresosReferendos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByIngresosReferendos!=null && this.jInternalFrameOrderByIngresosReferendos.getjTableDatosOrderBy()!=null) {
			//if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByIngresosReferendos.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByIngresosReferendos.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByIngresosReferendos.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByIngresosReferendos.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByIngresosReferendos.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByIngresosReferendos.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByIngresosReferendos.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosIngresosReferendos.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosIngresosReferendos.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosIngresosReferendos.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			//iSizeTabla=ingresosreferendosLogic.getIngresosReferendoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ingresosreferendoss.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<IngresosReferendos> TraerIngresosReferendosBeans(List<IngresosReferendos> ingresosreferendoss,ArrayList<Classe> classes)throws Exception {
		try {
			for(IngresosReferendos ingresosreferendos:ingresosreferendoss) {
					
				if(!(IngresosReferendosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || IngresosReferendosConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					ingresosreferendos.setsDetalleGeneralEntityReporte(IngresosReferendosConstantesFunciones.getIngresosReferendosDescripcion(ingresosreferendos));
										
						
					
						
					
				} else  {
							
					//ingresosreferendos.setsDetalleGeneralEntityReporte(ingresosreferendos.getsDetalleGeneralEntityReporte());
										
				}
				
				//ingresosreferendosbeans.add(ingresosreferendosbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return ingresosreferendoss;
    }
	//PARA REPORTES FIN
}
