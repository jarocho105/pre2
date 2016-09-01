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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoComprobanteConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoComprobanteJInternalFrame extends TipoComprobanteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoComprobante;
	
	protected JMenuBar jmenuBarTipoComprobante;
	
	protected JMenu jmenuTipoComprobante;
	protected JMenu jmenuDatosTipoComprobante;
	protected JMenu jmenuArchivoTipoComprobante;
	protected JMenu jmenuAccionesTipoComprobante;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoComprobante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoComprobante;	
	protected GridBagConstraints gridBagConstraintsTipoComprobante;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoComprobanteDetalleFormJInternalFrame jInternalFrameDetalleFormTipoComprobante;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoComprobante;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoComprobante;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoComprobanteSessionBean tipocomprobanteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoComprobante> tipocomprobantes;		
	public List<TipoComprobante> tipocomprobantesEliminados;	
	public List<TipoComprobante> tipocomprobantesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoComprobante;		
	protected JButton jButtonAbrirOrderByTipoComprobante;
	
	
	//protected JPanel jPanelOrderByTipoComprobante;
	//public JScrollPane jScrollPanelOrderByTipoComprobante;	
	//protected JButton jButtonCerrarOrderByTipoComprobante;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoComprobanteLogic tipocomprobanteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoComprobante;
	public JScrollPane jScrollPanelDatosEdicionTipoComprobante;
	public JScrollPane jScrollPanelDatosGeneralTipoComprobante;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoComprobanteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoComprobante;
	//public JScrollPane jScrollPanelImportacionTipoComprobante;
	
	
	
	protected JPanel jPanelAccionesTipoComprobante;
	
    protected JPanel jPanelPaginacionTipoComprobante;
    protected JPanel jPanelParametrosReportesTipoComprobante;
	protected JPanel jPanelParametrosReportesAccionesTipoComprobante;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoComprobante;
	protected JPanel jPanelParametrosAuxiliar2TipoComprobante;
	protected JPanel jPanelParametrosAuxiliar3TipoComprobante;
	protected JPanel jPanelParametrosAuxiliar4TipoComprobante;
	//protected JPanel jPanelParametrosAuxiliar5TipoComprobante;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoComprobante;
	//protected JPanel jPanelImportacionTipoComprobante;
	
	
	public JTable jTableDatosTipoComprobante;
	
	
	
	//public JTable jTableDatosTipoComprobanteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoComprobante;
	protected JButton jButtonDuplicarTipoComprobante;
	protected JButton jButtonCopiarTipoComprobante;
	protected JButton jButtonVerFormTipoComprobante;
	protected JButton jButtonNuevoRelacionesTipoComprobante;
	protected JButton jButtonModificarTipoComprobante;
	
    protected JButton jButtonGuardarCambiosTablaTipoComprobante;
	protected JButton jButtonCerrarTipoComprobante;
	
	
	protected JButton jButtonRecargarInformacionTipoComprobante;
	protected JButton jButtonProcesarInformacionTipoComprobante;
	
	
	protected JButton jButtonAnterioresTipoComprobante;
	protected JButton jButtonSiguientesTipoComprobante;
	protected JButton jButtonNuevoGuardarCambiosTipoComprobante;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoComprobante;
	//protected JButton jButtonCerrarReporteDinamicoTipoComprobante;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoComprobante;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoComprobante;
	//protected JButton jButtonGenerarImportacionTipoComprobante;
	//protected JButton jButtonCerrarImportacionTipoComprobante;
	//protected JFileChooser jFileChooserImportacionTipoComprobante;
	//protected File fileImportacionTipoComprobante;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoComprobante;
	protected JButton jButtonDuplicarToolBarTipoComprobante;
	protected JButton jButtonNuevoRelacionesToolBarTipoComprobante;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoComprobante;
	protected JButton jButtonCopiarToolBarTipoComprobante;
	protected JButton jButtonVerFormToolBarTipoComprobante;
	public JButton jButtonGuardarCambiosTablaToolBarTipoComprobante;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoComprobante;
	protected JButton jButtonCerrarToolBarTipoComprobante;
	
	protected JButton jButtonRecargarInformacionToolBarTipoComprobante;
	protected JButton jButtonProcesarInformacionToolBarTipoComprobante;
	protected JButton jButtonAnterioresToolBarTipoComprobante;
	protected JButton jButtonSiguientesToolBarTipoComprobante;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoComprobante;
	protected JButton jButtonAbrirOrderByToolBarTipoComprobante;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoComprobante;
	protected JMenuItem jMenuItemDuplicarTipoComprobante;
	protected JMenuItem jMenuItemNuevoRelacionesTipoComprobante;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoComprobante;
	protected JMenuItem jMenuItemCopiarTipoComprobante;
	protected JMenuItem jMenuItemVerFormTipoComprobante;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoComprobante;
	protected JMenuItem jMenuItemCerrarTipoComprobante;
	protected JMenuItem jMenuItemDetalleCerrarTipoComprobante;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoComprobante;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoComprobante;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoComprobante;
	protected JMenuItem jMenuItemProcesarInformacionTipoComprobante;
	protected JMenuItem jMenuItemAnterioresTipoComprobante;
	protected JMenuItem jMenuItemSiguientesTipoComprobante;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoComprobante;
	protected JMenuItem jMenuItemAbrirOrderByTipoComprobante;
	protected JMenuItem jMenuItemMostrarOcultarTipoComprobante;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoComprobante;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoComprobante;
	protected JCheckBox jCheckBoxSeleccionadosTipoComprobante;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoComprobante;
	protected JCheckBox jCheckBoxConGraficoReporteTipoComprobante;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoComprobante;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoComprobante;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoComprobante;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoComprobante;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoComprobante;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoComprobante;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoComprobante;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoComprobante;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoComprobante;
	protected JTextField jTextFieldValorCampoGeneralTipoComprobante;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoComprobante;
	//public JList<Reporte> jListColumnasSelectReporteTipoComprobante;
	//public JScrollPane jScrollColumnasSelectReporteTipoComprobante;
	
	//public JLabel jLabelRelacionesSelectReporteTipoComprobante;
	//public JList<Reporte> jListRelacionesSelectReporteTipoComprobante;
	//public JScrollPane jScrollRelacionesSelectReporteTipoComprobante;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoComprobante;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoComprobante;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoComprobante;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoComprobante;
	
		
	//public JLabel jLabelArchivoImportacionTipoComprobante;	
	//public JLabel jLabelPathArchivoImportacionTipoComprobante;
	//protected JTextField jTextFieldPathArchivoImportacionTipoComprobante;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoComprobante;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoComprobante;
	
	//public JLabel jLabelColumnaCategoriaValorTipoComprobante;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoComprobante;
	
	//public JLabel jLabelColumnasValoresGraficoTipoComprobante;
	//public JList<Reporte> jListColumnasValoresGraficoTipoComprobante;
	//public JScrollPane jScrollColumnasValoresGraficoTipoComprobante;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoComprobante;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoComprobante;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoComprobante;
	public JPanel jPanelBusquedaPorIdTipoComprobante;
	public JButton jButtonBusquedaPorIdTipoComprobante;
	public JPanel jPanelBusquedaPorNombreTipoComprobante;
	public JButton jButtonBusquedaPorNombreTipoComprobante;
	
	public JPanel jPanelIdIdBusquedaPorIdTipoComprobante;
	public JLabel jLabelidBusquedaPorIdTipoComprobante;
	public JTextFieldMe jLabelidTipoComprobanteBusquedaPorId;
	public JButton jButtonidBusquedaPorIdTipoComprobanteBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoComprobante;
	public JLabel jLabelnombreBusquedaPorNombreTipoComprobante;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoComprobante;
	public JButton jButtonnombreBusquedaPorNombreTipoComprobanteBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoComprobanteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoComprobante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComprobanteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoComprobante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComprobanteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoComprobante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComprobanteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoComprobante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoComprobante)	{
		this.jButtonRecargarInformacionTipoComprobante = jButtonRecargarInformacionTipoComprobante;
	}
	
	public JButton getjButtonProcesarInformacionTipoComprobante() {
		return this.jButtonProcesarInformacionTipoComprobante;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoComprobante)	{
		this.jButtonProcesarInformacionTipoComprobante = jButtonProcesarInformacionTipoComprobante;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoComprobante() {
		return this.jButtonRecargarInformacionTipoComprobante;
	}
	
	
	public List<TipoComprobante> gettipocomprobantes() {
		return this.tipocomprobantes;
	}

	public void settipocomprobantes(List<TipoComprobante> tipocomprobantes) {
		this.tipocomprobantes = tipocomprobantes;
	}
	
	public List<TipoComprobante> gettipocomprobantesAux() {
		return this.tipocomprobantesAux;
	}

	public void settipocomprobantesAux(List<TipoComprobante> tipocomprobantesAux) {
		this.tipocomprobantesAux = tipocomprobantesAux;
	}
	
	public List<TipoComprobante> gettipocomprobantesEliminados() {
		return this.tipocomprobantesEliminados;
	}

	public void setTipoComprobantesEliminados(List<TipoComprobante> tipocomprobantesEliminados) {
		this.tipocomprobantesEliminados = tipocomprobantesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoComprobante() {
		return jComboBoxTiposSeleccionarTipoComprobante;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoComprobante(
			JComboBox jComboBoxTiposSeleccionarTipoComprobante) {
		this.jComboBoxTiposSeleccionarTipoComprobante = jComboBoxTiposSeleccionarTipoComprobante;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoComprobante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoComprobante.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoComprobante .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoComprobante() {
		return jTextFieldValorCampoGeneralTipoComprobante;
	}

	public void setjTextFieldValorCampoGeneralTipoComprobante(
			JTextField jTextFieldValorCampoGeneralTipoComprobante) {
		this.jTextFieldValorCampoGeneralTipoComprobante = jTextFieldValorCampoGeneralTipoComprobante;
	}

	public void setBorderResaltarValorCampoGeneralTipoComprobante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComprobante.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoComprobante .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoComprobante() {
		return this.jCheckBoxSeleccionarTodosTipoComprobante;
	}

	public void setjCheckBoxSeleccionarTodosTipoComprobante(
			JCheckBox jCheckBoxSeleccionarTodosTipoComprobante) {
		this.jCheckBoxSeleccionarTodosTipoComprobante = jCheckBoxSeleccionarTodosTipoComprobante;
	}

	public void setBorderResaltarSeleccionarTodosTipoComprobante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComprobante.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoComprobante .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoComprobante() {
		return this.jCheckBoxSeleccionadosTipoComprobante;
	}

	public void setjCheckBoxSeleccionadosTipoComprobante(
			JCheckBox jCheckBoxSeleccionadosTipoComprobante) {
		this.jCheckBoxSeleccionadosTipoComprobante = jCheckBoxSeleccionadosTipoComprobante;
	}
	
	public void setBorderResaltarSeleccionadosTipoComprobante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComprobante.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoComprobante .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoComprobante() {
		return this.jComboBoxTiposArchivosReportesTipoComprobante;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoComprobante(
			JComboBox jComboBoxTiposArchivosReportesTipoComprobante) {
		this.jComboBoxTiposArchivosReportesTipoComprobante = jComboBoxTiposArchivosReportesTipoComprobante;
	}

	public void setBorderResaltarTiposArchivosReportesTipoComprobante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComprobante.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoComprobante .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoComprobante() {
		return this.jComboBoxTiposReportesTipoComprobante;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoComprobante(
			JComboBox jComboBoxTiposReportesTipoComprobante) {
		this.jComboBoxTiposReportesTipoComprobante = jComboBoxTiposReportesTipoComprobante;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoComprobante() {
	//	return jComboBoxTiposReportesDinamicoTipoComprobante;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoComprobante(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoComprobante) {
	//	this.jComboBoxTiposReportesDinamicoTipoComprobante = jComboBoxTiposReportesDinamicoTipoComprobante;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoComprobante() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoComprobante;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoComprobante(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoComprobante) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoComprobante = jComboBoxTiposArchivosReportesDinamicoTipoComprobante;
	//}
	
	public void setBorderResaltarTiposReportesTipoComprobante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComprobante.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoComprobante .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoComprobante() {
		return this.jComboBoxTiposGraficosReportesTipoComprobante;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoComprobante(
			JComboBox jComboBoxTiposGraficosReportesTipoComprobante) {
		this.jComboBoxTiposGraficosReportesTipoComprobante = jComboBoxTiposGraficosReportesTipoComprobante;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoComprobante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComprobante.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoComprobante .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoComprobante() {
		return this.jComboBoxTiposPaginacionTipoComprobante;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoComprobante(
			JComboBox jComboBoxTiposPaginacionTipoComprobante) {
		this.jComboBoxTiposPaginacionTipoComprobante = jComboBoxTiposPaginacionTipoComprobante;
	}
	
	public void setBorderResaltarTiposPaginacionTipoComprobante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComprobante.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoComprobante .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoComprobante() {
		return this.jComboBoxTiposRelacionesTipoComprobante;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoComprobante() {
		return this.jComboBoxTiposAccionesTipoComprobante;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoComprobante(
			JComboBox jComboBoxTiposRelacionesTipoComprobante) {
		this.jComboBoxTiposRelacionesTipoComprobante = jComboBoxTiposRelacionesTipoComprobante;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoComprobante(
			JComboBox jComboBoxTiposAccionesTipoComprobante) {
		this.jComboBoxTiposAccionesTipoComprobante = jComboBoxTiposAccionesTipoComprobante;
	}
	
	public void setBorderResaltarTiposRelacionesTipoComprobante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComprobante.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoComprobante .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoComprobante() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoComprobante.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoComprobante .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoComprobante() {
	//	return jCheckBoxConGraficoDinamicoTipoComprobante;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoComprobante(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoComprobante) {
	//	this.jCheckBoxConGraficoDinamicoTipoComprobante = jCheckBoxConGraficoDinamicoTipoComprobante;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoComprobante() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoComprobante.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoComprobante .setBorder(borderResaltar);		
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
		this.tipocomprobanteSessionBean=new TipoComprobanteSessionBean();
		
		this.tipocomprobanteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocomprobanteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocomprobanteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoComprobanteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoComprobanteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoComprobanteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoComprobanteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoComprobanteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Comprobante MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoComprobanteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoComprobante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoComprobante= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoComprobante,this.jTtoolBarTipoComprobante,
							"nuevo","nuevo","Nuevo"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoComprobante,this.jTtoolBarTipoComprobante,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoComprobante,this.jTtoolBarTipoComprobante,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoComprobante,this.jTtoolBarTipoComprobante,
							"duplicar","duplicar","Duplicar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoComprobante,this.jTtoolBarTipoComprobante,
							"copiar","copiar","Copiar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoComprobante,this.jTtoolBarTipoComprobante,
							"ver_form","ver_form","Ver"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoComprobante,this.jTtoolBarTipoComprobante,
							"recargar","recargar","Recargar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoComprobante,this.jTtoolBarTipoComprobante,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoComprobante,this.jTtoolBarTipoComprobante,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoComprobante,this.jTtoolBarTipoComprobante,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoComprobante,this.jTtoolBarTipoComprobante,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoComprobante,this.jTtoolBarTipoComprobante,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoComprobante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoComprobante,this.jTtoolBarTipoComprobante,
							"cerrar","cerrar","Salir"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoComprobante=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoComprobante;
			
				this.jButtonProcesarInformacionToolBarTipoComprobante=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoComprobante;
				
		//protected JButton jButtonModificarToolBarTipoComprobante;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoComprobante=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoComprobante=new JMenuMe("General");
		this.jmenuArchivoTipoComprobante=new JMenuMe("Archivo");
		this.jmenuAccionesTipoComprobante=new JMenuMe("Acciones");
		this.jmenuDatosTipoComprobante=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoComprobante= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoComprobante.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoComprobante,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoComprobante= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoComprobante.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoComprobante,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoComprobante= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoComprobante.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoComprobante,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoComprobante= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoComprobante.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoComprobante,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoComprobante= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoComprobante.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoComprobante,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoComprobante= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoComprobante.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoComprobante,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoComprobante= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoComprobante.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoComprobante,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoComprobante= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoComprobante.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoComprobante,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoComprobante= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoComprobante.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoComprobante,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoComprobante= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoComprobante.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoComprobante,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoComprobante= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoComprobante.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoComprobante,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoComprobante= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoComprobante.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoComprobante,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoComprobante= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoComprobante.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoComprobante,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoComprobante= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoComprobante.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoComprobante,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoComprobante= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoComprobante.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoComprobante,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoComprobante= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoComprobante.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoComprobante,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoComprobante= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoComprobante.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoComprobante,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoComprobante.add(this.jMenuItemCerrarTipoComprobante);
			
			this.jmenuAccionesTipoComprobante.add(this.jMenuItemNuevoTipoComprobante);
			this.jmenuAccionesTipoComprobante.add(this.jMenuItemNuevoGuardarCambiosTipoComprobante);
			this.jmenuAccionesTipoComprobante.add(this.jMenuItemNuevoRelacionesTipoComprobante);
			this.jmenuAccionesTipoComprobante.add(this.jMenuItemGuardarCambiosTablaTipoComprobante);		
			this.jmenuAccionesTipoComprobante.add(this.jMenuItemDuplicarTipoComprobante);		
			this.jmenuAccionesTipoComprobante.add(this.jMenuItemCopiarTipoComprobante);		
			this.jmenuAccionesTipoComprobante.add(this.jMenuItemVerFormTipoComprobante);		
			
			this.jmenuDatosTipoComprobante.add(this.jMenuItemRecargarInformacionTipoComprobante);				
			this.jmenuDatosTipoComprobante.add(this.jMenuItemAnterioresTipoComprobante);				
			this.jmenuDatosTipoComprobante.add(this.jMenuItemSiguientesTipoComprobante);				
			this.jmenuDatosTipoComprobante.add(this.jMenuItemAbrirOrderByTipoComprobante);				
			this.jmenuDatosTipoComprobante.add(this.jMenuItemMostrarOcultarTipoComprobante);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoComprobante.add(this.jMenuItemGuardarCambiosTipoComprobante);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoComprobante.add(this.jmenuArchivoTipoComprobante);		
			this.jmenuBarTipoComprobante.add(this.jmenuAccionesTipoComprobante);		
			this.jmenuBarTipoComprobante.add(this.jmenuDatosTipoComprobante);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoComprobante);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoComprobante() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorIdTipoComprobante=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdTipoComprobante.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaPorIdTipoComprobante= new JButtonMe();
		this.jButtonBusquedaPorIdTipoComprobante.setText("Buscar");
		this.jButtonBusquedaPorIdTipoComprobante.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdTipoComprobante,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaPorIdTipoComprobante = new JLabelMe();
		jLabelidBusquedaPorIdTipoComprobante.setText("Id :");
		jLabelidBusquedaPorIdTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaPorIdTipoComprobante,STIPO_TAMANIO_GENERAL,false,true,this);

		jLabelidTipoComprobanteBusquedaPorId= new JTextFieldMe();
		jLabelidTipoComprobanteBusquedaPorId.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoComprobanteBusquedaPorId.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoComprobanteBusquedaPorId.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



		this.jPanelBusquedaPorNombreTipoComprobante=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoComprobante.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoComprobante= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoComprobante.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoComprobante.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoComprobante,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoComprobante = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoComprobante.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoComprobante.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoComprobante,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoComprobante= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoComprobante,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoComprobante=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoComprobante.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoComprobante.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoComprobante.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoComprobante.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoComprobante,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoComprobante = new TipoComprobanteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Comprobante DATOS");
			this.jInternalFrameDetalleFormTipoComprobante = new TipoComprobanteDetalleFormJInternalFrame(jDesktopPane,this.tipocomprobanteSessionBean.getConGuardarRelaciones(),this.tipocomprobanteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoComprobante = null;//new TipoComprobanteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoComprobante= new GridBagLayout();
		
		
		this.jTableDatosTipoComprobante = new JTableMe();      
		
		String sToolTipTipoComprobante="";
		sToolTipTipoComprobante=TipoComprobanteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoComprobante+="(Contabilidad.TipoComprobante)";
		}
		
		if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoComprobante+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoComprobante.setToolTipText(sToolTipTipoComprobante);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoComprobante);
		this.jTableDatosTipoComprobante.setAutoCreateRowSorter(true);
		this.jTableDatosTipoComprobante.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoComprobante.setRowSelectionAllowed(true);
		this.jTableDatosTipoComprobante.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoComprobante,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoComprobante = new JButtonMe();
		this.jButtonDuplicarTipoComprobante = new JButtonMe();
		this.jButtonCopiarTipoComprobante = new JButtonMe();
		this.jButtonVerFormTipoComprobante = new JButtonMe();
		this.jButtonNuevoRelacionesTipoComprobante = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoComprobante = new JButtonMe();
		this.jButtonCerrarTipoComprobante = new JButtonMe();
		
		this.jScrollPanelDatosTipoComprobante = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoComprobante = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoComprobante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Comprobante";
		
		if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comprobantes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoComprobante.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoComprobante.setToolTipText("Acciones");
        this.jPanelAccionesTipoComprobante.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoComprobante=new ReporteDinamicoJInternalFrame(TipoComprobanteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoComprobante();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoComprobante=new ImportacionJInternalFrame(TipoComprobanteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoComprobante();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoComprobante = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoComprobante.setText("Orden");
		this.jButtonAbrirOrderByTipoComprobante.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoComprobante,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoComprobante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoComprobante=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoComprobante,false,this);
			
			//this.cargarOrderByTipoComprobante(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoComprobante=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoComprobante,true,this);
			
			//this.cargarOrderByTipoComprobante(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoComprobante.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoComprobante.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoComprobante.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoComprobante.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoComprobante.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoComprobante.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoComprobante.setText("Nuevo");
		this.jButtonDuplicarTipoComprobante.setText("Duplicar");
		this.jButtonCopiarTipoComprobante.setText("Copiar");
		this.jButtonVerFormTipoComprobante.setText("Ver");
		this.jButtonNuevoRelacionesTipoComprobante.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoComprobante.setText("Guardar");
		this.jButtonCerrarTipoComprobante.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoComprobante,"nuevo_button","Nuevo",this.tipocomprobanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoComprobante,"duplicar_button","Duplicar",this.tipocomprobanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoComprobante,"copiar_button","Copiar",this.tipocomprobanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoComprobante,"ver_form","Ver",this.tipocomprobanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoComprobante,"nuevorelaciones_button","Nuevo Rel",this.tipocomprobanteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoComprobante,"guardarcambiostabla_button","Guardar",this.tipocomprobanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoComprobante,"cerrar_button","Salir",this.tipocomprobanteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoComprobante.setToolTipText("Nuevo"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoComprobante.setToolTipText("Duplicar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoComprobante.setToolTipText("Copiar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoComprobante.setToolTipText("Ver"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoComprobante.setToolTipText("Nuevo Rel"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoComprobante.setToolTipText("Guardar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoComprobante.setToolTipText("Salir"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoComprobante";
		inputMap = this.jButtonNuevoTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoComprobante.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoComprobante"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoComprobante";
		inputMap = this.jButtonDuplicarTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoComprobante.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoComprobante"));
		
		//COPIAR
		sMapKey = "CopiarTipoComprobante";
		inputMap = this.jButtonCopiarTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoComprobante.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoComprobante"));
		
		//VEr FORM
		sMapKey = "VerFormTipoComprobante";
		inputMap = this.jButtonVerFormTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoComprobante.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoComprobante"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoComprobante";
		inputMap = this.jButtonNuevoRelacionesTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoComprobante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoComprobante"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoComprobante";
		inputMap = this.jButtonModificarTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoComprobante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoComprobante"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoComprobante";
		inputMap = this.jButtonCerrarTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoComprobante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoComprobante"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoComprobante";
		inputMap = this.jButtonGuardarCambiosTablaTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoComprobante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoComprobante"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoComprobante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoComprobante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoComprobante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoComprobante= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoComprobante= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoComprobante= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoComprobante= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoComprobante= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoComprobante.setName("jPanelParametrosReportesTipoComprobante"); 
		
		this.jPanelParametrosReportesAccionesTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoComprobante.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoComprobante.setName("jPanelParametrosReportesAccionesTipoComprobante"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoComprobante, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoComprobante = new JButtonMe();
		this.jButtonRecargarInformacionTipoComprobante.setText("Recargar");
		this.jButtonRecargarInformacionTipoComprobante.setToolTipText("Recargar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoComprobante,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoComprobante = new JButtonMe();
		this.jButtonProcesarInformacionTipoComprobante.setText("Procesar");
		this.jButtonProcesarInformacionTipoComprobante.setToolTipText("Procesar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoComprobante.setVisible(false);
			
		this.jButtonProcesarInformacionTipoComprobante.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoComprobante.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoComprobante.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoComprobante = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoComprobante.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoComprobante.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoComprobante = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoComprobante.setText("TIPO");       
		this.jComboBoxTiposReportesTipoComprobante.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoComprobante = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoComprobante.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoComprobante.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoComprobante = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoComprobante.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoComprobante.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoComprobante = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoComprobante.setText("Accion");
		this.jComboBoxTiposRelacionesTipoComprobante.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoComprobante = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoComprobante.setText("Accion");
		this.jComboBoxTiposAccionesTipoComprobante.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoComprobante = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoComprobante.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoComprobante.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoComprobante=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoComprobante.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoComprobante.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoComprobante.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoComprobante = new JLabelMe();
		
		this.jLabelAccionesTipoComprobante.setText("Acciones");		
		this.jLabelAccionesTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoComprobante = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoComprobante.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoComprobante.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoComprobante = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoComprobante.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoComprobante.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoComprobante = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoComprobante.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoComprobante.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoComprobante = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoComprobante.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoComprobante.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoComprobante = new JButtonMe();
		//this.jButtonAnterioresTipoComprobante.setText("<<");
        this.jButtonAnterioresTipoComprobante.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoComprobante,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoComprobante = new JButtonMe();
		//this.jButtonSiguientesTipoComprobante.setText(">>");
        this.jButtonSiguientesTipoComprobante.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoComprobante,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoComprobante = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoComprobante.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoComprobante.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoComprobante,"nuevoguardarcambios_button","Nue",this.tipocomprobanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoComprobante";
		inputMap = this.jButtonNuevoGuardarCambiosTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoComprobante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoComprobante"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoComprobante";
		inputMap = this.jButtonRecargarInformacionTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoComprobante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoComprobante"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoComprobante";
		inputMap = this.jButtonSiguientesTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoComprobante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoComprobante"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoComprobante";
		inputMap = this.jButtonAnterioresTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoComprobante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoComprobante"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoComprobante();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoComprobante.setMinimumSize(new Dimension(this.getWidth(),TipoComprobanteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoComprobanteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoComprobante.setMaximumSize(new Dimension(this.getWidth(),TipoComprobanteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoComprobanteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoComprobante.setPreferredSize(new Dimension(this.getWidth(),TipoComprobanteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoComprobanteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoComprobante = new GridBagLayout();

			this.jPanelPaginacionTipoComprobante.setLayout(gridaBagLayoutPaginacionTipoComprobante);						
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.gridy = 0;
			this.gridBagConstraintsTipoComprobante.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoComprobante.add(this.jButtonAnterioresTipoComprobante, this.gridBagConstraintsTipoComprobante);
					
						
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoComprobante.gridy = 0;
			
			this.jPanelPaginacionTipoComprobante.add(this.jButtonNuevoGuardarCambiosTipoComprobante, this.gridBagConstraintsTipoComprobante);
						
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoComprobante.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoComprobante.gridy = 0;
			this.jPanelPaginacionTipoComprobante.add(this.jButtonSiguientesTipoComprobante, this.gridBagConstraintsTipoComprobante);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.gridy = 1;
			this.gridBagConstraintsTipoComprobante.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoComprobante.add(this.jButtonNuevoTipoComprobante, this.gridBagConstraintsTipoComprobante);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
				this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoComprobante.gridy = 1;
				this.gridBagConstraintsTipoComprobante.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoComprobante.add(this.jButtonNuevoRelacionesTipoComprobante, this.gridBagConstraintsTipoComprobante);
			}
			
			
			if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
				this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoComprobante.gridy = 1;
				this.gridBagConstraintsTipoComprobante.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoComprobante.add(this.jButtonGuardarCambiosTablaTipoComprobante, this.gridBagConstraintsTipoComprobante);
			}
			
			
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.gridy = 1;
			this.gridBagConstraintsTipoComprobante.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoComprobante.add(this.jButtonDuplicarTipoComprobante, this.gridBagConstraintsTipoComprobante);
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.gridy = 1;
			this.gridBagConstraintsTipoComprobante.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoComprobante.add(this.jButtonCopiarTipoComprobante, this.gridBagConstraintsTipoComprobante);
		
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.gridy = 1;
			this.gridBagConstraintsTipoComprobante.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoComprobante.add(this.jButtonVerFormTipoComprobante, this.gridBagConstraintsTipoComprobante);
		
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.gridy = 1;
			this.gridBagConstraintsTipoComprobante.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoComprobante.add(this.jButtonCerrarTipoComprobante, this.gridBagConstraintsTipoComprobante);
		
		
		
		this.jButtonRecargarInformacionTipoComprobante.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoComprobante.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoComprobante.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoComprobante.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoComprobante.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoComprobante.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoComprobante.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoComprobante.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoComprobante.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoComprobante.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoComprobante.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoComprobante.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoComprobante.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoComprobante.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoComprobante.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoComprobante.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoComprobante.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoComprobante.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoComprobante.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoComprobante.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoComprobante.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoComprobante.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoComprobante.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoComprobante.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoComprobante.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoComprobante.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoComprobante.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoComprobante.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoComprobante.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoComprobante.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoComprobante.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoComprobante.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoComprobante.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoComprobante.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoComprobante.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoComprobante.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoComprobante = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoComprobante = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoComprobante = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoComprobante = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoComprobante = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoComprobante = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoComprobante.setLayout(gridaBagParametrosReportesTipoComprobante);
			this.jPanelParametrosReportesAccionesTipoComprobante.setLayout(gridaBagParametrosReportesAccionesTipoComprobante);
			
			
			this.jPanelParametrosAuxiliar1TipoComprobante.setLayout(gridaBagParametrosAuxiliar1TipoComprobante);
			this.jPanelParametrosAuxiliar2TipoComprobante.setLayout(gridaBagParametrosAuxiliar2TipoComprobante);
			this.jPanelParametrosAuxiliar3TipoComprobante.setLayout(gridaBagParametrosAuxiliar3TipoComprobante);
			this.jPanelParametrosAuxiliar4TipoComprobante.setLayout(gridaBagParametrosAuxiliar4TipoComprobante);
			//this.jPanelParametrosAuxiliar5TipoComprobante.setLayout(gridaBagParametrosAuxiliar2TipoComprobante);			
			
			
			
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoComprobante.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoComprobante.add(this.jButtonRecargarInformacionTipoComprobante, this.gridBagConstraintsTipoComprobante);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComprobante.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComprobante.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoComprobante.add(this.jComboBoxTiposPaginacionTipoComprobante, this.gridBagConstraintsTipoComprobante);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComprobante.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComprobante.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoComprobante.add(this.jCheckBoxConAltoMaximoTablaTipoComprobante, this.gridBagConstraintsTipoComprobante);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComprobante.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComprobante.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoComprobante.add(this.jComboBoxTiposArchivosReportesTipoComprobante, this.gridBagConstraintsTipoComprobante);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComprobante.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComprobante.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoComprobante.add(this.jPanelParametrosAuxiliar1TipoComprobante, this.gridBagConstraintsTipoComprobante);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoComprobante.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoComprobante.add(this.jComboBoxTiposReportesTipoComprobante, this.gridBagConstraintsTipoComprobante);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComprobante.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComprobante.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoComprobante.add(this.jPanelParametrosAuxiliar4TipoComprobante, this.gridBagConstraintsTipoComprobante);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComprobante.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComprobante.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoComprobante.add(this.jComboBoxTiposReportesTipoComprobante, this.gridBagConstraintsTipoComprobante);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComprobante.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComprobante.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoComprobante.add(this.jCheckBoxGenerarReporteTipoComprobante, this.gridBagConstraintsTipoComprobante);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComprobante.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComprobante.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoComprobante.add(this.jPanelParametrosAuxiliar2TipoComprobante, this.gridBagConstraintsTipoComprobante);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoComprobante.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoComprobante.add(this.jLabelAccionesTipoComprobante, this.gridBagConstraintsTipoComprobante);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
				this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoComprobante.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoComprobante.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoComprobante.add(this.jButtonAbrirOrderByTipoComprobante, this.gridBagConstraintsTipoComprobante);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoComprobante.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComprobante.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoComprobante.add(this.jComboBoxTiposSeleccionarTipoComprobante, this.gridBagConstraintsTipoComprobante);			
			
			
			/*
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoComprobante.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoComprobante.add(this.jCheckBoxSeleccionarTodosTipoComprobante, this.gridBagConstraintsTipoComprobante);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoComprobante.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoComprobante.add(this.jCheckBoxSeleccionarTodosTipoComprobante, this.gridBagConstraintsTipoComprobante);															
				
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoComprobante.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoComprobante.add(this.jCheckBoxSeleccionadosTipoComprobante, this.gridBagConstraintsTipoComprobante);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoComprobante.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComprobante.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoComprobante.add(this.jPanelParametrosAuxiliar3TipoComprobante, this.gridBagConstraintsTipoComprobante);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComprobante.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoComprobante.add(this.jComboBoxTiposRelacionesTipoComprobante, this.gridBagConstraintsTipoComprobante);
				
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoComprobante.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoComprobante.add(this.jComboBoxTiposAccionesTipoComprobante, this.gridBagConstraintsTipoComprobante);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoComprobante = new GridBagLayout();

			this.jScrollPanelDatosTipoComprobante.setLayout(gridaBagLayoutDatosTipoComprobante);
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.gridy = 0;
			this.gridBagConstraintsTipoComprobante.gridx = 0;
			
			this.jScrollPanelDatosTipoComprobante.add(this.jTableDatosTipoComprobante, this.gridBagConstraintsTipoComprobante);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoComprobante.setViewportView(this.jTableDatosTipoComprobante);
		this.jTableDatosTipoComprobante.setFillsViewportHeight(true);
		this.jTableDatosTipoComprobante.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoComprobante= new GridBagLayout();
		this.jPanelAccionesTipoComprobante.setLayout(gridaBagLayoutAccionesTipoComprobante);
		
		
		/*	
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComprobante.gridy = 0;
		this.gridBagConstraintsTipoComprobante.gridx = 0;
			
		this.jPanelAccionesTipoComprobante.add(this.jButtonNuevoTipoComprobante, this.gridBagConstraintsTipoComprobante);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorIdTipoComprobante= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdTipoComprobante.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoComprobante.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoComprobante.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdTipoComprobante.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdTipoComprobante.setLayout(gridaBagLayoutBusquedaPorIdTipoComprobante);

		gridBagConstraintsTipoComprobante = new GridBagConstraints();
		gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoComprobante.gridy = 0;
		gridBagConstraintsTipoComprobante.gridx = 0;
		jPanelBusquedaPorIdTipoComprobante.add(jLabelidBusquedaPorIdTipoComprobante, gridBagConstraintsTipoComprobante);

		gridBagConstraintsTipoComprobante = new GridBagConstraints();
		gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoComprobante.gridy = 0;
		gridBagConstraintsTipoComprobante.gridx = 1;
		jPanelBusquedaPorIdTipoComprobante.add(jLabelidTipoComprobanteBusquedaPorId, gridBagConstraintsTipoComprobante);

		gridBagConstraintsTipoComprobante = new GridBagConstraints();
		gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoComprobante.gridy = 1;
		gridBagConstraintsTipoComprobante.gridx =1;
		jPanelBusquedaPorIdTipoComprobante.add(jButtonBusquedaPorIdTipoComprobante, gridBagConstraintsTipoComprobante);

		jTabbedPaneBusquedasTipoComprobante.addTab("1.-Por Id ", jPanelBusquedaPorIdTipoComprobante);
		jTabbedPaneBusquedasTipoComprobante.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoComprobante= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoComprobante.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoComprobante.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoComprobante.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoComprobante.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoComprobante.setLayout(gridaBagLayoutBusquedaPorNombreTipoComprobante);

		gridBagConstraintsTipoComprobante = new GridBagConstraints();
		gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoComprobante.gridy = 0;
		gridBagConstraintsTipoComprobante.gridx = 0;
		jPanelBusquedaPorNombreTipoComprobante.add(jLabelnombreBusquedaPorNombreTipoComprobante, gridBagConstraintsTipoComprobante);

		gridBagConstraintsTipoComprobante = new GridBagConstraints();
		gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoComprobante.gridy = 0;
		gridBagConstraintsTipoComprobante.gridx = 1;
		jPanelBusquedaPorNombreTipoComprobante.add(jTextAreanombreBusquedaPorNombreTipoComprobante, gridBagConstraintsTipoComprobante);

		gridBagConstraintsTipoComprobante = new GridBagConstraints();
		gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoComprobante.gridy = 1;
		gridBagConstraintsTipoComprobante.gridx =1;
		jPanelBusquedaPorNombreTipoComprobante.add(jButtonBusquedaPorNombreTipoComprobante, gridBagConstraintsTipoComprobante);

		jTabbedPaneBusquedasTipoComprobante.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoComprobante);
		jTabbedPaneBusquedasTipoComprobante.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoComprobante = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoComprobante);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();						
			this.gridBagConstraintsTipoComprobante.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoComprobante.gridx = 0;		
			//this.gridBagConstraintsTipoComprobante.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoComprobante.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoComprobante, this.gridBagConstraintsTipoComprobante);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoComprobante.gridx = 0;		
		//this.gridBagConstraintsTipoComprobante.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoComprobante.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoComprobante);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoComprobante.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoComprobante.gridx = 0;		
			this.gridBagConstraintsTipoComprobante.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoComprobante.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoComprobante, this.gridBagConstraintsTipoComprobante);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoComprobante.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoComprobante, this.gridBagConstraintsTipoComprobante);								
		
		
		/*
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoComprobante.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoComprobante, this.gridBagConstraintsTipoComprobante);
		*/		
		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoComprobante.gridx =0;
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoComprobante.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoComprobante, this.gridBagConstraintsTipoComprobante);
				
		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoComprobante.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoComprobante, this.gridBagConstraintsTipoComprobante);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoComprobanteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoComprobante= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoComprobante = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoComprobante.setLayout(gridaBagLayoutBusquedasParametrosTipoComprobante);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoComprobante=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoComprobante.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoComprobante.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoComprobante.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoComprobante.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoComprobante, this.gridBagConstraintsTipoComprobante);
			
			
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoComprobante.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoComprobante, this.gridBagConstraintsTipoComprobante);
		
			
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoComprobante.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoComprobante, this.gridBagConstraintsTipoComprobante);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoComprobante;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoComprobante() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoComprobante = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoComprobante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoComprobante.setName("jPanelReporteDinamicoTipoComprobante"); 
		
		this.jPanelReporteDinamicoTipoComprobante.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoComprobante.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoComprobante.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoComprobante.setLayout(gridaBagLayoutReporteDinamicoTipoComprobante);
		
		
		this.jInternalFrameReporteDinamicoTipoComprobante= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoComprobante = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoComprobante= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoComprobante.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoComprobante.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoComprobante.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoComprobante.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoComprobante.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoComprobante.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoComprobante.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoComprobante.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoComprobante.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoComprobante.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoComprobante.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comprobantes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoComprobante = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoComprobante.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComprobante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoComprobante.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoComprobante.add(this.jLabelColumnasSelectReporteTipoComprobante, this.gridBagConstraintsTipoComprobante);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoComprobante = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoComprobante.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoComprobante.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoComprobante.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoComprobante.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoComprobante.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoComprobante=new JScrollPane(this.jListColumnasSelectReporteTipoComprobante);
			
			this.jScrollColumnasSelectReporteTipoComprobante.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoComprobante.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoComprobante.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComprobante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoComprobante.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoComprobante.add(this.jListColumnasSelectReporteTipoComprobante, this.gridBagConstraintsTipoComprobante);
		this.jPanelReporteDinamicoTipoComprobante.add(this.jScrollColumnasSelectReporteTipoComprobante, this.gridBagConstraintsTipoComprobante);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoComprobante = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoComprobante.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComprobante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoComprobante.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoComprobante.add(this.jLabelRelacionesSelectReporteTipoComprobante, this.gridBagConstraintsTipoComprobante);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoComprobante = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoComprobante.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoComprobante.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoComprobante.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoComprobante.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoComprobante.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoComprobante=new JScrollPane(this.jListRelacionesSelectReporteTipoComprobante);
			
			this.jScrollRelacionesSelectReporteTipoComprobante.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoComprobante.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoComprobante.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComprobante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoComprobante.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoComprobante.add(this.jListRelacionesSelectReporteTipoComprobante, this.gridBagConstraintsTipoComprobante);
		this.jPanelReporteDinamicoTipoComprobante.add(this.jScrollRelacionesSelectReporteTipoComprobante, this.gridBagConstraintsTipoComprobante);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoComprobante = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoComprobante = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoComprobante = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoComprobante = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoComprobante.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoComprobante.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoComprobante.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoComprobante.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoComprobante = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoComprobante.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoComprobante.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoComprobante.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoComprobante.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoComprobante = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoComprobante.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComprobante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoComprobante.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoComprobante.add(this.jLabelGenerarExcelReporteDinamicoTipoComprobante, this.gridBagConstraintsTipoComprobante);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoComprobante = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoComprobante.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoComprobante,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoComprobante.setToolTipText("Generar EXCEL"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		//this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoComprobante.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoComprobante.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoComprobante.add(this.jButtonGenerarExcelReporteDinamicoTipoComprobante, this.gridBagConstraintsTipoComprobante);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComprobante.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoComprobante.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoComprobante.add(this.jComboBoxTiposReportesDinamicoTipoComprobante, this.gridBagConstraintsTipoComprobante);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoComprobante = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoComprobante.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComprobante.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoComprobante.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoComprobante.add(this.jLabelTiposArchivoReporteDinamicoTipoComprobante, this.gridBagConstraintsTipoComprobante);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComprobante.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoComprobante.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoComprobante.add(this.jComboBoxTiposArchivosReportesDinamicoTipoComprobante, this.gridBagConstraintsTipoComprobante);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoComprobante = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoComprobante.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoComprobante,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoComprobante.setToolTipText("Generar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComprobante.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoComprobante.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoComprobante.add(this.jButtonGenerarReporteDinamicoTipoComprobante, this.gridBagConstraintsTipoComprobante);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoComprobante = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoComprobante.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoComprobante,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoComprobante.setToolTipText("Cancelar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComprobante.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoComprobante.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoComprobante.add(this.jButtonCerrarReporteDinamicoTipoComprobante, this.gridBagConstraintsTipoComprobante);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoComprobante = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoComprobante= new JScrollPane(jPanelReporteDinamicoTipoComprobante,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoComprobante.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoComprobante.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoComprobante.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comprobantes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoComprobante.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoComprobante.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoComprobante.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoComprobante);
		this.jInternalFrameReporteDinamicoTipoComprobante.getContentPane().add(this.jScrollPanelReporteDinamicoTipoComprobante, this.gridBagConstraintsTipoComprobante);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoComprobante() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoComprobante = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoComprobante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoComprobante.setName("jPanelImportacionTipoComprobante"); 
		
		this.jPanelImportacionTipoComprobante.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoComprobante.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoComprobante.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoComprobante.setLayout(gridaBagLayoutImportacionTipoComprobante);
		
		
		this.jInternalFrameImportacionTipoComprobante= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoComprobante= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoComprobante = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoComprobante= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoComprobante.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoComprobante.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoComprobante.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoComprobante.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoComprobante.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoComprobante.setResizable(true);
	    this.jInternalFrameImportacionTipoComprobante.setClosable(true);
	    this.jInternalFrameImportacionTipoComprobante.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoComprobante.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoComprobante.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoComprobante.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoComprobante.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoComprobante.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoComprobante.setResizable(true);
	    this.jInternalFrameImportacionTipoComprobante.setClosable(true);
	    this.jInternalFrameImportacionTipoComprobante.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoComprobante.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoComprobante.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoComprobante.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comprobantes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoComprobante = new JLabelMe();

		this.jLabelArchivoImportacionTipoComprobante.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComprobante.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoComprobante.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoComprobante.add(this.jLabelArchivoImportacionTipoComprobante, this.gridBagConstraintsTipoComprobante);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoComprobante = new JFileChooser();		
		this.jFileChooserImportacionTipoComprobante.setToolTipText("ESCOGER ARCHIVO"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoComprobante = new JButtonMe();
		this.jButtonAbrirImportacionTipoComprobante.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoComprobante,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoComprobante.setToolTipText("Generar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComprobante.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoComprobante.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoComprobante.add(this.jButtonAbrirImportacionTipoComprobante, this.gridBagConstraintsTipoComprobante);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoComprobante = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoComprobante.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoComprobante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoComprobante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoComprobante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoComprobante.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoComprobante.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoComprobante.add(this.jLabelPathArchivoImportacionTipoComprobante, this.gridBagConstraintsTipoComprobante);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoComprobante=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoComprobante.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoComprobante.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoComprobante.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComprobante.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoComprobante.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoComprobante.add(this.jTextFieldPathArchivoImportacionTipoComprobante, this.gridBagConstraintsTipoComprobante);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoComprobante = new JButtonMe();
		this.jButtonGenerarImportacionTipoComprobante.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoComprobante,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoComprobante.setToolTipText("Generar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComprobante.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoComprobante.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoComprobante.add(this.jButtonGenerarImportacionTipoComprobante, this.gridBagConstraintsTipoComprobante);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoComprobante = new JButtonMe();
		this.jButtonCerrarImportacionTipoComprobante.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoComprobante,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoComprobante.setToolTipText("Cancelar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoComprobante.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoComprobante.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoComprobante.add(this.jButtonCerrarImportacionTipoComprobante, this.gridBagConstraintsTipoComprobante);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoComprobante = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoComprobante= new JScrollPane(jPanelImportacionTipoComprobante,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
		this.gridBagConstraintsTipoComprobante.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoComprobante.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoComprobante.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoComprobante.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoComprobante);
		this.jInternalFrameImportacionTipoComprobante.getContentPane().add(this.jScrollPanelImportacionTipoComprobante, this.gridBagConstraintsTipoComprobante);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoComprobante(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoComprobante = new JButtonMe();
			this.jButtonAbrirOrderByTipoComprobante.setText("Orden");
			this.jButtonAbrirOrderByTipoComprobante.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoComprobante,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoComprobante";
			inputMap = this.jButtonAbrirOrderByTipoComprobante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoComprobante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoComprobante"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoComprobante = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoComprobante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoComprobante.setName("jPanelOrderByTipoComprobante"); 
			
			this.jPanelOrderByTipoComprobante.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoComprobante.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoComprobante.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoComprobante.setLayout(gridaBagLayoutOrderByTipoComprobante);
			
			
			this.jTableDatosTipoComprobanteOrderBy = new JTableMe();        
			this.jTableDatosTipoComprobanteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoComprobanteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoComprobanteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoComprobanteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoComprobanteOrderBy.setViewportView(this.jTableDatosTipoComprobanteOrderBy);
			this.jTableDatosTipoComprobanteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoComprobanteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoComprobante= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoComprobante= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoComprobante = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoComprobante= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoComprobante.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoComprobante.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoComprobante.setTitle("Orden");
			this.jInternalFrameOrderByTipoComprobante.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoComprobante.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoComprobante.setResizable(true);
			this.jInternalFrameOrderByTipoComprobante.setClosable(true);
			this.jInternalFrameOrderByTipoComprobante.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoComprobante.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoComprobante.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoComprobante.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Comprobantes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoComprobante.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoComprobante.ipady =150;
				
			this.jPanelOrderByTipoComprobante.add(jScrollPanelDatosTipoComprobanteOrderBy, this.gridBagConstraintsTipoComprobante);//this.jTableDatosTipoComprobanteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoComprobante = new JButtonMe();
			this.jButtonCerrarOrderByTipoComprobante.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoComprobante,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoComprobante.setToolTipText("Cancelar"+" "+TipoComprobanteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoComprobante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoComprobante.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoComprobante.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoComprobante.add(this.jButtonCerrarOrderByTipoComprobante, this.gridBagConstraintsTipoComprobante);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoComprobante = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoComprobante= new JScrollPane(jPanelOrderByTipoComprobante,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoComprobante = new GridBagConstraints();
			this.gridBagConstraintsTipoComprobante.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoComprobante.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoComprobante.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoComprobante.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoComprobante.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoComprobante);
			
			this.jInternalFrameOrderByTipoComprobante.getContentPane().add(this.jScrollPanelOrderByTipoComprobante, this.gridBagConstraintsTipoComprobante);			
		
		} else {
			this.jButtonAbrirOrderByTipoComprobante = new JButtonMe();
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
		int iWidthTableCalculado=0;//930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipocomprobanteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoComprobante.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoComprobante.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoComprobante.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoComprobante.getRowHeight();//TipoComprobanteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoComprobanteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoComprobante.isSelected()) {
					iHeightTable=TipoComprobanteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoComprobanteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoComprobanteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoComprobanteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoComprobante.isSelected()) {
					iHeightTable=TipoComprobanteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoComprobanteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoComprobanteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoComprobante.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoComprobante.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoComprobante.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoComprobante.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoComprobante.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoComprobante.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoComprobante!=null && this.jInternalFrameOrderByTipoComprobante.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocomprobanteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoComprobante.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoComprobante.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoComprobante.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoComprobante.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoComprobante.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoComprobante.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoComprobante.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoComprobante.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoComprobante.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoComprobante.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocomprobanteLogic.getTipoComprobantes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocomprobantes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoComprobante> TraerTipoComprobanteBeans(List<TipoComprobante> tipocomprobantes,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoComprobante tipocomprobante:tipocomprobantes) {
					
				if(!(TipoComprobanteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoComprobanteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocomprobante.setsDetalleGeneralEntityReporte(TipoComprobanteConstantesFunciones.getTipoComprobanteDescripcion(tipocomprobante));
										
						
					
					

					if(tipocomprobante.getTransaccionLocals()!=null && Funciones.existeClass(classes,TransaccionLocal.class)) {
						try{tipocomprobante.settransaccionlocalsDescripcionReporte(new JRBeanCollectionDataSource(TransaccionLocalJInternalFrame.TraerTransaccionLocalBeans(tipocomprobante.getTransaccionLocals(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipocomprobante.getTransaccions()!=null && Funciones.existeClass(classes,Transaccion.class)) {
						try{tipocomprobante.settransaccionsDescripcionReporte(new JRBeanCollectionDataSource(TransaccionJInternalFrame.TraerTransaccionBeans(tipocomprobante.getTransaccions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipocomprobante.getDocumentoAnulados()!=null && Funciones.existeClass(classes,DocumentoAnulado.class)) {
						try{tipocomprobante.setdocumentoanuladosDescripcionReporte(new JRBeanCollectionDataSource(DocumentoAnuladoJInternalFrame.TraerDocumentoAnuladoBeans(tipocomprobante.getDocumentoAnulados(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipocomprobante.setsDetalleGeneralEntityReporte(tipocomprobante.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocomprobantebeans.add(tipocomprobantebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocomprobantes;
    }
	//PARA REPORTES FIN
}
