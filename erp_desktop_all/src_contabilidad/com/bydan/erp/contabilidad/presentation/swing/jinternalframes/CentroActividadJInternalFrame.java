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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

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
import com.bydan.erp.contabilidad.util.CentroActividadConstantesFunciones;

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
public class CentroActividadJInternalFrame extends CentroActividadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarCentroActividad;
	
	protected JMenuBar jmenuBarCentroActividad;
	
	protected JMenu jmenuCentroActividad;
	protected JMenu jmenuDatosCentroActividad;
	protected JMenu jmenuArchivoCentroActividad;
	protected JMenu jmenuAccionesCentroActividad;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosCentroActividad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCentroActividad;	
	protected GridBagConstraints gridBagConstraintsCentroActividad;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public CentroActividadDetalleFormJInternalFrame jInternalFrameDetalleFormCentroActividad;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoCentroActividad;	
	protected ImportacionJInternalFrame jInternalFrameImportacionCentroActividad;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected TipoGrupoFlujoCajaBeanSwingJInternalFrame tipogrupoflujocajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogrupoflujocaja="";
	
	public CentroActividadSessionBean centroactividadSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public TipoGrupoFlujoCajaSessionBean tipogrupoflujocajaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<CentroActividad> centroactividads;		
	public List<CentroActividad> centroactividadsEliminados;	
	public List<CentroActividad> centroactividadsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByCentroActividad;		
	protected JButton jButtonAbrirOrderByCentroActividad;
	
	
	//protected JPanel jPanelOrderByCentroActividad;
	//public JScrollPane jScrollPanelOrderByCentroActividad;	
	//protected JButton jButtonCerrarOrderByCentroActividad;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public CentroActividadLogic centroactividadLogic;
	
	
	
	public JScrollPane jScrollPanelDatosCentroActividad;
	public JScrollPane jScrollPanelDatosEdicionCentroActividad;
	public JScrollPane jScrollPanelDatosGeneralCentroActividad;
    
	
	
	//public JScrollPane jScrollPanelDatosCentroActividadOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoCentroActividad;
	//public JScrollPane jScrollPanelImportacionCentroActividad;
	
	
	
	protected JPanel jPanelAccionesCentroActividad;
	
    protected JPanel jPanelPaginacionCentroActividad;
    protected JPanel jPanelParametrosReportesCentroActividad;
	protected JPanel jPanelParametrosReportesAccionesCentroActividad;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1CentroActividad;
	protected JPanel jPanelParametrosAuxiliar2CentroActividad;
	protected JPanel jPanelParametrosAuxiliar3CentroActividad;
	protected JPanel jPanelParametrosAuxiliar4CentroActividad;
	//protected JPanel jPanelParametrosAuxiliar5CentroActividad;
	
	
	
	//protected JPanel jPanelReporteDinamicoCentroActividad;
	//protected JPanel jPanelImportacionCentroActividad;
	
	
	public JTable jTableDatosCentroActividad;
	
	
	
	//public JTable jTableDatosCentroActividadOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoCentroActividad;
	protected JButton jButtonDuplicarCentroActividad;
	protected JButton jButtonCopiarCentroActividad;
	protected JButton jButtonVerFormCentroActividad;
	protected JButton jButtonNuevoRelacionesCentroActividad;
	protected JButton jButtonModificarCentroActividad;
	
    protected JButton jButtonGuardarCambiosTablaCentroActividad;
	protected JButton jButtonCerrarCentroActividad;
	
	
	protected JButton jButtonRecargarInformacionCentroActividad;
	protected JButton jButtonProcesarInformacionCentroActividad;
	
	
	protected JButton jButtonAnterioresCentroActividad;
	protected JButton jButtonSiguientesCentroActividad;
	protected JButton jButtonNuevoGuardarCambiosCentroActividad;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoCentroActividad;
	//protected JButton jButtonCerrarReporteDinamicoCentroActividad;
	//protected JButton jButtonGenerarExcelReporteDinamicoCentroActividad;	
	
	
	
	//protected JButton jButtonAbrirImportacionCentroActividad;
	//protected JButton jButtonGenerarImportacionCentroActividad;
	//protected JButton jButtonCerrarImportacionCentroActividad;
	//protected JFileChooser jFileChooserImportacionCentroActividad;
	//protected File fileImportacionCentroActividad;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCentroActividad;
	protected JButton jButtonDuplicarToolBarCentroActividad;
	protected JButton jButtonNuevoRelacionesToolBarCentroActividad;
	
	
	public JButton jButtonGuardarCambiosToolBarCentroActividad;
	protected JButton jButtonCopiarToolBarCentroActividad;
	protected JButton jButtonVerFormToolBarCentroActividad;
	public JButton jButtonGuardarCambiosTablaToolBarCentroActividad;
	protected JButton jButtonMostrarOcultarTablaToolBarCentroActividad;
	protected JButton jButtonCerrarToolBarCentroActividad;
	
	protected JButton jButtonRecargarInformacionToolBarCentroActividad;
	protected JButton jButtonProcesarInformacionToolBarCentroActividad;
	protected JButton jButtonAnterioresToolBarCentroActividad;
	protected JButton jButtonSiguientesToolBarCentroActividad;
	protected JButton jButtonNuevoGuardarCambiosToolBarCentroActividad;
	protected JButton jButtonAbrirOrderByToolBarCentroActividad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCentroActividad;
	protected JMenuItem jMenuItemDuplicarCentroActividad;
	protected JMenuItem jMenuItemNuevoRelacionesCentroActividad;
	
	
	protected JMenuItem jMenuItemGuardarCambiosCentroActividad;
	protected JMenuItem jMenuItemCopiarCentroActividad;
	protected JMenuItem jMenuItemVerFormCentroActividad;
	protected JMenuItem jMenuItemGuardarCambiosTablaCentroActividad;
	protected JMenuItem jMenuItemCerrarCentroActividad;
	protected JMenuItem jMenuItemDetalleCerrarCentroActividad;
	protected JMenuItem jMenuItemDetalleAbrirOrderByCentroActividad;
	protected JMenuItem jMenuItemDetalleMostarOcultarCentroActividad;
	
	protected JMenuItem jMenuItemRecargarInformacionCentroActividad;
	protected JMenuItem jMenuItemProcesarInformacionCentroActividad;
	protected JMenuItem jMenuItemAnterioresCentroActividad;
	protected JMenuItem jMenuItemSiguientesCentroActividad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCentroActividad;
	protected JMenuItem jMenuItemAbrirOrderByCentroActividad;
	protected JMenuItem jMenuItemMostrarOcultarCentroActividad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCentroActividad;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosCentroActividad;
	protected JCheckBox jCheckBoxSeleccionadosCentroActividad;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaCentroActividad;
	protected JCheckBox jCheckBoxConGraficoReporteCentroActividad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesCentroActividad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesCentroActividad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoCentroActividad;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoCentroActividad;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesCentroActividad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionCentroActividad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCentroActividad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCentroActividad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarCentroActividad;
	protected JTextField jTextFieldValorCampoGeneralCentroActividad;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteCentroActividad;
	//public JList<Reporte> jListColumnasSelectReporteCentroActividad;
	//public JScrollPane jScrollColumnasSelectReporteCentroActividad;
	
	//public JLabel jLabelRelacionesSelectReporteCentroActividad;
	//public JList<Reporte> jListRelacionesSelectReporteCentroActividad;
	//public JScrollPane jScrollRelacionesSelectReporteCentroActividad;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoCentroActividad;
	//protected JCheckBox jCheckBoxConGraficoDinamicoCentroActividad;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoCentroActividad;
	//public JLabel jLabelTiposArchivoReporteDinamicoCentroActividad;
	
		
	//public JLabel jLabelArchivoImportacionCentroActividad;	
	//public JLabel jLabelPathArchivoImportacionCentroActividad;
	//protected JTextField jTextFieldPathArchivoImportacionCentroActividad;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoCentroActividad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoCentroActividad;
	
	//public JLabel jLabelColumnaCategoriaValorCentroActividad;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorCentroActividad;
	
	//public JLabel jLabelColumnasValoresGraficoCentroActividad;
	//public JList<Reporte> jListColumnasValoresGraficoCentroActividad;
	//public JScrollPane jScrollColumnasValoresGraficoCentroActividad;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoCentroActividad;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoCentroActividad;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasCentroActividad;
	public JPanel jPanelBusquedaPorCodigoCentroActividad;
	public JButton jButtonBusquedaPorCodigoCentroActividad;
	public JPanel jPanelBusquedaPorNombreCentroActividad;
	public JButton jButtonBusquedaPorNombreCentroActividad;
	public JPanel jPanelFK_IdTipoGrupoFlujoCajaCentroActividad;
	public JButton jButtonFK_IdTipoGrupoFlujoCajaCentroActividad;
	public JPanel jPanelFK_IdTipoMovimientoCentroActividad;
	public JButton jButtonFK_IdTipoMovimientoCentroActividad;
	
	public JPanel jPanelcodigoBusquedaPorCodigoCentroActividad;
	public JLabel jLabelcodigoBusquedaPorCodigoCentroActividad;
	public JTextField jTextFieldcodigoBusquedaPorCodigoCentroActividad;
	public JButton jButtoncodigoBusquedaPorCodigoCentroActividadBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreCentroActividad;
	public JLabel jLabelnombreBusquedaPorNombreCentroActividad;
	public JTextArea jTextAreanombreBusquedaPorNombreCentroActividad;
	public JButton jButtonnombreBusquedaPorNombreCentroActividadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad;
	public JLabel jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad;
	public JButton jButtonid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad= new JButtonMe();
	public JButton jButtonid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividadUpdate= new JButtonMe();
	public JButton jButtonid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_movimientoFK_IdTipoMovimientoCentroActividad;
	public JLabel jLabelid_tipo_movimientoFK_IdTipoMovimientoCentroActividad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad;
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoCentroActividad= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoCentroActividadUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFK_IdTipoMovimientoCentroActividadBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public CentroActividadJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("CentroActividad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroActividadJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroActividad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroActividadJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroActividad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroActividadJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CentroActividad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionCentroActividad)	{
		this.jButtonRecargarInformacionCentroActividad = jButtonRecargarInformacionCentroActividad;
	}
	
	public JButton getjButtonProcesarInformacionCentroActividad() {
		return this.jButtonProcesarInformacionCentroActividad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCentroActividad)	{
		this.jButtonProcesarInformacionCentroActividad = jButtonProcesarInformacionCentroActividad;
	}
	
	
	public JButton getjButtonRecargarInformacionCentroActividad() {
		return this.jButtonRecargarInformacionCentroActividad;
	}
	
	
	public List<CentroActividad> getcentroactividads() {
		return this.centroactividads;
	}

	public void setcentroactividads(List<CentroActividad> centroactividads) {
		this.centroactividads = centroactividads;
	}
	
	public List<CentroActividad> getcentroactividadsAux() {
		return this.centroactividadsAux;
	}

	public void setcentroactividadsAux(List<CentroActividad> centroactividadsAux) {
		this.centroactividadsAux = centroactividadsAux;
	}
	
	public List<CentroActividad> getcentroactividadsEliminados() {
		return this.centroactividadsEliminados;
	}

	public void setCentroActividadsEliminados(List<CentroActividad> centroactividadsEliminados) {
		this.centroactividadsEliminados = centroactividadsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarCentroActividad() {
		return jComboBoxTiposSeleccionarCentroActividad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarCentroActividad(
			JComboBox jComboBoxTiposSeleccionarCentroActividad) {
		this.jComboBoxTiposSeleccionarCentroActividad = jComboBoxTiposSeleccionarCentroActividad;
	}
	
	public void setBorderResaltarTiposSeleccionarCentroActividad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarCentroActividad.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarCentroActividad .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralCentroActividad() {
		return jTextFieldValorCampoGeneralCentroActividad;
	}

	public void setjTextFieldValorCampoGeneralCentroActividad(
			JTextField jTextFieldValorCampoGeneralCentroActividad) {
		this.jTextFieldValorCampoGeneralCentroActividad = jTextFieldValorCampoGeneralCentroActividad;
	}

	public void setBorderResaltarValorCampoGeneralCentroActividad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroActividad.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralCentroActividad .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosCentroActividad() {
		return this.jCheckBoxSeleccionarTodosCentroActividad;
	}

	public void setjCheckBoxSeleccionarTodosCentroActividad(
			JCheckBox jCheckBoxSeleccionarTodosCentroActividad) {
		this.jCheckBoxSeleccionarTodosCentroActividad = jCheckBoxSeleccionarTodosCentroActividad;
	}

	public void setBorderResaltarSeleccionarTodosCentroActividad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroActividad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosCentroActividad .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosCentroActividad() {
		return this.jCheckBoxSeleccionadosCentroActividad;
	}

	public void setjCheckBoxSeleccionadosCentroActividad(
			JCheckBox jCheckBoxSeleccionadosCentroActividad) {
		this.jCheckBoxSeleccionadosCentroActividad = jCheckBoxSeleccionadosCentroActividad;
	}
	
	public void setBorderResaltarSeleccionadosCentroActividad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroActividad.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosCentroActividad .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesCentroActividad() {
		return this.jComboBoxTiposArchivosReportesCentroActividad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesCentroActividad(
			JComboBox jComboBoxTiposArchivosReportesCentroActividad) {
		this.jComboBoxTiposArchivosReportesCentroActividad = jComboBoxTiposArchivosReportesCentroActividad;
	}

	public void setBorderResaltarTiposArchivosReportesCentroActividad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroActividad.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesCentroActividad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesCentroActividad() {
		return this.jComboBoxTiposReportesCentroActividad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesCentroActividad(
			JComboBox jComboBoxTiposReportesCentroActividad) {
		this.jComboBoxTiposReportesCentroActividad = jComboBoxTiposReportesCentroActividad;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoCentroActividad() {
	//	return jComboBoxTiposReportesDinamicoCentroActividad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoCentroActividad(
	//		JComboBox jComboBoxTiposReportesDinamicoCentroActividad) {
	//	this.jComboBoxTiposReportesDinamicoCentroActividad = jComboBoxTiposReportesDinamicoCentroActividad;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoCentroActividad() {
	//	return jComboBoxTiposArchivosReportesDinamicoCentroActividad;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoCentroActividad(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoCentroActividad) {
	//	this.jComboBoxTiposArchivosReportesDinamicoCentroActividad = jComboBoxTiposArchivosReportesDinamicoCentroActividad;
	//}
	
	public void setBorderResaltarTiposReportesCentroActividad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroActividad.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesCentroActividad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesCentroActividad() {
		return this.jComboBoxTiposGraficosReportesCentroActividad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesCentroActividad(
			JComboBox jComboBoxTiposGraficosReportesCentroActividad) {
		this.jComboBoxTiposGraficosReportesCentroActividad = jComboBoxTiposGraficosReportesCentroActividad;
	}
	
	public void setBorderResaltarTiposGraficosReportesCentroActividad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroActividad.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesCentroActividad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionCentroActividad() {
		return this.jComboBoxTiposPaginacionCentroActividad;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionCentroActividad(
			JComboBox jComboBoxTiposPaginacionCentroActividad) {
		this.jComboBoxTiposPaginacionCentroActividad = jComboBoxTiposPaginacionCentroActividad;
	}
	
	public void setBorderResaltarTiposPaginacionCentroActividad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroActividad.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionCentroActividad .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesCentroActividad() {
		return this.jComboBoxTiposRelacionesCentroActividad;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCentroActividad() {
		return this.jComboBoxTiposAccionesCentroActividad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCentroActividad(
			JComboBox jComboBoxTiposRelacionesCentroActividad) {
		this.jComboBoxTiposRelacionesCentroActividad = jComboBoxTiposRelacionesCentroActividad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCentroActividad(
			JComboBox jComboBoxTiposAccionesCentroActividad) {
		this.jComboBoxTiposAccionesCentroActividad = jComboBoxTiposAccionesCentroActividad;
	}
	
	public void setBorderResaltarTiposRelacionesCentroActividad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroActividad.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesCentroActividad .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesCentroActividad() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarCentroActividad.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesCentroActividad .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoCentroActividad() {
	//	return jCheckBoxConGraficoDinamicoCentroActividad;
	//}

	//public void setjCheckBoxConGraficoDinamicoCentroActividad(
	//		JCheckBox jCheckBoxConGraficoDinamicoCentroActividad) {
	//	this.jCheckBoxConGraficoDinamicoCentroActividad = jCheckBoxConGraficoDinamicoCentroActividad;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoCentroActividad() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarCentroActividad.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoCentroActividad .setBorder(borderResaltar);		
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
		this.centroactividadSessionBean=new CentroActividadSessionBean();
		
		this.centroactividadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.centroactividadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.centroactividadSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=CentroActividadJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=CentroActividadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CentroActividadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CentroActividadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CentroActividadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Centro Actividad MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
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
		
		CentroActividadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("CentroActividad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarCentroActividad= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarCentroActividad,this.jTtoolBarCentroActividad,
							"nuevo","nuevo","Nuevo"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarCentroActividad,this.jTtoolBarCentroActividad,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarCentroActividad,this.jTtoolBarCentroActividad,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarCentroActividad,this.jTtoolBarCentroActividad,
							"duplicar","duplicar","Duplicar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarCentroActividad,this.jTtoolBarCentroActividad,
							"copiar","copiar","Copiar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarCentroActividad,this.jTtoolBarCentroActividad,
							"ver_form","ver_form","Ver"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCentroActividad,this.jTtoolBarCentroActividad,
							"recargar","recargar","Recargar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCentroActividad,this.jTtoolBarCentroActividad,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarCentroActividad,this.jTtoolBarCentroActividad,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarCentroActividad,this.jTtoolBarCentroActividad,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarCentroActividad,this.jTtoolBarCentroActividad,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarCentroActividad,this.jTtoolBarCentroActividad,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarCentroActividad,this.jTtoolBarCentroActividad,
							"cerrar","cerrar","Salir"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarCentroActividad=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarCentroActividad;
			
				this.jButtonProcesarInformacionToolBarCentroActividad=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarCentroActividad;
				
		//protected JButton jButtonModificarToolBarCentroActividad;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarCentroActividad=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuCentroActividad=new JMenuMe("General");
		this.jmenuArchivoCentroActividad=new JMenuMe("Archivo");
		this.jmenuAccionesCentroActividad=new JMenuMe("Acciones");
		this.jmenuDatosCentroActividad=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCentroActividad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCentroActividad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCentroActividad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarCentroActividad= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarCentroActividad.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarCentroActividad,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesCentroActividad= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesCentroActividad.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesCentroActividad,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosCentroActividad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCentroActividad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCentroActividad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarCentroActividad= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarCentroActividad.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarCentroActividad,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormCentroActividad= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormCentroActividad.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormCentroActividad,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaCentroActividad= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaCentroActividad.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaCentroActividad,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCentroActividad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCentroActividad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCentroActividad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionCentroActividad= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionCentroActividad.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionCentroActividad,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionCentroActividad= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionCentroActividad.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionCentroActividad,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresCentroActividad= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresCentroActividad.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresCentroActividad,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesCentroActividad= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesCentroActividad.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesCentroActividad,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByCentroActividad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByCentroActividad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByCentroActividad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCentroActividad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCentroActividad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCentroActividad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByCentroActividad= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByCentroActividad.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByCentroActividad,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCentroActividad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCentroActividad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCentroActividad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosCentroActividad= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosCentroActividad.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosCentroActividad,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoCentroActividad.add(this.jMenuItemCerrarCentroActividad);
			
			this.jmenuAccionesCentroActividad.add(this.jMenuItemNuevoCentroActividad);
			this.jmenuAccionesCentroActividad.add(this.jMenuItemNuevoGuardarCambiosCentroActividad);
			this.jmenuAccionesCentroActividad.add(this.jMenuItemNuevoRelacionesCentroActividad);
			this.jmenuAccionesCentroActividad.add(this.jMenuItemGuardarCambiosTablaCentroActividad);		
			this.jmenuAccionesCentroActividad.add(this.jMenuItemDuplicarCentroActividad);		
			this.jmenuAccionesCentroActividad.add(this.jMenuItemCopiarCentroActividad);		
			this.jmenuAccionesCentroActividad.add(this.jMenuItemVerFormCentroActividad);		
			
			this.jmenuDatosCentroActividad.add(this.jMenuItemRecargarInformacionCentroActividad);				
			this.jmenuDatosCentroActividad.add(this.jMenuItemAnterioresCentroActividad);				
			this.jmenuDatosCentroActividad.add(this.jMenuItemSiguientesCentroActividad);				
			this.jmenuDatosCentroActividad.add(this.jMenuItemAbrirOrderByCentroActividad);				
			this.jmenuDatosCentroActividad.add(this.jMenuItemMostrarOcultarCentroActividad);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesCentroActividad.add(this.jMenuItemGuardarCambiosCentroActividad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarCentroActividad.add(this.jmenuArchivoCentroActividad);		
			this.jmenuBarCentroActividad.add(this.jmenuAccionesCentroActividad);		
			this.jmenuBarCentroActividad.add(this.jmenuDatosCentroActividad);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarCentroActividad);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasCentroActividad() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoCentroActividad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoCentroActividad.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoCentroActividad= new JButtonMe();
		this.jButtonBusquedaPorCodigoCentroActividad.setText("Buscar");
		this.jButtonBusquedaPorCodigoCentroActividad.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoCentroActividad,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoCentroActividad = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoCentroActividad.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoCentroActividad.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoCentroActividad,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoCentroActividad= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoCentroActividad,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreCentroActividad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreCentroActividad.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreCentroActividad= new JButtonMe();
		this.jButtonBusquedaPorNombreCentroActividad.setText("Buscar");
		this.jButtonBusquedaPorNombreCentroActividad.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreCentroActividad,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreCentroActividad = new JLabelMe();
		jLabelnombreBusquedaPorNombreCentroActividad.setText("Nombre :");
		jLabelnombreBusquedaPorNombreCentroActividad.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreCentroActividad,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreCentroActividad= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreCentroActividad,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoGrupoFlujoCajaCentroActividad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoGrupoFlujoCajaCentroActividad.setToolTipText("Buscar Por Tipo Grupo Flujo Caja ");
		this.jButtonFK_IdTipoGrupoFlujoCajaCentroActividad= new JButtonMe();
		this.jButtonFK_IdTipoGrupoFlujoCajaCentroActividad.setText("Buscar");
		this.jButtonFK_IdTipoGrupoFlujoCajaCentroActividad.setToolTipText("Buscar Por Tipo Grupo Flujo Caja ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoGrupoFlujoCajaCentroActividad,"buscar_button","Buscar Por Tipo Grupo Flujo Caja ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoGrupoFlujoCajaCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad = new JLabelMe();
		jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.setText("Tipo Grupo Flujo Caja :");
		jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.setToolTipText("Tipo Grupo Flujo Caja");
		jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad= new JComboBoxMe();
		jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoMovimientoCentroActividad=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoMovimientoCentroActividad.setToolTipText("Buscar Por Tipo Movimiento ");
		this.jButtonFK_IdTipoMovimientoCentroActividad= new JButtonMe();
		this.jButtonFK_IdTipoMovimientoCentroActividad.setText("Buscar");
		this.jButtonFK_IdTipoMovimientoCentroActividad.setToolTipText("Buscar Por Tipo Movimiento ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoMovimientoCentroActividad,"buscar_button","Buscar Por Tipo Movimiento ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoMovimientoCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_movimientoFK_IdTipoMovimientoCentroActividad = new JLabelMe();
		jLabelid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.setText("Tipo Movimiento :");
		jLabelid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.setToolTipText("Tipo Movimiento");
		jLabelid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));
		jLabelid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoFK_IdTipoMovimientoCentroActividad,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad= new JComboBoxMe();
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasCentroActividad=new JTabbedPane();


		this.jTabbedPaneBusquedasCentroActividad.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCentroActividad.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasCentroActividad.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasCentroActividad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasCentroActividad,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleCentroActividad = new CentroActividadDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Centro Actividad DATOS");
			this.jInternalFrameDetalleFormCentroActividad = new CentroActividadDetalleFormJInternalFrame(jDesktopPane,this.centroactividadSessionBean.getConGuardarRelaciones(),this.centroactividadSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormCentroActividad = null;//new CentroActividadDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCentroActividad= new GridBagLayout();
		
		
		this.jTableDatosCentroActividad = new JTableMe();      
		
		String sToolTipCentroActividad="";
		sToolTipCentroActividad=CentroActividadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCentroActividad+="(Contabilidad.CentroActividad)";
		}
		
		if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
			sToolTipCentroActividad+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosCentroActividad.setToolTipText(sToolTipCentroActividad);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosCentroActividad);
		this.jTableDatosCentroActividad.setAutoCreateRowSorter(true);
		this.jTableDatosCentroActividad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosCentroActividad.setRowSelectionAllowed(true);
		this.jTableDatosCentroActividad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosCentroActividad,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoCentroActividad = new JButtonMe();
		this.jButtonDuplicarCentroActividad = new JButtonMe();
		this.jButtonCopiarCentroActividad = new JButtonMe();
		this.jButtonVerFormCentroActividad = new JButtonMe();
		this.jButtonNuevoRelacionesCentroActividad = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaCentroActividad = new JButtonMe();
		this.jButtonCerrarCentroActividad = new JButtonMe();
		
		this.jScrollPanelDatosCentroActividad = new JScrollPane();   
        this.jScrollPanelDatosGeneralCentroActividad = new JScrollPane();
		
				
		
		
		this.jPanelAccionesCentroActividad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Centro Actividad";
		
		if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Actividades" + this.sPath));
		} else {
			this.jScrollPanelDatosCentroActividad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCentroActividad.setToolTipText("Acciones");
        this.jPanelAccionesCentroActividad.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoCentroActividad=new ReporteDinamicoJInternalFrame(CentroActividadConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoCentroActividad();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionCentroActividad=new ImportacionJInternalFrame(CentroActividadConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionCentroActividad();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByCentroActividad = new JButtonMe();
		
		this.jButtonAbrirOrderByCentroActividad.setText("Orden");
		this.jButtonAbrirOrderByCentroActividad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCentroActividad,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByCentroActividad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCentroActividad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroActividad,false,this);
			
			//this.cargarOrderByCentroActividad(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByCentroActividad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroActividad,true,this);
			
			//this.cargarOrderByCentroActividad(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosCentroActividad.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosCentroActividad.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosCentroActividad.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosCentroActividad.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosCentroActividad.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosCentroActividad.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoCentroActividad.setText("Nuevo");
		this.jButtonDuplicarCentroActividad.setText("Duplicar");
		this.jButtonCopiarCentroActividad.setText("Copiar");
		this.jButtonVerFormCentroActividad.setText("Ver");
		this.jButtonNuevoRelacionesCentroActividad.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaCentroActividad.setText("Guardar");
		this.jButtonCerrarCentroActividad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCentroActividad,"nuevo_button","Nuevo",this.centroactividadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarCentroActividad,"duplicar_button","Duplicar",this.centroactividadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarCentroActividad,"copiar_button","Copiar",this.centroactividadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormCentroActividad,"ver_form","Ver",this.centroactividadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesCentroActividad,"nuevorelaciones_button","Nuevo Rel",this.centroactividadSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCentroActividad,"guardarcambiostabla_button","Guardar",this.centroactividadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCentroActividad,"cerrar_button","Salir",this.centroactividadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoCentroActividad.setToolTipText("Nuevo"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarCentroActividad.setToolTipText("Duplicar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarCentroActividad.setToolTipText("Copiar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormCentroActividad.setToolTipText("Ver"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesCentroActividad.setToolTipText("Nuevo Rel"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaCentroActividad.setToolTipText("Guardar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCentroActividad.setToolTipText("Salir"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCentroActividad";
		inputMap = this.jButtonNuevoCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCentroActividad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCentroActividad"));
		
		//DUPLICAR
		sMapKey = "DuplicarCentroActividad";
		inputMap = this.jButtonDuplicarCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarCentroActividad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarCentroActividad"));
		
		//COPIAR
		sMapKey = "CopiarCentroActividad";
		inputMap = this.jButtonCopiarCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarCentroActividad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarCentroActividad"));
		
		//VEr FORM
		sMapKey = "VerFormCentroActividad";
		inputMap = this.jButtonVerFormCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormCentroActividad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormCentroActividad"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesCentroActividad";
		inputMap = this.jButtonNuevoRelacionesCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesCentroActividad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesCentroActividad"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarCentroActividad";
		inputMap = this.jButtonModificarCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarCentroActividad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarCentroActividad"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarCentroActividad";
		inputMap = this.jButtonCerrarCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCentroActividad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCentroActividad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCentroActividad";
		inputMap = this.jButtonGuardarCambiosTablaCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCentroActividad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCentroActividad"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesCentroActividad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesCentroActividad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionCentroActividad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1CentroActividad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2CentroActividad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3CentroActividad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4CentroActividad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5CentroActividad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesCentroActividad.setName("jPanelParametrosReportesCentroActividad"); 
		
		this.jPanelParametrosReportesAccionesCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesCentroActividad.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesCentroActividad.setName("jPanelParametrosReportesAccionesCentroActividad"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionCentroActividad = new JButtonMe();
		this.jButtonRecargarInformacionCentroActividad.setText("Recargar");
		this.jButtonRecargarInformacionCentroActividad.setToolTipText("Recargar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionCentroActividad,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionCentroActividad = new JButtonMe();
		this.jButtonProcesarInformacionCentroActividad.setText("Procesar");
		this.jButtonProcesarInformacionCentroActividad.setToolTipText("Procesar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionCentroActividad.setVisible(false);
			
		this.jButtonProcesarInformacionCentroActividad.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCentroActividad.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionCentroActividad.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesCentroActividad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCentroActividad.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesCentroActividad.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesCentroActividad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCentroActividad.setText("TIPO");       
		this.jComboBoxTiposReportesCentroActividad.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesCentroActividad = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesCentroActividad.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesCentroActividad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionCentroActividad = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionCentroActividad.setText("Paginacion");
		this.jComboBoxTiposPaginacionCentroActividad.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesCentroActividad = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesCentroActividad.setText("Accion");
		this.jComboBoxTiposRelacionesCentroActividad.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesCentroActividad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCentroActividad.setText("Accion");
		this.jComboBoxTiposAccionesCentroActividad.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarCentroActividad = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarCentroActividad.setText("Accion");
		this.jComboBoxTiposSeleccionarCentroActividad.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralCentroActividad=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralCentroActividad.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCentroActividad.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralCentroActividad.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesCentroActividad = new JLabelMe();
		
		this.jLabelAccionesCentroActividad.setText("Acciones");		
		this.jLabelAccionesCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosCentroActividad = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosCentroActividad.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosCentroActividad.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosCentroActividad = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosCentroActividad.setText("Seleccionados");
		this.jCheckBoxSeleccionadosCentroActividad.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaCentroActividad = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaCentroActividad.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaCentroActividad.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteCentroActividad = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteCentroActividad.setText("Graf.");
		this.jCheckBoxConGraficoReporteCentroActividad.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresCentroActividad = new JButtonMe();
		//this.jButtonAnterioresCentroActividad.setText("<<");
        this.jButtonAnterioresCentroActividad.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresCentroActividad,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesCentroActividad = new JButtonMe();
		//this.jButtonSiguientesCentroActividad.setText(">>");
        this.jButtonSiguientesCentroActividad.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesCentroActividad,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosCentroActividad = new JButtonMe();
		this.jButtonNuevoGuardarCambiosCentroActividad.setText("Nue");
        this.jButtonNuevoGuardarCambiosCentroActividad.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosCentroActividad,"nuevoguardarcambios_button","Nue",this.centroactividadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosCentroActividad";
		inputMap = this.jButtonNuevoGuardarCambiosCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosCentroActividad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosCentroActividad"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionCentroActividad";
		inputMap = this.jButtonRecargarInformacionCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionCentroActividad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionCentroActividad"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesCentroActividad";
		inputMap = this.jButtonSiguientesCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesCentroActividad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesCentroActividad"));
		
		//ANTERIORES		
		sMapKey = "AnterioresCentroActividad";
		inputMap = this.jButtonAnterioresCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresCentroActividad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresCentroActividad"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasCentroActividad();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesCentroActividad.setMinimumSize(new Dimension(this.getWidth(),CentroActividadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CentroActividadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCentroActividad.setMaximumSize(new Dimension(this.getWidth(),CentroActividadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CentroActividadBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesCentroActividad.setPreferredSize(new Dimension(this.getWidth(),CentroActividadBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(CentroActividadBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionCentroActividad = new GridBagLayout();

			this.jPanelPaginacionCentroActividad.setLayout(gridaBagLayoutPaginacionCentroActividad);						
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.gridy = 0;
			this.gridBagConstraintsCentroActividad.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionCentroActividad.add(this.jButtonAnterioresCentroActividad, this.gridBagConstraintsCentroActividad);
					
						
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCentroActividad.gridy = 0;
			
			this.jPanelPaginacionCentroActividad.add(this.jButtonNuevoGuardarCambiosCentroActividad, this.gridBagConstraintsCentroActividad);
						
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsCentroActividad.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsCentroActividad.gridy = 0;
			this.jPanelPaginacionCentroActividad.add(this.jButtonSiguientesCentroActividad, this.gridBagConstraintsCentroActividad);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.gridy = 1;
			this.gridBagConstraintsCentroActividad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroActividad.add(this.jButtonNuevoCentroActividad, this.gridBagConstraintsCentroActividad);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsCentroActividad = new GridBagConstraints();
				this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCentroActividad.gridy = 1;
				this.gridBagConstraintsCentroActividad.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionCentroActividad.add(this.jButtonNuevoRelacionesCentroActividad, this.gridBagConstraintsCentroActividad);
			}
			
			
			if(!this.centroactividadSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsCentroActividad = new GridBagConstraints();
				this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsCentroActividad.gridy = 1;
				this.gridBagConstraintsCentroActividad.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionCentroActividad.add(this.jButtonGuardarCambiosTablaCentroActividad, this.gridBagConstraintsCentroActividad);
			}
			
			
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.gridy = 1;
			this.gridBagConstraintsCentroActividad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroActividad.add(this.jButtonDuplicarCentroActividad, this.gridBagConstraintsCentroActividad);
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.gridy = 1;
			this.gridBagConstraintsCentroActividad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroActividad.add(this.jButtonCopiarCentroActividad, this.gridBagConstraintsCentroActividad);
		
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.gridy = 1;
			this.gridBagConstraintsCentroActividad.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionCentroActividad.add(this.jButtonVerFormCentroActividad, this.gridBagConstraintsCentroActividad);
		
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.gridy = 1;
			this.gridBagConstraintsCentroActividad.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionCentroActividad.add(this.jButtonCerrarCentroActividad, this.gridBagConstraintsCentroActividad);
		
		
		
		this.jButtonRecargarInformacionCentroActividad.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCentroActividad.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionCentroActividad.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesCentroActividad.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCentroActividad.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesCentroActividad.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesCentroActividad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCentroActividad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesCentroActividad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesCentroActividad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCentroActividad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesCentroActividad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionCentroActividad.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCentroActividad.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionCentroActividad.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesCentroActividad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCentroActividad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesCentroActividad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesCentroActividad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroActividad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroActividad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarCentroActividad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCentroActividad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarCentroActividad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaCentroActividad.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCentroActividad.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaCentroActividad.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteCentroActividad.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCentroActividad.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteCentroActividad.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosCentroActividad.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCentroActividad.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosCentroActividad.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosCentroActividad.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCentroActividad.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosCentroActividad.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesCentroActividad = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesCentroActividad = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1CentroActividad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2CentroActividad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3CentroActividad = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4CentroActividad = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesCentroActividad.setLayout(gridaBagParametrosReportesCentroActividad);
			this.jPanelParametrosReportesAccionesCentroActividad.setLayout(gridaBagParametrosReportesAccionesCentroActividad);
			
			
			this.jPanelParametrosAuxiliar1CentroActividad.setLayout(gridaBagParametrosAuxiliar1CentroActividad);
			this.jPanelParametrosAuxiliar2CentroActividad.setLayout(gridaBagParametrosAuxiliar2CentroActividad);
			this.jPanelParametrosAuxiliar3CentroActividad.setLayout(gridaBagParametrosAuxiliar3CentroActividad);
			this.jPanelParametrosAuxiliar4CentroActividad.setLayout(gridaBagParametrosAuxiliar4CentroActividad);
			//this.jPanelParametrosAuxiliar5CentroActividad.setLayout(gridaBagParametrosAuxiliar2CentroActividad);			
			
			
			
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroActividad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroActividad.add(this.jButtonRecargarInformacionCentroActividad, this.gridBagConstraintsCentroActividad);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroActividad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CentroActividad.add(this.jComboBoxTiposPaginacionCentroActividad, this.gridBagConstraintsCentroActividad);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroActividad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CentroActividad.add(this.jCheckBoxConAltoMaximoTablaCentroActividad, this.gridBagConstraintsCentroActividad);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroActividad.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1CentroActividad.add(this.jComboBoxTiposArchivosReportesCentroActividad, this.gridBagConstraintsCentroActividad);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroActividad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroActividad.add(this.jPanelParametrosAuxiliar1CentroActividad, this.gridBagConstraintsCentroActividad);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroActividad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4CentroActividad.add(this.jComboBoxTiposReportesCentroActividad, this.gridBagConstraintsCentroActividad);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroActividad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroActividad.add(this.jPanelParametrosAuxiliar4CentroActividad, this.gridBagConstraintsCentroActividad);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsCentroActividad.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroActividad.add(this.jComboBoxTiposReportesCentroActividad, this.gridBagConstraintsCentroActividad);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroActividad.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroActividad.add(this.jCheckBoxGenerarReporteCentroActividad, this.gridBagConstraintsCentroActividad);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroActividad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroActividad.add(this.jPanelParametrosAuxiliar2CentroActividad, this.gridBagConstraintsCentroActividad);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroActividad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroActividad.add(this.jLabelAccionesCentroActividad, this.gridBagConstraintsCentroActividad);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsCentroActividad = new GridBagConstraints();
				this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsCentroActividad.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesCentroActividad.add(this.jButtonAbrirOrderByCentroActividad, this.gridBagConstraintsCentroActividad);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroActividad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroActividad.add(this.jComboBoxTiposSeleccionarCentroActividad, this.gridBagConstraintsCentroActividad);			
			
			
			/*
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsCentroActividad.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesCentroActividad.add(this.jCheckBoxSeleccionarTodosCentroActividad, this.gridBagConstraintsCentroActividad);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroActividad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CentroActividad.add(this.jCheckBoxSeleccionarTodosCentroActividad, this.gridBagConstraintsCentroActividad);															
				
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsCentroActividad.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3CentroActividad.add(this.jCheckBoxSeleccionadosCentroActividad, this.gridBagConstraintsCentroActividad);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroActividad.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesCentroActividad.add(this.jPanelParametrosAuxiliar3CentroActividad, this.gridBagConstraintsCentroActividad);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroActividad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroActividad.add(this.jComboBoxTiposRelacionesCentroActividad, this.gridBagConstraintsCentroActividad);
				
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroActividad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroActividad.add(this.jComboBoxTiposAccionesCentroActividad, this.gridBagConstraintsCentroActividad);
	
				
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsCentroActividad.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesCentroActividad.add(this.jTextFieldValorCampoGeneralCentroActividad, this.gridBagConstraintsCentroActividad);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosCentroActividad = new GridBagLayout();

			this.jScrollPanelDatosCentroActividad.setLayout(gridaBagLayoutDatosCentroActividad);
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.gridy = 0;
			this.gridBagConstraintsCentroActividad.gridx = 0;
			
			this.jScrollPanelDatosCentroActividad.add(this.jTableDatosCentroActividad, this.gridBagConstraintsCentroActividad);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosCentroActividad.setViewportView(this.jTableDatosCentroActividad);
		this.jTableDatosCentroActividad.setFillsViewportHeight(true);
		this.jTableDatosCentroActividad.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCentroActividad= new GridBagLayout();
		this.jPanelAccionesCentroActividad.setLayout(gridaBagLayoutAccionesCentroActividad);
		
		
		/*	
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroActividad.gridy = 0;
		this.gridBagConstraintsCentroActividad.gridx = 0;
			
		this.jPanelAccionesCentroActividad.add(this.jButtonNuevoCentroActividad, this.gridBagConstraintsCentroActividad);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoCentroActividad= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoCentroActividad.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoCentroActividad.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoCentroActividad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoCentroActividad.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoCentroActividad.setLayout(gridaBagLayoutBusquedaPorCodigoCentroActividad);

		gridBagConstraintsCentroActividad = new GridBagConstraints();
		gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroActividad.gridy = 0;
		gridBagConstraintsCentroActividad.gridx = 0;
		jPanelBusquedaPorCodigoCentroActividad.add(jLabelcodigoBusquedaPorCodigoCentroActividad, gridBagConstraintsCentroActividad);

		gridBagConstraintsCentroActividad = new GridBagConstraints();
		gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroActividad.gridy = 0;
		gridBagConstraintsCentroActividad.gridx = 1;
		jPanelBusquedaPorCodigoCentroActividad.add(jTextFieldcodigoBusquedaPorCodigoCentroActividad, gridBagConstraintsCentroActividad);

		gridBagConstraintsCentroActividad = new GridBagConstraints();
		gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroActividad.gridy = 1;
		gridBagConstraintsCentroActividad.gridx =1;
		jPanelBusquedaPorCodigoCentroActividad.add(jButtonBusquedaPorCodigoCentroActividad, gridBagConstraintsCentroActividad);

		jTabbedPaneBusquedasCentroActividad.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoCentroActividad);
		jTabbedPaneBusquedasCentroActividad.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreCentroActividad= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreCentroActividad.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCentroActividad.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreCentroActividad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreCentroActividad.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreCentroActividad.setLayout(gridaBagLayoutBusquedaPorNombreCentroActividad);

		gridBagConstraintsCentroActividad = new GridBagConstraints();
		gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroActividad.gridy = 0;
		gridBagConstraintsCentroActividad.gridx = 0;
		jPanelBusquedaPorNombreCentroActividad.add(jLabelnombreBusquedaPorNombreCentroActividad, gridBagConstraintsCentroActividad);

		gridBagConstraintsCentroActividad = new GridBagConstraints();
		gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroActividad.gridy = 0;
		gridBagConstraintsCentroActividad.gridx = 1;
		jPanelBusquedaPorNombreCentroActividad.add(jTextAreanombreBusquedaPorNombreCentroActividad, gridBagConstraintsCentroActividad);

		gridBagConstraintsCentroActividad = new GridBagConstraints();
		gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroActividad.gridy = 1;
		gridBagConstraintsCentroActividad.gridx =1;
		jPanelBusquedaPorNombreCentroActividad.add(jButtonBusquedaPorNombreCentroActividad, gridBagConstraintsCentroActividad);

		jTabbedPaneBusquedasCentroActividad.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreCentroActividad);
		jTabbedPaneBusquedasCentroActividad.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdTipoGrupoFlujoCajaCentroActividad= new GridBagLayout();
		gridaBagLayoutFK_IdTipoGrupoFlujoCajaCentroActividad.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoGrupoFlujoCajaCentroActividad.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoGrupoFlujoCajaCentroActividad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoGrupoFlujoCajaCentroActividad.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoGrupoFlujoCajaCentroActividad.setLayout(gridaBagLayoutFK_IdTipoGrupoFlujoCajaCentroActividad);

		gridBagConstraintsCentroActividad = new GridBagConstraints();
		gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroActividad.gridy = 0;
		gridBagConstraintsCentroActividad.gridx = 0;
		jPanelFK_IdTipoGrupoFlujoCajaCentroActividad.add(jLabelid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad, gridBagConstraintsCentroActividad);

		gridBagConstraintsCentroActividad = new GridBagConstraints();
		gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroActividad.gridy = 0;
		gridBagConstraintsCentroActividad.gridx = 1;
		jPanelFK_IdTipoGrupoFlujoCajaCentroActividad.add(jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaCentroActividad, gridBagConstraintsCentroActividad);

		gridBagConstraintsCentroActividad = new GridBagConstraints();
		gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroActividad.gridy = 1;
		gridBagConstraintsCentroActividad.gridx =1;
		jPanelFK_IdTipoGrupoFlujoCajaCentroActividad.add(jButtonFK_IdTipoGrupoFlujoCajaCentroActividad, gridBagConstraintsCentroActividad);

		jTabbedPaneBusquedasCentroActividad.addTab("3.-Por Tipo Grupo Flujo Caja ", jPanelFK_IdTipoGrupoFlujoCajaCentroActividad);
		jTabbedPaneBusquedasCentroActividad.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoMovimientoCentroActividad= new GridBagLayout();
		gridaBagLayoutFK_IdTipoMovimientoCentroActividad.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoCentroActividad.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoMovimientoCentroActividad.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoMovimientoCentroActividad.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoMovimientoCentroActividad.setLayout(gridaBagLayoutFK_IdTipoMovimientoCentroActividad);

		gridBagConstraintsCentroActividad = new GridBagConstraints();
		gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroActividad.gridy = 0;
		gridBagConstraintsCentroActividad.gridx = 0;
		jPanelFK_IdTipoMovimientoCentroActividad.add(jLabelid_tipo_movimientoFK_IdTipoMovimientoCentroActividad, gridBagConstraintsCentroActividad);

		gridBagConstraintsCentroActividad = new GridBagConstraints();
		gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroActividad.gridy = 0;
		gridBagConstraintsCentroActividad.gridx = 1;
		jPanelFK_IdTipoMovimientoCentroActividad.add(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoCentroActividad, gridBagConstraintsCentroActividad);

		gridBagConstraintsCentroActividad = new GridBagConstraints();
		gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
		gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsCentroActividad.gridy = 1;
		gridBagConstraintsCentroActividad.gridx =1;
		jPanelFK_IdTipoMovimientoCentroActividad.add(jButtonFK_IdTipoMovimientoCentroActividad, gridBagConstraintsCentroActividad);

		jTabbedPaneBusquedasCentroActividad.addTab("4.-Por Tipo Movimiento ", jPanelFK_IdTipoMovimientoCentroActividad);
		jTabbedPaneBusquedasCentroActividad.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCentroActividad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCentroActividad);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.centroactividadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();						
			this.gridBagConstraintsCentroActividad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCentroActividad.gridx = 0;		
			//this.gridBagConstraintsCentroActividad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCentroActividad.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarCentroActividad, this.gridBagConstraintsCentroActividad);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy = iGridyPrincipal++;
		this.gridBagConstraintsCentroActividad.gridx = 0;		
		//this.gridBagConstraintsCentroActividad.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsCentroActividad.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsCentroActividad);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsCentroActividad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCentroActividad.gridx = 0;		
			this.gridBagConstraintsCentroActividad.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsCentroActividad.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasCentroActividad, this.gridBagConstraintsCentroActividad);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroActividad.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesCentroActividad, this.gridBagConstraintsCentroActividad);								
		
		
		/*
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroActividad.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesCentroActividad, this.gridBagConstraintsCentroActividad);
		*/		
		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCentroActividad.gridx =0;
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCentroActividad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCentroActividad, this.gridBagConstraintsCentroActividad);
				
		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroActividad.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionCentroActividad, this.gridBagConstraintsCentroActividad);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(CentroActividadJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosCentroActividad= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCentroActividad = new GridBagLayout();
			this.jPanelBusquedasParametrosCentroActividad.setLayout(gridaBagLayoutBusquedasParametrosCentroActividad);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralCentroActividad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCentroActividad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroActividad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroActividad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroActividad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCentroActividad, this.gridBagConstraintsCentroActividad);
			
			
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroActividad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCentroActividad, this.gridBagConstraintsCentroActividad);
		
			
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCentroActividad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCentroActividad, this.gridBagConstraintsCentroActividad);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralCentroActividad;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoCentroActividad() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoCentroActividad = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoCentroActividad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoCentroActividad.setName("jPanelReporteDinamicoCentroActividad"); 
		
		this.jPanelReporteDinamicoCentroActividad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCentroActividad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoCentroActividad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoCentroActividad.setLayout(gridaBagLayoutReporteDinamicoCentroActividad);
		
		
		this.jInternalFrameReporteDinamicoCentroActividad= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoCentroActividad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCentroActividad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoCentroActividad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoCentroActividad.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoCentroActividad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoCentroActividad.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoCentroActividad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoCentroActividad.setResizable(true);
	    this.jInternalFrameReporteDinamicoCentroActividad.setClosable(true);
	    this.jInternalFrameReporteDinamicoCentroActividad.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoCentroActividad.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCentroActividad.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoCentroActividad.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Actividades"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteCentroActividad = new JLabelMe();

		this.jLabelColumnasSelectReporteCentroActividad.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroActividad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCentroActividad.add(this.jLabelColumnasSelectReporteCentroActividad, this.gridBagConstraintsCentroActividad);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteCentroActividad = new JList<Reporte>();
		this.jListColumnasSelectReporteCentroActividad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteCentroActividad.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteCentroActividad.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCentroActividad.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteCentroActividad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteCentroActividad=new JScrollPane(this.jListColumnasSelectReporteCentroActividad);
			
			this.jScrollColumnasSelectReporteCentroActividad.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCentroActividad.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteCentroActividad.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroActividad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCentroActividad.add(this.jListColumnasSelectReporteCentroActividad, this.gridBagConstraintsCentroActividad);
		this.jPanelReporteDinamicoCentroActividad.add(this.jScrollColumnasSelectReporteCentroActividad, this.gridBagConstraintsCentroActividad);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteCentroActividad = new JLabelMe();

		this.jLabelRelacionesSelectReporteCentroActividad.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroActividad.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoCentroActividad.add(this.jLabelRelacionesSelectReporteCentroActividad, this.gridBagConstraintsCentroActividad);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteCentroActividad = new JList<Reporte>();
		this.jListRelacionesSelectReporteCentroActividad.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteCentroActividad.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteCentroActividad.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCentroActividad.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteCentroActividad.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteCentroActividad=new JScrollPane(this.jListRelacionesSelectReporteCentroActividad);
			
			this.jScrollRelacionesSelectReporteCentroActividad.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCentroActividad.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteCentroActividad.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroActividad.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoCentroActividad.add(this.jListRelacionesSelectReporteCentroActividad, this.gridBagConstraintsCentroActividad);
		this.jPanelReporteDinamicoCentroActividad.add(this.jScrollRelacionesSelectReporteCentroActividad, this.gridBagConstraintsCentroActividad);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoCentroActividad = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoCentroActividad = new JComboBoxMe();
		this.jListColumnasValoresGraficoCentroActividad = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoCentroActividad = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoCentroActividad.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoCentroActividad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCentroActividad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoCentroActividad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoCentroActividad = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoCentroActividad.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoCentroActividad.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCentroActividad.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoCentroActividad.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoCentroActividad = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoCentroActividad.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroActividad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroActividad.add(this.jLabelGenerarExcelReporteDinamicoCentroActividad, this.gridBagConstraintsCentroActividad);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoCentroActividad = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoCentroActividad.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoCentroActividad,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoCentroActividad.setToolTipText("Generar EXCEL"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		//this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsCentroActividad.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsCentroActividad.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoCentroActividad.add(this.jButtonGenerarExcelReporteDinamicoCentroActividad, this.gridBagConstraintsCentroActividad);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroActividad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroActividad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroActividad.add(this.jComboBoxTiposReportesDinamicoCentroActividad, this.gridBagConstraintsCentroActividad);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoCentroActividad = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoCentroActividad.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsCentroActividad.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoCentroActividad.add(this.jLabelTiposArchivoReporteDinamicoCentroActividad, this.gridBagConstraintsCentroActividad);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroActividad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroActividad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroActividad.add(this.jComboBoxTiposArchivosReportesDinamicoCentroActividad, this.gridBagConstraintsCentroActividad);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoCentroActividad = new JButtonMe();
		this.jButtonGenerarReporteDinamicoCentroActividad.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoCentroActividad,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoCentroActividad.setToolTipText("Generar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroActividad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroActividad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroActividad.add(this.jButtonGenerarReporteDinamicoCentroActividad, this.gridBagConstraintsCentroActividad);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoCentroActividad = new JButtonMe();
		this.jButtonCerrarReporteDinamicoCentroActividad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoCentroActividad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoCentroActividad.setToolTipText("Cancelar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroActividad.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsCentroActividad.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoCentroActividad.add(this.jButtonCerrarReporteDinamicoCentroActividad, this.gridBagConstraintsCentroActividad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalCentroActividad = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoCentroActividad= new JScrollPane(jPanelReporteDinamicoCentroActividad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoCentroActividad.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCentroActividad.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoCentroActividad.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Actividades"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsCentroActividad.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoCentroActividad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoCentroActividad.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalCentroActividad);
		this.jInternalFrameReporteDinamicoCentroActividad.getContentPane().add(this.jScrollPanelReporteDinamicoCentroActividad, this.gridBagConstraintsCentroActividad);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionCentroActividad() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionCentroActividad = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionCentroActividad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionCentroActividad.setName("jPanelImportacionCentroActividad"); 
		
		this.jPanelImportacionCentroActividad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCentroActividad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionCentroActividad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionCentroActividad.setLayout(gridaBagLayoutImportacionCentroActividad);
		
		
		this.jInternalFrameImportacionCentroActividad= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionCentroActividad= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionCentroActividad = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteCentroActividad= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionCentroActividad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCentroActividad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCentroActividad.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionCentroActividad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCentroActividad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCentroActividad.setResizable(true);
	    this.jInternalFrameImportacionCentroActividad.setClosable(true);
	    this.jInternalFrameImportacionCentroActividad.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionCentroActividad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionCentroActividad.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionCentroActividad.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionCentroActividad.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionCentroActividad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionCentroActividad.setResizable(true);
	    this.jInternalFrameImportacionCentroActividad.setClosable(true);
	    this.jInternalFrameImportacionCentroActividad.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionCentroActividad.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCentroActividad.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionCentroActividad.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Actividades"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionCentroActividad = new JLabelMe();

		this.jLabelArchivoImportacionCentroActividad.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = iPosYImportacion;		
		this.gridBagConstraintsCentroActividad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCentroActividad.add(this.jLabelArchivoImportacionCentroActividad, this.gridBagConstraintsCentroActividad);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionCentroActividad = new JFileChooser();		
		this.jFileChooserImportacionCentroActividad.setToolTipText("ESCOGER ARCHIVO"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionCentroActividad = new JButtonMe();
		this.jButtonAbrirImportacionCentroActividad.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionCentroActividad,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionCentroActividad.setToolTipText("Generar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroActividad.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroActividad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroActividad.add(this.jButtonAbrirImportacionCentroActividad, this.gridBagConstraintsCentroActividad);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionCentroActividad = new JLabelMe();

		this.jLabelPathArchivoImportacionCentroActividad.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = iPosYImportacion;		
		this.gridBagConstraintsCentroActividad.gridx = iPosXImportacion++;
			
		this.jPanelImportacionCentroActividad.add(this.jLabelPathArchivoImportacionCentroActividad, this.gridBagConstraintsCentroActividad);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionCentroActividad=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionCentroActividad.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCentroActividad.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionCentroActividad.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroActividad.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroActividad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroActividad.add(this.jTextFieldPathArchivoImportacionCentroActividad, this.gridBagConstraintsCentroActividad);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionCentroActividad = new JButtonMe();
		this.jButtonGenerarImportacionCentroActividad.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionCentroActividad,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionCentroActividad.setToolTipText("Generar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroActividad.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroActividad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroActividad.add(this.jButtonGenerarImportacionCentroActividad, this.gridBagConstraintsCentroActividad);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionCentroActividad = new JButtonMe();
		this.jButtonCerrarImportacionCentroActividad.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionCentroActividad,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionCentroActividad.setToolTipText("Cancelar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroActividad.gridy = iPosYImportacion;
		this.gridBagConstraintsCentroActividad.gridx = iPosXImportacion++;
							
		this.jPanelImportacionCentroActividad.add(this.jButtonCerrarImportacionCentroActividad, this.gridBagConstraintsCentroActividad);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalCentroActividad = new GridBagLayout();
		
		this.jScrollPanelImportacionCentroActividad= new JScrollPane(jPanelImportacionCentroActividad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy =iPosYImportacion;
		this.gridBagConstraintsCentroActividad.gridx =iPosXImportacion;
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionCentroActividad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionCentroActividad.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalCentroActividad);
		this.jInternalFrameImportacionCentroActividad.getContentPane().add(this.jScrollPanelImportacionCentroActividad, this.gridBagConstraintsCentroActividad);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByCentroActividad(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByCentroActividad = new JButtonMe();
			this.jButtonAbrirOrderByCentroActividad.setText("Orden");
			this.jButtonAbrirOrderByCentroActividad.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByCentroActividad,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByCentroActividad";
			inputMap = this.jButtonAbrirOrderByCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByCentroActividad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByCentroActividad"));
		
		
			GridBagLayout gridaBagLayoutOrderByCentroActividad = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByCentroActividad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByCentroActividad.setName("jPanelOrderByCentroActividad"); 
			
			this.jPanelOrderByCentroActividad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCentroActividad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByCentroActividad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByCentroActividad.setLayout(gridaBagLayoutOrderByCentroActividad);
			
			
			this.jTableDatosCentroActividadOrderBy = new JTableMe();        
			this.jTableDatosCentroActividadOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosCentroActividadOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosCentroActividadOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosCentroActividadOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosCentroActividadOrderBy.setViewportView(this.jTableDatosCentroActividadOrderBy);
			this.jTableDatosCentroActividadOrderBy.setFillsViewportHeight(true);
			this.jTableDatosCentroActividadOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByCentroActividad= new OrderByJInternalFrame();
			this.jInternalFrameOrderByCentroActividad= new OrderByJInternalFrame();
			this.jScrollPanelOrderByCentroActividad = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteCentroActividad= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByCentroActividad.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByCentroActividad.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByCentroActividad.setTitle("Orden");
			this.jInternalFrameOrderByCentroActividad.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByCentroActividad.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByCentroActividad.setResizable(true);
			this.jInternalFrameOrderByCentroActividad.setClosable(true);
			this.jInternalFrameOrderByCentroActividad.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByCentroActividad.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCentroActividad.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByCentroActividad.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Actividades"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.gridy =iPosYOrderBy++;
			this.gridBagConstraintsCentroActividad.gridx =iPosXOrderBy;
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsCentroActividad.ipady =150;
				
			this.jPanelOrderByCentroActividad.add(jScrollPanelDatosCentroActividadOrderBy, this.gridBagConstraintsCentroActividad);//this.jTableDatosCentroActividadTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByCentroActividad = new JButtonMe();
			this.jButtonCerrarOrderByCentroActividad.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByCentroActividad,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByCentroActividad.setToolTipText("Cancelar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.gridy = iPosYOrderBy++;
			this.gridBagConstraintsCentroActividad.gridx = iPosXOrderBy;
									
			this.jPanelOrderByCentroActividad.add(this.jButtonCerrarOrderByCentroActividad, this.gridBagConstraintsCentroActividad);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalCentroActividad = new GridBagLayout();
			
			this.jScrollPanelOrderByCentroActividad= new JScrollPane(jPanelOrderByCentroActividad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.gridy =iPosYOrderBy;
			this.gridBagConstraintsCentroActividad.gridx =iPosXOrderBy;
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByCentroActividad.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByCentroActividad.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalCentroActividad);
			
			this.jInternalFrameOrderByCentroActividad.getContentPane().add(this.jScrollPanelOrderByCentroActividad, this.gridBagConstraintsCentroActividad);			
		
		} else {
			this.jButtonAbrirOrderByCentroActividad = new JButtonMe();
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
		int iWidthTableCalculado=0;//2130
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=300;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.centroactividadSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosCentroActividad.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosCentroActividad.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosCentroActividad.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosCentroActividad.getRowHeight();//CentroActividadConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > CentroActividadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCentroActividad.isSelected()) {
					iHeightTable=CentroActividadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CentroActividadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CentroActividadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > CentroActividadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaCentroActividad.isSelected()) {
					iHeightTable=CentroActividadConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < CentroActividadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=CentroActividadConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosCentroActividad.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCentroActividad.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosCentroActividad.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosCentroActividad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCentroActividad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosCentroActividad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByCentroActividad!=null && this.jInternalFrameOrderByCentroActividad.getjTableDatosOrderBy()!=null) {
			//if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByCentroActividad.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByCentroActividad.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByCentroActividad.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByCentroActividad.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByCentroActividad.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByCentroActividad.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByCentroActividad.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosCentroActividad.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCentroActividad.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosCentroActividad.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=centroactividadLogic.getCentroActividads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=centroactividads.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<CentroActividad> TraerCentroActividadBeans(List<CentroActividad> centroactividads,ArrayList<Classe> classes)throws Exception {
		try {
			for(CentroActividad centroactividad:centroactividads) {
					
				if(!(CentroActividadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || CentroActividadConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					centroactividad.setsDetalleGeneralEntityReporte(CentroActividadConstantesFunciones.getCentroActividadDescripcion(centroactividad));
										
					centroactividad.setconsolidado_descripcion(CentroActividadConstantesFunciones.getconsolidadoDescripcion(centroactividad));centroactividad.setcon_proyecto_descripcion(CentroActividadConstantesFunciones.getcon_proyectoDescripcion(centroactividad));	
					
					

					if(centroactividad.getPagoAutos()!=null && Funciones.existeClass(classes,PagoAuto.class)) {
						try{centroactividad.setpagoautosDescripcionReporte(new JRBeanCollectionDataSource(PagoAutoJInternalFrame.TraerPagoAutoBeans(centroactividad.getPagoAutos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(centroactividad.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{centroactividad.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(centroactividad.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(centroactividad.getAutoriPagos()!=null && Funciones.existeClass(classes,AutoriPago.class)) {
						try{centroactividad.setautoripagosDescripcionReporte(new JRBeanCollectionDataSource(AutoriPagoJInternalFrame.TraerAutoriPagoBeans(centroactividad.getAutoriPagos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//centroactividad.setsDetalleGeneralEntityReporte(centroactividad.getsDetalleGeneralEntityReporte());
										
				}
				
				//centroactividadbeans.add(centroactividadbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return centroactividads;
    }
	//PARA REPORTES FIN
}
