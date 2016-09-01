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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;

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
import com.bydan.erp.inventario.util.TipoRequisicionConstantesFunciones;

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
public class TipoRequisicionJInternalFrame extends TipoRequisicionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTipoRequisicion;
	
	protected JMenuBar jmenuBarTipoRequisicion;
	
	protected JMenu jmenuTipoRequisicion;
	protected JMenu jmenuDatosTipoRequisicion;
	protected JMenu jmenuArchivoTipoRequisicion;
	protected JMenu jmenuAccionesTipoRequisicion;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTipoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRequisicion;	
	protected GridBagConstraints gridBagConstraintsTipoRequisicion;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TipoRequisicionDetalleFormJInternalFrame jInternalFrameDetalleFormTipoRequisicion;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTipoRequisicion;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTipoRequisicion;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoPeriodoBeanSwingJInternalFrame tipoperiodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoperiodo="";

	protected DiaBeanSwingJInternalFrame diaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_dia="";
	
	public TipoRequisicionSessionBean tiporequisicionSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoPeriodoSessionBean tipoperiodoSessionBean;
	public DiaSessionBean diaSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<TipoRequisicion> tiporequisicions;		
	public List<TipoRequisicion> tiporequisicionsEliminados;	
	public List<TipoRequisicion> tiporequisicionsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTipoRequisicion;		
	protected JButton jButtonAbrirOrderByTipoRequisicion;
	
	
	//protected JPanel jPanelOrderByTipoRequisicion;
	//public JScrollPane jScrollPanelOrderByTipoRequisicion;	
	//protected JButton jButtonCerrarOrderByTipoRequisicion;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TipoRequisicionLogic tiporequisicionLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTipoRequisicion;
	public JScrollPane jScrollPanelDatosEdicionTipoRequisicion;
	public JScrollPane jScrollPanelDatosGeneralTipoRequisicion;
    
	
	
	//public JScrollPane jScrollPanelDatosTipoRequisicionOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTipoRequisicion;
	//public JScrollPane jScrollPanelImportacionTipoRequisicion;
	
	
	
	protected JPanel jPanelAccionesTipoRequisicion;
	
    protected JPanel jPanelPaginacionTipoRequisicion;
    protected JPanel jPanelParametrosReportesTipoRequisicion;
	protected JPanel jPanelParametrosReportesAccionesTipoRequisicion;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TipoRequisicion;
	protected JPanel jPanelParametrosAuxiliar2TipoRequisicion;
	protected JPanel jPanelParametrosAuxiliar3TipoRequisicion;
	protected JPanel jPanelParametrosAuxiliar4TipoRequisicion;
	//protected JPanel jPanelParametrosAuxiliar5TipoRequisicion;
	
	
	
	//protected JPanel jPanelReporteDinamicoTipoRequisicion;
	//protected JPanel jPanelImportacionTipoRequisicion;
	
	
	public JTable jTableDatosTipoRequisicion;
	
	
	
	//public JTable jTableDatosTipoRequisicionOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTipoRequisicion;
	protected JButton jButtonDuplicarTipoRequisicion;
	protected JButton jButtonCopiarTipoRequisicion;
	protected JButton jButtonVerFormTipoRequisicion;
	protected JButton jButtonNuevoRelacionesTipoRequisicion;
	protected JButton jButtonModificarTipoRequisicion;
	
    protected JButton jButtonGuardarCambiosTablaTipoRequisicion;
	protected JButton jButtonCerrarTipoRequisicion;
	
	
	protected JButton jButtonRecargarInformacionTipoRequisicion;
	protected JButton jButtonProcesarInformacionTipoRequisicion;
	
	
	protected JButton jButtonAnterioresTipoRequisicion;
	protected JButton jButtonSiguientesTipoRequisicion;
	protected JButton jButtonNuevoGuardarCambiosTipoRequisicion;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTipoRequisicion;
	//protected JButton jButtonCerrarReporteDinamicoTipoRequisicion;
	//protected JButton jButtonGenerarExcelReporteDinamicoTipoRequisicion;	
	
	
	
	//protected JButton jButtonAbrirImportacionTipoRequisicion;
	//protected JButton jButtonGenerarImportacionTipoRequisicion;
	//protected JButton jButtonCerrarImportacionTipoRequisicion;
	//protected JFileChooser jFileChooserImportacionTipoRequisicion;
	//protected File fileImportacionTipoRequisicion;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRequisicion;
	protected JButton jButtonDuplicarToolBarTipoRequisicion;
	protected JButton jButtonNuevoRelacionesToolBarTipoRequisicion;
	
	
	public JButton jButtonGuardarCambiosToolBarTipoRequisicion;
	protected JButton jButtonCopiarToolBarTipoRequisicion;
	protected JButton jButtonVerFormToolBarTipoRequisicion;
	public JButton jButtonGuardarCambiosTablaToolBarTipoRequisicion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRequisicion;
	protected JButton jButtonCerrarToolBarTipoRequisicion;
	
	protected JButton jButtonRecargarInformacionToolBarTipoRequisicion;
	protected JButton jButtonProcesarInformacionToolBarTipoRequisicion;
	protected JButton jButtonAnterioresToolBarTipoRequisicion;
	protected JButton jButtonSiguientesToolBarTipoRequisicion;
	protected JButton jButtonNuevoGuardarCambiosToolBarTipoRequisicion;
	protected JButton jButtonAbrirOrderByToolBarTipoRequisicion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRequisicion;
	protected JMenuItem jMenuItemDuplicarTipoRequisicion;
	protected JMenuItem jMenuItemNuevoRelacionesTipoRequisicion;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTipoRequisicion;
	protected JMenuItem jMenuItemCopiarTipoRequisicion;
	protected JMenuItem jMenuItemVerFormTipoRequisicion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRequisicion;
	protected JMenuItem jMenuItemCerrarTipoRequisicion;
	protected JMenuItem jMenuItemDetalleCerrarTipoRequisicion;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTipoRequisicion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRequisicion;
	
	protected JMenuItem jMenuItemRecargarInformacionTipoRequisicion;
	protected JMenuItem jMenuItemProcesarInformacionTipoRequisicion;
	protected JMenuItem jMenuItemAnterioresTipoRequisicion;
	protected JMenuItem jMenuItemSiguientesTipoRequisicion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRequisicion;
	protected JMenuItem jMenuItemAbrirOrderByTipoRequisicion;
	protected JMenuItem jMenuItemMostrarOcultarTipoRequisicion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRequisicion;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTipoRequisicion;
	protected JCheckBox jCheckBoxSeleccionadosTipoRequisicion;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTipoRequisicion;
	protected JCheckBox jCheckBoxConGraficoReporteTipoRequisicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTipoRequisicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTipoRequisicion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRequisicion;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTipoRequisicion;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTipoRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTipoRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTipoRequisicion;
	protected JTextField jTextFieldValorCampoGeneralTipoRequisicion;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTipoRequisicion;
	//public JList<Reporte> jListColumnasSelectReporteTipoRequisicion;
	//public JScrollPane jScrollColumnasSelectReporteTipoRequisicion;
	
	//public JLabel jLabelRelacionesSelectReporteTipoRequisicion;
	//public JList<Reporte> jListRelacionesSelectReporteTipoRequisicion;
	//public JScrollPane jScrollRelacionesSelectReporteTipoRequisicion;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTipoRequisicion;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTipoRequisicion;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTipoRequisicion;
	//public JLabel jLabelTiposArchivoReporteDinamicoTipoRequisicion;
	
		
	//public JLabel jLabelArchivoImportacionTipoRequisicion;	
	//public JLabel jLabelPathArchivoImportacionTipoRequisicion;
	//protected JTextField jTextFieldPathArchivoImportacionTipoRequisicion;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTipoRequisicion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTipoRequisicion;
	
	//public JLabel jLabelColumnaCategoriaValorTipoRequisicion;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTipoRequisicion;
	
	//public JLabel jLabelColumnasValoresGraficoTipoRequisicion;
	//public JList<Reporte> jListColumnasValoresGraficoTipoRequisicion;
	//public JScrollPane jScrollColumnasValoresGraficoTipoRequisicion;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTipoRequisicion;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTipoRequisicion;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTipoRequisicion;
	public JPanel jPanelBusquedaPorCodigoTipoRequisicion;
	public JButton jButtonBusquedaPorCodigoTipoRequisicion;
	public JPanel jPanelBusquedaPorNombreTipoRequisicion;
	public JButton jButtonBusquedaPorNombreTipoRequisicion;
	public JPanel jPanelFK_IdDiaTipoRequisicion;
	public JButton jButtonFK_IdDiaTipoRequisicion;
	public JPanel jPanelFK_IdTipoPeriodoTipoRequisicion;
	public JButton jButtonFK_IdTipoPeriodoTipoRequisicion;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTipoRequisicion;
	public JLabel jLabelcodigoBusquedaPorCodigoTipoRequisicion;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTipoRequisicion;
	public JButton jButtoncodigoBusquedaPorCodigoTipoRequisicionBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTipoRequisicion;
	public JLabel jLabelnombreBusquedaPorNombreTipoRequisicion;
	public JTextField jTextFieldnombreBusquedaPorNombreTipoRequisicion;
	public JButton jButtonnombreBusquedaPorNombreTipoRequisicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_diaFK_IdDiaTipoRequisicion;
	public JLabel jLabelid_diaFK_IdDiaTipoRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_diaFK_IdDiaTipoRequisicion;
	public JButton jButtonid_diaFK_IdDiaTipoRequisicion= new JButtonMe();
	public JButton jButtonid_diaFK_IdDiaTipoRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_diaFK_IdDiaTipoRequisicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion;
	public JLabel jLabelid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion;
	public JButton jButtonid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion= new JButtonMe();
	public JButton jButtonid_tipo_periodoFK_IdTipoPeriodoTipoRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_periodoFK_IdTipoPeriodoTipoRequisicionBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TipoRequisicionJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TipoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRequisicionJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRequisicionJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRequisicionJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTipoRequisicion)	{
		this.jButtonRecargarInformacionTipoRequisicion = jButtonRecargarInformacionTipoRequisicion;
	}
	
	public JButton getjButtonProcesarInformacionTipoRequisicion() {
		return this.jButtonProcesarInformacionTipoRequisicion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRequisicion)	{
		this.jButtonProcesarInformacionTipoRequisicion = jButtonProcesarInformacionTipoRequisicion;
	}
	
	
	public JButton getjButtonRecargarInformacionTipoRequisicion() {
		return this.jButtonRecargarInformacionTipoRequisicion;
	}
	
	
	public List<TipoRequisicion> gettiporequisicions() {
		return this.tiporequisicions;
	}

	public void settiporequisicions(List<TipoRequisicion> tiporequisicions) {
		this.tiporequisicions = tiporequisicions;
	}
	
	public List<TipoRequisicion> gettiporequisicionsAux() {
		return this.tiporequisicionsAux;
	}

	public void settiporequisicionsAux(List<TipoRequisicion> tiporequisicionsAux) {
		this.tiporequisicionsAux = tiporequisicionsAux;
	}
	
	public List<TipoRequisicion> gettiporequisicionsEliminados() {
		return this.tiporequisicionsEliminados;
	}

	public void setTipoRequisicionsEliminados(List<TipoRequisicion> tiporequisicionsEliminados) {
		this.tiporequisicionsEliminados = tiporequisicionsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTipoRequisicion() {
		return jComboBoxTiposSeleccionarTipoRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTipoRequisicion(
			JComboBox jComboBoxTiposSeleccionarTipoRequisicion) {
		this.jComboBoxTiposSeleccionarTipoRequisicion = jComboBoxTiposSeleccionarTipoRequisicion;
	}
	
	public void setBorderResaltarTiposSeleccionarTipoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTipoRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTipoRequisicion .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTipoRequisicion() {
		return jTextFieldValorCampoGeneralTipoRequisicion;
	}

	public void setjTextFieldValorCampoGeneralTipoRequisicion(
			JTextField jTextFieldValorCampoGeneralTipoRequisicion) {
		this.jTextFieldValorCampoGeneralTipoRequisicion = jTextFieldValorCampoGeneralTipoRequisicion;
	}

	public void setBorderResaltarValorCampoGeneralTipoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRequisicion.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTipoRequisicion .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTipoRequisicion() {
		return this.jCheckBoxSeleccionarTodosTipoRequisicion;
	}

	public void setjCheckBoxSeleccionarTodosTipoRequisicion(
			JCheckBox jCheckBoxSeleccionarTodosTipoRequisicion) {
		this.jCheckBoxSeleccionarTodosTipoRequisicion = jCheckBoxSeleccionarTodosTipoRequisicion;
	}

	public void setBorderResaltarSeleccionarTodosTipoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRequisicion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTipoRequisicion .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTipoRequisicion() {
		return this.jCheckBoxSeleccionadosTipoRequisicion;
	}

	public void setjCheckBoxSeleccionadosTipoRequisicion(
			JCheckBox jCheckBoxSeleccionadosTipoRequisicion) {
		this.jCheckBoxSeleccionadosTipoRequisicion = jCheckBoxSeleccionadosTipoRequisicion;
	}
	
	public void setBorderResaltarSeleccionadosTipoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRequisicion.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTipoRequisicion .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTipoRequisicion() {
		return this.jComboBoxTiposArchivosReportesTipoRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTipoRequisicion(
			JComboBox jComboBoxTiposArchivosReportesTipoRequisicion) {
		this.jComboBoxTiposArchivosReportesTipoRequisicion = jComboBoxTiposArchivosReportesTipoRequisicion;
	}

	public void setBorderResaltarTiposArchivosReportesTipoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTipoRequisicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTipoRequisicion() {
		return this.jComboBoxTiposReportesTipoRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTipoRequisicion(
			JComboBox jComboBoxTiposReportesTipoRequisicion) {
		this.jComboBoxTiposReportesTipoRequisicion = jComboBoxTiposReportesTipoRequisicion;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTipoRequisicion() {
	//	return jComboBoxTiposReportesDinamicoTipoRequisicion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTipoRequisicion(
	//		JComboBox jComboBoxTiposReportesDinamicoTipoRequisicion) {
	//	this.jComboBoxTiposReportesDinamicoTipoRequisicion = jComboBoxTiposReportesDinamicoTipoRequisicion;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTipoRequisicion() {
	//	return jComboBoxTiposArchivosReportesDinamicoTipoRequisicion;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTipoRequisicion(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTipoRequisicion) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTipoRequisicion = jComboBoxTiposArchivosReportesDinamicoTipoRequisicion;
	//}
	
	public void setBorderResaltarTiposReportesTipoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTipoRequisicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTipoRequisicion() {
		return this.jComboBoxTiposGraficosReportesTipoRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTipoRequisicion(
			JComboBox jComboBoxTiposGraficosReportesTipoRequisicion) {
		this.jComboBoxTiposGraficosReportesTipoRequisicion = jComboBoxTiposGraficosReportesTipoRequisicion;
	}
	
	public void setBorderResaltarTiposGraficosReportesTipoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTipoRequisicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTipoRequisicion() {
		return this.jComboBoxTiposPaginacionTipoRequisicion;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTipoRequisicion(
			JComboBox jComboBoxTiposPaginacionTipoRequisicion) {
		this.jComboBoxTiposPaginacionTipoRequisicion = jComboBoxTiposPaginacionTipoRequisicion;
	}
	
	public void setBorderResaltarTiposPaginacionTipoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTipoRequisicion .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTipoRequisicion() {
		return this.jComboBoxTiposRelacionesTipoRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRequisicion() {
		return this.jComboBoxTiposAccionesTipoRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRequisicion(
			JComboBox jComboBoxTiposRelacionesTipoRequisicion) {
		this.jComboBoxTiposRelacionesTipoRequisicion = jComboBoxTiposRelacionesTipoRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRequisicion(
			JComboBox jComboBoxTiposAccionesTipoRequisicion) {
		this.jComboBoxTiposAccionesTipoRequisicion = jComboBoxTiposAccionesTipoRequisicion;
	}
	
	public void setBorderResaltarTiposRelacionesTipoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTipoRequisicion .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTipoRequisicion() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTipoRequisicion.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTipoRequisicion .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTipoRequisicion() {
	//	return jCheckBoxConGraficoDinamicoTipoRequisicion;
	//}

	//public void setjCheckBoxConGraficoDinamicoTipoRequisicion(
	//		JCheckBox jCheckBoxConGraficoDinamicoTipoRequisicion) {
	//	this.jCheckBoxConGraficoDinamicoTipoRequisicion = jCheckBoxConGraficoDinamicoTipoRequisicion;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTipoRequisicion() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTipoRequisicion.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTipoRequisicion .setBorder(borderResaltar);		
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
		this.tiporequisicionSessionBean=new TipoRequisicionSessionBean();
		
		this.tiporequisicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporequisicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporequisicionSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TipoRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TipoRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRequisicionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Requesicion MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
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
		
		TipoRequisicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TipoRequisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTipoRequisicion= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTipoRequisicion,this.jTtoolBarTipoRequisicion,
							"nuevo","nuevo","Nuevo"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTipoRequisicion,this.jTtoolBarTipoRequisicion,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTipoRequisicion,this.jTtoolBarTipoRequisicion,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTipoRequisicion,this.jTtoolBarTipoRequisicion,
							"duplicar","duplicar","Duplicar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTipoRequisicion,this.jTtoolBarTipoRequisicion,
							"copiar","copiar","Copiar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTipoRequisicion,this.jTtoolBarTipoRequisicion,
							"ver_form","ver_form","Ver"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRequisicion,this.jTtoolBarTipoRequisicion,
							"recargar","recargar","Recargar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRequisicion,this.jTtoolBarTipoRequisicion,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTipoRequisicion,this.jTtoolBarTipoRequisicion,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTipoRequisicion,this.jTtoolBarTipoRequisicion,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTipoRequisicion,this.jTtoolBarTipoRequisicion,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTipoRequisicion,this.jTtoolBarTipoRequisicion,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTipoRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTipoRequisicion,this.jTtoolBarTipoRequisicion,
							"cerrar","cerrar","Salir"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTipoRequisicion=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTipoRequisicion;
			
				this.jButtonProcesarInformacionToolBarTipoRequisicion=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTipoRequisicion;
				
		//protected JButton jButtonModificarToolBarTipoRequisicion;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTipoRequisicion=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTipoRequisicion=new JMenuMe("General");
		this.jmenuArchivoTipoRequisicion=new JMenuMe("Archivo");
		this.jmenuAccionesTipoRequisicion=new JMenuMe("Acciones");
		this.jmenuDatosTipoRequisicion=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRequisicion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRequisicion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRequisicion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTipoRequisicion= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTipoRequisicion.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTipoRequisicion,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTipoRequisicion= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTipoRequisicion.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTipoRequisicion,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTipoRequisicion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRequisicion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRequisicion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTipoRequisicion= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTipoRequisicion.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTipoRequisicion,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTipoRequisicion= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTipoRequisicion.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTipoRequisicion,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTipoRequisicion= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTipoRequisicion.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTipoRequisicion,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRequisicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRequisicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRequisicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTipoRequisicion= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTipoRequisicion.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTipoRequisicion,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTipoRequisicion= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTipoRequisicion.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTipoRequisicion,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTipoRequisicion= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTipoRequisicion.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTipoRequisicion,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTipoRequisicion= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTipoRequisicion.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTipoRequisicion,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTipoRequisicion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTipoRequisicion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTipoRequisicion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRequisicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRequisicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRequisicion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTipoRequisicion= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTipoRequisicion.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTipoRequisicion,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRequisicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRequisicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRequisicion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTipoRequisicion= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTipoRequisicion.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTipoRequisicion,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTipoRequisicion.add(this.jMenuItemCerrarTipoRequisicion);
			
			this.jmenuAccionesTipoRequisicion.add(this.jMenuItemNuevoTipoRequisicion);
			this.jmenuAccionesTipoRequisicion.add(this.jMenuItemNuevoGuardarCambiosTipoRequisicion);
			this.jmenuAccionesTipoRequisicion.add(this.jMenuItemNuevoRelacionesTipoRequisicion);
			this.jmenuAccionesTipoRequisicion.add(this.jMenuItemGuardarCambiosTablaTipoRequisicion);		
			this.jmenuAccionesTipoRequisicion.add(this.jMenuItemDuplicarTipoRequisicion);		
			this.jmenuAccionesTipoRequisicion.add(this.jMenuItemCopiarTipoRequisicion);		
			this.jmenuAccionesTipoRequisicion.add(this.jMenuItemVerFormTipoRequisicion);		
			
			this.jmenuDatosTipoRequisicion.add(this.jMenuItemRecargarInformacionTipoRequisicion);				
			this.jmenuDatosTipoRequisicion.add(this.jMenuItemAnterioresTipoRequisicion);				
			this.jmenuDatosTipoRequisicion.add(this.jMenuItemSiguientesTipoRequisicion);				
			this.jmenuDatosTipoRequisicion.add(this.jMenuItemAbrirOrderByTipoRequisicion);				
			this.jmenuDatosTipoRequisicion.add(this.jMenuItemMostrarOcultarTipoRequisicion);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTipoRequisicion.add(this.jMenuItemGuardarCambiosTipoRequisicion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTipoRequisicion.add(this.jmenuArchivoTipoRequisicion);		
			this.jmenuBarTipoRequisicion.add(this.jmenuAccionesTipoRequisicion);		
			this.jmenuBarTipoRequisicion.add(this.jmenuDatosTipoRequisicion);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTipoRequisicion);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTipoRequisicion() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTipoRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTipoRequisicion.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTipoRequisicion= new JButtonMe();
		this.jButtonBusquedaPorCodigoTipoRequisicion.setText("Buscar");
		this.jButtonBusquedaPorCodigoTipoRequisicion.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTipoRequisicion,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTipoRequisicion = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTipoRequisicion.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTipoRequisicion.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTipoRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTipoRequisicion= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTipoRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorNombreTipoRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTipoRequisicion.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTipoRequisicion= new JButtonMe();
		this.jButtonBusquedaPorNombreTipoRequisicion.setText("Buscar");
		this.jButtonBusquedaPorNombreTipoRequisicion.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTipoRequisicion,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTipoRequisicion = new JLabelMe();
		jLabelnombreBusquedaPorNombreTipoRequisicion.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTipoRequisicion.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTipoRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldnombreBusquedaPorNombreTipoRequisicion= new JTextFieldMe();
		jTextFieldnombreBusquedaPorNombreTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBusquedaPorNombreTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBusquedaPorNombreTipoRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdDiaTipoRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdDiaTipoRequisicion.setToolTipText("Buscar Por Dia ");
		this.jButtonFK_IdDiaTipoRequisicion= new JButtonMe();
		this.jButtonFK_IdDiaTipoRequisicion.setText("Buscar");
		this.jButtonFK_IdDiaTipoRequisicion.setToolTipText("Buscar Por Dia ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdDiaTipoRequisicion,"buscar_button","Buscar Por Dia ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdDiaTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_diaFK_IdDiaTipoRequisicion = new JLabelMe();
		jLabelid_diaFK_IdDiaTipoRequisicion.setText("Dia :");
		jLabelid_diaFK_IdDiaTipoRequisicion.setToolTipText("Dia");
		jLabelid_diaFK_IdDiaTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_diaFK_IdDiaTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_diaFK_IdDiaTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_diaFK_IdDiaTipoRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_diaFK_IdDiaTipoRequisicion= new JComboBoxMe();
		jComboBoxid_diaFK_IdDiaTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_diaFK_IdDiaTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_diaFK_IdDiaTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_diaFK_IdDiaTipoRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoPeriodoTipoRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoPeriodoTipoRequisicion.setToolTipText("Buscar Por Tipo Periodo ");
		this.jButtonFK_IdTipoPeriodoTipoRequisicion= new JButtonMe();
		this.jButtonFK_IdTipoPeriodoTipoRequisicion.setText("Buscar");
		this.jButtonFK_IdTipoPeriodoTipoRequisicion.setToolTipText("Buscar Por Tipo Periodo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoPeriodoTipoRequisicion,"buscar_button","Buscar Por Tipo Periodo ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoPeriodoTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion = new JLabelMe();
		jLabelid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.setText("Tipo Periodo :");
		jLabelid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.setToolTipText("Tipo Periodo");
		jLabelid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion= new JComboBoxMe();
		jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTipoRequisicion=new JTabbedPane();


		this.jTabbedPaneBusquedasTipoRequisicion.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoRequisicion.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTipoRequisicion.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTipoRequisicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTipoRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTipoRequisicion = new TipoRequisicionDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Tipo Requesicion DATOS");
			this.jInternalFrameDetalleFormTipoRequisicion = new TipoRequisicionDetalleFormJInternalFrame(jDesktopPane,this.tiporequisicionSessionBean.getConGuardarRelaciones(),this.tiporequisicionSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTipoRequisicion = null;//new TipoRequisicionDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRequisicion= new GridBagLayout();
		
		
		this.jTableDatosTipoRequisicion = new JTableMe();      
		
		String sToolTipTipoRequisicion="";
		sToolTipTipoRequisicion=TipoRequisicionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRequisicion+="(Inventario.TipoRequisicion)";
		}
		
		if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRequisicion+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTipoRequisicion.setToolTipText(sToolTipTipoRequisicion);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTipoRequisicion);
		this.jTableDatosTipoRequisicion.setAutoCreateRowSorter(true);
		this.jTableDatosTipoRequisicion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTipoRequisicion.setRowSelectionAllowed(true);
		this.jTableDatosTipoRequisicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTipoRequisicion,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTipoRequisicion = new JButtonMe();
		this.jButtonDuplicarTipoRequisicion = new JButtonMe();
		this.jButtonCopiarTipoRequisicion = new JButtonMe();
		this.jButtonVerFormTipoRequisicion = new JButtonMe();
		this.jButtonNuevoRelacionesTipoRequisicion = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTipoRequisicion = new JButtonMe();
		this.jButtonCerrarTipoRequisicion = new JButtonMe();
		
		this.jScrollPanelDatosTipoRequisicion = new JScrollPane();   
        this.jScrollPanelDatosGeneralTipoRequisicion = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTipoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Requesicion";
		
		if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Requesiciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRequisicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRequisicion.setToolTipText("Acciones");
        this.jPanelAccionesTipoRequisicion.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTipoRequisicion=new ReporteDinamicoJInternalFrame(TipoRequisicionConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTipoRequisicion();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTipoRequisicion=new ImportacionJInternalFrame(TipoRequisicionConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTipoRequisicion();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTipoRequisicion = new JButtonMe();
		
		this.jButtonAbrirOrderByTipoRequisicion.setText("Orden");
		this.jButtonAbrirOrderByTipoRequisicion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRequisicion,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTipoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRequisicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRequisicion,false,this);
			
			//this.cargarOrderByTipoRequisicion(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTipoRequisicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRequisicion,true,this);
			
			//this.cargarOrderByTipoRequisicion(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTipoRequisicion.setMinimumSize(new Dimension(400,50));//730
		this.jTableDatosTipoRequisicion.setMaximumSize(new Dimension(400,50));//730
		this.jTableDatosTipoRequisicion.setPreferredSize(new Dimension(400,50));//730
		
		this.jScrollPanelDatosTipoRequisicion.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRequisicion.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTipoRequisicion.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTipoRequisicion.setText("Nuevo");
		this.jButtonDuplicarTipoRequisicion.setText("Duplicar");
		this.jButtonCopiarTipoRequisicion.setText("Copiar");
		this.jButtonVerFormTipoRequisicion.setText("Ver");
		this.jButtonNuevoRelacionesTipoRequisicion.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTipoRequisicion.setText("Guardar");
		this.jButtonCerrarTipoRequisicion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRequisicion,"nuevo_button","Nuevo",this.tiporequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTipoRequisicion,"duplicar_button","Duplicar",this.tiporequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTipoRequisicion,"copiar_button","Copiar",this.tiporequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTipoRequisicion,"ver_form","Ver",this.tiporequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTipoRequisicion,"nuevorelaciones_button","Nuevo Rel",this.tiporequisicionSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRequisicion,"guardarcambiostabla_button","Guardar",this.tiporequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRequisicion,"cerrar_button","Salir",this.tiporequisicionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTipoRequisicion.setToolTipText("Nuevo"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTipoRequisicion.setToolTipText("Duplicar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTipoRequisicion.setToolTipText("Copiar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTipoRequisicion.setToolTipText("Ver"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTipoRequisicion.setToolTipText("Nuevo Rel"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTipoRequisicion.setToolTipText("Guardar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRequisicion.setToolTipText("Salir"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRequisicion";
		inputMap = this.jButtonNuevoTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRequisicion"));
		
		//DUPLICAR
		sMapKey = "DuplicarTipoRequisicion";
		inputMap = this.jButtonDuplicarTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTipoRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTipoRequisicion"));
		
		//COPIAR
		sMapKey = "CopiarTipoRequisicion";
		inputMap = this.jButtonCopiarTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTipoRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTipoRequisicion"));
		
		//VEr FORM
		sMapKey = "VerFormTipoRequisicion";
		inputMap = this.jButtonVerFormTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTipoRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTipoRequisicion"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTipoRequisicion";
		inputMap = this.jButtonNuevoRelacionesTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTipoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTipoRequisicion"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTipoRequisicion";
		inputMap = this.jButtonModificarTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTipoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTipoRequisicion"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTipoRequisicion";
		inputMap = this.jButtonCerrarTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRequisicion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRequisicion";
		inputMap = this.jButtonGuardarCambiosTablaTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRequisicion"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTipoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTipoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTipoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TipoRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TipoRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TipoRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TipoRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TipoRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTipoRequisicion.setName("jPanelParametrosReportesTipoRequisicion"); 
		
		this.jPanelParametrosReportesAccionesTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTipoRequisicion.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTipoRequisicion.setName("jPanelParametrosReportesAccionesTipoRequisicion"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTipoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTipoRequisicion = new JButtonMe();
		this.jButtonRecargarInformacionTipoRequisicion.setText("Recargar");
		this.jButtonRecargarInformacionTipoRequisicion.setToolTipText("Recargar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTipoRequisicion,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTipoRequisicion = new JButtonMe();
		this.jButtonProcesarInformacionTipoRequisicion.setText("Procesar");
		this.jButtonProcesarInformacionTipoRequisicion.setToolTipText("Procesar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTipoRequisicion.setVisible(false);
			
		this.jButtonProcesarInformacionTipoRequisicion.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRequisicion.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTipoRequisicion.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTipoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRequisicion.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTipoRequisicion.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTipoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRequisicion.setText("TIPO");       
		this.jComboBoxTiposReportesTipoRequisicion.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTipoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTipoRequisicion.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTipoRequisicion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTipoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTipoRequisicion.setText("Paginacion");
		this.jComboBoxTiposPaginacionTipoRequisicion.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTipoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTipoRequisicion.setText("Accion");
		this.jComboBoxTiposRelacionesTipoRequisicion.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTipoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRequisicion.setText("Accion");
		this.jComboBoxTiposAccionesTipoRequisicion.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTipoRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTipoRequisicion.setText("Accion");
		this.jComboBoxTiposSeleccionarTipoRequisicion.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTipoRequisicion=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTipoRequisicion.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRequisicion.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTipoRequisicion.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTipoRequisicion = new JLabelMe();
		
		this.jLabelAccionesTipoRequisicion.setText("Acciones");		
		this.jLabelAccionesTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTipoRequisicion = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTipoRequisicion.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTipoRequisicion.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTipoRequisicion = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTipoRequisicion.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTipoRequisicion.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTipoRequisicion = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTipoRequisicion.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTipoRequisicion.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTipoRequisicion = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTipoRequisicion.setText("Graf.");
		this.jCheckBoxConGraficoReporteTipoRequisicion.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTipoRequisicion = new JButtonMe();
		//this.jButtonAnterioresTipoRequisicion.setText("<<");
        this.jButtonAnterioresTipoRequisicion.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTipoRequisicion,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTipoRequisicion = new JButtonMe();
		//this.jButtonSiguientesTipoRequisicion.setText(">>");
        this.jButtonSiguientesTipoRequisicion.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTipoRequisicion,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTipoRequisicion = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTipoRequisicion.setText("Nue");
        this.jButtonNuevoGuardarCambiosTipoRequisicion.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTipoRequisicion,"nuevoguardarcambios_button","Nue",this.tiporequisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTipoRequisicion";
		inputMap = this.jButtonNuevoGuardarCambiosTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTipoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTipoRequisicion"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTipoRequisicion";
		inputMap = this.jButtonRecargarInformacionTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTipoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTipoRequisicion"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTipoRequisicion";
		inputMap = this.jButtonSiguientesTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTipoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTipoRequisicion"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTipoRequisicion";
		inputMap = this.jButtonAnterioresTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTipoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTipoRequisicion"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTipoRequisicion();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTipoRequisicion.setMinimumSize(new Dimension(this.getWidth(),TipoRequisicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRequisicionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRequisicion.setMaximumSize(new Dimension(this.getWidth(),TipoRequisicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRequisicionBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTipoRequisicion.setPreferredSize(new Dimension(this.getWidth(),TipoRequisicionBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TipoRequisicionBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTipoRequisicion = new GridBagLayout();

			this.jPanelPaginacionTipoRequisicion.setLayout(gridaBagLayoutPaginacionTipoRequisicion);						
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.gridy = 0;
			this.gridBagConstraintsTipoRequisicion.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTipoRequisicion.add(this.jButtonAnterioresTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
					
						
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRequisicion.gridy = 0;
			
			this.jPanelPaginacionTipoRequisicion.add(this.jButtonNuevoGuardarCambiosTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
						
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTipoRequisicion.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTipoRequisicion.gridy = 0;
			this.jPanelPaginacionTipoRequisicion.add(this.jButtonSiguientesTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.gridy = 1;
			this.gridBagConstraintsTipoRequisicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRequisicion.add(this.jButtonNuevoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
						
			
			
			if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
				this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTipoRequisicion.gridy = 1;
				this.gridBagConstraintsTipoRequisicion.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTipoRequisicion.add(this.jButtonGuardarCambiosTablaTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
			}
			
			
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.gridy = 1;
			this.gridBagConstraintsTipoRequisicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRequisicion.add(this.jButtonDuplicarTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.gridy = 1;
			this.gridBagConstraintsTipoRequisicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRequisicion.add(this.jButtonCopiarTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.gridy = 1;
			this.gridBagConstraintsTipoRequisicion.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTipoRequisicion.add(this.jButtonVerFormTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.gridy = 1;
			this.gridBagConstraintsTipoRequisicion.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTipoRequisicion.add(this.jButtonCerrarTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		
		
		
		this.jButtonRecargarInformacionTipoRequisicion.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRequisicion.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTipoRequisicion.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTipoRequisicion.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRequisicion.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTipoRequisicion.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTipoRequisicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRequisicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTipoRequisicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTipoRequisicion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRequisicion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTipoRequisicion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTipoRequisicion.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRequisicion.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTipoRequisicion.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTipoRequisicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRequisicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTipoRequisicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTipoRequisicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRequisicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRequisicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTipoRequisicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRequisicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTipoRequisicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTipoRequisicion.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRequisicion.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTipoRequisicion.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTipoRequisicion.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRequisicion.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTipoRequisicion.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTipoRequisicion.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRequisicion.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTipoRequisicion.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTipoRequisicion.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRequisicion.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTipoRequisicion.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTipoRequisicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTipoRequisicion = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TipoRequisicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TipoRequisicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TipoRequisicion = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TipoRequisicion = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTipoRequisicion.setLayout(gridaBagParametrosReportesTipoRequisicion);
			this.jPanelParametrosReportesAccionesTipoRequisicion.setLayout(gridaBagParametrosReportesAccionesTipoRequisicion);
			
			
			this.jPanelParametrosAuxiliar1TipoRequisicion.setLayout(gridaBagParametrosAuxiliar1TipoRequisicion);
			this.jPanelParametrosAuxiliar2TipoRequisicion.setLayout(gridaBagParametrosAuxiliar2TipoRequisicion);
			this.jPanelParametrosAuxiliar3TipoRequisicion.setLayout(gridaBagParametrosAuxiliar3TipoRequisicion);
			this.jPanelParametrosAuxiliar4TipoRequisicion.setLayout(gridaBagParametrosAuxiliar4TipoRequisicion);
			//this.jPanelParametrosAuxiliar5TipoRequisicion.setLayout(gridaBagParametrosAuxiliar2TipoRequisicion);			
			
			
			
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRequisicion.add(this.jButtonRecargarInformacionTipoRequisicion, this.gridBagConstraintsTipoRequisicion);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRequisicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRequisicion.add(this.jComboBoxTiposPaginacionTipoRequisicion, this.gridBagConstraintsTipoRequisicion);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRequisicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRequisicion.add(this.jCheckBoxConAltoMaximoTablaTipoRequisicion, this.gridBagConstraintsTipoRequisicion);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRequisicion.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TipoRequisicion.add(this.jComboBoxTiposArchivosReportesTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRequisicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRequisicion.add(this.jPanelParametrosAuxiliar1TipoRequisicion, this.gridBagConstraintsTipoRequisicion);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRequisicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TipoRequisicion.add(this.jComboBoxTiposReportesTipoRequisicion, this.gridBagConstraintsTipoRequisicion);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRequisicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRequisicion.add(this.jPanelParametrosAuxiliar4TipoRequisicion, this.gridBagConstraintsTipoRequisicion);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRequisicion.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRequisicion.add(this.jComboBoxTiposReportesTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRequisicion.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRequisicion.add(this.jCheckBoxGenerarReporteTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRequisicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRequisicion.add(this.jPanelParametrosAuxiliar2TipoRequisicion, this.gridBagConstraintsTipoRequisicion);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRequisicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRequisicion.add(this.jLabelAccionesTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
				this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTipoRequisicion.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTipoRequisicion.add(this.jButtonAbrirOrderByTipoRequisicion, this.gridBagConstraintsTipoRequisicion);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRequisicion.add(this.jComboBoxTiposSeleccionarTipoRequisicion, this.gridBagConstraintsTipoRequisicion);			
			
			
			/*
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTipoRequisicion.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTipoRequisicion.add(this.jCheckBoxSeleccionarTodosTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRequisicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRequisicion.add(this.jCheckBoxSeleccionarTodosTipoRequisicion, this.gridBagConstraintsTipoRequisicion);															
				
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTipoRequisicion.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TipoRequisicion.add(this.jCheckBoxSeleccionadosTipoRequisicion, this.gridBagConstraintsTipoRequisicion);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRequisicion.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTipoRequisicion.add(this.jPanelParametrosAuxiliar3TipoRequisicion, this.gridBagConstraintsTipoRequisicion);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRequisicion.add(this.jComboBoxTiposRelacionesTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
				
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRequisicion.add(this.jComboBoxTiposAccionesTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
	
				
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTipoRequisicion.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTipoRequisicion.add(this.jTextFieldValorCampoGeneralTipoRequisicion, this.gridBagConstraintsTipoRequisicion);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTipoRequisicion = new GridBagLayout();

			this.jScrollPanelDatosTipoRequisicion.setLayout(gridaBagLayoutDatosTipoRequisicion);
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.gridy = 0;
			this.gridBagConstraintsTipoRequisicion.gridx = 0;
			
			this.jScrollPanelDatosTipoRequisicion.add(this.jTableDatosTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTipoRequisicion.setViewportView(this.jTableDatosTipoRequisicion);
		this.jTableDatosTipoRequisicion.setFillsViewportHeight(true);
		this.jTableDatosTipoRequisicion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoRequisicion= new GridBagLayout();
		this.jPanelAccionesTipoRequisicion.setLayout(gridaBagLayoutAccionesTipoRequisicion);
		
		
		/*	
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRequisicion.gridy = 0;
		this.gridBagConstraintsTipoRequisicion.gridx = 0;
			
		this.jPanelAccionesTipoRequisicion.add(this.jButtonNuevoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTipoRequisicion= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTipoRequisicion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoRequisicion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTipoRequisicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTipoRequisicion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTipoRequisicion.setLayout(gridaBagLayoutBusquedaPorCodigoTipoRequisicion);

		gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRequisicion.gridy = 0;
		gridBagConstraintsTipoRequisicion.gridx = 0;
		jPanelBusquedaPorCodigoTipoRequisicion.add(jLabelcodigoBusquedaPorCodigoTipoRequisicion, gridBagConstraintsTipoRequisicion);

		gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRequisicion.gridy = 0;
		gridBagConstraintsTipoRequisicion.gridx = 1;
		jPanelBusquedaPorCodigoTipoRequisicion.add(jTextFieldcodigoBusquedaPorCodigoTipoRequisicion, gridBagConstraintsTipoRequisicion);

		gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRequisicion.gridy = 1;
		gridBagConstraintsTipoRequisicion.gridx =1;
		jPanelBusquedaPorCodigoTipoRequisicion.add(jButtonBusquedaPorCodigoTipoRequisicion, gridBagConstraintsTipoRequisicion);

		jTabbedPaneBusquedasTipoRequisicion.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTipoRequisicion);
		jTabbedPaneBusquedasTipoRequisicion.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTipoRequisicion= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTipoRequisicion.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoRequisicion.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTipoRequisicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTipoRequisicion.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTipoRequisicion.setLayout(gridaBagLayoutBusquedaPorNombreTipoRequisicion);

		gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRequisicion.gridy = 0;
		gridBagConstraintsTipoRequisicion.gridx = 0;
		jPanelBusquedaPorNombreTipoRequisicion.add(jLabelnombreBusquedaPorNombreTipoRequisicion, gridBagConstraintsTipoRequisicion);

		gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRequisicion.gridy = 0;
		gridBagConstraintsTipoRequisicion.gridx = 1;
		jPanelBusquedaPorNombreTipoRequisicion.add(jTextFieldnombreBusquedaPorNombreTipoRequisicion, gridBagConstraintsTipoRequisicion);

		gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRequisicion.gridy = 1;
		gridBagConstraintsTipoRequisicion.gridx =1;
		jPanelBusquedaPorNombreTipoRequisicion.add(jButtonBusquedaPorNombreTipoRequisicion, gridBagConstraintsTipoRequisicion);

		jTabbedPaneBusquedasTipoRequisicion.addTab("2.-Por Nombre ", jPanelBusquedaPorNombreTipoRequisicion);
		jTabbedPaneBusquedasTipoRequisicion.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutFK_IdDiaTipoRequisicion= new GridBagLayout();
		gridaBagLayoutFK_IdDiaTipoRequisicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdDiaTipoRequisicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdDiaTipoRequisicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdDiaTipoRequisicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdDiaTipoRequisicion.setLayout(gridaBagLayoutFK_IdDiaTipoRequisicion);

		gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRequisicion.gridy = 0;
		gridBagConstraintsTipoRequisicion.gridx = 0;
		jPanelFK_IdDiaTipoRequisicion.add(jLabelid_diaFK_IdDiaTipoRequisicion, gridBagConstraintsTipoRequisicion);

		gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRequisicion.gridy = 0;
		gridBagConstraintsTipoRequisicion.gridx = 1;
		jPanelFK_IdDiaTipoRequisicion.add(jComboBoxid_diaFK_IdDiaTipoRequisicion, gridBagConstraintsTipoRequisicion);

		gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRequisicion.gridy = 1;
		gridBagConstraintsTipoRequisicion.gridx =1;
		jPanelFK_IdDiaTipoRequisicion.add(jButtonFK_IdDiaTipoRequisicion, gridBagConstraintsTipoRequisicion);

		jTabbedPaneBusquedasTipoRequisicion.addTab("3.-Por Dia ", jPanelFK_IdDiaTipoRequisicion);
		jTabbedPaneBusquedasTipoRequisicion.setMnemonicAt(2, KeyEvent.VK_3);

		GridBagLayout gridaBagLayoutFK_IdTipoPeriodoTipoRequisicion= new GridBagLayout();
		gridaBagLayoutFK_IdTipoPeriodoTipoRequisicion.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoPeriodoTipoRequisicion.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoPeriodoTipoRequisicion.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoPeriodoTipoRequisicion.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoPeriodoTipoRequisicion.setLayout(gridaBagLayoutFK_IdTipoPeriodoTipoRequisicion);

		gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRequisicion.gridy = 0;
		gridBagConstraintsTipoRequisicion.gridx = 0;
		jPanelFK_IdTipoPeriodoTipoRequisicion.add(jLabelid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion, gridBagConstraintsTipoRequisicion);

		gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRequisicion.gridy = 0;
		gridBagConstraintsTipoRequisicion.gridx = 1;
		jPanelFK_IdTipoPeriodoTipoRequisicion.add(jComboBoxid_tipo_periodoFK_IdTipoPeriodoTipoRequisicion, gridBagConstraintsTipoRequisicion);

		gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTipoRequisicion.gridy = 1;
		gridBagConstraintsTipoRequisicion.gridx =1;
		jPanelFK_IdTipoPeriodoTipoRequisicion.add(jButtonFK_IdTipoPeriodoTipoRequisicion, gridBagConstraintsTipoRequisicion);

		jTabbedPaneBusquedasTipoRequisicion.addTab("4.-Por Tipo Periodo ", jPanelFK_IdTipoPeriodoTipoRequisicion);
		jTabbedPaneBusquedasTipoRequisicion.setMnemonicAt(3, KeyEvent.VK_4);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRequisicion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRequisicion);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();						
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRequisicion.gridx = 0;		
			//this.gridBagConstraintsTipoRequisicion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRequisicion.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTipoRequisicion, this.gridBagConstraintsTipoRequisicion);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTipoRequisicion.gridx = 0;		
		//this.gridBagConstraintsTipoRequisicion.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTipoRequisicion.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTipoRequisicion);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTipoRequisicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRequisicion.gridx = 0;		
			this.gridBagConstraintsTipoRequisicion.fill =GridBagConstraints.BOTH;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTipoRequisicion.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTipoRequisicion, this.gridBagConstraintsTipoRequisicion);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRequisicion.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTipoRequisicion, this.gridBagConstraintsTipoRequisicion);								
		
		
		/*
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRequisicion.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		*/		
		
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRequisicion.gridx =0;
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRequisicion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
				
		
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRequisicion.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(TipoRequisicionJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTipoRequisicion= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRequisicion = new GridBagLayout();
			this.jPanelBusquedasParametrosTipoRequisicion.setLayout(gridaBagLayoutBusquedasParametrosTipoRequisicion);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTipoRequisicion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRequisicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRequisicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRequisicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRequisicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
			
			
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRequisicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		
			
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRequisicion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTipoRequisicion;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTipoRequisicion() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTipoRequisicion = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTipoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTipoRequisicion.setName("jPanelReporteDinamicoTipoRequisicion"); 
		
		this.jPanelReporteDinamicoTipoRequisicion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRequisicion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTipoRequisicion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTipoRequisicion.setLayout(gridaBagLayoutReporteDinamicoTipoRequisicion);
		
		
		this.jInternalFrameReporteDinamicoTipoRequisicion= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTipoRequisicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRequisicion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTipoRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTipoRequisicion.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTipoRequisicion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTipoRequisicion.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTipoRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTipoRequisicion.setResizable(true);
	    this.jInternalFrameReporteDinamicoTipoRequisicion.setClosable(true);
	    this.jInternalFrameReporteDinamicoTipoRequisicion.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTipoRequisicion.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRequisicion.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTipoRequisicion.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Requesiciones"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTipoRequisicion = new JLabelMe();

		this.jLabelColumnasSelectReporteTipoRequisicion.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTipoRequisicion.add(this.jLabelColumnasSelectReporteTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTipoRequisicion = new JList<Reporte>();
		this.jListColumnasSelectReporteTipoRequisicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTipoRequisicion.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTipoRequisicion.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRequisicion.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTipoRequisicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTipoRequisicion=new JScrollPane(this.jListColumnasSelectReporteTipoRequisicion);
			
			this.jScrollColumnasSelectReporteTipoRequisicion.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRequisicion.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTipoRequisicion.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTipoRequisicion.add(this.jListColumnasSelectReporteTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		this.jPanelReporteDinamicoTipoRequisicion.add(this.jScrollColumnasSelectReporteTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTipoRequisicion = new JLabelMe();

		this.jLabelRelacionesSelectReporteTipoRequisicion.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTipoRequisicion = new JList<Reporte>();
		this.jListRelacionesSelectReporteTipoRequisicion.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTipoRequisicion.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTipoRequisicion.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRequisicion.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTipoRequisicion.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTipoRequisicion=new JScrollPane(this.jListRelacionesSelectReporteTipoRequisicion);
			
			this.jScrollRelacionesSelectReporteTipoRequisicion.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRequisicion.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTipoRequisicion.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoTipoRequisicion = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTipoRequisicion = new JComboBoxMe();
		this.jListColumnasValoresGraficoTipoRequisicion = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTipoRequisicion = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTipoRequisicion.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTipoRequisicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRequisicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTipoRequisicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTipoRequisicion = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRequisicion.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTipoRequisicion.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRequisicion.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTipoRequisicion.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTipoRequisicion = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTipoRequisicion.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRequisicion.add(this.jLabelGenerarExcelReporteDinamicoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTipoRequisicion = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTipoRequisicion.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTipoRequisicion,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTipoRequisicion.setToolTipText("Generar EXCEL"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTipoRequisicion.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTipoRequisicion.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTipoRequisicion.add(this.jButtonGenerarExcelReporteDinamicoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRequisicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRequisicion.add(this.jComboBoxTiposReportesDinamicoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTipoRequisicion = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTipoRequisicion.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRequisicion.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTipoRequisicion.add(this.jLabelTiposArchivoReporteDinamicoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRequisicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRequisicion.add(this.jComboBoxTiposArchivosReportesDinamicoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTipoRequisicion = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTipoRequisicion.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTipoRequisicion,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTipoRequisicion.setToolTipText("Generar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRequisicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRequisicion.add(this.jButtonGenerarReporteDinamicoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTipoRequisicion = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTipoRequisicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTipoRequisicion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTipoRequisicion.setToolTipText("Cancelar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRequisicion.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTipoRequisicion.add(this.jButtonCerrarReporteDinamicoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTipoRequisicion = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTipoRequisicion= new JScrollPane(jPanelReporteDinamicoTipoRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTipoRequisicion.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRequisicion.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTipoRequisicion.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Requesiciones"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTipoRequisicion.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTipoRequisicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTipoRequisicion.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTipoRequisicion);
		this.jInternalFrameReporteDinamicoTipoRequisicion.getContentPane().add(this.jScrollPanelReporteDinamicoTipoRequisicion, this.gridBagConstraintsTipoRequisicion);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTipoRequisicion() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTipoRequisicion = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTipoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTipoRequisicion.setName("jPanelImportacionTipoRequisicion"); 
		
		this.jPanelImportacionTipoRequisicion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRequisicion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTipoRequisicion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTipoRequisicion.setLayout(gridaBagLayoutImportacionTipoRequisicion);
		
		
		this.jInternalFrameImportacionTipoRequisicion= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTipoRequisicion= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTipoRequisicion = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTipoRequisicion= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTipoRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRequisicion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRequisicion.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTipoRequisicion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRequisicion.setResizable(true);
	    this.jInternalFrameImportacionTipoRequisicion.setClosable(true);
	    this.jInternalFrameImportacionTipoRequisicion.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTipoRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTipoRequisicion.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTipoRequisicion.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTipoRequisicion.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTipoRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTipoRequisicion.setResizable(true);
	    this.jInternalFrameImportacionTipoRequisicion.setClosable(true);
	    this.jInternalFrameImportacionTipoRequisicion.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTipoRequisicion.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRequisicion.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTipoRequisicion.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Requesiciones"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTipoRequisicion = new JLabelMe();

		this.jLabelArchivoImportacionTipoRequisicion.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRequisicion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRequisicion.add(this.jLabelArchivoImportacionTipoRequisicion, this.gridBagConstraintsTipoRequisicion);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTipoRequisicion = new JFileChooser();		
		this.jFileChooserImportacionTipoRequisicion.setToolTipText("ESCOGER ARCHIVO"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTipoRequisicion = new JButtonMe();
		this.jButtonAbrirImportacionTipoRequisicion.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTipoRequisicion,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTipoRequisicion.setToolTipText("Generar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRequisicion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRequisicion.add(this.jButtonAbrirImportacionTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTipoRequisicion = new JLabelMe();

		this.jLabelPathArchivoImportacionTipoRequisicion.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTipoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTipoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRequisicion.gridy = iPosYImportacion;		
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTipoRequisicion.add(this.jLabelPathArchivoImportacionTipoRequisicion, this.gridBagConstraintsTipoRequisicion);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTipoRequisicion=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTipoRequisicion.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRequisicion.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTipoRequisicion.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRequisicion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRequisicion.add(this.jTextFieldPathArchivoImportacionTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTipoRequisicion = new JButtonMe();
		this.jButtonGenerarImportacionTipoRequisicion.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTipoRequisicion,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTipoRequisicion.setToolTipText("Generar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRequisicion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRequisicion.add(this.jButtonGenerarImportacionTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTipoRequisicion = new JButtonMe();
		this.jButtonCerrarImportacionTipoRequisicion.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTipoRequisicion,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTipoRequisicion.setToolTipText("Cancelar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRequisicion.gridy = iPosYImportacion;
		this.gridBagConstraintsTipoRequisicion.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTipoRequisicion.add(this.jButtonCerrarImportacionTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTipoRequisicion = new GridBagLayout();
		
		this.jScrollPanelImportacionTipoRequisicion= new JScrollPane(jPanelImportacionTipoRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
		this.gridBagConstraintsTipoRequisicion.gridy =iPosYImportacion;
		this.gridBagConstraintsTipoRequisicion.gridx =iPosXImportacion;
		this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTipoRequisicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTipoRequisicion.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTipoRequisicion);
		this.jInternalFrameImportacionTipoRequisicion.getContentPane().add(this.jScrollPanelImportacionTipoRequisicion, this.gridBagConstraintsTipoRequisicion);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTipoRequisicion(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTipoRequisicion = new JButtonMe();
			this.jButtonAbrirOrderByTipoRequisicion.setText("Orden");
			this.jButtonAbrirOrderByTipoRequisicion.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTipoRequisicion,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTipoRequisicion";
			inputMap = this.jButtonAbrirOrderByTipoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTipoRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTipoRequisicion"));
		
		
			GridBagLayout gridaBagLayoutOrderByTipoRequisicion = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTipoRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTipoRequisicion.setName("jPanelOrderByTipoRequisicion"); 
			
			this.jPanelOrderByTipoRequisicion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRequisicion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTipoRequisicion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTipoRequisicion.setLayout(gridaBagLayoutOrderByTipoRequisicion);
			
			
			this.jTableDatosTipoRequisicionOrderBy = new JTableMe();        
			this.jTableDatosTipoRequisicionOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTipoRequisicionOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTipoRequisicionOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTipoRequisicionOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTipoRequisicionOrderBy.setViewportView(this.jTableDatosTipoRequisicionOrderBy);
			this.jTableDatosTipoRequisicionOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTipoRequisicionOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTipoRequisicion= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTipoRequisicion= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTipoRequisicion = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTipoRequisicion= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTipoRequisicion.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTipoRequisicion.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTipoRequisicion.setTitle("Orden");
			this.jInternalFrameOrderByTipoRequisicion.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTipoRequisicion.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTipoRequisicion.setResizable(true);
			this.jInternalFrameOrderByTipoRequisicion.setClosable(true);
			this.jInternalFrameOrderByTipoRequisicion.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTipoRequisicion.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRequisicion.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTipoRequisicion.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTipoRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Requesiciones"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTipoRequisicion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTipoRequisicion.ipady =150;
				
			this.jPanelOrderByTipoRequisicion.add(jScrollPanelDatosTipoRequisicionOrderBy, this.gridBagConstraintsTipoRequisicion);//this.jTableDatosTipoRequisicionTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTipoRequisicion = new JButtonMe();
			this.jButtonCerrarOrderByTipoRequisicion.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTipoRequisicion,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTipoRequisicion.setToolTipText("Cancelar"+" "+TipoRequisicionConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTipoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRequisicion.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTipoRequisicion.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTipoRequisicion.add(this.jButtonCerrarOrderByTipoRequisicion, this.gridBagConstraintsTipoRequisicion);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTipoRequisicion = new GridBagLayout();
			
			this.jScrollPanelOrderByTipoRequisicion= new JScrollPane(jPanelOrderByTipoRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTipoRequisicion = new GridBagConstraints();
			this.gridBagConstraintsTipoRequisicion.gridy =iPosYOrderBy;
			this.gridBagConstraintsTipoRequisicion.gridx =iPosXOrderBy;
			this.gridBagConstraintsTipoRequisicion.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTipoRequisicion.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTipoRequisicion.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTipoRequisicion);
			
			this.jInternalFrameOrderByTipoRequisicion.getContentPane().add(this.jScrollPanelOrderByTipoRequisicion, this.gridBagConstraintsTipoRequisicion);			
		
		} else {
			this.jButtonAbrirOrderByTipoRequisicion = new JButtonMe();
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
		int iWidthTableCalculado=0;//1430
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=730;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=700;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.tiporequisicionSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosTipoRequisicion.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTipoRequisicion.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTipoRequisicion.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTipoRequisicion.getRowHeight();//TipoRequisicionConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TipoRequisicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRequisicion.isSelected()) {
					iHeightTable=TipoRequisicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRequisicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRequisicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TipoRequisicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTipoRequisicion.isSelected()) {
					iHeightTable=TipoRequisicionConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TipoRequisicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TipoRequisicionConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTipoRequisicion.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRequisicion.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTipoRequisicion.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTipoRequisicion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRequisicion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTipoRequisicion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTipoRequisicion!=null && this.jInternalFrameOrderByTipoRequisicion.getjTableDatosOrderBy()!=null) {
			//if(!this.tiporequisicionSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTipoRequisicion.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTipoRequisicion.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTipoRequisicion.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTipoRequisicion.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTipoRequisicion.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTipoRequisicion.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTipoRequisicion.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTipoRequisicion.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRequisicion.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTipoRequisicion.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=tiporequisicionLogic.getTipoRequisicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporequisicions.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TipoRequisicion> TraerTipoRequisicionBeans(List<TipoRequisicion> tiporequisicions,ArrayList<Classe> classes)throws Exception {
		try {
			for(TipoRequisicion tiporequisicion:tiporequisicions) {
					
				if(!(TipoRequisicionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TipoRequisicionConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					tiporequisicion.setsDetalleGeneralEntityReporte(TipoRequisicionConstantesFunciones.getTipoRequisicionDescripcion(tiporequisicion));
										
						
					
						
					
				} else  {
							
					//tiporequisicion.setsDetalleGeneralEntityReporte(tiporequisicion.getsDetalleGeneralEntityReporte());
										
				}
				
				//tiporequisicionbeans.add(tiporequisicionbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return tiporequisicions;
    }
	//PARA REPORTES FIN
}
