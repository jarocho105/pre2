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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoGarantiaConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoGarantiaJInternalFrame extends TipoGarantiaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoGarantia;
	
	protected JMenuBar jmenuBarTipoGarantia;
	
	protected JMenu jmenuTipoGarantia;
	protected JMenu jmenuDatosTipoGarantia;
	protected JMenu jmenuArchivoTipoGarantia;
	protected JMenu jmenuAccionesTipoGarantia;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoGarantia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGarantia;	
	protected GridBagConstraints gridBagConstraintsTipoGarantia;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoGarantiaDetalleFormJInternalFrame jInternalFrameDetalleFormTipoGarantia;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoGarantia;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoGarantia;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoGarantiaSessionBean tipogarantiaSessionBean;
		
	
	
	public PaisSessionBean paisSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoGarantia> tipogarantias;		
	public List<TipoGarantia> tipogarantiasEliminados;	
	public List<TipoGarantia> tipogarantiasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoGarantia;		
	protected JButton jButtonAbrirOrderByTipoGarantia;
	
	
	//protected JPanel jPanelOrderByTipoGarantia;
	//public JScrollPane jScrollPanelOrderByTipoGarantia;	
	//protected JButton jButtonCerrarOrderByTipoGarantia;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoGarantiaLogic tipogarantiaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoGarantia;
	public JScrollPane jScrollPanelDatosEdicionTipoGarantia;
	public JScrollPane jScrollPanelDatosGeneralTipoGarantia;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoGarantiaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoGarantia;
	//public JScrollPane jScrollPanelImportacionTipoGarantia;
	
	
	
	protected JPanel jPanelAccionesTipoGarantia;
	
    protected JPanel jPanelPaginacionTipoGarantia;
    protected JPanel jPanelParametrosReportesTipoGarantia;
	protected JPanel jPanelParametrosReportesAccionesTipoGarantia;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoGarantia;
	protected JPanel jPanelParametrosAuxiliar2TipoGarantia;
	protected JPanel jPanelParametrosAuxiliar3TipoGarantia;
	protected JPanel jPanelParametrosAuxiliar4TipoGarantia;
	//protected JPanel jPanelParametrosAuxiliar5TipoGarantia;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoGarantia;
	//protected JPanel jPanelImportacionTipoGarantia;
	
	
	public JTable jTableDatosTipoGarantia;
	
	
	
	//public JTable jTableDatosTipoGarantiaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoGarantia;
	protected JButton jButtonDuplicarTipoGarantia;
	protected JButton jButtonCopiarTipoGarantia;
	protected JButton jButtonVerFormTipoGarantia;
	protected JButton jButtonNuevoRelacionesTipoGarantia;
	protected JButton jButtonModificarTipoGarantia;
	
    protected JButton jButtonGuardarCambiosTablaTipoGarantia;
	protected JButton jButtonCerrarTipoGarantia;
	
	
	protected JButton jButtonRecargarInformacionTipoGarantia;
	protected JButton jButtonProcesarInformacionTipoGarantia;
	
	
	protected JButton jButtonAnterioresTipoGarantia;
	protected JButton jButtonSiguientesTipoGarantia;
	protected JButton jButtonNuevoGuardarCambiosTipoGarantia;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoGarantia;
	//protected JButton jButtonCerrarReporteDinamicoTipoGarantia;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoGarantia;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoGarantia;
	//protected JButton jButtonGenerarImportacionTipoGarantia;
	//protected JButton jButtonCerrarImportacionTipoGarantia;
	//protected JFileChooser jFileChooserImportacionTipoGarantia;
	//protected File fileImportacionTipoGarantia;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGarantia;
	protected JButton jButtonDuplicarToolBarTipoGarantia;
	protected JButton jButtonNuevoRelacionesToolBarTipoGarantia;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoGarantia;
	protected JButton jButtonCopiarToolBarTipoGarantia;
	protected JButton jButtonVerFormToolBarTipoGarantia;
	public JButton jButtonGuardarCambiosTablaToolBarTipoGarantia;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGarantia;
	protected JButton jButtonCerrarToolBarTipoGarantia;
	
	protected JButton jButtonRecargarInformacionToolBarTipoGarantia;
	protected JButton jButtonProcesarInformacionToolBarTipoGarantia;
	protected JButton jButtonAnterioresToolBarTipoGarantia;
	protected JButton jButtonSiguientesToolBarTipoGarantia;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoGarantia;
	protected JButton jButtonAbrirOrderByToolBarTipoGarantia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGarantia;
	protected JMenuItem jMenuItemDuplicarTipoGarantia;
	protected JMenuItem jMenuItemNuevoRelacionesTipoGarantia;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoGarantia;
	protected JMenuItem jMenuItemCopiarTipoGarantia;
	protected JMenuItem jMenuItemVerFormTipoGarantia;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGarantia;
	protected JMenuItem jMenuItemCerrarTipoGarantia;
	protected JMenuItem jMenuItemDetalleCerrarTipoGarantia;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoGarantia;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGarantia;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoGarantia;
	protected JMenuItem jMenuItemProcesarInformacionTipoGarantia;
	protected JMenuItem jMenuItemAnterioresTipoGarantia;
	protected JMenuItem jMenuItemSiguientesTipoGarantia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGarantia;
	protected JMenuItem jMenuItemAbrirOrderByTipoGarantia;
	protected JMenuItem jMenuItemMostrarOcultarTipoGarantia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGarantia;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoGarantia;
	protected JCheckBox jCheckBoxSeleccionadosTipoGarantia;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoGarantia;
	protected JCheckBox jCheckBoxConGraficoReporteTipoGarantia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoGarantia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoGarantia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGarantia;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoGarantia;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoGarantia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoGarantia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGarantia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGarantia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoGarantia;
	protected JTextField jTextFieldValorCampoGeneralTipoGarantia;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoGarantia;
	//public JList<Reporte> jListColumnasSelectReporteTipoGarantia;
	//public JScrollPane jScrollColumnasSelectReporteTipoGarantia;
	
	//public JLabel jLabelRelacionesSelectReporteTipoGarantia;
	//public JList<Reporte> jListRelacionesSelectReporteTipoGarantia;
	//public JScrollPane jScrollRelacionesSelectReporteTipoGarantia;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoGarantia;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoGarantia;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoGarantia;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoGarantia;
	
		
	//public JLabel jLabelArchivoImportacionTipoGarantia;	
	//public JLabel jLabelPathArchivoImportacionTipoGarantia;
	//protected JTextField jTextFieldPathArchivoImportacionTipoGarantia;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoGarantia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoGarantia;
	
	//public JLabel jLabelColumnaCategoriaValorTipoGarantia;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoGarantia;
	
	//public JLabel jLabelColumnasValoresGraficoTipoGarantia;
	//public JList<Reporte> jListColumnasValoresGraficoTipoGarantia;
	//public JScrollPane jScrollColumnasValoresGraficoTipoGarantia;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoGarantia;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoGarantia;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoGarantia;
	public JPanel jPanelBusquedaPorCodigoTipoGarantia;
	public JButton jButtonBusquedaPorCodigoTipoGarantia;
	public JPanel jPanelBusquedaPorNombreTipoGarantia;
	public JButton jButtonBusquedaPorNombreTipoGarantia;
	public JPanel jPanelFK_IdPaisTipoGarantia;
	public JButton jButtonFK_IdPaisTipoGarantia;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoGarantia;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoGarantia;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoGarantia;
	public JButton jButtoncodigoBusquedaPorCodigoTipoGarantiaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoGarantia;
	public JLabel jLabelnombreBusquedaPorNombreTipoGarantia;
	public JTextArea jTextAreanombreBusquedaPorNombreTipoGarantia;
	public JButton jButtonnombreBusquedaPorNombreTipoGarantiaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisFK_IdPaisTipoGarantia;
	public JLabel jLabelid_paisFK_IdPaisTipoGarantia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisFK_IdPaisTipoGarantia;
	public JButton jButtonid_paisFK_IdPaisTipoGarantia= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoGarantiaUpdate= new JButtonMe();
	public JButton jButtonid_paisFK_IdPaisTipoGarantiaBusqueda= new JButtonMe();

	
	
	
	
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
	public TipoGarantiaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoGarantia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGarantiaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGarantia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGarantiaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGarantia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGarantiaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGarantia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoGarantia)	{
		this.jButtonRecargarInformacionTipoGarantia = jButtonRecargarInformacionTipoGarantia;
	}
	
	public JButton getjButtonProcesarInformacionTipoGarantia() {
		return this.jButtonProcesarInformacionTipoGarantia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGarantia)	{
		this.jButtonProcesarInformacionTipoGarantia = jButtonProcesarInformacionTipoGarantia;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoGarantia() {
		return this.jButtonRecargarInformacionTipoGarantia;
	}
	
	
	public List<TipoGarantia> gettipogarantias() {
		return this.tipogarantias;
	}

	public void settipogarantias(List<TipoGarantia> tipogarantias) {
		this.tipogarantias = tipogarantias;
	}
	
	public List<TipoGarantia> gettipogarantiasAux() {
		return this.tipogarantiasAux;
	}

	public void settipogarantiasAux(List<TipoGarantia> tipogarantiasAux) {
		this.tipogarantiasAux = tipogarantiasAux;
	}
	
	public List<TipoGarantia> gettipogarantiasEliminados() {
		return this.tipogarantiasEliminados;
	}

	public void setTipoGarantiasEliminados(List<TipoGarantia> tipogarantiasEliminados) {
		this.tipogarantiasEliminados = tipogarantiasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoGarantia() {
		return jComboBoxTiposSeleccionarTipoGarantia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoGarantia(
			JComboBox jComboBoxTiposSeleccionarTipoGarantia) {
		this.jComboBoxTiposSeleccionarTipoGarantia = jComboBoxTiposSeleccionarTipoGarantia;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoGarantia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoGarantia.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoGarantia .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoGarantia() {
		return jTextFieldValorCampoGeneralTipoGarantia;
	}

	public void setjTextFieldValorCampoGeneralTipoGarantia(
			JTextField jTextFieldValorCampoGeneralTipoGarantia) {
		this.jTextFieldValorCampoGeneralTipoGarantia = jTextFieldValorCampoGeneralTipoGarantia;
	}

	public void setBorderResaltarValorCampoGeneralTipoGarantia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantia.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoGarantia .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoGarantia() {
		return this.jCheckBoxSeleccionarTodosTipoGarantia;
	}

	public void setjCheckBoxSeleccionarTodosTipoGarantia(
			JCheckBox jCheckBoxSeleccionarTodosTipoGarantia) {
		this.jCheckBoxSeleccionarTodosTipoGarantia = jCheckBoxSeleccionarTodosTipoGarantia;
	}

	public void setBorderResaltarSeleccionarTodosTipoGarantia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoGarantia .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoGarantia() {
		return this.jCheckBoxSeleccionadosTipoGarantia;
	}

	public void setjCheckBoxSeleccionadosTipoGarantia(
			JCheckBox jCheckBoxSeleccionadosTipoGarantia) {
		this.jCheckBoxSeleccionadosTipoGarantia = jCheckBoxSeleccionadosTipoGarantia;
	}
	
	public void setBorderResaltarSeleccionadosTipoGarantia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantia.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoGarantia .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoGarantia() {
		return this.jComboBoxTiposArchivosReportesTipoGarantia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoGarantia(
			JComboBox jComboBoxTiposArchivosReportesTipoGarantia) {
		this.jComboBoxTiposArchivosReportesTipoGarantia = jComboBoxTiposArchivosReportesTipoGarantia;
	}

	public void setBorderResaltarTiposArchivosReportesTipoGarantia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantia.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoGarantia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoGarantia() {
		return this.jComboBoxTiposReportesTipoGarantia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoGarantia(
			JComboBox jComboBoxTiposReportesTipoGarantia) {
		this.jComboBoxTiposReportesTipoGarantia = jComboBoxTiposReportesTipoGarantia;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoGarantia() {
	//	return jComboBoxTiposReportesDinamicoTipoGarantia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoGarantia(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoGarantia) {
	//	this.jComboBoxTiposReportesDinamicoTipoGarantia = jComboBoxTiposReportesDinamicoTipoGarantia;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoGarantia() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoGarantia;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoGarantia(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoGarantia) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoGarantia = jComboBoxTiposArchivosReportesDinamicoTipoGarantia;
	//}
	
	public void setBorderResaltarTiposReportesTipoGarantia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantia.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoGarantia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoGarantia() {
		return this.jComboBoxTiposGraficosReportesTipoGarantia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoGarantia(
			JComboBox jComboBoxTiposGraficosReportesTipoGarantia) {
		this.jComboBoxTiposGraficosReportesTipoGarantia = jComboBoxTiposGraficosReportesTipoGarantia;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoGarantia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantia.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoGarantia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoGarantia() {
		return this.jComboBoxTiposPaginacionTipoGarantia;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoGarantia(
			JComboBox jComboBoxTiposPaginacionTipoGarantia) {
		this.jComboBoxTiposPaginacionTipoGarantia = jComboBoxTiposPaginacionTipoGarantia;
	}
	
	public void setBorderResaltarTiposPaginacionTipoGarantia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantia.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoGarantia .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoGarantia() {
		return this.jComboBoxTiposRelacionesTipoGarantia;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGarantia() {
		return this.jComboBoxTiposAccionesTipoGarantia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGarantia(
			JComboBox jComboBoxTiposRelacionesTipoGarantia) {
		this.jComboBoxTiposRelacionesTipoGarantia = jComboBoxTiposRelacionesTipoGarantia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGarantia(
			JComboBox jComboBoxTiposAccionesTipoGarantia) {
		this.jComboBoxTiposAccionesTipoGarantia = jComboBoxTiposAccionesTipoGarantia;
	}
	
	public void setBorderResaltarTiposRelacionesTipoGarantia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantia.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoGarantia .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoGarantia() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoGarantia.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoGarantia .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoGarantia() {
	//	return jCheckBoxConGraficoDinamicoTipoGarantia;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoGarantia(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoGarantia) {
	//	this.jCheckBoxConGraficoDinamicoTipoGarantia = jCheckBoxConGraficoDinamicoTipoGarantia;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoGarantia() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoGarantia.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoGarantia .setBorder(borderResaltar);		
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
		this.tipogarantiaSessionBean=new TipoGarantiaSessionBean();
		
		this.tipogarantiaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogarantiaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogarantiaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoGarantiaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoGarantiaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGarantiaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGarantiaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGarantiaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Garantia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoGarantiaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoGarantia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoGarantia= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoGarantia,this.jTtoolBarTipoGarantia,
							"nuevo","nuevo","Nuevo"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoGarantia,this.jTtoolBarTipoGarantia,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoGarantia,this.jTtoolBarTipoGarantia,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoGarantia,this.jTtoolBarTipoGarantia,
							"duplicar","duplicar","Duplicar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoGarantia,this.jTtoolBarTipoGarantia,
							"copiar","copiar","Copiar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoGarantia,this.jTtoolBarTipoGarantia,
							"ver_form","ver_form","Ver"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGarantia,this.jTtoolBarTipoGarantia,
							"recargar","recargar","Recargar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGarantia,this.jTtoolBarTipoGarantia,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoGarantia,this.jTtoolBarTipoGarantia,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoGarantia,this.jTtoolBarTipoGarantia,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoGarantia,this.jTtoolBarTipoGarantia,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoGarantia,this.jTtoolBarTipoGarantia,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoGarantia,this.jTtoolBarTipoGarantia,
							"cerrar","cerrar","Salir"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoGarantia=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoGarantia;
			
				this.jButtonProcesarInformacionToolBarTipoGarantia=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoGarantia;
				
		//protected JButton jButtonModificarToolBarTipoGarantia;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoGarantia=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoGarantia=new JMenuMe("General");
		this.jmenuArchivoTipoGarantia=new JMenuMe("Archivo");
		this.jmenuAccionesTipoGarantia=new JMenuMe("Acciones");
		this.jmenuDatosTipoGarantia=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGarantia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGarantia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGarantia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoGarantia= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoGarantia.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoGarantia,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoGarantia= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoGarantia.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoGarantia,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoGarantia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGarantia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGarantia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoGarantia= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoGarantia.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoGarantia,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoGarantia= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoGarantia.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoGarantia,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoGarantia= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoGarantia.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoGarantia,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGarantia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGarantia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGarantia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoGarantia= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoGarantia.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoGarantia,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoGarantia= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoGarantia.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoGarantia,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoGarantia= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoGarantia.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoGarantia,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoGarantia= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoGarantia.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoGarantia,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoGarantia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoGarantia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoGarantia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGarantia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGarantia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGarantia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoGarantia= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoGarantia.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoGarantia,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGarantia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGarantia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGarantia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoGarantia= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoGarantia.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoGarantia,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoGarantia.add(this.jMenuItemCerrarTipoGarantia);
			
			this.jmenuAccionesTipoGarantia.add(this.jMenuItemNuevoTipoGarantia);
			this.jmenuAccionesTipoGarantia.add(this.jMenuItemNuevoGuardarCambiosTipoGarantia);
			this.jmenuAccionesTipoGarantia.add(this.jMenuItemNuevoRelacionesTipoGarantia);
			this.jmenuAccionesTipoGarantia.add(this.jMenuItemGuardarCambiosTablaTipoGarantia);		
			this.jmenuAccionesTipoGarantia.add(this.jMenuItemDuplicarTipoGarantia);		
			this.jmenuAccionesTipoGarantia.add(this.jMenuItemCopiarTipoGarantia);		
			this.jmenuAccionesTipoGarantia.add(this.jMenuItemVerFormTipoGarantia);		
			
			this.jmenuDatosTipoGarantia.add(this.jMenuItemRecargarInformacionTipoGarantia);				
			this.jmenuDatosTipoGarantia.add(this.jMenuItemAnterioresTipoGarantia);				
			this.jmenuDatosTipoGarantia.add(this.jMenuItemSiguientesTipoGarantia);				
			this.jmenuDatosTipoGarantia.add(this.jMenuItemAbrirOrderByTipoGarantia);				
			this.jmenuDatosTipoGarantia.add(this.jMenuItemMostrarOcultarTipoGarantia);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoGarantia.add(this.jMenuItemGuardarCambiosTipoGarantia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoGarantia.add(this.jmenuArchivoTipoGarantia);		
			this.jmenuBarTipoGarantia.add(this.jmenuAccionesTipoGarantia);		
			this.jmenuBarTipoGarantia.add(this.jmenuDatosTipoGarantia);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoGarantia);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoGarantia() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoGarantia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoGarantia.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoGarantia= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoGarantia.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoGarantia.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoGarantia,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoGarantia = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoGarantia.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoGarantia.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoGarantia,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoGarantia= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoGarantia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoGarantia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoGarantia.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoGarantia= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoGarantia.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoGarantia.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoGarantia,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoGarantia = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoGarantia.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoGarantia.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoGarantia,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTipoGarantia= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTipoGarantia,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdPaisTipoGarantia=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdPaisTipoGarantia.setToolTipText("Buscar Por Pais ");
		this.jButtonFK_IdPaisTipoGarantia= new JButtonMe();
		this.jButtonFK_IdPaisTipoGarantia.setText("Buscar");
		this.jButtonFK_IdPaisTipoGarantia.setToolTipText("Buscar Por Pais ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdPaisTipoGarantia,"buscar_button","Buscar Por Pais ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdPaisTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_paisFK_IdPaisTipoGarantia = new JLabelMe();
		jLabelid_paisFK_IdPaisTipoGarantia.setText("Pais :");
		jLabelid_paisFK_IdPaisTipoGarantia.setToolTipText("Pais");
		jLabelid_paisFK_IdPaisTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_paisFK_IdPaisTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_paisFK_IdPaisTipoGarantia,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_paisFK_IdPaisTipoGarantia= new JComboBoxMe();
		jComboBoxid_paisFK_IdPaisTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisFK_IdPaisTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisFK_IdPaisTipoGarantia,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoGarantia=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoGarantia.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoGarantia.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoGarantia.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoGarantia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoGarantia,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoGarantia = new TipoGarantiaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Garantia DATOS");
			this.jInternalFrameDetalleFormTipoGarantia = new TipoGarantiaDetalleFormJInternalFrame(jDesktopPane,this.tipogarantiaSessionBean.getConGuardarRelaciones(),this.tipogarantiaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoGarantia = null;//new TipoGarantiaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGarantia= new GridBagLayout();
		
		
		this.jTableDatosTipoGarantia = new JTableMe();      
		
		String sToolTipTipoGarantia="";
		sToolTipTipoGarantia=TipoGarantiaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGarantia+="(Cartera.TipoGarantia)";
		}
		
		if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGarantia+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoGarantia.setToolTipText(sToolTipTipoGarantia);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoGarantia);
		this.jTableDatosTipoGarantia.setAutoCreateRowSorter(true);
		this.jTableDatosTipoGarantia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoGarantia.setRowSelectionAllowed(true);
		this.jTableDatosTipoGarantia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoGarantia,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoGarantia = new JButtonMe();
		this.jButtonDuplicarTipoGarantia = new JButtonMe();
		this.jButtonCopiarTipoGarantia = new JButtonMe();
		this.jButtonVerFormTipoGarantia = new JButtonMe();
		this.jButtonNuevoRelacionesTipoGarantia = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoGarantia = new JButtonMe();
		this.jButtonCerrarTipoGarantia = new JButtonMe();
		
		this.jScrollPanelDatosTipoGarantia = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoGarantia = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoGarantia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Garantia";
		
		if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Garantias" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGarantia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGarantia.setToolTipText("Acciones");
        this.jPanelAccionesTipoGarantia.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoGarantia=new ReporteDinamicoJInternalFrame(TipoGarantiaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoGarantia();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoGarantia=new ImportacionJInternalFrame(TipoGarantiaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoGarantia();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoGarantia = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoGarantia.setText("Orden");
		this.jButtonAbrirOrderByTipoGarantia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGarantia,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoGarantia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGarantia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGarantia,false,this);
			
			//this.cargarOrderByTipoGarantia(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoGarantia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGarantia,true,this);
			
			//this.cargarOrderByTipoGarantia(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoGarantia.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosTipoGarantia.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosTipoGarantia.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosTipoGarantia.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGarantia.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoGarantia.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoGarantia.setText("Nuevo");
		this.jButtonDuplicarTipoGarantia.setText("Duplicar");
		this.jButtonCopiarTipoGarantia.setText("Copiar");
		this.jButtonVerFormTipoGarantia.setText("Ver");
		this.jButtonNuevoRelacionesTipoGarantia.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoGarantia.setText("Guardar");
		this.jButtonCerrarTipoGarantia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGarantia,"nuevo_button","Nuevo",this.tipogarantiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoGarantia,"duplicar_button","Duplicar",this.tipogarantiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoGarantia,"copiar_button","Copiar",this.tipogarantiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoGarantia,"ver_form","Ver",this.tipogarantiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoGarantia,"nuevorelaciones_button","Nuevo Rel",this.tipogarantiaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGarantia,"guardarcambiostabla_button","Guardar",this.tipogarantiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGarantia,"cerrar_button","Salir",this.tipogarantiaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoGarantia.setToolTipText("Nuevo"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoGarantia.setToolTipText("Duplicar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoGarantia.setToolTipText("Copiar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoGarantia.setToolTipText("Ver"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoGarantia.setToolTipText("Nuevo Rel"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoGarantia.setToolTipText("Guardar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGarantia.setToolTipText("Salir"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGarantia";
		inputMap = this.jButtonNuevoTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGarantia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGarantia"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoGarantia";
		inputMap = this.jButtonDuplicarTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoGarantia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoGarantia"));
		
		//COPIAR
		sMapKey = "CopiarTipoGarantia";
		inputMap = this.jButtonCopiarTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoGarantia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoGarantia"));
		
		//VEr FORM
		sMapKey = "VerFormTipoGarantia";
		inputMap = this.jButtonVerFormTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoGarantia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoGarantia"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoGarantia";
		inputMap = this.jButtonNuevoRelacionesTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoGarantia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoGarantia"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoGarantia";
		inputMap = this.jButtonModificarTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoGarantia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoGarantia"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoGarantia";
		inputMap = this.jButtonCerrarTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGarantia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGarantia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGarantia";
		inputMap = this.jButtonGuardarCambiosTablaTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGarantia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGarantia"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoGarantia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoGarantia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoGarantia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoGarantia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoGarantia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoGarantia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoGarantia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoGarantia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoGarantia.setName("jPanelParametrosReportesTipoGarantia"); 
		
		this.jPanelParametrosReportesAccionesTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoGarantia.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoGarantia.setName("jPanelParametrosReportesAccionesTipoGarantia"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoGarantia = new JButtonMe();
		this.jButtonRecargarInformacionTipoGarantia.setText("Recargar");
		this.jButtonRecargarInformacionTipoGarantia.setToolTipText("Recargar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoGarantia,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoGarantia = new JButtonMe();
		this.jButtonProcesarInformacionTipoGarantia.setText("Procesar");
		this.jButtonProcesarInformacionTipoGarantia.setToolTipText("Procesar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoGarantia.setVisible(false);
			
		this.jButtonProcesarInformacionTipoGarantia.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGarantia.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoGarantia.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoGarantia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGarantia.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoGarantia.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoGarantia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGarantia.setText("TIPO");       
		this.jComboBoxTiposReportesTipoGarantia.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoGarantia = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoGarantia.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoGarantia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoGarantia = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoGarantia.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoGarantia.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoGarantia = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoGarantia.setText("Accion");
		this.jComboBoxTiposRelacionesTipoGarantia.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoGarantia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGarantia.setText("Accion");
		this.jComboBoxTiposAccionesTipoGarantia.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoGarantia = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoGarantia.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoGarantia.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoGarantia=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoGarantia.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGarantia.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoGarantia.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoGarantia = new JLabelMe();
		
		this.jLabelAccionesTipoGarantia.setText("Acciones");		
		this.jLabelAccionesTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoGarantia = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoGarantia.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoGarantia.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoGarantia = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoGarantia.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoGarantia.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoGarantia = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoGarantia.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoGarantia.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoGarantia = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoGarantia.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoGarantia.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoGarantia = new JButtonMe();
		//this.jButtonAnterioresTipoGarantia.setText("<<");
        this.jButtonAnterioresTipoGarantia.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoGarantia,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoGarantia = new JButtonMe();
		//this.jButtonSiguientesTipoGarantia.setText(">>");
        this.jButtonSiguientesTipoGarantia.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoGarantia,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoGarantia = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoGarantia.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoGarantia.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoGarantia,"nuevoguardarcambios_button","Nue",this.tipogarantiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoGarantia";
		inputMap = this.jButtonNuevoGuardarCambiosTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoGarantia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoGarantia"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoGarantia";
		inputMap = this.jButtonRecargarInformacionTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoGarantia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoGarantia"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoGarantia";
		inputMap = this.jButtonSiguientesTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoGarantia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoGarantia"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoGarantia";
		inputMap = this.jButtonAnterioresTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoGarantia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoGarantia"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoGarantia();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoGarantia.setMinimumSize(new Dimension(this.getWidth(),TipoGarantiaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGarantiaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGarantia.setMaximumSize(new Dimension(this.getWidth(),TipoGarantiaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGarantiaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoGarantia.setPreferredSize(new Dimension(this.getWidth(),TipoGarantiaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoGarantiaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoGarantia = new GridBagLayout();

			this.jPanelPaginacionTipoGarantia.setLayout(gridaBagLayoutPaginacionTipoGarantia);						
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.gridy = 0;
			this.gridBagConstraintsTipoGarantia.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoGarantia.add(this.jButtonAnterioresTipoGarantia, this.gridBagConstraintsTipoGarantia);
					
						
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGarantia.gridy = 0;
			
			this.jPanelPaginacionTipoGarantia.add(this.jButtonNuevoGuardarCambiosTipoGarantia, this.gridBagConstraintsTipoGarantia);
						
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoGarantia.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoGarantia.gridy = 0;
			this.jPanelPaginacionTipoGarantia.add(this.jButtonSiguientesTipoGarantia, this.gridBagConstraintsTipoGarantia);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.gridy = 1;
			this.gridBagConstraintsTipoGarantia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGarantia.add(this.jButtonNuevoTipoGarantia, this.gridBagConstraintsTipoGarantia);
						
			
			
			if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
				this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoGarantia.gridy = 1;
				this.gridBagConstraintsTipoGarantia.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoGarantia.add(this.jButtonGuardarCambiosTablaTipoGarantia, this.gridBagConstraintsTipoGarantia);
			}
			
			
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.gridy = 1;
			this.gridBagConstraintsTipoGarantia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGarantia.add(this.jButtonDuplicarTipoGarantia, this.gridBagConstraintsTipoGarantia);
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.gridy = 1;
			this.gridBagConstraintsTipoGarantia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGarantia.add(this.jButtonCopiarTipoGarantia, this.gridBagConstraintsTipoGarantia);
		
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.gridy = 1;
			this.gridBagConstraintsTipoGarantia.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoGarantia.add(this.jButtonVerFormTipoGarantia, this.gridBagConstraintsTipoGarantia);
		
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.gridy = 1;
			this.gridBagConstraintsTipoGarantia.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoGarantia.add(this.jButtonCerrarTipoGarantia, this.gridBagConstraintsTipoGarantia);
		
		
		
		this.jButtonRecargarInformacionTipoGarantia.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGarantia.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoGarantia.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoGarantia.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGarantia.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoGarantia.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoGarantia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGarantia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoGarantia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoGarantia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGarantia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoGarantia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoGarantia.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGarantia.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoGarantia.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoGarantia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGarantia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoGarantia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoGarantia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGarantia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGarantia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoGarantia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGarantia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoGarantia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoGarantia.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGarantia.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoGarantia.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoGarantia.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGarantia.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoGarantia.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoGarantia.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGarantia.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoGarantia.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoGarantia.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGarantia.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoGarantia.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoGarantia = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoGarantia = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoGarantia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoGarantia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoGarantia = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoGarantia = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoGarantia.setLayout(gridaBagParametrosReportesTipoGarantia);
			this.jPanelParametrosReportesAccionesTipoGarantia.setLayout(gridaBagParametrosReportesAccionesTipoGarantia);
			
			
			this.jPanelParametrosAuxiliar1TipoGarantia.setLayout(gridaBagParametrosAuxiliar1TipoGarantia);
			this.jPanelParametrosAuxiliar2TipoGarantia.setLayout(gridaBagParametrosAuxiliar2TipoGarantia);
			this.jPanelParametrosAuxiliar3TipoGarantia.setLayout(gridaBagParametrosAuxiliar3TipoGarantia);
			this.jPanelParametrosAuxiliar4TipoGarantia.setLayout(gridaBagParametrosAuxiliar4TipoGarantia);
			//this.jPanelParametrosAuxiliar5TipoGarantia.setLayout(gridaBagParametrosAuxiliar2TipoGarantia);			
			
			
			
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGarantia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGarantia.add(this.jButtonRecargarInformacionTipoGarantia, this.gridBagConstraintsTipoGarantia);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGarantia.add(this.jComboBoxTiposPaginacionTipoGarantia, this.gridBagConstraintsTipoGarantia);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGarantia.add(this.jCheckBoxConAltoMaximoTablaTipoGarantia, this.gridBagConstraintsTipoGarantia);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantia.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantia.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoGarantia.add(this.jComboBoxTiposArchivosReportesTipoGarantia, this.gridBagConstraintsTipoGarantia);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGarantia.add(this.jPanelParametrosAuxiliar1TipoGarantia, this.gridBagConstraintsTipoGarantia);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGarantia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoGarantia.add(this.jComboBoxTiposReportesTipoGarantia, this.gridBagConstraintsTipoGarantia);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGarantia.add(this.jPanelParametrosAuxiliar4TipoGarantia, this.gridBagConstraintsTipoGarantia);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantia.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantia.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGarantia.add(this.jComboBoxTiposReportesTipoGarantia, this.gridBagConstraintsTipoGarantia);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantia.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGarantia.add(this.jCheckBoxGenerarReporteTipoGarantia, this.gridBagConstraintsTipoGarantia);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGarantia.add(this.jPanelParametrosAuxiliar2TipoGarantia, this.gridBagConstraintsTipoGarantia);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGarantia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGarantia.add(this.jLabelAccionesTipoGarantia, this.gridBagConstraintsTipoGarantia);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
				this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoGarantia.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoGarantia.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoGarantia.add(this.jButtonAbrirOrderByTipoGarantia, this.gridBagConstraintsTipoGarantia);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoGarantia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGarantia.add(this.jComboBoxTiposSeleccionarTipoGarantia, this.gridBagConstraintsTipoGarantia);			
			
			
			/*
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoGarantia.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoGarantia.add(this.jCheckBoxSeleccionarTodosTipoGarantia, this.gridBagConstraintsTipoGarantia);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGarantia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGarantia.add(this.jCheckBoxSeleccionarTodosTipoGarantia, this.gridBagConstraintsTipoGarantia);															
				
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoGarantia.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoGarantia.add(this.jCheckBoxSeleccionadosTipoGarantia, this.gridBagConstraintsTipoGarantia);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoGarantia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantia.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoGarantia.add(this.jPanelParametrosAuxiliar3TipoGarantia, this.gridBagConstraintsTipoGarantia);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoGarantia.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoGarantia.add(this.jComboBoxTiposAccionesTipoGarantia, this.gridBagConstraintsTipoGarantia);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoGarantia = new GridBagLayout();

			this.jScrollPanelDatosTipoGarantia.setLayout(gridaBagLayoutDatosTipoGarantia);
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.gridy = 0;
			this.gridBagConstraintsTipoGarantia.gridx = 0;
			
			this.jScrollPanelDatosTipoGarantia.add(this.jTableDatosTipoGarantia, this.gridBagConstraintsTipoGarantia);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoGarantia.setViewportView(this.jTableDatosTipoGarantia);
		this.jTableDatosTipoGarantia.setFillsViewportHeight(true);
		this.jTableDatosTipoGarantia.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoGarantia= new GridBagLayout();
		this.jPanelAccionesTipoGarantia.setLayout(gridaBagLayoutAccionesTipoGarantia);
		
		
		/*	
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantia.gridy = 0;
		this.gridBagConstraintsTipoGarantia.gridx = 0;
			
		this.jPanelAccionesTipoGarantia.add(this.jButtonNuevoTipoGarantia, this.gridBagConstraintsTipoGarantia);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoGarantia= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoGarantia.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoGarantia.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoGarantia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoGarantia.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoGarantia.setLayout(gridaBagLayoutBusquedaPorCodigoTipoGarantia);

		gridBagConstraintsTipoGarantia = new GridBagConstraints();
		gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGarantia.gridy = 0;
		gridBagConstraintsTipoGarantia.gridx = 0;
		jPanelBusquedaPorCodigoTipoGarantia.add(jLabelcodigoBusquedaPorCodigoTipoGarantia, gridBagConstraintsTipoGarantia);

		gridBagConstraintsTipoGarantia = new GridBagConstraints();
		gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGarantia.gridy = 0;
		gridBagConstraintsTipoGarantia.gridx = 1;
		jPanelBusquedaPorCodigoTipoGarantia.add(jTextFieldcodigoBusquedaPorCodigoTipoGarantia, gridBagConstraintsTipoGarantia);

		gridBagConstraintsTipoGarantia = new GridBagConstraints();
		gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGarantia.gridy = 1;
		gridBagConstraintsTipoGarantia.gridx =1;
		jPanelBusquedaPorCodigoTipoGarantia.add(jButtonBusquedaPorCodigoTipoGarantia, gridBagConstraintsTipoGarantia);

		jTabbedPaneBusquedasTipoGarantia.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoGarantia);
		jTabbedPaneBusquedasTipoGarantia.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoGarantia= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoGarantia.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoGarantia.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoGarantia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoGarantia.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoGarantia.setLayout(gridaBagLayoutBusquedaPorNombreTipoGarantia);

		gridBagConstraintsTipoGarantia = new GridBagConstraints();
		gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGarantia.gridy = 0;
		gridBagConstraintsTipoGarantia.gridx = 0;
		jPanelBusquedaPorNombreTipoGarantia.add(jLabelnombreBusquedaPorNombreTipoGarantia, gridBagConstraintsTipoGarantia);

		gridBagConstraintsTipoGarantia = new GridBagConstraints();
		gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGarantia.gridy = 0;
		gridBagConstraintsTipoGarantia.gridx = 1;
		jPanelBusquedaPorNombreTipoGarantia.add(jTextAreanombreBusquedaPorNombreTipoGarantia, gridBagConstraintsTipoGarantia);

		gridBagConstraintsTipoGarantia = new GridBagConstraints();
		gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGarantia.gridy = 1;
		gridBagConstraintsTipoGarantia.gridx =1;
		jPanelBusquedaPorNombreTipoGarantia.add(jButtonBusquedaPorNombreTipoGarantia, gridBagConstraintsTipoGarantia);

		jTabbedPaneBusquedasTipoGarantia.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoGarantia);
		jTabbedPaneBusquedasTipoGarantia.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdPaisTipoGarantia= new GridBagLayout();
		gridaBagLayoutFK_IdPaisTipoGarantia.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoGarantia.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdPaisTipoGarantia.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdPaisTipoGarantia.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdPaisTipoGarantia.setLayout(gridaBagLayoutFK_IdPaisTipoGarantia);

		gridBagConstraintsTipoGarantia = new GridBagConstraints();
		gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGarantia.gridy = 0;
		gridBagConstraintsTipoGarantia.gridx = 0;
		jPanelFK_IdPaisTipoGarantia.add(jLabelid_paisFK_IdPaisTipoGarantia, gridBagConstraintsTipoGarantia);

		gridBagConstraintsTipoGarantia = new GridBagConstraints();
		gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGarantia.gridy = 0;
		gridBagConstraintsTipoGarantia.gridx = 1;
		jPanelFK_IdPaisTipoGarantia.add(jComboBoxid_paisFK_IdPaisTipoGarantia, gridBagConstraintsTipoGarantia);

		gridBagConstraintsTipoGarantia = new GridBagConstraints();
		gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoGarantia.gridy = 1;
		gridBagConstraintsTipoGarantia.gridx =1;
		jPanelFK_IdPaisTipoGarantia.add(jButtonFK_IdPaisTipoGarantia, gridBagConstraintsTipoGarantia);

		jTabbedPaneBusquedasTipoGarantia.addTab("3.-Por Pais ", jPanelFK_IdPaisTipoGarantia);
		jTabbedPaneBusquedasTipoGarantia.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGarantia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGarantia);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();						
			this.gridBagConstraintsTipoGarantia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGarantia.gridx = 0;		
			//this.gridBagConstraintsTipoGarantia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGarantia.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoGarantia, this.gridBagConstraintsTipoGarantia);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoGarantia.gridx = 0;		
		//this.gridBagConstraintsTipoGarantia.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoGarantia.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoGarantia);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoGarantia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGarantia.gridx = 0;		
			this.gridBagConstraintsTipoGarantia.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoGarantia.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoGarantia, this.gridBagConstraintsTipoGarantia);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantia.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoGarantia, this.gridBagConstraintsTipoGarantia);								
		
		
		/*
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantia.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoGarantia, this.gridBagConstraintsTipoGarantia);
		*/		
		
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGarantia.gridx =0;
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGarantia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGarantia, this.gridBagConstraintsTipoGarantia);
				
		
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantia.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoGarantia, this.gridBagConstraintsTipoGarantia);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoGarantiaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoGarantia= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGarantia = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoGarantia.setLayout(gridaBagLayoutBusquedasParametrosTipoGarantia);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoGarantia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGarantia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGarantia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGarantia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGarantia, this.gridBagConstraintsTipoGarantia);
			
			
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGarantia, this.gridBagConstraintsTipoGarantia);
		
			
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGarantia, this.gridBagConstraintsTipoGarantia);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoGarantia;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoGarantia() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoGarantia = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoGarantia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoGarantia.setName("jPanelReporteDinamicoTipoGarantia"); 
		
		this.jPanelReporteDinamicoTipoGarantia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGarantia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoGarantia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoGarantia.setLayout(gridaBagLayoutReporteDinamicoTipoGarantia);
		
		
		this.jInternalFrameReporteDinamicoTipoGarantia= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoGarantia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGarantia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoGarantia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoGarantia.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoGarantia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoGarantia.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoGarantia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoGarantia.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoGarantia.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoGarantia.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoGarantia.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGarantia.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoGarantia.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Garantias"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoGarantia = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoGarantia.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGarantia.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoGarantia.add(this.jLabelColumnasSelectReporteTipoGarantia, this.gridBagConstraintsTipoGarantia);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoGarantia = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoGarantia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoGarantia.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoGarantia.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGarantia.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoGarantia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoGarantia=new JScrollPane(this.jListColumnasSelectReporteTipoGarantia);
			
			this.jScrollColumnasSelectReporteTipoGarantia.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGarantia.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoGarantia.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGarantia.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoGarantia.add(this.jListColumnasSelectReporteTipoGarantia, this.gridBagConstraintsTipoGarantia);
		this.jPanelReporteDinamicoTipoGarantia.add(this.jScrollColumnasSelectReporteTipoGarantia, this.gridBagConstraintsTipoGarantia);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoGarantia = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoGarantia.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoGarantia = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoGarantia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoGarantia.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoGarantia.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGarantia.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoGarantia.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoGarantia=new JScrollPane(this.jListRelacionesSelectReporteTipoGarantia);
			
			this.jScrollRelacionesSelectReporteTipoGarantia.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGarantia.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoGarantia.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoGarantia = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoGarantia = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoGarantia = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoGarantia = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoGarantia.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoGarantia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGarantia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoGarantia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoGarantia = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGarantia.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoGarantia.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGarantia.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoGarantia.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoGarantia = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoGarantia.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGarantia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGarantia.add(this.jLabelGenerarExcelReporteDinamicoTipoGarantia, this.gridBagConstraintsTipoGarantia);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoGarantia = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoGarantia.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoGarantia,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoGarantia.setToolTipText("Generar EXCEL"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		//this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoGarantia.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoGarantia.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoGarantia.add(this.jButtonGenerarExcelReporteDinamicoTipoGarantia, this.gridBagConstraintsTipoGarantia);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGarantia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGarantia.add(this.jComboBoxTiposReportesDinamicoTipoGarantia, this.gridBagConstraintsTipoGarantia);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoGarantia = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoGarantia.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantia.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoGarantia.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoGarantia.add(this.jLabelTiposArchivoReporteDinamicoTipoGarantia, this.gridBagConstraintsTipoGarantia);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGarantia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGarantia.add(this.jComboBoxTiposArchivosReportesDinamicoTipoGarantia, this.gridBagConstraintsTipoGarantia);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoGarantia = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoGarantia.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoGarantia,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoGarantia.setToolTipText("Generar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGarantia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGarantia.add(this.jButtonGenerarReporteDinamicoTipoGarantia, this.gridBagConstraintsTipoGarantia);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoGarantia = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoGarantia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoGarantia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoGarantia.setToolTipText("Cancelar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantia.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoGarantia.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoGarantia.add(this.jButtonCerrarReporteDinamicoTipoGarantia, this.gridBagConstraintsTipoGarantia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoGarantia = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoGarantia= new JScrollPane(jPanelReporteDinamicoTipoGarantia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoGarantia.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGarantia.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoGarantia.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Garantias"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoGarantia.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoGarantia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoGarantia.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoGarantia);
		this.jInternalFrameReporteDinamicoTipoGarantia.getContentPane().add(this.jScrollPanelReporteDinamicoTipoGarantia, this.gridBagConstraintsTipoGarantia);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoGarantia() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoGarantia = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoGarantia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoGarantia.setName("jPanelImportacionTipoGarantia"); 
		
		this.jPanelImportacionTipoGarantia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGarantia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoGarantia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoGarantia.setLayout(gridaBagLayoutImportacionTipoGarantia);
		
		
		this.jInternalFrameImportacionTipoGarantia= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoGarantia= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoGarantia = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoGarantia= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoGarantia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGarantia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGarantia.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoGarantia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGarantia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGarantia.setResizable(true);
	    this.jInternalFrameImportacionTipoGarantia.setClosable(true);
	    this.jInternalFrameImportacionTipoGarantia.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoGarantia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoGarantia.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoGarantia.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoGarantia.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoGarantia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoGarantia.setResizable(true);
	    this.jInternalFrameImportacionTipoGarantia.setClosable(true);
	    this.jInternalFrameImportacionTipoGarantia.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoGarantia.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGarantia.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoGarantia.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Garantias"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoGarantia = new JLabelMe();

		this.jLabelArchivoImportacionTipoGarantia.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantia.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGarantia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGarantia.add(this.jLabelArchivoImportacionTipoGarantia, this.gridBagConstraintsTipoGarantia);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoGarantia = new JFileChooser();		
		this.jFileChooserImportacionTipoGarantia.setToolTipText("ESCOGER ARCHIVO"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoGarantia = new JButtonMe();
		this.jButtonAbrirImportacionTipoGarantia.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoGarantia,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoGarantia.setToolTipText("Generar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantia.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGarantia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGarantia.add(this.jButtonAbrirImportacionTipoGarantia, this.gridBagConstraintsTipoGarantia);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoGarantia = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoGarantia.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantia.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoGarantia.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoGarantia.add(this.jLabelPathArchivoImportacionTipoGarantia, this.gridBagConstraintsTipoGarantia);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoGarantia=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoGarantia.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGarantia.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoGarantia.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantia.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGarantia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGarantia.add(this.jTextFieldPathArchivoImportacionTipoGarantia, this.gridBagConstraintsTipoGarantia);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoGarantia = new JButtonMe();
		this.jButtonGenerarImportacionTipoGarantia.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoGarantia,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoGarantia.setToolTipText("Generar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantia.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGarantia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGarantia.add(this.jButtonGenerarImportacionTipoGarantia, this.gridBagConstraintsTipoGarantia);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoGarantia = new JButtonMe();
		this.jButtonCerrarImportacionTipoGarantia.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoGarantia,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoGarantia.setToolTipText("Cancelar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantia.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoGarantia.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoGarantia.add(this.jButtonCerrarImportacionTipoGarantia, this.gridBagConstraintsTipoGarantia);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoGarantia = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoGarantia= new JScrollPane(jPanelImportacionTipoGarantia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoGarantia.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoGarantia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoGarantia.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoGarantia);
		this.jInternalFrameImportacionTipoGarantia.getContentPane().add(this.jScrollPanelImportacionTipoGarantia, this.gridBagConstraintsTipoGarantia);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoGarantia(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoGarantia = new JButtonMe();
			this.jButtonAbrirOrderByTipoGarantia.setText("Orden");
			this.jButtonAbrirOrderByTipoGarantia.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoGarantia,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoGarantia";
			inputMap = this.jButtonAbrirOrderByTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoGarantia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoGarantia"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoGarantia = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoGarantia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoGarantia.setName("jPanelOrderByTipoGarantia"); 
			
			this.jPanelOrderByTipoGarantia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGarantia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoGarantia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoGarantia.setLayout(gridaBagLayoutOrderByTipoGarantia);
			
			
			this.jTableDatosTipoGarantiaOrderBy = new JTableMe();        
			this.jTableDatosTipoGarantiaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoGarantiaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoGarantiaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoGarantiaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoGarantiaOrderBy.setViewportView(this.jTableDatosTipoGarantiaOrderBy);
			this.jTableDatosTipoGarantiaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoGarantiaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoGarantia= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoGarantia= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoGarantia = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoGarantia= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoGarantia.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoGarantia.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoGarantia.setTitle("Orden");
			this.jInternalFrameOrderByTipoGarantia.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoGarantia.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoGarantia.setResizable(true);
			this.jInternalFrameOrderByTipoGarantia.setClosable(true);
			this.jInternalFrameOrderByTipoGarantia.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoGarantia.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGarantia.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoGarantia.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Garantias"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoGarantia.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoGarantia.ipady =150;
				
			this.jPanelOrderByTipoGarantia.add(jScrollPanelDatosTipoGarantiaOrderBy, this.gridBagConstraintsTipoGarantia);//this.jTableDatosTipoGarantiaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoGarantia = new JButtonMe();
			this.jButtonCerrarOrderByTipoGarantia.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoGarantia,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoGarantia.setToolTipText("Cancelar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoGarantia.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoGarantia.add(this.jButtonCerrarOrderByTipoGarantia, this.gridBagConstraintsTipoGarantia);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoGarantia = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoGarantia= new JScrollPane(jPanelOrderByTipoGarantia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoGarantia.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoGarantia.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoGarantia.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoGarantia);
			
			this.jInternalFrameOrderByTipoGarantia.getContentPane().add(this.jScrollPanelOrderByTipoGarantia, this.gridBagConstraintsTipoGarantia);			
		
		} else {
			this.jButtonAbrirOrderByTipoGarantia = new JButtonMe();
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
			&& this.tipogarantiaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoGarantia.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoGarantia.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoGarantia.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoGarantia.getRowHeight();//TipoGarantiaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoGarantiaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGarantia.isSelected()) {
					iHeightTable=TipoGarantiaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGarantiaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGarantiaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoGarantiaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoGarantia.isSelected()) {
					iHeightTable=TipoGarantiaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoGarantiaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoGarantiaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoGarantia.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGarantia.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoGarantia.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoGarantia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGarantia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoGarantia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoGarantia!=null && this.jInternalFrameOrderByTipoGarantia.getjTableDatosOrderBy()!=null) {
			//if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoGarantia.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoGarantia.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoGarantia.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoGarantia.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoGarantia.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoGarantia.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoGarantia.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoGarantia.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGarantia.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoGarantia.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tipogarantiaLogic.getTipoGarantias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogarantias.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoGarantia> TraerTipoGarantiaBeans(List<TipoGarantia> tipogarantias,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoGarantia tipogarantia:tipogarantias) {
					
				if(!(TipoGarantiaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoGarantiaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tipogarantia.setsDetalleGeneralEntityReporte(TipoGarantiaConstantesFunciones.getTipoGarantiaDescripcion(tipogarantia));
										
						
					
						
					
				} else  {
							
					//tipogarantia.setsDetalleGeneralEntityReporte(tipogarantia.getsDetalleGeneralEntityReporte());
										
				}
				
				//tipogarantiabeans.add(tipogarantiabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tipogarantias;
    }
	//PARA REPORTES FIN
}
