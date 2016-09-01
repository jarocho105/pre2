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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.contabilidad.util.TipoDocumentoConstantesFunciones;

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
public class TipoDocumentoJInternalFrame extends TipoDocumentoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoDocumento;
	
	protected JMenuBar jmenuBarTipoDocumento;
	
	protected JMenu jmenuTipoDocumento;
	protected JMenu jmenuDatosTipoDocumento;
	protected JMenu jmenuArchivoTipoDocumento;
	protected JMenu jmenuAccionesTipoDocumento;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDocumento;	
	protected GridBagConstraints gridBagConstraintsTipoDocumento;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoDocumentoDetalleFormJInternalFrame jInternalFrameDetalleFormTipoDocumento;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoDocumento;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoDocumento;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimientomodulo="";
	
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoDocumento> tipodocumentos;		
	public List<TipoDocumento> tipodocumentosEliminados;	
	public List<TipoDocumento> tipodocumentosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoDocumento;		
	protected JButton jButtonAbrirOrderByTipoDocumento;
	
	
	//protected JPanel jPanelOrderByTipoDocumento;
	//public JScrollPane jScrollPanelOrderByTipoDocumento;	
	//protected JButton jButtonCerrarOrderByTipoDocumento;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoDocumentoLogic tipodocumentoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoDocumento;
	public JScrollPane jScrollPanelDatosEdicionTipoDocumento;
	public JScrollPane jScrollPanelDatosGeneralTipoDocumento;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoDocumentoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoDocumento;
	//public JScrollPane jScrollPanelImportacionTipoDocumento;
	
	
	
	protected JPanel jPanelAccionesTipoDocumento;
	
    protected JPanel jPanelPaginacionTipoDocumento;
    protected JPanel jPanelParametrosReportesTipoDocumento;
	protected JPanel jPanelParametrosReportesAccionesTipoDocumento;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoDocumento;
	protected JPanel jPanelParametrosAuxiliar2TipoDocumento;
	protected JPanel jPanelParametrosAuxiliar3TipoDocumento;
	protected JPanel jPanelParametrosAuxiliar4TipoDocumento;
	//protected JPanel jPanelParametrosAuxiliar5TipoDocumento;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoDocumento;
	//protected JPanel jPanelImportacionTipoDocumento;
	
	
	public JTable jTableDatosTipoDocumento;
	
	
	
	//public JTable jTableDatosTipoDocumentoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoDocumento;
	protected JButton jButtonDuplicarTipoDocumento;
	protected JButton jButtonCopiarTipoDocumento;
	protected JButton jButtonVerFormTipoDocumento;
	protected JButton jButtonNuevoRelacionesTipoDocumento;
	protected JButton jButtonModificarTipoDocumento;
	
    protected JButton jButtonGuardarCambiosTablaTipoDocumento;
	protected JButton jButtonCerrarTipoDocumento;
	
	
	protected JButton jButtonRecargarInformacionTipoDocumento;
	protected JButton jButtonProcesarInformacionTipoDocumento;
	
	
	protected JButton jButtonAnterioresTipoDocumento;
	protected JButton jButtonSiguientesTipoDocumento;
	protected JButton jButtonNuevoGuardarCambiosTipoDocumento;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoDocumento;
	//protected JButton jButtonCerrarReporteDinamicoTipoDocumento;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoDocumento;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoDocumento;
	//protected JButton jButtonGenerarImportacionTipoDocumento;
	//protected JButton jButtonCerrarImportacionTipoDocumento;
	//protected JFileChooser jFileChooserImportacionTipoDocumento;
	//protected File fileImportacionTipoDocumento;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDocumento;
	protected JButton jButtonDuplicarToolBarTipoDocumento;
	protected JButton jButtonNuevoRelacionesToolBarTipoDocumento;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoDocumento;
	protected JButton jButtonCopiarToolBarTipoDocumento;
	protected JButton jButtonVerFormToolBarTipoDocumento;
	public JButton jButtonGuardarCambiosTablaToolBarTipoDocumento;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDocumento;
	protected JButton jButtonCerrarToolBarTipoDocumento;
	
	protected JButton jButtonRecargarInformacionToolBarTipoDocumento;
	protected JButton jButtonProcesarInformacionToolBarTipoDocumento;
	protected JButton jButtonAnterioresToolBarTipoDocumento;
	protected JButton jButtonSiguientesToolBarTipoDocumento;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoDocumento;
	protected JButton jButtonAbrirOrderByToolBarTipoDocumento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDocumento;
	protected JMenuItem jMenuItemDuplicarTipoDocumento;
	protected JMenuItem jMenuItemNuevoRelacionesTipoDocumento;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoDocumento;
	protected JMenuItem jMenuItemCopiarTipoDocumento;
	protected JMenuItem jMenuItemVerFormTipoDocumento;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDocumento;
	protected JMenuItem jMenuItemCerrarTipoDocumento;
	protected JMenuItem jMenuItemDetalleCerrarTipoDocumento;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoDocumento;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDocumento;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoDocumento;
	protected JMenuItem jMenuItemProcesarInformacionTipoDocumento;
	protected JMenuItem jMenuItemAnterioresTipoDocumento;
	protected JMenuItem jMenuItemSiguientesTipoDocumento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDocumento;
	protected JMenuItem jMenuItemAbrirOrderByTipoDocumento;
	protected JMenuItem jMenuItemMostrarOcultarTipoDocumento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDocumento;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoDocumento;
	protected JCheckBox jCheckBoxSeleccionadosTipoDocumento;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoDocumento;
	protected JCheckBox jCheckBoxConGraficoReporteTipoDocumento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoDocumento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoDocumento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDocumento;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoDocumento;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoDocumento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoDocumento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDocumento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDocumento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoDocumento;
	protected JTextField jTextFieldValorCampoGeneralTipoDocumento;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoDocumento;
	//public JList<Reporte> jListColumnasSelectReporteTipoDocumento;
	//public JScrollPane jScrollColumnasSelectReporteTipoDocumento;
	
	//public JLabel jLabelRelacionesSelectReporteTipoDocumento;
	//public JList<Reporte> jListRelacionesSelectReporteTipoDocumento;
	//public JScrollPane jScrollRelacionesSelectReporteTipoDocumento;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoDocumento;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoDocumento;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoDocumento;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoDocumento;
	
		
	//public JLabel jLabelArchivoImportacionTipoDocumento;	
	//public JLabel jLabelPathArchivoImportacionTipoDocumento;
	//protected JTextField jTextFieldPathArchivoImportacionTipoDocumento;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoDocumento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoDocumento;
	
	//public JLabel jLabelColumnaCategoriaValorTipoDocumento;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoDocumento;
	
	//public JLabel jLabelColumnasValoresGraficoTipoDocumento;
	//public JList<Reporte> jListColumnasValoresGraficoTipoDocumento;
	//public JScrollPane jScrollColumnasValoresGraficoTipoDocumento;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoDocumento;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoDocumento;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoDocumento;
	public JPanel jPanelBusquedaPorCodigoTipoDocumento;
	public JButton jButtonBusquedaPorCodigoTipoDocumento;
	public JPanel jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento;
	public JButton jButtonBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento;
	public JPanel jPanelBusquedaPorNombreTipoDocumento;
	public JButton jButtonBusquedaPorNombreTipoDocumento;
	public JPanel jPanelFK_IdModuloTipoDocumento;
	public JButton jButtonFK_IdModuloTipoDocumento;
	public JPanel jPanelFK_IdTipoMovimientoTipoDocumento;
	public JButton jButtonFK_IdTipoMovimientoTipoDocumento;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoDocumento;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoDocumento;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoDocumento;
	public JButton jButtoncodigoBusquedaPorCodigoTipoDocumentoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento;
	public JLabel jLabelid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento;
	public JButton jButtonid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumentoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento;
	public JLabel jLabelid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento;
	public JButton jButtonid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumentoBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoDocumento;
	public JLabel jLabelnombreBusquedaPorNombreTipoDocumento;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoDocumento;
	public JButton jButtonnombreBusquedaPorNombreTipoDocumentoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloFK_IdModuloTipoDocumento;
	public JLabel jLabelid_moduloFK_IdModuloTipoDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloFK_IdModuloTipoDocumento;
	public JButton jButtonid_moduloFK_IdModuloTipoDocumento= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloTipoDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_moduloFK_IdModuloTipoDocumentoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento;
	public JLabel jLabelid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento;
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoTipoDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoTipoDocumentoBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoDocumentoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDocumentoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoDocumento)	{
		this.jButtonRecargarInformacionTipoDocumento = jButtonRecargarInformacionTipoDocumento;
	}
	
	public JButton getjButtonProcesarInformacionTipoDocumento() {
		return this.jButtonProcesarInformacionTipoDocumento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDocumento)	{
		this.jButtonProcesarInformacionTipoDocumento = jButtonProcesarInformacionTipoDocumento;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoDocumento() {
		return this.jButtonRecargarInformacionTipoDocumento;
	}
	
	
	public List<TipoDocumento> gettipodocumentos() {
		return this.tipodocumentos;
	}

	public void settipodocumentos(List<TipoDocumento> tipodocumentos) {
		this.tipodocumentos = tipodocumentos;
	}
	
	public List<TipoDocumento> gettipodocumentosAux() {
		return this.tipodocumentosAux;
	}

	public void settipodocumentosAux(List<TipoDocumento> tipodocumentosAux) {
		this.tipodocumentosAux = tipodocumentosAux;
	}
	
	public List<TipoDocumento> gettipodocumentosEliminados() {
		return this.tipodocumentosEliminados;
	}

	public void setTipoDocumentosEliminados(List<TipoDocumento> tipodocumentosEliminados) {
		this.tipodocumentosEliminados = tipodocumentosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoDocumento() {
		return jComboBoxTiposSeleccionarTipoDocumento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoDocumento(
			JComboBox jComboBoxTiposSeleccionarTipoDocumento) {
		this.jComboBoxTiposSeleccionarTipoDocumento = jComboBoxTiposSeleccionarTipoDocumento;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoDocumento .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoDocumento() {
		return jTextFieldValorCampoGeneralTipoDocumento;
	}

	public void setjTextFieldValorCampoGeneralTipoDocumento(
			JTextField jTextFieldValorCampoGeneralTipoDocumento) {
		this.jTextFieldValorCampoGeneralTipoDocumento = jTextFieldValorCampoGeneralTipoDocumento;
	}

	public void setBorderResaltarValorCampoGeneralTipoDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumento.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoDocumento .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoDocumento() {
		return this.jCheckBoxSeleccionarTodosTipoDocumento;
	}

	public void setjCheckBoxSeleccionarTodosTipoDocumento(
			JCheckBox jCheckBoxSeleccionarTodosTipoDocumento) {
		this.jCheckBoxSeleccionarTodosTipoDocumento = jCheckBoxSeleccionarTodosTipoDocumento;
	}

	public void setBorderResaltarSeleccionarTodosTipoDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoDocumento .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoDocumento() {
		return this.jCheckBoxSeleccionadosTipoDocumento;
	}

	public void setjCheckBoxSeleccionadosTipoDocumento(
			JCheckBox jCheckBoxSeleccionadosTipoDocumento) {
		this.jCheckBoxSeleccionadosTipoDocumento = jCheckBoxSeleccionadosTipoDocumento;
	}
	
	public void setBorderResaltarSeleccionadosTipoDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumento.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoDocumento .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoDocumento() {
		return this.jComboBoxTiposArchivosReportesTipoDocumento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoDocumento(
			JComboBox jComboBoxTiposArchivosReportesTipoDocumento) {
		this.jComboBoxTiposArchivosReportesTipoDocumento = jComboBoxTiposArchivosReportesTipoDocumento;
	}

	public void setBorderResaltarTiposArchivosReportesTipoDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoDocumento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoDocumento() {
		return this.jComboBoxTiposReportesTipoDocumento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoDocumento(
			JComboBox jComboBoxTiposReportesTipoDocumento) {
		this.jComboBoxTiposReportesTipoDocumento = jComboBoxTiposReportesTipoDocumento;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoDocumento() {
	//	return jComboBoxTiposReportesDinamicoTipoDocumento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoDocumento(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoDocumento) {
	//	this.jComboBoxTiposReportesDinamicoTipoDocumento = jComboBoxTiposReportesDinamicoTipoDocumento;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoDocumento() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoDocumento;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoDocumento(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoDocumento) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoDocumento = jComboBoxTiposArchivosReportesDinamicoTipoDocumento;
	//}
	
	public void setBorderResaltarTiposReportesTipoDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoDocumento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoDocumento() {
		return this.jComboBoxTiposGraficosReportesTipoDocumento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoDocumento(
			JComboBox jComboBoxTiposGraficosReportesTipoDocumento) {
		this.jComboBoxTiposGraficosReportesTipoDocumento = jComboBoxTiposGraficosReportesTipoDocumento;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoDocumento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoDocumento() {
		return this.jComboBoxTiposPaginacionTipoDocumento;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoDocumento(
			JComboBox jComboBoxTiposPaginacionTipoDocumento) {
		this.jComboBoxTiposPaginacionTipoDocumento = jComboBoxTiposPaginacionTipoDocumento;
	}
	
	public void setBorderResaltarTiposPaginacionTipoDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoDocumento .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoDocumento() {
		return this.jComboBoxTiposRelacionesTipoDocumento;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDocumento() {
		return this.jComboBoxTiposAccionesTipoDocumento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDocumento(
			JComboBox jComboBoxTiposRelacionesTipoDocumento) {
		this.jComboBoxTiposRelacionesTipoDocumento = jComboBoxTiposRelacionesTipoDocumento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDocumento(
			JComboBox jComboBoxTiposAccionesTipoDocumento) {
		this.jComboBoxTiposAccionesTipoDocumento = jComboBoxTiposAccionesTipoDocumento;
	}
	
	public void setBorderResaltarTiposRelacionesTipoDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoDocumento .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoDocumento() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoDocumento.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoDocumento .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoDocumento() {
	//	return jCheckBoxConGraficoDinamicoTipoDocumento;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoDocumento(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoDocumento) {
	//	this.jCheckBoxConGraficoDinamicoTipoDocumento = jCheckBoxConGraficoDinamicoTipoDocumento;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoDocumento() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoDocumento.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoDocumento .setBorder(borderResaltar);		
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
		this.tipodocumentoSessionBean=new TipoDocumentoSessionBean();
		
		this.tipodocumentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodocumentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodocumentoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDocumentoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Documento MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoDocumentoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoDocumento= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoDocumento,this.jTtoolBarTipoDocumento,
							"nuevo","nuevo","Nuevo"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoDocumento,this.jTtoolBarTipoDocumento,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoDocumento,this.jTtoolBarTipoDocumento,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoDocumento,this.jTtoolBarTipoDocumento,
							"duplicar","duplicar","Duplicar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoDocumento,this.jTtoolBarTipoDocumento,
							"copiar","copiar","Copiar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoDocumento,this.jTtoolBarTipoDocumento,
							"ver_form","ver_form","Ver"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDocumento,this.jTtoolBarTipoDocumento,
							"recargar","recargar","Recargar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDocumento,this.jTtoolBarTipoDocumento,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoDocumento,this.jTtoolBarTipoDocumento,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoDocumento,this.jTtoolBarTipoDocumento,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoDocumento,this.jTtoolBarTipoDocumento,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoDocumento,this.jTtoolBarTipoDocumento,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoDocumento,this.jTtoolBarTipoDocumento,
							"cerrar","cerrar","Salir"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoDocumento=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoDocumento;
			
				this.jButtonProcesarInformacionToolBarTipoDocumento=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoDocumento;
				
		//protected JButton jButtonModificarToolBarTipoDocumento;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoDocumento=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoDocumento=new JMenuMe("General");
		this.jmenuArchivoTipoDocumento=new JMenuMe("Archivo");
		this.jmenuAccionesTipoDocumento=new JMenuMe("Acciones");
		this.jmenuDatosTipoDocumento=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDocumento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDocumento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDocumento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoDocumento= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoDocumento.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoDocumento,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoDocumento= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoDocumento.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoDocumento,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoDocumento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDocumento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDocumento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoDocumento= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoDocumento.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoDocumento,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoDocumento= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoDocumento.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoDocumento,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoDocumento= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoDocumento.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoDocumento,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDocumento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDocumento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDocumento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoDocumento= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoDocumento.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoDocumento,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoDocumento= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoDocumento.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoDocumento,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoDocumento= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoDocumento.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoDocumento,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoDocumento= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoDocumento.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoDocumento,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoDocumento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoDocumento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoDocumento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDocumento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDocumento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDocumento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoDocumento= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoDocumento.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoDocumento,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDocumento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDocumento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDocumento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoDocumento= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoDocumento.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoDocumento,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoDocumento.add(this.jMenuItemCerrarTipoDocumento);
			
			this.jmenuAccionesTipoDocumento.add(this.jMenuItemNuevoTipoDocumento);
			this.jmenuAccionesTipoDocumento.add(this.jMenuItemNuevoGuardarCambiosTipoDocumento);
			this.jmenuAccionesTipoDocumento.add(this.jMenuItemNuevoRelacionesTipoDocumento);
			this.jmenuAccionesTipoDocumento.add(this.jMenuItemGuardarCambiosTablaTipoDocumento);		
			this.jmenuAccionesTipoDocumento.add(this.jMenuItemDuplicarTipoDocumento);		
			this.jmenuAccionesTipoDocumento.add(this.jMenuItemCopiarTipoDocumento);		
			this.jmenuAccionesTipoDocumento.add(this.jMenuItemVerFormTipoDocumento);		
			
			this.jmenuDatosTipoDocumento.add(this.jMenuItemRecargarInformacionTipoDocumento);				
			this.jmenuDatosTipoDocumento.add(this.jMenuItemAnterioresTipoDocumento);				
			this.jmenuDatosTipoDocumento.add(this.jMenuItemSiguientesTipoDocumento);				
			this.jmenuDatosTipoDocumento.add(this.jMenuItemAbrirOrderByTipoDocumento);				
			this.jmenuDatosTipoDocumento.add(this.jMenuItemMostrarOcultarTipoDocumento);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoDocumento.add(this.jMenuItemGuardarCambiosTipoDocumento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoDocumento.add(this.jmenuArchivoTipoDocumento);		
			this.jmenuBarTipoDocumento.add(this.jmenuAccionesTipoDocumento);		
			this.jmenuBarTipoDocumento.add(this.jmenuDatosTipoDocumento);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoDocumento);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoDocumento() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoDocumento.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoDocumento= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoDocumento.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoDocumento.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoDocumento,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoDocumento = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoDocumento.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoDocumento.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoDocumento,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoDocumento= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoDocumento,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setToolTipText("Buscar Por Modulo Por Tipo Movimiento Modulo ");
		this.jButtonBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento= new JButtonMe();
		this.jButtonBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setText("Buscar");
		this.jButtonBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setToolTipText("Buscar Por Modulo Por Tipo Movimiento Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento,"buscar_button","Buscar Por Modulo Por Tipo Movimiento Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento = new JLabelMe();
		jLabelid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setText("Modulo :");
		jLabelid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setToolTipText("Modulo");
		jLabelid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento= new JComboBoxMe();
		jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento,STIPO_TAMANIO_GENERAL,false,true,this);



	
		jLabelid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento = new JLabelMe();
		jLabelid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setText("Tipo Movimiento Modulo :");
		jLabelid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setToolTipText("Tipo Movimiento Modulo");
		jLabelid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento= new JComboBoxMe();
		jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoDocumento.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoDocumento= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoDocumento.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoDocumento.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoDocumento,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoDocumento = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoDocumento.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoDocumento.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoDocumento,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoDocumento= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoDocumento,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdModuloTipoDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdModuloTipoDocumento.setToolTipText("Buscar Por Modulo ");
		this.jButtonFK_IdModuloTipoDocumento= new JButtonMe();
		this.jButtonFK_IdModuloTipoDocumento.setText("Buscar");
		this.jButtonFK_IdModuloTipoDocumento.setToolTipText("Buscar Por Modulo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdModuloTipoDocumento,"buscar_button","Buscar Por Modulo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdModuloTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_moduloFK_IdModuloTipoDocumento = new JLabelMe();
		jLabelid_moduloFK_IdModuloTipoDocumento.setText("Modulo :");
		jLabelid_moduloFK_IdModuloTipoDocumento.setToolTipText("Modulo");
		jLabelid_moduloFK_IdModuloTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_moduloFK_IdModuloTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_moduloFK_IdModuloTipoDocumento,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_moduloFK_IdModuloTipoDocumento= new JComboBoxMe();
		jComboBoxid_moduloFK_IdModuloTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFK_IdModuloTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloFK_IdModuloTipoDocumento,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMovimientoTipoDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMovimientoTipoDocumento.setToolTipText("Buscar Por Tipo Movimiento ");
		this.jButtonFK_IdTipoMovimientoTipoDocumento= new JButtonMe();
		this.jButtonFK_IdTipoMovimientoTipoDocumento.setText("Buscar");
		this.jButtonFK_IdTipoMovimientoTipoDocumento.setToolTipText("Buscar Por Tipo Movimiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMovimientoTipoDocumento,"buscar_button","Buscar Por Tipo Movimiento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMovimientoTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento = new JLabelMe();
		jLabelid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.setText("Tipo Movimiento :");
		jLabelid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.setToolTipText("Tipo Movimiento");
		jLabelid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento= new JComboBoxMe();
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoDocumento=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoDocumento.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDocumento.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoDocumento.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoDocumento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoDocumento,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoDocumento = new TipoDocumentoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Documento DATOS");
			this.jInternalFrameDetalleFormTipoDocumento = new TipoDocumentoDetalleFormJInternalFrame(jDesktopPane,this.tipodocumentoSessionBean.getConGuardarRelaciones(),this.tipodocumentoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoDocumento = null;//new TipoDocumentoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDocumento= new GridBagLayout();
		
		
		this.jTableDatosTipoDocumento = new JTableMe();      
		
		String sToolTipTipoDocumento="";
		sToolTipTipoDocumento=TipoDocumentoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDocumento+="(Contabilidad.TipoDocumento)";
		}
		
		if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDocumento+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoDocumento.setToolTipText(sToolTipTipoDocumento);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoDocumento);
		this.jTableDatosTipoDocumento.setAutoCreateRowSorter(true);
		this.jTableDatosTipoDocumento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoDocumento.setRowSelectionAllowed(true);
		this.jTableDatosTipoDocumento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoDocumento,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoDocumento = new JButtonMe();
		this.jButtonDuplicarTipoDocumento = new JButtonMe();
		this.jButtonCopiarTipoDocumento = new JButtonMe();
		this.jButtonVerFormTipoDocumento = new JButtonMe();
		this.jButtonNuevoRelacionesTipoDocumento = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoDocumento = new JButtonMe();
		this.jButtonCerrarTipoDocumento = new JButtonMe();
		
		this.jScrollPanelDatosTipoDocumento = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoDocumento = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Documento";
		
		if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documentos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDocumento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDocumento.setToolTipText("Acciones");
        this.jPanelAccionesTipoDocumento.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoDocumento=new ReporteDinamicoJInternalFrame(TipoDocumentoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoDocumento();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoDocumento=new ImportacionJInternalFrame(TipoDocumentoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoDocumento();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoDocumento = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoDocumento.setText("Orden");
		this.jButtonAbrirOrderByTipoDocumento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDocumento,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDocumento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDocumento,false,this);
			
			//this.cargarOrderByTipoDocumento(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoDocumento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDocumento,true,this);
			
			//this.cargarOrderByTipoDocumento(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoDocumento.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosTipoDocumento.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosTipoDocumento.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosTipoDocumento.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDocumento.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoDocumento.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoDocumento.setText("Nuevo");
		this.jButtonDuplicarTipoDocumento.setText("Duplicar");
		this.jButtonCopiarTipoDocumento.setText("Copiar");
		this.jButtonVerFormTipoDocumento.setText("Ver");
		this.jButtonNuevoRelacionesTipoDocumento.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoDocumento.setText("Guardar");
		this.jButtonCerrarTipoDocumento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDocumento,"nuevo_button","Nuevo",this.tipodocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoDocumento,"duplicar_button","Duplicar",this.tipodocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoDocumento,"copiar_button","Copiar",this.tipodocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoDocumento,"ver_form","Ver",this.tipodocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoDocumento,"nuevorelaciones_button","Nuevo Rel",this.tipodocumentoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDocumento,"guardarcambiostabla_button","Guardar",this.tipodocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDocumento,"cerrar_button","Salir",this.tipodocumentoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoDocumento.setToolTipText("Nuevo"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoDocumento.setToolTipText("Duplicar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoDocumento.setToolTipText("Copiar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoDocumento.setToolTipText("Ver"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoDocumento.setToolTipText("Nuevo Rel"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoDocumento.setToolTipText("Guardar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDocumento.setToolTipText("Salir"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDocumento";
		inputMap = this.jButtonNuevoTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDocumento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDocumento"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoDocumento";
		inputMap = this.jButtonDuplicarTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoDocumento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoDocumento"));
		
		//COPIAR
		sMapKey = "CopiarTipoDocumento";
		inputMap = this.jButtonCopiarTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoDocumento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoDocumento"));
		
		//VEr FORM
		sMapKey = "VerFormTipoDocumento";
		inputMap = this.jButtonVerFormTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoDocumento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoDocumento"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoDocumento";
		inputMap = this.jButtonNuevoRelacionesTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoDocumento"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoDocumento";
		inputMap = this.jButtonModificarTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoDocumento"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoDocumento";
		inputMap = this.jButtonCerrarTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDocumento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDocumento";
		inputMap = this.jButtonGuardarCambiosTablaTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDocumento"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoDocumento.setName("jPanelParametrosReportesTipoDocumento"); 
		
		this.jPanelParametrosReportesAccionesTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoDocumento.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoDocumento.setName("jPanelParametrosReportesAccionesTipoDocumento"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoDocumento = new JButtonMe();
		this.jButtonRecargarInformacionTipoDocumento.setText("Recargar");
		this.jButtonRecargarInformacionTipoDocumento.setToolTipText("Recargar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoDocumento,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoDocumento = new JButtonMe();
		this.jButtonProcesarInformacionTipoDocumento.setText("Procesar");
		this.jButtonProcesarInformacionTipoDocumento.setToolTipText("Procesar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoDocumento.setVisible(false);
			
		this.jButtonProcesarInformacionTipoDocumento.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDocumento.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoDocumento.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoDocumento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDocumento.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoDocumento.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoDocumento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDocumento.setText("TIPO");       
		this.jComboBoxTiposReportesTipoDocumento.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoDocumento = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoDocumento.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoDocumento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoDocumento = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoDocumento.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoDocumento.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoDocumento = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoDocumento.setText("Accion");
		this.jComboBoxTiposRelacionesTipoDocumento.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoDocumento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDocumento.setText("Accion");
		this.jComboBoxTiposAccionesTipoDocumento.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoDocumento = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoDocumento.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoDocumento.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoDocumento=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoDocumento.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDocumento.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoDocumento.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoDocumento = new JLabelMe();
		
		this.jLabelAccionesTipoDocumento.setText("Acciones");		
		this.jLabelAccionesTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoDocumento = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoDocumento.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoDocumento.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoDocumento = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoDocumento.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoDocumento.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoDocumento = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoDocumento.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoDocumento.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoDocumento = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoDocumento.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoDocumento.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoDocumento = new JButtonMe();
		//this.jButtonAnterioresTipoDocumento.setText("<<");
        this.jButtonAnterioresTipoDocumento.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoDocumento,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoDocumento = new JButtonMe();
		//this.jButtonSiguientesTipoDocumento.setText(">>");
        this.jButtonSiguientesTipoDocumento.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoDocumento,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoDocumento = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoDocumento.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoDocumento.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoDocumento,"nuevoguardarcambios_button","Nue",this.tipodocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoDocumento";
		inputMap = this.jButtonNuevoGuardarCambiosTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoDocumento"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoDocumento";
		inputMap = this.jButtonRecargarInformacionTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoDocumento"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoDocumento";
		inputMap = this.jButtonSiguientesTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoDocumento"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoDocumento";
		inputMap = this.jButtonAnterioresTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoDocumento"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoDocumento();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoDocumento.setMinimumSize(new Dimension(this.getWidth(),TipoDocumentoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDocumentoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDocumento.setMaximumSize(new Dimension(this.getWidth(),TipoDocumentoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDocumentoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoDocumento.setPreferredSize(new Dimension(this.getWidth(),TipoDocumentoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoDocumentoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoDocumento = new GridBagLayout();

			this.jPanelPaginacionTipoDocumento.setLayout(gridaBagLayoutPaginacionTipoDocumento);						
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.gridy = 0;
			this.gridBagConstraintsTipoDocumento.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoDocumento.add(this.jButtonAnterioresTipoDocumento, this.gridBagConstraintsTipoDocumento);
					
						
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDocumento.gridy = 0;
			
			this.jPanelPaginacionTipoDocumento.add(this.jButtonNuevoGuardarCambiosTipoDocumento, this.gridBagConstraintsTipoDocumento);
						
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoDocumento.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoDocumento.gridy = 0;
			this.jPanelPaginacionTipoDocumento.add(this.jButtonSiguientesTipoDocumento, this.gridBagConstraintsTipoDocumento);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.gridy = 1;
			this.gridBagConstraintsTipoDocumento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDocumento.add(this.jButtonNuevoTipoDocumento, this.gridBagConstraintsTipoDocumento);
						
			
			
			if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
				this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoDocumento.gridy = 1;
				this.gridBagConstraintsTipoDocumento.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoDocumento.add(this.jButtonGuardarCambiosTablaTipoDocumento, this.gridBagConstraintsTipoDocumento);
			}
			
			
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.gridy = 1;
			this.gridBagConstraintsTipoDocumento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDocumento.add(this.jButtonDuplicarTipoDocumento, this.gridBagConstraintsTipoDocumento);
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.gridy = 1;
			this.gridBagConstraintsTipoDocumento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDocumento.add(this.jButtonCopiarTipoDocumento, this.gridBagConstraintsTipoDocumento);
		
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.gridy = 1;
			this.gridBagConstraintsTipoDocumento.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoDocumento.add(this.jButtonVerFormTipoDocumento, this.gridBagConstraintsTipoDocumento);
		
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.gridy = 1;
			this.gridBagConstraintsTipoDocumento.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoDocumento.add(this.jButtonCerrarTipoDocumento, this.gridBagConstraintsTipoDocumento);
		
		
		
		this.jButtonRecargarInformacionTipoDocumento.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDocumento.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoDocumento.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoDocumento.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDocumento.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoDocumento.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoDocumento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDocumento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoDocumento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoDocumento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDocumento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoDocumento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoDocumento.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDocumento.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoDocumento.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoDocumento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDocumento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoDocumento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoDocumento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDocumento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDocumento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoDocumento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDocumento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoDocumento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoDocumento.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDocumento.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoDocumento.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoDocumento.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDocumento.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoDocumento.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoDocumento.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDocumento.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoDocumento.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoDocumento.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDocumento.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoDocumento.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoDocumento = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoDocumento = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoDocumento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoDocumento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoDocumento = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoDocumento = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoDocumento.setLayout(gridaBagParametrosReportesTipoDocumento);
			this.jPanelParametrosReportesAccionesTipoDocumento.setLayout(gridaBagParametrosReportesAccionesTipoDocumento);
			
			
			this.jPanelParametrosAuxiliar1TipoDocumento.setLayout(gridaBagParametrosAuxiliar1TipoDocumento);
			this.jPanelParametrosAuxiliar2TipoDocumento.setLayout(gridaBagParametrosAuxiliar2TipoDocumento);
			this.jPanelParametrosAuxiliar3TipoDocumento.setLayout(gridaBagParametrosAuxiliar3TipoDocumento);
			this.jPanelParametrosAuxiliar4TipoDocumento.setLayout(gridaBagParametrosAuxiliar4TipoDocumento);
			//this.jPanelParametrosAuxiliar5TipoDocumento.setLayout(gridaBagParametrosAuxiliar2TipoDocumento);			
			
			
			
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDocumento.add(this.jButtonRecargarInformacionTipoDocumento, this.gridBagConstraintsTipoDocumento);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDocumento.add(this.jComboBoxTiposPaginacionTipoDocumento, this.gridBagConstraintsTipoDocumento);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDocumento.add(this.jCheckBoxConAltoMaximoTablaTipoDocumento, this.gridBagConstraintsTipoDocumento);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumento.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoDocumento.add(this.jComboBoxTiposArchivosReportesTipoDocumento, this.gridBagConstraintsTipoDocumento);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDocumento.add(this.jPanelParametrosAuxiliar1TipoDocumento, this.gridBagConstraintsTipoDocumento);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoDocumento.add(this.jComboBoxTiposReportesTipoDocumento, this.gridBagConstraintsTipoDocumento);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDocumento.add(this.jPanelParametrosAuxiliar4TipoDocumento, this.gridBagConstraintsTipoDocumento);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumento.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDocumento.add(this.jComboBoxTiposReportesTipoDocumento, this.gridBagConstraintsTipoDocumento);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumento.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDocumento.add(this.jCheckBoxGenerarReporteTipoDocumento, this.gridBagConstraintsTipoDocumento);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDocumento.add(this.jPanelParametrosAuxiliar2TipoDocumento, this.gridBagConstraintsTipoDocumento);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDocumento.add(this.jLabelAccionesTipoDocumento, this.gridBagConstraintsTipoDocumento);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
				this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoDocumento.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoDocumento.add(this.jButtonAbrirOrderByTipoDocumento, this.gridBagConstraintsTipoDocumento);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDocumento.add(this.jComboBoxTiposSeleccionarTipoDocumento, this.gridBagConstraintsTipoDocumento);			
			
			
			/*
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumento.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoDocumento.add(this.jCheckBoxSeleccionarTodosTipoDocumento, this.gridBagConstraintsTipoDocumento);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDocumento.add(this.jCheckBoxSeleccionarTodosTipoDocumento, this.gridBagConstraintsTipoDocumento);															
				
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoDocumento.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoDocumento.add(this.jCheckBoxSeleccionadosTipoDocumento, this.gridBagConstraintsTipoDocumento);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumento.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoDocumento.add(this.jPanelParametrosAuxiliar3TipoDocumento, this.gridBagConstraintsTipoDocumento);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDocumento.add(this.jComboBoxTiposRelacionesTipoDocumento, this.gridBagConstraintsTipoDocumento);
				
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDocumento.add(this.jComboBoxTiposAccionesTipoDocumento, this.gridBagConstraintsTipoDocumento);
	
				
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoDocumento.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoDocumento.add(this.jTextFieldValorCampoGeneralTipoDocumento, this.gridBagConstraintsTipoDocumento);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoDocumento = new GridBagLayout();

			this.jScrollPanelDatosTipoDocumento.setLayout(gridaBagLayoutDatosTipoDocumento);
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.gridy = 0;
			this.gridBagConstraintsTipoDocumento.gridx = 0;
			
			this.jScrollPanelDatosTipoDocumento.add(this.jTableDatosTipoDocumento, this.gridBagConstraintsTipoDocumento);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoDocumento.setViewportView(this.jTableDatosTipoDocumento);
		this.jTableDatosTipoDocumento.setFillsViewportHeight(true);
		this.jTableDatosTipoDocumento.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoDocumento= new GridBagLayout();
		this.jPanelAccionesTipoDocumento.setLayout(gridaBagLayoutAccionesTipoDocumento);
		
		
		/*	
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumento.gridy = 0;
		this.gridBagConstraintsTipoDocumento.gridx = 0;
			
		this.jPanelAccionesTipoDocumento.add(this.jButtonNuevoTipoDocumento, this.gridBagConstraintsTipoDocumento);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoDocumento= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoDocumento.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoDocumento.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoDocumento.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoDocumento.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoDocumento.setLayout(gridaBagLayoutBusquedaPorCodigoTipoDocumento);

		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 0;
		gridBagConstraintsTipoDocumento.gridx = 0;
		jPanelBusquedaPorCodigoTipoDocumento.add(jLabelcodigoBusquedaPorCodigoTipoDocumento, gridBagConstraintsTipoDocumento);

		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 0;
		gridBagConstraintsTipoDocumento.gridx = 1;
		jPanelBusquedaPorCodigoTipoDocumento.add(jTextFieldcodigoBusquedaPorCodigoTipoDocumento, gridBagConstraintsTipoDocumento);

		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 1;
		gridBagConstraintsTipoDocumento.gridx =1;
		jPanelBusquedaPorCodigoTipoDocumento.add(jButtonBusquedaPorCodigoTipoDocumento, gridBagConstraintsTipoDocumento);

		jTabbedPaneBusquedasTipoDocumento.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoDocumento);
		jTabbedPaneBusquedasTipoDocumento.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.setLayout(gridaBagLayoutBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento);

		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 0;
		gridBagConstraintsTipoDocumento.gridx = 0;
		jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.add(jLabelid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento, gridBagConstraintsTipoDocumento);

		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 0;
		gridBagConstraintsTipoDocumento.gridx = 1;
		jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.add(jComboBoxid_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento, gridBagConstraintsTipoDocumento);


		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 1;
		gridBagConstraintsTipoDocumento.gridx = 0;
		jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.add(jLabelid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento, gridBagConstraintsTipoDocumento);

		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 1;
		gridBagConstraintsTipoDocumento.gridx = 1;
		jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.add(jComboBoxid_tipo_movimiento_moduloBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento, gridBagConstraintsTipoDocumento);

		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 2;
		gridBagConstraintsTipoDocumento.gridx =1;
		jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento.add(jButtonBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento, gridBagConstraintsTipoDocumento);

		jTabbedPaneBusquedasTipoDocumento.addTab("2.-Por Modulo Por Tipo Movimiento Modulo ", jPanelBusquedaPorIdModuloPorIdTipoMovimientoModuloTipoDocumento);
		jTabbedPaneBusquedasTipoDocumento.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoDocumento= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoDocumento.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoDocumento.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoDocumento.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoDocumento.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoDocumento.setLayout(gridaBagLayoutBusquedaPorNombreTipoDocumento);

		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 0;
		gridBagConstraintsTipoDocumento.gridx = 0;
		jPanelBusquedaPorNombreTipoDocumento.add(jLabelnombreBusquedaPorNombreTipoDocumento, gridBagConstraintsTipoDocumento);

		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 0;
		gridBagConstraintsTipoDocumento.gridx = 1;
		jPanelBusquedaPorNombreTipoDocumento.add(jTextAreanombreBusquedaPorNombreTipoDocumento, gridBagConstraintsTipoDocumento);

		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 1;
		gridBagConstraintsTipoDocumento.gridx =1;
		jPanelBusquedaPorNombreTipoDocumento.add(jButtonBusquedaPorNombreTipoDocumento, gridBagConstraintsTipoDocumento);

		jTabbedPaneBusquedasTipoDocumento.addTab("3.-Por Nombre ", jPanelBusquedaPorNombreTipoDocumento);
		jTabbedPaneBusquedasTipoDocumento.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdModuloTipoDocumento= new GridBagLayout();
		gridaBagLayoutFK_IdModuloTipoDocumento.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdModuloTipoDocumento.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdModuloTipoDocumento.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdModuloTipoDocumento.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdModuloTipoDocumento.setLayout(gridaBagLayoutFK_IdModuloTipoDocumento);

		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 0;
		gridBagConstraintsTipoDocumento.gridx = 0;
		jPanelFK_IdModuloTipoDocumento.add(jLabelid_moduloFK_IdModuloTipoDocumento, gridBagConstraintsTipoDocumento);

		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 0;
		gridBagConstraintsTipoDocumento.gridx = 1;
		jPanelFK_IdModuloTipoDocumento.add(jComboBoxid_moduloFK_IdModuloTipoDocumento, gridBagConstraintsTipoDocumento);

		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 1;
		gridBagConstraintsTipoDocumento.gridx =1;
		jPanelFK_IdModuloTipoDocumento.add(jButtonFK_IdModuloTipoDocumento, gridBagConstraintsTipoDocumento);

		jTabbedPaneBusquedasTipoDocumento.addTab("4.-Por Modulo ", jPanelFK_IdModuloTipoDocumento);
		jTabbedPaneBusquedasTipoDocumento.setMnemonicAt(3, KeyEvent.VK_4);

		GridBagLayout gridaBagLayoutFK_IdTipoMovimientoTipoDocumento= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMovimientoTipoDocumento.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoTipoDocumento.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoTipoDocumento.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMovimientoTipoDocumento.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMovimientoTipoDocumento.setLayout(gridaBagLayoutFK_IdTipoMovimientoTipoDocumento);

		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 0;
		gridBagConstraintsTipoDocumento.gridx = 0;
		jPanelFK_IdTipoMovimientoTipoDocumento.add(jLabelid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento, gridBagConstraintsTipoDocumento);

		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 0;
		gridBagConstraintsTipoDocumento.gridx = 1;
		jPanelFK_IdTipoMovimientoTipoDocumento.add(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoTipoDocumento, gridBagConstraintsTipoDocumento);

		gridBagConstraintsTipoDocumento = new GridBagConstraints();
		gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoDocumento.gridy = 1;
		gridBagConstraintsTipoDocumento.gridx =1;
		jPanelFK_IdTipoMovimientoTipoDocumento.add(jButtonFK_IdTipoMovimientoTipoDocumento, gridBagConstraintsTipoDocumento);

		jTabbedPaneBusquedasTipoDocumento.addTab("5.-Por Tipo Movimiento ", jPanelFK_IdTipoMovimientoTipoDocumento);
		jTabbedPaneBusquedasTipoDocumento.setMnemonicAt(4, KeyEvent.VK_5);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDocumento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDocumento);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();						
			this.gridBagConstraintsTipoDocumento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDocumento.gridx = 0;		
			//this.gridBagConstraintsTipoDocumento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDocumento.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoDocumento, this.gridBagConstraintsTipoDocumento);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoDocumento.gridx = 0;		
		//this.gridBagConstraintsTipoDocumento.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoDocumento.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoDocumento);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoDocumento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDocumento.gridx = 0;		
			this.gridBagConstraintsTipoDocumento.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoDocumento.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoDocumento, this.gridBagConstraintsTipoDocumento);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumento.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoDocumento, this.gridBagConstraintsTipoDocumento);								
		
		
		/*
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumento.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoDocumento, this.gridBagConstraintsTipoDocumento);
		*/		
		
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDocumento.gridx =0;
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDocumento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDocumento, this.gridBagConstraintsTipoDocumento);
				
		
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumento.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoDocumento, this.gridBagConstraintsTipoDocumento);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoDocumentoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoDocumento= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDocumento = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoDocumento.setLayout(gridaBagLayoutBusquedasParametrosTipoDocumento);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoDocumento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDocumento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDocumento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDocumento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			//}
			
			this.conMaximoRelaciones=false;
			
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
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDocumento, this.gridBagConstraintsTipoDocumento);
			
			
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDocumento, this.gridBagConstraintsTipoDocumento);
		
			
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDocumento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDocumento, this.gridBagConstraintsTipoDocumento);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoDocumento;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoDocumento() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoDocumento = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoDocumento.setName("jPanelReporteDinamicoTipoDocumento"); 
		
		this.jPanelReporteDinamicoTipoDocumento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDocumento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoDocumento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoDocumento.setLayout(gridaBagLayoutReporteDinamicoTipoDocumento);
		
		
		this.jInternalFrameReporteDinamicoTipoDocumento= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoDocumento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDocumento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoDocumento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoDocumento.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoDocumento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoDocumento.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoDocumento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoDocumento.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoDocumento.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoDocumento.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoDocumento.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDocumento.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoDocumento.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documentos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoDocumento = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoDocumento.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDocumento.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoDocumento.add(this.jLabelColumnasSelectReporteTipoDocumento, this.gridBagConstraintsTipoDocumento);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoDocumento = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoDocumento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoDocumento.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoDocumento.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDocumento.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoDocumento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoDocumento=new JScrollPane(this.jListColumnasSelectReporteTipoDocumento);
			
			this.jScrollColumnasSelectReporteTipoDocumento.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDocumento.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoDocumento.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDocumento.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoDocumento.add(this.jListColumnasSelectReporteTipoDocumento, this.gridBagConstraintsTipoDocumento);
		this.jPanelReporteDinamicoTipoDocumento.add(this.jScrollColumnasSelectReporteTipoDocumento, this.gridBagConstraintsTipoDocumento);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoDocumento = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoDocumento.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoDocumento = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoDocumento.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoDocumento.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoDocumento.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDocumento.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoDocumento.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoDocumento=new JScrollPane(this.jListRelacionesSelectReporteTipoDocumento);
			
			this.jScrollRelacionesSelectReporteTipoDocumento.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDocumento.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoDocumento.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoDocumento = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoDocumento = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoDocumento = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoDocumento = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoDocumento.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoDocumento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDocumento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoDocumento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoDocumento = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDocumento.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoDocumento.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDocumento.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoDocumento.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoDocumento = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoDocumento.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDocumento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDocumento.add(this.jLabelGenerarExcelReporteDinamicoTipoDocumento, this.gridBagConstraintsTipoDocumento);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoDocumento = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoDocumento.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoDocumento,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoDocumento.setToolTipText("Generar EXCEL"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoDocumento.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoDocumento.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoDocumento.add(this.jButtonGenerarExcelReporteDinamicoTipoDocumento, this.gridBagConstraintsTipoDocumento);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDocumento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDocumento.add(this.jComboBoxTiposReportesDinamicoTipoDocumento, this.gridBagConstraintsTipoDocumento);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoDocumento = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoDocumento.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoDocumento.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoDocumento.add(this.jLabelTiposArchivoReporteDinamicoTipoDocumento, this.gridBagConstraintsTipoDocumento);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDocumento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDocumento.add(this.jComboBoxTiposArchivosReportesDinamicoTipoDocumento, this.gridBagConstraintsTipoDocumento);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoDocumento = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoDocumento.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoDocumento,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoDocumento.setToolTipText("Generar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDocumento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDocumento.add(this.jButtonGenerarReporteDinamicoTipoDocumento, this.gridBagConstraintsTipoDocumento);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoDocumento = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoDocumento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoDocumento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoDocumento.setToolTipText("Cancelar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumento.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoDocumento.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoDocumento.add(this.jButtonCerrarReporteDinamicoTipoDocumento, this.gridBagConstraintsTipoDocumento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoDocumento = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoDocumento= new JScrollPane(jPanelReporteDinamicoTipoDocumento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoDocumento.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDocumento.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoDocumento.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documentos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoDocumento.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoDocumento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoDocumento.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoDocumento);
		this.jInternalFrameReporteDinamicoTipoDocumento.getContentPane().add(this.jScrollPanelReporteDinamicoTipoDocumento, this.gridBagConstraintsTipoDocumento);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoDocumento() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoDocumento = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoDocumento.setName("jPanelImportacionTipoDocumento"); 
		
		this.jPanelImportacionTipoDocumento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDocumento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoDocumento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoDocumento.setLayout(gridaBagLayoutImportacionTipoDocumento);
		
		
		this.jInternalFrameImportacionTipoDocumento= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoDocumento= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoDocumento = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoDocumento= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoDocumento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDocumento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDocumento.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoDocumento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDocumento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDocumento.setResizable(true);
	    this.jInternalFrameImportacionTipoDocumento.setClosable(true);
	    this.jInternalFrameImportacionTipoDocumento.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoDocumento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoDocumento.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoDocumento.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoDocumento.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoDocumento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoDocumento.setResizable(true);
	    this.jInternalFrameImportacionTipoDocumento.setClosable(true);
	    this.jInternalFrameImportacionTipoDocumento.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoDocumento.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDocumento.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoDocumento.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documentos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoDocumento = new JLabelMe();

		this.jLabelArchivoImportacionTipoDocumento.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDocumento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDocumento.add(this.jLabelArchivoImportacionTipoDocumento, this.gridBagConstraintsTipoDocumento);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoDocumento = new JFileChooser();		
		this.jFileChooserImportacionTipoDocumento.setToolTipText("ESCOGER ARCHIVO"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoDocumento = new JButtonMe();
		this.jButtonAbrirImportacionTipoDocumento.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoDocumento,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoDocumento.setToolTipText("Generar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDocumento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDocumento.add(this.jButtonAbrirImportacionTipoDocumento, this.gridBagConstraintsTipoDocumento);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoDocumento = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoDocumento.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDocumento.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoDocumento.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoDocumento.add(this.jLabelPathArchivoImportacionTipoDocumento, this.gridBagConstraintsTipoDocumento);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoDocumento=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoDocumento.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDocumento.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoDocumento.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDocumento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDocumento.add(this.jTextFieldPathArchivoImportacionTipoDocumento, this.gridBagConstraintsTipoDocumento);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoDocumento = new JButtonMe();
		this.jButtonGenerarImportacionTipoDocumento.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoDocumento,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoDocumento.setToolTipText("Generar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDocumento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDocumento.add(this.jButtonGenerarImportacionTipoDocumento, this.gridBagConstraintsTipoDocumento);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoDocumento = new JButtonMe();
		this.jButtonCerrarImportacionTipoDocumento.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoDocumento,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoDocumento.setToolTipText("Cancelar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDocumento.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoDocumento.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoDocumento.add(this.jButtonCerrarImportacionTipoDocumento, this.gridBagConstraintsTipoDocumento);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoDocumento = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoDocumento= new JScrollPane(jPanelImportacionTipoDocumento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDocumento.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoDocumento.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoDocumento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoDocumento.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoDocumento);
		this.jInternalFrameImportacionTipoDocumento.getContentPane().add(this.jScrollPanelImportacionTipoDocumento, this.gridBagConstraintsTipoDocumento);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoDocumento(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoDocumento = new JButtonMe();
			this.jButtonAbrirOrderByTipoDocumento.setText("Orden");
			this.jButtonAbrirOrderByTipoDocumento.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoDocumento,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoDocumento";
			inputMap = this.jButtonAbrirOrderByTipoDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoDocumento"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoDocumento = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoDocumento.setName("jPanelOrderByTipoDocumento"); 
			
			this.jPanelOrderByTipoDocumento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDocumento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoDocumento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoDocumento.setLayout(gridaBagLayoutOrderByTipoDocumento);
			
			
			this.jTableDatosTipoDocumentoOrderBy = new JTableMe();        
			this.jTableDatosTipoDocumentoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoDocumentoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoDocumentoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoDocumentoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoDocumentoOrderBy.setViewportView(this.jTableDatosTipoDocumentoOrderBy);
			this.jTableDatosTipoDocumentoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoDocumentoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoDocumento= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoDocumento= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoDocumento = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoDocumento= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoDocumento.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoDocumento.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoDocumento.setTitle("Orden");
			this.jInternalFrameOrderByTipoDocumento.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoDocumento.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoDocumento.setResizable(true);
			this.jInternalFrameOrderByTipoDocumento.setClosable(true);
			this.jInternalFrameOrderByTipoDocumento.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoDocumento.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDocumento.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoDocumento.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Documentos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoDocumento.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoDocumento.ipady =150;
				
			this.jPanelOrderByTipoDocumento.add(jScrollPanelDatosTipoDocumentoOrderBy, this.gridBagConstraintsTipoDocumento);//this.jTableDatosTipoDocumentoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoDocumento = new JButtonMe();
			this.jButtonCerrarOrderByTipoDocumento.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoDocumento,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoDocumento.setToolTipText("Cancelar"+" "+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDocumento.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoDocumento.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoDocumento.add(this.jButtonCerrarOrderByTipoDocumento, this.gridBagConstraintsTipoDocumento);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoDocumento = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoDocumento= new JScrollPane(jPanelOrderByTipoDocumento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDocumento.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoDocumento.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoDocumento.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoDocumento.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoDocumento.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoDocumento);
			
			this.jInternalFrameOrderByTipoDocumento.getContentPane().add(this.jScrollPanelOrderByTipoDocumento, this.gridBagConstraintsTipoDocumento);			
		
		} else {
			this.jButtonAbrirOrderByTipoDocumento = new JButtonMe();
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
		int iWidthTableCalculado=0;//1730
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipodocumentoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoDocumento.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoDocumento.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoDocumento.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoDocumento.getRowHeight();//TipoDocumentoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoDocumentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDocumento.isSelected()) {
					iHeightTable=TipoDocumentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDocumentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDocumentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoDocumentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoDocumento.isSelected()) {
					iHeightTable=TipoDocumentoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoDocumentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoDocumentoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoDocumento.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDocumento.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoDocumento.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoDocumento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDocumento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoDocumento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoDocumento!=null && this.jInternalFrameOrderByTipoDocumento.getjTableDatosOrderBy()!=null) {
			//if(!this.tipodocumentoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoDocumento.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoDocumento.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoDocumento.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoDocumento.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoDocumento.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoDocumento.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoDocumento.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoDocumento.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDocumento.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoDocumento.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipodocumentoLogic.getTipoDocumentos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodocumentos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoDocumento> TraerTipoDocumentoBeans(List<TipoDocumento> tipodocumentos,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoDocumento tipodocumento:tipodocumentos) {
					
				if(!(TipoDocumentoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoDocumentoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipodocumento.setsDetalleGeneralEntityReporte(TipoDocumentoConstantesFunciones.getTipoDocumentoDescripcion(tipodocumento));
										
					tipodocumento.setes_defecto_descripcion(TipoDocumentoConstantesFunciones.getes_defectoDescripcion(tipodocumento));tipodocumento.setes_mayor_descripcion(TipoDocumentoConstantesFunciones.getes_mayorDescripcion(tipodocumento));	
					
						
					
				} else  {
							
					//tipodocumento.setsDetalleGeneralEntityReporte(tipodocumento.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipodocumentobeans.add(tipodocumentobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipodocumentos;
    }
	//PARA REPORTES FIN
}
