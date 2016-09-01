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
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;

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
import com.bydan.erp.inventario.util.TipoPrecioConstantesFunciones;

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
public class TipoPrecioJInternalFrame extends TipoPrecioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoPrecio;
	
	protected JMenuBar jmenuBarTipoPrecio;
	
	protected JMenu jmenuTipoPrecio;
	protected JMenu jmenuDatosTipoPrecio;
	protected JMenu jmenuArchivoTipoPrecio;
	protected JMenu jmenuAccionesTipoPrecio;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPrecio;	
	protected GridBagConstraints gridBagConstraintsTipoPrecio;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoPrecioDetalleFormJInternalFrame jInternalFrameDetalleFormTipoPrecio;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoPrecio;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoPrecio;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoPrecioSessionBean tipoprecioSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoPrecio> tipoprecios;		
	public List<TipoPrecio> tipopreciosEliminados;	
	public List<TipoPrecio> tipopreciosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoPrecio;		
	protected JButton jButtonAbrirOrderByTipoPrecio;
	
	
	//protected JPanel jPanelOrderByTipoPrecio;
	//public JScrollPane jScrollPanelOrderByTipoPrecio;	
	//protected JButton jButtonCerrarOrderByTipoPrecio;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoPrecioLogic tipoprecioLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoPrecio;
	public JScrollPane jScrollPanelDatosEdicionTipoPrecio;
	public JScrollPane jScrollPanelDatosGeneralTipoPrecio;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoPrecioOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoPrecio;
	//public JScrollPane jScrollPanelImportacionTipoPrecio;
	
	
	
	protected JPanel jPanelAccionesTipoPrecio;
	
    protected JPanel jPanelPaginacionTipoPrecio;
    protected JPanel jPanelParametrosReportesTipoPrecio;
	protected JPanel jPanelParametrosReportesAccionesTipoPrecio;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoPrecio;
	protected JPanel jPanelParametrosAuxiliar2TipoPrecio;
	protected JPanel jPanelParametrosAuxiliar3TipoPrecio;
	protected JPanel jPanelParametrosAuxiliar4TipoPrecio;
	//protected JPanel jPanelParametrosAuxiliar5TipoPrecio;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoPrecio;
	//protected JPanel jPanelImportacionTipoPrecio;
	
	
	public JTable jTableDatosTipoPrecio;
	
	
	
	//public JTable jTableDatosTipoPrecioOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoPrecio;
	protected JButton jButtonDuplicarTipoPrecio;
	protected JButton jButtonCopiarTipoPrecio;
	protected JButton jButtonVerFormTipoPrecio;
	protected JButton jButtonNuevoRelacionesTipoPrecio;
	protected JButton jButtonModificarTipoPrecio;
	
    protected JButton jButtonGuardarCambiosTablaTipoPrecio;
	protected JButton jButtonCerrarTipoPrecio;
	
	
	protected JButton jButtonRecargarInformacionTipoPrecio;
	protected JButton jButtonProcesarInformacionTipoPrecio;
	
	
	protected JButton jButtonAnterioresTipoPrecio;
	protected JButton jButtonSiguientesTipoPrecio;
	protected JButton jButtonNuevoGuardarCambiosTipoPrecio;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoPrecio;
	//protected JButton jButtonCerrarReporteDinamicoTipoPrecio;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoPrecio;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoPrecio;
	//protected JButton jButtonGenerarImportacionTipoPrecio;
	//protected JButton jButtonCerrarImportacionTipoPrecio;
	//protected JFileChooser jFileChooserImportacionTipoPrecio;
	//protected File fileImportacionTipoPrecio;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPrecio;
	protected JButton jButtonDuplicarToolBarTipoPrecio;
	protected JButton jButtonNuevoRelacionesToolBarTipoPrecio;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoPrecio;
	protected JButton jButtonCopiarToolBarTipoPrecio;
	protected JButton jButtonVerFormToolBarTipoPrecio;
	public JButton jButtonGuardarCambiosTablaToolBarTipoPrecio;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPrecio;
	protected JButton jButtonCerrarToolBarTipoPrecio;
	
	protected JButton jButtonRecargarInformacionToolBarTipoPrecio;
	protected JButton jButtonProcesarInformacionToolBarTipoPrecio;
	protected JButton jButtonAnterioresToolBarTipoPrecio;
	protected JButton jButtonSiguientesToolBarTipoPrecio;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoPrecio;
	protected JButton jButtonAbrirOrderByToolBarTipoPrecio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPrecio;
	protected JMenuItem jMenuItemDuplicarTipoPrecio;
	protected JMenuItem jMenuItemNuevoRelacionesTipoPrecio;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoPrecio;
	protected JMenuItem jMenuItemCopiarTipoPrecio;
	protected JMenuItem jMenuItemVerFormTipoPrecio;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPrecio;
	protected JMenuItem jMenuItemCerrarTipoPrecio;
	protected JMenuItem jMenuItemDetalleCerrarTipoPrecio;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoPrecio;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPrecio;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoPrecio;
	protected JMenuItem jMenuItemProcesarInformacionTipoPrecio;
	protected JMenuItem jMenuItemAnterioresTipoPrecio;
	protected JMenuItem jMenuItemSiguientesTipoPrecio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPrecio;
	protected JMenuItem jMenuItemAbrirOrderByTipoPrecio;
	protected JMenuItem jMenuItemMostrarOcultarTipoPrecio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPrecio;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoPrecio;
	protected JCheckBox jCheckBoxSeleccionadosTipoPrecio;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoPrecio;
	protected JCheckBox jCheckBoxConGraficoReporteTipoPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoPrecio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPrecio;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoPrecio;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoPrecio;
	protected JTextField jTextFieldValorCampoGeneralTipoPrecio;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoPrecio;
	//public JList<Reporte> jListColumnasSelectReporteTipoPrecio;
	//public JScrollPane jScrollColumnasSelectReporteTipoPrecio;
	
	//public JLabel jLabelRelacionesSelectReporteTipoPrecio;
	//public JList<Reporte> jListRelacionesSelectReporteTipoPrecio;
	//public JScrollPane jScrollRelacionesSelectReporteTipoPrecio;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoPrecio;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoPrecio;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoPrecio;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoPrecio;
	
		
	//public JLabel jLabelArchivoImportacionTipoPrecio;	
	//public JLabel jLabelPathArchivoImportacionTipoPrecio;
	//protected JTextField jTextFieldPathArchivoImportacionTipoPrecio;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoPrecio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoPrecio;
	
	//public JLabel jLabelColumnaCategoriaValorTipoPrecio;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoPrecio;
	
	//public JLabel jLabelColumnasValoresGraficoTipoPrecio;
	//public JList<Reporte> jListColumnasValoresGraficoTipoPrecio;
	//public JScrollPane jScrollColumnasValoresGraficoTipoPrecio;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoPrecio;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoPrecio;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoPrecio;
	public JPanel jPanelBusquedaPorCodigoTipoPrecio;
	public JButton jButtonBusquedaPorCodigoTipoPrecio;
	public JPanel jPanelBusquedaPorFechaDesdeTipoPrecio;
	public JButton jButtonBusquedaPorFechaDesdeTipoPrecio;
	public JPanel jPanelBusquedaPorFechaHastaTipoPrecio;
	public JButton jButtonBusquedaPorFechaHastaTipoPrecio;
	public JPanel jPanelBusquedaPorNombreTipoPrecio;
	public JButton jButtonBusquedaPorNombreTipoPrecio;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoPrecio;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoPrecio;
	public JTextArea jTextAreacodigoBusquedaPorCodigoTipoPrecio;
	public JButton jButtoncodigoBusquedaPorCodigoTipoPrecioBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_desdeBusquedaPorFechaDesdeTipoPrecio;
	public JLabel jLabelfecha_desdeBusquedaPorFechaDesdeTipoPrecio;
	//public JFormattedTextField jDateChooserfecha_desdeBusquedaPorFechaDesdeTipoPrecio;

	public JDateChooser jDateChooserfecha_desdeBusquedaPorFechaDesdeTipoPrecio;
	public JButton jButtonfecha_desdeBusquedaPorFechaDesdeTipoPrecioBusqueda= new JButtonMe();

	
	public JPanel jPanelfecha_hastaBusquedaPorFechaHastaTipoPrecio;
	public JLabel jLabelfecha_hastaBusquedaPorFechaHastaTipoPrecio;
	//public JFormattedTextField jDateChooserfecha_hastaBusquedaPorFechaHastaTipoPrecio;

	public JDateChooser jDateChooserfecha_hastaBusquedaPorFechaHastaTipoPrecio;
	public JButton jButtonfecha_hastaBusquedaPorFechaHastaTipoPrecioBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoPrecio;
	public JLabel jLabelnombreBusquedaPorNombreTipoPrecio;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoPrecio;
	public JButton jButtonnombreBusquedaPorNombreTipoPrecioBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoPrecioJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrecioJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrecioJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrecioJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoPrecio)	{
		this.jButtonRecargarInformacionTipoPrecio = jButtonRecargarInformacionTipoPrecio;
	}
	
	public JButton getjButtonProcesarInformacionTipoPrecio() {
		return this.jButtonProcesarInformacionTipoPrecio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPrecio)	{
		this.jButtonProcesarInformacionTipoPrecio = jButtonProcesarInformacionTipoPrecio;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoPrecio() {
		return this.jButtonRecargarInformacionTipoPrecio;
	}
	
	
	public List<TipoPrecio> gettipoprecios() {
		return this.tipoprecios;
	}

	public void settipoprecios(List<TipoPrecio> tipoprecios) {
		this.tipoprecios = tipoprecios;
	}
	
	public List<TipoPrecio> gettipopreciosAux() {
		return this.tipopreciosAux;
	}

	public void settipopreciosAux(List<TipoPrecio> tipopreciosAux) {
		this.tipopreciosAux = tipopreciosAux;
	}
	
	public List<TipoPrecio> gettipopreciosEliminados() {
		return this.tipopreciosEliminados;
	}

	public void setTipoPreciosEliminados(List<TipoPrecio> tipopreciosEliminados) {
		this.tipopreciosEliminados = tipopreciosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoPrecio() {
		return jComboBoxTiposSeleccionarTipoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoPrecio(
			JComboBox jComboBoxTiposSeleccionarTipoPrecio) {
		this.jComboBoxTiposSeleccionarTipoPrecio = jComboBoxTiposSeleccionarTipoPrecio;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoPrecio .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoPrecio() {
		return jTextFieldValorCampoGeneralTipoPrecio;
	}

	public void setjTextFieldValorCampoGeneralTipoPrecio(
			JTextField jTextFieldValorCampoGeneralTipoPrecio) {
		this.jTextFieldValorCampoGeneralTipoPrecio = jTextFieldValorCampoGeneralTipoPrecio;
	}

	public void setBorderResaltarValorCampoGeneralTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrecio.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoPrecio .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoPrecio() {
		return this.jCheckBoxSeleccionarTodosTipoPrecio;
	}

	public void setjCheckBoxSeleccionarTodosTipoPrecio(
			JCheckBox jCheckBoxSeleccionarTodosTipoPrecio) {
		this.jCheckBoxSeleccionarTodosTipoPrecio = jCheckBoxSeleccionarTodosTipoPrecio;
	}

	public void setBorderResaltarSeleccionarTodosTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrecio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoPrecio .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoPrecio() {
		return this.jCheckBoxSeleccionadosTipoPrecio;
	}

	public void setjCheckBoxSeleccionadosTipoPrecio(
			JCheckBox jCheckBoxSeleccionadosTipoPrecio) {
		this.jCheckBoxSeleccionadosTipoPrecio = jCheckBoxSeleccionadosTipoPrecio;
	}
	
	public void setBorderResaltarSeleccionadosTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrecio.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoPrecio .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoPrecio() {
		return this.jComboBoxTiposArchivosReportesTipoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoPrecio(
			JComboBox jComboBoxTiposArchivosReportesTipoPrecio) {
		this.jComboBoxTiposArchivosReportesTipoPrecio = jComboBoxTiposArchivosReportesTipoPrecio;
	}

	public void setBorderResaltarTiposArchivosReportesTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoPrecio() {
		return this.jComboBoxTiposReportesTipoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoPrecio(
			JComboBox jComboBoxTiposReportesTipoPrecio) {
		this.jComboBoxTiposReportesTipoPrecio = jComboBoxTiposReportesTipoPrecio;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoPrecio() {
	//	return jComboBoxTiposReportesDinamicoTipoPrecio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoPrecio(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoPrecio) {
	//	this.jComboBoxTiposReportesDinamicoTipoPrecio = jComboBoxTiposReportesDinamicoTipoPrecio;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoPrecio() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoPrecio;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoPrecio(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoPrecio) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoPrecio = jComboBoxTiposArchivosReportesDinamicoTipoPrecio;
	//}
	
	public void setBorderResaltarTiposReportesTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoPrecio() {
		return this.jComboBoxTiposGraficosReportesTipoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoPrecio(
			JComboBox jComboBoxTiposGraficosReportesTipoPrecio) {
		this.jComboBoxTiposGraficosReportesTipoPrecio = jComboBoxTiposGraficosReportesTipoPrecio;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoPrecio() {
		return this.jComboBoxTiposPaginacionTipoPrecio;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoPrecio(
			JComboBox jComboBoxTiposPaginacionTipoPrecio) {
		this.jComboBoxTiposPaginacionTipoPrecio = jComboBoxTiposPaginacionTipoPrecio;
	}
	
	public void setBorderResaltarTiposPaginacionTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoPrecio .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoPrecio() {
		return this.jComboBoxTiposRelacionesTipoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPrecio() {
		return this.jComboBoxTiposAccionesTipoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPrecio(
			JComboBox jComboBoxTiposRelacionesTipoPrecio) {
		this.jComboBoxTiposRelacionesTipoPrecio = jComboBoxTiposRelacionesTipoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPrecio(
			JComboBox jComboBoxTiposAccionesTipoPrecio) {
		this.jComboBoxTiposAccionesTipoPrecio = jComboBoxTiposAccionesTipoPrecio;
	}
	
	public void setBorderResaltarTiposRelacionesTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoPrecio .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoPrecio() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoPrecio.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoPrecio .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoPrecio() {
	//	return jCheckBoxConGraficoDinamicoTipoPrecio;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoPrecio(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoPrecio) {
	//	this.jCheckBoxConGraficoDinamicoTipoPrecio = jCheckBoxConGraficoDinamicoTipoPrecio;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoPrecio() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoPrecio.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoPrecio .setBorder(borderResaltar);		
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
		this.tipoprecioSessionBean=new TipoPrecioSessionBean();
		
		this.tipoprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprecioSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPrecioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Precio MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipoprecioSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoPrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoPrecio= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoPrecio,this.jTtoolBarTipoPrecio,
							"nuevo","nuevo","Nuevo"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoPrecio,this.jTtoolBarTipoPrecio,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoPrecio,this.jTtoolBarTipoPrecio,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoPrecio,this.jTtoolBarTipoPrecio,
							"duplicar","duplicar","Duplicar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoPrecio,this.jTtoolBarTipoPrecio,
							"copiar","copiar","Copiar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoPrecio,this.jTtoolBarTipoPrecio,
							"ver_form","ver_form","Ver"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPrecio,this.jTtoolBarTipoPrecio,
							"recargar","recargar","Recargar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPrecio,this.jTtoolBarTipoPrecio,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoPrecio,this.jTtoolBarTipoPrecio,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoPrecio,this.jTtoolBarTipoPrecio,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoPrecio,this.jTtoolBarTipoPrecio,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoPrecio,this.jTtoolBarTipoPrecio,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoPrecio,this.jTtoolBarTipoPrecio,
							"cerrar","cerrar","Salir"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoPrecio=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoPrecio;
			
				this.jButtonProcesarInformacionToolBarTipoPrecio=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoPrecio;
				
		//protected JButton jButtonModificarToolBarTipoPrecio;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoPrecio=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoPrecio=new JMenuMe("General");
		this.jmenuArchivoTipoPrecio=new JMenuMe("Archivo");
		this.jmenuAccionesTipoPrecio=new JMenuMe("Acciones");
		this.jmenuDatosTipoPrecio=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPrecio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPrecio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPrecio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoPrecio= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoPrecio.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoPrecio,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoPrecio= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoPrecio.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoPrecio,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoPrecio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPrecio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPrecio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoPrecio= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoPrecio.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoPrecio,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoPrecio= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoPrecio.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoPrecio,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoPrecio= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoPrecio.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoPrecio,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoPrecio= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoPrecio.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoPrecio,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoPrecio= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoPrecio.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoPrecio,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoPrecio= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoPrecio.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoPrecio,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoPrecio= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoPrecio.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoPrecio,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoPrecio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoPrecio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoPrecio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPrecio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoPrecio= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoPrecio.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoPrecio,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPrecio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoPrecio= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoPrecio.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoPrecio,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoPrecio.add(this.jMenuItemCerrarTipoPrecio);
			
			this.jmenuAccionesTipoPrecio.add(this.jMenuItemNuevoTipoPrecio);
			this.jmenuAccionesTipoPrecio.add(this.jMenuItemNuevoGuardarCambiosTipoPrecio);
			this.jmenuAccionesTipoPrecio.add(this.jMenuItemNuevoRelacionesTipoPrecio);
			this.jmenuAccionesTipoPrecio.add(this.jMenuItemGuardarCambiosTablaTipoPrecio);		
			this.jmenuAccionesTipoPrecio.add(this.jMenuItemDuplicarTipoPrecio);		
			this.jmenuAccionesTipoPrecio.add(this.jMenuItemCopiarTipoPrecio);		
			this.jmenuAccionesTipoPrecio.add(this.jMenuItemVerFormTipoPrecio);		
			
			this.jmenuDatosTipoPrecio.add(this.jMenuItemRecargarInformacionTipoPrecio);				
			this.jmenuDatosTipoPrecio.add(this.jMenuItemAnterioresTipoPrecio);				
			this.jmenuDatosTipoPrecio.add(this.jMenuItemSiguientesTipoPrecio);				
			this.jmenuDatosTipoPrecio.add(this.jMenuItemAbrirOrderByTipoPrecio);				
			this.jmenuDatosTipoPrecio.add(this.jMenuItemMostrarOcultarTipoPrecio);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoPrecio.add(this.jMenuItemGuardarCambiosTipoPrecio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoPrecio.add(this.jmenuArchivoTipoPrecio);		
			this.jmenuBarTipoPrecio.add(this.jmenuAccionesTipoPrecio);		
			this.jmenuBarTipoPrecio.add(this.jmenuDatosTipoPrecio);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoPrecio);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoPrecio() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoPrecio.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoPrecio= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoPrecio.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoPrecio.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoPrecio,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoPrecio = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoPrecio.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoPrecio.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreacodigoBusquedaPorCodigoTipoPrecio= new JTextAreaMe();
		jTextAreacodigoBusquedaPorCodigoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBusquedaPorCodigoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoBusquedaPorCodigoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreacodigoBusquedaPorCodigoTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorFechaDesdeTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaDesdeTipoPrecio.setToolTipText("Buscar Por Fecha Desde ");
		this.jButtonBusquedaPorFechaDesdeTipoPrecio= new JButtonMe();
		this.jButtonBusquedaPorFechaDesdeTipoPrecio.setText("Buscar");
		this.jButtonBusquedaPorFechaDesdeTipoPrecio.setToolTipText("Buscar Por Fecha Desde ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaDesdeTipoPrecio,"buscar_button","Buscar Por Fecha Desde ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaDesdeTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_desdeBusquedaPorFechaDesdeTipoPrecio = new JLabelMe();
		jLabelfecha_desdeBusquedaPorFechaDesdeTipoPrecio.setText("Fecha Desde :");
		jLabelfecha_desdeBusquedaPorFechaDesdeTipoPrecio.setToolTipText("Fecha Desde");
		jLabelfecha_desdeBusquedaPorFechaDesdeTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaPorFechaDesdeTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_desdeBusquedaPorFechaDesdeTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeBusquedaPorFechaDesdeTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_desdeBusquedaPorFechaDesdeTipoPrecio= new JDateChooser();
		jDateChooserfecha_desdeBusquedaPorFechaDesdeTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaPorFechaDesdeTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeBusquedaPorFechaDesdeTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeBusquedaPorFechaDesdeTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_desdeBusquedaPorFechaDesdeTipoPrecio.setDate(new Date());
		jDateChooserfecha_desdeBusquedaPorFechaDesdeTipoPrecio.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_desdeBusquedaPorFechaDesdeTipoPrecio.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorFechaHastaTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorFechaHastaTipoPrecio.setToolTipText("Buscar Por Fecha Hasta ");
		this.jButtonBusquedaPorFechaHastaTipoPrecio= new JButtonMe();
		this.jButtonBusquedaPorFechaHastaTipoPrecio.setText("Buscar");
		this.jButtonBusquedaPorFechaHastaTipoPrecio.setToolTipText("Buscar Por Fecha Hasta ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorFechaHastaTipoPrecio,"buscar_button","Buscar Por Fecha Hasta ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorFechaHastaTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelfecha_hastaBusquedaPorFechaHastaTipoPrecio = new JLabelMe();
		jLabelfecha_hastaBusquedaPorFechaHastaTipoPrecio.setText("Fecha Hasta :");
		jLabelfecha_hastaBusquedaPorFechaHastaTipoPrecio.setToolTipText("Fecha Hasta");
		jLabelfecha_hastaBusquedaPorFechaHastaTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaPorFechaHastaTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelfecha_hastaBusquedaPorFechaHastaTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaBusquedaPorFechaHastaTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jDateChooserfecha_hastaBusquedaPorFechaHastaTipoPrecio= new JDateChooser();
		jDateChooserfecha_hastaBusquedaPorFechaHastaTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaPorFechaHastaTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaBusquedaPorFechaHastaTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaBusquedaPorFechaHastaTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);
		jDateChooserfecha_hastaBusquedaPorFechaHastaTipoPrecio.setDate(new Date());
		jDateChooserfecha_hastaBusquedaPorFechaHastaTipoPrecio.setDateFormatString("yyyy-MM-dd");;
		//jDateChooserfecha_hastaBusquedaPorFechaHastaTipoPrecio.setText(Funciones.getStringMySqlCurrentDate());



		this.jPanelBusquedaPorNombreTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoPrecio.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoPrecio= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoPrecio.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoPrecio.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoPrecio,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoPrecio = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoPrecio.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoPrecio.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoPrecio= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoPrecio=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoPrecio.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoPrecio.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoPrecio.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoPrecio = new TipoPrecioDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Precio DATOS");
			this.jInternalFrameDetalleFormTipoPrecio = new TipoPrecioDetalleFormJInternalFrame(jDesktopPane,this.tipoprecioSessionBean.getConGuardarRelaciones(),this.tipoprecioSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoPrecio = null;//new TipoPrecioDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPrecio= new GridBagLayout();
		
		
		this.jTableDatosTipoPrecio = new JTableMe();      
		
		String sToolTipTipoPrecio="";
		sToolTipTipoPrecio=TipoPrecioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPrecio+="(Inventario.TipoPrecio)";
		}
		
		if(!this.tipoprecioSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPrecio+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoPrecio.setToolTipText(sToolTipTipoPrecio);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoPrecio);
		this.jTableDatosTipoPrecio.setAutoCreateRowSorter(true);
		this.jTableDatosTipoPrecio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoPrecio.setRowSelectionAllowed(true);
		this.jTableDatosTipoPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoPrecio,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoPrecio = new JButtonMe();
		this.jButtonDuplicarTipoPrecio = new JButtonMe();
		this.jButtonCopiarTipoPrecio = new JButtonMe();
		this.jButtonVerFormTipoPrecio = new JButtonMe();
		this.jButtonNuevoRelacionesTipoPrecio = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoPrecio = new JButtonMe();
		this.jButtonCerrarTipoPrecio = new JButtonMe();
		
		this.jScrollPanelDatosTipoPrecio = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoPrecio = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Precio";
		
		if(!this.tipoprecioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Precioes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPrecio.setToolTipText("Acciones");
        this.jPanelAccionesTipoPrecio.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoPrecio=new ReporteDinamicoJInternalFrame(TipoPrecioConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoPrecio();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoPrecio=new ImportacionJInternalFrame(TipoPrecioConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoPrecio();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoPrecio = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoPrecio.setText("Orden");
		this.jButtonAbrirOrderByTipoPrecio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPrecio,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrecio,false,this);
			
			//this.cargarOrderByTipoPrecio(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrecio,true,this);
			
			//this.cargarOrderByTipoPrecio(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoPrecio.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosTipoPrecio.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosTipoPrecio.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosTipoPrecio.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPrecio.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoPrecio.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoPrecio.setText("Nuevo");
		this.jButtonDuplicarTipoPrecio.setText("Duplicar");
		this.jButtonCopiarTipoPrecio.setText("Copiar");
		this.jButtonVerFormTipoPrecio.setText("Ver");
		this.jButtonNuevoRelacionesTipoPrecio.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoPrecio.setText("Guardar");
		this.jButtonCerrarTipoPrecio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPrecio,"nuevo_button","Nuevo",this.tipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoPrecio,"duplicar_button","Duplicar",this.tipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoPrecio,"copiar_button","Copiar",this.tipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoPrecio,"ver_form","Ver",this.tipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoPrecio,"nuevorelaciones_button","Nuevo Rel",this.tipoprecioSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPrecio,"guardarcambiostabla_button","Guardar",this.tipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPrecio,"cerrar_button","Salir",this.tipoprecioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoPrecio.setToolTipText("Nuevo"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoPrecio.setToolTipText("Duplicar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoPrecio.setToolTipText("Copiar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoPrecio.setToolTipText("Ver"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoPrecio.setToolTipText("Nuevo Rel"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoPrecio.setToolTipText("Guardar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPrecio.setToolTipText("Salir"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPrecio";
		inputMap = this.jButtonNuevoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPrecio"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoPrecio";
		inputMap = this.jButtonDuplicarTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoPrecio"));
		
		//COPIAR
		sMapKey = "CopiarTipoPrecio";
		inputMap = this.jButtonCopiarTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoPrecio"));
		
		//VEr FORM
		sMapKey = "VerFormTipoPrecio";
		inputMap = this.jButtonVerFormTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoPrecio"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoPrecio";
		inputMap = this.jButtonNuevoRelacionesTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoPrecio"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoPrecio";
		inputMap = this.jButtonModificarTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoPrecio"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoPrecio";
		inputMap = this.jButtonCerrarTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPrecio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPrecio";
		inputMap = this.jButtonGuardarCambiosTablaTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPrecio"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoPrecio.setName("jPanelParametrosReportesTipoPrecio"); 
		
		this.jPanelParametrosReportesAccionesTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoPrecio.setName("jPanelParametrosReportesAccionesTipoPrecio"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoPrecio = new JButtonMe();
		this.jButtonRecargarInformacionTipoPrecio.setText("Recargar");
		this.jButtonRecargarInformacionTipoPrecio.setToolTipText("Recargar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoPrecio,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoPrecio = new JButtonMe();
		this.jButtonProcesarInformacionTipoPrecio.setText("Procesar");
		this.jButtonProcesarInformacionTipoPrecio.setToolTipText("Procesar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoPrecio.setVisible(false);
			
		this.jButtonProcesarInformacionTipoPrecio.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPrecio.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoPrecio.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPrecio.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoPrecio.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPrecio.setText("TIPO");       
		this.jComboBoxTiposReportesTipoPrecio.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoPrecio.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoPrecio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoPrecio.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoPrecio.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoPrecio.setText("Accion");
		this.jComboBoxTiposRelacionesTipoPrecio.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPrecio.setText("Accion");
		this.jComboBoxTiposAccionesTipoPrecio.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoPrecio.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoPrecio.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoPrecio=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoPrecio.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPrecio.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoPrecio.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoPrecio = new JLabelMe();
		
		this.jLabelAccionesTipoPrecio.setText("Acciones");		
		this.jLabelAccionesTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoPrecio.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoPrecio.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoPrecio = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoPrecio.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoPrecio.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoPrecio = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoPrecio.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoPrecio.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoPrecio.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoPrecio.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoPrecio = new JButtonMe();
		//this.jButtonAnterioresTipoPrecio.setText("<<");
        this.jButtonAnterioresTipoPrecio.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoPrecio,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoPrecio = new JButtonMe();
		//this.jButtonSiguientesTipoPrecio.setText(">>");
        this.jButtonSiguientesTipoPrecio.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoPrecio,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoPrecio = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoPrecio.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoPrecio.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoPrecio,"nuevoguardarcambios_button","Nue",this.tipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoPrecio";
		inputMap = this.jButtonNuevoGuardarCambiosTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoPrecio"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoPrecio";
		inputMap = this.jButtonRecargarInformacionTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoPrecio"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoPrecio";
		inputMap = this.jButtonSiguientesTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoPrecio"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoPrecio";
		inputMap = this.jButtonAnterioresTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoPrecio"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoPrecio();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoPrecio.setMinimumSize(new Dimension(this.getWidth(),TipoPrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPrecioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPrecio.setMaximumSize(new Dimension(this.getWidth(),TipoPrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPrecioBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoPrecio.setPreferredSize(new Dimension(this.getWidth(),TipoPrecioBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoPrecioBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoPrecio = new GridBagLayout();

			this.jPanelPaginacionTipoPrecio.setLayout(gridaBagLayoutPaginacionTipoPrecio);						
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy = 0;
			this.gridBagConstraintsTipoPrecio.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoPrecio.add(this.jButtonAnterioresTipoPrecio, this.gridBagConstraintsTipoPrecio);
					
						
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPrecio.gridy = 0;
			
			this.jPanelPaginacionTipoPrecio.add(this.jButtonNuevoGuardarCambiosTipoPrecio, this.gridBagConstraintsTipoPrecio);
						
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoPrecio.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoPrecio.gridy = 0;
			this.jPanelPaginacionTipoPrecio.add(this.jButtonSiguientesTipoPrecio, this.gridBagConstraintsTipoPrecio);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy = 1;
			this.gridBagConstraintsTipoPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrecio.add(this.jButtonNuevoTipoPrecio, this.gridBagConstraintsTipoPrecio);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoPrecio.gridy = 1;
				this.gridBagConstraintsTipoPrecio.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTipoPrecio.add(this.jButtonNuevoRelacionesTipoPrecio, this.gridBagConstraintsTipoPrecio);
			}
			
			
			if(!this.tipoprecioSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoPrecio.gridy = 1;
				this.gridBagConstraintsTipoPrecio.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoPrecio.add(this.jButtonGuardarCambiosTablaTipoPrecio, this.gridBagConstraintsTipoPrecio);
			}
			
			
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy = 1;
			this.gridBagConstraintsTipoPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrecio.add(this.jButtonDuplicarTipoPrecio, this.gridBagConstraintsTipoPrecio);
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy = 1;
			this.gridBagConstraintsTipoPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrecio.add(this.jButtonCopiarTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy = 1;
			this.gridBagConstraintsTipoPrecio.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoPrecio.add(this.jButtonVerFormTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy = 1;
			this.gridBagConstraintsTipoPrecio.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoPrecio.add(this.jButtonCerrarTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
		
		
		this.jButtonRecargarInformacionTipoPrecio.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPrecio.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoPrecio.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoPrecio.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPrecio.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoPrecio.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoPrecio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPrecio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoPrecio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoPrecio.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPrecio.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoPrecio.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoPrecio.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPrecio.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoPrecio.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoPrecio.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPrecio.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoPrecio.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoPrecio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPrecio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoPrecio.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoPrecio.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPrecio.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoPrecio.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoPrecio = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoPrecio = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoPrecio = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoPrecio.setLayout(gridaBagParametrosReportesTipoPrecio);
			this.jPanelParametrosReportesAccionesTipoPrecio.setLayout(gridaBagParametrosReportesAccionesTipoPrecio);
			
			
			this.jPanelParametrosAuxiliar1TipoPrecio.setLayout(gridaBagParametrosAuxiliar1TipoPrecio);
			this.jPanelParametrosAuxiliar2TipoPrecio.setLayout(gridaBagParametrosAuxiliar2TipoPrecio);
			this.jPanelParametrosAuxiliar3TipoPrecio.setLayout(gridaBagParametrosAuxiliar3TipoPrecio);
			this.jPanelParametrosAuxiliar4TipoPrecio.setLayout(gridaBagParametrosAuxiliar4TipoPrecio);
			//this.jPanelParametrosAuxiliar5TipoPrecio.setLayout(gridaBagParametrosAuxiliar2TipoPrecio);			
			
			
			
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrecio.add(this.jButtonRecargarInformacionTipoPrecio, this.gridBagConstraintsTipoPrecio);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPrecio.add(this.jComboBoxTiposPaginacionTipoPrecio, this.gridBagConstraintsTipoPrecio);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPrecio.add(this.jCheckBoxConAltoMaximoTablaTipoPrecio, this.gridBagConstraintsTipoPrecio);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrecio.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoPrecio.add(this.jComboBoxTiposArchivosReportesTipoPrecio, this.gridBagConstraintsTipoPrecio);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrecio.add(this.jPanelParametrosAuxiliar1TipoPrecio, this.gridBagConstraintsTipoPrecio);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoPrecio.add(this.jComboBoxTiposReportesTipoPrecio, this.gridBagConstraintsTipoPrecio);																		
			
			
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4TipoPrecio.add(this.jComboBoxTiposGraficosReportesTipoPrecio, this.gridBagConstraintsTipoPrecio);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrecio.add(this.jPanelParametrosAuxiliar4TipoPrecio, this.gridBagConstraintsTipoPrecio);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrecio.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrecio.add(this.jComboBoxTiposReportesTipoPrecio, this.gridBagConstraintsTipoPrecio);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrecio.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPrecio.add(this.jCheckBoxGenerarReporteTipoPrecio, this.gridBagConstraintsTipoPrecio);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrecio.add(this.jPanelParametrosAuxiliar2TipoPrecio, this.gridBagConstraintsTipoPrecio);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrecio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPrecio.add(this.jLabelAccionesTipoPrecio, this.gridBagConstraintsTipoPrecio);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
				this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoPrecio.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoPrecio.add(this.jButtonAbrirOrderByTipoPrecio, this.gridBagConstraintsTipoPrecio);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrecio.add(this.jComboBoxTiposSeleccionarTipoPrecio, this.gridBagConstraintsTipoPrecio);			
			
			
			/*
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrecio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPrecio.add(this.jCheckBoxSeleccionarTodosTipoPrecio, this.gridBagConstraintsTipoPrecio);
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrecio.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoPrecio.add(this.jCheckBoxConGraficoReporteTipoPrecio, this.gridBagConstraintsTipoPrecio);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPrecio.add(this.jCheckBoxSeleccionarTodosTipoPrecio, this.gridBagConstraintsTipoPrecio);															
				
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPrecio.add(this.jCheckBoxSeleccionadosTipoPrecio, this.gridBagConstraintsTipoPrecio);															
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoPrecio.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoPrecio.add(this.jCheckBoxConGraficoReporteTipoPrecio, this.gridBagConstraintsTipoPrecio);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrecio.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoPrecio.add(this.jPanelParametrosAuxiliar3TipoPrecio, this.gridBagConstraintsTipoPrecio);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrecio.add(this.jComboBoxTiposRelacionesTipoPrecio, this.gridBagConstraintsTipoPrecio);
				
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrecio.add(this.jComboBoxTiposAccionesTipoPrecio, this.gridBagConstraintsTipoPrecio);
	
				
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoPrecio.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoPrecio.add(this.jTextFieldValorCampoGeneralTipoPrecio, this.gridBagConstraintsTipoPrecio);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoPrecio = new GridBagLayout();

			this.jScrollPanelDatosTipoPrecio.setLayout(gridaBagLayoutDatosTipoPrecio);
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy = 0;
			this.gridBagConstraintsTipoPrecio.gridx = 0;
			
			this.jScrollPanelDatosTipoPrecio.add(this.jTableDatosTipoPrecio, this.gridBagConstraintsTipoPrecio);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoPrecio.setViewportView(this.jTableDatosTipoPrecio);
		this.jTableDatosTipoPrecio.setFillsViewportHeight(true);
		this.jTableDatosTipoPrecio.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoPrecio= new GridBagLayout();
		this.jPanelAccionesTipoPrecio.setLayout(gridaBagLayoutAccionesTipoPrecio);
		
		
		/*	
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrecio.gridy = 0;
		this.gridBagConstraintsTipoPrecio.gridx = 0;
			
		this.jPanelAccionesTipoPrecio.add(this.jButtonNuevoTipoPrecio, this.gridBagConstraintsTipoPrecio);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoPrecio= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoPrecio.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoPrecio.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoPrecio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoPrecio.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoPrecio.setLayout(gridaBagLayoutBusquedaPorCodigoTipoPrecio);

		gridBagConstraintsTipoPrecio = new GridBagConstraints();
		gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrecio.gridy = 0;
		gridBagConstraintsTipoPrecio.gridx = 0;
		jPanelBusquedaPorCodigoTipoPrecio.add(jLabelcodigoBusquedaPorCodigoTipoPrecio, gridBagConstraintsTipoPrecio);

		gridBagConstraintsTipoPrecio = new GridBagConstraints();
		gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrecio.gridy = 0;
		gridBagConstraintsTipoPrecio.gridx = 1;
		jPanelBusquedaPorCodigoTipoPrecio.add(jTextAreacodigoBusquedaPorCodigoTipoPrecio, gridBagConstraintsTipoPrecio);

		gridBagConstraintsTipoPrecio = new GridBagConstraints();
		gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrecio.gridy = 1;
		gridBagConstraintsTipoPrecio.gridx =1;
		jPanelBusquedaPorCodigoTipoPrecio.add(jButtonBusquedaPorCodigoTipoPrecio, gridBagConstraintsTipoPrecio);

		jTabbedPaneBusquedasTipoPrecio.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoPrecio);
		jTabbedPaneBusquedasTipoPrecio.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorFechaDesdeTipoPrecio= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaDesdeTipoPrecio.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaDesdeTipoPrecio.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaDesdeTipoPrecio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaDesdeTipoPrecio.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaDesdeTipoPrecio.setLayout(gridaBagLayoutBusquedaPorFechaDesdeTipoPrecio);

		gridBagConstraintsTipoPrecio = new GridBagConstraints();
		gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrecio.gridy = 0;
		gridBagConstraintsTipoPrecio.gridx = 0;
		jPanelBusquedaPorFechaDesdeTipoPrecio.add(jLabelfecha_desdeBusquedaPorFechaDesdeTipoPrecio, gridBagConstraintsTipoPrecio);

		gridBagConstraintsTipoPrecio = new GridBagConstraints();
		gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrecio.gridy = 0;
		gridBagConstraintsTipoPrecio.gridx = 1;
		jPanelBusquedaPorFechaDesdeTipoPrecio.add(jDateChooserfecha_desdeBusquedaPorFechaDesdeTipoPrecio, gridBagConstraintsTipoPrecio);

		gridBagConstraintsTipoPrecio = new GridBagConstraints();
		gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrecio.gridy = 1;
		gridBagConstraintsTipoPrecio.gridx =1;
		jPanelBusquedaPorFechaDesdeTipoPrecio.add(jButtonBusquedaPorFechaDesdeTipoPrecio, gridBagConstraintsTipoPrecio);

		jTabbedPaneBusquedasTipoPrecio.addTab("2.-Por Fecha Desde ", jPanelBusquedaPorFechaDesdeTipoPrecio);
		jTabbedPaneBusquedasTipoPrecio.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorFechaHastaTipoPrecio= new GridBagLayout();
		gridaBagLayoutBusquedaPorFechaHastaTipoPrecio.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorFechaHastaTipoPrecio.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorFechaHastaTipoPrecio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorFechaHastaTipoPrecio.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorFechaHastaTipoPrecio.setLayout(gridaBagLayoutBusquedaPorFechaHastaTipoPrecio);

		gridBagConstraintsTipoPrecio = new GridBagConstraints();
		gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrecio.gridy = 0;
		gridBagConstraintsTipoPrecio.gridx = 0;
		jPanelBusquedaPorFechaHastaTipoPrecio.add(jLabelfecha_hastaBusquedaPorFechaHastaTipoPrecio, gridBagConstraintsTipoPrecio);

		gridBagConstraintsTipoPrecio = new GridBagConstraints();
		gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrecio.gridy = 0;
		gridBagConstraintsTipoPrecio.gridx = 1;
		jPanelBusquedaPorFechaHastaTipoPrecio.add(jDateChooserfecha_hastaBusquedaPorFechaHastaTipoPrecio, gridBagConstraintsTipoPrecio);

		gridBagConstraintsTipoPrecio = new GridBagConstraints();
		gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrecio.gridy = 1;
		gridBagConstraintsTipoPrecio.gridx =1;
		jPanelBusquedaPorFechaHastaTipoPrecio.add(jButtonBusquedaPorFechaHastaTipoPrecio, gridBagConstraintsTipoPrecio);

		jTabbedPaneBusquedasTipoPrecio.addTab("3.-Por Fecha Hasta ", jPanelBusquedaPorFechaHastaTipoPrecio);
		jTabbedPaneBusquedasTipoPrecio.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoPrecio= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoPrecio.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoPrecio.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoPrecio.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoPrecio.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoPrecio.setLayout(gridaBagLayoutBusquedaPorNombreTipoPrecio);

		gridBagConstraintsTipoPrecio = new GridBagConstraints();
		gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrecio.gridy = 0;
		gridBagConstraintsTipoPrecio.gridx = 0;
		jPanelBusquedaPorNombreTipoPrecio.add(jLabelnombreBusquedaPorNombreTipoPrecio, gridBagConstraintsTipoPrecio);

		gridBagConstraintsTipoPrecio = new GridBagConstraints();
		gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrecio.gridy = 0;
		gridBagConstraintsTipoPrecio.gridx = 1;
		jPanelBusquedaPorNombreTipoPrecio.add(jTextAreanombreBusquedaPorNombreTipoPrecio, gridBagConstraintsTipoPrecio);

		gridBagConstraintsTipoPrecio = new GridBagConstraints();
		gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoPrecio.gridy = 1;
		gridBagConstraintsTipoPrecio.gridx =1;
		jPanelBusquedaPorNombreTipoPrecio.add(jButtonBusquedaPorNombreTipoPrecio, gridBagConstraintsTipoPrecio);

		jTabbedPaneBusquedasTipoPrecio.addTab("4.-Por Nombre ", jPanelBusquedaPorNombreTipoPrecio);
		jTabbedPaneBusquedasTipoPrecio.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPrecio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPrecio);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprecioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();						
			this.gridBagConstraintsTipoPrecio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPrecio.gridx = 0;		
			//this.gridBagConstraintsTipoPrecio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPrecio.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoPrecio, this.gridBagConstraintsTipoPrecio);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoPrecio.gridx = 0;		
		//this.gridBagConstraintsTipoPrecio.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoPrecio.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoPrecio);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoPrecio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPrecio.gridx = 0;		
			this.gridBagConstraintsTipoPrecio.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoPrecio.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoPrecio, this.gridBagConstraintsTipoPrecio);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrecio.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoPrecio, this.gridBagConstraintsTipoPrecio);								
		
		
		/*
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrecio.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoPrecio, this.gridBagConstraintsTipoPrecio);
		*/		
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPrecio.gridx =0;
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPrecio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPrecio, this.gridBagConstraintsTipoPrecio);
				
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrecio.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoPrecio, this.gridBagConstraintsTipoPrecio);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TipoPrecioJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoPrecio= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPrecio = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoPrecio.setLayout(gridaBagLayoutBusquedasParametrosTipoPrecio);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoPrecio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPrecio, this.gridBagConstraintsTipoPrecio);
			
			
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
			
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrecio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPrecio, this.gridBagConstraintsTipoPrecio);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoPrecio;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoPrecio() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoPrecio = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoPrecio.setName("jPanelReporteDinamicoTipoPrecio"); 
		
		this.jPanelReporteDinamicoTipoPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoPrecio.setLayout(gridaBagLayoutReporteDinamicoTipoPrecio);
		
		
		this.jInternalFrameReporteDinamicoTipoPrecio= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoPrecio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPrecio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoPrecio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoPrecio.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoPrecio.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoPrecio.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoPrecio.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Precioes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoPrecio = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoPrecio.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPrecio.add(this.jLabelColumnasSelectReporteTipoPrecio, this.gridBagConstraintsTipoPrecio);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoPrecio = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoPrecio.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoPrecio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPrecio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoPrecio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoPrecio=new JScrollPane(this.jListColumnasSelectReporteTipoPrecio);
			
			this.jScrollColumnasSelectReporteTipoPrecio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPrecio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoPrecio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoPrecio.add(this.jListColumnasSelectReporteTipoPrecio, this.gridBagConstraintsTipoPrecio);
		this.jPanelReporteDinamicoTipoPrecio.add(this.jScrollColumnasSelectReporteTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoPrecio = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoPrecio.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPrecio.add(this.jLabelRelacionesSelectReporteTipoPrecio, this.gridBagConstraintsTipoPrecio);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoPrecio = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoPrecio.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoPrecio.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPrecio.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoPrecio.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoPrecio=new JScrollPane(this.jListRelacionesSelectReporteTipoPrecio);
			
			this.jScrollRelacionesSelectReporteTipoPrecio.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPrecio.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoPrecio.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoPrecio.add(this.jListRelacionesSelectReporteTipoPrecio, this.gridBagConstraintsTipoPrecio);
		this.jPanelReporteDinamicoTipoPrecio.add(this.jScrollRelacionesSelectReporteTipoPrecio, this.gridBagConstraintsTipoPrecio);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTipoPrecio = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoPrecio = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoPrecio = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoPrecio = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoPrecio.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrecio = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrecio.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrecio.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrecio.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoPrecio.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoTipoPrecio = new JLabelMe();

		this.jLabelConGraficoDinamicoTipoPrecio.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPrecio.add(this.jLabelConGraficoDinamicoTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoTipoPrecio.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoTipoPrecio.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoTipoPrecio.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTipoPrecio.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoTipoPrecio.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPrecio.add(this.jCheckBoxConGraficoDinamicoTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoTipoPrecio = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoTipoPrecio.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoPrecio.add(this.jLabelColumnaCategoriaGraficoTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoTipoPrecio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTipoPrecio.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoTipoPrecio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoTipoPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTipoPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoTipoPrecio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoTipoPrecio.add(this.jComboBoxColumnaCategoriaGraficoTipoPrecio, this.gridBagConstraintsTipoPrecio);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorTipoPrecio = new JLabelMe();

		this.jLabelColumnaCategoriaValorTipoPrecio.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPrecio.add(this.jLabelColumnaCategoriaValorTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorTipoPrecio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorTipoPrecio.setText("Accion");
        this.jComboBoxColumnaCategoriaValorTipoPrecio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorTipoPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTipoPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorTipoPrecio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoTipoPrecio.add(this.jComboBoxColumnaCategoriaValorTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoTipoPrecio = new JLabelMe();

		this.jLabelColumnasValoresGraficoTipoPrecio.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPrecio.add(this.jLabelColumnasValoresGraficoTipoPrecio, this.gridBagConstraintsTipoPrecio);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoTipoPrecio = new JList<Reporte>();
		this.jListColumnasValoresGraficoTipoPrecio.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoTipoPrecio.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoTipoPrecio.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTipoPrecio.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoTipoPrecio.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoTipoPrecio=new JScrollPane(this.jListColumnasValoresGraficoTipoPrecio);
			
			this.jScrollColumnasValoresGraficoTipoPrecio.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTipoPrecio.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoTipoPrecio.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoTipoPrecio.add(this.jListColumnasSelectReporteTipoPrecio, this.gridBagConstraintsTipoPrecio);
		this.jPanelReporteDinamicoTipoPrecio.add(this.jScrollColumnasValoresGraficoTipoPrecio, this.gridBagConstraintsTipoPrecio);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoTipoPrecio = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoTipoPrecio.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPrecio.add(this.jLabelTiposGraficosReportesDinamicoTipoPrecio, this.gridBagConstraintsTipoPrecio);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoTipoPrecio = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoTipoPrecio.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoTipoPrecio.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoTipoPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTipoPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoTipoPrecio.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPrecio.add(this.jComboBoxTiposGraficosReportesDinamicoTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoPrecio = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoPrecio.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPrecio.add(this.jLabelGenerarExcelReporteDinamicoTipoPrecio, this.gridBagConstraintsTipoPrecio);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoPrecio = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoPrecio.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoPrecio,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoPrecio.setToolTipText("Generar EXCEL"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoPrecio.add(this.jButtonGenerarExcelReporteDinamicoTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrecio.add(this.jComboBoxTiposReportesDinamicoTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoPrecio = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoPrecio.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoPrecio.add(this.jLabelTiposArchivoReporteDinamicoTipoPrecio, this.gridBagConstraintsTipoPrecio);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrecio.add(this.jComboBoxTiposArchivosReportesDinamicoTipoPrecio, this.gridBagConstraintsTipoPrecio);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoPrecio = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoPrecio.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoPrecio,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoPrecio.setToolTipText("Generar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrecio.add(this.jButtonGenerarReporteDinamicoTipoPrecio, this.gridBagConstraintsTipoPrecio);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoPrecio = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoPrecio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoPrecio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoPrecio.setToolTipText("Cancelar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrecio.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoPrecio.add(this.jButtonCerrarReporteDinamicoTipoPrecio, this.gridBagConstraintsTipoPrecio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoPrecio = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoPrecio= new JScrollPane(jPanelReporteDinamicoTipoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoPrecio.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPrecio.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoPrecio.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Precioes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoPrecio.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoPrecio.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoPrecio);
		this.jInternalFrameReporteDinamicoTipoPrecio.getContentPane().add(this.jScrollPanelReporteDinamicoTipoPrecio, this.gridBagConstraintsTipoPrecio);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoPrecio() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoPrecio = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoPrecio.setName("jPanelImportacionTipoPrecio"); 
		
		this.jPanelImportacionTipoPrecio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPrecio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoPrecio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoPrecio.setLayout(gridaBagLayoutImportacionTipoPrecio);
		
		
		this.jInternalFrameImportacionTipoPrecio= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoPrecio= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoPrecio = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoPrecio= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPrecio.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoPrecio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPrecio.setResizable(true);
	    this.jInternalFrameImportacionTipoPrecio.setClosable(true);
	    this.jInternalFrameImportacionTipoPrecio.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoPrecio.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoPrecio.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoPrecio.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoPrecio.setResizable(true);
	    this.jInternalFrameImportacionTipoPrecio.setClosable(true);
	    this.jInternalFrameImportacionTipoPrecio.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoPrecio.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPrecio.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoPrecio.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Precioes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoPrecio = new JLabelMe();

		this.jLabelArchivoImportacionTipoPrecio.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPrecio.add(this.jLabelArchivoImportacionTipoPrecio, this.gridBagConstraintsTipoPrecio);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoPrecio = new JFileChooser();		
		this.jFileChooserImportacionTipoPrecio.setToolTipText("ESCOGER ARCHIVO"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoPrecio = new JButtonMe();
		this.jButtonAbrirImportacionTipoPrecio.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoPrecio,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoPrecio.setToolTipText("Generar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrecio.add(this.jButtonAbrirImportacionTipoPrecio, this.gridBagConstraintsTipoPrecio);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoPrecio = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoPrecio.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoPrecio.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoPrecio.add(this.jLabelPathArchivoImportacionTipoPrecio, this.gridBagConstraintsTipoPrecio);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoPrecio=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoPrecio.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPrecio.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoPrecio.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrecio.add(this.jTextFieldPathArchivoImportacionTipoPrecio, this.gridBagConstraintsTipoPrecio);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoPrecio = new JButtonMe();
		this.jButtonGenerarImportacionTipoPrecio.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoPrecio,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoPrecio.setToolTipText("Generar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrecio.add(this.jButtonGenerarImportacionTipoPrecio, this.gridBagConstraintsTipoPrecio);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoPrecio = new JButtonMe();
		this.jButtonCerrarImportacionTipoPrecio.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoPrecio,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoPrecio.setToolTipText("Cancelar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrecio.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoPrecio.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoPrecio.add(this.jButtonCerrarImportacionTipoPrecio, this.gridBagConstraintsTipoPrecio);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoPrecio = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoPrecio= new JScrollPane(jPanelImportacionTipoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsTipoPrecio.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoPrecio.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoPrecio.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoPrecio);
		this.jInternalFrameImportacionTipoPrecio.getContentPane().add(this.jScrollPanelImportacionTipoPrecio, this.gridBagConstraintsTipoPrecio);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoPrecio(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoPrecio = new JButtonMe();
			this.jButtonAbrirOrderByTipoPrecio.setText("Orden");
			this.jButtonAbrirOrderByTipoPrecio.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoPrecio,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoPrecio";
			inputMap = this.jButtonAbrirOrderByTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoPrecio"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoPrecio = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoPrecio.setName("jPanelOrderByTipoPrecio"); 
			
			this.jPanelOrderByTipoPrecio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPrecio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoPrecio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoPrecio.setLayout(gridaBagLayoutOrderByTipoPrecio);
			
			
			this.jTableDatosTipoPrecioOrderBy = new JTableMe();        
			this.jTableDatosTipoPrecioOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoPrecioOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoPrecioOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoPrecioOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoPrecioOrderBy.setViewportView(this.jTableDatosTipoPrecioOrderBy);
			this.jTableDatosTipoPrecioOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoPrecioOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoPrecio= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoPrecio= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoPrecio = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoPrecio= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoPrecio.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoPrecio.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoPrecio.setTitle("Orden");
			this.jInternalFrameOrderByTipoPrecio.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoPrecio.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoPrecio.setResizable(true);
			this.jInternalFrameOrderByTipoPrecio.setClosable(true);
			this.jInternalFrameOrderByTipoPrecio.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoPrecio.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPrecio.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoPrecio.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Precioes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoPrecio.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoPrecio.ipady =150;
				
			this.jPanelOrderByTipoPrecio.add(jScrollPanelDatosTipoPrecioOrderBy, this.gridBagConstraintsTipoPrecio);//this.jTableDatosTipoPrecioTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoPrecio = new JButtonMe();
			this.jButtonCerrarOrderByTipoPrecio.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoPrecio,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoPrecio.setToolTipText("Cancelar"+" "+TipoPrecioConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrecio.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoPrecio.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoPrecio.add(this.jButtonCerrarOrderByTipoPrecio, this.gridBagConstraintsTipoPrecio);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoPrecio = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoPrecio= new JScrollPane(jPanelOrderByTipoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsTipoPrecio.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoPrecio.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoPrecio.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoPrecio.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoPrecio.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoPrecio);
			
			this.jInternalFrameOrderByTipoPrecio.getContentPane().add(this.jScrollPanelOrderByTipoPrecio, this.gridBagConstraintsTipoPrecio);			
		
		} else {
			this.jButtonAbrirOrderByTipoPrecio = new JButtonMe();
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
		int iWidthTableCalculado=0;//3330
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=900;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=1500;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tipoprecioSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoPrecio.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoPrecio.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoPrecio.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoPrecio.getRowHeight();//TipoPrecioConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipoprecioSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPrecio.isSelected()) {
					iHeightTable=TipoPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoPrecio.isSelected()) {
					iHeightTable=TipoPrecioConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoPrecioConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoPrecio.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPrecio.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoPrecio.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoPrecio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPrecio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoPrecio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoPrecio!=null && this.jInternalFrameOrderByTipoPrecio.getjTableDatosOrderBy()!=null) {
			//if(!this.tipoprecioSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoPrecio.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoPrecio.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoPrecio.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoPrecio.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoPrecio.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoPrecio.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoPrecio.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoPrecio.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPrecio.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoPrecio.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipoprecioLogic.getTipoPrecios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprecios.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoPrecio> TraerTipoPrecioBeans(List<TipoPrecio> tipoprecios,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoPrecio tipoprecio:tipoprecios) {
					
				if(!(TipoPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipoprecio.setsDetalleGeneralEntityReporte(TipoPrecioConstantesFunciones.getTipoPrecioDescripcion(tipoprecio));
										
					tipoprecio.setesta_activo_descripcion(TipoPrecioConstantesFunciones.getesta_activoDescripcion(tipoprecio));	
					
					

					if(tipoprecio.getPrecios()!=null && Funciones.existeClass(classes,Precio.class)) {
						try{tipoprecio.setpreciosDescripcionReporte(new JRBeanCollectionDataSource(PrecioJInternalFrame.TraerPrecioBeans(tipoprecio.getPrecios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprecio.getPoliticasClientes()!=null && Funciones.existeClass(classes,PoliticasCliente.class)) {
						try{tipoprecio.setpoliticasclientesDescripcionReporte(new JRBeanCollectionDataSource(PoliticasClienteJInternalFrame.TraerPoliticasClienteBeans(tipoprecio.getPoliticasClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprecio.getNotaCreditoSolis()!=null && Funciones.existeClass(classes,NotaCreditoSoli.class)) {
						try{tipoprecio.setnotacreditosolisDescripcionReporte(new JRBeanCollectionDataSource(NotaCreditoSoliJInternalFrame.TraerNotaCreditoSoliBeans(tipoprecio.getNotaCreditoSolis(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprecio.getGuiaRemisions()!=null && Funciones.existeClass(classes,GuiaRemision.class)) {
						try{tipoprecio.setguiaremisionsDescripcionReporte(new JRBeanCollectionDataSource(GuiaRemisionJInternalFrame.TraerGuiaRemisionBeans(tipoprecio.getGuiaRemisions(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprecio.getPedidoExpors()!=null && Funciones.existeClass(classes,PedidoExpor.class)) {
						try{tipoprecio.setpedidoexporsDescripcionReporte(new JRBeanCollectionDataSource(PedidoExporJInternalFrame.TraerPedidoExporBeans(tipoprecio.getPedidoExpors(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprecio.getFacturaPuntoVentas()!=null && Funciones.existeClass(classes,FacturaPuntoVenta.class)) {
						try{tipoprecio.setfacturapuntoventasDescripcionReporte(new JRBeanCollectionDataSource(FacturaPuntoVentaJInternalFrame.TraerFacturaPuntoVentaBeans(tipoprecio.getFacturaPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprecio.getPedidoPuntoVentas()!=null && Funciones.existeClass(classes,PedidoPuntoVenta.class)) {
						try{tipoprecio.setpedidopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(PedidoPuntoVentaJInternalFrame.TraerPedidoPuntoVentaBeans(tipoprecio.getPedidoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprecio.getUtilidadTipoPrecios()!=null && Funciones.existeClass(classes,UtilidadTipoPrecio.class)) {
						try{tipoprecio.setutilidadtipopreciosDescripcionReporte(new JRBeanCollectionDataSource(UtilidadTipoPrecioJInternalFrame.TraerUtilidadTipoPrecioBeans(tipoprecio.getUtilidadTipoPrecios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprecio.getClientes()!=null && Funciones.existeClass(classes,Cliente.class)) {
						try{tipoprecio.setclientesDescripcionReporte(new JRBeanCollectionDataSource(ClienteJInternalFrame.TraerClienteBeans(tipoprecio.getClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprecio.getServicioClientes()!=null && Funciones.existeClass(classes,ServicioCliente.class)) {
						try{tipoprecio.setservicioclientesDescripcionReporte(new JRBeanCollectionDataSource(ServicioClienteJInternalFrame.TraerServicioClienteBeans(tipoprecio.getServicioClientes(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprecio.getProformas()!=null && Funciones.existeClass(classes,Proforma.class)) {
						try{tipoprecio.setproformasDescripcionReporte(new JRBeanCollectionDataSource(ProformaJInternalFrame.TraerProformaBeans(tipoprecio.getProformas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprecio.getDescuentoTipoPrecios()!=null && Funciones.existeClass(classes,DescuentoTipoPrecio.class)) {
						try{tipoprecio.setdescuentotipopreciosDescripcionReporte(new JRBeanCollectionDataSource(DescuentoTipoPrecioJInternalFrame.TraerDescuentoTipoPrecioBeans(tipoprecio.getDescuentoTipoPrecios(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprecio.getNotaCreditoPuntoVentas()!=null && Funciones.existeClass(classes,NotaCreditoPuntoVenta.class)) {
						try{tipoprecio.setnotacreditopuntoventasDescripcionReporte(new JRBeanCollectionDataSource(NotaCreditoPuntoVentaJInternalFrame.TraerNotaCreditoPuntoVentaBeans(tipoprecio.getNotaCreditoPuntoVentas(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprecio.getParametroCarteraDefectos()!=null && Funciones.existeClass(classes,ParametroCarteraDefecto.class)) {
						try{tipoprecio.setparametrocarteradefectosDescripcionReporte(new JRBeanCollectionDataSource(ParametroCarteraDefectoJInternalFrame.TraerParametroCarteraDefectoBeans(tipoprecio.getParametroCarteraDefectos(),classes)));}catch(Exception e){e.printStackTrace();}
					}

					if(tipoprecio.getConsignacions()!=null && Funciones.existeClass(classes,Consignacion.class)) {
						try{tipoprecio.setconsignacionsDescripcionReporte(new JRBeanCollectionDataSource(ConsignacionJInternalFrame.TraerConsignacionBeans(tipoprecio.getConsignacions(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//tipoprecio.setsDetalleGeneralEntityReporte(tipoprecio.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipopreciobeans.add(tipopreciobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipoprecios;
    }
	//PARA REPORTES FIN
}
