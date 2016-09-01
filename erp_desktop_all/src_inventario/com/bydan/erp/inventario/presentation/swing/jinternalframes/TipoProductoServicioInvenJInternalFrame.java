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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;

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
import com.bydan.erp.inventario.util.TipoProductoServicioInvenConstantesFunciones;

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
public class TipoProductoServicioInvenJInternalFrame extends TipoProductoServicioInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoProductoServicioInven;
	
	protected JMenuBar jmenuBarTipoProductoServicioInven;
	
	protected JMenu jmenuTipoProductoServicioInven;
	protected JMenu jmenuDatosTipoProductoServicioInven;
	protected JMenu jmenuArchivoTipoProductoServicioInven;
	protected JMenu jmenuAccionesTipoProductoServicioInven;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoProductoServicioInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProductoServicioInven;	
	protected GridBagConstraints gridBagConstraintsTipoProductoServicioInven;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoProductoServicioInvenDetalleFormJInternalFrame jInternalFrameDetalleFormTipoProductoServicioInven;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoProductoServicioInven;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoProductoServicioInven;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoProductoServicioInvenSessionBean tipoproductoservicioinvenSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoProductoServicioInven> tipoproductoservicioinvens;		
	public List<TipoProductoServicioInven> tipoproductoservicioinvensEliminados;	
	public List<TipoProductoServicioInven> tipoproductoservicioinvensAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoProductoServicioInven;		
	protected JButton jButtonAbrirOrderByTipoProductoServicioInven;
	
	
	//protected JPanel jPanelOrderByTipoProductoServicioInven;
	//public JScrollPane jScrollPanelOrderByTipoProductoServicioInven;	
	//protected JButton jButtonCerrarOrderByTipoProductoServicioInven;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoProductoServicioInvenLogic tipoproductoservicioinvenLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoProductoServicioInven;
	public JScrollPane jScrollPanelDatosEdicionTipoProductoServicioInven;
	public JScrollPane jScrollPanelDatosGeneralTipoProductoServicioInven;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoProductoServicioInvenOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoProductoServicioInven;
	//public JScrollPane jScrollPanelImportacionTipoProductoServicioInven;
	
	
	
	protected JPanel jPanelAccionesTipoProductoServicioInven;
	
    protected JPanel jPanelPaginacionTipoProductoServicioInven;
    protected JPanel jPanelParametrosReportesTipoProductoServicioInven;
	protected JPanel jPanelParametrosReportesAccionesTipoProductoServicioInven;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoProductoServicioInven;
	protected JPanel jPanelParametrosAuxiliar2TipoProductoServicioInven;
	protected JPanel jPanelParametrosAuxiliar3TipoProductoServicioInven;
	protected JPanel jPanelParametrosAuxiliar4TipoProductoServicioInven;
	//protected JPanel jPanelParametrosAuxiliar5TipoProductoServicioInven;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoProductoServicioInven;
	//protected JPanel jPanelImportacionTipoProductoServicioInven;
	
	
	public JTable jTableDatosTipoProductoServicioInven;
	
	
	
	//public JTable jTableDatosTipoProductoServicioInvenOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoProductoServicioInven;
	protected JButton jButtonDuplicarTipoProductoServicioInven;
	protected JButton jButtonCopiarTipoProductoServicioInven;
	protected JButton jButtonVerFormTipoProductoServicioInven;
	protected JButton jButtonNuevoRelacionesTipoProductoServicioInven;
	protected JButton jButtonModificarTipoProductoServicioInven;
	
    protected JButton jButtonGuardarCambiosTablaTipoProductoServicioInven;
	protected JButton jButtonCerrarTipoProductoServicioInven;
	
	
	protected JButton jButtonRecargarInformacionTipoProductoServicioInven;
	protected JButton jButtonProcesarInformacionTipoProductoServicioInven;
	
	
	protected JButton jButtonAnterioresTipoProductoServicioInven;
	protected JButton jButtonSiguientesTipoProductoServicioInven;
	protected JButton jButtonNuevoGuardarCambiosTipoProductoServicioInven;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoProductoServicioInven;
	//protected JButton jButtonCerrarReporteDinamicoTipoProductoServicioInven;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoProductoServicioInven;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoProductoServicioInven;
	//protected JButton jButtonGenerarImportacionTipoProductoServicioInven;
	//protected JButton jButtonCerrarImportacionTipoProductoServicioInven;
	//protected JFileChooser jFileChooserImportacionTipoProductoServicioInven;
	//protected File fileImportacionTipoProductoServicioInven;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProductoServicioInven;
	protected JButton jButtonDuplicarToolBarTipoProductoServicioInven;
	protected JButton jButtonNuevoRelacionesToolBarTipoProductoServicioInven;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoProductoServicioInven;
	protected JButton jButtonCopiarToolBarTipoProductoServicioInven;
	protected JButton jButtonVerFormToolBarTipoProductoServicioInven;
	public JButton jButtonGuardarCambiosTablaToolBarTipoProductoServicioInven;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProductoServicioInven;
	protected JButton jButtonCerrarToolBarTipoProductoServicioInven;
	
	protected JButton jButtonRecargarInformacionToolBarTipoProductoServicioInven;
	protected JButton jButtonProcesarInformacionToolBarTipoProductoServicioInven;
	protected JButton jButtonAnterioresToolBarTipoProductoServicioInven;
	protected JButton jButtonSiguientesToolBarTipoProductoServicioInven;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoProductoServicioInven;
	protected JButton jButtonAbrirOrderByToolBarTipoProductoServicioInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProductoServicioInven;
	protected JMenuItem jMenuItemDuplicarTipoProductoServicioInven;
	protected JMenuItem jMenuItemNuevoRelacionesTipoProductoServicioInven;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoProductoServicioInven;
	protected JMenuItem jMenuItemCopiarTipoProductoServicioInven;
	protected JMenuItem jMenuItemVerFormTipoProductoServicioInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProductoServicioInven;
	protected JMenuItem jMenuItemCerrarTipoProductoServicioInven;
	protected JMenuItem jMenuItemDetalleCerrarTipoProductoServicioInven;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoProductoServicioInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProductoServicioInven;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoProductoServicioInven;
	protected JMenuItem jMenuItemProcesarInformacionTipoProductoServicioInven;
	protected JMenuItem jMenuItemAnterioresTipoProductoServicioInven;
	protected JMenuItem jMenuItemSiguientesTipoProductoServicioInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProductoServicioInven;
	protected JMenuItem jMenuItemAbrirOrderByTipoProductoServicioInven;
	protected JMenuItem jMenuItemMostrarOcultarTipoProductoServicioInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProductoServicioInven;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoProductoServicioInven;
	protected JCheckBox jCheckBoxSeleccionadosTipoProductoServicioInven;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoProductoServicioInven;
	protected JCheckBox jCheckBoxConGraficoReporteTipoProductoServicioInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoProductoServicioInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoProductoServicioInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProductoServicioInven;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoProductoServicioInven;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoProductoServicioInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoProductoServicioInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProductoServicioInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProductoServicioInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoProductoServicioInven;
	protected JTextField jTextFieldValorCampoGeneralTipoProductoServicioInven;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoProductoServicioInven;
	//public JList<Reporte> jListColumnasSelectReporteTipoProductoServicioInven;
	//public JScrollPane jScrollColumnasSelectReporteTipoProductoServicioInven;
	
	//public JLabel jLabelRelacionesSelectReporteTipoProductoServicioInven;
	//public JList<Reporte> jListRelacionesSelectReporteTipoProductoServicioInven;
	//public JScrollPane jScrollRelacionesSelectReporteTipoProductoServicioInven;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoProductoServicioInven;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoProductoServicioInven;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoProductoServicioInven;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoProductoServicioInven;
	
		
	//public JLabel jLabelArchivoImportacionTipoProductoServicioInven;	
	//public JLabel jLabelPathArchivoImportacionTipoProductoServicioInven;
	//protected JTextField jTextFieldPathArchivoImportacionTipoProductoServicioInven;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoProductoServicioInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoProductoServicioInven;
	
	//public JLabel jLabelColumnaCategoriaValorTipoProductoServicioInven;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoProductoServicioInven;
	
	//public JLabel jLabelColumnasValoresGraficoTipoProductoServicioInven;
	//public JList<Reporte> jListColumnasValoresGraficoTipoProductoServicioInven;
	//public JScrollPane jScrollColumnasValoresGraficoTipoProductoServicioInven;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoProductoServicioInven;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoProductoServicioInven;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoProductoServicioInven;
	public JPanel jPanelBusquedaPorNombreTipoProductoServicioInven;
	public JButton jButtonBusquedaPorNombreTipoProductoServicioInven;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoProductoServicioInven;
	public JLabel jLabelnombreBusquedaPorNombreTipoProductoServicioInven;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoProductoServicioInven;
	public JButton jButtonnombreBusquedaPorNombreTipoProductoServicioInvenBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoProductoServicioInvenJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoProductoServicioInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoServicioInvenJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProductoServicioInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoServicioInvenJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProductoServicioInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoServicioInvenJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProductoServicioInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoProductoServicioInven)	{
		this.jButtonRecargarInformacionTipoProductoServicioInven = jButtonRecargarInformacionTipoProductoServicioInven;
	}
	
	public JButton getjButtonProcesarInformacionTipoProductoServicioInven() {
		return this.jButtonProcesarInformacionTipoProductoServicioInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProductoServicioInven)	{
		this.jButtonProcesarInformacionTipoProductoServicioInven = jButtonProcesarInformacionTipoProductoServicioInven;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoProductoServicioInven() {
		return this.jButtonRecargarInformacionTipoProductoServicioInven;
	}
	
	
	public List<TipoProductoServicioInven> gettipoproductoservicioinvens() {
		return this.tipoproductoservicioinvens;
	}

	public void settipoproductoservicioinvens(List<TipoProductoServicioInven> tipoproductoservicioinvens) {
		this.tipoproductoservicioinvens = tipoproductoservicioinvens;
	}
	
	public List<TipoProductoServicioInven> gettipoproductoservicioinvensAux() {
		return this.tipoproductoservicioinvensAux;
	}

	public void settipoproductoservicioinvensAux(List<TipoProductoServicioInven> tipoproductoservicioinvensAux) {
		this.tipoproductoservicioinvensAux = tipoproductoservicioinvensAux;
	}
	
	public List<TipoProductoServicioInven> gettipoproductoservicioinvensEliminados() {
		return this.tipoproductoservicioinvensEliminados;
	}

	public void setTipoProductoServicioInvensEliminados(List<TipoProductoServicioInven> tipoproductoservicioinvensEliminados) {
		this.tipoproductoservicioinvensEliminados = tipoproductoservicioinvensEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoProductoServicioInven() {
		return jComboBoxTiposSeleccionarTipoProductoServicioInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoProductoServicioInven(
			JComboBox jComboBoxTiposSeleccionarTipoProductoServicioInven) {
		this.jComboBoxTiposSeleccionarTipoProductoServicioInven = jComboBoxTiposSeleccionarTipoProductoServicioInven;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoProductoServicioInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoProductoServicioInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoProductoServicioInven .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoProductoServicioInven() {
		return jTextFieldValorCampoGeneralTipoProductoServicioInven;
	}

	public void setjTextFieldValorCampoGeneralTipoProductoServicioInven(
			JTextField jTextFieldValorCampoGeneralTipoProductoServicioInven) {
		this.jTextFieldValorCampoGeneralTipoProductoServicioInven = jTextFieldValorCampoGeneralTipoProductoServicioInven;
	}

	public void setBorderResaltarValorCampoGeneralTipoProductoServicioInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicioInven.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoProductoServicioInven .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoProductoServicioInven() {
		return this.jCheckBoxSeleccionarTodosTipoProductoServicioInven;
	}

	public void setjCheckBoxSeleccionarTodosTipoProductoServicioInven(
			JCheckBox jCheckBoxSeleccionarTodosTipoProductoServicioInven) {
		this.jCheckBoxSeleccionarTodosTipoProductoServicioInven = jCheckBoxSeleccionarTodosTipoProductoServicioInven;
	}

	public void setBorderResaltarSeleccionarTodosTipoProductoServicioInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicioInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoProductoServicioInven .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoProductoServicioInven() {
		return this.jCheckBoxSeleccionadosTipoProductoServicioInven;
	}

	public void setjCheckBoxSeleccionadosTipoProductoServicioInven(
			JCheckBox jCheckBoxSeleccionadosTipoProductoServicioInven) {
		this.jCheckBoxSeleccionadosTipoProductoServicioInven = jCheckBoxSeleccionadosTipoProductoServicioInven;
	}
	
	public void setBorderResaltarSeleccionadosTipoProductoServicioInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicioInven.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoProductoServicioInven .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoProductoServicioInven() {
		return this.jComboBoxTiposArchivosReportesTipoProductoServicioInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoProductoServicioInven(
			JComboBox jComboBoxTiposArchivosReportesTipoProductoServicioInven) {
		this.jComboBoxTiposArchivosReportesTipoProductoServicioInven = jComboBoxTiposArchivosReportesTipoProductoServicioInven;
	}

	public void setBorderResaltarTiposArchivosReportesTipoProductoServicioInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicioInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoProductoServicioInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoProductoServicioInven() {
		return this.jComboBoxTiposReportesTipoProductoServicioInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoProductoServicioInven(
			JComboBox jComboBoxTiposReportesTipoProductoServicioInven) {
		this.jComboBoxTiposReportesTipoProductoServicioInven = jComboBoxTiposReportesTipoProductoServicioInven;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoProductoServicioInven() {
	//	return jComboBoxTiposReportesDinamicoTipoProductoServicioInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoProductoServicioInven(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoProductoServicioInven) {
	//	this.jComboBoxTiposReportesDinamicoTipoProductoServicioInven = jComboBoxTiposReportesDinamicoTipoProductoServicioInven;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoProductoServicioInven() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoProductoServicioInven;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoProductoServicioInven(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoProductoServicioInven) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoProductoServicioInven = jComboBoxTiposArchivosReportesDinamicoTipoProductoServicioInven;
	//}
	
	public void setBorderResaltarTiposReportesTipoProductoServicioInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicioInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoProductoServicioInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoProductoServicioInven() {
		return this.jComboBoxTiposGraficosReportesTipoProductoServicioInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoProductoServicioInven(
			JComboBox jComboBoxTiposGraficosReportesTipoProductoServicioInven) {
		this.jComboBoxTiposGraficosReportesTipoProductoServicioInven = jComboBoxTiposGraficosReportesTipoProductoServicioInven;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoProductoServicioInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicioInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoProductoServicioInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoProductoServicioInven() {
		return this.jComboBoxTiposPaginacionTipoProductoServicioInven;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoProductoServicioInven(
			JComboBox jComboBoxTiposPaginacionTipoProductoServicioInven) {
		this.jComboBoxTiposPaginacionTipoProductoServicioInven = jComboBoxTiposPaginacionTipoProductoServicioInven;
	}
	
	public void setBorderResaltarTiposPaginacionTipoProductoServicioInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicioInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoProductoServicioInven .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoProductoServicioInven() {
		return this.jComboBoxTiposRelacionesTipoProductoServicioInven;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProductoServicioInven() {
		return this.jComboBoxTiposAccionesTipoProductoServicioInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProductoServicioInven(
			JComboBox jComboBoxTiposRelacionesTipoProductoServicioInven) {
		this.jComboBoxTiposRelacionesTipoProductoServicioInven = jComboBoxTiposRelacionesTipoProductoServicioInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProductoServicioInven(
			JComboBox jComboBoxTiposAccionesTipoProductoServicioInven) {
		this.jComboBoxTiposAccionesTipoProductoServicioInven = jComboBoxTiposAccionesTipoProductoServicioInven;
	}
	
	public void setBorderResaltarTiposRelacionesTipoProductoServicioInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicioInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoProductoServicioInven .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoProductoServicioInven() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoProductoServicioInven.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoProductoServicioInven .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoProductoServicioInven() {
	//	return jCheckBoxConGraficoDinamicoTipoProductoServicioInven;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoProductoServicioInven(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoProductoServicioInven) {
	//	this.jCheckBoxConGraficoDinamicoTipoProductoServicioInven = jCheckBoxConGraficoDinamicoTipoProductoServicioInven;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoProductoServicioInven() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoProductoServicioInven.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoProductoServicioInven .setBorder(borderResaltar);		
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
		this.tipoproductoservicioinvenSessionBean=new TipoProductoServicioInvenSessionBean();
		
		this.tipoproductoservicioinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoproductoservicioinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoProductoServicioInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoProductoServicioInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProductoServicioInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProductoServicioInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProductoServicioInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Producto Servicio Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoProductoServicioInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoProductoServicioInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoProductoServicioInven= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoProductoServicioInven,this.jTtoolBarTipoProductoServicioInven,
							"nuevo","nuevo","Nuevo"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoProductoServicioInven,this.jTtoolBarTipoProductoServicioInven,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoProductoServicioInven,this.jTtoolBarTipoProductoServicioInven,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoProductoServicioInven,this.jTtoolBarTipoProductoServicioInven,
							"duplicar","duplicar","Duplicar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoProductoServicioInven,this.jTtoolBarTipoProductoServicioInven,
							"copiar","copiar","Copiar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoProductoServicioInven,this.jTtoolBarTipoProductoServicioInven,
							"ver_form","ver_form","Ver"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProductoServicioInven,this.jTtoolBarTipoProductoServicioInven,
							"recargar","recargar","Recargar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProductoServicioInven,this.jTtoolBarTipoProductoServicioInven,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoProductoServicioInven,this.jTtoolBarTipoProductoServicioInven,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoProductoServicioInven,this.jTtoolBarTipoProductoServicioInven,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoProductoServicioInven,this.jTtoolBarTipoProductoServicioInven,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoProductoServicioInven,this.jTtoolBarTipoProductoServicioInven,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoProductoServicioInven,this.jTtoolBarTipoProductoServicioInven,
							"cerrar","cerrar","Salir"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoProductoServicioInven=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoProductoServicioInven;
			
				this.jButtonProcesarInformacionToolBarTipoProductoServicioInven=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoProductoServicioInven;
				
		//protected JButton jButtonModificarToolBarTipoProductoServicioInven;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoProductoServicioInven=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoProductoServicioInven=new JMenuMe("General");
		this.jmenuArchivoTipoProductoServicioInven=new JMenuMe("Archivo");
		this.jmenuAccionesTipoProductoServicioInven=new JMenuMe("Acciones");
		this.jmenuDatosTipoProductoServicioInven=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProductoServicioInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProductoServicioInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProductoServicioInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoProductoServicioInven= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoProductoServicioInven.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoProductoServicioInven,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoProductoServicioInven= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoProductoServicioInven.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoProductoServicioInven,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoProductoServicioInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProductoServicioInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProductoServicioInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoProductoServicioInven= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoProductoServicioInven.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoProductoServicioInven,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoProductoServicioInven= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoProductoServicioInven.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoProductoServicioInven,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoProductoServicioInven= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoProductoServicioInven.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoProductoServicioInven,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProductoServicioInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProductoServicioInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProductoServicioInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoProductoServicioInven= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoProductoServicioInven.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoProductoServicioInven,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoProductoServicioInven= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoProductoServicioInven.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoProductoServicioInven,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoProductoServicioInven= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoProductoServicioInven.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoProductoServicioInven,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoProductoServicioInven= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoProductoServicioInven.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoProductoServicioInven,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoProductoServicioInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoProductoServicioInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoProductoServicioInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProductoServicioInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProductoServicioInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProductoServicioInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoProductoServicioInven= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoProductoServicioInven.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoProductoServicioInven,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProductoServicioInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProductoServicioInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProductoServicioInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoProductoServicioInven= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoProductoServicioInven.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoProductoServicioInven,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoProductoServicioInven.add(this.jMenuItemCerrarTipoProductoServicioInven);
			
			this.jmenuAccionesTipoProductoServicioInven.add(this.jMenuItemNuevoTipoProductoServicioInven);
			this.jmenuAccionesTipoProductoServicioInven.add(this.jMenuItemNuevoGuardarCambiosTipoProductoServicioInven);
			this.jmenuAccionesTipoProductoServicioInven.add(this.jMenuItemNuevoRelacionesTipoProductoServicioInven);
			this.jmenuAccionesTipoProductoServicioInven.add(this.jMenuItemGuardarCambiosTablaTipoProductoServicioInven);		
			this.jmenuAccionesTipoProductoServicioInven.add(this.jMenuItemDuplicarTipoProductoServicioInven);		
			this.jmenuAccionesTipoProductoServicioInven.add(this.jMenuItemCopiarTipoProductoServicioInven);		
			this.jmenuAccionesTipoProductoServicioInven.add(this.jMenuItemVerFormTipoProductoServicioInven);		
			
			this.jmenuDatosTipoProductoServicioInven.add(this.jMenuItemRecargarInformacionTipoProductoServicioInven);				
			this.jmenuDatosTipoProductoServicioInven.add(this.jMenuItemAnterioresTipoProductoServicioInven);				
			this.jmenuDatosTipoProductoServicioInven.add(this.jMenuItemSiguientesTipoProductoServicioInven);				
			this.jmenuDatosTipoProductoServicioInven.add(this.jMenuItemAbrirOrderByTipoProductoServicioInven);				
			this.jmenuDatosTipoProductoServicioInven.add(this.jMenuItemMostrarOcultarTipoProductoServicioInven);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoProductoServicioInven.add(this.jMenuItemGuardarCambiosTipoProductoServicioInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoProductoServicioInven.add(this.jmenuArchivoTipoProductoServicioInven);		
			this.jmenuBarTipoProductoServicioInven.add(this.jmenuAccionesTipoProductoServicioInven);		
			this.jmenuBarTipoProductoServicioInven.add(this.jmenuDatosTipoProductoServicioInven);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoProductoServicioInven);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoProductoServicioInven() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoProductoServicioInven=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoProductoServicioInven.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoProductoServicioInven= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoProductoServicioInven.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoProductoServicioInven.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoProductoServicioInven,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoProductoServicioInven = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoProductoServicioInven.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoProductoServicioInven.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoProductoServicioInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoProductoServicioInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoProductoServicioInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoProductoServicioInven,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoProductoServicioInven= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoProductoServicioInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoProductoServicioInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoProductoServicioInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoProductoServicioInven,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoProductoServicioInven=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoProductoServicioInven.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoProductoServicioInven.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoProductoServicioInven.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoProductoServicioInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoProductoServicioInven,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoProductoServicioInven = new TipoProductoServicioInvenDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Producto Servicio Inventario DATOS");
			this.jInternalFrameDetalleFormTipoProductoServicioInven = new TipoProductoServicioInvenDetalleFormJInternalFrame(jDesktopPane,this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones(),this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoProductoServicioInven = null;//new TipoProductoServicioInvenDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProductoServicioInven= new GridBagLayout();
		
		
		this.jTableDatosTipoProductoServicioInven = new JTableMe();      
		
		String sToolTipTipoProductoServicioInven="";
		sToolTipTipoProductoServicioInven=TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProductoServicioInven+="(Inventario.TipoProductoServicioInven)";
		}
		
		if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProductoServicioInven+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoProductoServicioInven.setToolTipText(sToolTipTipoProductoServicioInven);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoProductoServicioInven);
		this.jTableDatosTipoProductoServicioInven.setAutoCreateRowSorter(true);
		this.jTableDatosTipoProductoServicioInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoProductoServicioInven.setRowSelectionAllowed(true);
		this.jTableDatosTipoProductoServicioInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoProductoServicioInven,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoProductoServicioInven = new JButtonMe();
		this.jButtonDuplicarTipoProductoServicioInven = new JButtonMe();
		this.jButtonCopiarTipoProductoServicioInven = new JButtonMe();
		this.jButtonVerFormTipoProductoServicioInven = new JButtonMe();
		this.jButtonNuevoRelacionesTipoProductoServicioInven = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoProductoServicioInven = new JButtonMe();
		this.jButtonCerrarTipoProductoServicioInven = new JButtonMe();
		
		this.jScrollPanelDatosTipoProductoServicioInven = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoProductoServicioInven = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoProductoServicioInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Producto Servicio Inventario";
		
		if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Producto Servicio Inventarios" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProductoServicioInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProductoServicioInven.setToolTipText("Acciones");
        this.jPanelAccionesTipoProductoServicioInven.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoProductoServicioInven=new ReporteDinamicoJInternalFrame(TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoProductoServicioInven();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoProductoServicioInven=new ImportacionJInternalFrame(TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoProductoServicioInven();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoProductoServicioInven = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoProductoServicioInven.setText("Orden");
		this.jButtonAbrirOrderByTipoProductoServicioInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProductoServicioInven,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoProductoServicioInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProductoServicioInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProductoServicioInven,false,this);
			
			//this.cargarOrderByTipoProductoServicioInven(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoProductoServicioInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProductoServicioInven,true,this);
			
			//this.cargarOrderByTipoProductoServicioInven(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoProductoServicioInven.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoProductoServicioInven.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoProductoServicioInven.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoProductoServicioInven.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProductoServicioInven.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoProductoServicioInven.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoProductoServicioInven.setText("Nuevo");
		this.jButtonDuplicarTipoProductoServicioInven.setText("Duplicar");
		this.jButtonCopiarTipoProductoServicioInven.setText("Copiar");
		this.jButtonVerFormTipoProductoServicioInven.setText("Ver");
		this.jButtonNuevoRelacionesTipoProductoServicioInven.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoProductoServicioInven.setText("Guardar");
		this.jButtonCerrarTipoProductoServicioInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProductoServicioInven,"nuevo_button","Nuevo",this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoProductoServicioInven,"duplicar_button","Duplicar",this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoProductoServicioInven,"copiar_button","Copiar",this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoProductoServicioInven,"ver_form","Ver",this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoProductoServicioInven,"nuevorelaciones_button","Nuevo Rel",this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProductoServicioInven,"guardarcambiostabla_button","Guardar",this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProductoServicioInven,"cerrar_button","Salir",this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoProductoServicioInven.setToolTipText("Nuevo"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoProductoServicioInven.setToolTipText("Duplicar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoProductoServicioInven.setToolTipText("Copiar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoProductoServicioInven.setToolTipText("Ver"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoProductoServicioInven.setToolTipText("Nuevo Rel"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoProductoServicioInven.setToolTipText("Guardar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProductoServicioInven.setToolTipText("Salir"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProductoServicioInven";
		inputMap = this.jButtonNuevoTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProductoServicioInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProductoServicioInven"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoProductoServicioInven";
		inputMap = this.jButtonDuplicarTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoProductoServicioInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoProductoServicioInven"));
		
		//COPIAR
		sMapKey = "CopiarTipoProductoServicioInven";
		inputMap = this.jButtonCopiarTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoProductoServicioInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoProductoServicioInven"));
		
		//VEr FORM
		sMapKey = "VerFormTipoProductoServicioInven";
		inputMap = this.jButtonVerFormTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoProductoServicioInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoProductoServicioInven"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoProductoServicioInven";
		inputMap = this.jButtonNuevoRelacionesTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoProductoServicioInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoProductoServicioInven"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoProductoServicioInven";
		inputMap = this.jButtonModificarTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoProductoServicioInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoProductoServicioInven"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoProductoServicioInven";
		inputMap = this.jButtonCerrarTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProductoServicioInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProductoServicioInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProductoServicioInven";
		inputMap = this.jButtonGuardarCambiosTablaTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProductoServicioInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProductoServicioInven"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoProductoServicioInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoProductoServicioInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoProductoServicioInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoProductoServicioInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoProductoServicioInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoProductoServicioInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoProductoServicioInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoProductoServicioInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoProductoServicioInven.setName("jPanelParametrosReportesTipoProductoServicioInven"); 
		
		this.jPanelParametrosReportesAccionesTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoProductoServicioInven.setName("jPanelParametrosReportesAccionesTipoProductoServicioInven"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoProductoServicioInven = new JButtonMe();
		this.jButtonRecargarInformacionTipoProductoServicioInven.setText("Recargar");
		this.jButtonRecargarInformacionTipoProductoServicioInven.setToolTipText("Recargar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoProductoServicioInven,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoProductoServicioInven = new JButtonMe();
		this.jButtonProcesarInformacionTipoProductoServicioInven.setText("Procesar");
		this.jButtonProcesarInformacionTipoProductoServicioInven.setToolTipText("Procesar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoProductoServicioInven.setVisible(false);
			
		this.jButtonProcesarInformacionTipoProductoServicioInven.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProductoServicioInven.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoProductoServicioInven.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoProductoServicioInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProductoServicioInven.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoProductoServicioInven.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoProductoServicioInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProductoServicioInven.setText("TIPO");       
		this.jComboBoxTiposReportesTipoProductoServicioInven.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoProductoServicioInven = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoProductoServicioInven.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoProductoServicioInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoProductoServicioInven = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoProductoServicioInven.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoProductoServicioInven.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoProductoServicioInven = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoProductoServicioInven.setText("Accion");
		this.jComboBoxTiposRelacionesTipoProductoServicioInven.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoProductoServicioInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProductoServicioInven.setText("Accion");
		this.jComboBoxTiposAccionesTipoProductoServicioInven.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoProductoServicioInven = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoProductoServicioInven.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoProductoServicioInven.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoProductoServicioInven=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoProductoServicioInven.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProductoServicioInven.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoProductoServicioInven.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoProductoServicioInven = new JLabelMe();
		
		this.jLabelAccionesTipoProductoServicioInven.setText("Acciones");		
		this.jLabelAccionesTipoProductoServicioInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProductoServicioInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProductoServicioInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoProductoServicioInven = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoProductoServicioInven.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoProductoServicioInven.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoProductoServicioInven = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoProductoServicioInven.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoProductoServicioInven.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoProductoServicioInven = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoProductoServicioInven.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoProductoServicioInven.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoProductoServicioInven = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoProductoServicioInven.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoProductoServicioInven.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoProductoServicioInven = new JButtonMe();
		//this.jButtonAnterioresTipoProductoServicioInven.setText("<<");
        this.jButtonAnterioresTipoProductoServicioInven.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoProductoServicioInven,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoProductoServicioInven = new JButtonMe();
		//this.jButtonSiguientesTipoProductoServicioInven.setText(">>");
        this.jButtonSiguientesTipoProductoServicioInven.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoProductoServicioInven,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoProductoServicioInven = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoProductoServicioInven.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoProductoServicioInven.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoProductoServicioInven,"nuevoguardarcambios_button","Nue",this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoProductoServicioInven";
		inputMap = this.jButtonNuevoGuardarCambiosTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoProductoServicioInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoProductoServicioInven"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoProductoServicioInven";
		inputMap = this.jButtonRecargarInformacionTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoProductoServicioInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoProductoServicioInven"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoProductoServicioInven";
		inputMap = this.jButtonSiguientesTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoProductoServicioInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoProductoServicioInven"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoProductoServicioInven";
		inputMap = this.jButtonAnterioresTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoProductoServicioInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoProductoServicioInven"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoProductoServicioInven();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoProductoServicioInven.setMinimumSize(new Dimension(this.getWidth(),TipoProductoServicioInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProductoServicioInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProductoServicioInven.setMaximumSize(new Dimension(this.getWidth(),TipoProductoServicioInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProductoServicioInvenBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoProductoServicioInven.setPreferredSize(new Dimension(this.getWidth(),TipoProductoServicioInvenBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoProductoServicioInvenBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoProductoServicioInven = new GridBagLayout();

			this.jPanelPaginacionTipoProductoServicioInven.setLayout(gridaBagLayoutPaginacionTipoProductoServicioInven);						
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = 0;
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoProductoServicioInven.add(this.jButtonAnterioresTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
					
						
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = 0;
			
			this.jPanelPaginacionTipoProductoServicioInven.add(this.jButtonNuevoGuardarCambiosTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
						
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = 0;
			this.jPanelPaginacionTipoProductoServicioInven.add(this.jButtonSiguientesTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = 1;
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProductoServicioInven.add(this.jButtonNuevoTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
				this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProductoServicioInven.gridy = 1;
				this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoProductoServicioInven.add(this.jButtonNuevoRelacionesTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
			}
			
			
			if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
				this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoProductoServicioInven.gridy = 1;
				this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoProductoServicioInven.add(this.jButtonGuardarCambiosTablaTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
			}
			
			
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = 1;
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProductoServicioInven.add(this.jButtonDuplicarTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = 1;
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProductoServicioInven.add(this.jButtonCopiarTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = 1;
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoProductoServicioInven.add(this.jButtonVerFormTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = 1;
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoProductoServicioInven.add(this.jButtonCerrarTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		
		
		
		this.jButtonRecargarInformacionTipoProductoServicioInven.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProductoServicioInven.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoProductoServicioInven.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoProductoServicioInven.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProductoServicioInven.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoProductoServicioInven.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoProductoServicioInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProductoServicioInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoProductoServicioInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoProductoServicioInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProductoServicioInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoProductoServicioInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoProductoServicioInven.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProductoServicioInven.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoProductoServicioInven.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoProductoServicioInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProductoServicioInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoProductoServicioInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoProductoServicioInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProductoServicioInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProductoServicioInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoProductoServicioInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProductoServicioInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoProductoServicioInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoProductoServicioInven.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProductoServicioInven.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoProductoServicioInven.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoProductoServicioInven.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProductoServicioInven.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoProductoServicioInven.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoProductoServicioInven.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProductoServicioInven.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoProductoServicioInven.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoProductoServicioInven.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProductoServicioInven.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoProductoServicioInven.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoProductoServicioInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoProductoServicioInven = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoProductoServicioInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoProductoServicioInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoProductoServicioInven = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoProductoServicioInven = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoProductoServicioInven.setLayout(gridaBagParametrosReportesTipoProductoServicioInven);
			this.jPanelParametrosReportesAccionesTipoProductoServicioInven.setLayout(gridaBagParametrosReportesAccionesTipoProductoServicioInven);
			
			
			this.jPanelParametrosAuxiliar1TipoProductoServicioInven.setLayout(gridaBagParametrosAuxiliar1TipoProductoServicioInven);
			this.jPanelParametrosAuxiliar2TipoProductoServicioInven.setLayout(gridaBagParametrosAuxiliar2TipoProductoServicioInven);
			this.jPanelParametrosAuxiliar3TipoProductoServicioInven.setLayout(gridaBagParametrosAuxiliar3TipoProductoServicioInven);
			this.jPanelParametrosAuxiliar4TipoProductoServicioInven.setLayout(gridaBagParametrosAuxiliar4TipoProductoServicioInven);
			//this.jPanelParametrosAuxiliar5TipoProductoServicioInven.setLayout(gridaBagParametrosAuxiliar2TipoProductoServicioInven);			
			
			
			
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProductoServicioInven.add(this.jButtonRecargarInformacionTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProductoServicioInven.add(this.jComboBoxTiposPaginacionTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProductoServicioInven.add(this.jCheckBoxConAltoMaximoTablaTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoProductoServicioInven.add(this.jComboBoxTiposArchivosReportesTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProductoServicioInven.add(this.jPanelParametrosAuxiliar1TipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProductoServicioInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoProductoServicioInven.add(this.jComboBoxTiposReportesTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProductoServicioInven.add(this.jPanelParametrosAuxiliar4TipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProductoServicioInven.add(this.jComboBoxTiposReportesTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProductoServicioInven.add(this.jCheckBoxGenerarReporteTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProductoServicioInven.add(this.jPanelParametrosAuxiliar2TipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProductoServicioInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProductoServicioInven.add(this.jLabelAccionesTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
				this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoProductoServicioInven.add(this.jButtonAbrirOrderByTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProductoServicioInven.add(this.jComboBoxTiposSeleccionarTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);			
			
			
			/*
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoProductoServicioInven.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoProductoServicioInven.add(this.jCheckBoxSeleccionarTodosTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProductoServicioInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProductoServicioInven.add(this.jCheckBoxSeleccionarTodosTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);															
				
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoProductoServicioInven.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoProductoServicioInven.add(this.jCheckBoxSeleccionadosTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoProductoServicioInven.add(this.jPanelParametrosAuxiliar3TipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProductoServicioInven.add(this.jComboBoxTiposRelacionesTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
				
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoProductoServicioInven.add(this.jComboBoxTiposAccionesTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoProductoServicioInven = new GridBagLayout();

			this.jScrollPanelDatosTipoProductoServicioInven.setLayout(gridaBagLayoutDatosTipoProductoServicioInven);
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = 0;
			this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
			
			this.jScrollPanelDatosTipoProductoServicioInven.add(this.jTableDatosTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoProductoServicioInven.setViewportView(this.jTableDatosTipoProductoServicioInven);
		this.jTableDatosTipoProductoServicioInven.setFillsViewportHeight(true);
		this.jTableDatosTipoProductoServicioInven.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoProductoServicioInven= new GridBagLayout();
		this.jPanelAccionesTipoProductoServicioInven.setLayout(gridaBagLayoutAccionesTipoProductoServicioInven);
		
		
		/*	
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = 0;
		this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
			
		this.jPanelAccionesTipoProductoServicioInven.add(this.jButtonNuevoTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoProductoServicioInven= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoProductoServicioInven.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoProductoServicioInven.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoProductoServicioInven.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoProductoServicioInven.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoProductoServicioInven.setLayout(gridaBagLayoutBusquedaPorNombreTipoProductoServicioInven);

		gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoProductoServicioInven.gridy = 0;
		gridBagConstraintsTipoProductoServicioInven.gridx = 0;
		jPanelBusquedaPorNombreTipoProductoServicioInven.add(jLabelnombreBusquedaPorNombreTipoProductoServicioInven, gridBagConstraintsTipoProductoServicioInven);

		gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoProductoServicioInven.gridy = 0;
		gridBagConstraintsTipoProductoServicioInven.gridx = 1;
		jPanelBusquedaPorNombreTipoProductoServicioInven.add(jTextAreanombreBusquedaPorNombreTipoProductoServicioInven, gridBagConstraintsTipoProductoServicioInven);

		gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoProductoServicioInven.gridy = 1;
		gridBagConstraintsTipoProductoServicioInven.gridx =1;
		jPanelBusquedaPorNombreTipoProductoServicioInven.add(jButtonBusquedaPorNombreTipoProductoServicioInven, gridBagConstraintsTipoProductoServicioInven);

		jTabbedPaneBusquedasTipoProductoServicioInven.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoProductoServicioInven);
		jTabbedPaneBusquedasTipoProductoServicioInven.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProductoServicioInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProductoServicioInven);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();						
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;		
			//this.gridBagConstraintsTipoProductoServicioInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProductoServicioInven.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;		
		//this.gridBagConstraintsTipoProductoServicioInven.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoProductoServicioInven.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoProductoServicioInven);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;		
			this.gridBagConstraintsTipoProductoServicioInven.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoProductoServicioInven.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);								
		
		
		/*
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		*/		
		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProductoServicioInven.gridx =0;
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProductoServicioInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
				
		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoProductoServicioInvenJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoProductoServicioInven= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProductoServicioInven = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoProductoServicioInven.setLayout(gridaBagLayoutBusquedasParametrosTipoProductoServicioInven);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoProductoServicioInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProductoServicioInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProductoServicioInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProductoServicioInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
			
			
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		
			
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoProductoServicioInven;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoProductoServicioInven() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoProductoServicioInven = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoProductoServicioInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoProductoServicioInven.setName("jPanelReporteDinamicoTipoProductoServicioInven"); 
		
		this.jPanelReporteDinamicoTipoProductoServicioInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProductoServicioInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoProductoServicioInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoProductoServicioInven.setLayout(gridaBagLayoutReporteDinamicoTipoProductoServicioInven);
		
		
		this.jInternalFrameReporteDinamicoTipoProductoServicioInven= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoProductoServicioInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProductoServicioInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoProductoServicioInven.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProductoServicioInven.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoProductoServicioInven.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Producto Servicio Inventarios"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoProductoServicioInven = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoProductoServicioInven.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoProductoServicioInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProductoServicioInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoProductoServicioInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProductoServicioInven.add(this.jLabelColumnasSelectReporteTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoProductoServicioInven = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoProductoServicioInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoProductoServicioInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoProductoServicioInven.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProductoServicioInven.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoProductoServicioInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoProductoServicioInven=new JScrollPane(this.jListColumnasSelectReporteTipoProductoServicioInven);
			
			this.jScrollColumnasSelectReporteTipoProductoServicioInven.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProductoServicioInven.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoProductoServicioInven.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProductoServicioInven.add(this.jListColumnasSelectReporteTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		this.jPanelReporteDinamicoTipoProductoServicioInven.add(this.jScrollColumnasSelectReporteTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoProductoServicioInven = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoProductoServicioInven.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoProductoServicioInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProductoServicioInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoProductoServicioInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoProductoServicioInven.add(this.jLabelRelacionesSelectReporteTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoProductoServicioInven = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoProductoServicioInven.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoProductoServicioInven.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoProductoServicioInven.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProductoServicioInven.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoProductoServicioInven.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoProductoServicioInven=new JScrollPane(this.jListRelacionesSelectReporteTipoProductoServicioInven);
			
			this.jScrollRelacionesSelectReporteTipoProductoServicioInven.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProductoServicioInven.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoProductoServicioInven.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoProductoServicioInven.add(this.jListRelacionesSelectReporteTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		this.jPanelReporteDinamicoTipoProductoServicioInven.add(this.jScrollRelacionesSelectReporteTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoProductoServicioInven = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoProductoServicioInven = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoProductoServicioInven = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoProductoServicioInven = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoProductoServicioInven.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoProductoServicioInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProductoServicioInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoProductoServicioInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoProductoServicioInven = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProductoServicioInven.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoProductoServicioInven.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProductoServicioInven.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoProductoServicioInven.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoProductoServicioInven = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoProductoServicioInven.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoProductoServicioInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProductoServicioInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoProductoServicioInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProductoServicioInven.add(this.jLabelGenerarExcelReporteDinamicoTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoProductoServicioInven = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoProductoServicioInven.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoProductoServicioInven,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoProductoServicioInven.setToolTipText("Generar EXCEL"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoProductoServicioInven.add(this.jButtonGenerarExcelReporteDinamicoTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProductoServicioInven.add(this.jComboBoxTiposReportesDinamicoTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoProductoServicioInven = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoProductoServicioInven.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoProductoServicioInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProductoServicioInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoProductoServicioInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoProductoServicioInven.add(this.jLabelTiposArchivoReporteDinamicoTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProductoServicioInven.add(this.jComboBoxTiposArchivosReportesDinamicoTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoProductoServicioInven = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoProductoServicioInven.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoProductoServicioInven,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoProductoServicioInven.setToolTipText("Generar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProductoServicioInven.add(this.jButtonGenerarReporteDinamicoTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoProductoServicioInven = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoProductoServicioInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoProductoServicioInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoProductoServicioInven.setToolTipText("Cancelar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoProductoServicioInven.add(this.jButtonCerrarReporteDinamicoTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoProductoServicioInven = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoProductoServicioInven= new JScrollPane(jPanelReporteDinamicoTipoProductoServicioInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoProductoServicioInven.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProductoServicioInven.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoProductoServicioInven.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Producto Servicio Inventarios"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoProductoServicioInven.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoProductoServicioInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoProductoServicioInven);
		this.jInternalFrameReporteDinamicoTipoProductoServicioInven.getContentPane().add(this.jScrollPanelReporteDinamicoTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoProductoServicioInven() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoProductoServicioInven = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoProductoServicioInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoProductoServicioInven.setName("jPanelImportacionTipoProductoServicioInven"); 
		
		this.jPanelImportacionTipoProductoServicioInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProductoServicioInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoProductoServicioInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoProductoServicioInven.setLayout(gridaBagLayoutImportacionTipoProductoServicioInven);
		
		
		this.jInternalFrameImportacionTipoProductoServicioInven= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoProductoServicioInven= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoProductoServicioInven = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoProductoServicioInven= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoProductoServicioInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProductoServicioInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProductoServicioInven.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoProductoServicioInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProductoServicioInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProductoServicioInven.setResizable(true);
	    this.jInternalFrameImportacionTipoProductoServicioInven.setClosable(true);
	    this.jInternalFrameImportacionTipoProductoServicioInven.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoProductoServicioInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoProductoServicioInven.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoProductoServicioInven.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoProductoServicioInven.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoProductoServicioInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoProductoServicioInven.setResizable(true);
	    this.jInternalFrameImportacionTipoProductoServicioInven.setClosable(true);
	    this.jInternalFrameImportacionTipoProductoServicioInven.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoProductoServicioInven.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProductoServicioInven.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoProductoServicioInven.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Producto Servicio Inventarios"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoProductoServicioInven = new JLabelMe();

		this.jLabelArchivoImportacionTipoProductoServicioInven.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoProductoServicioInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProductoServicioInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoProductoServicioInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProductoServicioInven.add(this.jLabelArchivoImportacionTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoProductoServicioInven = new JFileChooser();		
		this.jFileChooserImportacionTipoProductoServicioInven.setToolTipText("ESCOGER ARCHIVO"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoProductoServicioInven = new JButtonMe();
		this.jButtonAbrirImportacionTipoProductoServicioInven.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoProductoServicioInven,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoProductoServicioInven.setToolTipText("Generar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProductoServicioInven.add(this.jButtonAbrirImportacionTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoProductoServicioInven = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoProductoServicioInven.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoProductoServicioInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProductoServicioInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoProductoServicioInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoProductoServicioInven.add(this.jLabelPathArchivoImportacionTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoProductoServicioInven=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoProductoServicioInven.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProductoServicioInven.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoProductoServicioInven.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProductoServicioInven.add(this.jTextFieldPathArchivoImportacionTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoProductoServicioInven = new JButtonMe();
		this.jButtonGenerarImportacionTipoProductoServicioInven.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoProductoServicioInven,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoProductoServicioInven.setToolTipText("Generar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProductoServicioInven.add(this.jButtonGenerarImportacionTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoProductoServicioInven = new JButtonMe();
		this.jButtonCerrarImportacionTipoProductoServicioInven.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoProductoServicioInven,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoProductoServicioInven.setToolTipText("Cancelar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoProductoServicioInven.add(this.jButtonCerrarImportacionTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoProductoServicioInven = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoProductoServicioInven= new JScrollPane(jPanelImportacionTipoProductoServicioInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoProductoServicioInven.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoProductoServicioInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoProductoServicioInven.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoProductoServicioInven);
		this.jInternalFrameImportacionTipoProductoServicioInven.getContentPane().add(this.jScrollPanelImportacionTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoProductoServicioInven(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoProductoServicioInven = new JButtonMe();
			this.jButtonAbrirOrderByTipoProductoServicioInven.setText("Orden");
			this.jButtonAbrirOrderByTipoProductoServicioInven.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoProductoServicioInven,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoProductoServicioInven";
			inputMap = this.jButtonAbrirOrderByTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoProductoServicioInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoProductoServicioInven"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoProductoServicioInven = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoProductoServicioInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoProductoServicioInven.setName("jPanelOrderByTipoProductoServicioInven"); 
			
			this.jPanelOrderByTipoProductoServicioInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProductoServicioInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoProductoServicioInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoProductoServicioInven.setLayout(gridaBagLayoutOrderByTipoProductoServicioInven);
			
			
			this.jTableDatosTipoProductoServicioInvenOrderBy = new JTableMe();        
			this.jTableDatosTipoProductoServicioInvenOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoProductoServicioInvenOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoProductoServicioInvenOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoProductoServicioInvenOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoProductoServicioInvenOrderBy.setViewportView(this.jTableDatosTipoProductoServicioInvenOrderBy);
			this.jTableDatosTipoProductoServicioInvenOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoProductoServicioInvenOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoProductoServicioInven= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoProductoServicioInven= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoProductoServicioInven = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoProductoServicioInven= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoProductoServicioInven.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoProductoServicioInven.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoProductoServicioInven.setTitle("Orden");
			this.jInternalFrameOrderByTipoProductoServicioInven.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoProductoServicioInven.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoProductoServicioInven.setResizable(true);
			this.jInternalFrameOrderByTipoProductoServicioInven.setClosable(true);
			this.jInternalFrameOrderByTipoProductoServicioInven.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoProductoServicioInven.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProductoServicioInven.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoProductoServicioInven.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Producto Servicio Inventarios"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoProductoServicioInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoProductoServicioInven.ipady =150;
				
			this.jPanelOrderByTipoProductoServicioInven.add(jScrollPanelDatosTipoProductoServicioInvenOrderBy, this.gridBagConstraintsTipoProductoServicioInven);//this.jTableDatosTipoProductoServicioInvenTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoProductoServicioInven = new JButtonMe();
			this.jButtonCerrarOrderByTipoProductoServicioInven.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoProductoServicioInven,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoProductoServicioInven.setToolTipText("Cancelar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoProductoServicioInven.add(this.jButtonCerrarOrderByTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoProductoServicioInven = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoProductoServicioInven= new JScrollPane(jPanelOrderByTipoProductoServicioInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoProductoServicioInven.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoProductoServicioInven.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoProductoServicioInven.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoProductoServicioInven);
			
			this.jInternalFrameOrderByTipoProductoServicioInven.getContentPane().add(this.jScrollPanelOrderByTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);			
		
		} else {
			this.jButtonAbrirOrderByTipoProductoServicioInven = new JButtonMe();
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
			&& this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoProductoServicioInven.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoProductoServicioInven.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoProductoServicioInven.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoProductoServicioInven.getRowHeight();//TipoProductoServicioInvenConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoProductoServicioInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProductoServicioInven.isSelected()) {
					iHeightTable=TipoProductoServicioInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProductoServicioInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProductoServicioInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoProductoServicioInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoProductoServicioInven.isSelected()) {
					iHeightTable=TipoProductoServicioInvenConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoProductoServicioInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoProductoServicioInvenConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoProductoServicioInven.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProductoServicioInven.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoProductoServicioInven.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoProductoServicioInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProductoServicioInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoProductoServicioInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoProductoServicioInven!=null && this.jInternalFrameOrderByTipoProductoServicioInven.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoProductoServicioInven.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoProductoServicioInven.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoProductoServicioInven.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoProductoServicioInven.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoProductoServicioInven.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoProductoServicioInven.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoProductoServicioInven.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoProductoServicioInven.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProductoServicioInven.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoProductoServicioInven.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoproductoservicioinvenLogic.getTipoProductoServicioInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoproductoservicioinvens.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoProductoServicioInven> TraerTipoProductoServicioInvenBeans(List<TipoProductoServicioInven> tipoproductoservicioinvens,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoProductoServicioInven tipoproductoservicioinven:tipoproductoservicioinvens) {
					
				if(!(TipoProductoServicioInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoProductoServicioInvenConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoproductoservicioinven.setsDetalleGeneralEntityReporte(TipoProductoServicioInvenConstantesFunciones.getTipoProductoServicioInvenDescripcion(tipoproductoservicioinven));
										
						
					
					

					if(tipoproductoservicioinven.getParametroInventarioDefectos()!=null && Funciones.existeClass(classes,ParametroInventarioDefecto.class)) {
						try{tipoproductoservicioinven.setparametroinventariodefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroInventarioDefectoJInternalFrame.TraerParametroInventarioDefectoBeans(tipoproductoservicioinven.getParametroInventarioDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoproductoservicioinven.setsDetalleGeneralEntityReporte(tipoproductoservicioinven.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoproductoservicioinvenbeans.add(tipoproductoservicioinvenbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoproductoservicioinvens;
    }
	//PARA REPORTES FIN
}
