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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;

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
import com.bydan.erp.inventario.util.TipoListaPrecioConstantesFunciones;

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
public class TipoListaPrecioJInternalFrame extends TipoListaPrecioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoListaPrecio;
	
	protected JMenuBar jmenuBarTipoListaPrecio;
	
	protected JMenu jmenuTipoListaPrecio;
	protected JMenu jmenuDatosTipoListaPrecio;
	protected JMenu jmenuArchivoTipoListaPrecio;
	protected JMenu jmenuAccionesTipoListaPrecio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoListaPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoListaPrecio;	
	protected GridBagConstraints gridBagConstraintsTipoListaPrecio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoListaPrecioDetalleFormJInternalFrame jInternalFrameDetalleFormTipoListaPrecio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoListaPrecio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoListaPrecio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoListaPrecioSessionBean tipolistaprecioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoListaPrecio> tipolistaprecios;		
	public List<TipoListaPrecio> tipolistapreciosEliminados;	
	public List<TipoListaPrecio> tipolistapreciosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoListaPrecio;		
	protected JButton jButtonAbrirOrderByTipoListaPrecio;
	
	
	//protected JPanel jPanelOrderByTipoListaPrecio;
	//public JScrollPane jScrollPanelOrderByTipoListaPrecio;	
	//protected JButton jButtonCerrarOrderByTipoListaPrecio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoListaPrecioLogic tipolistaprecioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoListaPrecio;
	public JScrollPane jScrollPanelDatosEdicionTipoListaPrecio;
	public JScrollPane jScrollPanelDatosGeneralTipoListaPrecio;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoListaPrecioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoListaPrecio;
	//public JScrollPane jScrollPanelImportacionTipoListaPrecio;
	
	
	
	protected JPanel jPanelAccionesTipoListaPrecio;
	
    protected JPanel jPanelPaginacionTipoListaPrecio;
    protected JPanel jPanelParametrosReportesTipoListaPrecio;
	protected JPanel jPanelParametrosReportesAccionesTipoListaPrecio;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoListaPrecio;
	protected JPanel jPanelParametrosAuxiliar2TipoListaPrecio;
	protected JPanel jPanelParametrosAuxiliar3TipoListaPrecio;
	protected JPanel jPanelParametrosAuxiliar4TipoListaPrecio;
	//protected JPanel jPanelParametrosAuxiliar5TipoListaPrecio;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoListaPrecio;
	//protected JPanel jPanelImportacionTipoListaPrecio;
	
	
	public JTable jTableDatosTipoListaPrecio;
	
	
	
	//public JTable jTableDatosTipoListaPrecioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoListaPrecio;
	protected JButton jButtonDuplicarTipoListaPrecio;
	protected JButton jButtonCopiarTipoListaPrecio;
	protected JButton jButtonVerFormTipoListaPrecio;
	protected JButton jButtonNuevoRelacionesTipoListaPrecio;
	protected JButton jButtonModificarTipoListaPrecio;
	
    protected JButton jButtonGuardarCambiosTablaTipoListaPrecio;
	protected JButton jButtonCerrarTipoListaPrecio;
	
	
	protected JButton jButtonRecargarInformacionTipoListaPrecio;
	protected JButton jButtonProcesarInformacionTipoListaPrecio;
	
	
	protected JButton jButtonAnterioresTipoListaPrecio;
	protected JButton jButtonSiguientesTipoListaPrecio;
	protected JButton jButtonNuevoGuardarCambiosTipoListaPrecio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoListaPrecio;
	//protected JButton jButtonCerrarReporteDinamicoTipoListaPrecio;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoListaPrecio;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoListaPrecio;
	//protected JButton jButtonGenerarImportacionTipoListaPrecio;
	//protected JButton jButtonCerrarImportacionTipoListaPrecio;
	//protected JFileChooser jFileChooserImportacionTipoListaPrecio;
	//protected File fileImportacionTipoListaPrecio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoListaPrecio;
	protected JButton jButtonDuplicarToolBarTipoListaPrecio;
	protected JButton jButtonNuevoRelacionesToolBarTipoListaPrecio;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoListaPrecio;
	protected JButton jButtonCopiarToolBarTipoListaPrecio;
	protected JButton jButtonVerFormToolBarTipoListaPrecio;
	public JButton jButtonGuardarCambiosTablaToolBarTipoListaPrecio;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoListaPrecio;
	protected JButton jButtonCerrarToolBarTipoListaPrecio;
	
	protected JButton jButtonRecargarInformacionToolBarTipoListaPrecio;
	protected JButton jButtonProcesarInformacionToolBarTipoListaPrecio;
	protected JButton jButtonAnterioresToolBarTipoListaPrecio;
	protected JButton jButtonSiguientesToolBarTipoListaPrecio;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoListaPrecio;
	protected JButton jButtonAbrirOrderByToolBarTipoListaPrecio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoListaPrecio;
	protected JMenuItem jMenuItemDuplicarTipoListaPrecio;
	protected JMenuItem jMenuItemNuevoRelacionesTipoListaPrecio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoListaPrecio;
	protected JMenuItem jMenuItemCopiarTipoListaPrecio;
	protected JMenuItem jMenuItemVerFormTipoListaPrecio;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoListaPrecio;
	protected JMenuItem jMenuItemCerrarTipoListaPrecio;
	protected JMenuItem jMenuItemDetalleCerrarTipoListaPrecio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoListaPrecio;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoListaPrecio;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoListaPrecio;
	protected JMenuItem jMenuItemProcesarInformacionTipoListaPrecio;
	protected JMenuItem jMenuItemAnterioresTipoListaPrecio;
	protected JMenuItem jMenuItemSiguientesTipoListaPrecio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoListaPrecio;
	protected JMenuItem jMenuItemAbrirOrderByTipoListaPrecio;
	protected JMenuItem jMenuItemMostrarOcultarTipoListaPrecio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoListaPrecio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoListaPrecio;
	protected JCheckBox jCheckBoxSeleccionadosTipoListaPrecio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoListaPrecio;
	protected JCheckBox jCheckBoxConGraficoReporteTipoListaPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoListaPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoListaPrecio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoListaPrecio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoListaPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoListaPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoListaPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoListaPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoListaPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoListaPrecio;
	protected JTextField jTextFieldValorCampoGeneralTipoListaPrecio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoListaPrecio;
	//public JList<Reporte> jListColumnasSelectReporteTipoListaPrecio;
	//public JScrollPane jScrollColumnasSelectReporteTipoListaPrecio;
	
	//public JLabel jLabelRelacionesSelectReporteTipoListaPrecio;
	//public JList<Reporte> jListRelacionesSelectReporteTipoListaPrecio;
	//public JScrollPane jScrollRelacionesSelectReporteTipoListaPrecio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoListaPrecio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoListaPrecio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoListaPrecio;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoListaPrecio;
	
		
	//public JLabel jLabelArchivoImportacionTipoListaPrecio;	
	//public JLabel jLabelPathArchivoImportacionTipoListaPrecio;
	//protected JTextField jTextFieldPathArchivoImportacionTipoListaPrecio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoListaPrecio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoListaPrecio;
	
	//public JLabel jLabelColumnaCategoriaValorTipoListaPrecio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoListaPrecio;
	
	//public JLabel jLabelColumnasValoresGraficoTipoListaPrecio;
	//public JList<Reporte> jListColumnasValoresGraficoTipoListaPrecio;
	//public JScrollPane jScrollColumnasValoresGraficoTipoListaPrecio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoListaPrecio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoListaPrecio;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoListaPrecio;
	
	
	
	
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
	//public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoListaPrecioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoListaPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoListaPrecioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoListaPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoListaPrecioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoListaPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoListaPrecioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoListaPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoListaPrecio)	{
		this.jButtonRecargarInformacionTipoListaPrecio = jButtonRecargarInformacionTipoListaPrecio;
	}
	
	public JButton getjButtonProcesarInformacionTipoListaPrecio() {
		return this.jButtonProcesarInformacionTipoListaPrecio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoListaPrecio)	{
		this.jButtonProcesarInformacionTipoListaPrecio = jButtonProcesarInformacionTipoListaPrecio;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoListaPrecio() {
		return this.jButtonRecargarInformacionTipoListaPrecio;
	}
	
	
	public List<TipoListaPrecio> gettipolistaprecios() {
		return this.tipolistaprecios;
	}

	public void settipolistaprecios(List<TipoListaPrecio> tipolistaprecios) {
		this.tipolistaprecios = tipolistaprecios;
	}
	
	public List<TipoListaPrecio> gettipolistapreciosAux() {
		return this.tipolistapreciosAux;
	}

	public void settipolistapreciosAux(List<TipoListaPrecio> tipolistapreciosAux) {
		this.tipolistapreciosAux = tipolistapreciosAux;
	}
	
	public List<TipoListaPrecio> gettipolistapreciosEliminados() {
		return this.tipolistapreciosEliminados;
	}

	public void setTipoListaPreciosEliminados(List<TipoListaPrecio> tipolistapreciosEliminados) {
		this.tipolistapreciosEliminados = tipolistapreciosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoListaPrecio() {
		return jComboBoxTiposSeleccionarTipoListaPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoListaPrecio(
			JComboBox jComboBoxTiposSeleccionarTipoListaPrecio) {
		this.jComboBoxTiposSeleccionarTipoListaPrecio = jComboBoxTiposSeleccionarTipoListaPrecio;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoListaPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoListaPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoListaPrecio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoListaPrecio() {
		return jTextFieldValorCampoGeneralTipoListaPrecio;
	}

	public void setjTextFieldValorCampoGeneralTipoListaPrecio(
			JTextField jTextFieldValorCampoGeneralTipoListaPrecio) {
		this.jTextFieldValorCampoGeneralTipoListaPrecio = jTextFieldValorCampoGeneralTipoListaPrecio;
	}

	public void setBorderResaltarValorCampoGeneralTipoListaPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoListaPrecio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoListaPrecio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoListaPrecio() {
		return this.jCheckBoxSeleccionarTodosTipoListaPrecio;
	}

	public void setjCheckBoxSeleccionarTodosTipoListaPrecio(
			JCheckBox jCheckBoxSeleccionarTodosTipoListaPrecio) {
		this.jCheckBoxSeleccionarTodosTipoListaPrecio = jCheckBoxSeleccionarTodosTipoListaPrecio;
	}

	public void setBorderResaltarSeleccionarTodosTipoListaPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoListaPrecio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoListaPrecio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoListaPrecio() {
		return this.jCheckBoxSeleccionadosTipoListaPrecio;
	}

	public void setjCheckBoxSeleccionadosTipoListaPrecio(
			JCheckBox jCheckBoxSeleccionadosTipoListaPrecio) {
		this.jCheckBoxSeleccionadosTipoListaPrecio = jCheckBoxSeleccionadosTipoListaPrecio;
	}
	
	public void setBorderResaltarSeleccionadosTipoListaPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoListaPrecio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoListaPrecio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoListaPrecio() {
		return this.jComboBoxTiposArchivosReportesTipoListaPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoListaPrecio(
			JComboBox jComboBoxTiposArchivosReportesTipoListaPrecio) {
		this.jComboBoxTiposArchivosReportesTipoListaPrecio = jComboBoxTiposArchivosReportesTipoListaPrecio;
	}

	public void setBorderResaltarTiposArchivosReportesTipoListaPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoListaPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoListaPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoListaPrecio() {
		return this.jComboBoxTiposReportesTipoListaPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoListaPrecio(
			JComboBox jComboBoxTiposReportesTipoListaPrecio) {
		this.jComboBoxTiposReportesTipoListaPrecio = jComboBoxTiposReportesTipoListaPrecio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoListaPrecio() {
	//	return jComboBoxTiposReportesDinamicoTipoListaPrecio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoListaPrecio(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoListaPrecio) {
	//	this.jComboBoxTiposReportesDinamicoTipoListaPrecio = jComboBoxTiposReportesDinamicoTipoListaPrecio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoListaPrecio() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoListaPrecio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoListaPrecio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoListaPrecio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoListaPrecio = jComboBoxTiposArchivosReportesDinamicoTipoListaPrecio;
	//}
	
	public void setBorderResaltarTiposReportesTipoListaPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoListaPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoListaPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoListaPrecio() {
		return this.jComboBoxTiposGraficosReportesTipoListaPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoListaPrecio(
			JComboBox jComboBoxTiposGraficosReportesTipoListaPrecio) {
		this.jComboBoxTiposGraficosReportesTipoListaPrecio = jComboBoxTiposGraficosReportesTipoListaPrecio;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoListaPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoListaPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoListaPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoListaPrecio() {
		return this.jComboBoxTiposPaginacionTipoListaPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoListaPrecio(
			JComboBox jComboBoxTiposPaginacionTipoListaPrecio) {
		this.jComboBoxTiposPaginacionTipoListaPrecio = jComboBoxTiposPaginacionTipoListaPrecio;
	}
	
	public void setBorderResaltarTiposPaginacionTipoListaPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoListaPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoListaPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoListaPrecio() {
		return this.jComboBoxTiposRelacionesTipoListaPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoListaPrecio() {
		return this.jComboBoxTiposAccionesTipoListaPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoListaPrecio(
			JComboBox jComboBoxTiposRelacionesTipoListaPrecio) {
		this.jComboBoxTiposRelacionesTipoListaPrecio = jComboBoxTiposRelacionesTipoListaPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoListaPrecio(
			JComboBox jComboBoxTiposAccionesTipoListaPrecio) {
		this.jComboBoxTiposAccionesTipoListaPrecio = jComboBoxTiposAccionesTipoListaPrecio;
	}
	
	public void setBorderResaltarTiposRelacionesTipoListaPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoListaPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoListaPrecio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoListaPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoListaPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoListaPrecio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoListaPrecio() {
	//	return jCheckBoxConGraficoDinamicoTipoListaPrecio;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoListaPrecio(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoListaPrecio) {
	//	this.jCheckBoxConGraficoDinamicoTipoListaPrecio = jCheckBoxConGraficoDinamicoTipoListaPrecio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoListaPrecio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoListaPrecio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoListaPrecio .setBorder(borderResaltar);		
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
		this.tipolistaprecioSessionBean=new TipoListaPrecioSessionBean();
		
		this.tipolistaprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipolistaprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipolistaprecioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoListaPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoListaPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoListaPrecioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoListaPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoListaPrecioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Lista Precio MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoListaPrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoListaPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoListaPrecio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoListaPrecio,this.jTtoolBarTipoListaPrecio,
							"nuevo","nuevo","Nuevo"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoListaPrecio,this.jTtoolBarTipoListaPrecio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoListaPrecio,this.jTtoolBarTipoListaPrecio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoListaPrecio,this.jTtoolBarTipoListaPrecio,
							"duplicar","duplicar","Duplicar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoListaPrecio,this.jTtoolBarTipoListaPrecio,
							"copiar","copiar","Copiar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoListaPrecio,this.jTtoolBarTipoListaPrecio,
							"ver_form","ver_form","Ver"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoListaPrecio,this.jTtoolBarTipoListaPrecio,
							"recargar","recargar","Recargar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoListaPrecio,this.jTtoolBarTipoListaPrecio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoListaPrecio,this.jTtoolBarTipoListaPrecio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoListaPrecio,this.jTtoolBarTipoListaPrecio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoListaPrecio,this.jTtoolBarTipoListaPrecio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoListaPrecio,this.jTtoolBarTipoListaPrecio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoListaPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoListaPrecio,this.jTtoolBarTipoListaPrecio,
							"cerrar","cerrar","Salir"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoListaPrecio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoListaPrecio;
			
				this.jButtonProcesarInformacionToolBarTipoListaPrecio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoListaPrecio;
				
		//protected JButton jButtonModificarToolBarTipoListaPrecio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoListaPrecio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoListaPrecio=new JMenuMe("General");
		this.jmenuArchivoTipoListaPrecio=new JMenuMe("Archivo");
		this.jmenuAccionesTipoListaPrecio=new JMenuMe("Acciones");
		this.jmenuDatosTipoListaPrecio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoListaPrecio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoListaPrecio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoListaPrecio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoListaPrecio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoListaPrecio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoListaPrecio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoListaPrecio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoListaPrecio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoListaPrecio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoListaPrecio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoListaPrecio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoListaPrecio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoListaPrecio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoListaPrecio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoListaPrecio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoListaPrecio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoListaPrecio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoListaPrecio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoListaPrecio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoListaPrecio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoListaPrecio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoListaPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoListaPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoListaPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoListaPrecio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoListaPrecio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoListaPrecio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoListaPrecio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoListaPrecio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoListaPrecio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoListaPrecio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoListaPrecio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoListaPrecio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoListaPrecio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoListaPrecio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoListaPrecio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoListaPrecio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoListaPrecio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoListaPrecio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoListaPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoListaPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoListaPrecio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoListaPrecio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoListaPrecio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoListaPrecio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoListaPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoListaPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoListaPrecio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoListaPrecio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoListaPrecio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoListaPrecio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoListaPrecio.add(this.jMenuItemCerrarTipoListaPrecio);
			
			this.jmenuAccionesTipoListaPrecio.add(this.jMenuItemNuevoTipoListaPrecio);
			this.jmenuAccionesTipoListaPrecio.add(this.jMenuItemNuevoGuardarCambiosTipoListaPrecio);
			this.jmenuAccionesTipoListaPrecio.add(this.jMenuItemNuevoRelacionesTipoListaPrecio);
			this.jmenuAccionesTipoListaPrecio.add(this.jMenuItemGuardarCambiosTablaTipoListaPrecio);		
			this.jmenuAccionesTipoListaPrecio.add(this.jMenuItemDuplicarTipoListaPrecio);		
			this.jmenuAccionesTipoListaPrecio.add(this.jMenuItemCopiarTipoListaPrecio);		
			this.jmenuAccionesTipoListaPrecio.add(this.jMenuItemVerFormTipoListaPrecio);		
			
			this.jmenuDatosTipoListaPrecio.add(this.jMenuItemRecargarInformacionTipoListaPrecio);				
			this.jmenuDatosTipoListaPrecio.add(this.jMenuItemAnterioresTipoListaPrecio);				
			this.jmenuDatosTipoListaPrecio.add(this.jMenuItemSiguientesTipoListaPrecio);				
			this.jmenuDatosTipoListaPrecio.add(this.jMenuItemAbrirOrderByTipoListaPrecio);				
			this.jmenuDatosTipoListaPrecio.add(this.jMenuItemMostrarOcultarTipoListaPrecio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoListaPrecio.add(this.jMenuItemGuardarCambiosTipoListaPrecio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoListaPrecio.add(this.jmenuArchivoTipoListaPrecio);		
			this.jmenuBarTipoListaPrecio.add(this.jmenuAccionesTipoListaPrecio);		
			this.jmenuBarTipoListaPrecio.add(this.jmenuDatosTipoListaPrecio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoListaPrecio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoListaPrecio() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		

		this.jTabbedPaneBusquedasTipoListaPrecio=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoListaPrecio.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoListaPrecio.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoListaPrecio.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoListaPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoListaPrecio = new TipoListaPrecioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Lista Precio DATOS");
			this.jInternalFrameDetalleFormTipoListaPrecio = new TipoListaPrecioDetalleFormJInternalFrame(jDesktopPane,this.tipolistaprecioSessionBean.getConGuardarRelaciones(),this.tipolistaprecioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoListaPrecio = null;//new TipoListaPrecioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoListaPrecio= new GridBagLayout();
		
		
		this.jTableDatosTipoListaPrecio = new JTableMe();      
		
		String sToolTipTipoListaPrecio="";
		sToolTipTipoListaPrecio=TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoListaPrecio+="(Inventario.TipoListaPrecio)";
		}
		
		if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoListaPrecio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoListaPrecio.setToolTipText(sToolTipTipoListaPrecio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoListaPrecio);
		this.jTableDatosTipoListaPrecio.setAutoCreateRowSorter(true);
		this.jTableDatosTipoListaPrecio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoListaPrecio.setRowSelectionAllowed(true);
		this.jTableDatosTipoListaPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoListaPrecio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoListaPrecio = new JButtonMe();
		this.jButtonDuplicarTipoListaPrecio = new JButtonMe();
		this.jButtonCopiarTipoListaPrecio = new JButtonMe();
		this.jButtonVerFormTipoListaPrecio = new JButtonMe();
		this.jButtonNuevoRelacionesTipoListaPrecio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoListaPrecio = new JButtonMe();
		this.jButtonCerrarTipoListaPrecio = new JButtonMe();
		
		this.jScrollPanelDatosTipoListaPrecio = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoListaPrecio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoListaPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Lista Precio";
		
		if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Lista Precioes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoListaPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoListaPrecio.setToolTipText("Acciones");
        this.jPanelAccionesTipoListaPrecio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoListaPrecio=new ReporteDinamicoJInternalFrame(TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoListaPrecio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoListaPrecio=new ImportacionJInternalFrame(TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoListaPrecio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoListaPrecio = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoListaPrecio.setText("Orden");
		this.jButtonAbrirOrderByTipoListaPrecio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoListaPrecio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoListaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoListaPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoListaPrecio,false,this);
			
			//this.cargarOrderByTipoListaPrecio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoListaPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoListaPrecio,true,this);
			
			//this.cargarOrderByTipoListaPrecio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoListaPrecio.setMinimumSize(new Dimension(400,50));//830
		this.jTableDatosTipoListaPrecio.setMaximumSize(new Dimension(400,50));//830
		this.jTableDatosTipoListaPrecio.setPreferredSize(new Dimension(400,50));//830
		
		this.jScrollPanelDatosTipoListaPrecio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoListaPrecio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoListaPrecio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoListaPrecio.setText("Nuevo");
		this.jButtonDuplicarTipoListaPrecio.setText("Duplicar");
		this.jButtonCopiarTipoListaPrecio.setText("Copiar");
		this.jButtonVerFormTipoListaPrecio.setText("Ver");
		this.jButtonNuevoRelacionesTipoListaPrecio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoListaPrecio.setText("Guardar");
		this.jButtonCerrarTipoListaPrecio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoListaPrecio,"nuevo_button","Nuevo",this.tipolistaprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoListaPrecio,"duplicar_button","Duplicar",this.tipolistaprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoListaPrecio,"copiar_button","Copiar",this.tipolistaprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoListaPrecio,"ver_form","Ver",this.tipolistaprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoListaPrecio,"nuevorelaciones_button","Nuevo Rel",this.tipolistaprecioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoListaPrecio,"guardarcambiostabla_button","Guardar",this.tipolistaprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoListaPrecio,"cerrar_button","Salir",this.tipolistaprecioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoListaPrecio.setToolTipText("Nuevo"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoListaPrecio.setToolTipText("Duplicar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoListaPrecio.setToolTipText("Copiar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoListaPrecio.setToolTipText("Ver"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoListaPrecio.setToolTipText("Nuevo Rel"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoListaPrecio.setToolTipText("Guardar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoListaPrecio.setToolTipText("Salir"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoListaPrecio";
		inputMap = this.jButtonNuevoTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoListaPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoListaPrecio"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoListaPrecio";
		inputMap = this.jButtonDuplicarTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoListaPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoListaPrecio"));
		
		//COPIAR
		sMapKey = "CopiarTipoListaPrecio";
		inputMap = this.jButtonCopiarTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoListaPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoListaPrecio"));
		
		//VEr FORM
		sMapKey = "VerFormTipoListaPrecio";
		inputMap = this.jButtonVerFormTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoListaPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoListaPrecio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoListaPrecio";
		inputMap = this.jButtonNuevoRelacionesTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoListaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoListaPrecio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoListaPrecio";
		inputMap = this.jButtonModificarTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoListaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoListaPrecio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoListaPrecio";
		inputMap = this.jButtonCerrarTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoListaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoListaPrecio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoListaPrecio";
		inputMap = this.jButtonGuardarCambiosTablaTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoListaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoListaPrecio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoListaPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoListaPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoListaPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoListaPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoListaPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoListaPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoListaPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoListaPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoListaPrecio.setName("jPanelParametrosReportesTipoListaPrecio"); 
		
		this.jPanelParametrosReportesAccionesTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoListaPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoListaPrecio.setName("jPanelParametrosReportesAccionesTipoListaPrecio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoListaPrecio = new JButtonMe();
		this.jButtonRecargarInformacionTipoListaPrecio.setText("Recargar");
		this.jButtonRecargarInformacionTipoListaPrecio.setToolTipText("Recargar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoListaPrecio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoListaPrecio = new JButtonMe();
		this.jButtonProcesarInformacionTipoListaPrecio.setText("Procesar");
		this.jButtonProcesarInformacionTipoListaPrecio.setToolTipText("Procesar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoListaPrecio.setVisible(false);
			
		this.jButtonProcesarInformacionTipoListaPrecio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoListaPrecio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoListaPrecio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoListaPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoListaPrecio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoListaPrecio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoListaPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoListaPrecio.setText("TIPO");       
		this.jComboBoxTiposReportesTipoListaPrecio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoListaPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoListaPrecio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoListaPrecio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoListaPrecio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoListaPrecio.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoListaPrecio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoListaPrecio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoListaPrecio.setText("Accion");
		this.jComboBoxTiposRelacionesTipoListaPrecio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoListaPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoListaPrecio.setText("Accion");
		this.jComboBoxTiposAccionesTipoListaPrecio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoListaPrecio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoListaPrecio.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoListaPrecio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoListaPrecio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoListaPrecio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoListaPrecio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoListaPrecio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoListaPrecio = new JLabelMe();
		
		this.jLabelAccionesTipoListaPrecio.setText("Acciones");		
		this.jLabelAccionesTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoListaPrecio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoListaPrecio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoListaPrecio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoListaPrecio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoListaPrecio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoListaPrecio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoListaPrecio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoListaPrecio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoListaPrecio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoListaPrecio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoListaPrecio.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoListaPrecio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoListaPrecio = new JButtonMe();
		//this.jButtonAnterioresTipoListaPrecio.setText("<<");
        this.jButtonAnterioresTipoListaPrecio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoListaPrecio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoListaPrecio = new JButtonMe();
		//this.jButtonSiguientesTipoListaPrecio.setText(">>");
        this.jButtonSiguientesTipoListaPrecio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoListaPrecio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoListaPrecio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoListaPrecio.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoListaPrecio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoListaPrecio,"nuevoguardarcambios_button","Nue",this.tipolistaprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoListaPrecio";
		inputMap = this.jButtonNuevoGuardarCambiosTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoListaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoListaPrecio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoListaPrecio";
		inputMap = this.jButtonRecargarInformacionTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoListaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoListaPrecio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoListaPrecio";
		inputMap = this.jButtonSiguientesTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoListaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoListaPrecio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoListaPrecio";
		inputMap = this.jButtonAnterioresTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoListaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoListaPrecio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoListaPrecio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoListaPrecio.setMinimumSize(new Dimension(this.getWidth(),TipoListaPrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoListaPrecioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoListaPrecio.setMaximumSize(new Dimension(this.getWidth(),TipoListaPrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoListaPrecioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoListaPrecio.setPreferredSize(new Dimension(this.getWidth(),TipoListaPrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoListaPrecioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoListaPrecio = new GridBagLayout();

			this.jPanelPaginacionTipoListaPrecio.setLayout(gridaBagLayoutPaginacionTipoListaPrecio);						
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoListaPrecio.gridy = 0;
			this.gridBagConstraintsTipoListaPrecio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoListaPrecio.add(this.jButtonAnterioresTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
					
						
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoListaPrecio.gridy = 0;
			
			this.jPanelPaginacionTipoListaPrecio.add(this.jButtonNuevoGuardarCambiosTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
						
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoListaPrecio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoListaPrecio.gridy = 0;
			this.jPanelPaginacionTipoListaPrecio.add(this.jButtonSiguientesTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoListaPrecio.gridy = 1;
			this.gridBagConstraintsTipoListaPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoListaPrecio.add(this.jButtonNuevoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
				this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoListaPrecio.gridy = 1;
				this.gridBagConstraintsTipoListaPrecio.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoListaPrecio.add(this.jButtonNuevoRelacionesTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
			}
			
			
			if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
				this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoListaPrecio.gridy = 1;
				this.gridBagConstraintsTipoListaPrecio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoListaPrecio.add(this.jButtonGuardarCambiosTablaTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
			}
			
			
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoListaPrecio.gridy = 1;
			this.gridBagConstraintsTipoListaPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoListaPrecio.add(this.jButtonDuplicarTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoListaPrecio.gridy = 1;
			this.gridBagConstraintsTipoListaPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoListaPrecio.add(this.jButtonCopiarTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoListaPrecio.gridy = 1;
			this.gridBagConstraintsTipoListaPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoListaPrecio.add(this.jButtonVerFormTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoListaPrecio.gridy = 1;
			this.gridBagConstraintsTipoListaPrecio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoListaPrecio.add(this.jButtonCerrarTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		
		
		
		this.jButtonRecargarInformacionTipoListaPrecio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoListaPrecio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoListaPrecio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoListaPrecio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoListaPrecio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoListaPrecio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoListaPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoListaPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoListaPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoListaPrecio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoListaPrecio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoListaPrecio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoListaPrecio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoListaPrecio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoListaPrecio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoListaPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoListaPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoListaPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoListaPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoListaPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoListaPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoListaPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoListaPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoListaPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoListaPrecio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoListaPrecio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoListaPrecio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoListaPrecio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoListaPrecio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoListaPrecio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoListaPrecio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoListaPrecio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoListaPrecio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoListaPrecio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoListaPrecio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoListaPrecio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoListaPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoListaPrecio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoListaPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoListaPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoListaPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoListaPrecio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoListaPrecio.setLayout(gridaBagParametrosReportesTipoListaPrecio);
			this.jPanelParametrosReportesAccionesTipoListaPrecio.setLayout(gridaBagParametrosReportesAccionesTipoListaPrecio);
			
			
			this.jPanelParametrosAuxiliar1TipoListaPrecio.setLayout(gridaBagParametrosAuxiliar1TipoListaPrecio);
			this.jPanelParametrosAuxiliar2TipoListaPrecio.setLayout(gridaBagParametrosAuxiliar2TipoListaPrecio);
			this.jPanelParametrosAuxiliar3TipoListaPrecio.setLayout(gridaBagParametrosAuxiliar3TipoListaPrecio);
			this.jPanelParametrosAuxiliar4TipoListaPrecio.setLayout(gridaBagParametrosAuxiliar4TipoListaPrecio);
			//this.jPanelParametrosAuxiliar5TipoListaPrecio.setLayout(gridaBagParametrosAuxiliar2TipoListaPrecio);			
			
			
			
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoListaPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoListaPrecio.add(this.jButtonRecargarInformacionTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoListaPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoListaPrecio.add(this.jComboBoxTiposPaginacionTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoListaPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoListaPrecio.add(this.jCheckBoxConAltoMaximoTablaTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoListaPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoListaPrecio.add(this.jComboBoxTiposArchivosReportesTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoListaPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoListaPrecio.add(this.jPanelParametrosAuxiliar1TipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoListaPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoListaPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoListaPrecio.add(this.jComboBoxTiposReportesTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoListaPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoListaPrecio.add(this.jPanelParametrosAuxiliar4TipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoListaPrecio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoListaPrecio.add(this.jComboBoxTiposReportesTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoListaPrecio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoListaPrecio.add(this.jCheckBoxGenerarReporteTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoListaPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoListaPrecio.add(this.jPanelParametrosAuxiliar2TipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoListaPrecio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoListaPrecio.add(this.jLabelAccionesTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
				this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoListaPrecio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoListaPrecio.add(this.jButtonAbrirOrderByTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoListaPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoListaPrecio.add(this.jComboBoxTiposSeleccionarTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);			
			
			
			/*
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoListaPrecio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoListaPrecio.add(this.jCheckBoxSeleccionarTodosTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoListaPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoListaPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoListaPrecio.add(this.jCheckBoxSeleccionarTodosTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);															
				
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoListaPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoListaPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoListaPrecio.add(this.jCheckBoxSeleccionadosTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoListaPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoListaPrecio.add(this.jPanelParametrosAuxiliar3TipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoListaPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoListaPrecio.add(this.jComboBoxTiposRelacionesTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
				
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoListaPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoListaPrecio.add(this.jComboBoxTiposAccionesTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
	
				
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoListaPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoListaPrecio.add(this.jTextFieldValorCampoGeneralTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoListaPrecio = new GridBagLayout();

			this.jScrollPanelDatosTipoListaPrecio.setLayout(gridaBagLayoutDatosTipoListaPrecio);
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoListaPrecio.gridy = 0;
			this.gridBagConstraintsTipoListaPrecio.gridx = 0;
			
			this.jScrollPanelDatosTipoListaPrecio.add(this.jTableDatosTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoListaPrecio.setViewportView(this.jTableDatosTipoListaPrecio);
		this.jTableDatosTipoListaPrecio.setFillsViewportHeight(true);
		this.jTableDatosTipoListaPrecio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoListaPrecio= new GridBagLayout();
		this.jPanelAccionesTipoListaPrecio.setLayout(gridaBagLayoutAccionesTipoListaPrecio);
		
		
		/*	
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = 0;
		this.gridBagConstraintsTipoListaPrecio.gridx = 0;
			
		this.jPanelAccionesTipoListaPrecio.add(this.jButtonNuevoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoListaPrecio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoListaPrecio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();						
			this.gridBagConstraintsTipoListaPrecio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoListaPrecio.gridx = 0;		
			//this.gridBagConstraintsTipoListaPrecio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoListaPrecio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoListaPrecio.gridx = 0;		
		//this.gridBagConstraintsTipoListaPrecio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoListaPrecio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoListaPrecio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoListaPrecio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoListaPrecio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);								
		
		
		/*
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoListaPrecio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		*/		
		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoListaPrecio.gridx =0;
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoListaPrecio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
				
		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoListaPrecio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoListaPrecioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoListaPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoListaPrecio = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoListaPrecio.setLayout(gridaBagLayoutBusquedasParametrosTipoListaPrecio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoListaPrecio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoListaPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoListaPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoListaPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoListaPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
			
			
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoListaPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		
			
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoListaPrecio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoListaPrecio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoListaPrecio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoListaPrecio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoListaPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoListaPrecio.setName("jPanelReporteDinamicoTipoListaPrecio"); 
		
		this.jPanelReporteDinamicoTipoListaPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoListaPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoListaPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoListaPrecio.setLayout(gridaBagLayoutReporteDinamicoTipoListaPrecio);
		
		
		this.jInternalFrameReporteDinamicoTipoListaPrecio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoListaPrecio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoListaPrecio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoListaPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoListaPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoListaPrecio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoListaPrecio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoListaPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoListaPrecio.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoListaPrecio.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoListaPrecio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoListaPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoListaPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoListaPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Lista Precioes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoListaPrecio = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoListaPrecio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoListaPrecio.add(this.jLabelColumnasSelectReporteTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoListaPrecio = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoListaPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoListaPrecio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoListaPrecio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoListaPrecio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoListaPrecio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoListaPrecio=new JScrollPane(this.jListColumnasSelectReporteTipoListaPrecio);
			
			this.jScrollColumnasSelectReporteTipoListaPrecio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoListaPrecio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoListaPrecio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoListaPrecio.add(this.jListColumnasSelectReporteTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		this.jPanelReporteDinamicoTipoListaPrecio.add(this.jScrollColumnasSelectReporteTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoListaPrecio = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoListaPrecio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoListaPrecio.add(this.jLabelRelacionesSelectReporteTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoListaPrecio = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoListaPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoListaPrecio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoListaPrecio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoListaPrecio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoListaPrecio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoListaPrecio=new JScrollPane(this.jListRelacionesSelectReporteTipoListaPrecio);
			
			this.jScrollRelacionesSelectReporteTipoListaPrecio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoListaPrecio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoListaPrecio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoListaPrecio.add(this.jListRelacionesSelectReporteTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		this.jPanelReporteDinamicoTipoListaPrecio.add(this.jScrollRelacionesSelectReporteTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoListaPrecio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoListaPrecio = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoListaPrecio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoListaPrecio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoListaPrecio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoListaPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoListaPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoListaPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoListaPrecio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoListaPrecio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoListaPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoListaPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoListaPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoListaPrecio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoListaPrecio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoListaPrecio.add(this.jLabelGenerarExcelReporteDinamicoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoListaPrecio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoListaPrecio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoListaPrecio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoListaPrecio.setToolTipText("Generar EXCEL"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoListaPrecio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoListaPrecio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoListaPrecio.add(this.jButtonGenerarExcelReporteDinamicoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoListaPrecio.add(this.jComboBoxTiposReportesDinamicoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoListaPrecio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoListaPrecio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoListaPrecio.add(this.jLabelTiposArchivoReporteDinamicoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoListaPrecio.add(this.jComboBoxTiposArchivosReportesDinamicoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoListaPrecio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoListaPrecio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoListaPrecio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoListaPrecio.setToolTipText("Generar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoListaPrecio.add(this.jButtonGenerarReporteDinamicoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoListaPrecio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoListaPrecio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoListaPrecio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoListaPrecio.setToolTipText("Cancelar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoListaPrecio.add(this.jButtonCerrarReporteDinamicoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoListaPrecio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoListaPrecio= new JScrollPane(jPanelReporteDinamicoTipoListaPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoListaPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoListaPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoListaPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Lista Precioes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoListaPrecio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoListaPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoListaPrecio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoListaPrecio);
		this.jInternalFrameReporteDinamicoTipoListaPrecio.getContentPane().add(this.jScrollPanelReporteDinamicoTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoListaPrecio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoListaPrecio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoListaPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoListaPrecio.setName("jPanelImportacionTipoListaPrecio"); 
		
		this.jPanelImportacionTipoListaPrecio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoListaPrecio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoListaPrecio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoListaPrecio.setLayout(gridaBagLayoutImportacionTipoListaPrecio);
		
		
		this.jInternalFrameImportacionTipoListaPrecio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoListaPrecio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoListaPrecio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoListaPrecio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoListaPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoListaPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoListaPrecio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoListaPrecio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoListaPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoListaPrecio.setResizable(true);
	    this.jInternalFrameImportacionTipoListaPrecio.setClosable(true);
	    this.jInternalFrameImportacionTipoListaPrecio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoListaPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoListaPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoListaPrecio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoListaPrecio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoListaPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoListaPrecio.setResizable(true);
	    this.jInternalFrameImportacionTipoListaPrecio.setClosable(true);
	    this.jInternalFrameImportacionTipoListaPrecio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoListaPrecio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoListaPrecio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoListaPrecio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Lista Precioes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoListaPrecio = new JLabelMe();

		this.jLabelArchivoImportacionTipoListaPrecio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoListaPrecio.add(this.jLabelArchivoImportacionTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoListaPrecio = new JFileChooser();		
		this.jFileChooserImportacionTipoListaPrecio.setToolTipText("ESCOGER ARCHIVO"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoListaPrecio = new JButtonMe();
		this.jButtonAbrirImportacionTipoListaPrecio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoListaPrecio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoListaPrecio.setToolTipText("Generar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoListaPrecio.add(this.jButtonAbrirImportacionTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoListaPrecio = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoListaPrecio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoListaPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoListaPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoListaPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoListaPrecio.add(this.jLabelPathArchivoImportacionTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoListaPrecio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoListaPrecio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoListaPrecio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoListaPrecio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoListaPrecio.add(this.jTextFieldPathArchivoImportacionTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoListaPrecio = new JButtonMe();
		this.jButtonGenerarImportacionTipoListaPrecio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoListaPrecio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoListaPrecio.setToolTipText("Generar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoListaPrecio.add(this.jButtonGenerarImportacionTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoListaPrecio = new JButtonMe();
		this.jButtonCerrarImportacionTipoListaPrecio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoListaPrecio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoListaPrecio.setToolTipText("Cancelar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoListaPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoListaPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoListaPrecio.add(this.jButtonCerrarImportacionTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoListaPrecio = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoListaPrecio= new JScrollPane(jPanelImportacionTipoListaPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoListaPrecio.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoListaPrecio.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoListaPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoListaPrecio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoListaPrecio);
		this.jInternalFrameImportacionTipoListaPrecio.getContentPane().add(this.jScrollPanelImportacionTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoListaPrecio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoListaPrecio = new JButtonMe();
			this.jButtonAbrirOrderByTipoListaPrecio.setText("Orden");
			this.jButtonAbrirOrderByTipoListaPrecio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoListaPrecio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoListaPrecio";
			inputMap = this.jButtonAbrirOrderByTipoListaPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoListaPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoListaPrecio"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoListaPrecio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoListaPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoListaPrecio.setName("jPanelOrderByTipoListaPrecio"); 
			
			this.jPanelOrderByTipoListaPrecio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoListaPrecio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoListaPrecio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoListaPrecio.setLayout(gridaBagLayoutOrderByTipoListaPrecio);
			
			
			this.jTableDatosTipoListaPrecioOrderBy = new JTableMe();        
			this.jTableDatosTipoListaPrecioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoListaPrecioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoListaPrecioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoListaPrecioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoListaPrecioOrderBy.setViewportView(this.jTableDatosTipoListaPrecioOrderBy);
			this.jTableDatosTipoListaPrecioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoListaPrecioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoListaPrecio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoListaPrecio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoListaPrecio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoListaPrecio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoListaPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoListaPrecio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoListaPrecio.setTitle("Orden");
			this.jInternalFrameOrderByTipoListaPrecio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoListaPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoListaPrecio.setResizable(true);
			this.jInternalFrameOrderByTipoListaPrecio.setClosable(true);
			this.jInternalFrameOrderByTipoListaPrecio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoListaPrecio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoListaPrecio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoListaPrecio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoListaPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Lista Precioes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoListaPrecio.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoListaPrecio.ipady =150;
				
			this.jPanelOrderByTipoListaPrecio.add(jScrollPanelDatosTipoListaPrecioOrderBy, this.gridBagConstraintsTipoListaPrecio);//this.jTableDatosTipoListaPrecioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoListaPrecio = new JButtonMe();
			this.jButtonCerrarOrderByTipoListaPrecio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoListaPrecio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoListaPrecio.setToolTipText("Cancelar"+" "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoListaPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoListaPrecio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoListaPrecio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoListaPrecio.add(this.jButtonCerrarOrderByTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoListaPrecio = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoListaPrecio= new JScrollPane(jPanelOrderByTipoListaPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoListaPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoListaPrecio.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoListaPrecio.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoListaPrecio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoListaPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoListaPrecio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoListaPrecio);
			
			this.jInternalFrameOrderByTipoListaPrecio.getContentPane().add(this.jScrollPanelOrderByTipoListaPrecio, this.gridBagConstraintsTipoListaPrecio);			
		
		} else {
			this.jButtonAbrirOrderByTipoListaPrecio = new JButtonMe();
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
		int iWidthTableCalculado=0;//1830
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=200;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipolistaprecioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoListaPrecio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoListaPrecio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoListaPrecio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoListaPrecio.getRowHeight();//TipoListaPrecioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoListaPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoListaPrecio.isSelected()) {
					iHeightTable=TipoListaPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoListaPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoListaPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoListaPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoListaPrecio.isSelected()) {
					iHeightTable=TipoListaPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoListaPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoListaPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoListaPrecio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoListaPrecio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoListaPrecio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoListaPrecio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoListaPrecio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoListaPrecio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoListaPrecio!=null && this.jInternalFrameOrderByTipoListaPrecio.getjTableDatosOrderBy()!=null) {
			//if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoListaPrecio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoListaPrecio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoListaPrecio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoListaPrecio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoListaPrecio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoListaPrecio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoListaPrecio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoListaPrecio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoListaPrecio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoListaPrecio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipolistaprecioLogic.getTipoListaPrecios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipolistaprecios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoListaPrecio> TraerTipoListaPrecioBeans(List<TipoListaPrecio> tipolistaprecios,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoListaPrecio tipolistaprecio:tipolistaprecios) {
					
				if(!(TipoListaPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoListaPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipolistaprecio.setsDetalleGeneralEntityReporte(TipoListaPrecioConstantesFunciones.getTipoListaPrecioDescripcion(tipolistaprecio));
										
					tipolistaprecio.setesta_activo_descripcion(TipoListaPrecioConstantesFunciones.getesta_activoDescripcion(tipolistaprecio));	
					
					

					if(tipolistaprecio.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{tipolistaprecio.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(tipolistaprecio.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipolistaprecio.getParametroCarteraDefectos()!=null && Funciones.existeClass(classes,ParametroCarteraDefecto.class)) {
						try{tipolistaprecio.setparametrocarteradefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroCarteraDefectoJInternalFrame.TraerParametroCarteraDefectoBeans(tipolistaprecio.getParametroCarteraDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipolistaprecio.setsDetalleGeneralEntityReporte(tipolistaprecio.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipolistapreciobeans.add(tipolistapreciobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipolistaprecios;
    }
	//PARA REPORTES FIN
}
