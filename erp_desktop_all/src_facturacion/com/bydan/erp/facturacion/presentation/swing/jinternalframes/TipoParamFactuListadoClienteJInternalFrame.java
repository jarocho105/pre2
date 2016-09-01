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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;





//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TipoParamFactuListadoClienteConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TipoParamFactuListadoClienteJInternalFrame extends TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoParamFactuListadoCliente;
	
	protected JMenuBar jmenuBarTipoParamFactuListadoCliente;
	
	protected JMenu jmenuTipoParamFactuListadoCliente;
	protected JMenu jmenuDatosTipoParamFactuListadoCliente;
	protected JMenu jmenuArchivoTipoParamFactuListadoCliente;
	protected JMenu jmenuAccionesTipoParamFactuListadoCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoParamFactuListadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoParamFactuListadoCliente;	
	protected GridBagConstraints gridBagConstraintsTipoParamFactuListadoCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoParamFactuListadoClienteDetalleFormJInternalFrame jInternalFrameDetalleFormTipoParamFactuListadoCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoParamFactuListadoCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoParamFactuListadoCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoParamFactuListadoClienteSessionBean tipoparamfactulistadoclienteSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientes;		
	public List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesEliminados;	
	public List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoParamFactuListadoCliente;		
	protected JButton jButtonAbrirOrderByTipoParamFactuListadoCliente;
	
	
	//protected JPanel jPanelOrderByTipoParamFactuListadoCliente;
	//public JScrollPane jScrollPanelOrderByTipoParamFactuListadoCliente;	
	//protected JButton jButtonCerrarOrderByTipoParamFactuListadoCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoParamFactuListadoClienteLogic tipoparamfactulistadoclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoParamFactuListadoCliente;
	public JScrollPane jScrollPanelDatosEdicionTipoParamFactuListadoCliente;
	public JScrollPane jScrollPanelDatosGeneralTipoParamFactuListadoCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoParamFactuListadoClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoParamFactuListadoCliente;
	//public JScrollPane jScrollPanelImportacionTipoParamFactuListadoCliente;
	
	
	
	protected JPanel jPanelAccionesTipoParamFactuListadoCliente;
	
    protected JPanel jPanelPaginacionTipoParamFactuListadoCliente;
    protected JPanel jPanelParametrosReportesTipoParamFactuListadoCliente;
	protected JPanel jPanelParametrosReportesAccionesTipoParamFactuListadoCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoParamFactuListadoCliente;
	protected JPanel jPanelParametrosAuxiliar2TipoParamFactuListadoCliente;
	protected JPanel jPanelParametrosAuxiliar3TipoParamFactuListadoCliente;
	protected JPanel jPanelParametrosAuxiliar4TipoParamFactuListadoCliente;
	//protected JPanel jPanelParametrosAuxiliar5TipoParamFactuListadoCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoParamFactuListadoCliente;
	//protected JPanel jPanelImportacionTipoParamFactuListadoCliente;
	
	
	public JTable jTableDatosTipoParamFactuListadoCliente;
	
	
	
	//public JTable jTableDatosTipoParamFactuListadoClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoParamFactuListadoCliente;
	protected JButton jButtonDuplicarTipoParamFactuListadoCliente;
	protected JButton jButtonCopiarTipoParamFactuListadoCliente;
	protected JButton jButtonVerFormTipoParamFactuListadoCliente;
	protected JButton jButtonNuevoRelacionesTipoParamFactuListadoCliente;
	protected JButton jButtonModificarTipoParamFactuListadoCliente;
	
    protected JButton jButtonGuardarCambiosTablaTipoParamFactuListadoCliente;
	protected JButton jButtonCerrarTipoParamFactuListadoCliente;
	
	
	protected JButton jButtonRecargarInformacionTipoParamFactuListadoCliente;
	protected JButton jButtonProcesarInformacionTipoParamFactuListadoCliente;
	
	
	protected JButton jButtonAnterioresTipoParamFactuListadoCliente;
	protected JButton jButtonSiguientesTipoParamFactuListadoCliente;
	protected JButton jButtonNuevoGuardarCambiosTipoParamFactuListadoCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoParamFactuListadoCliente;
	//protected JButton jButtonCerrarReporteDinamicoTipoParamFactuListadoCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoParamFactuListadoCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoParamFactuListadoCliente;
	//protected JButton jButtonGenerarImportacionTipoParamFactuListadoCliente;
	//protected JButton jButtonCerrarImportacionTipoParamFactuListadoCliente;
	//protected JFileChooser jFileChooserImportacionTipoParamFactuListadoCliente;
	//protected File fileImportacionTipoParamFactuListadoCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonDuplicarToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonNuevoRelacionesToolBarTipoParamFactuListadoCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonCopiarToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonVerFormToolBarTipoParamFactuListadoCliente;
	public JButton jButtonGuardarCambiosTablaToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonCerrarToolBarTipoParamFactuListadoCliente;
	
	protected JButton jButtonRecargarInformacionToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonProcesarInformacionToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonAnterioresToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonSiguientesToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonAbrirOrderByToolBarTipoParamFactuListadoCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemDuplicarTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemNuevoRelacionesTipoParamFactuListadoCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemCopiarTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemVerFormTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemCerrarTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemDetalleCerrarTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoParamFactuListadoCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemProcesarInformacionTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemAnterioresTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemSiguientesTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemAbrirOrderByTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemMostrarOcultarTipoParamFactuListadoCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoParamFactuListadoCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente;
	protected JCheckBox jCheckBoxSeleccionadosTipoParamFactuListadoCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoParamFactuListadoCliente;
	protected JCheckBox jCheckBoxConGraficoReporteTipoParamFactuListadoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoParamFactuListadoCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoParamFactuListadoCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoParamFactuListadoCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoParamFactuListadoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoParamFactuListadoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoParamFactuListadoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoParamFactuListadoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoParamFactuListadoCliente;
	protected JTextField jTextFieldValorCampoGeneralTipoParamFactuListadoCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoParamFactuListadoCliente;
	//public JList<Reporte> jListColumnasSelectReporteTipoParamFactuListadoCliente;
	//public JScrollPane jScrollColumnasSelectReporteTipoParamFactuListadoCliente;
	
	//public JLabel jLabelRelacionesSelectReporteTipoParamFactuListadoCliente;
	//public JList<Reporte> jListRelacionesSelectReporteTipoParamFactuListadoCliente;
	//public JScrollPane jScrollRelacionesSelectReporteTipoParamFactuListadoCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoParamFactuListadoCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoParamFactuListadoCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoParamFactuListadoCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoParamFactuListadoCliente;
	
		
	//public JLabel jLabelArchivoImportacionTipoParamFactuListadoCliente;	
	//public JLabel jLabelPathArchivoImportacionTipoParamFactuListadoCliente;
	//protected JTextField jTextFieldPathArchivoImportacionTipoParamFactuListadoCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoParamFactuListadoCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoParamFactuListadoCliente;
	
	//public JLabel jLabelColumnaCategoriaValorTipoParamFactuListadoCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoParamFactuListadoCliente;
	
	//public JLabel jLabelColumnasValoresGraficoTipoParamFactuListadoCliente;
	//public JList<Reporte> jListColumnasValoresGraficoTipoParamFactuListadoCliente;
	//public JScrollPane jScrollColumnasValoresGraficoTipoParamFactuListadoCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoParamFactuListadoCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoParamFactuListadoCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoParamFactuListadoCliente;
	public JPanel jPanelBusquedaPorNombreTipoParamFactuListadoCliente;
	public JButton jButtonBusquedaPorNombreTipoParamFactuListadoCliente;
	
	public JPanel jPanelnombreBusquedaPorNombreTipoParamFactuListadoCliente;
	public JLabel jLabelnombreBusquedaPorNombreTipoParamFactuListadoCliente;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoParamFactuListadoCliente;
	public JButton jButtonnombreBusquedaPorNombreTipoParamFactuListadoClienteBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoParamFactuListadoClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoParamFactuListadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuListadoClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParamFactuListadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuListadoClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParamFactuListadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuListadoClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoParamFactuListadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoParamFactuListadoCliente)	{
		this.jButtonRecargarInformacionTipoParamFactuListadoCliente = jButtonRecargarInformacionTipoParamFactuListadoCliente;
	}
	
	public JButton getjButtonProcesarInformacionTipoParamFactuListadoCliente() {
		return this.jButtonProcesarInformacionTipoParamFactuListadoCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoParamFactuListadoCliente)	{
		this.jButtonProcesarInformacionTipoParamFactuListadoCliente = jButtonProcesarInformacionTipoParamFactuListadoCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoParamFactuListadoCliente() {
		return this.jButtonRecargarInformacionTipoParamFactuListadoCliente;
	}
	
	
	public List<TipoParamFactuListadoCliente> gettipoparamfactulistadoclientes() {
		return this.tipoparamfactulistadoclientes;
	}

	public void settipoparamfactulistadoclientes(List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientes) {
		this.tipoparamfactulistadoclientes = tipoparamfactulistadoclientes;
	}
	
	public List<TipoParamFactuListadoCliente> gettipoparamfactulistadoclientesAux() {
		return this.tipoparamfactulistadoclientesAux;
	}

	public void settipoparamfactulistadoclientesAux(List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesAux) {
		this.tipoparamfactulistadoclientesAux = tipoparamfactulistadoclientesAux;
	}
	
	public List<TipoParamFactuListadoCliente> gettipoparamfactulistadoclientesEliminados() {
		return this.tipoparamfactulistadoclientesEliminados;
	}

	public void setTipoParamFactuListadoClientesEliminados(List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientesEliminados) {
		this.tipoparamfactulistadoclientesEliminados = tipoparamfactulistadoclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoParamFactuListadoCliente() {
		return jComboBoxTiposSeleccionarTipoParamFactuListadoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoParamFactuListadoCliente(
			JComboBox jComboBoxTiposSeleccionarTipoParamFactuListadoCliente) {
		this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente = jComboBoxTiposSeleccionarTipoParamFactuListadoCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoParamFactuListadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoParamFactuListadoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoParamFactuListadoCliente() {
		return jTextFieldValorCampoGeneralTipoParamFactuListadoCliente;
	}

	public void setjTextFieldValorCampoGeneralTipoParamFactuListadoCliente(
			JTextField jTextFieldValorCampoGeneralTipoParamFactuListadoCliente) {
		this.jTextFieldValorCampoGeneralTipoParamFactuListadoCliente = jTextFieldValorCampoGeneralTipoParamFactuListadoCliente;
	}

	public void setBorderResaltarValorCampoGeneralTipoParamFactuListadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuListadoCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoParamFactuListadoCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoParamFactuListadoCliente() {
		return this.jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente;
	}

	public void setjCheckBoxSeleccionarTodosTipoParamFactuListadoCliente(
			JCheckBox jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente) {
		this.jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente = jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente;
	}

	public void setBorderResaltarSeleccionarTodosTipoParamFactuListadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuListadoCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoParamFactuListadoCliente() {
		return this.jCheckBoxSeleccionadosTipoParamFactuListadoCliente;
	}

	public void setjCheckBoxSeleccionadosTipoParamFactuListadoCliente(
			JCheckBox jCheckBoxSeleccionadosTipoParamFactuListadoCliente) {
		this.jCheckBoxSeleccionadosTipoParamFactuListadoCliente = jCheckBoxSeleccionadosTipoParamFactuListadoCliente;
	}
	
	public void setBorderResaltarSeleccionadosTipoParamFactuListadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuListadoCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoParamFactuListadoCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoParamFactuListadoCliente() {
		return this.jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoParamFactuListadoCliente(
			JComboBox jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente) {
		this.jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente = jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente;
	}

	public void setBorderResaltarTiposArchivosReportesTipoParamFactuListadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuListadoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoParamFactuListadoCliente() {
		return this.jComboBoxTiposReportesTipoParamFactuListadoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoParamFactuListadoCliente(
			JComboBox jComboBoxTiposReportesTipoParamFactuListadoCliente) {
		this.jComboBoxTiposReportesTipoParamFactuListadoCliente = jComboBoxTiposReportesTipoParamFactuListadoCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoParamFactuListadoCliente() {
	//	return jComboBoxTiposReportesDinamicoTipoParamFactuListadoCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoParamFactuListadoCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoParamFactuListadoCliente) {
	//	this.jComboBoxTiposReportesDinamicoTipoParamFactuListadoCliente = jComboBoxTiposReportesDinamicoTipoParamFactuListadoCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoParamFactuListadoCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoParamFactuListadoCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoParamFactuListadoCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoParamFactuListadoCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuListadoCliente = jComboBoxTiposArchivosReportesDinamicoTipoParamFactuListadoCliente;
	//}
	
	public void setBorderResaltarTiposReportesTipoParamFactuListadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuListadoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoParamFactuListadoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoParamFactuListadoCliente() {
		return this.jComboBoxTiposGraficosReportesTipoParamFactuListadoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoParamFactuListadoCliente(
			JComboBox jComboBoxTiposGraficosReportesTipoParamFactuListadoCliente) {
		this.jComboBoxTiposGraficosReportesTipoParamFactuListadoCliente = jComboBoxTiposGraficosReportesTipoParamFactuListadoCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoParamFactuListadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuListadoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoParamFactuListadoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoParamFactuListadoCliente() {
		return this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoParamFactuListadoCliente(
			JComboBox jComboBoxTiposPaginacionTipoParamFactuListadoCliente) {
		this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente = jComboBoxTiposPaginacionTipoParamFactuListadoCliente;
	}
	
	public void setBorderResaltarTiposPaginacionTipoParamFactuListadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuListadoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoParamFactuListadoCliente() {
		return this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoParamFactuListadoCliente() {
		return this.jComboBoxTiposAccionesTipoParamFactuListadoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoParamFactuListadoCliente(
			JComboBox jComboBoxTiposRelacionesTipoParamFactuListadoCliente) {
		this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente = jComboBoxTiposRelacionesTipoParamFactuListadoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoParamFactuListadoCliente(
			JComboBox jComboBoxTiposAccionesTipoParamFactuListadoCliente) {
		this.jComboBoxTiposAccionesTipoParamFactuListadoCliente = jComboBoxTiposAccionesTipoParamFactuListadoCliente;
	}
	
	public void setBorderResaltarTiposRelacionesTipoParamFactuListadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuListadoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoParamFactuListadoCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoParamFactuListadoCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoParamFactuListadoCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoParamFactuListadoCliente() {
	//	return jCheckBoxConGraficoDinamicoTipoParamFactuListadoCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoParamFactuListadoCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoParamFactuListadoCliente) {
	//	this.jCheckBoxConGraficoDinamicoTipoParamFactuListadoCliente = jCheckBoxConGraficoDinamicoTipoParamFactuListadoCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoParamFactuListadoCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoParamFactuListadoCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoParamFactuListadoCliente .setBorder(borderResaltar);		
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
		this.tipoparamfactulistadoclienteSessionBean=new TipoParamFactuListadoClienteSessionBean();
		
		this.tipoparamfactulistadoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparamfactulistadoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoParamFactuListadoClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoParamFactuListadoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoParamFactuListadoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoParamFactuListadoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoParamFactuListadoClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Listado Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoParamFactuListadoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoParamFactuListadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoParamFactuListadoCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoParamFactuListadoCliente,this.jTtoolBarTipoParamFactuListadoCliente,
							"nuevo","nuevo","Nuevo"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuListadoCliente,this.jTtoolBarTipoParamFactuListadoCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoParamFactuListadoCliente,this.jTtoolBarTipoParamFactuListadoCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoParamFactuListadoCliente,this.jTtoolBarTipoParamFactuListadoCliente,
							"duplicar","duplicar","Duplicar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoParamFactuListadoCliente,this.jTtoolBarTipoParamFactuListadoCliente,
							"copiar","copiar","Copiar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoParamFactuListadoCliente,this.jTtoolBarTipoParamFactuListadoCliente,
							"ver_form","ver_form","Ver"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParamFactuListadoCliente,this.jTtoolBarTipoParamFactuListadoCliente,
							"recargar","recargar","Recargar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParamFactuListadoCliente,this.jTtoolBarTipoParamFactuListadoCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoParamFactuListadoCliente,this.jTtoolBarTipoParamFactuListadoCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoParamFactuListadoCliente,this.jTtoolBarTipoParamFactuListadoCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoParamFactuListadoCliente,this.jTtoolBarTipoParamFactuListadoCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoParamFactuListadoCliente,this.jTtoolBarTipoParamFactuListadoCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoParamFactuListadoCliente,this.jTtoolBarTipoParamFactuListadoCliente,
							"cerrar","cerrar","Salir"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoParamFactuListadoCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoParamFactuListadoCliente;
			
				this.jButtonProcesarInformacionToolBarTipoParamFactuListadoCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoParamFactuListadoCliente;
				
		//protected JButton jButtonModificarToolBarTipoParamFactuListadoCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoParamFactuListadoCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoParamFactuListadoCliente=new JMenuMe("General");
		this.jmenuArchivoTipoParamFactuListadoCliente=new JMenuMe("Archivo");
		this.jmenuAccionesTipoParamFactuListadoCliente=new JMenuMe("Acciones");
		this.jmenuDatosTipoParamFactuListadoCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoParamFactuListadoCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoParamFactuListadoCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoParamFactuListadoCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoParamFactuListadoCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoParamFactuListadoCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoParamFactuListadoCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoParamFactuListadoCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoParamFactuListadoCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoParamFactuListadoCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoParamFactuListadoCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoParamFactuListadoCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoParamFactuListadoCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoParamFactuListadoCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoParamFactuListadoCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoParamFactuListadoCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoParamFactuListadoCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoParamFactuListadoCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoParamFactuListadoCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoParamFactuListadoCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoParamFactuListadoCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoParamFactuListadoCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoParamFactuListadoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoParamFactuListadoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoParamFactuListadoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoParamFactuListadoCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoParamFactuListadoCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoParamFactuListadoCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoParamFactuListadoCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoParamFactuListadoCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoParamFactuListadoCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoParamFactuListadoCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoParamFactuListadoCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoParamFactuListadoCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoParamFactuListadoCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoParamFactuListadoCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoParamFactuListadoCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoParamFactuListadoCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoParamFactuListadoCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoParamFactuListadoCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoParamFactuListadoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoParamFactuListadoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoParamFactuListadoCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoParamFactuListadoCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoParamFactuListadoCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoParamFactuListadoCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoParamFactuListadoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoParamFactuListadoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoParamFactuListadoCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoParamFactuListadoCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoParamFactuListadoCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoParamFactuListadoCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoParamFactuListadoCliente.add(this.jMenuItemCerrarTipoParamFactuListadoCliente);
			
			this.jmenuAccionesTipoParamFactuListadoCliente.add(this.jMenuItemNuevoTipoParamFactuListadoCliente);
			this.jmenuAccionesTipoParamFactuListadoCliente.add(this.jMenuItemNuevoGuardarCambiosTipoParamFactuListadoCliente);
			this.jmenuAccionesTipoParamFactuListadoCliente.add(this.jMenuItemNuevoRelacionesTipoParamFactuListadoCliente);
			this.jmenuAccionesTipoParamFactuListadoCliente.add(this.jMenuItemGuardarCambiosTablaTipoParamFactuListadoCliente);		
			this.jmenuAccionesTipoParamFactuListadoCliente.add(this.jMenuItemDuplicarTipoParamFactuListadoCliente);		
			this.jmenuAccionesTipoParamFactuListadoCliente.add(this.jMenuItemCopiarTipoParamFactuListadoCliente);		
			this.jmenuAccionesTipoParamFactuListadoCliente.add(this.jMenuItemVerFormTipoParamFactuListadoCliente);		
			
			this.jmenuDatosTipoParamFactuListadoCliente.add(this.jMenuItemRecargarInformacionTipoParamFactuListadoCliente);				
			this.jmenuDatosTipoParamFactuListadoCliente.add(this.jMenuItemAnterioresTipoParamFactuListadoCliente);				
			this.jmenuDatosTipoParamFactuListadoCliente.add(this.jMenuItemSiguientesTipoParamFactuListadoCliente);				
			this.jmenuDatosTipoParamFactuListadoCliente.add(this.jMenuItemAbrirOrderByTipoParamFactuListadoCliente);				
			this.jmenuDatosTipoParamFactuListadoCliente.add(this.jMenuItemMostrarOcultarTipoParamFactuListadoCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoParamFactuListadoCliente.add(this.jMenuItemGuardarCambiosTipoParamFactuListadoCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoParamFactuListadoCliente.add(this.jmenuArchivoTipoParamFactuListadoCliente);		
			this.jmenuBarTipoParamFactuListadoCliente.add(this.jmenuAccionesTipoParamFactuListadoCliente);		
			this.jmenuBarTipoParamFactuListadoCliente.add(this.jmenuDatosTipoParamFactuListadoCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoParamFactuListadoCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoParamFactuListadoCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorNombreTipoParamFactuListadoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoParamFactuListadoCliente.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoParamFactuListadoCliente= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoParamFactuListadoCliente.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoParamFactuListadoCliente.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoParamFactuListadoCliente,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoParamFactuListadoCliente = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoParamFactuListadoCliente.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoParamFactuListadoCliente.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoParamFactuListadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoParamFactuListadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoParamFactuListadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoParamFactuListadoCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoParamFactuListadoCliente= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoParamFactuListadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoParamFactuListadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoParamFactuListadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoParamFactuListadoCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoParamFactuListadoCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoParamFactuListadoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoParamFactuListadoCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoParamFactuListadoCliente = new TipoParamFactuListadoClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Listado Cliente DATOS");
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente = new TipoParamFactuListadoClienteDetalleFormJInternalFrame(jDesktopPane,this.tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones(),this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoParamFactuListadoCliente = null;//new TipoParamFactuListadoClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoParamFactuListadoCliente= new GridBagLayout();
		
		
		this.jTableDatosTipoParamFactuListadoCliente = new JTableMe();      
		
		String sToolTipTipoParamFactuListadoCliente="";
		sToolTipTipoParamFactuListadoCliente=TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoParamFactuListadoCliente+="(Facturacion.TipoParamFactuListadoCliente)";
		}
		
		if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoParamFactuListadoCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoParamFactuListadoCliente.setToolTipText(sToolTipTipoParamFactuListadoCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoParamFactuListadoCliente);
		this.jTableDatosTipoParamFactuListadoCliente.setAutoCreateRowSorter(true);
		this.jTableDatosTipoParamFactuListadoCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoParamFactuListadoCliente.setRowSelectionAllowed(true);
		this.jTableDatosTipoParamFactuListadoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoParamFactuListadoCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonDuplicarTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonCopiarTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonVerFormTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonNuevoRelacionesTipoParamFactuListadoCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonCerrarTipoParamFactuListadoCliente = new JButtonMe();
		
		this.jScrollPanelDatosTipoParamFactuListadoCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoParamFactuListadoCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoParamFactuListadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Listado Cliente";
		
		if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Listado Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoParamFactuListadoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoParamFactuListadoCliente.setToolTipText("Acciones");
        this.jPanelAccionesTipoParamFactuListadoCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente=new ReporteDinamicoJInternalFrame(TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoParamFactuListadoCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoParamFactuListadoCliente=new ImportacionJInternalFrame(TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoParamFactuListadoCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoParamFactuListadoCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoParamFactuListadoCliente.setText("Orden");
		this.jButtonAbrirOrderByTipoParamFactuListadoCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoParamFactuListadoCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoParamFactuListadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoParamFactuListadoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParamFactuListadoCliente,false,this);
			
			//this.cargarOrderByTipoParamFactuListadoCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoParamFactuListadoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParamFactuListadoCliente,true,this);
			
			//this.cargarOrderByTipoParamFactuListadoCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoParamFactuListadoCliente.setMinimumSize(new Dimension(400,50));//330
		this.jTableDatosTipoParamFactuListadoCliente.setMaximumSize(new Dimension(400,50));//330
		this.jTableDatosTipoParamFactuListadoCliente.setPreferredSize(new Dimension(400,50));//330
		
		this.jScrollPanelDatosTipoParamFactuListadoCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoParamFactuListadoCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoParamFactuListadoCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoParamFactuListadoCliente.setText("Nuevo");
		this.jButtonDuplicarTipoParamFactuListadoCliente.setText("Duplicar");
		this.jButtonCopiarTipoParamFactuListadoCliente.setText("Copiar");
		this.jButtonVerFormTipoParamFactuListadoCliente.setText("Ver");
		this.jButtonNuevoRelacionesTipoParamFactuListadoCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente.setText("Guardar");
		this.jButtonCerrarTipoParamFactuListadoCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoParamFactuListadoCliente,"nuevo_button","Nuevo",this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoParamFactuListadoCliente,"duplicar_button","Duplicar",this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoParamFactuListadoCliente,"copiar_button","Copiar",this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoParamFactuListadoCliente,"ver_form","Ver",this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoParamFactuListadoCliente,"nuevorelaciones_button","Nuevo Rel",this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente,"guardarcambiostabla_button","Guardar",this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoParamFactuListadoCliente,"cerrar_button","Salir",this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoParamFactuListadoCliente.setToolTipText("Nuevo"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoParamFactuListadoCliente.setToolTipText("Duplicar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoParamFactuListadoCliente.setToolTipText("Copiar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoParamFactuListadoCliente.setToolTipText("Ver"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoParamFactuListadoCliente.setToolTipText("Nuevo Rel"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente.setToolTipText("Guardar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoParamFactuListadoCliente.setToolTipText("Salir"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoParamFactuListadoCliente";
		inputMap = this.jButtonNuevoTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoParamFactuListadoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoParamFactuListadoCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoParamFactuListadoCliente";
		inputMap = this.jButtonDuplicarTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoParamFactuListadoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoParamFactuListadoCliente"));
		
		//COPIAR
		sMapKey = "CopiarTipoParamFactuListadoCliente";
		inputMap = this.jButtonCopiarTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoParamFactuListadoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoParamFactuListadoCliente"));
		
		//VEr FORM
		sMapKey = "VerFormTipoParamFactuListadoCliente";
		inputMap = this.jButtonVerFormTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoParamFactuListadoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoParamFactuListadoCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoParamFactuListadoCliente";
		inputMap = this.jButtonNuevoRelacionesTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoParamFactuListadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoParamFactuListadoCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoParamFactuListadoCliente";
		inputMap = this.jButtonModificarTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoParamFactuListadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoParamFactuListadoCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoParamFactuListadoCliente";
		inputMap = this.jButtonCerrarTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoParamFactuListadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoParamFactuListadoCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoParamFactuListadoCliente";
		inputMap = this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoParamFactuListadoCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoParamFactuListadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoParamFactuListadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoParamFactuListadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoParamFactuListadoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoParamFactuListadoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoParamFactuListadoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoParamFactuListadoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoParamFactuListadoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoParamFactuListadoCliente.setName("jPanelParametrosReportesTipoParamFactuListadoCliente"); 
		
		this.jPanelParametrosReportesAccionesTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoParamFactuListadoCliente.setName("jPanelParametrosReportesAccionesTipoParamFactuListadoCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonRecargarInformacionTipoParamFactuListadoCliente.setText("Recargar");
		this.jButtonRecargarInformacionTipoParamFactuListadoCliente.setToolTipText("Recargar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoParamFactuListadoCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonProcesarInformacionTipoParamFactuListadoCliente.setText("Procesar");
		this.jButtonProcesarInformacionTipoParamFactuListadoCliente.setToolTipText("Procesar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoParamFactuListadoCliente.setVisible(false);
			
		this.jButtonProcesarInformacionTipoParamFactuListadoCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoParamFactuListadoCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoParamFactuListadoCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoParamFactuListadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente.setText("TIPO");       
		this.jComboBoxTiposReportesTipoParamFactuListadoCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoParamFactuListadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoParamFactuListadoCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente.setText("Accion");
		this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoParamFactuListadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setText("Accion");
		this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoParamFactuListadoCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoParamFactuListadoCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoParamFactuListadoCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoParamFactuListadoCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoParamFactuListadoCliente = new JLabelMe();
		
		this.jLabelAccionesTipoParamFactuListadoCliente.setText("Acciones");		
		this.jLabelAccionesTipoParamFactuListadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParamFactuListadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParamFactuListadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoParamFactuListadoCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoParamFactuListadoCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoParamFactuListadoCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuListadoCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoParamFactuListadoCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuListadoCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoParamFactuListadoCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoParamFactuListadoCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoParamFactuListadoCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoParamFactuListadoCliente = new JButtonMe();
		//this.jButtonAnterioresTipoParamFactuListadoCliente.setText("<<");
        this.jButtonAnterioresTipoParamFactuListadoCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoParamFactuListadoCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoParamFactuListadoCliente = new JButtonMe();
		//this.jButtonSiguientesTipoParamFactuListadoCliente.setText(">>");
        this.jButtonSiguientesTipoParamFactuListadoCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoParamFactuListadoCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoParamFactuListadoCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoParamFactuListadoCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoParamFactuListadoCliente,"nuevoguardarcambios_button","Nue",this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoParamFactuListadoCliente";
		inputMap = this.jButtonNuevoGuardarCambiosTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoParamFactuListadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoParamFactuListadoCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoParamFactuListadoCliente";
		inputMap = this.jButtonRecargarInformacionTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoParamFactuListadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoParamFactuListadoCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoParamFactuListadoCliente";
		inputMap = this.jButtonSiguientesTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoParamFactuListadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoParamFactuListadoCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoParamFactuListadoCliente";
		inputMap = this.jButtonAnterioresTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoParamFactuListadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoParamFactuListadoCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoParamFactuListadoCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoParamFactuListadoCliente.setMinimumSize(new Dimension(this.getWidth(),TipoParamFactuListadoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParamFactuListadoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoParamFactuListadoCliente.setMaximumSize(new Dimension(this.getWidth(),TipoParamFactuListadoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParamFactuListadoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoParamFactuListadoCliente.setPreferredSize(new Dimension(this.getWidth(),TipoParamFactuListadoClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoParamFactuListadoClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoParamFactuListadoCliente = new GridBagLayout();

			this.jPanelPaginacionTipoParamFactuListadoCliente.setLayout(gridaBagLayoutPaginacionTipoParamFactuListadoCliente);						
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoParamFactuListadoCliente.add(this.jButtonAnterioresTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
					
						
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;
			
			this.jPanelPaginacionTipoParamFactuListadoCliente.add(this.jButtonNuevoGuardarCambiosTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
						
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;
			this.jPanelPaginacionTipoParamFactuListadoCliente.add(this.jButtonSiguientesTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 1;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParamFactuListadoCliente.add(this.jButtonNuevoTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
						
			
			
			if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
				this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 1;
				this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoParamFactuListadoCliente.add(this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
			}
			
			
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 1;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParamFactuListadoCliente.add(this.jButtonDuplicarTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 1;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParamFactuListadoCliente.add(this.jButtonCopiarTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 1;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoParamFactuListadoCliente.add(this.jButtonVerFormTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 1;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoParamFactuListadoCliente.add(this.jButtonCerrarTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		
		
		
		this.jButtonRecargarInformacionTipoParamFactuListadoCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoParamFactuListadoCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoParamFactuListadoCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoParamFactuListadoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoParamFactuListadoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoParamFactuListadoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoParamFactuListadoCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoParamFactuListadoCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoParamFactuListadoCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuListadoCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuListadoCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoParamFactuListadoCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoParamFactuListadoCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoParamFactuListadoCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoParamFactuListadoCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoParamFactuListadoCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoParamFactuListadoCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoParamFactuListadoCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoParamFactuListadoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoParamFactuListadoCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoParamFactuListadoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoParamFactuListadoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoParamFactuListadoCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoParamFactuListadoCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoParamFactuListadoCliente.setLayout(gridaBagParametrosReportesTipoParamFactuListadoCliente);
			this.jPanelParametrosReportesAccionesTipoParamFactuListadoCliente.setLayout(gridaBagParametrosReportesAccionesTipoParamFactuListadoCliente);
			
			
			this.jPanelParametrosAuxiliar1TipoParamFactuListadoCliente.setLayout(gridaBagParametrosAuxiliar1TipoParamFactuListadoCliente);
			this.jPanelParametrosAuxiliar2TipoParamFactuListadoCliente.setLayout(gridaBagParametrosAuxiliar2TipoParamFactuListadoCliente);
			this.jPanelParametrosAuxiliar3TipoParamFactuListadoCliente.setLayout(gridaBagParametrosAuxiliar3TipoParamFactuListadoCliente);
			this.jPanelParametrosAuxiliar4TipoParamFactuListadoCliente.setLayout(gridaBagParametrosAuxiliar4TipoParamFactuListadoCliente);
			//this.jPanelParametrosAuxiliar5TipoParamFactuListadoCliente.setLayout(gridaBagParametrosAuxiliar2TipoParamFactuListadoCliente);			
			
			
			
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuListadoCliente.add(this.jButtonRecargarInformacionTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParamFactuListadoCliente.add(this.jComboBoxTiposPaginacionTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParamFactuListadoCliente.add(this.jCheckBoxConAltoMaximoTablaTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoParamFactuListadoCliente.add(this.jComboBoxTiposArchivosReportesTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuListadoCliente.add(this.jPanelParametrosAuxiliar1TipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoParamFactuListadoCliente.add(this.jComboBoxTiposReportesTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuListadoCliente.add(this.jPanelParametrosAuxiliar4TipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuListadoCliente.add(this.jComboBoxTiposReportesTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParamFactuListadoCliente.add(this.jCheckBoxGenerarReporteTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuListadoCliente.add(this.jPanelParametrosAuxiliar2TipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParamFactuListadoCliente.add(this.jLabelAccionesTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
				this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoParamFactuListadoCliente.add(this.jButtonAbrirOrderByTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuListadoCliente.add(this.jComboBoxTiposSeleccionarTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);			
			
			
			/*
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoParamFactuListadoCliente.add(this.jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoParamFactuListadoCliente.add(this.jCheckBoxSeleccionarTodosTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);															
				
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoParamFactuListadoCliente.add(this.jCheckBoxSeleccionadosTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoParamFactuListadoCliente.add(this.jPanelParametrosAuxiliar3TipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuListadoCliente.add(this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
				
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuListadoCliente.add(this.jComboBoxTiposAccionesTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
	
				
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoParamFactuListadoCliente.add(this.jTextFieldValorCampoGeneralTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoParamFactuListadoCliente = new GridBagLayout();

			this.jScrollPanelDatosTipoParamFactuListadoCliente.setLayout(gridaBagLayoutDatosTipoParamFactuListadoCliente);
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
			
			this.jScrollPanelDatosTipoParamFactuListadoCliente.add(this.jTableDatosTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoParamFactuListadoCliente.setViewportView(this.jTableDatosTipoParamFactuListadoCliente);
		this.jTableDatosTipoParamFactuListadoCliente.setFillsViewportHeight(true);
		this.jTableDatosTipoParamFactuListadoCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoParamFactuListadoCliente= new GridBagLayout();
		this.jPanelAccionesTipoParamFactuListadoCliente.setLayout(gridaBagLayoutAccionesTipoParamFactuListadoCliente);
		
		
		/*	
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
			
		this.jPanelAccionesTipoParamFactuListadoCliente.add(this.jButtonNuevoTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoParamFactuListadoCliente= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoParamFactuListadoCliente.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoParamFactuListadoCliente.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoParamFactuListadoCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoParamFactuListadoCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoParamFactuListadoCliente.setLayout(gridaBagLayoutBusquedaPorNombreTipoParamFactuListadoCliente);

		gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;
		gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
		jPanelBusquedaPorNombreTipoParamFactuListadoCliente.add(jLabelnombreBusquedaPorNombreTipoParamFactuListadoCliente, gridBagConstraintsTipoParamFactuListadoCliente);

		gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;
		gridBagConstraintsTipoParamFactuListadoCliente.gridx = 1;
		jPanelBusquedaPorNombreTipoParamFactuListadoCliente.add(jTextAreanombreBusquedaPorNombreTipoParamFactuListadoCliente, gridBagConstraintsTipoParamFactuListadoCliente);

		gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoParamFactuListadoCliente.gridy = 1;
		gridBagConstraintsTipoParamFactuListadoCliente.gridx =1;
		jPanelBusquedaPorNombreTipoParamFactuListadoCliente.add(jButtonBusquedaPorNombreTipoParamFactuListadoCliente, gridBagConstraintsTipoParamFactuListadoCliente);

		jTabbedPaneBusquedasTipoParamFactuListadoCliente.addTab("1.-Por Nombre ", jPanelBusquedaPorNombreTipoParamFactuListadoCliente);
		jTabbedPaneBusquedasTipoParamFactuListadoCliente.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoParamFactuListadoCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoParamFactuListadoCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();						
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;		
			//this.gridBagConstraintsTipoParamFactuListadoCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoParamFactuListadoCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;		
		//this.gridBagConstraintsTipoParamFactuListadoCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoParamFactuListadoCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoParamFactuListadoCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoParamFactuListadoCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);								
		
		
		/*
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		*/		
		
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx =0;
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoParamFactuListadoCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
				
		
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoParamFactuListadoClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoParamFactuListadoCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoParamFactuListadoCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoParamFactuListadoCliente.setLayout(gridaBagLayoutBusquedasParametrosTipoParamFactuListadoCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoParamFactuListadoCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoParamFactuListadoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParamFactuListadoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParamFactuListadoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
			
			
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		
			
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoParamFactuListadoCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoParamFactuListadoCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoParamFactuListadoCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoParamFactuListadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoParamFactuListadoCliente.setName("jPanelReporteDinamicoTipoParamFactuListadoCliente"); 
		
		this.jPanelReporteDinamicoTipoParamFactuListadoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoParamFactuListadoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoParamFactuListadoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoParamFactuListadoCliente.setLayout(gridaBagLayoutReporteDinamicoTipoParamFactuListadoCliente);
		
		
		this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoParamFactuListadoCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoParamFactuListadoCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoParamFactuListadoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoParamFactuListadoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoParamFactuListadoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Listado Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoParamFactuListadoCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoParamFactuListadoCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoParamFactuListadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoParamFactuListadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoParamFactuListadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoParamFactuListadoCliente.add(this.jLabelColumnasSelectReporteTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoParamFactuListadoCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoParamFactuListadoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoParamFactuListadoCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoParamFactuListadoCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoParamFactuListadoCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoParamFactuListadoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoParamFactuListadoCliente=new JScrollPane(this.jListColumnasSelectReporteTipoParamFactuListadoCliente);
			
			this.jScrollColumnasSelectReporteTipoParamFactuListadoCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoParamFactuListadoCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoParamFactuListadoCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoParamFactuListadoCliente.add(this.jListColumnasSelectReporteTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		this.jPanelReporteDinamicoTipoParamFactuListadoCliente.add(this.jScrollColumnasSelectReporteTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoParamFactuListadoCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoParamFactuListadoCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoParamFactuListadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoParamFactuListadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoParamFactuListadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoParamFactuListadoCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoParamFactuListadoCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoParamFactuListadoCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoParamFactuListadoCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoParamFactuListadoCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoParamFactuListadoCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoParamFactuListadoCliente=new JScrollPane(this.jListRelacionesSelectReporteTipoParamFactuListadoCliente);
			
			this.jScrollRelacionesSelectReporteTipoParamFactuListadoCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoParamFactuListadoCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoParamFactuListadoCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoParamFactuListadoCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoParamFactuListadoCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoParamFactuListadoCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoParamFactuListadoCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoParamFactuListadoCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoParamFactuListadoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoParamFactuListadoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoParamFactuListadoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuListadoCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuListadoCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuListadoCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuListadoCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuListadoCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuListadoCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuListadoCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuListadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuListadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoParamFactuListadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoParamFactuListadoCliente.add(this.jLabelGenerarExcelReporteDinamicoTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoParamFactuListadoCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoParamFactuListadoCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoParamFactuListadoCliente.setToolTipText("Generar EXCEL"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		//this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoParamFactuListadoCliente.add(this.jButtonGenerarExcelReporteDinamicoTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParamFactuListadoCliente.add(this.jComboBoxTiposReportesDinamicoTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuListadoCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuListadoCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuListadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuListadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoParamFactuListadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoParamFactuListadoCliente.add(this.jLabelTiposArchivoReporteDinamicoTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParamFactuListadoCliente.add(this.jComboBoxTiposArchivosReportesDinamicoTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoParamFactuListadoCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoParamFactuListadoCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoParamFactuListadoCliente.setToolTipText("Generar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParamFactuListadoCliente.add(this.jButtonGenerarReporteDinamicoTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoParamFactuListadoCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoParamFactuListadoCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoParamFactuListadoCliente.setToolTipText("Cancelar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoParamFactuListadoCliente.add(this.jButtonCerrarReporteDinamicoTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoParamFactuListadoCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoParamFactuListadoCliente= new JScrollPane(jPanelReporteDinamicoTipoParamFactuListadoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoParamFactuListadoCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoParamFactuListadoCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoParamFactuListadoCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Listado Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoParamFactuListadoCliente);
		this.jInternalFrameReporteDinamicoTipoParamFactuListadoCliente.getContentPane().add(this.jScrollPanelReporteDinamicoTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoParamFactuListadoCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoParamFactuListadoCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoParamFactuListadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoParamFactuListadoCliente.setName("jPanelImportacionTipoParamFactuListadoCliente"); 
		
		this.jPanelImportacionTipoParamFactuListadoCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoParamFactuListadoCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoParamFactuListadoCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoParamFactuListadoCliente.setLayout(gridaBagLayoutImportacionTipoParamFactuListadoCliente);
		
		
		this.jInternalFrameImportacionTipoParamFactuListadoCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoParamFactuListadoCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoParamFactuListadoCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoParamFactuListadoCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoParamFactuListadoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoParamFactuListadoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoParamFactuListadoCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoParamFactuListadoCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoParamFactuListadoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoParamFactuListadoCliente.setResizable(true);
	    this.jInternalFrameImportacionTipoParamFactuListadoCliente.setClosable(true);
	    this.jInternalFrameImportacionTipoParamFactuListadoCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoParamFactuListadoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoParamFactuListadoCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoParamFactuListadoCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoParamFactuListadoCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoParamFactuListadoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoParamFactuListadoCliente.setResizable(true);
	    this.jInternalFrameImportacionTipoParamFactuListadoCliente.setClosable(true);
	    this.jInternalFrameImportacionTipoParamFactuListadoCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoParamFactuListadoCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoParamFactuListadoCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoParamFactuListadoCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Listado Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoParamFactuListadoCliente = new JLabelMe();

		this.jLabelArchivoImportacionTipoParamFactuListadoCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoParamFactuListadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoParamFactuListadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoParamFactuListadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoParamFactuListadoCliente.add(this.jLabelArchivoImportacionTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoParamFactuListadoCliente = new JFileChooser();		
		this.jFileChooserImportacionTipoParamFactuListadoCliente.setToolTipText("ESCOGER ARCHIVO"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonAbrirImportacionTipoParamFactuListadoCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoParamFactuListadoCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoParamFactuListadoCliente.setToolTipText("Generar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParamFactuListadoCliente.add(this.jButtonAbrirImportacionTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoParamFactuListadoCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoParamFactuListadoCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoParamFactuListadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoParamFactuListadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoParamFactuListadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoParamFactuListadoCliente.add(this.jLabelPathArchivoImportacionTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoParamFactuListadoCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoParamFactuListadoCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoParamFactuListadoCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoParamFactuListadoCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParamFactuListadoCliente.add(this.jTextFieldPathArchivoImportacionTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonGenerarImportacionTipoParamFactuListadoCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoParamFactuListadoCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoParamFactuListadoCliente.setToolTipText("Generar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParamFactuListadoCliente.add(this.jButtonGenerarImportacionTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonCerrarImportacionTipoParamFactuListadoCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoParamFactuListadoCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoParamFactuListadoCliente.setToolTipText("Cancelar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoParamFactuListadoCliente.add(this.jButtonCerrarImportacionTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoParamFactuListadoCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoParamFactuListadoCliente= new JScrollPane(jPanelImportacionTipoParamFactuListadoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoParamFactuListadoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoParamFactuListadoCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoParamFactuListadoCliente);
		this.jInternalFrameImportacionTipoParamFactuListadoCliente.getContentPane().add(this.jScrollPanelImportacionTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoParamFactuListadoCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoParamFactuListadoCliente = new JButtonMe();
			this.jButtonAbrirOrderByTipoParamFactuListadoCliente.setText("Orden");
			this.jButtonAbrirOrderByTipoParamFactuListadoCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoParamFactuListadoCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoParamFactuListadoCliente";
			inputMap = this.jButtonAbrirOrderByTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoParamFactuListadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoParamFactuListadoCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoParamFactuListadoCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoParamFactuListadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoParamFactuListadoCliente.setName("jPanelOrderByTipoParamFactuListadoCliente"); 
			
			this.jPanelOrderByTipoParamFactuListadoCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoParamFactuListadoCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoParamFactuListadoCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoParamFactuListadoCliente.setLayout(gridaBagLayoutOrderByTipoParamFactuListadoCliente);
			
			
			this.jTableDatosTipoParamFactuListadoClienteOrderBy = new JTableMe();        
			this.jTableDatosTipoParamFactuListadoClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoParamFactuListadoClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoParamFactuListadoClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoParamFactuListadoClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoParamFactuListadoClienteOrderBy.setViewportView(this.jTableDatosTipoParamFactuListadoClienteOrderBy);
			this.jTableDatosTipoParamFactuListadoClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoParamFactuListadoClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoParamFactuListadoCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoParamFactuListadoCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoParamFactuListadoCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoParamFactuListadoCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.setTitle("Orden");
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.setResizable(true);
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.setClosable(true);
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoParamFactuListadoCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoParamFactuListadoCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoParamFactuListadoCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Listado Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoParamFactuListadoCliente.ipady =150;
				
			this.jPanelOrderByTipoParamFactuListadoCliente.add(jScrollPanelDatosTipoParamFactuListadoClienteOrderBy, this.gridBagConstraintsTipoParamFactuListadoCliente);//this.jTableDatosTipoParamFactuListadoClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoParamFactuListadoCliente = new JButtonMe();
			this.jButtonCerrarOrderByTipoParamFactuListadoCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoParamFactuListadoCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoParamFactuListadoCliente.setToolTipText("Cancelar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoParamFactuListadoCliente.add(this.jButtonCerrarOrderByTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoParamFactuListadoCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoParamFactuListadoCliente= new JScrollPane(jPanelOrderByTipoParamFactuListadoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoParamFactuListadoCliente);
			
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.getContentPane().add(this.jScrollPanelOrderByTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);			
		
		} else {
			this.jButtonAbrirOrderByTipoParamFactuListadoCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//530
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=330;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=200;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoParamFactuListadoCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoParamFactuListadoCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoParamFactuListadoCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoParamFactuListadoCliente.getRowHeight();//TipoParamFactuListadoClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoParamFactuListadoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoParamFactuListadoCliente.isSelected()) {
					iHeightTable=TipoParamFactuListadoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoParamFactuListadoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoParamFactuListadoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoParamFactuListadoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoParamFactuListadoCliente.isSelected()) {
					iHeightTable=TipoParamFactuListadoClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoParamFactuListadoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoParamFactuListadoClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoParamFactuListadoCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoParamFactuListadoCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoParamFactuListadoCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoParamFactuListadoCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoParamFactuListadoCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoParamFactuListadoCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoParamFactuListadoCliente!=null && this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoParamFactuListadoCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoParamFactuListadoCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoParamFactuListadoCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoParamFactuListadoCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoparamfactulistadoclienteLogic.getTipoParamFactuListadoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparamfactulistadoclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoParamFactuListadoCliente> TraerTipoParamFactuListadoClienteBeans(List<TipoParamFactuListadoCliente> tipoparamfactulistadoclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoParamFactuListadoCliente tipoparamfactulistadocliente:tipoparamfactulistadoclientes) {
					
				if(!(TipoParamFactuListadoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoParamFactuListadoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoparamfactulistadocliente.setsDetalleGeneralEntityReporte(TipoParamFactuListadoClienteConstantesFunciones.getTipoParamFactuListadoClienteDescripcion(tipoparamfactulistadocliente));
										
						
					
						
					
				} else  {
							
					//tipoparamfactulistadocliente.setsDetalleGeneralEntityReporte(tipoparamfactulistadocliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipoparamfactulistadoclientebeans.add(tipoparamfactulistadoclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoparamfactulistadoclientes;
    }
	//PARA REPORTES FIN
}
