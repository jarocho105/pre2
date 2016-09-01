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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;

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
import com.bydan.erp.contabilidad.util.TipoRetencionConstantesFunciones;

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
public class TipoRetencionJInternalFrame extends TipoRetencionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoRetencion;
	
	protected JMenuBar jmenuBarTipoRetencion;
	
	protected JMenu jmenuTipoRetencion;
	protected JMenu jmenuDatosTipoRetencion;
	protected JMenu jmenuArchivoTipoRetencion;
	protected JMenu jmenuAccionesTipoRetencion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRetencion;	
	protected GridBagConstraints gridBagConstraintsTipoRetencion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoRetencionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoRetencion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoRetencion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoRetencion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public TipoRetencionSessionBean tiporetencionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoRetencion> tiporetencions;		
	public List<TipoRetencion> tiporetencionsEliminados;	
	public List<TipoRetencion> tiporetencionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoRetencion;		
	protected JButton jButtonAbrirOrderByTipoRetencion;
	
	
	//protected JPanel jPanelOrderByTipoRetencion;
	//public JScrollPane jScrollPanelOrderByTipoRetencion;	
	//protected JButton jButtonCerrarOrderByTipoRetencion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoRetencionLogic tiporetencionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoRetencion;
	public JScrollPane jScrollPanelDatosEdicionTipoRetencion;
	public JScrollPane jScrollPanelDatosGeneralTipoRetencion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoRetencionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoRetencion;
	//public JScrollPane jScrollPanelImportacionTipoRetencion;
	
	
	
	protected JPanel jPanelAccionesTipoRetencion;
	
    protected JPanel jPanelPaginacionTipoRetencion;
    protected JPanel jPanelParametrosReportesTipoRetencion;
	protected JPanel jPanelParametrosReportesAccionesTipoRetencion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoRetencion;
	protected JPanel jPanelParametrosAuxiliar2TipoRetencion;
	protected JPanel jPanelParametrosAuxiliar3TipoRetencion;
	protected JPanel jPanelParametrosAuxiliar4TipoRetencion;
	//protected JPanel jPanelParametrosAuxiliar5TipoRetencion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoRetencion;
	//protected JPanel jPanelImportacionTipoRetencion;
	
	
	public JTable jTableDatosTipoRetencion;
	
	
	
	//public JTable jTableDatosTipoRetencionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoRetencion;
	protected JButton jButtonDuplicarTipoRetencion;
	protected JButton jButtonCopiarTipoRetencion;
	protected JButton jButtonVerFormTipoRetencion;
	protected JButton jButtonNuevoRelacionesTipoRetencion;
	protected JButton jButtonModificarTipoRetencion;
	
    protected JButton jButtonGuardarCambiosTablaTipoRetencion;
	protected JButton jButtonCerrarTipoRetencion;
	
	
	protected JButton jButtonRecargarInformacionTipoRetencion;
	protected JButton jButtonProcesarInformacionTipoRetencion;
	
	
	protected JButton jButtonAnterioresTipoRetencion;
	protected JButton jButtonSiguientesTipoRetencion;
	protected JButton jButtonNuevoGuardarCambiosTipoRetencion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoRetencion;
	//protected JButton jButtonCerrarReporteDinamicoTipoRetencion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoRetencion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoRetencion;
	//protected JButton jButtonGenerarImportacionTipoRetencion;
	//protected JButton jButtonCerrarImportacionTipoRetencion;
	//protected JFileChooser jFileChooserImportacionTipoRetencion;
	//protected File fileImportacionTipoRetencion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRetencion;
	protected JButton jButtonDuplicarToolBarTipoRetencion;
	protected JButton jButtonNuevoRelacionesToolBarTipoRetencion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoRetencion;
	protected JButton jButtonCopiarToolBarTipoRetencion;
	protected JButton jButtonVerFormToolBarTipoRetencion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoRetencion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRetencion;
	protected JButton jButtonCerrarToolBarTipoRetencion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoRetencion;
	protected JButton jButtonProcesarInformacionToolBarTipoRetencion;
	protected JButton jButtonAnterioresToolBarTipoRetencion;
	protected JButton jButtonSiguientesToolBarTipoRetencion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoRetencion;
	protected JButton jButtonAbrirOrderByToolBarTipoRetencion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRetencion;
	protected JMenuItem jMenuItemDuplicarTipoRetencion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoRetencion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoRetencion;
	protected JMenuItem jMenuItemCopiarTipoRetencion;
	protected JMenuItem jMenuItemVerFormTipoRetencion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRetencion;
	protected JMenuItem jMenuItemCerrarTipoRetencion;
	protected JMenuItem jMenuItemDetalleCerrarTipoRetencion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoRetencion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRetencion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoRetencion;
	protected JMenuItem jMenuItemProcesarInformacionTipoRetencion;
	protected JMenuItem jMenuItemAnterioresTipoRetencion;
	protected JMenuItem jMenuItemSiguientesTipoRetencion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRetencion;
	protected JMenuItem jMenuItemAbrirOrderByTipoRetencion;
	protected JMenuItem jMenuItemMostrarOcultarTipoRetencion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRetencion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoRetencion;
	protected JCheckBox jCheckBoxSeleccionadosTipoRetencion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoRetencion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoRetencion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRetencion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoRetencion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRetencion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoRetencion;
	protected JTextField jTextFieldValorCampoGeneralTipoRetencion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoRetencion;
	//public JList<Reporte> jListColumnasSelectReporteTipoRetencion;
	//public JScrollPane jScrollColumnasSelectReporteTipoRetencion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoRetencion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoRetencion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoRetencion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoRetencion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoRetencion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoRetencion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoRetencion;
	
		
	//public JLabel jLabelArchivoImportacionTipoRetencion;	
	//public JLabel jLabelPathArchivoImportacionTipoRetencion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoRetencion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoRetencion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoRetencion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoRetencion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoRetencion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoRetencion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoRetencion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoRetencion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoRetencion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoRetencion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoRetencion;
	public JPanel jPanelBusquedaPoNombreTipoRetencion;
	public JButton jButtonBusquedaPoNombreTipoRetencion;
	public JPanel jPanelBusquedaPorCodigoSriTipoRetencion;
	public JButton jButtonBusquedaPorCodigoSriTipoRetencion;
	public JPanel jPanelBusquedaPorIdTipoRetencion;
	public JButton jButtonBusquedaPorIdTipoRetencion;
	
	public JPanel jPanelnombreBusquedaPoNombreTipoRetencion;
	public JLabel jLabelnombreBusquedaPoNombreTipoRetencion;
	public JTextArea jTextAreanombreBusquedaPoNombreTipoRetencion;
	public JButton jButtonnombreBusquedaPoNombreTipoRetencionBusqueda= new JButtonMe();

	
	public JPanel jPanelcodigoBusquedaPorCodigoSriTipoRetencion;
	public JLabel jLabelcodigoBusquedaPorCodigoSriTipoRetencion;
	public JTextField jTextFieldcodigoBusquedaPorCodigoSriTipoRetencion;
	public JButton jButtoncodigoBusquedaPorCodigoSriTipoRetencionBusqueda= new JButtonMe();

	
	public JPanel jPanelIdIdBusquedaPorIdTipoRetencion;
	public JLabel jLabelidBusquedaPorIdTipoRetencion;
	public JTextFieldMe jTextFieldidTipoRetencionBusquedaPorId;
	public JButton jButtonidBusquedaPorIdTipoRetencionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoRetencionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoRetencion)	{
		this.jButtonRecargarInformacionTipoRetencion = jButtonRecargarInformacionTipoRetencion;
	}
	
	public JButton getjButtonProcesarInformacionTipoRetencion() {
		return this.jButtonProcesarInformacionTipoRetencion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRetencion)	{
		this.jButtonProcesarInformacionTipoRetencion = jButtonProcesarInformacionTipoRetencion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoRetencion() {
		return this.jButtonRecargarInformacionTipoRetencion;
	}
	
	
	public List<TipoRetencion> gettiporetencions() {
		return this.tiporetencions;
	}

	public void settiporetencions(List<TipoRetencion> tiporetencions) {
		this.tiporetencions = tiporetencions;
	}
	
	public List<TipoRetencion> gettiporetencionsAux() {
		return this.tiporetencionsAux;
	}

	public void settiporetencionsAux(List<TipoRetencion> tiporetencionsAux) {
		this.tiporetencionsAux = tiporetencionsAux;
	}
	
	public List<TipoRetencion> gettiporetencionsEliminados() {
		return this.tiporetencionsEliminados;
	}

	public void setTipoRetencionsEliminados(List<TipoRetencion> tiporetencionsEliminados) {
		this.tiporetencionsEliminados = tiporetencionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoRetencion() {
		return jComboBoxTiposSeleccionarTipoRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoRetencion(
			JComboBox jComboBoxTiposSeleccionarTipoRetencion) {
		this.jComboBoxTiposSeleccionarTipoRetencion = jComboBoxTiposSeleccionarTipoRetencion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoRetencion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoRetencion() {
		return jTextFieldValorCampoGeneralTipoRetencion;
	}

	public void setjTextFieldValorCampoGeneralTipoRetencion(
			JTextField jTextFieldValorCampoGeneralTipoRetencion) {
		this.jTextFieldValorCampoGeneralTipoRetencion = jTextFieldValorCampoGeneralTipoRetencion;
	}

	public void setBorderResaltarValorCampoGeneralTipoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoRetencion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoRetencion() {
		return this.jCheckBoxSeleccionarTodosTipoRetencion;
	}

	public void setjCheckBoxSeleccionarTodosTipoRetencion(
			JCheckBox jCheckBoxSeleccionarTodosTipoRetencion) {
		this.jCheckBoxSeleccionarTodosTipoRetencion = jCheckBoxSeleccionarTodosTipoRetencion;
	}

	public void setBorderResaltarSeleccionarTodosTipoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoRetencion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoRetencion() {
		return this.jCheckBoxSeleccionadosTipoRetencion;
	}

	public void setjCheckBoxSeleccionadosTipoRetencion(
			JCheckBox jCheckBoxSeleccionadosTipoRetencion) {
		this.jCheckBoxSeleccionadosTipoRetencion = jCheckBoxSeleccionadosTipoRetencion;
	}
	
	public void setBorderResaltarSeleccionadosTipoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoRetencion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoRetencion() {
		return this.jComboBoxTiposArchivosReportesTipoRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoRetencion(
			JComboBox jComboBoxTiposArchivosReportesTipoRetencion) {
		this.jComboBoxTiposArchivosReportesTipoRetencion = jComboBoxTiposArchivosReportesTipoRetencion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoRetencion() {
		return this.jComboBoxTiposReportesTipoRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoRetencion(
			JComboBox jComboBoxTiposReportesTipoRetencion) {
		this.jComboBoxTiposReportesTipoRetencion = jComboBoxTiposReportesTipoRetencion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoRetencion() {
	//	return jComboBoxTiposReportesDinamicoTipoRetencion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoRetencion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoRetencion) {
	//	this.jComboBoxTiposReportesDinamicoTipoRetencion = jComboBoxTiposReportesDinamicoTipoRetencion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoRetencion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoRetencion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoRetencion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRetencion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoRetencion = jComboBoxTiposArchivosReportesDinamicoTipoRetencion;
	//}
	
	public void setBorderResaltarTiposReportesTipoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoRetencion() {
		return this.jComboBoxTiposGraficosReportesTipoRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoRetencion(
			JComboBox jComboBoxTiposGraficosReportesTipoRetencion) {
		this.jComboBoxTiposGraficosReportesTipoRetencion = jComboBoxTiposGraficosReportesTipoRetencion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoRetencion() {
		return this.jComboBoxTiposPaginacionTipoRetencion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoRetencion(
			JComboBox jComboBoxTiposPaginacionTipoRetencion) {
		this.jComboBoxTiposPaginacionTipoRetencion = jComboBoxTiposPaginacionTipoRetencion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoRetencion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoRetencion() {
		return this.jComboBoxTiposRelacionesTipoRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRetencion() {
		return this.jComboBoxTiposAccionesTipoRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRetencion(
			JComboBox jComboBoxTiposRelacionesTipoRetencion) {
		this.jComboBoxTiposRelacionesTipoRetencion = jComboBoxTiposRelacionesTipoRetencion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRetencion(
			JComboBox jComboBoxTiposAccionesTipoRetencion) {
		this.jComboBoxTiposAccionesTipoRetencion = jComboBoxTiposAccionesTipoRetencion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoRetencion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoRetencion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRetencion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoRetencion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoRetencion() {
	//	return jCheckBoxConGraficoDinamicoTipoRetencion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoRetencion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoRetencion) {
	//	this.jCheckBoxConGraficoDinamicoTipoRetencion = jCheckBoxConGraficoDinamicoTipoRetencion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoRetencion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoRetencion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoRetencion .setBorder(borderResaltar);		
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
		this.tiporetencionSessionBean=new TipoRetencionSessionBean();
		
		this.tiporetencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporetencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporetencionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRetencionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRetencionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Retencion  MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoRetencionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoRetencion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoRetencion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoRetencion,this.jTtoolBarTipoRetencion,
							"nuevo","nuevo","Nuevo"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoRetencion,this.jTtoolBarTipoRetencion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoRetencion,this.jTtoolBarTipoRetencion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoRetencion,this.jTtoolBarTipoRetencion,
							"duplicar","duplicar","Duplicar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoRetencion,this.jTtoolBarTipoRetencion,
							"copiar","copiar","Copiar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoRetencion,this.jTtoolBarTipoRetencion,
							"ver_form","ver_form","Ver"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRetencion,this.jTtoolBarTipoRetencion,
							"recargar","recargar","Recargar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRetencion,this.jTtoolBarTipoRetencion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRetencion,this.jTtoolBarTipoRetencion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoRetencion,this.jTtoolBarTipoRetencion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoRetencion,this.jTtoolBarTipoRetencion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoRetencion,this.jTtoolBarTipoRetencion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoRetencion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoRetencion,this.jTtoolBarTipoRetencion,
							"cerrar","cerrar","Salir"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoRetencion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoRetencion;
			
				this.jButtonProcesarInformacionToolBarTipoRetencion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoRetencion;
				
		//protected JButton jButtonModificarToolBarTipoRetencion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoRetencion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoRetencion=new JMenuMe("General");
		this.jmenuArchivoTipoRetencion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoRetencion=new JMenuMe("Acciones");
		this.jmenuDatosTipoRetencion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRetencion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRetencion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRetencion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoRetencion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoRetencion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoRetencion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoRetencion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoRetencion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoRetencion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoRetencion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRetencion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRetencion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoRetencion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoRetencion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoRetencion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoRetencion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoRetencion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoRetencion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoRetencion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoRetencion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoRetencion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRetencion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRetencion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRetencion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoRetencion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoRetencion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoRetencion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoRetencion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoRetencion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoRetencion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoRetencion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoRetencion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoRetencion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoRetencion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoRetencion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoRetencion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoRetencion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoRetencion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoRetencion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRetencion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoRetencion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoRetencion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoRetencion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRetencion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRetencion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRetencion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoRetencion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoRetencion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoRetencion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoRetencion.add(this.jMenuItemCerrarTipoRetencion);
			
			this.jmenuAccionesTipoRetencion.add(this.jMenuItemNuevoTipoRetencion);
			this.jmenuAccionesTipoRetencion.add(this.jMenuItemNuevoGuardarCambiosTipoRetencion);
			this.jmenuAccionesTipoRetencion.add(this.jMenuItemNuevoRelacionesTipoRetencion);
			this.jmenuAccionesTipoRetencion.add(this.jMenuItemGuardarCambiosTablaTipoRetencion);		
			this.jmenuAccionesTipoRetencion.add(this.jMenuItemDuplicarTipoRetencion);		
			this.jmenuAccionesTipoRetencion.add(this.jMenuItemCopiarTipoRetencion);		
			this.jmenuAccionesTipoRetencion.add(this.jMenuItemVerFormTipoRetencion);		
			
			this.jmenuDatosTipoRetencion.add(this.jMenuItemRecargarInformacionTipoRetencion);				
			this.jmenuDatosTipoRetencion.add(this.jMenuItemAnterioresTipoRetencion);				
			this.jmenuDatosTipoRetencion.add(this.jMenuItemSiguientesTipoRetencion);				
			this.jmenuDatosTipoRetencion.add(this.jMenuItemAbrirOrderByTipoRetencion);				
			this.jmenuDatosTipoRetencion.add(this.jMenuItemMostrarOcultarTipoRetencion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoRetencion.add(this.jMenuItemGuardarCambiosTipoRetencion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoRetencion.add(this.jmenuArchivoTipoRetencion);		
			this.jmenuBarTipoRetencion.add(this.jmenuAccionesTipoRetencion);		
			this.jmenuBarTipoRetencion.add(this.jmenuDatosTipoRetencion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoRetencion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoRetencion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPoNombreTipoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPoNombreTipoRetencion.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPoNombreTipoRetencion= new JButtonMe();
		this.jButtonBusquedaPoNombreTipoRetencion.setText("Buscar");
		this.jButtonBusquedaPoNombreTipoRetencion.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPoNombreTipoRetencion,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPoNombreTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPoNombreTipoRetencion = new JLabelMe();
		jLabelnombreBusquedaPoNombreTipoRetencion.setText("Nombre :");
		jLabelnombreBusquedaPoNombreTipoRetencion.setToolTipText("Nombre");
		jLabelnombreBusquedaPoNombreTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPoNombreTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPoNombreTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPoNombreTipoRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPoNombreTipoRetencion= new JTextAreaMe();
		jTextAreanombreBusquedaPoNombreTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPoNombreTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPoNombreTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPoNombreTipoRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorCodigoSriTipoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoSriTipoRetencion.setToolTipText("Buscar Por Codigo Sri ");
		this.jButtonBusquedaPorCodigoSriTipoRetencion= new JButtonMe();
		this.jButtonBusquedaPorCodigoSriTipoRetencion.setText("Buscar");
		this.jButtonBusquedaPorCodigoSriTipoRetencion.setToolTipText("Buscar Por Codigo Sri ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoSriTipoRetencion,"buscar_button","Buscar Por Codigo Sri ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoSriTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoSriTipoRetencion = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoSriTipoRetencion.setText("Codigo Sri :");
		jLabelcodigoBusquedaPorCodigoSriTipoRetencion.setToolTipText("Codigo Sri");
		jLabelcodigoBusquedaPorCodigoSriTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoSriTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoSriTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoSriTipoRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoSriTipoRetencion= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoSriTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoSriTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoSriTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoSriTipoRetencion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorIdTipoRetencion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdTipoRetencion.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaPorIdTipoRetencion= new JButtonMe();
		this.jButtonBusquedaPorIdTipoRetencion.setText("Buscar");
		this.jButtonBusquedaPorIdTipoRetencion.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdTipoRetencion,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaPorIdTipoRetencion = new JLabelMe();
		jLabelidBusquedaPorIdTipoRetencion.setText("Id :");
		jLabelidBusquedaPorIdTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaPorIdTipoRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldidTipoRetencionBusquedaPorId= new JTextFieldMe();
		jTextFieldidTipoRetencionBusquedaPorId.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoRetencionBusquedaPorId.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoRetencionBusquedaPorId.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));




		this.jTabbedPaneBusquedasTipoRetencion=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoRetencion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoRetencion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoRetencion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoRetencion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoRetencion = new TipoRetencionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Retencion  DATOS");
			this.jInternalFrameDetalleFormTipoRetencion = new TipoRetencionDetalleFormJInternalFrame(jDesktopPane,this.tiporetencionSessionBean.getConGuardarRelaciones(),this.tiporetencionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoRetencion = null;//new TipoRetencionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRetencion= new GridBagLayout();
		
		
		this.jTableDatosTipoRetencion = new JTableMe();      
		
		String sToolTipTipoRetencion="";
		sToolTipTipoRetencion=TipoRetencionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRetencion+="(Contabilidad.TipoRetencion)";
		}
		
		if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRetencion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoRetencion.setToolTipText(sToolTipTipoRetencion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoRetencion);
		this.jTableDatosTipoRetencion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoRetencion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoRetencion.setRowSelectionAllowed(true);
		this.jTableDatosTipoRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoRetencion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoRetencion = new JButtonMe();
		this.jButtonDuplicarTipoRetencion = new JButtonMe();
		this.jButtonCopiarTipoRetencion = new JButtonMe();
		this.jButtonVerFormTipoRetencion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoRetencion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoRetencion = new JButtonMe();
		this.jButtonCerrarTipoRetencion = new JButtonMe();
		
		this.jScrollPanelDatosTipoRetencion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoRetencion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Retencion ";
		
		if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion s" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRetencion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRetencion.setToolTipText("Acciones");
        this.jPanelAccionesTipoRetencion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoRetencion=new ReporteDinamicoJInternalFrame(TipoRetencionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoRetencion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoRetencion=new ImportacionJInternalFrame(TipoRetencionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoRetencion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoRetencion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoRetencion.setText("Orden");
		this.jButtonAbrirOrderByTipoRetencion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRetencion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRetencion,false,this);
			
			//this.cargarOrderByTipoRetencion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRetencion,true,this);
			
			//this.cargarOrderByTipoRetencion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoRetencion.setMinimumSize(new Dimension(400,50));//1330
		this.jTableDatosTipoRetencion.setMaximumSize(new Dimension(400,50));//1330
		this.jTableDatosTipoRetencion.setPreferredSize(new Dimension(400,50));//1330
		
		this.jScrollPanelDatosTipoRetencion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRetencion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRetencion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoRetencion.setText("Nuevo");
		this.jButtonDuplicarTipoRetencion.setText("Duplicar");
		this.jButtonCopiarTipoRetencion.setText("Copiar");
		this.jButtonVerFormTipoRetencion.setText("Ver");
		this.jButtonNuevoRelacionesTipoRetencion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoRetencion.setText("Guardar");
		this.jButtonCerrarTipoRetencion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRetencion,"nuevo_button","Nuevo",this.tiporetencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoRetencion,"duplicar_button","Duplicar",this.tiporetencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoRetencion,"copiar_button","Copiar",this.tiporetencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoRetencion,"ver_form","Ver",this.tiporetencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoRetencion,"nuevorelaciones_button","Nuevo Rel",this.tiporetencionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRetencion,"guardarcambiostabla_button","Guardar",this.tiporetencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRetencion,"cerrar_button","Salir",this.tiporetencionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoRetencion.setToolTipText("Nuevo"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoRetencion.setToolTipText("Duplicar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoRetencion.setToolTipText("Copiar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoRetencion.setToolTipText("Ver"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoRetencion.setToolTipText("Nuevo Rel"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoRetencion.setToolTipText("Guardar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRetencion.setToolTipText("Salir"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRetencion";
		inputMap = this.jButtonNuevoTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRetencion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoRetencion";
		inputMap = this.jButtonDuplicarTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoRetencion"));
		
		//COPIAR
		sMapKey = "CopiarTipoRetencion";
		inputMap = this.jButtonCopiarTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoRetencion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoRetencion";
		inputMap = this.jButtonVerFormTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoRetencion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoRetencion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoRetencion";
		inputMap = this.jButtonNuevoRelacionesTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoRetencion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoRetencion";
		inputMap = this.jButtonModificarTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoRetencion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoRetencion";
		inputMap = this.jButtonCerrarTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRetencion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRetencion";
		inputMap = this.jButtonGuardarCambiosTablaTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRetencion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoRetencion.setName("jPanelParametrosReportesTipoRetencion"); 
		
		this.jPanelParametrosReportesAccionesTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoRetencion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoRetencion.setName("jPanelParametrosReportesAccionesTipoRetencion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoRetencion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoRetencion = new JButtonMe();
		this.jButtonRecargarInformacionTipoRetencion.setText("Recargar");
		this.jButtonRecargarInformacionTipoRetencion.setToolTipText("Recargar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoRetencion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoRetencion = new JButtonMe();
		this.jButtonProcesarInformacionTipoRetencion.setText("Procesar");
		this.jButtonProcesarInformacionTipoRetencion.setToolTipText("Procesar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoRetencion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoRetencion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRetencion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRetencion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRetencion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoRetencion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRetencion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoRetencion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRetencion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoRetencion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoRetencion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoRetencion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoRetencion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoRetencion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRetencion.setText("Accion");
		this.jComboBoxTiposAccionesTipoRetencion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoRetencion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoRetencion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoRetencion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoRetencion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoRetencion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRetencion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRetencion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoRetencion = new JLabelMe();
		
		this.jLabelAccionesTipoRetencion.setText("Acciones");		
		this.jLabelAccionesTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoRetencion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoRetencion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoRetencion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoRetencion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoRetencion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoRetencion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoRetencion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoRetencion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoRetencion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoRetencion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoRetencion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoRetencion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoRetencion = new JButtonMe();
		//this.jButtonAnterioresTipoRetencion.setText("<<");
        this.jButtonAnterioresTipoRetencion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoRetencion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoRetencion = new JButtonMe();
		//this.jButtonSiguientesTipoRetencion.setText(">>");
        this.jButtonSiguientesTipoRetencion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoRetencion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoRetencion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoRetencion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoRetencion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoRetencion,"nuevoguardarcambios_button","Nue",this.tiporetencionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoRetencion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoRetencion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoRetencion";
		inputMap = this.jButtonRecargarInformacionTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoRetencion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoRetencion";
		inputMap = this.jButtonSiguientesTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoRetencion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoRetencion";
		inputMap = this.jButtonAnterioresTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoRetencion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoRetencion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoRetencion.setMinimumSize(new Dimension(this.getWidth(),TipoRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRetencion.setMaximumSize(new Dimension(this.getWidth(),TipoRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRetencion.setPreferredSize(new Dimension(this.getWidth(),TipoRetencionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRetencionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoRetencion = new GridBagLayout();

			this.jPanelPaginacionTipoRetencion.setLayout(gridaBagLayoutPaginacionTipoRetencion);						
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy = 0;
			this.gridBagConstraintsTipoRetencion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoRetencion.add(this.jButtonAnterioresTipoRetencion, this.gridBagConstraintsTipoRetencion);
					
						
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRetencion.gridy = 0;
			
			this.jPanelPaginacionTipoRetencion.add(this.jButtonNuevoGuardarCambiosTipoRetencion, this.gridBagConstraintsTipoRetencion);
						
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoRetencion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRetencion.gridy = 0;
			this.jPanelPaginacionTipoRetencion.add(this.jButtonSiguientesTipoRetencion, this.gridBagConstraintsTipoRetencion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy = 1;
			this.gridBagConstraintsTipoRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRetencion.add(this.jButtonNuevoTipoRetencion, this.gridBagConstraintsTipoRetencion);
						
			
			
			if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
				this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRetencion.gridy = 1;
				this.gridBagConstraintsTipoRetencion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoRetencion.add(this.jButtonGuardarCambiosTablaTipoRetencion, this.gridBagConstraintsTipoRetencion);
			}
			
			
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy = 1;
			this.gridBagConstraintsTipoRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRetencion.add(this.jButtonDuplicarTipoRetencion, this.gridBagConstraintsTipoRetencion);
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy = 1;
			this.gridBagConstraintsTipoRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRetencion.add(this.jButtonCopiarTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy = 1;
			this.gridBagConstraintsTipoRetencion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRetencion.add(this.jButtonVerFormTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy = 1;
			this.gridBagConstraintsTipoRetencion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoRetencion.add(this.jButtonCerrarTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
		
		
		this.jButtonRecargarInformacionTipoRetencion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRetencion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRetencion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoRetencion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRetencion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRetencion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoRetencion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRetencion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRetencion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoRetencion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRetencion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRetencion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoRetencion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRetencion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRetencion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoRetencion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRetencion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRetencion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoRetencion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRetencion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRetencion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoRetencion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRetencion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRetencion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoRetencion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRetencion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRetencion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoRetencion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoRetencion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoRetencion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoRetencion.setLayout(gridaBagParametrosReportesTipoRetencion);
			this.jPanelParametrosReportesAccionesTipoRetencion.setLayout(gridaBagParametrosReportesAccionesTipoRetencion);
			
			
			this.jPanelParametrosAuxiliar1TipoRetencion.setLayout(gridaBagParametrosAuxiliar1TipoRetencion);
			this.jPanelParametrosAuxiliar2TipoRetencion.setLayout(gridaBagParametrosAuxiliar2TipoRetencion);
			this.jPanelParametrosAuxiliar3TipoRetencion.setLayout(gridaBagParametrosAuxiliar3TipoRetencion);
			this.jPanelParametrosAuxiliar4TipoRetencion.setLayout(gridaBagParametrosAuxiliar4TipoRetencion);
			//this.jPanelParametrosAuxiliar5TipoRetencion.setLayout(gridaBagParametrosAuxiliar2TipoRetencion);			
			
			
			
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRetencion.add(this.jButtonRecargarInformacionTipoRetencion, this.gridBagConstraintsTipoRetencion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRetencion.add(this.jComboBoxTiposPaginacionTipoRetencion, this.gridBagConstraintsTipoRetencion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRetencion.add(this.jCheckBoxConAltoMaximoTablaTipoRetencion, this.gridBagConstraintsTipoRetencion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRetencion.add(this.jComboBoxTiposArchivosReportesTipoRetencion, this.gridBagConstraintsTipoRetencion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRetencion.add(this.jPanelParametrosAuxiliar1TipoRetencion, this.gridBagConstraintsTipoRetencion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoRetencion.add(this.jComboBoxTiposReportesTipoRetencion, this.gridBagConstraintsTipoRetencion);																		
			
			
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TipoRetencion.add(this.jComboBoxTiposGraficosReportesTipoRetencion, this.gridBagConstraintsTipoRetencion);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRetencion.add(this.jPanelParametrosAuxiliar4TipoRetencion, this.gridBagConstraintsTipoRetencion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRetencion.add(this.jComboBoxTiposReportesTipoRetencion, this.gridBagConstraintsTipoRetencion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRetencion.add(this.jCheckBoxGenerarReporteTipoRetencion, this.gridBagConstraintsTipoRetencion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRetencion.add(this.jPanelParametrosAuxiliar2TipoRetencion, this.gridBagConstraintsTipoRetencion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRetencion.add(this.jLabelAccionesTipoRetencion, this.gridBagConstraintsTipoRetencion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
				this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoRetencion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoRetencion.add(this.jButtonAbrirOrderByTipoRetencion, this.gridBagConstraintsTipoRetencion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRetencion.add(this.jComboBoxTiposSeleccionarTipoRetencion, this.gridBagConstraintsTipoRetencion);			
			
			
			/*
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRetencion.add(this.jCheckBoxSeleccionarTodosTipoRetencion, this.gridBagConstraintsTipoRetencion);
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRetencion.add(this.jCheckBoxConGraficoReporteTipoRetencion, this.gridBagConstraintsTipoRetencion);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRetencion.add(this.jCheckBoxSeleccionarTodosTipoRetencion, this.gridBagConstraintsTipoRetencion);															
				
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRetencion.add(this.jCheckBoxSeleccionadosTipoRetencion, this.gridBagConstraintsTipoRetencion);															
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRetencion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRetencion.add(this.jCheckBoxConGraficoReporteTipoRetencion, this.gridBagConstraintsTipoRetencion);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRetencion.add(this.jPanelParametrosAuxiliar3TipoRetencion, this.gridBagConstraintsTipoRetencion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRetencion.add(this.jComboBoxTiposRelacionesTipoRetencion, this.gridBagConstraintsTipoRetencion);
				
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRetencion.add(this.jComboBoxTiposAccionesTipoRetencion, this.gridBagConstraintsTipoRetencion);
	
				
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRetencion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRetencion.add(this.jTextFieldValorCampoGeneralTipoRetencion, this.gridBagConstraintsTipoRetencion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoRetencion = new GridBagLayout();

			this.jScrollPanelDatosTipoRetencion.setLayout(gridaBagLayoutDatosTipoRetencion);
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy = 0;
			this.gridBagConstraintsTipoRetencion.gridx = 0;
			
			this.jScrollPanelDatosTipoRetencion.add(this.jTableDatosTipoRetencion, this.gridBagConstraintsTipoRetencion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoRetencion.setViewportView(this.jTableDatosTipoRetencion);
		this.jTableDatosTipoRetencion.setFillsViewportHeight(true);
		this.jTableDatosTipoRetencion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoRetencion= new GridBagLayout();
		this.jPanelAccionesTipoRetencion.setLayout(gridaBagLayoutAccionesTipoRetencion);
		
		
		/*	
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencion.gridy = 0;
		this.gridBagConstraintsTipoRetencion.gridx = 0;
			
		this.jPanelAccionesTipoRetencion.add(this.jButtonNuevoTipoRetencion, this.gridBagConstraintsTipoRetencion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPoNombreTipoRetencion= new GridBagLayout();
		gridaBagLayoutBusquedaPoNombreTipoRetencion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPoNombreTipoRetencion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPoNombreTipoRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPoNombreTipoRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPoNombreTipoRetencion.setLayout(gridaBagLayoutBusquedaPoNombreTipoRetencion);

		gridBagConstraintsTipoRetencion = new GridBagConstraints();
		gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencion.gridy = 0;
		gridBagConstraintsTipoRetencion.gridx = 0;
		jPanelBusquedaPoNombreTipoRetencion.add(jLabelnombreBusquedaPoNombreTipoRetencion, gridBagConstraintsTipoRetencion);

		gridBagConstraintsTipoRetencion = new GridBagConstraints();
		gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencion.gridy = 0;
		gridBagConstraintsTipoRetencion.gridx = 1;
		jPanelBusquedaPoNombreTipoRetencion.add(jTextAreanombreBusquedaPoNombreTipoRetencion, gridBagConstraintsTipoRetencion);

		gridBagConstraintsTipoRetencion = new GridBagConstraints();
		gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencion.gridy = 1;
		gridBagConstraintsTipoRetencion.gridx =1;
		jPanelBusquedaPoNombreTipoRetencion.add(jButtonBusquedaPoNombreTipoRetencion, gridBagConstraintsTipoRetencion);

		jTabbedPaneBusquedasTipoRetencion.addTab("1.-Por Nombre ", jPanelBusquedaPoNombreTipoRetencion);
		jTabbedPaneBusquedasTipoRetencion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorCodigoSriTipoRetencion= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoSriTipoRetencion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoSriTipoRetencion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoSriTipoRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoSriTipoRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoSriTipoRetencion.setLayout(gridaBagLayoutBusquedaPorCodigoSriTipoRetencion);

		gridBagConstraintsTipoRetencion = new GridBagConstraints();
		gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencion.gridy = 0;
		gridBagConstraintsTipoRetencion.gridx = 0;
		jPanelBusquedaPorCodigoSriTipoRetencion.add(jLabelcodigoBusquedaPorCodigoSriTipoRetencion, gridBagConstraintsTipoRetencion);

		gridBagConstraintsTipoRetencion = new GridBagConstraints();
		gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencion.gridy = 0;
		gridBagConstraintsTipoRetencion.gridx = 1;
		jPanelBusquedaPorCodigoSriTipoRetencion.add(jTextFieldcodigoBusquedaPorCodigoSriTipoRetencion, gridBagConstraintsTipoRetencion);

		gridBagConstraintsTipoRetencion = new GridBagConstraints();
		gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencion.gridy = 1;
		gridBagConstraintsTipoRetencion.gridx =1;
		jPanelBusquedaPorCodigoSriTipoRetencion.add(jButtonBusquedaPorCodigoSriTipoRetencion, gridBagConstraintsTipoRetencion);

		jTabbedPaneBusquedasTipoRetencion.addTab("2.-Por Codigo Sri ", jPanelBusquedaPorCodigoSriTipoRetencion);
		jTabbedPaneBusquedasTipoRetencion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorIdTipoRetencion= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdTipoRetencion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoRetencion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdTipoRetencion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdTipoRetencion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdTipoRetencion.setLayout(gridaBagLayoutBusquedaPorIdTipoRetencion);

		gridBagConstraintsTipoRetencion = new GridBagConstraints();
		gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencion.gridy = 0;
		gridBagConstraintsTipoRetencion.gridx = 0;
		jPanelBusquedaPorIdTipoRetencion.add(jLabelidBusquedaPorIdTipoRetencion, gridBagConstraintsTipoRetencion);

		gridBagConstraintsTipoRetencion = new GridBagConstraints();
		gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencion.gridy = 0;
		gridBagConstraintsTipoRetencion.gridx = 1;
		jPanelBusquedaPorIdTipoRetencion.add(jTextFieldidTipoRetencionBusquedaPorId, gridBagConstraintsTipoRetencion);

		gridBagConstraintsTipoRetencion = new GridBagConstraints();
		gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRetencion.gridy = 1;
		gridBagConstraintsTipoRetencion.gridx =1;
		jPanelBusquedaPorIdTipoRetencion.add(jButtonBusquedaPorIdTipoRetencion, gridBagConstraintsTipoRetencion);

		jTabbedPaneBusquedasTipoRetencion.addTab("3.-Por Id ", jPanelBusquedaPorIdTipoRetencion);
		jTabbedPaneBusquedasTipoRetencion.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRetencion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRetencion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporetencionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();						
			this.gridBagConstraintsTipoRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRetencion.gridx = 0;		
			//this.gridBagConstraintsTipoRetencion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRetencion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoRetencion, this.gridBagConstraintsTipoRetencion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoRetencion.gridx = 0;		
		//this.gridBagConstraintsTipoRetencion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoRetencion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoRetencion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoRetencion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRetencion.gridx = 0;		
			this.gridBagConstraintsTipoRetencion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoRetencion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoRetencion, this.gridBagConstraintsTipoRetencion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoRetencion, this.gridBagConstraintsTipoRetencion);								
		
		
		/*
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoRetencion, this.gridBagConstraintsTipoRetencion);
		*/		
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRetencion.gridx =0;
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRetencion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRetencion, this.gridBagConstraintsTipoRetencion);
				
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoRetencion, this.gridBagConstraintsTipoRetencion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoRetencionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoRetencion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRetencion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoRetencion.setLayout(gridaBagLayoutBusquedasParametrosTipoRetencion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoRetencion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRetencion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRetencion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRetencion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRetencion, this.gridBagConstraintsTipoRetencion);
			
			
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
			
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRetencion, this.gridBagConstraintsTipoRetencion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoRetencion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoRetencion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoRetencion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoRetencion.setName("jPanelReporteDinamicoTipoRetencion"); 
		
		this.jPanelReporteDinamicoTipoRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoRetencion.setLayout(gridaBagLayoutReporteDinamicoTipoRetencion);
		
		
		this.jInternalFrameReporteDinamicoTipoRetencion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoRetencion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRetencion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoRetencion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoRetencion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoRetencion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoRetencion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoRetencion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion s"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoRetencion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoRetencion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRetencion.add(this.jLabelColumnasSelectReporteTipoRetencion, this.gridBagConstraintsTipoRetencion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoRetencion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoRetencion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoRetencion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRetencion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoRetencion=new JScrollPane(this.jListColumnasSelectReporteTipoRetencion);
			
			this.jScrollColumnasSelectReporteTipoRetencion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRetencion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRetencion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRetencion.add(this.jListColumnasSelectReporteTipoRetencion, this.gridBagConstraintsTipoRetencion);
		this.jPanelReporteDinamicoTipoRetencion.add(this.jScrollColumnasSelectReporteTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoRetencion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoRetencion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoRetencion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoRetencion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoRetencion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRetencion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoRetencion=new JScrollPane(this.jListRelacionesSelectReporteTipoRetencion);
			
			this.jScrollRelacionesSelectReporteTipoRetencion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRetencion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRetencion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoRetencion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoRetencion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoRetencion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoRetencion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoRetencion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoRetencion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRetencion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRetencion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRetencion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRetencion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTipoRetencion = new JLabelMe();

		this.jLabelConGraficoDinamicoTipoRetencion.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRetencion.add(this.jLabelConGraficoDinamicoTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTipoRetencion = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTipoRetencion.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTipoRetencion.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTipoRetencion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTipoRetencion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTipoRetencion.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRetencion.add(this.jCheckBoxConGraficoDinamicoTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTipoRetencion = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTipoRetencion.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRetencion.add(this.jLabelColumnaCategoriaGraficoTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTipoRetencion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTipoRetencion.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTipoRetencion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTipoRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTipoRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTipoRetencion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTipoRetencion.add(this.jComboBoxColumnaCategoriaGraficoTipoRetencion, this.gridBagConstraintsTipoRetencion);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTipoRetencion = new JLabelMe();

		this.jLabelColumnaCategoriaValorTipoRetencion.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRetencion.add(this.jLabelColumnaCategoriaValorTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTipoRetencion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTipoRetencion.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTipoRetencion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTipoRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTipoRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTipoRetencion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTipoRetencion.add(this.jComboBoxColumnaCategoriaValorTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTipoRetencion = new JLabelMe();

		this.jLabelColumnasValoresGraficoTipoRetencion.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRetencion.add(this.jLabelColumnasValoresGraficoTipoRetencion, this.gridBagConstraintsTipoRetencion);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTipoRetencion = new JList<Reporte>();
		this.jListColumnasValoresGraficoTipoRetencion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTipoRetencion.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTipoRetencion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTipoRetencion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTipoRetencion.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTipoRetencion=new JScrollPane(this.jListColumnasValoresGraficoTipoRetencion);
			
			this.jScrollColumnasValoresGraficoTipoRetencion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTipoRetencion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTipoRetencion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTipoRetencion.add(this.jListColumnasSelectReporteTipoRetencion, this.gridBagConstraintsTipoRetencion);
		this.jPanelReporteDinamicoTipoRetencion.add(this.jScrollColumnasValoresGraficoTipoRetencion, this.gridBagConstraintsTipoRetencion);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTipoRetencion = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTipoRetencion.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRetencion.add(this.jLabelTiposGraficosReportesDinamicoTipoRetencion, this.gridBagConstraintsTipoRetencion);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTipoRetencion = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTipoRetencion.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTipoRetencion.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTipoRetencion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTipoRetencion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTipoRetencion.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRetencion.add(this.jComboBoxTiposGraficosReportesDinamicoTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoRetencion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoRetencion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRetencion.add(this.jLabelGenerarExcelReporteDinamicoTipoRetencion, this.gridBagConstraintsTipoRetencion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoRetencion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoRetencion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoRetencion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoRetencion.setToolTipText("Generar EXCEL"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoRetencion.add(this.jButtonGenerarExcelReporteDinamicoTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRetencion.add(this.jComboBoxTiposReportesDinamicoTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoRetencion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoRetencion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRetencion.add(this.jLabelTiposArchivoReporteDinamicoTipoRetencion, this.gridBagConstraintsTipoRetencion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRetencion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoRetencion, this.gridBagConstraintsTipoRetencion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoRetencion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoRetencion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoRetencion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoRetencion.setToolTipText("Generar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRetencion.add(this.jButtonGenerarReporteDinamicoTipoRetencion, this.gridBagConstraintsTipoRetencion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoRetencion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoRetencion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoRetencion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoRetencion.setToolTipText("Cancelar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRetencion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRetencion.add(this.jButtonCerrarReporteDinamicoTipoRetencion, this.gridBagConstraintsTipoRetencion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoRetencion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoRetencion= new JScrollPane(jPanelReporteDinamicoTipoRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoRetencion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRetencion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRetencion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion s"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoRetencion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoRetencion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoRetencion);
		this.jInternalFrameReporteDinamicoTipoRetencion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoRetencion, this.gridBagConstraintsTipoRetencion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoRetencion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoRetencion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoRetencion.setName("jPanelImportacionTipoRetencion"); 
		
		this.jPanelImportacionTipoRetencion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRetencion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRetencion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoRetencion.setLayout(gridaBagLayoutImportacionTipoRetencion);
		
		
		this.jInternalFrameImportacionTipoRetencion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoRetencion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoRetencion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRetencion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRetencion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoRetencion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRetencion.setResizable(true);
	    this.jInternalFrameImportacionTipoRetencion.setClosable(true);
	    this.jInternalFrameImportacionTipoRetencion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRetencion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRetencion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoRetencion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRetencion.setResizable(true);
	    this.jInternalFrameImportacionTipoRetencion.setClosable(true);
	    this.jInternalFrameImportacionTipoRetencion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoRetencion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRetencion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRetencion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion s"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoRetencion = new JLabelMe();

		this.jLabelArchivoImportacionTipoRetencion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRetencion.add(this.jLabelArchivoImportacionTipoRetencion, this.gridBagConstraintsTipoRetencion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoRetencion = new JFileChooser();		
		this.jFileChooserImportacionTipoRetencion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoRetencion = new JButtonMe();
		this.jButtonAbrirImportacionTipoRetencion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoRetencion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoRetencion.setToolTipText("Generar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRetencion.add(this.jButtonAbrirImportacionTipoRetencion, this.gridBagConstraintsTipoRetencion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoRetencion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoRetencion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoRetencion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRetencion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRetencion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRetencion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRetencion.add(this.jLabelPathArchivoImportacionTipoRetencion, this.gridBagConstraintsTipoRetencion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoRetencion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoRetencion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRetencion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRetencion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRetencion.add(this.jTextFieldPathArchivoImportacionTipoRetencion, this.gridBagConstraintsTipoRetencion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoRetencion = new JButtonMe();
		this.jButtonGenerarImportacionTipoRetencion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoRetencion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoRetencion.setToolTipText("Generar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRetencion.add(this.jButtonGenerarImportacionTipoRetencion, this.gridBagConstraintsTipoRetencion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoRetencion = new JButtonMe();
		this.jButtonCerrarImportacionTipoRetencion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoRetencion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoRetencion.setToolTipText("Cancelar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRetencion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRetencion.add(this.jButtonCerrarImportacionTipoRetencion, this.gridBagConstraintsTipoRetencion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoRetencion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoRetencion= new JScrollPane(jPanelImportacionTipoRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoRetencion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoRetencion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoRetencion);
		this.jInternalFrameImportacionTipoRetencion.getContentPane().add(this.jScrollPanelImportacionTipoRetencion, this.gridBagConstraintsTipoRetencion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoRetencion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoRetencion = new JButtonMe();
			this.jButtonAbrirOrderByTipoRetencion.setText("Orden");
			this.jButtonAbrirOrderByTipoRetencion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRetencion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoRetencion";
			inputMap = this.jButtonAbrirOrderByTipoRetencion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoRetencion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoRetencion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoRetencion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoRetencion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoRetencion.setName("jPanelOrderByTipoRetencion"); 
			
			this.jPanelOrderByTipoRetencion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRetencion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRetencion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoRetencion.setLayout(gridaBagLayoutOrderByTipoRetencion);
			
			
			this.jTableDatosTipoRetencionOrderBy = new JTableMe();        
			this.jTableDatosTipoRetencionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoRetencionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoRetencionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoRetencionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoRetencionOrderBy.setViewportView(this.jTableDatosTipoRetencionOrderBy);
			this.jTableDatosTipoRetencionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoRetencionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoRetencion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoRetencion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoRetencion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoRetencion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoRetencion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoRetencion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoRetencion.setTitle("Orden");
			this.jInternalFrameOrderByTipoRetencion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoRetencion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoRetencion.setResizable(true);
			this.jInternalFrameOrderByTipoRetencion.setClosable(true);
			this.jInternalFrameOrderByTipoRetencion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoRetencion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRetencion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRetencion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoRetencion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion s"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoRetencion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoRetencion.ipady =150;
				
			this.jPanelOrderByTipoRetencion.add(jScrollPanelDatosTipoRetencionOrderBy, this.gridBagConstraintsTipoRetencion);//this.jTableDatosTipoRetencionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoRetencion = new JButtonMe();
			this.jButtonCerrarOrderByTipoRetencion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoRetencion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoRetencion.setToolTipText("Cancelar"+" "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoRetencion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoRetencion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoRetencion.add(this.jButtonCerrarOrderByTipoRetencion, this.gridBagConstraintsTipoRetencion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoRetencion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoRetencion= new JScrollPane(jPanelOrderByTipoRetencion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoRetencion = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoRetencion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRetencion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoRetencion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoRetencion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoRetencion);
			
			this.jInternalFrameOrderByTipoRetencion.getContentPane().add(this.jScrollPanelOrderByTipoRetencion, this.gridBagConstraintsTipoRetencion);			
		
		} else {
			this.jButtonAbrirOrderByTipoRetencion = new JButtonMe();
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
		int iWidthTableCalculado=0;//2630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=1330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tiporetencionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoRetencion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoRetencion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoRetencion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoRetencion.getRowHeight();//TipoRetencionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRetencion.isSelected()) {
					iHeightTable=TipoRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRetencion.isSelected()) {
					iHeightTable=TipoRetencionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRetencionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoRetencion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRetencion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRetencion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoRetencion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRetencion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRetencion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoRetencion!=null && this.jInternalFrameOrderByTipoRetencion.getjTableDatosOrderBy()!=null) {
			//if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoRetencion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoRetencion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoRetencion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoRetencion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoRetencion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoRetencion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoRetencion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoRetencion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRetencion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRetencion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiporetencionLogic.getTipoRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporetencions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoRetencion> TraerTipoRetencionBeans(List<TipoRetencion> tiporetencions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoRetencion tiporetencion:tiporetencions) {
					
				if(!(TipoRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiporetencion.setsDetalleGeneralEntityReporte(TipoRetencionConstantesFunciones.getTipoRetencionDescripcion(tiporetencion));
										
					tiporetencion.setes_retencion_iva_descripcion(TipoRetencionConstantesFunciones.getes_retencion_ivaDescripcion(tiporetencion));tiporetencion.setes_debito_descripcion(TipoRetencionConstantesFunciones.getes_debitoDescripcion(tiporetencion));tiporetencion.setes_con_iva_factura_descripcion(TipoRetencionConstantesFunciones.getes_con_iva_facturaDescripcion(tiporetencion));tiporetencion.setes_con_sub_total_factura_descripcion(TipoRetencionConstantesFunciones.getes_con_sub_total_facturaDescripcion(tiporetencion));tiporetencion.setes_con_secuencial_descripcion(TipoRetencionConstantesFunciones.getes_con_secuencialDescripcion(tiporetencion));	
					
						
					
				} else  {
							
					//tiporetencion.setsDetalleGeneralEntityReporte(tiporetencion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiporetencionbeans.add(tiporetencionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiporetencions;
    }
	//PARA REPORTES FIN
}
