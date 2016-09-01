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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.TipoCodigoRetencionSriConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class TipoCodigoRetencionSriJInternalFrame extends TipoCodigoRetencionSriBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoCodigoRetencionSri;
	
	protected JMenuBar jmenuBarTipoCodigoRetencionSri;
	
	protected JMenu jmenuTipoCodigoRetencionSri;
	protected JMenu jmenuDatosTipoCodigoRetencionSri;
	protected JMenu jmenuArchivoTipoCodigoRetencionSri;
	protected JMenu jmenuAccionesTipoCodigoRetencionSri;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoCodigoRetencionSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCodigoRetencionSri;	
	protected GridBagConstraints gridBagConstraintsTipoCodigoRetencionSri;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoCodigoRetencionSriDetalleFormJInternalFrame jInternalFrameDetalleFormTipoCodigoRetencionSri;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoCodigoRetencionSri;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoCodigoRetencionSri;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoCodigoRetencionSriSessionBean tipocodigoretencionsriSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoCodigoRetencionSri> tipocodigoretencionsris;		
	public List<TipoCodigoRetencionSri> tipocodigoretencionsrisEliminados;	
	public List<TipoCodigoRetencionSri> tipocodigoretencionsrisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoCodigoRetencionSri;		
	protected JButton jButtonAbrirOrderByTipoCodigoRetencionSri;
	
	
	//protected JPanel jPanelOrderByTipoCodigoRetencionSri;
	//public JScrollPane jScrollPanelOrderByTipoCodigoRetencionSri;	
	//protected JButton jButtonCerrarOrderByTipoCodigoRetencionSri;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoCodigoRetencionSriLogic tipocodigoretencionsriLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoCodigoRetencionSri;
	public JScrollPane jScrollPanelDatosEdicionTipoCodigoRetencionSri;
	public JScrollPane jScrollPanelDatosGeneralTipoCodigoRetencionSri;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoCodigoRetencionSriOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoCodigoRetencionSri;
	//public JScrollPane jScrollPanelImportacionTipoCodigoRetencionSri;
	
	
	
	protected JPanel jPanelAccionesTipoCodigoRetencionSri;
	
    protected JPanel jPanelPaginacionTipoCodigoRetencionSri;
    protected JPanel jPanelParametrosReportesTipoCodigoRetencionSri;
	protected JPanel jPanelParametrosReportesAccionesTipoCodigoRetencionSri;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoCodigoRetencionSri;
	protected JPanel jPanelParametrosAuxiliar2TipoCodigoRetencionSri;
	protected JPanel jPanelParametrosAuxiliar3TipoCodigoRetencionSri;
	protected JPanel jPanelParametrosAuxiliar4TipoCodigoRetencionSri;
	//protected JPanel jPanelParametrosAuxiliar5TipoCodigoRetencionSri;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoCodigoRetencionSri;
	//protected JPanel jPanelImportacionTipoCodigoRetencionSri;
	
	
	public JTable jTableDatosTipoCodigoRetencionSri;
	
	
	
	//public JTable jTableDatosTipoCodigoRetencionSriOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoCodigoRetencionSri;
	protected JButton jButtonDuplicarTipoCodigoRetencionSri;
	protected JButton jButtonCopiarTipoCodigoRetencionSri;
	protected JButton jButtonVerFormTipoCodigoRetencionSri;
	protected JButton jButtonNuevoRelacionesTipoCodigoRetencionSri;
	protected JButton jButtonModificarTipoCodigoRetencionSri;
	
    protected JButton jButtonGuardarCambiosTablaTipoCodigoRetencionSri;
	protected JButton jButtonCerrarTipoCodigoRetencionSri;
	
	
	protected JButton jButtonRecargarInformacionTipoCodigoRetencionSri;
	protected JButton jButtonProcesarInformacionTipoCodigoRetencionSri;
	
	
	protected JButton jButtonAnterioresTipoCodigoRetencionSri;
	protected JButton jButtonSiguientesTipoCodigoRetencionSri;
	protected JButton jButtonNuevoGuardarCambiosTipoCodigoRetencionSri;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoCodigoRetencionSri;
	//protected JButton jButtonCerrarReporteDinamicoTipoCodigoRetencionSri;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoCodigoRetencionSri;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoCodigoRetencionSri;
	//protected JButton jButtonGenerarImportacionTipoCodigoRetencionSri;
	//protected JButton jButtonCerrarImportacionTipoCodigoRetencionSri;
	//protected JFileChooser jFileChooserImportacionTipoCodigoRetencionSri;
	//protected File fileImportacionTipoCodigoRetencionSri;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCodigoRetencionSri;
	protected JButton jButtonDuplicarToolBarTipoCodigoRetencionSri;
	protected JButton jButtonNuevoRelacionesToolBarTipoCodigoRetencionSri;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoCodigoRetencionSri;
	protected JButton jButtonCopiarToolBarTipoCodigoRetencionSri;
	protected JButton jButtonVerFormToolBarTipoCodigoRetencionSri;
	public JButton jButtonGuardarCambiosTablaToolBarTipoCodigoRetencionSri;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCodigoRetencionSri;
	protected JButton jButtonCerrarToolBarTipoCodigoRetencionSri;
	
	protected JButton jButtonRecargarInformacionToolBarTipoCodigoRetencionSri;
	protected JButton jButtonProcesarInformacionToolBarTipoCodigoRetencionSri;
	protected JButton jButtonAnterioresToolBarTipoCodigoRetencionSri;
	protected JButton jButtonSiguientesToolBarTipoCodigoRetencionSri;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoCodigoRetencionSri;
	protected JButton jButtonAbrirOrderByToolBarTipoCodigoRetencionSri;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemDuplicarTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemNuevoRelacionesTipoCodigoRetencionSri;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemCopiarTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemVerFormTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemCerrarTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemDetalleCerrarTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCodigoRetencionSri;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemProcesarInformacionTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemAnterioresTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemSiguientesTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemAbrirOrderByTipoCodigoRetencionSri;
	protected JMenuItem jMenuItemMostrarOcultarTipoCodigoRetencionSri;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCodigoRetencionSri;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoCodigoRetencionSri;
	protected JCheckBox jCheckBoxSeleccionadosTipoCodigoRetencionSri;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoCodigoRetencionSri;
	protected JCheckBox jCheckBoxConGraficoReporteTipoCodigoRetencionSri;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoCodigoRetencionSri;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoCodigoRetencionSri;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCodigoRetencionSri;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoCodigoRetencionSri;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoCodigoRetencionSri;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoCodigoRetencionSri;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCodigoRetencionSri;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCodigoRetencionSri;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoCodigoRetencionSri;
	protected JTextField jTextFieldValorCampoGeneralTipoCodigoRetencionSri;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoCodigoRetencionSri;
	//public JList<Reporte> jListColumnasSelectReporteTipoCodigoRetencionSri;
	//public JScrollPane jScrollColumnasSelectReporteTipoCodigoRetencionSri;
	
	//public JLabel jLabelRelacionesSelectReporteTipoCodigoRetencionSri;
	//public JList<Reporte> jListRelacionesSelectReporteTipoCodigoRetencionSri;
	//public JScrollPane jScrollRelacionesSelectReporteTipoCodigoRetencionSri;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoCodigoRetencionSri;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoCodigoRetencionSri;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoCodigoRetencionSri;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoCodigoRetencionSri;
	
		
	//public JLabel jLabelArchivoImportacionTipoCodigoRetencionSri;	
	//public JLabel jLabelPathArchivoImportacionTipoCodigoRetencionSri;
	//protected JTextField jTextFieldPathArchivoImportacionTipoCodigoRetencionSri;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoCodigoRetencionSri;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoCodigoRetencionSri;
	
	//public JLabel jLabelColumnaCategoriaValorTipoCodigoRetencionSri;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoCodigoRetencionSri;
	
	//public JLabel jLabelColumnasValoresGraficoTipoCodigoRetencionSri;
	//public JList<Reporte> jListColumnasValoresGraficoTipoCodigoRetencionSri;
	//public JScrollPane jScrollColumnasValoresGraficoTipoCodigoRetencionSri;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoCodigoRetencionSri;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoCodigoRetencionSri;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoCodigoRetencionSri;
	public JPanel jPanelBusquedaPorCodigoTipoCodigoRetencionSri;
	public JButton jButtonBusquedaPorCodigoTipoCodigoRetencionSri;
	public JPanel jPanelBusquedaPorNombreTipoCodigoRetencionSri;
	public JButton jButtonBusquedaPorNombreTipoCodigoRetencionSri;
	public JPanel jPanelFK_IdPaisTipoCodigoRetencionSri;
	public JButton jButtonFK_IdPaisTipoCodigoRetencionSri;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoCodigoRetencionSri;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoCodigoRetencionSri;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoCodigoRetencionSri;
	public JButton jButtoncodigoBusquedaPorCodigoTipoCodigoRetencionSriBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoCodigoRetencionSri;
	public JLabel jLabelnombreBusquedaPorNombreTipoCodigoRetencionSri;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoCodigoRetencionSri;
	public JButton jButtonnombreBusquedaPorNombreTipoCodigoRetencionSriBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisTipoCodigoRetencionSri;
	public JLabel jLabelid_paisFK_IdPaisTipoCodigoRetencionSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri;
	public JButton jButtonid_paisFK_IdPaisTipoCodigoRetencionSri= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoCodigoRetencionSriUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoCodigoRetencionSriBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoCodigoRetencionSriJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoCodigoRetencionSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCodigoRetencionSriJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCodigoRetencionSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCodigoRetencionSriJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCodigoRetencionSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCodigoRetencionSriJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCodigoRetencionSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoCodigoRetencionSri)	{
		this.jButtonRecargarInformacionTipoCodigoRetencionSri = jButtonRecargarInformacionTipoCodigoRetencionSri;
	}
	
	public JButton getjButtonProcesarInformacionTipoCodigoRetencionSri() {
		return this.jButtonProcesarInformacionTipoCodigoRetencionSri;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCodigoRetencionSri)	{
		this.jButtonProcesarInformacionTipoCodigoRetencionSri = jButtonProcesarInformacionTipoCodigoRetencionSri;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoCodigoRetencionSri() {
		return this.jButtonRecargarInformacionTipoCodigoRetencionSri;
	}
	
	
	public List<TipoCodigoRetencionSri> gettipocodigoretencionsris() {
		return this.tipocodigoretencionsris;
	}

	public void settipocodigoretencionsris(List<TipoCodigoRetencionSri> tipocodigoretencionsris) {
		this.tipocodigoretencionsris = tipocodigoretencionsris;
	}
	
	public List<TipoCodigoRetencionSri> gettipocodigoretencionsrisAux() {
		return this.tipocodigoretencionsrisAux;
	}

	public void settipocodigoretencionsrisAux(List<TipoCodigoRetencionSri> tipocodigoretencionsrisAux) {
		this.tipocodigoretencionsrisAux = tipocodigoretencionsrisAux;
	}
	
	public List<TipoCodigoRetencionSri> gettipocodigoretencionsrisEliminados() {
		return this.tipocodigoretencionsrisEliminados;
	}

	public void setTipoCodigoRetencionSrisEliminados(List<TipoCodigoRetencionSri> tipocodigoretencionsrisEliminados) {
		this.tipocodigoretencionsrisEliminados = tipocodigoretencionsrisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoCodigoRetencionSri() {
		return jComboBoxTiposSeleccionarTipoCodigoRetencionSri;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoCodigoRetencionSri(
			JComboBox jComboBoxTiposSeleccionarTipoCodigoRetencionSri) {
		this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri = jComboBoxTiposSeleccionarTipoCodigoRetencionSri;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoCodigoRetencionSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoCodigoRetencionSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoCodigoRetencionSri() {
		return jTextFieldValorCampoGeneralTipoCodigoRetencionSri;
	}

	public void setjTextFieldValorCampoGeneralTipoCodigoRetencionSri(
			JTextField jTextFieldValorCampoGeneralTipoCodigoRetencionSri) {
		this.jTextFieldValorCampoGeneralTipoCodigoRetencionSri = jTextFieldValorCampoGeneralTipoCodigoRetencionSri;
	}

	public void setBorderResaltarValorCampoGeneralTipoCodigoRetencionSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoRetencionSri.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoCodigoRetencionSri .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoCodigoRetencionSri() {
		return this.jCheckBoxSeleccionarTodosTipoCodigoRetencionSri;
	}

	public void setjCheckBoxSeleccionarTodosTipoCodigoRetencionSri(
			JCheckBox jCheckBoxSeleccionarTodosTipoCodigoRetencionSri) {
		this.jCheckBoxSeleccionarTodosTipoCodigoRetencionSri = jCheckBoxSeleccionarTodosTipoCodigoRetencionSri;
	}

	public void setBorderResaltarSeleccionarTodosTipoCodigoRetencionSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoRetencionSri.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoCodigoRetencionSri .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoCodigoRetencionSri() {
		return this.jCheckBoxSeleccionadosTipoCodigoRetencionSri;
	}

	public void setjCheckBoxSeleccionadosTipoCodigoRetencionSri(
			JCheckBox jCheckBoxSeleccionadosTipoCodigoRetencionSri) {
		this.jCheckBoxSeleccionadosTipoCodigoRetencionSri = jCheckBoxSeleccionadosTipoCodigoRetencionSri;
	}
	
	public void setBorderResaltarSeleccionadosTipoCodigoRetencionSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoRetencionSri.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoCodigoRetencionSri .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoCodigoRetencionSri() {
		return this.jComboBoxTiposArchivosReportesTipoCodigoRetencionSri;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoCodigoRetencionSri(
			JComboBox jComboBoxTiposArchivosReportesTipoCodigoRetencionSri) {
		this.jComboBoxTiposArchivosReportesTipoCodigoRetencionSri = jComboBoxTiposArchivosReportesTipoCodigoRetencionSri;
	}

	public void setBorderResaltarTiposArchivosReportesTipoCodigoRetencionSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoRetencionSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoCodigoRetencionSri .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoCodigoRetencionSri() {
		return this.jComboBoxTiposReportesTipoCodigoRetencionSri;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoCodigoRetencionSri(
			JComboBox jComboBoxTiposReportesTipoCodigoRetencionSri) {
		this.jComboBoxTiposReportesTipoCodigoRetencionSri = jComboBoxTiposReportesTipoCodigoRetencionSri;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoCodigoRetencionSri() {
	//	return jComboBoxTiposReportesDinamicoTipoCodigoRetencionSri;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoCodigoRetencionSri(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoCodigoRetencionSri) {
	//	this.jComboBoxTiposReportesDinamicoTipoCodigoRetencionSri = jComboBoxTiposReportesDinamicoTipoCodigoRetencionSri;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoCodigoRetencionSri() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoCodigoRetencionSri;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoCodigoRetencionSri(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoCodigoRetencionSri) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoCodigoRetencionSri = jComboBoxTiposArchivosReportesDinamicoTipoCodigoRetencionSri;
	//}
	
	public void setBorderResaltarTiposReportesTipoCodigoRetencionSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoRetencionSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoCodigoRetencionSri .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoCodigoRetencionSri() {
		return this.jComboBoxTiposGraficosReportesTipoCodigoRetencionSri;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoCodigoRetencionSri(
			JComboBox jComboBoxTiposGraficosReportesTipoCodigoRetencionSri) {
		this.jComboBoxTiposGraficosReportesTipoCodigoRetencionSri = jComboBoxTiposGraficosReportesTipoCodigoRetencionSri;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoCodigoRetencionSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoRetencionSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoCodigoRetencionSri .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoCodigoRetencionSri() {
		return this.jComboBoxTiposPaginacionTipoCodigoRetencionSri;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoCodigoRetencionSri(
			JComboBox jComboBoxTiposPaginacionTipoCodigoRetencionSri) {
		this.jComboBoxTiposPaginacionTipoCodigoRetencionSri = jComboBoxTiposPaginacionTipoCodigoRetencionSri;
	}
	
	public void setBorderResaltarTiposPaginacionTipoCodigoRetencionSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoRetencionSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoCodigoRetencionSri .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoCodigoRetencionSri() {
		return this.jComboBoxTiposRelacionesTipoCodigoRetencionSri;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCodigoRetencionSri() {
		return this.jComboBoxTiposAccionesTipoCodigoRetencionSri;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCodigoRetencionSri(
			JComboBox jComboBoxTiposRelacionesTipoCodigoRetencionSri) {
		this.jComboBoxTiposRelacionesTipoCodigoRetencionSri = jComboBoxTiposRelacionesTipoCodigoRetencionSri;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCodigoRetencionSri(
			JComboBox jComboBoxTiposAccionesTipoCodigoRetencionSri) {
		this.jComboBoxTiposAccionesTipoCodigoRetencionSri = jComboBoxTiposAccionesTipoCodigoRetencionSri;
	}
	
	public void setBorderResaltarTiposRelacionesTipoCodigoRetencionSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoRetencionSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoCodigoRetencionSri .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoCodigoRetencionSri() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoCodigoRetencionSri.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoCodigoRetencionSri .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoCodigoRetencionSri() {
	//	return jCheckBoxConGraficoDinamicoTipoCodigoRetencionSri;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoCodigoRetencionSri(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoCodigoRetencionSri) {
	//	this.jCheckBoxConGraficoDinamicoTipoCodigoRetencionSri = jCheckBoxConGraficoDinamicoTipoCodigoRetencionSri;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoCodigoRetencionSri() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoCodigoRetencionSri.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoCodigoRetencionSri .setBorder(borderResaltar);		
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
		this.tipocodigoretencionsriSessionBean=new TipoCodigoRetencionSriSessionBean();
		
		this.tipocodigoretencionsriSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocodigoretencionsriSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoCodigoRetencionSriJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoCodigoRetencionSriJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCodigoRetencionSriJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCodigoRetencionSriJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCodigoRetencionSriJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Codigo Retencion Sri MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoCodigoRetencionSriJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoCodigoRetencionSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoCodigoRetencionSri= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoCodigoRetencionSri,this.jTtoolBarTipoCodigoRetencionSri,
							"nuevo","nuevo","Nuevo"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoCodigoRetencionSri,this.jTtoolBarTipoCodigoRetencionSri,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoCodigoRetencionSri,this.jTtoolBarTipoCodigoRetencionSri,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoCodigoRetencionSri,this.jTtoolBarTipoCodigoRetencionSri,
							"duplicar","duplicar","Duplicar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoCodigoRetencionSri,this.jTtoolBarTipoCodigoRetencionSri,
							"copiar","copiar","Copiar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoCodigoRetencionSri,this.jTtoolBarTipoCodigoRetencionSri,
							"ver_form","ver_form","Ver"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCodigoRetencionSri,this.jTtoolBarTipoCodigoRetencionSri,
							"recargar","recargar","Recargar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCodigoRetencionSri,this.jTtoolBarTipoCodigoRetencionSri,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoCodigoRetencionSri,this.jTtoolBarTipoCodigoRetencionSri,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoCodigoRetencionSri,this.jTtoolBarTipoCodigoRetencionSri,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoCodigoRetencionSri,this.jTtoolBarTipoCodigoRetencionSri,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoCodigoRetencionSri,this.jTtoolBarTipoCodigoRetencionSri,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoCodigoRetencionSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoCodigoRetencionSri,this.jTtoolBarTipoCodigoRetencionSri,
							"cerrar","cerrar","Salir"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoCodigoRetencionSri=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoCodigoRetencionSri;
			
				this.jButtonProcesarInformacionToolBarTipoCodigoRetencionSri=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoCodigoRetencionSri;
				
		//protected JButton jButtonModificarToolBarTipoCodigoRetencionSri;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoCodigoRetencionSri=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoCodigoRetencionSri=new JMenuMe("General");
		this.jmenuArchivoTipoCodigoRetencionSri=new JMenuMe("Archivo");
		this.jmenuAccionesTipoCodigoRetencionSri=new JMenuMe("Acciones");
		this.jmenuDatosTipoCodigoRetencionSri=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCodigoRetencionSri= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCodigoRetencionSri.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCodigoRetencionSri,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoCodigoRetencionSri= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoCodigoRetencionSri.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoCodigoRetencionSri,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoCodigoRetencionSri= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoCodigoRetencionSri.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoCodigoRetencionSri,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoCodigoRetencionSri= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCodigoRetencionSri.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCodigoRetencionSri,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoCodigoRetencionSri= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoCodigoRetencionSri.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoCodigoRetencionSri,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoCodigoRetencionSri= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoCodigoRetencionSri.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoCodigoRetencionSri,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoCodigoRetencionSri= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoCodigoRetencionSri.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoCodigoRetencionSri,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCodigoRetencionSri= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCodigoRetencionSri.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCodigoRetencionSri,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoCodigoRetencionSri= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoCodigoRetencionSri.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoCodigoRetencionSri,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoCodigoRetencionSri= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoCodigoRetencionSri.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoCodigoRetencionSri,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoCodigoRetencionSri= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoCodigoRetencionSri.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoCodigoRetencionSri,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoCodigoRetencionSri= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoCodigoRetencionSri.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoCodigoRetencionSri,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoCodigoRetencionSri= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoCodigoRetencionSri.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoCodigoRetencionSri,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCodigoRetencionSri= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCodigoRetencionSri.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCodigoRetencionSri,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoCodigoRetencionSri= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoCodigoRetencionSri.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoCodigoRetencionSri,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCodigoRetencionSri= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCodigoRetencionSri.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCodigoRetencionSri,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoCodigoRetencionSri= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoCodigoRetencionSri.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoCodigoRetencionSri,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoCodigoRetencionSri.add(this.jMenuItemCerrarTipoCodigoRetencionSri);
			
			this.jmenuAccionesTipoCodigoRetencionSri.add(this.jMenuItemNuevoTipoCodigoRetencionSri);
			this.jmenuAccionesTipoCodigoRetencionSri.add(this.jMenuItemNuevoGuardarCambiosTipoCodigoRetencionSri);
			this.jmenuAccionesTipoCodigoRetencionSri.add(this.jMenuItemNuevoRelacionesTipoCodigoRetencionSri);
			this.jmenuAccionesTipoCodigoRetencionSri.add(this.jMenuItemGuardarCambiosTablaTipoCodigoRetencionSri);		
			this.jmenuAccionesTipoCodigoRetencionSri.add(this.jMenuItemDuplicarTipoCodigoRetencionSri);		
			this.jmenuAccionesTipoCodigoRetencionSri.add(this.jMenuItemCopiarTipoCodigoRetencionSri);		
			this.jmenuAccionesTipoCodigoRetencionSri.add(this.jMenuItemVerFormTipoCodigoRetencionSri);		
			
			this.jmenuDatosTipoCodigoRetencionSri.add(this.jMenuItemRecargarInformacionTipoCodigoRetencionSri);				
			this.jmenuDatosTipoCodigoRetencionSri.add(this.jMenuItemAnterioresTipoCodigoRetencionSri);				
			this.jmenuDatosTipoCodigoRetencionSri.add(this.jMenuItemSiguientesTipoCodigoRetencionSri);				
			this.jmenuDatosTipoCodigoRetencionSri.add(this.jMenuItemAbrirOrderByTipoCodigoRetencionSri);				
			this.jmenuDatosTipoCodigoRetencionSri.add(this.jMenuItemMostrarOcultarTipoCodigoRetencionSri);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoCodigoRetencionSri.add(this.jMenuItemGuardarCambiosTipoCodigoRetencionSri);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoCodigoRetencionSri.add(this.jmenuArchivoTipoCodigoRetencionSri);		
			this.jmenuBarTipoCodigoRetencionSri.add(this.jmenuAccionesTipoCodigoRetencionSri);		
			this.jmenuBarTipoCodigoRetencionSri.add(this.jmenuDatosTipoCodigoRetencionSri);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoCodigoRetencionSri);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoCodigoRetencionSri() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoCodigoRetencionSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoCodigoRetencionSri.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoCodigoRetencionSri= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoCodigoRetencionSri.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoCodigoRetencionSri.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoCodigoRetencionSri,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoCodigoRetencionSri = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoCodigoRetencionSri.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoCodigoRetencionSri.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoCodigoRetencionSri= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoCodigoRetencionSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoCodigoRetencionSri.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoCodigoRetencionSri= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoCodigoRetencionSri.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoCodigoRetencionSri.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoCodigoRetencionSri,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoCodigoRetencionSri = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoCodigoRetencionSri.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoCodigoRetencionSri.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoCodigoRetencionSri= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisTipoCodigoRetencionSri=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTipoCodigoRetencionSri.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTipoCodigoRetencionSri= new JButtonMe();
		this.jButtonFK_IdPaisTipoCodigoRetencionSri.setText("Buscar");
		this.jButtonFK_IdPaisTipoCodigoRetencionSri.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTipoCodigoRetencionSri,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTipoCodigoRetencionSri = new JLabelMe();
		jLabelid_paisFK_IdPaisTipoCodigoRetencionSri.setText("Pais :");
		jLabelid_paisFK_IdPaisTipoCodigoRetencionSri.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoCodigoRetencionSri=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoCodigoRetencionSri.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoCodigoRetencionSri = new TipoCodigoRetencionSriDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Codigo Retencion Sri DATOS");
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri = new TipoCodigoRetencionSriDetalleFormJInternalFrame(jDesktopPane,this.tipocodigoretencionsriSessionBean.getConGuardarRelaciones(),this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoCodigoRetencionSri = null;//new TipoCodigoRetencionSriDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCodigoRetencionSri= new GridBagLayout();
		
		
		this.jTableDatosTipoCodigoRetencionSri = new JTableMe();      
		
		String sToolTipTipoCodigoRetencionSri="";
		sToolTipTipoCodigoRetencionSri=TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCodigoRetencionSri+="(Tesoreria.TipoCodigoRetencionSri)";
		}
		
		if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCodigoRetencionSri+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoCodigoRetencionSri.setToolTipText(sToolTipTipoCodigoRetencionSri);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoCodigoRetencionSri);
		this.jTableDatosTipoCodigoRetencionSri.setAutoCreateRowSorter(true);
		this.jTableDatosTipoCodigoRetencionSri.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoCodigoRetencionSri.setRowSelectionAllowed(true);
		this.jTableDatosTipoCodigoRetencionSri.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoCodigoRetencionSri,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonDuplicarTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonCopiarTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonVerFormTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonNuevoRelacionesTipoCodigoRetencionSri = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonCerrarTipoCodigoRetencionSri = new JButtonMe();
		
		this.jScrollPanelDatosTipoCodigoRetencionSri = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoCodigoRetencionSri = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoCodigoRetencionSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Codigo Retencion Sri";
		
		if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Codigo Retencion Sris" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCodigoRetencionSri.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCodigoRetencionSri.setToolTipText("Acciones");
        this.jPanelAccionesTipoCodigoRetencionSri.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri=new ReporteDinamicoJInternalFrame(TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoCodigoRetencionSri();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoCodigoRetencionSri=new ImportacionJInternalFrame(TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoCodigoRetencionSri();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoCodigoRetencionSri = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoCodigoRetencionSri.setText("Orden");
		this.jButtonAbrirOrderByTipoCodigoRetencionSri.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCodigoRetencionSri,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoCodigoRetencionSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCodigoRetencionSri=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCodigoRetencionSri,false,this);
			
			//this.cargarOrderByTipoCodigoRetencionSri(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoCodigoRetencionSri=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCodigoRetencionSri,true,this);
			
			//this.cargarOrderByTipoCodigoRetencionSri(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoCodigoRetencionSri.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoCodigoRetencionSri.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoCodigoRetencionSri.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoCodigoRetencionSri.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCodigoRetencionSri.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoCodigoRetencionSri.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoCodigoRetencionSri.setText("Nuevo");
		this.jButtonDuplicarTipoCodigoRetencionSri.setText("Duplicar");
		this.jButtonCopiarTipoCodigoRetencionSri.setText("Copiar");
		this.jButtonVerFormTipoCodigoRetencionSri.setText("Ver");
		this.jButtonNuevoRelacionesTipoCodigoRetencionSri.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri.setText("Guardar");
		this.jButtonCerrarTipoCodigoRetencionSri.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCodigoRetencionSri,"nuevo_button","Nuevo",this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoCodigoRetencionSri,"duplicar_button","Duplicar",this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoCodigoRetencionSri,"copiar_button","Copiar",this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoCodigoRetencionSri,"ver_form","Ver",this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoCodigoRetencionSri,"nuevorelaciones_button","Nuevo Rel",this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri,"guardarcambiostabla_button","Guardar",this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCodigoRetencionSri,"cerrar_button","Salir",this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoCodigoRetencionSri.setToolTipText("Nuevo"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoCodigoRetencionSri.setToolTipText("Duplicar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoCodigoRetencionSri.setToolTipText("Copiar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoCodigoRetencionSri.setToolTipText("Ver"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoCodigoRetencionSri.setToolTipText("Nuevo Rel"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri.setToolTipText("Guardar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCodigoRetencionSri.setToolTipText("Salir"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCodigoRetencionSri";
		inputMap = this.jButtonNuevoTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCodigoRetencionSri.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCodigoRetencionSri"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoCodigoRetencionSri";
		inputMap = this.jButtonDuplicarTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoCodigoRetencionSri.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoCodigoRetencionSri"));
		
		//COPIAR
		sMapKey = "CopiarTipoCodigoRetencionSri";
		inputMap = this.jButtonCopiarTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoCodigoRetencionSri.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoCodigoRetencionSri"));
		
		//VEr FORM
		sMapKey = "VerFormTipoCodigoRetencionSri";
		inputMap = this.jButtonVerFormTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoCodigoRetencionSri.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoCodigoRetencionSri"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoCodigoRetencionSri";
		inputMap = this.jButtonNuevoRelacionesTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoCodigoRetencionSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoCodigoRetencionSri"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoCodigoRetencionSri";
		inputMap = this.jButtonModificarTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoCodigoRetencionSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoCodigoRetencionSri"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoCodigoRetencionSri";
		inputMap = this.jButtonCerrarTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCodigoRetencionSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCodigoRetencionSri"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCodigoRetencionSri";
		inputMap = this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCodigoRetencionSri"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoCodigoRetencionSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoCodigoRetencionSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoCodigoRetencionSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoCodigoRetencionSri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoCodigoRetencionSri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoCodigoRetencionSri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoCodigoRetencionSri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoCodigoRetencionSri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoCodigoRetencionSri.setName("jPanelParametrosReportesTipoCodigoRetencionSri"); 
		
		this.jPanelParametrosReportesAccionesTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoCodigoRetencionSri.setName("jPanelParametrosReportesAccionesTipoCodigoRetencionSri"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonRecargarInformacionTipoCodigoRetencionSri.setText("Recargar");
		this.jButtonRecargarInformacionTipoCodigoRetencionSri.setToolTipText("Recargar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoCodigoRetencionSri,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonProcesarInformacionTipoCodigoRetencionSri.setText("Procesar");
		this.jButtonProcesarInformacionTipoCodigoRetencionSri.setToolTipText("Procesar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoCodigoRetencionSri.setVisible(false);
			
		this.jButtonProcesarInformacionTipoCodigoRetencionSri.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCodigoRetencionSri.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoCodigoRetencionSri.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoCodigoRetencionSri = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCodigoRetencionSri.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoCodigoRetencionSri.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoCodigoRetencionSri = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCodigoRetencionSri.setText("TIPO");       
		this.jComboBoxTiposReportesTipoCodigoRetencionSri.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoCodigoRetencionSri = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoCodigoRetencionSri.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoCodigoRetencionSri.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoCodigoRetencionSri = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoCodigoRetencionSri.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoCodigoRetencionSri.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoCodigoRetencionSri = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoCodigoRetencionSri.setText("Accion");
		this.jComboBoxTiposRelacionesTipoCodigoRetencionSri.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoCodigoRetencionSri = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setText("Accion");
		this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoCodigoRetencionSri=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoCodigoRetencionSri.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCodigoRetencionSri.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoCodigoRetencionSri.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoCodigoRetencionSri = new JLabelMe();
		
		this.jLabelAccionesTipoCodigoRetencionSri.setText("Acciones");		
		this.jLabelAccionesTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoCodigoRetencionSri = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoCodigoRetencionSri.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoCodigoRetencionSri.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoCodigoRetencionSri = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoCodigoRetencionSri.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoCodigoRetencionSri.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoCodigoRetencionSri = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoCodigoRetencionSri.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoCodigoRetencionSri.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoCodigoRetencionSri = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoCodigoRetencionSri.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoCodigoRetencionSri.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoCodigoRetencionSri = new JButtonMe();
		//this.jButtonAnterioresTipoCodigoRetencionSri.setText("<<");
        this.jButtonAnterioresTipoCodigoRetencionSri.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoCodigoRetencionSri,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoCodigoRetencionSri = new JButtonMe();
		//this.jButtonSiguientesTipoCodigoRetencionSri.setText(">>");
        this.jButtonSiguientesTipoCodigoRetencionSri.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoCodigoRetencionSri,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoCodigoRetencionSri.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoCodigoRetencionSri.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoCodigoRetencionSri,"nuevoguardarcambios_button","Nue",this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoCodigoRetencionSri";
		inputMap = this.jButtonNuevoGuardarCambiosTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoCodigoRetencionSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoCodigoRetencionSri"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoCodigoRetencionSri";
		inputMap = this.jButtonRecargarInformacionTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoCodigoRetencionSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoCodigoRetencionSri"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoCodigoRetencionSri";
		inputMap = this.jButtonSiguientesTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoCodigoRetencionSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoCodigoRetencionSri"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoCodigoRetencionSri";
		inputMap = this.jButtonAnterioresTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoCodigoRetencionSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoCodigoRetencionSri"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoCodigoRetencionSri();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoCodigoRetencionSri.setMinimumSize(new Dimension(this.getWidth(),TipoCodigoRetencionSriBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCodigoRetencionSriBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCodigoRetencionSri.setMaximumSize(new Dimension(this.getWidth(),TipoCodigoRetencionSriBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCodigoRetencionSriBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoCodigoRetencionSri.setPreferredSize(new Dimension(this.getWidth(),TipoCodigoRetencionSriBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoCodigoRetencionSriBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoCodigoRetencionSri = new GridBagLayout();

			this.jPanelPaginacionTipoCodigoRetencionSri.setLayout(gridaBagLayoutPaginacionTipoCodigoRetencionSri);						
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoCodigoRetencionSri.add(this.jButtonAnterioresTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
					
						
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
			
			this.jPanelPaginacionTipoCodigoRetencionSri.add(this.jButtonNuevoGuardarCambiosTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
						
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
			this.jPanelPaginacionTipoCodigoRetencionSri.add(this.jButtonSiguientesTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 1;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCodigoRetencionSri.add(this.jButtonNuevoTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
						
			
			
			if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
				this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 1;
				this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoCodigoRetencionSri.add(this.jButtonGuardarCambiosTablaTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
			}
			
			
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 1;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCodigoRetencionSri.add(this.jButtonDuplicarTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 1;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCodigoRetencionSri.add(this.jButtonCopiarTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 1;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoCodigoRetencionSri.add(this.jButtonVerFormTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 1;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoCodigoRetencionSri.add(this.jButtonCerrarTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		
		
		
		this.jButtonRecargarInformacionTipoCodigoRetencionSri.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCodigoRetencionSri.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoCodigoRetencionSri.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoCodigoRetencionSri.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCodigoRetencionSri.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoCodigoRetencionSri.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoCodigoRetencionSri.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCodigoRetencionSri.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoCodigoRetencionSri.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoCodigoRetencionSri.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCodigoRetencionSri.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoCodigoRetencionSri.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoCodigoRetencionSri.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCodigoRetencionSri.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoCodigoRetencionSri.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoCodigoRetencionSri.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCodigoRetencionSri.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoCodigoRetencionSri.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCodigoRetencionSri.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoCodigoRetencionSri.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCodigoRetencionSri.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoCodigoRetencionSri.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoCodigoRetencionSri.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCodigoRetencionSri.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoCodigoRetencionSri.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoCodigoRetencionSri.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCodigoRetencionSri.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoCodigoRetencionSri.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoCodigoRetencionSri.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCodigoRetencionSri.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoCodigoRetencionSri.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoCodigoRetencionSri = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoCodigoRetencionSri = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoCodigoRetencionSri = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoCodigoRetencionSri = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoCodigoRetencionSri = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoCodigoRetencionSri = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoCodigoRetencionSri.setLayout(gridaBagParametrosReportesTipoCodigoRetencionSri);
			this.jPanelParametrosReportesAccionesTipoCodigoRetencionSri.setLayout(gridaBagParametrosReportesAccionesTipoCodigoRetencionSri);
			
			
			this.jPanelParametrosAuxiliar1TipoCodigoRetencionSri.setLayout(gridaBagParametrosAuxiliar1TipoCodigoRetencionSri);
			this.jPanelParametrosAuxiliar2TipoCodigoRetencionSri.setLayout(gridaBagParametrosAuxiliar2TipoCodigoRetencionSri);
			this.jPanelParametrosAuxiliar3TipoCodigoRetencionSri.setLayout(gridaBagParametrosAuxiliar3TipoCodigoRetencionSri);
			this.jPanelParametrosAuxiliar4TipoCodigoRetencionSri.setLayout(gridaBagParametrosAuxiliar4TipoCodigoRetencionSri);
			//this.jPanelParametrosAuxiliar5TipoCodigoRetencionSri.setLayout(gridaBagParametrosAuxiliar2TipoCodigoRetencionSri);			
			
			
			
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCodigoRetencionSri.add(this.jButtonRecargarInformacionTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCodigoRetencionSri.add(this.jComboBoxTiposPaginacionTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCodigoRetencionSri.add(this.jCheckBoxConAltoMaximoTablaTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoCodigoRetencionSri.add(this.jComboBoxTiposArchivosReportesTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCodigoRetencionSri.add(this.jPanelParametrosAuxiliar1TipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoCodigoRetencionSri.add(this.jComboBoxTiposReportesTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCodigoRetencionSri.add(this.jPanelParametrosAuxiliar4TipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCodigoRetencionSri.add(this.jComboBoxTiposReportesTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCodigoRetencionSri.add(this.jCheckBoxGenerarReporteTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCodigoRetencionSri.add(this.jPanelParametrosAuxiliar2TipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCodigoRetencionSri.add(this.jLabelAccionesTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
				this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoCodigoRetencionSri.add(this.jButtonAbrirOrderByTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCodigoRetencionSri.add(this.jComboBoxTiposSeleccionarTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);			
			
			
			/*
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoCodigoRetencionSri.add(this.jCheckBoxSeleccionarTodosTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCodigoRetencionSri.add(this.jCheckBoxSeleccionarTodosTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);															
				
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoCodigoRetencionSri.add(this.jCheckBoxSeleccionadosTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoCodigoRetencionSri.add(this.jPanelParametrosAuxiliar3TipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoCodigoRetencionSri.add(this.jComboBoxTiposAccionesTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoCodigoRetencionSri = new GridBagLayout();

			this.jScrollPanelDatosTipoCodigoRetencionSri.setLayout(gridaBagLayoutDatosTipoCodigoRetencionSri);
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
			
			this.jScrollPanelDatosTipoCodigoRetencionSri.add(this.jTableDatosTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoCodigoRetencionSri.setViewportView(this.jTableDatosTipoCodigoRetencionSri);
		this.jTableDatosTipoCodigoRetencionSri.setFillsViewportHeight(true);
		this.jTableDatosTipoCodigoRetencionSri.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoCodigoRetencionSri= new GridBagLayout();
		this.jPanelAccionesTipoCodigoRetencionSri.setLayout(gridaBagLayoutAccionesTipoCodigoRetencionSri);
		
		
		/*	
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
			
		this.jPanelAccionesTipoCodigoRetencionSri.add(this.jButtonNuevoTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoCodigoRetencionSri= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoCodigoRetencionSri.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoCodigoRetencionSri.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoCodigoRetencionSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoCodigoRetencionSri.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoCodigoRetencionSri.setLayout(gridaBagLayoutBusquedaPorCodigoTipoCodigoRetencionSri);

		gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
		gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
		jPanelBusquedaPorCodigoTipoCodigoRetencionSri.add(jLabelcodigoBusquedaPorCodigoTipoCodigoRetencionSri, gridBagConstraintsTipoCodigoRetencionSri);

		gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
		gridBagConstraintsTipoCodigoRetencionSri.gridx = 1;
		jPanelBusquedaPorCodigoTipoCodigoRetencionSri.add(jTextFieldcodigoBusquedaPorCodigoTipoCodigoRetencionSri, gridBagConstraintsTipoCodigoRetencionSri);

		gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCodigoRetencionSri.gridy = 1;
		gridBagConstraintsTipoCodigoRetencionSri.gridx =1;
		jPanelBusquedaPorCodigoTipoCodigoRetencionSri.add(jButtonBusquedaPorCodigoTipoCodigoRetencionSri, gridBagConstraintsTipoCodigoRetencionSri);

		jTabbedPaneBusquedasTipoCodigoRetencionSri.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoCodigoRetencionSri);
		jTabbedPaneBusquedasTipoCodigoRetencionSri.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoCodigoRetencionSri= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoCodigoRetencionSri.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoCodigoRetencionSri.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoCodigoRetencionSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoCodigoRetencionSri.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoCodigoRetencionSri.setLayout(gridaBagLayoutBusquedaPorNombreTipoCodigoRetencionSri);

		gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
		gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
		jPanelBusquedaPorNombreTipoCodigoRetencionSri.add(jLabelnombreBusquedaPorNombreTipoCodigoRetencionSri, gridBagConstraintsTipoCodigoRetencionSri);

		gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
		gridBagConstraintsTipoCodigoRetencionSri.gridx = 1;
		jPanelBusquedaPorNombreTipoCodigoRetencionSri.add(jTextAreanombreBusquedaPorNombreTipoCodigoRetencionSri, gridBagConstraintsTipoCodigoRetencionSri);

		gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCodigoRetencionSri.gridy = 1;
		gridBagConstraintsTipoCodigoRetencionSri.gridx =1;
		jPanelBusquedaPorNombreTipoCodigoRetencionSri.add(jButtonBusquedaPorNombreTipoCodigoRetencionSri, gridBagConstraintsTipoCodigoRetencionSri);

		jTabbedPaneBusquedasTipoCodigoRetencionSri.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoCodigoRetencionSri);
		jTabbedPaneBusquedasTipoCodigoRetencionSri.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPaisTipoCodigoRetencionSri= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTipoCodigoRetencionSri.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoCodigoRetencionSri.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoCodigoRetencionSri.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTipoCodigoRetencionSri.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTipoCodigoRetencionSri.setLayout(gridaBagLayoutFK_IdPaisTipoCodigoRetencionSri);

		gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
		gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
		jPanelFK_IdPaisTipoCodigoRetencionSri.add(jLabelid_paisFK_IdPaisTipoCodigoRetencionSri, gridBagConstraintsTipoCodigoRetencionSri);

		gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCodigoRetencionSri.gridy = 0;
		gridBagConstraintsTipoCodigoRetencionSri.gridx = 1;
		jPanelFK_IdPaisTipoCodigoRetencionSri.add(jComboBoxid_paisFK_IdPaisTipoCodigoRetencionSri, gridBagConstraintsTipoCodigoRetencionSri);

		gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoCodigoRetencionSri.gridy = 1;
		gridBagConstraintsTipoCodigoRetencionSri.gridx =1;
		jPanelFK_IdPaisTipoCodigoRetencionSri.add(jButtonFK_IdPaisTipoCodigoRetencionSri, gridBagConstraintsTipoCodigoRetencionSri);

		jTabbedPaneBusquedasTipoCodigoRetencionSri.addTab("3.-Por Pais ", jPanelFK_IdPaisTipoCodigoRetencionSri);
		jTabbedPaneBusquedasTipoCodigoRetencionSri.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCodigoRetencionSri = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCodigoRetencionSri);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();						
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;		
			//this.gridBagConstraintsTipoCodigoRetencionSri.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;		
		//this.gridBagConstraintsTipoCodigoRetencionSri.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoCodigoRetencionSri);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;		
			this.gridBagConstraintsTipoCodigoRetencionSri.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoCodigoRetencionSri.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);								
		
		
		/*
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		*/		
		
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx =0;
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCodigoRetencionSri.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
				
		
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoCodigoRetencionSriJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoCodigoRetencionSri= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCodigoRetencionSri = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoCodigoRetencionSri.setLayout(gridaBagLayoutBusquedasParametrosTipoCodigoRetencionSri);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoCodigoRetencionSri=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCodigoRetencionSri.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCodigoRetencionSri.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCodigoRetencionSri.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
			
			
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		
			
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoCodigoRetencionSri;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoCodigoRetencionSri() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoCodigoRetencionSri = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoCodigoRetencionSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoCodigoRetencionSri.setName("jPanelReporteDinamicoTipoCodigoRetencionSri"); 
		
		this.jPanelReporteDinamicoTipoCodigoRetencionSri.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCodigoRetencionSri.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoCodigoRetencionSri.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoCodigoRetencionSri.setLayout(gridaBagLayoutReporteDinamicoTipoCodigoRetencionSri);
		
		
		this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoCodigoRetencionSri = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCodigoRetencionSri= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoCodigoRetencionSri.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCodigoRetencionSri.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoCodigoRetencionSri.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Codigo Retencion Sris"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoCodigoRetencionSri = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoCodigoRetencionSri.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoCodigoRetencionSri.add(this.jLabelColumnasSelectReporteTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoCodigoRetencionSri = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoCodigoRetencionSri.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoCodigoRetencionSri.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoCodigoRetencionSri.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCodigoRetencionSri.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoCodigoRetencionSri.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoCodigoRetencionSri=new JScrollPane(this.jListColumnasSelectReporteTipoCodigoRetencionSri);
			
			this.jScrollColumnasSelectReporteTipoCodigoRetencionSri.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCodigoRetencionSri.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoCodigoRetencionSri.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoCodigoRetencionSri.add(this.jListColumnasSelectReporteTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		this.jPanelReporteDinamicoTipoCodigoRetencionSri.add(this.jScrollColumnasSelectReporteTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoCodigoRetencionSri = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoCodigoRetencionSri.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoCodigoRetencionSri = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoCodigoRetencionSri.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoCodigoRetencionSri.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoCodigoRetencionSri.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCodigoRetencionSri.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoCodigoRetencionSri.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoCodigoRetencionSri=new JScrollPane(this.jListRelacionesSelectReporteTipoCodigoRetencionSri);
			
			this.jScrollRelacionesSelectReporteTipoCodigoRetencionSri.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCodigoRetencionSri.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoCodigoRetencionSri.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoCodigoRetencionSri = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoCodigoRetencionSri = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoCodigoRetencionSri = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoCodigoRetencionSri = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoCodigoRetencionSri.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoCodigoRetencionSri.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCodigoRetencionSri.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoCodigoRetencionSri.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoCodigoRetencionSri = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCodigoRetencionSri.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoCodigoRetencionSri.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCodigoRetencionSri.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoCodigoRetencionSri.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoCodigoRetencionSri = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoCodigoRetencionSri.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCodigoRetencionSri.add(this.jLabelGenerarExcelReporteDinamicoTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoCodigoRetencionSri.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoCodigoRetencionSri,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoCodigoRetencionSri.setToolTipText("Generar EXCEL"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		//this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoCodigoRetencionSri.add(this.jButtonGenerarExcelReporteDinamicoTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCodigoRetencionSri.add(this.jComboBoxTiposReportesDinamicoTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoCodigoRetencionSri = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoCodigoRetencionSri.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoCodigoRetencionSri.add(this.jLabelTiposArchivoReporteDinamicoTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCodigoRetencionSri.add(this.jComboBoxTiposArchivosReportesDinamicoTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoCodigoRetencionSri.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoCodigoRetencionSri,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoCodigoRetencionSri.setToolTipText("Generar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCodigoRetencionSri.add(this.jButtonGenerarReporteDinamicoTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoCodigoRetencionSri.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoCodigoRetencionSri,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoCodigoRetencionSri.setToolTipText("Cancelar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoCodigoRetencionSri.add(this.jButtonCerrarReporteDinamicoTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoCodigoRetencionSri = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoCodigoRetencionSri= new JScrollPane(jPanelReporteDinamicoTipoCodigoRetencionSri,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoCodigoRetencionSri.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCodigoRetencionSri.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoCodigoRetencionSri.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Codigo Retencion Sris"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoCodigoRetencionSri);
		this.jInternalFrameReporteDinamicoTipoCodigoRetencionSri.getContentPane().add(this.jScrollPanelReporteDinamicoTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoCodigoRetencionSri() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoCodigoRetencionSri = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoCodigoRetencionSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoCodigoRetencionSri.setName("jPanelImportacionTipoCodigoRetencionSri"); 
		
		this.jPanelImportacionTipoCodigoRetencionSri.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCodigoRetencionSri.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoCodigoRetencionSri.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoCodigoRetencionSri.setLayout(gridaBagLayoutImportacionTipoCodigoRetencionSri);
		
		
		this.jInternalFrameImportacionTipoCodigoRetencionSri= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoCodigoRetencionSri= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoCodigoRetencionSri = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoCodigoRetencionSri= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoCodigoRetencionSri.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCodigoRetencionSri.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCodigoRetencionSri.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoCodigoRetencionSri.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCodigoRetencionSri.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCodigoRetencionSri.setResizable(true);
	    this.jInternalFrameImportacionTipoCodigoRetencionSri.setClosable(true);
	    this.jInternalFrameImportacionTipoCodigoRetencionSri.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoCodigoRetencionSri.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoCodigoRetencionSri.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoCodigoRetencionSri.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoCodigoRetencionSri.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoCodigoRetencionSri.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoCodigoRetencionSri.setResizable(true);
	    this.jInternalFrameImportacionTipoCodigoRetencionSri.setClosable(true);
	    this.jInternalFrameImportacionTipoCodigoRetencionSri.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoCodigoRetencionSri.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCodigoRetencionSri.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoCodigoRetencionSri.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Codigo Retencion Sris"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoCodigoRetencionSri = new JLabelMe();

		this.jLabelArchivoImportacionTipoCodigoRetencionSri.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCodigoRetencionSri.add(this.jLabelArchivoImportacionTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoCodigoRetencionSri = new JFileChooser();		
		this.jFileChooserImportacionTipoCodigoRetencionSri.setToolTipText("ESCOGER ARCHIVO"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonAbrirImportacionTipoCodigoRetencionSri.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoCodigoRetencionSri,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoCodigoRetencionSri.setToolTipText("Generar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCodigoRetencionSri.add(this.jButtonAbrirImportacionTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoCodigoRetencionSri = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoCodigoRetencionSri.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoCodigoRetencionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCodigoRetencionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoCodigoRetencionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoCodigoRetencionSri.add(this.jLabelPathArchivoImportacionTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoCodigoRetencionSri=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoCodigoRetencionSri.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCodigoRetencionSri.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoCodigoRetencionSri.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCodigoRetencionSri.add(this.jTextFieldPathArchivoImportacionTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonGenerarImportacionTipoCodigoRetencionSri.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoCodigoRetencionSri,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoCodigoRetencionSri.setToolTipText("Generar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCodigoRetencionSri.add(this.jButtonGenerarImportacionTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoCodigoRetencionSri = new JButtonMe();
		this.jButtonCerrarImportacionTipoCodigoRetencionSri.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoCodigoRetencionSri,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoCodigoRetencionSri.setToolTipText("Cancelar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoCodigoRetencionSri.add(this.jButtonCerrarImportacionTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoCodigoRetencionSri = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoCodigoRetencionSri= new JScrollPane(jPanelImportacionTipoCodigoRetencionSri,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoRetencionSri.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoCodigoRetencionSri.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoCodigoRetencionSri.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoCodigoRetencionSri.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoCodigoRetencionSri);
		this.jInternalFrameImportacionTipoCodigoRetencionSri.getContentPane().add(this.jScrollPanelImportacionTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoCodigoRetencionSri(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoCodigoRetencionSri = new JButtonMe();
			this.jButtonAbrirOrderByTipoCodigoRetencionSri.setText("Orden");
			this.jButtonAbrirOrderByTipoCodigoRetencionSri.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoCodigoRetencionSri,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoCodigoRetencionSri";
			inputMap = this.jButtonAbrirOrderByTipoCodigoRetencionSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoCodigoRetencionSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoCodigoRetencionSri"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoCodigoRetencionSri = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoCodigoRetencionSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoCodigoRetencionSri.setName("jPanelOrderByTipoCodigoRetencionSri"); 
			
			this.jPanelOrderByTipoCodigoRetencionSri.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCodigoRetencionSri.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoCodigoRetencionSri.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoCodigoRetencionSri.setLayout(gridaBagLayoutOrderByTipoCodigoRetencionSri);
			
			
			this.jTableDatosTipoCodigoRetencionSriOrderBy = new JTableMe();        
			this.jTableDatosTipoCodigoRetencionSriOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoCodigoRetencionSriOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoCodigoRetencionSriOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoCodigoRetencionSriOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoCodigoRetencionSriOrderBy.setViewportView(this.jTableDatosTipoCodigoRetencionSriOrderBy);
			this.jTableDatosTipoCodigoRetencionSriOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoCodigoRetencionSriOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoCodigoRetencionSri= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoCodigoRetencionSri= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoCodigoRetencionSri = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoCodigoRetencionSri= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoCodigoRetencionSri.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoCodigoRetencionSri.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoCodigoRetencionSri.setTitle("Orden");
			this.jInternalFrameOrderByTipoCodigoRetencionSri.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoCodigoRetencionSri.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoCodigoRetencionSri.setResizable(true);
			this.jInternalFrameOrderByTipoCodigoRetencionSri.setClosable(true);
			this.jInternalFrameOrderByTipoCodigoRetencionSri.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoCodigoRetencionSri.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCodigoRetencionSri.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoCodigoRetencionSri.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoCodigoRetencionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Codigo Retencion Sris"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoCodigoRetencionSri.ipady =150;
				
			this.jPanelOrderByTipoCodigoRetencionSri.add(jScrollPanelDatosTipoCodigoRetencionSriOrderBy, this.gridBagConstraintsTipoCodigoRetencionSri);//this.jTableDatosTipoCodigoRetencionSriTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoCodigoRetencionSri = new JButtonMe();
			this.jButtonCerrarOrderByTipoCodigoRetencionSri.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoCodigoRetencionSri,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoCodigoRetencionSri.setToolTipText("Cancelar"+" "+TipoCodigoRetencionSriConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoCodigoRetencionSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoCodigoRetencionSri.add(this.jButtonCerrarOrderByTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoCodigoRetencionSri = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoCodigoRetencionSri= new JScrollPane(jPanelOrderByTipoCodigoRetencionSri,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoCodigoRetencionSri = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoRetencionSri.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoCodigoRetencionSri.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoCodigoRetencionSri.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoCodigoRetencionSri.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoCodigoRetencionSri.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoCodigoRetencionSri);
			
			this.jInternalFrameOrderByTipoCodigoRetencionSri.getContentPane().add(this.jScrollPanelOrderByTipoCodigoRetencionSri, this.gridBagConstraintsTipoCodigoRetencionSri);			
		
		} else {
			this.jButtonAbrirOrderByTipoCodigoRetencionSri = new JButtonMe();
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
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=400;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipocodigoretencionsriSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoCodigoRetencionSri.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoCodigoRetencionSri.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoCodigoRetencionSri.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoCodigoRetencionSri.getRowHeight();//TipoCodigoRetencionSriConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoCodigoRetencionSriConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCodigoRetencionSri.isSelected()) {
					iHeightTable=TipoCodigoRetencionSriConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCodigoRetencionSriConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCodigoRetencionSriConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoCodigoRetencionSriConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoCodigoRetencionSri.isSelected()) {
					iHeightTable=TipoCodigoRetencionSriConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoCodigoRetencionSriConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoCodigoRetencionSriConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoCodigoRetencionSri.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCodigoRetencionSri.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoCodigoRetencionSri.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoCodigoRetencionSri.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCodigoRetencionSri.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoCodigoRetencionSri.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoCodigoRetencionSri!=null && this.jInternalFrameOrderByTipoCodigoRetencionSri.getjTableDatosOrderBy()!=null) {
			//if(!this.tipocodigoretencionsriSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoCodigoRetencionSri.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoCodigoRetencionSri.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoCodigoRetencionSri.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoCodigoRetencionSri.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoCodigoRetencionSri.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoCodigoRetencionSri.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoCodigoRetencionSri.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoCodigoRetencionSri.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCodigoRetencionSri.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoCodigoRetencionSri.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipocodigoretencionsriLogic.getTipoCodigoRetencionSris().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocodigoretencionsris.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoCodigoRetencionSri> TraerTipoCodigoRetencionSriBeans(List<TipoCodigoRetencionSri> tipocodigoretencionsris,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoCodigoRetencionSri tipocodigoretencionsri:tipocodigoretencionsris) {
					
				if(!(TipoCodigoRetencionSriConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoCodigoRetencionSriConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipocodigoretencionsri.setsDetalleGeneralEntityReporte(TipoCodigoRetencionSriConstantesFunciones.getTipoCodigoRetencionSriDescripcion(tipocodigoretencionsri));
										
						
					
						
					
				} else  {
							
					//tipocodigoretencionsri.setsDetalleGeneralEntityReporte(tipocodigoretencionsri.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipocodigoretencionsribeans.add(tipocodigoretencionsribean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipocodigoretencionsris;
    }
	//PARA REPORTES FIN
}
