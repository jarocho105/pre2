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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.tesoreria.util.TipoRetencionFuenteIvaConstantesFunciones;

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
public class TipoRetencionFuenteIvaJInternalFrame extends TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoRetencionFuenteIva;
	
	protected JMenuBar jmenuBarTipoRetencionFuenteIva;
	
	protected JMenu jmenuTipoRetencionFuenteIva;
	protected JMenu jmenuDatosTipoRetencionFuenteIva;
	protected JMenu jmenuArchivoTipoRetencionFuenteIva;
	protected JMenu jmenuAccionesTipoRetencionFuenteIva;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoRetencionFuenteIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRetencionFuenteIva;	
	protected GridBagConstraints gridBagConstraintsTipoRetencionFuenteIva;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoRetencionFuenteIvaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoRetencionFuenteIva;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoRetencionFuenteIva;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoRetencionFuenteIva;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public TipoRetencionFuenteIvaSessionBean tiporetencionfuenteivaSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoRetencionFuenteIva> tiporetencionfuenteivas;		
	public List<TipoRetencionFuenteIva> tiporetencionfuenteivasEliminados;	
	public List<TipoRetencionFuenteIva> tiporetencionfuenteivasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoRetencionFuenteIva;		
	protected JButton jButtonAbrirOrderByTipoRetencionFuenteIva;
	
	
	//protected JPanel jPanelOrderByTipoRetencionFuenteIva;
	//public JScrollPane jScrollPanelOrderByTipoRetencionFuenteIva;	
	//protected JButton jButtonCerrarOrderByTipoRetencionFuenteIva;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoRetencionFuenteIvaLogic tiporetencionfuenteivaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoRetencionFuenteIva;
	public JScrollPane jScrollPanelDatosEdicionTipoRetencionFuenteIva;
	public JScrollPane jScrollPanelDatosGeneralTipoRetencionFuenteIva;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoRetencionFuenteIvaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoRetencionFuenteIva;
	//public JScrollPane jScrollPanelImportacionTipoRetencionFuenteIva;
	
	
	
	protected JPanel jPanelAccionesTipoRetencionFuenteIva;
	
    protected JPanel jPanelPaginacionTipoRetencionFuenteIva;
    protected JPanel jPanelParametrosReportesTipoRetencionFuenteIva;
	protected JPanel jPanelParametrosReportesAccionesTipoRetencionFuenteIva;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoRetencionFuenteIva;
	protected JPanel jPanelParametrosAuxiliar2TipoRetencionFuenteIva;
	protected JPanel jPanelParametrosAuxiliar3TipoRetencionFuenteIva;
	protected JPanel jPanelParametrosAuxiliar4TipoRetencionFuenteIva;
	//protected JPanel jPanelParametrosAuxiliar5TipoRetencionFuenteIva;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoRetencionFuenteIva;
	//protected JPanel jPanelImportacionTipoRetencionFuenteIva;
	
	
	public JTable jTableDatosTipoRetencionFuenteIva;
	
	
	
	//public JTable jTableDatosTipoRetencionFuenteIvaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoRetencionFuenteIva;
	protected JButton jButtonDuplicarTipoRetencionFuenteIva;
	protected JButton jButtonCopiarTipoRetencionFuenteIva;
	protected JButton jButtonVerFormTipoRetencionFuenteIva;
	protected JButton jButtonNuevoRelacionesTipoRetencionFuenteIva;
	protected JButton jButtonModificarTipoRetencionFuenteIva;
	
    protected JButton jButtonGuardarCambiosTablaTipoRetencionFuenteIva;
	protected JButton jButtonCerrarTipoRetencionFuenteIva;
	
	
	protected JButton jButtonRecargarInformacionTipoRetencionFuenteIva;
	protected JButton jButtonProcesarInformacionTipoRetencionFuenteIva;
	
	
	protected JButton jButtonAnterioresTipoRetencionFuenteIva;
	protected JButton jButtonSiguientesTipoRetencionFuenteIva;
	protected JButton jButtonNuevoGuardarCambiosTipoRetencionFuenteIva;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoRetencionFuenteIva;
	//protected JButton jButtonCerrarReporteDinamicoTipoRetencionFuenteIva;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoRetencionFuenteIva;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoRetencionFuenteIva;
	//protected JButton jButtonGenerarImportacionTipoRetencionFuenteIva;
	//protected JButton jButtonCerrarImportacionTipoRetencionFuenteIva;
	//protected JFileChooser jFileChooserImportacionTipoRetencionFuenteIva;
	//protected File fileImportacionTipoRetencionFuenteIva;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRetencionFuenteIva;
	protected JButton jButtonDuplicarToolBarTipoRetencionFuenteIva;
	protected JButton jButtonNuevoRelacionesToolBarTipoRetencionFuenteIva;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoRetencionFuenteIva;
	protected JButton jButtonCopiarToolBarTipoRetencionFuenteIva;
	protected JButton jButtonVerFormToolBarTipoRetencionFuenteIva;
	public JButton jButtonGuardarCambiosTablaToolBarTipoRetencionFuenteIva;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRetencionFuenteIva;
	protected JButton jButtonCerrarToolBarTipoRetencionFuenteIva;
	
	protected JButton jButtonRecargarInformacionToolBarTipoRetencionFuenteIva;
	protected JButton jButtonProcesarInformacionToolBarTipoRetencionFuenteIva;
	protected JButton jButtonAnterioresToolBarTipoRetencionFuenteIva;
	protected JButton jButtonSiguientesToolBarTipoRetencionFuenteIva;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoRetencionFuenteIva;
	protected JButton jButtonAbrirOrderByToolBarTipoRetencionFuenteIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemDuplicarTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemNuevoRelacionesTipoRetencionFuenteIva;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemCopiarTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemVerFormTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemCerrarTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemDetalleCerrarTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRetencionFuenteIva;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemProcesarInformacionTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemAnterioresTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemSiguientesTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemAbrirOrderByTipoRetencionFuenteIva;
	protected JMenuItem jMenuItemMostrarOcultarTipoRetencionFuenteIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRetencionFuenteIva;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoRetencionFuenteIva;
	protected JCheckBox jCheckBoxSeleccionadosTipoRetencionFuenteIva;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoRetencionFuenteIva;
	protected JCheckBox jCheckBoxConGraficoReporteTipoRetencionFuenteIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoRetencionFuenteIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoRetencionFuenteIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRetencionFuenteIva;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoRetencionFuenteIva;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoRetencionFuenteIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoRetencionFuenteIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRetencionFuenteIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRetencionFuenteIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoRetencionFuenteIva;
	protected JTextField jTextFieldValorCampoGeneralTipoRetencionFuenteIva;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoRetencionFuenteIva;
	//public JList<Reporte> jListColumnasSelectReporteTipoRetencionFuenteIva;
	//public JScrollPane jScrollColumnasSelectReporteTipoRetencionFuenteIva;
	
	//public JLabel jLabelRelacionesSelectReporteTipoRetencionFuenteIva;
	//public JList<Reporte> jListRelacionesSelectReporteTipoRetencionFuenteIva;
	//public JScrollPane jScrollRelacionesSelectReporteTipoRetencionFuenteIva;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoRetencionFuenteIva;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoRetencionFuenteIva;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoRetencionFuenteIva;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoRetencionFuenteIva;
	
		
	//public JLabel jLabelArchivoImportacionTipoRetencionFuenteIva;	
	//public JLabel jLabelPathArchivoImportacionTipoRetencionFuenteIva;
	//protected JTextField jTextFieldPathArchivoImportacionTipoRetencionFuenteIva;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoRetencionFuenteIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoRetencionFuenteIva;
	
	//public JLabel jLabelColumnaCategoriaValorTipoRetencionFuenteIva;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoRetencionFuenteIva;
	
	//public JLabel jLabelColumnasValoresGraficoTipoRetencionFuenteIva;
	//public JList<Reporte> jListColumnasValoresGraficoTipoRetencionFuenteIva;
	//public JScrollPane jScrollColumnasValoresGraficoTipoRetencionFuenteIva;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoRetencionFuenteIva;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoRetencionFuenteIva;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoRetencionFuenteIva;
	public JPanel jPanelBusquedaPorCodigoTipoRetencionFuenteIva;
	public JButton jButtonBusquedaPorCodigoTipoRetencionFuenteIva;
	public JPanel jPanelBusquedaPorNombreTipoRetencionFuenteIva;
	public JButton jButtonBusquedaPorNombreTipoRetencionFuenteIva;
	public JPanel jPanelFK_IdPaisTipoRetencionFuenteIva;
	public JButton jButtonFK_IdPaisTipoRetencionFuenteIva;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoRetencionFuenteIva;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoRetencionFuenteIva;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoRetencionFuenteIva;
	public JButton jButtoncodigoBusquedaPorCodigoTipoRetencionFuenteIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoRetencionFuenteIva;
	public JLabel jLabelnombreBusquedaPorNombreTipoRetencionFuenteIva;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoRetencionFuenteIva;
	public JButton jButtonnombreBusquedaPorNombreTipoRetencionFuenteIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisTipoRetencionFuenteIva;
	public JLabel jLabelid_paisFK_IdPaisTipoRetencionFuenteIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva;
	public JButton jButtonid_paisFK_IdPaisTipoRetencionFuenteIva= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoRetencionFuenteIvaUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoRetencionFuenteIvaBusqueda= new JButtonMe();

	
	
	
	
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
		
	//public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	//public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoRetencionFuenteIvaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoRetencionFuenteIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionFuenteIvaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRetencionFuenteIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionFuenteIvaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRetencionFuenteIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionFuenteIvaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRetencionFuenteIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoRetencionFuenteIva)	{
		this.jButtonRecargarInformacionTipoRetencionFuenteIva = jButtonRecargarInformacionTipoRetencionFuenteIva;
	}
	
	public JButton getjButtonProcesarInformacionTipoRetencionFuenteIva() {
		return this.jButtonProcesarInformacionTipoRetencionFuenteIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRetencionFuenteIva)	{
		this.jButtonProcesarInformacionTipoRetencionFuenteIva = jButtonProcesarInformacionTipoRetencionFuenteIva;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoRetencionFuenteIva() {
		return this.jButtonRecargarInformacionTipoRetencionFuenteIva;
	}
	
	
	public List<TipoRetencionFuenteIva> gettiporetencionfuenteivas() {
		return this.tiporetencionfuenteivas;
	}

	public void settiporetencionfuenteivas(List<TipoRetencionFuenteIva> tiporetencionfuenteivas) {
		this.tiporetencionfuenteivas = tiporetencionfuenteivas;
	}
	
	public List<TipoRetencionFuenteIva> gettiporetencionfuenteivasAux() {
		return this.tiporetencionfuenteivasAux;
	}

	public void settiporetencionfuenteivasAux(List<TipoRetencionFuenteIva> tiporetencionfuenteivasAux) {
		this.tiporetencionfuenteivasAux = tiporetencionfuenteivasAux;
	}
	
	public List<TipoRetencionFuenteIva> gettiporetencionfuenteivasEliminados() {
		return this.tiporetencionfuenteivasEliminados;
	}

	public void setTipoRetencionFuenteIvasEliminados(List<TipoRetencionFuenteIva> tiporetencionfuenteivasEliminados) {
		this.tiporetencionfuenteivasEliminados = tiporetencionfuenteivasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoRetencionFuenteIva() {
		return jComboBoxTiposSeleccionarTipoRetencionFuenteIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoRetencionFuenteIva(
			JComboBox jComboBoxTiposSeleccionarTipoRetencionFuenteIva) {
		this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva = jComboBoxTiposSeleccionarTipoRetencionFuenteIva;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoRetencionFuenteIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoRetencionFuenteIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoRetencionFuenteIva() {
		return jTextFieldValorCampoGeneralTipoRetencionFuenteIva;
	}

	public void setjTextFieldValorCampoGeneralTipoRetencionFuenteIva(
			JTextField jTextFieldValorCampoGeneralTipoRetencionFuenteIva) {
		this.jTextFieldValorCampoGeneralTipoRetencionFuenteIva = jTextFieldValorCampoGeneralTipoRetencionFuenteIva;
	}

	public void setBorderResaltarValorCampoGeneralTipoRetencionFuenteIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionFuenteIva.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoRetencionFuenteIva .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoRetencionFuenteIva() {
		return this.jCheckBoxSeleccionarTodosTipoRetencionFuenteIva;
	}

	public void setjCheckBoxSeleccionarTodosTipoRetencionFuenteIva(
			JCheckBox jCheckBoxSeleccionarTodosTipoRetencionFuenteIva) {
		this.jCheckBoxSeleccionarTodosTipoRetencionFuenteIva = jCheckBoxSeleccionarTodosTipoRetencionFuenteIva;
	}

	public void setBorderResaltarSeleccionarTodosTipoRetencionFuenteIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionFuenteIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoRetencionFuenteIva .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoRetencionFuenteIva() {
		return this.jCheckBoxSeleccionadosTipoRetencionFuenteIva;
	}

	public void setjCheckBoxSeleccionadosTipoRetencionFuenteIva(
			JCheckBox jCheckBoxSeleccionadosTipoRetencionFuenteIva) {
		this.jCheckBoxSeleccionadosTipoRetencionFuenteIva = jCheckBoxSeleccionadosTipoRetencionFuenteIva;
	}
	
	public void setBorderResaltarSeleccionadosTipoRetencionFuenteIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionFuenteIva.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoRetencionFuenteIva .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoRetencionFuenteIva() {
		return this.jComboBoxTiposArchivosReportesTipoRetencionFuenteIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoRetencionFuenteIva(
			JComboBox jComboBoxTiposArchivosReportesTipoRetencionFuenteIva) {
		this.jComboBoxTiposArchivosReportesTipoRetencionFuenteIva = jComboBoxTiposArchivosReportesTipoRetencionFuenteIva;
	}

	public void setBorderResaltarTiposArchivosReportesTipoRetencionFuenteIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionFuenteIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoRetencionFuenteIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoRetencionFuenteIva() {
		return this.jComboBoxTiposReportesTipoRetencionFuenteIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoRetencionFuenteIva(
			JComboBox jComboBoxTiposReportesTipoRetencionFuenteIva) {
		this.jComboBoxTiposReportesTipoRetencionFuenteIva = jComboBoxTiposReportesTipoRetencionFuenteIva;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoRetencionFuenteIva() {
	//	return jComboBoxTiposReportesDinamicoTipoRetencionFuenteIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoRetencionFuenteIva(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoRetencionFuenteIva) {
	//	this.jComboBoxTiposReportesDinamicoTipoRetencionFuenteIva = jComboBoxTiposReportesDinamicoTipoRetencionFuenteIva;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoRetencionFuenteIva() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoRetencionFuenteIva;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoRetencionFuenteIva(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRetencionFuenteIva) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoRetencionFuenteIva = jComboBoxTiposArchivosReportesDinamicoTipoRetencionFuenteIva;
	//}
	
	public void setBorderResaltarTiposReportesTipoRetencionFuenteIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionFuenteIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoRetencionFuenteIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoRetencionFuenteIva() {
		return this.jComboBoxTiposGraficosReportesTipoRetencionFuenteIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoRetencionFuenteIva(
			JComboBox jComboBoxTiposGraficosReportesTipoRetencionFuenteIva) {
		this.jComboBoxTiposGraficosReportesTipoRetencionFuenteIva = jComboBoxTiposGraficosReportesTipoRetencionFuenteIva;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoRetencionFuenteIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionFuenteIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoRetencionFuenteIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoRetencionFuenteIva() {
		return this.jComboBoxTiposPaginacionTipoRetencionFuenteIva;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoRetencionFuenteIva(
			JComboBox jComboBoxTiposPaginacionTipoRetencionFuenteIva) {
		this.jComboBoxTiposPaginacionTipoRetencionFuenteIva = jComboBoxTiposPaginacionTipoRetencionFuenteIva;
	}
	
	public void setBorderResaltarTiposPaginacionTipoRetencionFuenteIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionFuenteIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoRetencionFuenteIva .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoRetencionFuenteIva() {
		return this.jComboBoxTiposRelacionesTipoRetencionFuenteIva;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRetencionFuenteIva() {
		return this.jComboBoxTiposAccionesTipoRetencionFuenteIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRetencionFuenteIva(
			JComboBox jComboBoxTiposRelacionesTipoRetencionFuenteIva) {
		this.jComboBoxTiposRelacionesTipoRetencionFuenteIva = jComboBoxTiposRelacionesTipoRetencionFuenteIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRetencionFuenteIva(
			JComboBox jComboBoxTiposAccionesTipoRetencionFuenteIva) {
		this.jComboBoxTiposAccionesTipoRetencionFuenteIva = jComboBoxTiposAccionesTipoRetencionFuenteIva;
	}
	
	public void setBorderResaltarTiposRelacionesTipoRetencionFuenteIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionFuenteIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoRetencionFuenteIva .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoRetencionFuenteIva() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencionFuenteIva.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoRetencionFuenteIva .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoRetencionFuenteIva() {
	//	return jCheckBoxConGraficoDinamicoTipoRetencionFuenteIva;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoRetencionFuenteIva(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoRetencionFuenteIva) {
	//	this.jCheckBoxConGraficoDinamicoTipoRetencionFuenteIva = jCheckBoxConGraficoDinamicoTipoRetencionFuenteIva;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoRetencionFuenteIva() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoRetencionFuenteIva.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoRetencionFuenteIva .setBorder(borderResaltar);		
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
		this.tiporetencionfuenteivaSessionBean=new TipoRetencionFuenteIvaSessionBean();
		
		this.tiporetencionfuenteivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporetencionfuenteivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoRetencionFuenteIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoRetencionFuenteIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRetencionFuenteIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRetencionFuenteIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRetencionFuenteIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Retencion Fuente Iva MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoRetencionFuenteIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoRetencionFuenteIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoRetencionFuenteIva= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoRetencionFuenteIva,this.jTtoolBarTipoRetencionFuenteIva,
							"nuevo","nuevo","Nuevo"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoRetencionFuenteIva,this.jTtoolBarTipoRetencionFuenteIva,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoRetencionFuenteIva,this.jTtoolBarTipoRetencionFuenteIva,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoRetencionFuenteIva,this.jTtoolBarTipoRetencionFuenteIva,
							"duplicar","duplicar","Duplicar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoRetencionFuenteIva,this.jTtoolBarTipoRetencionFuenteIva,
							"copiar","copiar","Copiar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoRetencionFuenteIva,this.jTtoolBarTipoRetencionFuenteIva,
							"ver_form","ver_form","Ver"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRetencionFuenteIva,this.jTtoolBarTipoRetencionFuenteIva,
							"recargar","recargar","Recargar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRetencionFuenteIva,this.jTtoolBarTipoRetencionFuenteIva,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRetencionFuenteIva,this.jTtoolBarTipoRetencionFuenteIva,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoRetencionFuenteIva,this.jTtoolBarTipoRetencionFuenteIva,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoRetencionFuenteIva,this.jTtoolBarTipoRetencionFuenteIva,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoRetencionFuenteIva,this.jTtoolBarTipoRetencionFuenteIva,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoRetencionFuenteIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoRetencionFuenteIva,this.jTtoolBarTipoRetencionFuenteIva,
							"cerrar","cerrar","Salir"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoRetencionFuenteIva=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoRetencionFuenteIva;
			
				this.jButtonProcesarInformacionToolBarTipoRetencionFuenteIva=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoRetencionFuenteIva;
				
		//protected JButton jButtonModificarToolBarTipoRetencionFuenteIva;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoRetencionFuenteIva=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoRetencionFuenteIva=new JMenuMe("General");
		this.jmenuArchivoTipoRetencionFuenteIva=new JMenuMe("Archivo");
		this.jmenuAccionesTipoRetencionFuenteIva=new JMenuMe("Acciones");
		this.jmenuDatosTipoRetencionFuenteIva=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRetencionFuenteIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRetencionFuenteIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRetencionFuenteIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoRetencionFuenteIva= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoRetencionFuenteIva.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoRetencionFuenteIva,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoRetencionFuenteIva= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoRetencionFuenteIva.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoRetencionFuenteIva,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoRetencionFuenteIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRetencionFuenteIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRetencionFuenteIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoRetencionFuenteIva= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoRetencionFuenteIva.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoRetencionFuenteIva,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoRetencionFuenteIva= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoRetencionFuenteIva.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoRetencionFuenteIva,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoRetencionFuenteIva= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoRetencionFuenteIva.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoRetencionFuenteIva,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRetencionFuenteIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRetencionFuenteIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRetencionFuenteIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoRetencionFuenteIva= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoRetencionFuenteIva.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoRetencionFuenteIva,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoRetencionFuenteIva= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoRetencionFuenteIva.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoRetencionFuenteIva,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoRetencionFuenteIva= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoRetencionFuenteIva.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoRetencionFuenteIva,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoRetencionFuenteIva= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoRetencionFuenteIva.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoRetencionFuenteIva,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoRetencionFuenteIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoRetencionFuenteIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoRetencionFuenteIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRetencionFuenteIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRetencionFuenteIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRetencionFuenteIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoRetencionFuenteIva= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoRetencionFuenteIva.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoRetencionFuenteIva,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRetencionFuenteIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRetencionFuenteIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRetencionFuenteIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoRetencionFuenteIva= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoRetencionFuenteIva.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoRetencionFuenteIva,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoRetencionFuenteIva.add(this.jMenuItemCerrarTipoRetencionFuenteIva);
			
			this.jmenuAccionesTipoRetencionFuenteIva.add(this.jMenuItemNuevoTipoRetencionFuenteIva);
			this.jmenuAccionesTipoRetencionFuenteIva.add(this.jMenuItemNuevoGuardarCambiosTipoRetencionFuenteIva);
			this.jmenuAccionesTipoRetencionFuenteIva.add(this.jMenuItemNuevoRelacionesTipoRetencionFuenteIva);
			this.jmenuAccionesTipoRetencionFuenteIva.add(this.jMenuItemGuardarCambiosTablaTipoRetencionFuenteIva);		
			this.jmenuAccionesTipoRetencionFuenteIva.add(this.jMenuItemDuplicarTipoRetencionFuenteIva);		
			this.jmenuAccionesTipoRetencionFuenteIva.add(this.jMenuItemCopiarTipoRetencionFuenteIva);		
			this.jmenuAccionesTipoRetencionFuenteIva.add(this.jMenuItemVerFormTipoRetencionFuenteIva);		
			
			this.jmenuDatosTipoRetencionFuenteIva.add(this.jMenuItemRecargarInformacionTipoRetencionFuenteIva);				
			this.jmenuDatosTipoRetencionFuenteIva.add(this.jMenuItemAnterioresTipoRetencionFuenteIva);				
			this.jmenuDatosTipoRetencionFuenteIva.add(this.jMenuItemSiguientesTipoRetencionFuenteIva);				
			this.jmenuDatosTipoRetencionFuenteIva.add(this.jMenuItemAbrirOrderByTipoRetencionFuenteIva);				
			this.jmenuDatosTipoRetencionFuenteIva.add(this.jMenuItemMostrarOcultarTipoRetencionFuenteIva);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoRetencionFuenteIva.add(this.jMenuItemGuardarCambiosTipoRetencionFuenteIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoRetencionFuenteIva.add(this.jmenuArchivoTipoRetencionFuenteIva);		
			this.jmenuBarTipoRetencionFuenteIva.add(this.jmenuAccionesTipoRetencionFuenteIva);		
			this.jmenuBarTipoRetencionFuenteIva.add(this.jmenuDatosTipoRetencionFuenteIva);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoRetencionFuenteIva);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoRetencionFuenteIva() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoRetencionFuenteIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoRetencionFuenteIva.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoRetencionFuenteIva= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoRetencionFuenteIva.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoRetencionFuenteIva.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoRetencionFuenteIva,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoRetencionFuenteIva = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoRetencionFuenteIva.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoRetencionFuenteIva.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoRetencionFuenteIva= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoRetencionFuenteIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoRetencionFuenteIva.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoRetencionFuenteIva= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoRetencionFuenteIva.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoRetencionFuenteIva.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoRetencionFuenteIva,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoRetencionFuenteIva = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoRetencionFuenteIva.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoRetencionFuenteIva.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoRetencionFuenteIva= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisTipoRetencionFuenteIva=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTipoRetencionFuenteIva.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTipoRetencionFuenteIva= new JButtonMe();
		this.jButtonFK_IdPaisTipoRetencionFuenteIva.setText("Buscar");
		this.jButtonFK_IdPaisTipoRetencionFuenteIva.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTipoRetencionFuenteIva,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTipoRetencionFuenteIva = new JLabelMe();
		jLabelid_paisFK_IdPaisTipoRetencionFuenteIva.setText("Pais :");
		jLabelid_paisFK_IdPaisTipoRetencionFuenteIva.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoRetencionFuenteIva=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoRetencionFuenteIva = new TipoRetencionFuenteIvaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Retencion Fuente Iva DATOS");
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva = new TipoRetencionFuenteIvaDetalleFormJInternalFrame(jDesktopPane,this.tiporetencionfuenteivaSessionBean.getConGuardarRelaciones(),this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva = null;//new TipoRetencionFuenteIvaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRetencionFuenteIva= new GridBagLayout();
		
		
		this.jTableDatosTipoRetencionFuenteIva = new JTableMe();      
		
		String sToolTipTipoRetencionFuenteIva="";
		sToolTipTipoRetencionFuenteIva=TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRetencionFuenteIva+="(Tesoreria.TipoRetencionFuenteIva)";
		}
		
		if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRetencionFuenteIva+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoRetencionFuenteIva.setToolTipText(sToolTipTipoRetencionFuenteIva);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoRetencionFuenteIva);
		this.jTableDatosTipoRetencionFuenteIva.setAutoCreateRowSorter(true);
		this.jTableDatosTipoRetencionFuenteIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoRetencionFuenteIva.setRowSelectionAllowed(true);
		this.jTableDatosTipoRetencionFuenteIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoRetencionFuenteIva,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonDuplicarTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonCopiarTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonVerFormTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonNuevoRelacionesTipoRetencionFuenteIva = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonCerrarTipoRetencionFuenteIva = new JButtonMe();
		
		this.jScrollPanelDatosTipoRetencionFuenteIva = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoRetencionFuenteIva = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoRetencionFuenteIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Retencion Fuente Iva";
		
		if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion Fuente Ivas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRetencionFuenteIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRetencionFuenteIva.setToolTipText("Acciones");
        this.jPanelAccionesTipoRetencionFuenteIva.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva=new ReporteDinamicoJInternalFrame(TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoRetencionFuenteIva();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoRetencionFuenteIva=new ImportacionJInternalFrame(TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoRetencionFuenteIva();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoRetencionFuenteIva = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoRetencionFuenteIva.setText("Orden");
		this.jButtonAbrirOrderByTipoRetencionFuenteIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRetencionFuenteIva,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoRetencionFuenteIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRetencionFuenteIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRetencionFuenteIva,false,this);
			
			//this.cargarOrderByTipoRetencionFuenteIva(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRetencionFuenteIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRetencionFuenteIva,true,this);
			
			//this.cargarOrderByTipoRetencionFuenteIva(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoRetencionFuenteIva.setMinimumSize(new Dimension(400,50));//1430
		this.jTableDatosTipoRetencionFuenteIva.setMaximumSize(new Dimension(400,50));//1430
		this.jTableDatosTipoRetencionFuenteIva.setPreferredSize(new Dimension(400,50));//1430
		
		this.jScrollPanelDatosTipoRetencionFuenteIva.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRetencionFuenteIva.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRetencionFuenteIva.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoRetencionFuenteIva.setText("Nuevo");
		this.jButtonDuplicarTipoRetencionFuenteIva.setText("Duplicar");
		this.jButtonCopiarTipoRetencionFuenteIva.setText("Copiar");
		this.jButtonVerFormTipoRetencionFuenteIva.setText("Ver");
		this.jButtonNuevoRelacionesTipoRetencionFuenteIva.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva.setText("Guardar");
		this.jButtonCerrarTipoRetencionFuenteIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRetencionFuenteIva,"nuevo_button","Nuevo",this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoRetencionFuenteIva,"duplicar_button","Duplicar",this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoRetencionFuenteIva,"copiar_button","Copiar",this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoRetencionFuenteIva,"ver_form","Ver",this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoRetencionFuenteIva,"nuevorelaciones_button","Nuevo Rel",this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva,"guardarcambiostabla_button","Guardar",this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRetencionFuenteIva,"cerrar_button","Salir",this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoRetencionFuenteIva.setToolTipText("Nuevo"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoRetencionFuenteIva.setToolTipText("Duplicar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoRetencionFuenteIva.setToolTipText("Copiar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoRetencionFuenteIva.setToolTipText("Ver"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoRetencionFuenteIva.setToolTipText("Nuevo Rel"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva.setToolTipText("Guardar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRetencionFuenteIva.setToolTipText("Salir"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRetencionFuenteIva";
		inputMap = this.jButtonNuevoTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRetencionFuenteIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRetencionFuenteIva"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoRetencionFuenteIva";
		inputMap = this.jButtonDuplicarTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoRetencionFuenteIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoRetencionFuenteIva"));
		
		//COPIAR
		sMapKey = "CopiarTipoRetencionFuenteIva";
		inputMap = this.jButtonCopiarTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoRetencionFuenteIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoRetencionFuenteIva"));
		
		//VEr FORM
		sMapKey = "VerFormTipoRetencionFuenteIva";
		inputMap = this.jButtonVerFormTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoRetencionFuenteIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoRetencionFuenteIva"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoRetencionFuenteIva";
		inputMap = this.jButtonNuevoRelacionesTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoRetencionFuenteIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoRetencionFuenteIva"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoRetencionFuenteIva";
		inputMap = this.jButtonModificarTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoRetencionFuenteIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoRetencionFuenteIva"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoRetencionFuenteIva";
		inputMap = this.jButtonCerrarTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRetencionFuenteIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRetencionFuenteIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRetencionFuenteIva";
		inputMap = this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRetencionFuenteIva"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoRetencionFuenteIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoRetencionFuenteIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoRetencionFuenteIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoRetencionFuenteIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoRetencionFuenteIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoRetencionFuenteIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoRetencionFuenteIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoRetencionFuenteIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoRetencionFuenteIva.setName("jPanelParametrosReportesTipoRetencionFuenteIva"); 
		
		this.jPanelParametrosReportesAccionesTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoRetencionFuenteIva.setName("jPanelParametrosReportesAccionesTipoRetencionFuenteIva"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonRecargarInformacionTipoRetencionFuenteIva.setText("Recargar");
		this.jButtonRecargarInformacionTipoRetencionFuenteIva.setToolTipText("Recargar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoRetencionFuenteIva,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonProcesarInformacionTipoRetencionFuenteIva.setText("Procesar");
		this.jButtonProcesarInformacionTipoRetencionFuenteIva.setToolTipText("Procesar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoRetencionFuenteIva.setVisible(false);
			
		this.jButtonProcesarInformacionTipoRetencionFuenteIva.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRetencionFuenteIva.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRetencionFuenteIva.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoRetencionFuenteIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRetencionFuenteIva.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoRetencionFuenteIva.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoRetencionFuenteIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRetencionFuenteIva.setText("TIPO");       
		this.jComboBoxTiposReportesTipoRetencionFuenteIva.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoRetencionFuenteIva = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRetencionFuenteIva.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoRetencionFuenteIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoRetencionFuenteIva = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoRetencionFuenteIva.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoRetencionFuenteIva.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoRetencionFuenteIva = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoRetencionFuenteIva.setText("Accion");
		this.jComboBoxTiposRelacionesTipoRetencionFuenteIva.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoRetencionFuenteIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setText("Accion");
		this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoRetencionFuenteIva=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoRetencionFuenteIva.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRetencionFuenteIva.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRetencionFuenteIva.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoRetencionFuenteIva = new JLabelMe();
		
		this.jLabelAccionesTipoRetencionFuenteIva.setText("Acciones");		
		this.jLabelAccionesTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoRetencionFuenteIva = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoRetencionFuenteIva.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoRetencionFuenteIva.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoRetencionFuenteIva = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoRetencionFuenteIva.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoRetencionFuenteIva.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoRetencionFuenteIva = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoRetencionFuenteIva.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoRetencionFuenteIva.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoRetencionFuenteIva = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoRetencionFuenteIva.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoRetencionFuenteIva.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoRetencionFuenteIva = new JButtonMe();
		//this.jButtonAnterioresTipoRetencionFuenteIva.setText("<<");
        this.jButtonAnterioresTipoRetencionFuenteIva.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoRetencionFuenteIva,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoRetencionFuenteIva = new JButtonMe();
		//this.jButtonSiguientesTipoRetencionFuenteIva.setText(">>");
        this.jButtonSiguientesTipoRetencionFuenteIva.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoRetencionFuenteIva,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoRetencionFuenteIva.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoRetencionFuenteIva.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoRetencionFuenteIva,"nuevoguardarcambios_button","Nue",this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoRetencionFuenteIva";
		inputMap = this.jButtonNuevoGuardarCambiosTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoRetencionFuenteIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoRetencionFuenteIva"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoRetencionFuenteIva";
		inputMap = this.jButtonRecargarInformacionTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoRetencionFuenteIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoRetencionFuenteIva"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoRetencionFuenteIva";
		inputMap = this.jButtonSiguientesTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoRetencionFuenteIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoRetencionFuenteIva"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoRetencionFuenteIva";
		inputMap = this.jButtonAnterioresTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoRetencionFuenteIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoRetencionFuenteIva"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoRetencionFuenteIva();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoRetencionFuenteIva.setMinimumSize(new Dimension(this.getWidth(),TipoRetencionFuenteIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRetencionFuenteIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRetencionFuenteIva.setMaximumSize(new Dimension(this.getWidth(),TipoRetencionFuenteIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRetencionFuenteIvaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRetencionFuenteIva.setPreferredSize(new Dimension(this.getWidth(),TipoRetencionFuenteIvaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRetencionFuenteIvaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoRetencionFuenteIva = new GridBagLayout();

			this.jPanelPaginacionTipoRetencionFuenteIva.setLayout(gridaBagLayoutPaginacionTipoRetencionFuenteIva);						
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoRetencionFuenteIva.add(this.jButtonAnterioresTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
					
						
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
			
			this.jPanelPaginacionTipoRetencionFuenteIva.add(this.jButtonNuevoGuardarCambiosTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
						
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
			this.jPanelPaginacionTipoRetencionFuenteIva.add(this.jButtonSiguientesTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 1;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRetencionFuenteIva.add(this.jButtonNuevoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
						
			
			
			if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
				this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 1;
				this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoRetencionFuenteIva.add(this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
			}
			
			
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 1;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRetencionFuenteIva.add(this.jButtonDuplicarTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 1;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRetencionFuenteIva.add(this.jButtonCopiarTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 1;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRetencionFuenteIva.add(this.jButtonVerFormTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 1;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoRetencionFuenteIva.add(this.jButtonCerrarTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
		
		
		this.jButtonRecargarInformacionTipoRetencionFuenteIva.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRetencionFuenteIva.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRetencionFuenteIva.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoRetencionFuenteIva.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRetencionFuenteIva.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRetencionFuenteIva.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoRetencionFuenteIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRetencionFuenteIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRetencionFuenteIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoRetencionFuenteIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRetencionFuenteIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRetencionFuenteIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoRetencionFuenteIva.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRetencionFuenteIva.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRetencionFuenteIva.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoRetencionFuenteIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRetencionFuenteIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRetencionFuenteIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoRetencionFuenteIva.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRetencionFuenteIva.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRetencionFuenteIva.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoRetencionFuenteIva.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRetencionFuenteIva.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRetencionFuenteIva.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoRetencionFuenteIva.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRetencionFuenteIva.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRetencionFuenteIva.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoRetencionFuenteIva.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRetencionFuenteIva.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRetencionFuenteIva.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoRetencionFuenteIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoRetencionFuenteIva = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoRetencionFuenteIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoRetencionFuenteIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoRetencionFuenteIva = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoRetencionFuenteIva = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoRetencionFuenteIva.setLayout(gridaBagParametrosReportesTipoRetencionFuenteIva);
			this.jPanelParametrosReportesAccionesTipoRetencionFuenteIva.setLayout(gridaBagParametrosReportesAccionesTipoRetencionFuenteIva);
			
			
			this.jPanelParametrosAuxiliar1TipoRetencionFuenteIva.setLayout(gridaBagParametrosAuxiliar1TipoRetencionFuenteIva);
			this.jPanelParametrosAuxiliar2TipoRetencionFuenteIva.setLayout(gridaBagParametrosAuxiliar2TipoRetencionFuenteIva);
			this.jPanelParametrosAuxiliar3TipoRetencionFuenteIva.setLayout(gridaBagParametrosAuxiliar3TipoRetencionFuenteIva);
			this.jPanelParametrosAuxiliar4TipoRetencionFuenteIva.setLayout(gridaBagParametrosAuxiliar4TipoRetencionFuenteIva);
			//this.jPanelParametrosAuxiliar5TipoRetencionFuenteIva.setLayout(gridaBagParametrosAuxiliar2TipoRetencionFuenteIva);			
			
			
			
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRetencionFuenteIva.add(this.jButtonRecargarInformacionTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRetencionFuenteIva.add(this.jComboBoxTiposPaginacionTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRetencionFuenteIva.add(this.jCheckBoxConAltoMaximoTablaTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRetencionFuenteIva.add(this.jComboBoxTiposArchivosReportesTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRetencionFuenteIva.add(this.jPanelParametrosAuxiliar1TipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoRetencionFuenteIva.add(this.jComboBoxTiposReportesTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);																		
			
			
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TipoRetencionFuenteIva.add(this.jComboBoxTiposGraficosReportesTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRetencionFuenteIva.add(this.jPanelParametrosAuxiliar4TipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRetencionFuenteIva.add(this.jComboBoxTiposReportesTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRetencionFuenteIva.add(this.jCheckBoxGenerarReporteTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRetencionFuenteIva.add(this.jPanelParametrosAuxiliar2TipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRetencionFuenteIva.add(this.jLabelAccionesTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
				this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoRetencionFuenteIva.add(this.jButtonAbrirOrderByTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRetencionFuenteIva.add(this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);			
			
			
			/*
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRetencionFuenteIva.add(this.jCheckBoxSeleccionarTodosTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRetencionFuenteIva.add(this.jCheckBoxConGraficoReporteTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRetencionFuenteIva.add(this.jCheckBoxSeleccionarTodosTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);															
				
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRetencionFuenteIva.add(this.jCheckBoxSeleccionadosTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);															
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRetencionFuenteIva.add(this.jCheckBoxConGraficoReporteTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRetencionFuenteIva.add(this.jPanelParametrosAuxiliar3TipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRetencionFuenteIva.add(this.jComboBoxTiposAccionesTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
	
				
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRetencionFuenteIva.add(this.jTextFieldValorCampoGeneralTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoRetencionFuenteIva = new GridBagLayout();

			this.jScrollPanelDatosTipoRetencionFuenteIva.setLayout(gridaBagLayoutDatosTipoRetencionFuenteIva);
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
			
			this.jScrollPanelDatosTipoRetencionFuenteIva.add(this.jTableDatosTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoRetencionFuenteIva.setViewportView(this.jTableDatosTipoRetencionFuenteIva);
		this.jTableDatosTipoRetencionFuenteIva.setFillsViewportHeight(true);
		this.jTableDatosTipoRetencionFuenteIva.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoRetencionFuenteIva= new GridBagLayout();
		this.jPanelAccionesTipoRetencionFuenteIva.setLayout(gridaBagLayoutAccionesTipoRetencionFuenteIva);
		
		
		/*	
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
			
		this.jPanelAccionesTipoRetencionFuenteIva.add(this.jButtonNuevoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoRetencionFuenteIva= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoRetencionFuenteIva.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoRetencionFuenteIva.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoRetencionFuenteIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoRetencionFuenteIva.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoRetencionFuenteIva.setLayout(gridaBagLayoutBusquedaPorCodigoTipoRetencionFuenteIva);

		gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
		jPanelBusquedaPorCodigoTipoRetencionFuenteIva.add(jLabelcodigoBusquedaPorCodigoTipoRetencionFuenteIva, gridBagConstraintsTipoRetencionFuenteIva);

		gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		gridBagConstraintsTipoRetencionFuenteIva.gridx = 1;
		jPanelBusquedaPorCodigoTipoRetencionFuenteIva.add(jTextFieldcodigoBusquedaPorCodigoTipoRetencionFuenteIva, gridBagConstraintsTipoRetencionFuenteIva);

		gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencionFuenteIva.gridy = 1;
		gridBagConstraintsTipoRetencionFuenteIva.gridx =1;
		jPanelBusquedaPorCodigoTipoRetencionFuenteIva.add(jButtonBusquedaPorCodigoTipoRetencionFuenteIva, gridBagConstraintsTipoRetencionFuenteIva);

		jTabbedPaneBusquedasTipoRetencionFuenteIva.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoRetencionFuenteIva);
		jTabbedPaneBusquedasTipoRetencionFuenteIva.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoRetencionFuenteIva= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoRetencionFuenteIva.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoRetencionFuenteIva.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoRetencionFuenteIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoRetencionFuenteIva.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoRetencionFuenteIva.setLayout(gridaBagLayoutBusquedaPorNombreTipoRetencionFuenteIva);

		gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
		jPanelBusquedaPorNombreTipoRetencionFuenteIva.add(jLabelnombreBusquedaPorNombreTipoRetencionFuenteIva, gridBagConstraintsTipoRetencionFuenteIva);

		gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		gridBagConstraintsTipoRetencionFuenteIva.gridx = 1;
		jPanelBusquedaPorNombreTipoRetencionFuenteIva.add(jTextAreanombreBusquedaPorNombreTipoRetencionFuenteIva, gridBagConstraintsTipoRetencionFuenteIva);

		gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencionFuenteIva.gridy = 1;
		gridBagConstraintsTipoRetencionFuenteIva.gridx =1;
		jPanelBusquedaPorNombreTipoRetencionFuenteIva.add(jButtonBusquedaPorNombreTipoRetencionFuenteIva, gridBagConstraintsTipoRetencionFuenteIva);

		jTabbedPaneBusquedasTipoRetencionFuenteIva.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoRetencionFuenteIva);
		jTabbedPaneBusquedasTipoRetencionFuenteIva.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPaisTipoRetencionFuenteIva= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTipoRetencionFuenteIva.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoRetencionFuenteIva.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoRetencionFuenteIva.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTipoRetencionFuenteIva.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTipoRetencionFuenteIva.setLayout(gridaBagLayoutFK_IdPaisTipoRetencionFuenteIva);

		gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
		jPanelFK_IdPaisTipoRetencionFuenteIva.add(jLabelid_paisFK_IdPaisTipoRetencionFuenteIva, gridBagConstraintsTipoRetencionFuenteIva);

		gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencionFuenteIva.gridy = 0;
		gridBagConstraintsTipoRetencionFuenteIva.gridx = 1;
		jPanelFK_IdPaisTipoRetencionFuenteIva.add(jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva, gridBagConstraintsTipoRetencionFuenteIva);

		gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencionFuenteIva.gridy = 1;
		gridBagConstraintsTipoRetencionFuenteIva.gridx =1;
		jPanelFK_IdPaisTipoRetencionFuenteIva.add(jButtonFK_IdPaisTipoRetencionFuenteIva, gridBagConstraintsTipoRetencionFuenteIva);

		jTabbedPaneBusquedasTipoRetencionFuenteIva.addTab("3.-Por Pais ", jPanelFK_IdPaisTipoRetencionFuenteIva);
		jTabbedPaneBusquedasTipoRetencionFuenteIva.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRetencionFuenteIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRetencionFuenteIva);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();						
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;		
			//this.gridBagConstraintsTipoRetencionFuenteIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;		
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoRetencionFuenteIva);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;		
			this.gridBagConstraintsTipoRetencionFuenteIva.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoRetencionFuenteIva.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);								
		
		
		/*
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		*/		
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx =0;
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRetencionFuenteIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
				
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoRetencionFuenteIvaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoRetencionFuenteIva= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRetencionFuenteIva = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoRetencionFuenteIva.setLayout(gridaBagLayoutBusquedasParametrosTipoRetencionFuenteIva);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoRetencionFuenteIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRetencionFuenteIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRetencionFuenteIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRetencionFuenteIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
			
			
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
			
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoRetencionFuenteIva;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoRetencionFuenteIva() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoRetencionFuenteIva = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoRetencionFuenteIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.setName("jPanelReporteDinamicoTipoRetencionFuenteIva"); 
		
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.setLayout(gridaBagLayoutReporteDinamicoTipoRetencionFuenteIva);
		
		
		this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoRetencionFuenteIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRetencionFuenteIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoRetencionFuenteIva.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRetencionFuenteIva.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRetencionFuenteIva.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion Fuente Ivas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoRetencionFuenteIva = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoRetencionFuenteIva.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jLabelColumnasSelectReporteTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoRetencionFuenteIva = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoRetencionFuenteIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoRetencionFuenteIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoRetencionFuenteIva.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRetencionFuenteIva.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRetencionFuenteIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoRetencionFuenteIva=new JScrollPane(this.jListColumnasSelectReporteTipoRetencionFuenteIva);
			
			this.jScrollColumnasSelectReporteTipoRetencionFuenteIva.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRetencionFuenteIva.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRetencionFuenteIva.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jListColumnasSelectReporteTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jScrollColumnasSelectReporteTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoRetencionFuenteIva = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoRetencionFuenteIva.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoRetencionFuenteIva = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoRetencionFuenteIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoRetencionFuenteIva.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoRetencionFuenteIva.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRetencionFuenteIva.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRetencionFuenteIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoRetencionFuenteIva=new JScrollPane(this.jListRelacionesSelectReporteTipoRetencionFuenteIva);
			
			this.jScrollRelacionesSelectReporteTipoRetencionFuenteIva.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRetencionFuenteIva.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRetencionFuenteIva.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoRetencionFuenteIva = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoRetencionFuenteIva = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoRetencionFuenteIva = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoRetencionFuenteIva = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoRetencionFuenteIva.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoRetencionFuenteIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRetencionFuenteIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRetencionFuenteIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoRetencionFuenteIva = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRetencionFuenteIva.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRetencionFuenteIva.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRetencionFuenteIva.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRetencionFuenteIva.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTipoRetencionFuenteIva = new JLabelMe();

		this.jLabelConGraficoDinamicoTipoRetencionFuenteIva.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jLabelConGraficoDinamicoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTipoRetencionFuenteIva = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTipoRetencionFuenteIva.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTipoRetencionFuenteIva.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTipoRetencionFuenteIva.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTipoRetencionFuenteIva.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTipoRetencionFuenteIva.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jCheckBoxConGraficoDinamicoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTipoRetencionFuenteIva = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTipoRetencionFuenteIva.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jLabelColumnaCategoriaGraficoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTipoRetencionFuenteIva = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTipoRetencionFuenteIva.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTipoRetencionFuenteIva.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTipoRetencionFuenteIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTipoRetencionFuenteIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTipoRetencionFuenteIva.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jComboBoxColumnaCategoriaGraficoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTipoRetencionFuenteIva = new JLabelMe();

		this.jLabelColumnaCategoriaValorTipoRetencionFuenteIva.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jLabelColumnaCategoriaValorTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTipoRetencionFuenteIva = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTipoRetencionFuenteIva.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTipoRetencionFuenteIva.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTipoRetencionFuenteIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTipoRetencionFuenteIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTipoRetencionFuenteIva.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jComboBoxColumnaCategoriaValorTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTipoRetencionFuenteIva = new JLabelMe();

		this.jLabelColumnasValoresGraficoTipoRetencionFuenteIva.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jLabelColumnasValoresGraficoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTipoRetencionFuenteIva = new JList<Reporte>();
		this.jListColumnasValoresGraficoTipoRetencionFuenteIva.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTipoRetencionFuenteIva.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTipoRetencionFuenteIva.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTipoRetencionFuenteIva.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTipoRetencionFuenteIva.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTipoRetencionFuenteIva=new JScrollPane(this.jListColumnasValoresGraficoTipoRetencionFuenteIva);
			
			this.jScrollColumnasValoresGraficoTipoRetencionFuenteIva.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTipoRetencionFuenteIva.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTipoRetencionFuenteIva.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jListColumnasSelectReporteTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jScrollColumnasValoresGraficoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTipoRetencionFuenteIva = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTipoRetencionFuenteIva.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jLabelTiposGraficosReportesDinamicoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTipoRetencionFuenteIva = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTipoRetencionFuenteIva.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTipoRetencionFuenteIva.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTipoRetencionFuenteIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTipoRetencionFuenteIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTipoRetencionFuenteIva.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jComboBoxTiposGraficosReportesDinamicoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoRetencionFuenteIva = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoRetencionFuenteIva.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jLabelGenerarExcelReporteDinamicoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoRetencionFuenteIva.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoRetencionFuenteIva,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoRetencionFuenteIva.setToolTipText("Generar EXCEL"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jButtonGenerarExcelReporteDinamicoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jComboBoxTiposReportesDinamicoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoRetencionFuenteIva = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoRetencionFuenteIva.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jLabelTiposArchivoReporteDinamicoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jComboBoxTiposArchivosReportesDinamicoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoRetencionFuenteIva.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoRetencionFuenteIva,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoRetencionFuenteIva.setToolTipText("Generar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jButtonGenerarReporteDinamicoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoRetencionFuenteIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoRetencionFuenteIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoRetencionFuenteIva.setToolTipText("Cancelar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRetencionFuenteIva.add(this.jButtonCerrarReporteDinamicoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoRetencionFuenteIva = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoRetencionFuenteIva= new JScrollPane(jPanelReporteDinamicoTipoRetencionFuenteIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoRetencionFuenteIva.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRetencionFuenteIva.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRetencionFuenteIva.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion Fuente Ivas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoRetencionFuenteIva);
		this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getContentPane().add(this.jScrollPanelReporteDinamicoTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoRetencionFuenteIva() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoRetencionFuenteIva = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoRetencionFuenteIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoRetencionFuenteIva.setName("jPanelImportacionTipoRetencionFuenteIva"); 
		
		this.jPanelImportacionTipoRetencionFuenteIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRetencionFuenteIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRetencionFuenteIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoRetencionFuenteIva.setLayout(gridaBagLayoutImportacionTipoRetencionFuenteIva);
		
		
		this.jInternalFrameImportacionTipoRetencionFuenteIva= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoRetencionFuenteIva= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoRetencionFuenteIva = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRetencionFuenteIva= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoRetencionFuenteIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRetencionFuenteIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRetencionFuenteIva.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoRetencionFuenteIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRetencionFuenteIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRetencionFuenteIva.setResizable(true);
	    this.jInternalFrameImportacionTipoRetencionFuenteIva.setClosable(true);
	    this.jInternalFrameImportacionTipoRetencionFuenteIva.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoRetencionFuenteIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRetencionFuenteIva.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRetencionFuenteIva.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoRetencionFuenteIva.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRetencionFuenteIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRetencionFuenteIva.setResizable(true);
	    this.jInternalFrameImportacionTipoRetencionFuenteIva.setClosable(true);
	    this.jInternalFrameImportacionTipoRetencionFuenteIva.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoRetencionFuenteIva.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRetencionFuenteIva.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRetencionFuenteIva.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion Fuente Ivas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoRetencionFuenteIva = new JLabelMe();

		this.jLabelArchivoImportacionTipoRetencionFuenteIva.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRetencionFuenteIva.add(this.jLabelArchivoImportacionTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoRetencionFuenteIva = new JFileChooser();		
		this.jFileChooserImportacionTipoRetencionFuenteIva.setToolTipText("ESCOGER ARCHIVO"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonAbrirImportacionTipoRetencionFuenteIva.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoRetencionFuenteIva,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoRetencionFuenteIva.setToolTipText("Generar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRetencionFuenteIva.add(this.jButtonAbrirImportacionTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoRetencionFuenteIva = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoRetencionFuenteIva.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoRetencionFuenteIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRetencionFuenteIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRetencionFuenteIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRetencionFuenteIva.add(this.jLabelPathArchivoImportacionTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoRetencionFuenteIva=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoRetencionFuenteIva.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRetencionFuenteIva.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRetencionFuenteIva.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRetencionFuenteIva.add(this.jTextFieldPathArchivoImportacionTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonGenerarImportacionTipoRetencionFuenteIva.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoRetencionFuenteIva,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoRetencionFuenteIva.setToolTipText("Generar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRetencionFuenteIva.add(this.jButtonGenerarImportacionTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoRetencionFuenteIva = new JButtonMe();
		this.jButtonCerrarImportacionTipoRetencionFuenteIva.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoRetencionFuenteIva,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoRetencionFuenteIva.setToolTipText("Cancelar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRetencionFuenteIva.add(this.jButtonCerrarImportacionTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoRetencionFuenteIva = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoRetencionFuenteIva= new JScrollPane(jPanelImportacionTipoRetencionFuenteIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionFuenteIva.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoRetencionFuenteIva.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoRetencionFuenteIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoRetencionFuenteIva.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoRetencionFuenteIva);
		this.jInternalFrameImportacionTipoRetencionFuenteIva.getContentPane().add(this.jScrollPanelImportacionTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoRetencionFuenteIva(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoRetencionFuenteIva = new JButtonMe();
			this.jButtonAbrirOrderByTipoRetencionFuenteIva.setText("Orden");
			this.jButtonAbrirOrderByTipoRetencionFuenteIva.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRetencionFuenteIva,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoRetencionFuenteIva";
			inputMap = this.jButtonAbrirOrderByTipoRetencionFuenteIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoRetencionFuenteIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoRetencionFuenteIva"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoRetencionFuenteIva = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoRetencionFuenteIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoRetencionFuenteIva.setName("jPanelOrderByTipoRetencionFuenteIva"); 
			
			this.jPanelOrderByTipoRetencionFuenteIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRetencionFuenteIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRetencionFuenteIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoRetencionFuenteIva.setLayout(gridaBagLayoutOrderByTipoRetencionFuenteIva);
			
			
			this.jTableDatosTipoRetencionFuenteIvaOrderBy = new JTableMe();        
			this.jTableDatosTipoRetencionFuenteIvaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoRetencionFuenteIvaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoRetencionFuenteIvaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoRetencionFuenteIvaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoRetencionFuenteIvaOrderBy.setViewportView(this.jTableDatosTipoRetencionFuenteIvaOrderBy);
			this.jTableDatosTipoRetencionFuenteIvaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoRetencionFuenteIvaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoRetencionFuenteIva= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoRetencionFuenteIva= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoRetencionFuenteIva = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoRetencionFuenteIva= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoRetencionFuenteIva.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoRetencionFuenteIva.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoRetencionFuenteIva.setTitle("Orden");
			this.jInternalFrameOrderByTipoRetencionFuenteIva.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoRetencionFuenteIva.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoRetencionFuenteIva.setResizable(true);
			this.jInternalFrameOrderByTipoRetencionFuenteIva.setClosable(true);
			this.jInternalFrameOrderByTipoRetencionFuenteIva.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoRetencionFuenteIva.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRetencionFuenteIva.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRetencionFuenteIva.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoRetencionFuenteIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion Fuente Ivas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoRetencionFuenteIva.ipady =150;
				
			this.jPanelOrderByTipoRetencionFuenteIva.add(jScrollPanelDatosTipoRetencionFuenteIvaOrderBy, this.gridBagConstraintsTipoRetencionFuenteIva);//this.jTableDatosTipoRetencionFuenteIvaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoRetencionFuenteIva = new JButtonMe();
			this.jButtonCerrarOrderByTipoRetencionFuenteIva.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoRetencionFuenteIva,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoRetencionFuenteIva.setToolTipText("Cancelar"+" "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoRetencionFuenteIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoRetencionFuenteIva.add(this.jButtonCerrarOrderByTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoRetencionFuenteIva = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoRetencionFuenteIva= new JScrollPane(jPanelOrderByTipoRetencionFuenteIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoRetencionFuenteIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionFuenteIva.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoRetencionFuenteIva.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRetencionFuenteIva.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoRetencionFuenteIva.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoRetencionFuenteIva.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoRetencionFuenteIva);
			
			this.jInternalFrameOrderByTipoRetencionFuenteIva.getContentPane().add(this.jScrollPanelOrderByTipoRetencionFuenteIva, this.gridBagConstraintsTipoRetencionFuenteIva);			
		
		} else {
			this.jButtonAbrirOrderByTipoRetencionFuenteIva = new JButtonMe();
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
		int iWidthTableCalculado=0;//2730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1430;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoRetencionFuenteIva.getRowHeight();//TipoRetencionFuenteIvaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoRetencionFuenteIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRetencionFuenteIva.isSelected()) {
					iHeightTable=TipoRetencionFuenteIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRetencionFuenteIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRetencionFuenteIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoRetencionFuenteIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRetencionFuenteIva.isSelected()) {
					iHeightTable=TipoRetencionFuenteIvaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRetencionFuenteIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRetencionFuenteIvaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoRetencionFuenteIva.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRetencionFuenteIva.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRetencionFuenteIva.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoRetencionFuenteIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRetencionFuenteIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRetencionFuenteIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoRetencionFuenteIva!=null && this.jInternalFrameOrderByTipoRetencionFuenteIva.getjTableDatosOrderBy()!=null) {
			//if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoRetencionFuenteIva.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoRetencionFuenteIva.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoRetencionFuenteIva.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoRetencionFuenteIva.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoRetencionFuenteIva.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoRetencionFuenteIva.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoRetencionFuenteIva.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoRetencionFuenteIva.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRetencionFuenteIva.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRetencionFuenteIva.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporetencionfuenteivas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoRetencionFuenteIva> TraerTipoRetencionFuenteIvaBeans(List<TipoRetencionFuenteIva> tiporetencionfuenteivas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoRetencionFuenteIva tiporetencionfuenteiva:tiporetencionfuenteivas) {
					
				if(!(TipoRetencionFuenteIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoRetencionFuenteIvaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiporetencionfuenteiva.setsDetalleGeneralEntityReporte(TipoRetencionFuenteIvaConstantesFunciones.getTipoRetencionFuenteIvaDescripcion(tiporetencionfuenteiva));
										
					tiporetencionfuenteiva.setes_retencion_iva_descripcion(TipoRetencionFuenteIvaConstantesFunciones.getes_retencion_ivaDescripcion(tiporetencionfuenteiva));tiporetencionfuenteiva.setes_debito_descripcion(TipoRetencionFuenteIvaConstantesFunciones.getes_debitoDescripcion(tiporetencionfuenteiva));tiporetencionfuenteiva.setes_con_iva_factura_descripcion(TipoRetencionFuenteIvaConstantesFunciones.getes_con_iva_facturaDescripcion(tiporetencionfuenteiva));tiporetencionfuenteiva.setes_con_sub_total_factura_descripcion(TipoRetencionFuenteIvaConstantesFunciones.getes_con_sub_total_facturaDescripcion(tiporetencionfuenteiva));tiporetencionfuenteiva.setes_con_secuencial_descripcion(TipoRetencionFuenteIvaConstantesFunciones.getes_con_secuencialDescripcion(tiporetencionfuenteiva));	
					
						
					
				} else  {
							
					//tiporetencionfuenteiva.setsDetalleGeneralEntityReporte(tiporetencionfuenteiva.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiporetencionfuenteivabeans.add(tiporetencionfuenteivabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiporetencionfuenteivas;
    }
	//PARA REPORTES FIN
}
